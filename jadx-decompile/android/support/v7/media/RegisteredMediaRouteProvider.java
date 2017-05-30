package android.support.v7.media;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IBinder.DeathRecipient;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.support.v7.media.MediaRouteProvider.ProviderMetadata;
import android.support.v7.media.MediaRouteProvider.RouteController;
import android.support.v7.media.MediaRouter.ControlRequestCallback;
import android.util.Log;
import android.util.SparseArray;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

final class RegisteredMediaRouteProvider extends MediaRouteProvider implements ServiceConnection {
    private static final boolean DEBUG = Log.isLoggable(TAG, 3);
    private static final String TAG = "MediaRouteProviderProxy";
    private Connection mActiveConnection;
    private boolean mBound;
    private final ComponentName mComponentName;
    private boolean mConnectionReady;
    private final ArrayList<Controller> mControllers = new ArrayList();
    private final PrivateHandler mPrivateHandler;
    private boolean mStarted;

    private final class Connection implements DeathRecipient {
        private int mNextControllerId = 1;
        private int mNextRequestId = 1;
        private final SparseArray<ControlRequestCallback> mPendingCallbacks = new SparseArray();
        private int mPendingRegisterRequestId;
        private final ReceiveHandler mReceiveHandler;
        private final Messenger mReceiveMessenger;
        private final Messenger mServiceMessenger;
        private int mServiceVersion;

        public Connection(Messenger messenger) {
            this.mServiceMessenger = messenger;
            this.mReceiveHandler = new ReceiveHandler(this);
            this.mReceiveMessenger = new Messenger(this.mReceiveHandler);
        }

        private void failPendingCallbacks() {
            for (int i = 0; i < this.mPendingCallbacks.size(); i++) {
                ((ControlRequestCallback) this.mPendingCallbacks.valueAt(i)).onError(null, null);
            }
            this.mPendingCallbacks.clear();
        }

        private boolean sendRequest(int i, int i2, int i3, Object obj, Bundle bundle) {
            Message obtain = Message.obtain();
            obtain.what = i;
            obtain.arg1 = i2;
            obtain.arg2 = i3;
            obtain.obj = obj;
            obtain.setData(bundle);
            obtain.replyTo = this.mReceiveMessenger;
            try {
                this.mServiceMessenger.send(obtain);
                return true;
            } catch (DeadObjectException e) {
                return false;
            } catch (Throwable e2) {
                if (i != 2) {
                    Log.e(RegisteredMediaRouteProvider.TAG, "Could not send message to service.", e2);
                }
                return false;
            }
        }

        public void binderDied() {
            RegisteredMediaRouteProvider.this.mPrivateHandler.post(new Runnable() {
                public void run() {
                    RegisteredMediaRouteProvider.this.onConnectionDied(Connection.this);
                }
            });
        }

        public int createRouteController(String str) {
            int i = this.mNextControllerId;
            this.mNextControllerId = i + 1;
            Bundle bundle = new Bundle();
            bundle.putString(MediaRouteProviderProtocol.CLIENT_DATA_ROUTE_ID, str);
            int i2 = this.mNextRequestId;
            this.mNextRequestId = i2 + 1;
            sendRequest(3, i2, i, null, bundle);
            return i;
        }

        public void dispose() {
            sendRequest(2, 0, 0, null, null);
            this.mReceiveHandler.dispose();
            this.mServiceMessenger.getBinder().unlinkToDeath(this, 0);
            RegisteredMediaRouteProvider.this.mPrivateHandler.post(new Runnable() {
                public void run() {
                    Connection.this.failPendingCallbacks();
                }
            });
        }

        public boolean onControlRequestFailed(int i, String str, Bundle bundle) {
            ControlRequestCallback controlRequestCallback = (ControlRequestCallback) this.mPendingCallbacks.get(i);
            if (controlRequestCallback == null) {
                return false;
            }
            this.mPendingCallbacks.remove(i);
            controlRequestCallback.onError(str, bundle);
            return true;
        }

        public boolean onControlRequestSucceeded(int i, Bundle bundle) {
            ControlRequestCallback controlRequestCallback = (ControlRequestCallback) this.mPendingCallbacks.get(i);
            if (controlRequestCallback == null) {
                return false;
            }
            this.mPendingCallbacks.remove(i);
            controlRequestCallback.onResult(bundle);
            return true;
        }

        public boolean onDescriptorChanged(Bundle bundle) {
            if (this.mServiceVersion == 0) {
                return false;
            }
            RegisteredMediaRouteProvider.this.onConnectionDescriptorChanged(this, MediaRouteProviderDescriptor.fromBundle(bundle));
            return true;
        }

