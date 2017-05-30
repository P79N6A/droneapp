package com.google.android.gms.cast;

import android.annotation.TargetApi;
import android.app.Notification;
import android.app.PendingIntent;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ServiceInfo;
import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.support.annotation.NonNull;
import android.support.v4.app.NotificationCompat.Builder;
import android.support.v7.media.MediaRouter;
import android.support.v7.media.MediaRouter.Callback;
import android.support.v7.media.MediaRouter.RouteInfo;
import android.text.TextUtils;
import android.view.Display;
import com.google.android.gms.R;
import com.google.android.gms.cast.internal.m;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.n;
import java.util.concurrent.atomic.AtomicBoolean;

@TargetApi(19)
public abstract class CastRemoteDisplayLocalService extends Service {
    private static final m a = new m("CastRemoteDisplayLocalService");
    private static final int b = j();
    private static final Object c = new Object();
    private static AtomicBoolean d = new AtomicBoolean(false);
    private static CastRemoteDisplayLocalService v;
    private g e;
    private com.google.android.gms.cast.d.b f;
    private String g;
    private a h;
    private e i;
    private b j;
    private Notification k;
    private boolean l;
    private PendingIntent m;
    private CastDevice n;
    private Display o;
    private Context p;
    private ServiceConnection q;
    private Handler r;
    private MediaRouter s;
    private boolean t = false;
    private final Callback u = new Callback(this) {
        final /* synthetic */ CastRemoteDisplayLocalService a;

        {
            this.a = r1;
        }

        public void onRouteUnselected(MediaRouter mediaRouter, RouteInfo routeInfo) {
            this.a.a("onRouteUnselected");
            if (this.a.n == null) {
                this.a.a("onRouteUnselected, no device was selected");
            } else if (CastDevice.b(routeInfo.getExtras()).b().equals(this.a.n.b())) {
                CastRemoteDisplayLocalService.e();
            } else {
                this.a.a("onRouteUnselected, device does not match");
            }
        }
    };
    private final IBinder w = new d();

    class AnonymousClass5 implements ServiceConnection {
        final /* synthetic */ String a;
        final /* synthetic */ CastDevice b;
        final /* synthetic */ c c;
        final /* synthetic */ b d;
        final /* synthetic */ Context e;
        final /* synthetic */ a f;

        AnonymousClass5(String str, CastDevice castDevice, c cVar, b bVar, Context context, a aVar) {
            this.a = str;
            this.b = castDevice;
            this.c = cVar;
            this.d = bVar;
            this.e = context;
            this.f = aVar;
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            CastRemoteDisplayLocalService a = ((d) iBinder).a();
            if (a == null || !a.a(this.a, this.b, this.c, this.d, this.e, (ServiceConnection) this, this.f)) {
                CastRemoteDisplayLocalService.a.e("Connected but unable to get the service instance", new Object[0]);
                this.f.a(new Status(f.q));
                CastRemoteDisplayLocalService.d.set(false);
                try {
                    this.e.unbindService(this);
                } catch (IllegalArgumentException e) {
                    CastRemoteDisplayLocalService.a.b("No need to unbind service, already unbound", new Object[0]);
                }
            }
        }

        public void onServiceDisconnected(ComponentName componentName) {
            CastRemoteDisplayLocalService.a.b("onServiceDisconnected", new Object[0]);
            this.f.a(new Status(f.r, "Service Disconnected"));
            CastRemoteDisplayLocalService.d.set(false);
            try {
                this.e.unbindService(this);
            } catch (IllegalArgumentException e) {
                CastRemoteDisplayLocalService.a.b("No need to unbind service, already unbound", new Object[0]);
            }
        }
    }

    public interface a {
        void a(CastRemoteDisplayLocalService castRemoteDisplayLocalService);

        void a(Status status);

        void b(CastRemoteDisplayLocalService castRemoteDisplayLocalService);
    }

    public static final class b {
        private Notification a;
        private PendingIntent b;
        private String c;
        private String d;

        public static final class a {
            private b a = new b();

            public a a(Notification notification) {
                this.a.a = notification;
                return this;
            }

            public a a(PendingIntent pendingIntent) {
                this.a.b = pendingIntent;
                return this;
            }

            public a a(String str) {
                this.a.c = str;
                return this;
            }

