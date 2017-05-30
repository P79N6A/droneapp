package com.google.android.gms.analytics.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.RemoteException;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.stats.b;
import java.util.Collections;

public class y extends t {
    private final a a = new a(this);
    private d b;
    private final aj c;
    private m d;

    protected class a implements ServiceConnection {
        final /* synthetic */ y a;
        private volatile d b;
        private volatile boolean c;

        protected a(y yVar) {
            this.a = yVar;
        }

        public d a() {
            d dVar = null;
            this.a.m();
            Intent intent = new Intent("com.google.android.gms.analytics.service.START");
            intent.setComponent(new ComponentName("com.google.android.gms", "com.google.android.gms.analytics.service.AnalyticsService"));
            Context o = this.a.o();
            intent.putExtra("app_package_name", o.getPackageName());
            b a = b.a();
            synchronized (this) {
                this.b = null;
                this.c = true;
                boolean a2 = a.a(o, intent, this.a.a, 129);
                this.a.a("Bind to service requested", Boolean.valueOf(a2));
                if (a2) {
                    try {
                        wait(this.a.q().w());
                    } catch (InterruptedException e) {
                        this.a.t("Wait for service connect was interrupted");
                    }
                    this.c = false;
                    dVar = this.b;
                    this.b = null;
                    if (dVar == null) {
                        this.a.u("Successfully bound to service but never got onServiceConnected callback");
                    }
                } else {
                    this.c = false;
                }
            }
            return dVar;
        }

        public void onServiceConnected(android.content.ComponentName r5, android.os.IBinder r6) {
            /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: Exception block dominator not found, method:com.google.android.gms.analytics.internal.y.a.onServiceConnected(android.content.ComponentName, android.os.IBinder):void. bs: [B:3:0x0008, B:9:0x0015]
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:86)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
*/
            /*
            r4 = this;
            r0 = "AnalyticsServiceConnection.onServiceConnected";
            com.google.android.gms.common.internal.d.b(r0);
            monitor-enter(r4);
            if (r6 != 0) goto L_0x0014;
        L_0x0008:
            r0 = r4.a;	 Catch:{ all -> 0x005a }
            r1 = "Service connected with null binder";	 Catch:{ all -> 0x005a }
            r0.u(r1);	 Catch:{ all -> 0x005a }
            r4.notifyAll();	 Catch:{ all -> 0x0046 }
            monitor-exit(r4);	 Catch:{ all -> 0x0046 }
        L_0x0013:
            return;
        L_0x0014:
            r0 = 0;
            r1 = r6.getInterfaceDescriptor();	 Catch:{ RemoteException -> 0x0051 }
            r2 = "com.google.android.gms.analytics.internal.IAnalyticsService";	 Catch:{ RemoteException -> 0x0051 }
            r2 = r2.equals(r1);	 Catch:{ RemoteException -> 0x0051 }
            if (r2 == 0) goto L_0x0049;	 Catch:{ RemoteException -> 0x0051 }
        L_0x0021:
            r0 = com.google.android.gms.analytics.internal.d.a.a(r6);	 Catch:{ RemoteException -> 0x0051 }
            r1 = r4.a;	 Catch:{ RemoteException -> 0x0051 }
            r2 = "Bound to IAnalyticsService interface";	 Catch:{ RemoteException -> 0x0051 }
            r1.q(r2);	 Catch:{ RemoteException -> 0x0051 }
        L_0x002c:
            if (r0 != 0) goto L_0x005f;
        L_0x002e:
            r0 = com.google.android.gms.common.stats.b.a();	 Catch:{ IllegalArgumentException -> 0x007c }
            r1 = r4.a;	 Catch:{ IllegalArgumentException -> 0x007c }
            r1 = r1.o();	 Catch:{ IllegalArgumentException -> 0x007c }
            r2 = r4.a;	 Catch:{ IllegalArgumentException -> 0x007c }
            r2 = r2.a;	 Catch:{ IllegalArgumentException -> 0x007c }
            r0.a(r1, r2);	 Catch:{ IllegalArgumentException -> 0x007c }
        L_0x0041:
            r4.notifyAll();	 Catch:{ all -> 0x0046 }
            monitor-exit(r4);	 Catch:{ all -> 0x0046 }
            goto L_0x0013;	 Catch:{ all -> 0x0046 }
        L_0x0046:
            r0 = move-exception;	 Catch:{ all -> 0x0046 }
            monitor-exit(r4);	 Catch:{ all -> 0x0046 }
            throw r0;
        L_0x0049:
            r2 = r4.a;	 Catch:{ RemoteException -> 0x0051 }
            r3 = "Got binder with a wrong descriptor";	 Catch:{ RemoteException -> 0x0051 }
            r2.e(r3, r1);	 Catch:{ RemoteException -> 0x0051 }
            goto L_0x002c;
        L_0x0051:
            r1 = move-exception;
            r1 = r4.a;	 Catch:{ all -> 0x005a }
            r2 = "Service connect failed to get IAnalyticsService";	 Catch:{ all -> 0x005a }
            r1.u(r2);	 Catch:{ all -> 0x005a }
            goto L_0x002c;
        L_0x005a:
            r0 = move-exception;
            r4.notifyAll();	 Catch:{ all -> 0x0046 }
            throw r0;	 Catch:{ all -> 0x0046 }
        L_0x005f:
            r1 = r4.c;	 Catch:{ all -> 0x005a }
            if (r1 != 0) goto L_0x0079;	 Catch:{ all -> 0x005a }
        L_0x0063:
            r1 = r4.a;	 Catch:{ all -> 0x005a }
            r2 = "onServiceConnected received after the timeout limit";	 Catch:{ all -> 0x005a }
            r1.t(r2);	 Catch:{ all -> 0x005a }
            r1 = r4.a;	 Catch:{ all -> 0x005a }
            r1 = r1.r();	 Catch:{ all -> 0x005a }
            r2 = new com.google.android.gms.analytics.internal.y$a$1;	 Catch:{ all -> 0x005a }
            r2.<init>(r4, r0);	 Catch:{ all -> 0x005a }
            r1.a(r2);	 Catch:{ all -> 0x005a }
            goto L_0x0041;	 Catch:{ all -> 0x005a }
        L_0x0079:
            r4.b = r0;	 Catch:{ all -> 0x005a }
            goto L_0x0041;
        L_0x007c:
            r0 = move-exception;
            goto L_0x0041;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.analytics.internal.y.a.onServiceConnected(android.content.ComponentName, android.os.IBinder):void");
        }

        public void onServiceDisconnected(final ComponentName componentName) {
            d.b("AnalyticsServiceConnection.onServiceDisconnected");
            this.a.r().a(new Runnable(this) {
                final /* synthetic */ a b;