        public boolean onGenericFailure(int i) {
            if (i == this.mPendingRegisterRequestId) {
                this.mPendingRegisterRequestId = 0;
                RegisteredMediaRouteProvider.this.onConnectionError(this, "Registation failed");
            }
            ControlRequestCallback controlRequestCallback = (ControlRequestCallback) this.mPendingCallbacks.get(i);
            if (controlRequestCallback != null) {
                this.mPendingCallbacks.remove(i);
                controlRequestCallback.onError(null, null);
            }
            return true;
        }

        public boolean onGenericSuccess(int i) {
            return true;
        }

        public boolean onRegistered(int i, int i2, Bundle bundle) {
            if (this.mServiceVersion != 0 || i != this.mPendingRegisterRequestId || i2 < 1) {
                return false;
            }
            this.mPendingRegisterRequestId = 0;
            this.mServiceVersion = i2;
            RegisteredMediaRouteProvider.this.onConnectionDescriptorChanged(this, MediaRouteProviderDescriptor.fromBundle(bundle));
            RegisteredMediaRouteProvider.this.onConnectionReady(this);
            return true;
        }

        public boolean register() {
            int i = this.mNextRequestId;
            this.mNextRequestId = i + 1;
            this.mPendingRegisterRequestId = i;
            if (!sendRequest(1, this.mPendingRegisterRequestId, 1, null, null)) {
                return false;
            }
            try {
                this.mServiceMessenger.getBinder().linkToDeath(this, 0);
                return true;
            } catch (RemoteException e) {
                binderDied();
                return false;
            }
        }

        public void releaseRouteController(int i) {
            int i2 = this.mNextRequestId;
            this.mNextRequestId = i2 + 1;
            sendRequest(4, i2, i, null, null);
        }

        public void selectRoute(int i) {
            int i2 = this.mNextRequestId;
            this.mNextRequestId = i2 + 1;
            sendRequest(5, i2, i, null, null);
        }

        public boolean sendControlRequest(int i, Intent intent, ControlRequestCallback controlRequestCallback) {
            int i2 = this.mNextRequestId;
            this.mNextRequestId = i2 + 1;
            if (!sendRequest(9, i2, i, intent, null)) {
                return false;
            }
            if (controlRequestCallback != null) {
                this.mPendingCallbacks.put(i2, controlRequestCallback);
            }
            return true;
        }

        public void setDiscoveryRequest(MediaRouteDiscoveryRequest mediaRouteDiscoveryRequest) {
            int i = this.mNextRequestId;
            this.mNextRequestId = i + 1;
            sendRequest(10, i, 0, mediaRouteDiscoveryRequest != null ? mediaRouteDiscoveryRequest.asBundle() : null, null);
        }

        public void setVolume(int i, int i2) {
            Bundle bundle = new Bundle();
            bundle.putInt(MediaRouteProviderProtocol.CLIENT_DATA_VOLUME, i2);
            int i3 = this.mNextRequestId;
            this.mNextRequestId = i3 + 1;
            sendRequest(7, i3, i, null, bundle);
        }

        public void unselectRoute(int i, int i2) {
            Bundle bundle = new Bundle();
            bundle.putInt(MediaRouteProviderProtocol.CLIENT_DATA_UNSELECT_REASON, i2);
            int i3 = this.mNextRequestId;
            this.mNextRequestId = i3 + 1;
            sendRequest(6, i3, i, null, bundle);
        }

        public void updateVolume(int i, int i2) {
            Bundle bundle = new Bundle();
            bundle.putInt(MediaRouteProviderProtocol.CLIENT_DATA_VOLUME, i2);
            int i3 = this.mNextRequestId;
            this.mNextRequestId = i3 + 1;
            sendRequest(8, i3, i, null, bundle);
        }
    }

    private final class Controller extends RouteController {
        private Connection mConnection;
        private int mControllerId;
        private int mPendingSetVolume = -1;
        private int mPendingUpdateVolumeDelta;
        private final String mRouteId;
        private boolean mSelected;

        public Controller(String str) {
            this.mRouteId = str;
        }

        public void attachConnection(Connection connection) {
            this.mConnection = connection;
            this.mControllerId = connection.createRouteController(this.mRouteId);
            if (this.mSelected) {
                connection.selectRoute(this.mControllerId);
                if (this.mPendingSetVolume >= 0) {
                    connection.setVolume(this.mControllerId, this.mPendingSetVolume);
                    this.mPendingSetVolume = -1;
                }
                if (this.mPendingUpdateVolumeDelta != 0) {
                    connection.updateVolume(this.mControllerId, this.mPendingUpdateVolumeDelta);
                    this.mPendingUpdateVolumeDelta = 0;
                }
            }
        }

