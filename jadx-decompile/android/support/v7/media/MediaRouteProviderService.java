package android.support.v7.media;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IBinder.DeathRecipient;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.support.v7.media.MediaRouteProvider.Callback;
import android.support.v7.media.MediaRouteProvider.RouteController;
import android.support.v7.media.MediaRouteSelector.Builder;
import android.support.v7.media.MediaRouter.ControlRequestCallback;
import android.util.Log;
import android.util.SparseArray;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

public abstract class MediaRouteProviderService extends Service {
    private static final boolean DEBUG = Log.isLoggable(TAG, 3);
    private static final int PRIVATE_MSG_CLIENT_DIED = 1;
    public static final String SERVICE_INTERFACE = "android.media.MediaRouteProviderService";
    private static final String TAG = "MediaRouteProviderSrv";
    private final ArrayList<ClientRecord> mClients = new ArrayList();
    private MediaRouteDiscoveryRequest mCompositeDiscoveryRequest;
    private final PrivateHandler mPrivateHandler = new PrivateHandler();
    private MediaRouteProvider mProvider;
    private final ProviderCallback mProviderCallback = new ProviderCallback();
    private final ReceiveHandler mReceiveHandler = new ReceiveHandler(this);
    private final Messenger mReceiveMessenger = new Messenger(this.mReceiveHandler);

    private final class ClientRecord implements DeathRecipient {
        private final SparseArray<RouteController> mControllers = new SparseArray();
        public MediaRouteDiscoveryRequest mDiscoveryRequest;
        public final Messenger mMessenger;
        public final int mVersion;

        public ClientRecord(Messenger messenger, int i) {
            this.mMessenger = messenger;
            this.mVersion = i;
        }

        public void binderDied() {
            MediaRouteProviderService.this.mPrivateHandler.obtainMessage(1, this.mMessenger).sendToTarget();
        }

        public boolean createRouteController(String str, int i) {
            if (this.mControllers.indexOfKey(i) < 0) {
                RouteController onCreateRouteController = MediaRouteProviderService.this.mProvider.onCreateRouteController(str);
                if (onCreateRouteController != null) {
                    this.mControllers.put(i, onCreateRouteController);
                    return true;
                }
            }
            return false;
        }

        public void dispose() {
            int size = this.mControllers.size();
            for (int i = 0; i < size; i++) {
                ((RouteController) this.mControllers.valueAt(i)).onRelease();
            }
            this.mControllers.clear();
            this.mMessenger.getBinder().unlinkToDeath(this, 0);
            setDiscoveryRequest(null);
        }

        public RouteController getRouteController(int i) {
            return (RouteController) this.mControllers.get(i);
        }

        public boolean hasMessenger(Messenger messenger) {
            return this.mMessenger.getBinder() == messenger.getBinder();
        }

        public boolean register() {
            try {
                this.mMessenger.getBinder().linkToDeath(this, 0);
                return true;
            } catch (RemoteException e) {
                binderDied();
                return false;
            }
        }

        public boolean releaseRouteController(int i) {
            RouteController routeController = (RouteController) this.mControllers.get(i);
            if (routeController == null) {
                return false;
            }
            this.mControllers.remove(i);
            routeController.onRelease();
            return true;
        }

        public boolean setDiscoveryRequest(MediaRouteDiscoveryRequest mediaRouteDiscoveryRequest) {
            if (this.mDiscoveryRequest == mediaRouteDiscoveryRequest || (this.mDiscoveryRequest != null && this.mDiscoveryRequest.equals(mediaRouteDiscoveryRequest))) {
                return false;
            }
            this.mDiscoveryRequest = mediaRouteDiscoveryRequest;
            return MediaRouteProviderService.this.updateCompositeDiscoveryRequest();
        }

        public String toString() {
            return MediaRouteProviderService.getClientId(this.mMessenger);
        }
    }

    private final class PrivateHandler extends Handler {
        private PrivateHandler() {
        }

        public void handleMessage(Message message) {
            switch (message.what) {
                case 1:
                    MediaRouteProviderService.this.onBinderDied((Messenger) message.obj);
                    return;
                default:
                    return;
            }
        }
    }

    private final class ProviderCallback extends Callback {
        private ProviderCallback() {
        }