            public b a() {
                if (this.a.a != null) {
                    if (!TextUtils.isEmpty(this.a.c)) {
                        throw new IllegalArgumentException("notificationTitle requires using the default notification");
                    } else if (!TextUtils.isEmpty(this.a.d)) {
                        throw new IllegalArgumentException("notificationText requires using the default notification");
                    } else if (this.a.b != null) {
                        throw new IllegalArgumentException("notificationPendingIntent requires using the default notification");
                    }
                } else if (TextUtils.isEmpty(this.a.c) && TextUtils.isEmpty(this.a.d) && this.a.b == null) {
                    throw new IllegalArgumentException("At least an argument must be provided");
                }
                return this.a;
            }

            public a b(String str) {
                this.a.d = str;
                return this;
            }
        }

        private b() {
        }

        private b(b bVar) {
            this.a = bVar.a;
            this.b = bVar.b;
            this.c = bVar.c;
            this.d = bVar.d;
        }
    }

    public static class c {
        @com.google.android.gms.cast.d.d
        int a = 2;

        public int a() {
            return this.a;
        }

        public void a(@com.google.android.gms.cast.d.d int i) {
            this.a = i;
        }
    }

    private class d extends Binder {
        final /* synthetic */ CastRemoteDisplayLocalService a;

        private d(CastRemoteDisplayLocalService castRemoteDisplayLocalService) {
            this.a = castRemoteDisplayLocalService;
        }

        CastRemoteDisplayLocalService a() {
            return this.a;
        }
    }

    private static final class e extends BroadcastReceiver {
        private e() {
        }

        public void onReceive(Context context, Intent intent) {
            if (intent.getAction().equals("com.google.android.gms.cast.remote_display.ACTION_NOTIFICATION_DISCONNECT")) {
                CastRemoteDisplayLocalService.a.b("disconnecting", new Object[0]);
                CastRemoteDisplayLocalService.e();
            }
        }
    }

    private g a(CastDevice castDevice, c cVar) {
        com.google.android.gms.cast.d.a.a aVar = new com.google.android.gms.cast.d.a.a(castDevice, this.f);
        if (cVar != null) {
            aVar.a(cVar.a);
        }
        return new com.google.android.gms.common.api.g.a(this, new com.google.android.gms.common.api.g.b(this) {
            final /* synthetic */ CastRemoteDisplayLocalService a;

            {
                this.a = r1;
            }

            public void a(int i) {
                CastRemoteDisplayLocalService.a.d(String.format("[Instance: %s] ConnectionSuspended %d", new Object[]{this, Integer.valueOf(i)}), new Object[0]);
            }

            public void a(Bundle bundle) {
                this.a.a("onConnected");
                this.a.l();
            }
        }, new com.google.android.gms.common.api.g.c(this) {
            final /* synthetic */ CastRemoteDisplayLocalService a;

            {
                this.a = r1;
            }

            public void a(ConnectionResult connectionResult) {
                CastRemoteDisplayLocalService castRemoteDisplayLocalService = this.a;
                String valueOf = String.valueOf(connectionResult);
                castRemoteDisplayLocalService.b(new StringBuilder(String.valueOf(valueOf).length() + 19).append("Connection failed: ").append(valueOf).toString());
                this.a.n();
            }
        }).a(d.d, aVar.a()).c();
    }

    protected static void a() {
        a.a(true);
    }

    private static void a(Context context, Class<? extends CastRemoteDisplayLocalService> cls) {
        try {
            ServiceInfo serviceInfo = context.getPackageManager().getServiceInfo(new ComponentName(context, cls), 128);
            if (serviceInfo != null && serviceInfo.exported) {
                throw new IllegalStateException("The service must not be exported, verify the manifest configuration");
            }
        } catch (NameNotFoundException e) {
            throw new IllegalStateException("Service not found, did you forget to configure it in the manifest?");
        }
    }

    public static void a(Context context, Class<? extends CastRemoteDisplayLocalService> cls, String str, CastDevice castDevice, b bVar, a aVar) {
        a(context, (Class) cls, str, castDevice, new c(), bVar, aVar);
    }

