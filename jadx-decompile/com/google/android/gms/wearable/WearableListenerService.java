package com.google.android.gms.wearable;

import android.annotation.SuppressLint;
import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Binder;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.e;
import com.google.android.gms.common.m;
import com.google.android.gms.common.util.y;
import com.google.android.gms.wearable.internal.AmsEntityUpdateParcelable;
import com.google.android.gms.wearable.internal.AncsNotificationParcelable;
import com.google.android.gms.wearable.internal.CapabilityInfoParcelable;
import com.google.android.gms.wearable.internal.ChannelEventParcelable;
import com.google.android.gms.wearable.internal.MessageEventParcelable;
import com.google.android.gms.wearable.internal.NodeParcelable;
import java.util.List;

public abstract class WearableListenerService extends Service implements com.google.android.gms.wearable.a.c, com.google.android.gms.wearable.c.a, com.google.android.gms.wearable.e.b, com.google.android.gms.wearable.m.b, com.google.android.gms.wearable.p.c {
    public static final String e = "com.google.android.gms.wearable.BIND_LISTENER";
    private ComponentName f;
    private b g;
    private IBinder h;
    private Intent i;
    private final Object j = new Object();
    private boolean k;

    private class a implements ServiceConnection {
        final /* synthetic */ WearableListenerService a;

        private a(WearableListenerService wearableListenerService) {
            this.a = wearableListenerService;
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        }

        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    private final class b extends Handler {
        final /* synthetic */ WearableListenerService a;
        private boolean b;
        private a c = new a();

        b(WearableListenerService wearableListenerService, Looper looper) {
            this.a = wearableListenerService;
            super(looper);
        }

        @SuppressLint({"UntrackedBindService"})
        public void dispatchMessage(Message message) {
            if (!this.b) {
                String valueOf = String.valueOf(this.a.f);
                Log.v("WearableLS", new StringBuilder(String.valueOf(valueOf).length() + 13).append("bindService: ").append(valueOf).toString());
                this.a.bindService(this.a.i, this.c, 1);
                this.b = true;
            }
            try {
                super.dispatchMessage(message);
                if (!hasMessages(0)) {
                    valueOf = String.valueOf(this.a.f);
                    Log.v("WearableLS", new StringBuilder(String.valueOf(valueOf).length() + 15).append("unbindService: ").append(valueOf).toString());
                    try {
                        this.a.unbindService(this.c);
                    } catch (Throwable e) {
                        Log.e("WearableLS", "Exception when unbinding from local service", e);
                    }
                    this.b = false;
                }
            } catch (Throwable th) {
                if (!hasMessages(0)) {
                    String valueOf2 = String.valueOf(this.a.f);
                    Log.v("WearableLS", new StringBuilder(String.valueOf(valueOf2).length() + 15).append("unbindService: ").append(valueOf2).toString());
                    try {
                        this.a.unbindService(this.c);
                    } catch (Throwable e2) {
                        Log.e("WearableLS", "Exception when unbinding from local service", e2);
                    }
                    this.b = false;
                }
            }
        }
    }

    private final class c extends com.google.android.gms.wearable.internal.x.a {
        final /* synthetic */ WearableListenerService a;
        private volatile int b;

        private c(WearableListenerService wearableListenerService) {
            this.a = wearableListenerService;
            this.b = -1;
        }

        private void a() {
            int callingUid = Binder.getCallingUid();
            if (callingUid != this.b) {
                if (e.a(this.a, callingUid, "com.google.android.wearable.app.cn")) {
                    if (m.a(this.a).a(this.a.getPackageManager(), "com.google.android.wearable.app.cn")) {
                        this.b = callingUid;
                        return;
                    }
                    throw new SecurityException("Caller is not Android Wear.");
                } else if (y.a(this.a, callingUid)) {
                    this.b = callingUid;
                } else {
                    throw new SecurityException("Caller is not GooglePlayServices");
                }
            }
        }

        private boolean a(Runnable runnable, String str, Object obj) {
            if (Log.isLoggable("WearableLS", 3)) {
                Log.d("WearableLS", String.format("%s: %s %s", new Object[]{str, this.a.f.toString(), obj}));
            }
            a();
            synchronized (this.a.j) {
                if (this.a.k) {
                    return false;
                }
                this.a.g.post(runnable);
                return true;
            }
        }