        public void onDescriptorChanged(MediaRouteProvider mediaRouteProvider, MediaRouteProviderDescriptor mediaRouteProviderDescriptor) {
            MediaRouteProviderService.this.sendDescriptorChanged(mediaRouteProviderDescriptor);
        }
    }

    private static final class ReceiveHandler extends Handler {
        private final WeakReference<MediaRouteProviderService> mServiceRef;

        public ReceiveHandler(MediaRouteProviderService mediaRouteProviderService) {
            this.mServiceRef = new WeakReference(mediaRouteProviderService);
        }

        private boolean processMessage(int i, Messenger messenger, int i2, int i3, Object obj, Bundle bundle) {
            int i4 = 0;
            MediaRouteProviderService mediaRouteProviderService = (MediaRouteProviderService) this.mServiceRef.get();
            if (mediaRouteProviderService == null) {
                return false;
            }
            int i5;
            switch (i) {
                case 1:
                    return mediaRouteProviderService.onRegisterClient(messenger, i2, i3);
                case 2:
                    return mediaRouteProviderService.onUnregisterClient(messenger, i2);
                case 3:
                    String string = bundle.getString(MediaRouteProviderProtocol.CLIENT_DATA_ROUTE_ID);
                    return string != null ? mediaRouteProviderService.onCreateRouteController(messenger, i2, i3, string) : false;
                case 4:
                    return mediaRouteProviderService.onReleaseRouteController(messenger, i2, i3);
                case 5:
                    return mediaRouteProviderService.onSelectRoute(messenger, i2, i3);
                case 6:
                    if (bundle != null) {
                        i4 = bundle.getInt(MediaRouteProviderProtocol.CLIENT_DATA_UNSELECT_REASON, 0);
                    }
                    return mediaRouteProviderService.onUnselectRoute(messenger, i2, i3, i4);
                case 7:
                    i5 = bundle.getInt(MediaRouteProviderProtocol.CLIENT_DATA_VOLUME, -1);
                    return i5 >= 0 ? mediaRouteProviderService.onSetRouteVolume(messenger, i2, i3, i5) : false;
                case 8:
                    i5 = bundle.getInt(MediaRouteProviderProtocol.CLIENT_DATA_VOLUME, 0);
                    return i5 != 0 ? mediaRouteProviderService.onUpdateRouteVolume(messenger, i2, i3, i5) : false;
                case 9:
                    return obj instanceof Intent ? mediaRouteProviderService.onRouteControlRequest(messenger, i2, i3, (Intent) obj) : false;
                case 10:
                    if (obj != null && !(obj instanceof Bundle)) {
                        return false;
                    }
                    MediaRouteDiscoveryRequest fromBundle = MediaRouteDiscoveryRequest.fromBundle((Bundle) obj);
                    if (fromBundle == null || !fromBundle.isValid()) {
                        fromBundle = null;
                    }
                    return mediaRouteProviderService.onSetDiscoveryRequest(messenger, i2, fromBundle);
                default:
                    return false;
            }
        }

        public void handleMessage(Message message) {
            Messenger messenger = message.replyTo;
            if (MediaRouteProviderProtocol.isValidRemoteMessenger(messenger)) {
                int i = message.what;
                int i2 = message.arg1;
                int i3 = message.arg2;
                Object obj = message.obj;
                Bundle peekData = message.peekData();
                if (!processMessage(i, messenger, i2, i3, obj, peekData)) {
                    if (MediaRouteProviderService.DEBUG) {
                        Log.d(MediaRouteProviderService.TAG, MediaRouteProviderService.getClientId(messenger) + ": Message failed, what=" + i + ", requestId=" + i2 + ", arg=" + i3 + ", obj=" + obj + ", data=" + peekData);
                    }
                    MediaRouteProviderService.sendGenericFailure(messenger, i2);
                }
            } else if (MediaRouteProviderService.DEBUG) {
                Log.d(MediaRouteProviderService.TAG, "Ignoring message without valid reply messenger.");
            }
        }
    }

    private int findClient(Messenger messenger) {
        int size = this.mClients.size();
        for (int i = 0; i < size; i++) {
            if (((ClientRecord) this.mClients.get(i)).hasMessenger(messenger)) {
                return i;
            }
        }
        return -1;
    }