                public void run() {
                    this.b.a.a(componentName);
                }
            });
        }
    }

    protected y(v vVar) {
        super(vVar);
        this.d = new m(vVar.d());
        this.c = new aj(this, vVar) {
            final /* synthetic */ y a;

            public void a() {
                this.a.g();
            }
        };
    }

    private void a(ComponentName componentName) {
        m();
        if (this.b != null) {
            this.b = null;
            a("Disconnected from device AnalyticsService", componentName);
            h();
        }
    }

    private void a(d dVar) {
        m();
        this.b = dVar;
        f();
        t().h();
    }

    private void f() {
        this.d.a();
        this.c.a(q().v());
    }

    private void g() {
        m();
        if (b()) {
            q("Inactivity, disconnecting from device AnalyticsService");
            e();
        }
    }

    private void h() {
        t().f();
    }

    protected void a() {
    }

    public boolean a(c cVar) {
        d.a((Object) cVar);
        m();
        D();
        d dVar = this.b;
        if (dVar == null) {
            return false;
        }
        try {
            dVar.a(cVar.b(), cVar.d(), cVar.f() ? q().o() : q().p(), Collections.emptyList());
            f();
            return true;
        } catch (RemoteException e) {
            q("Failed to send hits to AnalyticsService");
            return false;
        }
    }

    public boolean b() {
        m();
        D();
        return this.b != null;
    }

    public boolean c() {
        m();
        D();
        d dVar = this.b;
        if (dVar == null) {
            return false;
        }
        try {
            dVar.a();
            f();
            return true;
        } catch (RemoteException e) {
            q("Failed to clear hits from AnalyticsService");
            return false;
        }
    }

    public boolean d() {
        m();
        D();
        if (this.b != null) {
            return true;
        }
        d a = this.a.a();
        if (a == null) {
            return false;
        }
        this.b = a;
        f();
        return true;
    }

    public void e() {
        m();
        D();
        try {
            b.a().a(o(), this.a);
        } catch (IllegalStateException e) {
        } catch (IllegalArgumentException e2) {
        }
        if (this.b != null) {
            this.b = null;
            h();
        }
    }
}