        public void a(final DataHolder dataHolder) {
            Runnable anonymousClass1 = new Runnable(this) {
                final /* synthetic */ c b;

                public void run() {
                    g gVar = new g(dataHolder);
                    try {
                        this.b.a.a(gVar);
                    } finally {
                        gVar.b();
                    }
                }
            };
            try {
                String valueOf = String.valueOf(dataHolder);
                if (!a(anonymousClass1, "onDataItemChanged", new StringBuilder(String.valueOf(valueOf).length() + 18).append(valueOf).append(", rows=").append(dataHolder.g()).toString())) {
                }
            } finally {
                dataHolder.close();
            }
        }

        public void a(final AmsEntityUpdateParcelable amsEntityUpdateParcelable) {
            a(new Runnable(this) {
                final /* synthetic */ c b;

                public void run() {
                    this.b.a.a(amsEntityUpdateParcelable);
                }
            }, "onEntityUpdate", amsEntityUpdateParcelable);
        }

        public void a(final AncsNotificationParcelable ancsNotificationParcelable) {
            a(new Runnable(this) {
                final /* synthetic */ c b;

                public void run() {
                    this.b.a.a(ancsNotificationParcelable);
                }
            }, "onNotificationReceived", ancsNotificationParcelable);
        }

        public void a(final CapabilityInfoParcelable capabilityInfoParcelable) {
            a(new Runnable(this) {
                final /* synthetic */ c b;

                public void run() {
                    this.b.a.a(capabilityInfoParcelable);
                }
            }, "onConnectedCapabilityChanged", capabilityInfoParcelable);
        }

        public void a(final ChannelEventParcelable channelEventParcelable) {
            a(new Runnable(this) {
                final /* synthetic */ c b;

                public void run() {
                    channelEventParcelable.a(this.b.a);
                }
            }, "onChannelEvent", channelEventParcelable);
        }

        public void a(final MessageEventParcelable messageEventParcelable) {
            a(new Runnable(this) {
                final /* synthetic */ c b;

                public void run() {
                    this.b.a.a(messageEventParcelable);
                }
            }, "onMessageReceived", messageEventParcelable);
        }

        public void a(final NodeParcelable nodeParcelable) {
            a(new Runnable(this) {
                final /* synthetic */ c b;

                public void run() {
                    this.b.a.a(nodeParcelable);
                }
            }, "onPeerConnected", nodeParcelable);
        }

        public void a(final List<NodeParcelable> list) {
            a(new Runnable(this) {
                final /* synthetic */ c b;

                public void run() {
                    this.b.a.a(list);
                }
            }, "onConnectedNodes", list);
        }

        public void b(final NodeParcelable nodeParcelable) {
            a(new Runnable(this) {
                final /* synthetic */ c b;

                public void run() {
                    this.b.a.b(nodeParcelable);
                }
            }, "onPeerDisconnected", nodeParcelable);
        }
    }

    public void a(Channel channel) {
    }

    public void a(Channel channel, int i, int i2) {
    }

    public void a(b bVar) {
    }

    public void a(g gVar) {
    }

    public void a(n nVar) {
    }

    public void a(o oVar) {
    }

    public void a(u uVar) {
    }

    public void a(w wVar) {
    }

    public void a(List<o> list) {
    }

    public void b(Channel channel, int i, int i2) {
    }

    public void b(o oVar) {
    }

    public void c(Channel channel, int i, int i2) {
    }

    public final IBinder onBind(Intent intent) {
        return e.equals(intent.getAction()) ? this.h : null;
    }

    public void onCreate() {
        super.onCreate();
        this.f = new ComponentName(this, getClass().getName());
        if (Log.isLoggable("WearableLS", 3)) {
            String valueOf = String.valueOf(this.f);
            Log.d("WearableLS", new StringBuilder(String.valueOf(valueOf).length() + 10).append("onCreate: ").append(valueOf).toString());
        }
        HandlerThread handlerThread = new HandlerThread("WearableListenerService");
        handlerThread.start();
        this.g = new b(this, handlerThread.getLooper());
        this.i = new Intent(e);
        this.i.setComponent(this.f);
        this.h = new c();
    }

    public void onDestroy() {
        if (Log.isLoggable("WearableLS", 3)) {
            String valueOf = String.valueOf(this.f);
            Log.d("WearableLS", new StringBuilder(String.valueOf(valueOf).length() + 11).append("onDestroy: ").append(valueOf).toString());
        }
        synchronized (this.j) {
            this.k = true;
            if (this.g == null) {
                String valueOf2 = String.valueOf(this.f);
                throw new IllegalStateException(new StringBuilder(String.valueOf(valueOf2).length() + 111).append("onDestroy: mServiceHandler not set, did you override onCreate() but forget to call super.onCreate()? component=").append(valueOf2).toString());
            } else {
                this.g.getLooper().quit();
            }
        }
        super.onDestroy();
    }
}