    private ClientRecord getClient(Messenger messenger) {
        int findClient = findClient(messenger);
        return findClient >= 0 ? (ClientRecord) this.mClients.get(findClient) : null;
    }

    private static String getClientId(Messenger messenger) {
        return "Client connection " + messenger.getBinder().toString();
    }

    private void onBinderDied(Messenger messenger) {
        int findClient = findClient(messenger);
        if (findClient >= 0) {
            ClientRecord clientRecord = (ClientRecord) this.mClients.remove(findClient);
            if (DEBUG) {
                Log.d(TAG, clientRecord + ": Binder died");
            }
            clientRecord.dispose();
        }
    }

    private boolean onCreateRouteController(Messenger messenger, int i, int i2, String str) {
        ClientRecord client = getClient(messenger);
        if (client == null || !client.createRouteController(str, i2)) {
            return false;
        }
        if (DEBUG) {
            Log.d(TAG, client + ": Route controller created" + ", controllerId=" + i2 + ", routeId=" + str);
        }
        sendGenericSuccess(messenger, i);
        return true;
    }

    private boolean onRegisterClient(Messenger messenger, int i, int i2) {
        if (i2 >= 1 && findClient(messenger) < 0) {
            ClientRecord clientRecord = new ClientRecord(messenger, i2);
            if (clientRecord.register()) {
                this.mClients.add(clientRecord);
                if (DEBUG) {
                    Log.d(TAG, clientRecord + ": Registered, version=" + i2);
                }
                if (i == 0) {
                    return true;
                }
                MediaRouteProviderDescriptor descriptor = this.mProvider.getDescriptor();
                sendReply(messenger, 2, i, 1, descriptor != null ? descriptor.asBundle() : null, null);
                return true;
            }
        }
        return false;
    }

    private boolean onReleaseRouteController(Messenger messenger, int i, int i2) {
        ClientRecord client = getClient(messenger);
        if (client == null || !client.releaseRouteController(i2)) {
            return false;
        }
        if (DEBUG) {
            Log.d(TAG, client + ": Route controller released" + ", controllerId=" + i2);
        }
        sendGenericSuccess(messenger, i);
        return true;
    }

    private boolean onRouteControlRequest(Messenger messenger, int i, int i2, Intent intent) {
        final ClientRecord client = getClient(messenger);
        if (client != null) {
            RouteController routeController = client.getRouteController(i2);
            if (routeController != null) {
                ControlRequestCallback controlRequestCallback = null;
                if (i != 0) {
                    final int i3 = i2;
                    final Intent intent2 = intent;
                    final Messenger messenger2 = messenger;
                    final int i4 = i;
                    controlRequestCallback = new ControlRequestCallback() {
                        public void onError(String str, Bundle bundle) {
                            if (MediaRouteProviderService.DEBUG) {
                                Log.d(MediaRouteProviderService.TAG, client + ": Route control request failed" + ", controllerId=" + i3 + ", intent=" + intent2 + ", error=" + str + ", data=" + bundle);
                            }
                            if (MediaRouteProviderService.this.findClient(messenger2) < 0) {
                                return;
                            }
                            if (str != null) {
                                Bundle bundle2 = new Bundle();
                                bundle2.putString("error", str);
                                MediaRouteProviderService.sendReply(messenger2, 4, i4, 0, bundle, bundle2);
                                return;
                            }
                            MediaRouteProviderService.sendReply(messenger2, 4, i4, 0, bundle, null);
                        }

                        public void onResult(Bundle bundle) {
                            if (MediaRouteProviderService.DEBUG) {
                                Log.d(MediaRouteProviderService.TAG, client + ": Route control request succeeded" + ", controllerId=" + i3 + ", intent=" + intent2 + ", data=" + bundle);
                            }
                            if (MediaRouteProviderService.this.findClient(messenger2) >= 0) {
                                MediaRouteProviderService.sendReply(messenger2, 3, i4, 0, bundle, null);
                            }
                        }
                    };
                }
                if (routeController.onControlRequest(intent, controlRequestCallback)) {
                    if (DEBUG) {
                        Log.d(TAG, client + ": Route control request delivered" + ", controllerId=" + i2 + ", intent=" + intent);
                    }
                    return true;
                }
            }
        }
        return false;
    }