    public static void a(@NonNull Context context, @NonNull Class<? extends CastRemoteDisplayLocalService> cls, @NonNull String str, @NonNull CastDevice castDevice, @NonNull c cVar, @NonNull b bVar, @NonNull a aVar) {
        a.b("Starting Service", new Object[0]);
        synchronized (c) {
            if (v != null) {
                a.d("An existing service had not been stopped before starting one", new Object[0]);
                d(true);
            }
        }
        a(context, (Class) cls);
        com.google.android.gms.common.internal.d.a((Object) context, (Object) "activityContext is required.");
        com.google.android.gms.common.internal.d.a((Object) cls, (Object) "serviceClass is required.");
        com.google.android.gms.common.internal.d.a((Object) str, (Object) "applicationId is required.");
        com.google.android.gms.common.internal.d.a((Object) castDevice, (Object) "device is required.");
        com.google.android.gms.common.internal.d.a((Object) cVar, (Object) "options is required.");
        com.google.android.gms.common.internal.d.a((Object) bVar, (Object) "notificationSettings is required.");
        com.google.android.gms.common.internal.d.a((Object) aVar, (Object) "callbacks is required.");
        if (bVar.a == null && bVar.b == null) {
            throw new IllegalArgumentException("notificationSettings: Either the notification or the notificationPendingIntent must be provided");
        } else if (d.getAndSet(true)) {
            a.e("Service is already being started, startService has been called twice", new Object[0]);
        } else {
            Intent intent = new Intent(context, cls);
            context.startService(intent);
            context.bindService(intent, new AnonymousClass5(str, castDevice, cVar, bVar, context, aVar), 64);
        }
    }