        public void detachConnection() {
            if (this.mConnection != null) {
                this.mConnection.releaseRouteController(this.mControllerId);
                this.mConnection = null;
                this.mControllerId = 0;
            }
        }

        public boolean onControlRequest(Intent intent, ControlRequestCallback controlRequestCallback) {
            return this.mConnection != null ? this.mConnection.sendControlRequest(this.mControllerId, intent, controlRequestCallback) : false;
        }

        public void onRelease() {
            RegisteredMediaRouteProvider.this.onControllerReleased(this);
        }

        public void onSelect() {
            this.mSelected = true;
            if (this.mConnection != null) {
                this.mConnection.selectRoute(this.mControllerId);
            }
        }

        public void onSetVolume(int i) {
            if (this.mConnection != null) {
                this.mConnection.setVolume(this.mControllerId, i);
                return;
            }
            this.mPendingSetVolume = i;
            this.mPendingUpdateVolumeDelta = 0;
        }

        public void onUnselect() {
            onUnselect(0);
        }

        public void onUnselect(int i) {
            this.mSelected = false;
            if (this.mConnection != null) {
                this.mConnection.unselectRoute(this.mControllerId, i);
            }
        }

        public void onUpdateVolume(int i) {
            if (this.mConnection != null) {
                this.mConnection.updateVolume(this.mControllerId, i);
            } else {
                this.mPendingUpdateVolumeDelta += i;
            }
        }
    }

    private final class PrivateHandler extends Handler {
        private PrivateHandler() {
        }
    }

    private static final class ReceiveHandler extends Handler {
        private final WeakReference<Connection> mConnectionRef;

        public ReceiveHandler(Connection connection) {
            this.mConnectionRef = new WeakReference(connection);
        }

        private boolean processMessage(Connection connection, int i, int i2, int i3, Object obj, Bundle bundle) {
            switch (i) {
                case 0:
                    connection.onGenericFailure(i2);
                    return true;
                case 1:
                    connection.onGenericSuccess(i2);
                    return true;
                case 2:
                    if (obj == null || (obj instanceof Bundle)) {
                        return connection.onRegistered(i2, i3, (Bundle) obj);
                    }
                case 3:
                    if (obj == null || (obj instanceof Bundle)) {
                        return connection.onControlRequestSucceeded(i2, (Bundle) obj);
                    }
                case 4:
                    if (obj == null || (obj instanceof Bundle)) {
                        return connection.onControlRequestFailed(i2, bundle == null ? null : bundle.getString("error"), (Bundle) obj);
                    }
                case 5:
                    if (obj == null || (obj instanceof Bundle)) {
                        return connection.onDescriptorChanged((Bundle) obj);
                    }
            }
            return false;
        }

        public void dispose() {
            this.mConnectionRef.clear();
        }

        public void handleMessage(Message message) {
            Connection connection = (Connection) this.mConnectionRef.get();
            if (connection != null && !processMessage(connection, message.what, message.arg1, message.arg2, message.obj, message.peekData()) && RegisteredMediaRouteProvider.DEBUG) {
                Log.d(RegisteredMediaRouteProvider.TAG, "Unhandled message from server: " + message);
            }
        }
    }

    public RegisteredMediaRouteProvider(Context context, ComponentName componentName) {
        super(context, new ProviderMetadata(componentName));
        this.mComponentName = componentName;
        this.mPrivateHandler = new PrivateHandler();
    }

    private void attachControllersToConnection() {
        int size = this.mControllers.size();
        for (int i = 0; i < size; i++) {
            ((Controller) this.mControllers.get(i)).attachConnection(this.mActiveConnection);
        }
    }

    private void bind() {
        if (!this.mBound) {
            if (DEBUG) {
                Log.d(TAG, this + ": Binding");
            }
            Intent intent = new Intent("android.media.MediaRouteProviderService");
            intent.setComponent(this.mComponentName);
            try {
                this.mBound = getContext().bindService(intent, this, 1);
                if (!this.mBound && DEBUG) {
                    Log.d(TAG, this + ": Bind failed");
                }
            } catch (Throwable e) {
                if (DEBUG) {
                    Log.d(TAG, this + ": Bind failed", e);
                }
            }
        }
    }

    private void detachControllersFromConnection() {
        int size = this.mControllers.size();
        for (int i = 0; i < size; i++) {
            ((Controller) this.mControllers.get(i)).detachConnection();
        }
    }