    private boolean onSelectRoute(Messenger messenger, int i, int i2) {
        ClientRecord client = getClient(messenger);
        if (client != null) {
            RouteController routeController = client.getRouteController(i2);
            if (routeController != null) {
                routeController.onSelect();
                if (DEBUG) {
                    Log.d(TAG, client + ": Route selected" + ", controllerId=" + i2);
                }
                sendGenericSuccess(messenger, i);
                return true;
            }
        }
        return false;
    }

    private boolean onSetDiscoveryRequest(Messenger messenger, int i, MediaRouteDiscoveryRequest mediaRouteDiscoveryRequest) {
        ClientRecord client = getClient(messenger);
        if (client == null) {
            return false;
        }
        boolean discoveryRequest = client.setDiscoveryRequest(mediaRouteDiscoveryRequest);
        if (DEBUG) {
            Log.d(TAG, client + ": Set discovery request, request=" + mediaRouteDiscoveryRequest + ", actuallyChanged=" + discoveryRequest + ", compositeDiscoveryRequest=" + this.mCompositeDiscoveryRequest);
        }
        sendGenericSuccess(messenger, i);
        return true;
    }

    private boolean onSetRouteVolume(Messenger messenger, int i, int i2, int i3) {
        ClientRecord client = getClient(messenger);
        if (client != null) {
            RouteController routeController = client.getRouteController(i2);
            if (routeController != null) {
                routeController.onSetVolume(i3);
                if (DEBUG) {
                    Log.d(TAG, client + ": Route volume changed" + ", controllerId=" + i2 + ", volume=" + i3);
                }
                sendGenericSuccess(messenger, i);
                return true;
            }
        }
        return false;
    }

    private boolean onUnregisterClient(Messenger messenger, int i) {
        int findClient = findClient(messenger);
        if (findClient < 0) {
            return false;
        }
        ClientRecord clientRecord = (ClientRecord) this.mClients.remove(findClient);
        if (DEBUG) {
            Log.d(TAG, clientRecord + ": Unregistered");
        }
        clientRecord.dispose();
        sendGenericSuccess(messenger, i);
        return true;
    }

    private boolean onUnselectRoute(Messenger messenger, int i, int i2, int i3) {
        ClientRecord client = getClient(messenger);
        if (client != null) {
            RouteController routeController = client.getRouteController(i2);
            if (routeController != null) {
                routeController.onUnselect(i3);
                if (DEBUG) {
                    Log.d(TAG, client + ": Route unselected" + ", controllerId=" + i2);
                }
                sendGenericSuccess(messenger, i);
                return true;
            }
        }
        return false;
    }

    private boolean onUpdateRouteVolume(Messenger messenger, int i, int i2, int i3) {
        ClientRecord client = getClient(messenger);
        if (client != null) {
            RouteController routeController = client.getRouteController(i2);
            if (routeController != null) {
                routeController.onUpdateVolume(i3);
                if (DEBUG) {
                    Log.d(TAG, client + ": Route volume updated" + ", controllerId=" + i2 + ", delta=" + i3);
                }
                sendGenericSuccess(messenger, i);
                return true;
            }
        }
        return false;
    }

    private void sendDescriptorChanged(MediaRouteProviderDescriptor mediaRouteProviderDescriptor) {
        Object asBundle = mediaRouteProviderDescriptor != null ? mediaRouteProviderDescriptor.asBundle() : null;
        int size = this.mClients.size();
        for (int i = 0; i < size; i++) {
            ClientRecord clientRecord = (ClientRecord) this.mClients.get(i);
            sendReply(clientRecord.mMessenger, 5, 0, 0, asBundle, null);
            if (DEBUG) {
                Log.d(TAG, clientRecord + ": Sent descriptor change event, descriptor=" + mediaRouteProviderDescriptor);
            }
        }
    }

    private static void sendGenericFailure(Messenger messenger, int i) {
        if (i != 0) {
            sendReply(messenger, 0, i, 0, null, null);
        }
    }