    private void a(String str) {
        a.b("[Instance: %s] %s", this, str);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean a(java.lang.String r8, com.google.android.gms.cast.CastDevice r9, com.google.android.gms.cast.CastRemoteDisplayLocalService.c r10, com.google.android.gms.cast.CastRemoteDisplayLocalService.b r11, android.content.Context r12, android.content.ServiceConnection r13, com.google.android.gms.cast.CastRemoteDisplayLocalService.a r14) {
        /*
        r7 = this;
        r6 = 0;
        r1 = 1;
        r0 = 0;
        r2 = "startRemoteDisplaySession";
        r7.a(r2);
        r2 = "Starting the Cast Remote Display must be done on the main thread";
        com.google.android.gms.common.internal.d.b(r2);
        r2 = c;
        monitor-enter(r2);
        r3 = v;	 Catch:{ all -> 0x00ac }
        if (r3 == 0) goto L_0x0020;
    L_0x0014:
        r1 = a;	 Catch:{ all -> 0x00ac }
        r3 = "An existing service had not been stopped before starting one";
        r4 = 0;
        r4 = new java.lang.Object[r4];	 Catch:{ all -> 0x00ac }
        r1.d(r3, r4);	 Catch:{ all -> 0x00ac }
        monitor-exit(r2);	 Catch:{ all -> 0x00ac }
    L_0x001f:
        return r0;
    L_0x0020:
        v = r7;	 Catch:{ all -> 0x00ac }
        monitor-exit(r2);	 Catch:{ all -> 0x00ac }
        r7.h = r14;
        r7.g = r8;
        r7.n = r9;
        r7.p = r12;
        r7.q = r13;
        r2 = r7.getApplicationContext();
        r2 = android.support.v7.media.MediaRouter.getInstance(r2);
        r7.s = r2;
        r2 = new android.support.v7.media.MediaRouteSelector$Builder;
        r2.<init>();
        r3 = r7.g;
        r3 = com.google.android.gms.cast.b.b(r3);
        r2 = r2.addControlCategory(r3);
        r2 = r2.build();
        r3 = "addMediaRouterCallback";
        r7.a(r3);
        r3 = r7.s;
        r4 = r7.u;
        r5 = 4;
        r3.addCallback(r2, r4, r5);
        r2 = new com.google.android.gms.cast.CastRemoteDisplayLocalService$8;
        r2.<init>(r7);
        r7.f = r2;
        r2 = r11.a;
        r7.k = r2;
        r2 = new com.google.android.gms.cast.CastRemoteDisplayLocalService$e;
        r2.<init>();
        r7.i = r2;
        r2 = r7.i;
        r3 = new android.content.IntentFilter;
        r4 = "com.google.android.gms.cast.remote_display.ACTION_NOTIFICATION_DISCONNECT";
        r3.<init>(r4);
        r7.registerReceiver(r2, r3);
        r2 = new com.google.android.gms.cast.CastRemoteDisplayLocalService$b;
        r2.<init>(r11);
        r7.j = r2;
        r2 = r7.j;
        r2 = r2.a;
        if (r2 != 0) goto L_0x00af;
    L_0x0086:
        r7.l = r1;
        r0 = r7.e(r0);
        r7.k = r0;
    L_0x008e:
        r0 = b;
        r2 = r7.k;
        r7.startForeground(r0, r2);
        r0 = r7.a(r9, r10);
        r7.e = r0;
        r0 = r7.e;
        r0.e();
        r0 = r7.h;
        if (r0 == 0) goto L_0x00a9;
    L_0x00a4:
        r0 = r7.h;
        r0.a(r7);
    L_0x00a9:
        r0 = r1;
        goto L_0x001f;
    L_0x00ac:
        r0 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x00ac }
        throw r0;
    L_0x00af:
        r7.l = r0;
        r0 = r7.j;
        r0 = r0.a;
        r7.k = r0;
        goto L_0x008e;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.cast.CastRemoteDisplayLocalService.a(java.lang.String, com.google.android.gms.cast.CastDevice, com.google.android.gms.cast.CastRemoteDisplayLocalService$c, com.google.android.gms.cast.CastRemoteDisplayLocalService$b, android.content.Context, android.content.ServiceConnection, com.google.android.gms.cast.CastRemoteDisplayLocalService$a):boolean");
    }

    private void b(Display display) {
        this.o = display;
        if (this.l) {
            this.k = e(true);
            startForeground(b, this.k);
        }
        if (this.h != null) {
            this.h.b(this);
            this.h = null;
        }
        a(this.o);
    }

    private void b(b bVar) {
        com.google.android.gms.common.internal.d.b("updateNotificationSettingsInternal must be called on the main thread");
        if (this.j == null) {
            throw new IllegalStateException("No current notification settings to update");
        }
        if (!this.l) {
            com.google.android.gms.common.internal.d.a(bVar.a, (Object) "notification is required.");
            this.k = bVar.a;
            this.j.a = this.k;
        } else if (bVar.a != null) {
            throw new IllegalStateException("Current mode is default notification, notification attribute must not be provided");
        } else {
            if (bVar.b != null) {
                this.j.b = bVar.b;
            }
            if (!TextUtils.isEmpty(bVar.c)) {
                this.j.c = bVar.c;
            }
            if (!TextUtils.isEmpty(bVar.d)) {
                this.j.d = bVar.d;
            }
            this.k = e(true);
        }
        startForeground(b, this.k);
    }

    private void b(String str) {
        a.e("[Instance: %s] %s", this, str);
    }

    private void b(final boolean z) {
        if (this.r == null) {
            return;
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            this.r.post(new Runnable(this) {
                final /* synthetic */ CastRemoteDisplayLocalService b;

                public void run() {
                    this.b.c(z);
                }
            });
        } else {
            c(z);
        }
    }

    private void c(boolean z) {
        a("Stopping Service");
        com.google.android.gms.common.internal.d.b("stopServiceInstanceInternal must be called on the main thread");
        if (!(z || this.s == null)) {
            a("Setting default route");
            this.s.selectRoute(this.s.getDefaultRoute());
        }
        if (this.i != null) {
            a("Unregistering notification receiver");
            unregisterReceiver(this.i);
        }
        o();
        p();
        k();
        if (this.e != null) {
            this.e.g();
            this.e = null;
        }
        if (!(this.p == null || this.q == null)) {
            try {
                this.p.unbindService(this.q);
            } catch (IllegalArgumentException e) {
                a("No need to unbind service, already unbound");
            }
            this.q = null;
            this.p = null;
        }
        this.g = null;
        this.e = null;
        this.k = null;
        this.o = null;
    }

    public static CastRemoteDisplayLocalService d() {
        CastRemoteDisplayLocalService castRemoteDisplayLocalService;
        synchronized (c) {
            castRemoteDisplayLocalService = v;
        }
        return castRemoteDisplayLocalService;
    }

    private static void d(boolean z) {
        a.b("Stopping Service", new Object[0]);
        d.set(false);
        synchronized (c) {
            if (v == null) {
                a.e("Service is already being stopped", new Object[0]);
                return;
            }
            CastRemoteDisplayLocalService castRemoteDisplayLocalService = v;
            v = null;
            castRemoteDisplayLocalService.b(z);
        }
    }

    private Notification e(boolean z) {
        int i;
        int i2;
        CharSequence string;
        a("createDefaultNotification");
        int i3 = getApplicationInfo().labelRes;
        CharSequence b = this.j.c;
        CharSequence c = this.j.d;
        if (z) {
            i = R.string.cast_notification_connected_message;
            i2 = R.drawable.cast_ic_notification_on;
        } else {
            i = R.string.cast_notification_connecting_message;
            i2 = R.drawable.cast_ic_notification_connecting;
        }
        if (TextUtils.isEmpty(b)) {
            b = getString(i3);
        }
        if (TextUtils.isEmpty(c)) {
            string = getString(i, new Object[]{this.n.e()});
        } else {
            string = c;
        }
        return new Builder(this).setContentTitle(b).setContentText(string).setContentIntent(this.j.b).setSmallIcon(i2).setOngoing(true).addAction(17301560, getString(R.string.cast_notification_disconnect), q()).build();
    }

    public static void e() {
        d(false);
    }

    private static int j() {
        return R.id.cast_notification_id;
    }

    private void k() {
        if (this.s != null) {
            com.google.android.gms.common.internal.d.b("CastRemoteDisplayLocalService calls must be done on the main thread");
            a("removeMediaRouterCallback");
            this.s.removeCallback(this.u);
        }
    }

    private void l() {
        a("startRemoteDisplay");
        if (this.e == null || !this.e.j()) {
            a.e("Unable to start the remote display as the API client is not ready", new Object[0]);
        } else {
            d.e.a(this.e, this.g).a(new n<com.google.android.gms.cast.d.c>(this) {
                final /* synthetic */ CastRemoteDisplayLocalService a;

                {
                    this.a = r1;
                }

                /* JADX WARNING: inconsistent code. */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public void a(com.google.android.gms.cast.d.c r6) {
                    /*
                    r5 = this;
                    r4 = 0;
                    r3 = 0;
                    r0 = r6.a();
                    r0 = r0.f();
                    if (r0 != 0) goto L_0x001d;
                L_0x000c:
                    r0 = com.google.android.gms.cast.CastRemoteDisplayLocalService.a;
                    r1 = "Connection was not successful";
                    r2 = new java.lang.Object[r3];
                    r0.e(r1, r2);
                    r0 = r5.a;
                    r0.n();
                L_0x001c:
                    return;
                L_0x001d:
                    r0 = com.google.android.gms.cast.CastRemoteDisplayLocalService.a;
                    r1 = "startRemoteDisplay successful";
                    r2 = new java.lang.Object[r3];
                    r0.b(r1, r2);
                    r1 = com.google.android.gms.cast.CastRemoteDisplayLocalService.c;
                    monitor-enter(r1);
                    r0 = com.google.android.gms.cast.CastRemoteDisplayLocalService.v;	 Catch:{ all -> 0x0046 }
                    if (r0 != 0) goto L_0x0049;
                L_0x0033:
                    r0 = com.google.android.gms.cast.CastRemoteDisplayLocalService.a;	 Catch:{ all -> 0x0046 }
                    r2 = "Remote Display started but session already cancelled";
                    r3 = 0;
                    r3 = new java.lang.Object[r3];	 Catch:{ all -> 0x0046 }
                    r0.b(r2, r3);	 Catch:{ all -> 0x0046 }
                    r0 = r5.a;	 Catch:{ all -> 0x0046 }
                    r0.n();	 Catch:{ all -> 0x0046 }
                    monitor-exit(r1);	 Catch:{ all -> 0x0046 }
                    goto L_0x001c;
                L_0x0046:
                    r0 = move-exception;
                    monitor-exit(r1);	 Catch:{ all -> 0x0046 }
                    throw r0;
                L_0x0049:
                    monitor-exit(r1);	 Catch:{ all -> 0x0046 }
                    r0 = r6.b();
                    if (r0 == 0) goto L_0x0086;
                L_0x0050:
                    r1 = r5.a;
                    r1.b(r0);
                L_0x0055:
                    r0 = com.google.android.gms.cast.CastRemoteDisplayLocalService.d;
                    r0.set(r3);
                    r0 = r5.a;
                    r0 = r0.p;
                    if (r0 == 0) goto L_0x001c;
                L_0x0064:
                    r0 = r5.a;
                    r0 = r0.q;
                    if (r0 == 0) goto L_0x001c;
                L_0x006c:
                    r0 = r5.a;	 Catch:{ IllegalArgumentException -> 0x0092 }
                    r0 = r0.p;	 Catch:{ IllegalArgumentException -> 0x0092 }
                    r1 = r5.a;	 Catch:{ IllegalArgumentException -> 0x0092 }
                    r1 = r1.q;	 Catch:{ IllegalArgumentException -> 0x0092 }
                    r0.unbindService(r1);	 Catch:{ IllegalArgumentException -> 0x0092 }
                L_0x007b:
                    r0 = r5.a;
                    r0.q = r4;
                    r0 = r5.a;
                    r0.p = r4;
                    goto L_0x001c;
                L_0x0086:
                    r0 = com.google.android.gms.cast.CastRemoteDisplayLocalService.a;
                    r1 = "Cast Remote Display session created without display";
                    r2 = new java.lang.Object[r3];
                    r0.e(r1, r2);
                    goto L_0x0055;
                L_0x0092:
                    r0 = move-exception;
                    r0 = com.google.android.gms.cast.CastRemoteDisplayLocalService.a;
                    r1 = "No need to unbind service, already unbound";
                    r2 = new java.lang.Object[r3];
                    r0.b(r1, r2);
                    goto L_0x007b;
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.cast.CastRemoteDisplayLocalService.9.a(com.google.android.gms.cast.d$c):void");
                }

                public /* synthetic */ void a(com.google.android.gms.common.api.m mVar) {
                    a((com.google.android.gms.cast.d.c) mVar);
                }
            });
        }
    }

    private void m() {
        a("stopRemoteDisplay");
        if (this.e == null || !this.e.j()) {
            a.e("Unable to stop the remote display as the API client is not ready", new Object[0]);
        } else {
            d.e.a(this.e).a(new n<com.google.android.gms.cast.d.c>(this) {
                final /* synthetic */ CastRemoteDisplayLocalService a;

                {
                    this.a = r1;
                }

                public void a(com.google.android.gms.cast.d.c cVar) {
                    if (cVar.a().f()) {
                        this.a.a("remote display stopped");
                    } else {
                        this.a.a("Unable to stop the remote display, result unsuccessful");
                    }
                    this.a.o = null;
                }

                public /* synthetic */ void a(com.google.android.gms.common.api.m mVar) {
                    a((com.google.android.gms.cast.d.c) mVar);
                }
            });
        }
    }

    private void n() {
        if (this.h != null) {
            this.h.a(new Status(f.q));
            this.h = null;
        }
        e();
    }

    private void o() {
        a("stopRemoteDisplaySession");
        m();
        c();
    }

    private void p() {
        a("Stopping the remote display Service");
        stopForeground(true);
        stopSelf();
    }

    private PendingIntent q() {
        if (this.m == null) {
            Intent intent = new Intent("com.google.android.gms.cast.remote_display.ACTION_NOTIFICATION_DISCONNECT");
            intent.setPackage(this.p.getPackageName());
            this.m = PendingIntent.getBroadcast(this, 0, intent, com.google.android.gms.drive.e.a_);
        }
        return this.m;
    }

    public abstract void a(Display display);

    public void a(final b bVar) {
        com.google.android.gms.common.internal.d.a((Object) bVar, (Object) "notificationSettings is required.");
        com.google.android.gms.common.internal.d.a(this.r, (Object) "Service is not ready yet.");
        this.r.post(new Runnable(this) {
            final /* synthetic */ CastRemoteDisplayLocalService b;

            public void run() {
                this.b.b(bVar);
            }
        });
    }

    protected Display b() {
        return this.o;
    }

    public abstract void c();

    public IBinder onBind(Intent intent) {
        a("onBind");
        return this.w;
    }

    public void onCreate() {
        a("onCreate");
        super.onCreate();
        this.r = new Handler(getMainLooper());
        this.r.postDelayed(new Runnable(this) {
            final /* synthetic */ CastRemoteDisplayLocalService a;

            {
                this.a = r1;
            }

            public void run() {
                this.a.a("onCreate after delay. The local service been started: " + this.a.t);
                if (!this.a.t) {
                    this.a.b("The local service has not been been started, stopping it");
                    this.a.stopSelf();
                }
            }
        }, 100);
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        a("onStartCommand");
        this.t = true;
        return 2;
    }
}