    private void disconnect() {
        if (this.mActiveConnection != null) {
            setDescriptor(null);
            this.mConnectionReady = false;
            detachControllersFromConnection();
            this.mActiveConnection.dispose();
            this.mActiveConnection = null;
        }
    }

    private void onConnectionDescriptorChanged(Connection connection, MediaRouteProviderDescriptor mediaRouteProviderDescriptor) {
        if (this.mActiveConnection == connection) {
            if (DEBUG) {
                Log.d(TAG, this + ": Descriptor changed, descriptor=" + mediaRouteProviderDescriptor);
            }
            setDescriptor(mediaRouteProviderDescriptor);
        }
    }

    private void onConnectionDied(Connection connection) {
        if (this.mActiveConnection == connection) {
            if (DEBUG) {
                Log.d(TAG, this + ": Service connection died");
            }
            disconnect();
        }
    }

    private void onConnectionError(Connection connection, String str) {
        if (this.mActiveConnection == connection) {
            if (DEBUG) {
                Log.d(TAG, this + ": Service connection error - " + str);
            }
            unbind();
        }
    }

    private void onConnectionReady(Connection connection) {
        if (this.mActiveConnection == connection) {
            this.mConnectionReady = true;
            attachControllersToConnection();
            MediaRouteDiscoveryRequest discoveryRequest = getDiscoveryRequest();
            if (discoveryRequest != null) {
                this.mActiveConnection.setDiscoveryRequest(discoveryRequest);
            }
        }
    }

    private void onControllerReleased(Controller controller) {
        this.mControllers.remove(controller);
        controller.detachConnection();
        updateBinding();
    }

    private boolean shouldBind() {
        return this.mStarted && !(getDiscoveryRequest() == null && this.mControllers.isEmpty());
    }

    private void unbind() {
        if (this.mBound) {
            if (DEBUG) {
                Log.d(TAG, this + ": Unbinding");
            }
            this.mBound = false;
            disconnect();
            getContext().unbindService(this);
        }
    }

    private void updateBinding() {
        if (shouldBind()) {
            bind();
        } else {
            unbind();
        }
    }

    public boolean hasComponentName(String str, String str2) {
        return this.mComponentName.getPackageName().equals(str) && this.mComponentName.getClassName().equals(str2);
    }

    public RouteController onCreateRouteController(String str) {
        MediaRouteProviderDescriptor descriptor = getDescriptor();
        if (descriptor != null) {
            List routes = descriptor.getRoutes();
            int size = routes.size();
            for (int i = 0; i < size; i++) {
                if (((MediaRouteDescriptor) routes.get(i)).getId().equals(str)) {
                    RouteController controller = new Controller(str);
                    this.mControllers.add(controller);
                    if (this.mConnectionReady) {
                        controller.attachConnection(this.mActiveConnection);
                    }
                    updateBinding();
                    return controller;
                }
            }
        }
        return null;
    }

    public void onDiscoveryRequestChanged(MediaRouteDiscoveryRequest mediaRouteDiscoveryRequest) {
        if (this.mConnectionReady) {
            this.mActiveConnection.setDiscoveryRequest(mediaRouteDiscoveryRequest);
        }
        updateBinding();
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (DEBUG) {
            Log.d(TAG, this + ": Connected");
        }
        if (this.mBound) {
            disconnect();
            Messenger messenger = iBinder != null ? new Messenger(iBinder) : null;
            if (MediaRouteProviderProtocol.isValidRemoteMessenger(messenger)) {
                Connection connection = new Connection(messenger);
                if (connection.register()) {
                    this.mActiveConnection = connection;
                    return;
                } else if (DEBUG) {
                    Log.d(TAG, this + ": Registration failed");
                    return;
                } else {
                    return;
                }
            }
            Log.e(TAG, this + ": Service returned invalid messenger binder");
        }
    }

    public void onServiceDisconnected(ComponentName componentName) {
        if (DEBUG) {
            Log.d(TAG, this + ": Service disconnected");
        }
        disconnect();
    }

    public void rebindIfDisconnected() {
        if (this.mActiveConnection == null && shouldBind()) {
            unbind();
            bind();
        }
    }

    public void start() {
        if (!this.mStarted) {
            if (DEBUG) {
                Log.d(TAG, this + ": Starting");
            }
            this.mStarted = true;
            updateBinding();
        }
    }

    public void stop() {
        if (this.mStarted) {
            if (DEBUG) {
                Log.d(TAG, this + ": Stopping");
            }
            this.mStarted = false;
            updateBinding();
        }
    }

    public String toString() {
        return "Service connection " + this.mComponentName.flattenToShortString();
    }
}