    private static void sendGenericSuccess(Messenger messenger, int i) {
        if (i != 0) {
            sendReply(messenger, 1, i, 0, null, null);
        }
    }

    private static void sendReply(Messenger messenger, int i, int i2, int i3, Object obj, Bundle bundle) {
        Message obtain = Message.obtain();
        obtain.what = i;
        obtain.arg1 = i2;
        obtain.arg2 = i3;
        obtain.obj = obj;
        obtain.setData(bundle);
        try {
            messenger.send(obtain);
        } catch (DeadObjectException e) {
        } catch (Throwable e2) {
            Log.e(TAG, "Could not send message to " + getClientId(messenger), e2);
        }
    }

    private boolean updateCompositeDiscoveryRequest() {
        Builder builder = null;
        int size = this.mClients.size();
        int i = 0;
        boolean z = false;
        MediaRouteDiscoveryRequest mediaRouteDiscoveryRequest = null;
        while (i < size) {
            boolean z2;
            Builder builder2;
            MediaRouteDiscoveryRequest mediaRouteDiscoveryRequest2;
            MediaRouteDiscoveryRequest mediaRouteDiscoveryRequest3 = ((ClientRecord) this.mClients.get(i)).mDiscoveryRequest;
            if (mediaRouteDiscoveryRequest3 == null || (mediaRouteDiscoveryRequest3.getSelector().isEmpty() && !mediaRouteDiscoveryRequest3.isActiveScan())) {
                z2 = z;
                builder2 = builder;
                mediaRouteDiscoveryRequest2 = mediaRouteDiscoveryRequest;
            } else {
                z2 = mediaRouteDiscoveryRequest3.isActiveScan() | z;
                if (mediaRouteDiscoveryRequest == null) {
                    builder2 = builder;
                    mediaRouteDiscoveryRequest2 = mediaRouteDiscoveryRequest3;
                } else {
                    builder2 = builder == null ? new Builder(mediaRouteDiscoveryRequest.getSelector()) : builder;
                    builder2.addSelector(mediaRouteDiscoveryRequest3.getSelector());
                    mediaRouteDiscoveryRequest2 = mediaRouteDiscoveryRequest;
                }
            }
            i++;
            mediaRouteDiscoveryRequest = mediaRouteDiscoveryRequest2;
            builder = builder2;
            z = z2;
        }
        if (builder != null) {
            mediaRouteDiscoveryRequest = new MediaRouteDiscoveryRequest(builder.build(), z);
        }
        if (this.mCompositeDiscoveryRequest == mediaRouteDiscoveryRequest || (this.mCompositeDiscoveryRequest != null && this.mCompositeDiscoveryRequest.equals(mediaRouteDiscoveryRequest))) {
            return false;
        }
        this.mCompositeDiscoveryRequest = mediaRouteDiscoveryRequest;
        this.mProvider.setDiscoveryRequest(mediaRouteDiscoveryRequest);
        return true;
    }

    public MediaRouteProvider getMediaRouteProvider() {
        return this.mProvider;
    }

    public IBinder onBind(Intent intent) {
        if (intent.getAction().equals("android.media.MediaRouteProviderService")) {
            if (this.mProvider == null) {
                MediaRouteProvider onCreateMediaRouteProvider = onCreateMediaRouteProvider();
                if (onCreateMediaRouteProvider != null) {
                    String packageName = onCreateMediaRouteProvider.getMetadata().getPackageName();
                    if (packageName.equals(getPackageName())) {
                        this.mProvider = onCreateMediaRouteProvider;
                        this.mProvider.setCallback(this.mProviderCallback);
                    } else {
                        throw new IllegalStateException("onCreateMediaRouteProvider() returned a provider whose package name does not match the package name of the service.  A media route provider service can only export its own media route providers.  Provider package name: " + packageName + ".  Service package name: " + getPackageName() + ".");
                    }
                }
            }
            if (this.mProvider != null) {
                return this.mReceiveMessenger.getBinder();
            }
        }
        return null;
    }

    public abstract MediaRouteProvider onCreateMediaRouteProvider();

    public boolean onUnbind(Intent intent) {
        if (this.mProvider != null) {
            this.mProvider.setCallback(null);
        }
        return super.onUnbind(intent);
    }
}
