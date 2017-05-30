package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import android.support.annotation.MainThread;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.WorkerThread;
import android.text.TextUtils;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.p.b;
import com.google.android.gms.common.internal.p.c;
import com.google.android.gms.common.j;
import com.tencent.mm.sdk.platformtools.Util;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public class e extends b {
    private final a a;
    private y b;
    private Boolean c;
    private final r d;
    private final i e;
    private final List<Runnable> f = new ArrayList();
    private final r g;

    protected class a implements ServiceConnection, b, c {
        final /* synthetic */ e a;
        private volatile boolean b;
        private volatile aa c;

        protected a(e eVar) {
            this.a = eVar;
        }

        @WorkerThread
        public void a() {
            this.a.j();
            Context q = this.a.q();
            synchronized (this) {
                if (this.b) {
                    this.a.w().E().a("Connection attempt already in progress");
                } else if (this.c != null) {
                    this.a.w().E().a("Already awaiting connection attempt");
                } else {
                    this.c = new aa(q, Looper.getMainLooper(), this, this);
                    this.a.w().E().a("Connecting to remote service");
                    this.b = true;
                    this.c.A();
                }
            }
        }

        @MainThread
        public void a(int i) {
            d.b("MeasurementServiceConnection.onConnectionSuspended");
            this.a.w().D().a("Service connection suspended");
            this.a.v().a(new Runnable(this) {
                final /* synthetic */ a a;

                {
                    this.a = r1;
                }

                public void run() {
                    e eVar = this.a.a;
                    Context q = this.a.a.q();
                    String str = (!this.a.a.y().N() || this.a.a.n.D()) ? "com.google.android.gms.measurement.AppMeasurementService" : "com.google.android.gms.measurement.PackageMeasurementService";
                    eVar.a(new ComponentName(q, str));
                }
            });
        }

        @WorkerThread
        public void a(Intent intent) {
            this.a.j();
            Context q = this.a.q();
            com.google.android.gms.common.stats.b a = com.google.android.gms.common.stats.b.a();
            synchronized (this) {
                if (this.b) {
                    this.a.w().E().a("Connection attempt already in progress");
                    return;
                }
                this.b = true;
                a.a(q, intent, this.a.a, 129);
            }
        }

        @MainThread
        public void a(@Nullable Bundle bundle) {
            d.b("MeasurementServiceConnection.onConnected");
            synchronized (this) {
                try {
                    final y yVar = (y) this.c.G();
                    this.c = null;
                    this.a.v().a(new Runnable(this) {
                        final /* synthetic */ a b;

                        public void run() {
                            synchronized (this.b) {
                                this.b.b = false;
                                if (!this.b.a.f()) {
                                    this.b.a.w().D().a("Connected to remote service");
                                    this.b.a.a(yVar);
                                }
                            }
                        }
                    });
                } catch (DeadObjectException e) {
                    this.c = null;
                    this.b = false;
                } catch (IllegalStateException e2) {
                    this.c = null;
                    this.b = false;
                }
            }
        }

        @MainThread
        public void a(@NonNull ConnectionResult connectionResult) {
            d.b("MeasurementServiceConnection.onConnectionFailed");
            ab g = this.a.n.g();
            if (g != null) {
                g.z().a("Service connection failed", connectionResult);
            }
            synchronized (this) {
                this.b = false;
                this.c = null;
            }
        }

        @MainThread
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            d.b("MeasurementServiceConnection.onServiceConnected");
            synchronized (this) {
                if (iBinder == null) {
                    this.b = false;
                    this.a.w().f().a("Service connected with null binder");
                    return;
                }
                y yVar = null;
                try {
                    String interfaceDescriptor = iBinder.getInterfaceDescriptor();
                    if ("com.google.android.gms.measurement.internal.IMeasurementService".equals(interfaceDescriptor)) {
                        yVar = com.google.android.gms.measurement.internal.y.a.a(iBinder);
                        this.a.w().E().a("Bound to IMeasurementService interface");
                    } else {
                        this.a.w().f().a("Got binder with a wrong descriptor", interfaceDescriptor);
                    }
                } catch (RemoteException e) {
                    this.a.w().f().a("Service connect failed to get IMeasurementService");
                }
                if (yVar == null) {
                    this.b = false;
                    try {
                        com.google.android.gms.common.stats.b.a().a(this.a.q(), this.a.a);
                    } catch (IllegalArgumentException e2) {
                    }
                } else {
                    this.a.v().a(new Runnable(this) {
                        final /* synthetic */ a b;

                        public void run() {
                            synchronized (this.b) {
                                this.b.b = false;
                                if (!this.b.a.f()) {
                                    this.b.a.w().E().a("Connected to service");
                                    this.b.a.a(yVar);
                                }
                            }
                        }
                    });
                }
            }
        }

        @MainThread
        public void onServiceDisconnected(final ComponentName componentName) {
            d.b("MeasurementServiceConnection.onServiceDisconnected");
            this.a.w().D().a("Service disconnected");
            this.a.v().a(new Runnable(this) {
                final /* synthetic */ a b;

                public void run() {
                    this.b.a.a(componentName);
                }
            });
        }
    }

    protected e(aj ajVar) {
        super(ajVar);
        this.e = new i(ajVar.s());
        this.a = new a(this);
        this.d = new r(this, ajVar) {
            final /* synthetic */ e a;

            public void a() {
                this.a.F();
            }
        };
        this.g = new r(this, ajVar) {
            final /* synthetic */ e a;

            public void a() {
                this.a.w().z().a("Tasks have been queued for a long time");
            }
        };
    }

    @WorkerThread
    private void D() {
        j();
        this.e.a();
        if (!this.n.D()) {
            this.d.a(y().J());
        }
    }

    private boolean E() {
        if (y().N()) {
            return false;
        }
        List queryIntentServices = q().getPackageManager().queryIntentServices(new Intent().setClassName(q(), "com.google.android.gms.measurement.AppMeasurementService"), 65536);
        return queryIntentServices != null && queryIntentServices.size() > 0;
    }

    @WorkerThread
    private void F() {
        j();
        if (f()) {
            w().E().a("Inactivity, disconnecting from the service");
            C();
        }
    }

    @WorkerThread
    private void G() {
        j();
        A();
    }

    @WorkerThread
    private void H() {
        j();
        w().E().a("Processing queued up service tasks", Integer.valueOf(this.f.size()));
        for (Runnable a : this.f) {
            v().a(a);
        }
        this.f.clear();
        this.g.c();
    }

    @WorkerThread
    private void a(ComponentName componentName) {
        j();
        if (this.b != null) {
            this.b = null;
            w().E().a("Disconnected from device MeasurementService", componentName);
            G();
        }
    }

    @WorkerThread
    private void a(y yVar) {
        j();
        d.a(yVar);
        this.b = yVar;
        D();
        H();
    }

    @WorkerThread
    private void a(Runnable runnable) {
        j();
        if (f()) {
            runnable.run();
        } else if (((long) this.f.size()) >= y().U()) {
            w().f().a("Discarding data. Max runnable queue size reached");
        } else {
            this.f.add(runnable);
            if (!this.n.D()) {
                this.g.a((long) Util.MILLSECONDS_OF_MINUTE);
            }
            A();
        }
    }

    @WorkerThread
    void A() {
        j();
        c();
        if (!f()) {
            if (this.c == null) {
                this.c = x().B();
                if (this.c == null) {
                    w().E().a("State of service unknown");
                    this.c = Boolean.valueOf(B());
                    x().a(this.c.booleanValue());
                }
            }
            if (this.c.booleanValue()) {
                w().E().a("Using measurement service");
                this.a.a();
            } else if (this.n.D() || !E()) {
                w().f().a("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
            } else {
                w().E().a("Using local app measurement service");
                Intent intent = new Intent("com.google.android.gms.measurement.START");
                intent.setComponent(new ComponentName(q(), y().N() ? "com.google.android.gms.measurement.PackageMeasurementService" : "com.google.android.gms.measurement.AppMeasurementService"));
                this.a.a(intent);
            }
        }
    }

    @WorkerThread
    protected boolean B() {
        j();
        c();
        if (y().N()) {
            return true;
        }
        w().E().a("Checking service availability");
        switch (j.b().a(q())) {
            case 0:
                w().E().a("Service available");
                return true;
            case 1:
                w().E().a("Service missing");
                return false;
            case 2:
                w().D().a("Service container out of date");
                return true;
            case 3:
                w().z().a("Service disabled");
                return false;
            case 9:
                w().z().a("Service invalid");
                return false;
            case 18:
                w().z().a("Service updating");
                return true;
            default:
                return false;
        }
    }

    @WorkerThread
    public void C() {
        j();
        c();
        try {
            com.google.android.gms.common.stats.b.a().a(q(), this.a);
        } catch (IllegalStateException e) {
        } catch (IllegalArgumentException e2) {
        }
        this.b = null;
    }

    @WorkerThread
    protected void a(final EventParcel eventParcel, final String str) {
        d.a(eventParcel);
        j();
        c();
        a(new Runnable(this) {
            final /* synthetic */ e c;

            public void run() {
                y c = this.c.b;
                if (c == null) {
                    this.c.w().f().a("Discarding data. Failed to send event to service");
                    return;
                }
                try {
                    if (TextUtils.isEmpty(str)) {
                        c.a(eventParcel, this.c.m().a(this.c.w().F()));
                    } else {
                        c.a(eventParcel, str, this.c.w().F());
                    }
                    this.c.D();
                } catch (RemoteException e) {
                    this.c.w().f().a("Failed to send event to the service", e);
                }
            }
        });
    }

    @WorkerThread
    protected void a(final UserAttributeParcel userAttributeParcel) {
        j();
        c();
        a(new Runnable(this) {
            final /* synthetic */ e b;

            public void run() {
                y c = this.b.b;
                if (c == null) {
                    this.b.w().f().a("Discarding data. Failed to set user attribute");
                    return;
                }
                try {
                    c.a(userAttributeParcel, this.b.m().a(this.b.w().F()));
                    this.b.D();
                } catch (RemoteException e) {
                    this.b.w().f().a("Failed to send attribute to the service", e);
                }
            }
        });
    }

    @WorkerThread
    protected void a(final AtomicReference<List<UserAttributeParcel>> atomicReference, final boolean z) {
        j();
        c();
        a(new Runnable(this) {
            final /* synthetic */ e c;

            /* JADX WARNING: inconsistent code. */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void run() {
                /*
                r5 = this;
                r1 = r2;
                monitor-enter(r1);
                r0 = r5.c;	 Catch:{ RemoteException -> 0x0046 }
                r0 = r0.b;	 Catch:{ RemoteException -> 0x0046 }
                if (r0 != 0) goto L_0x0021;
            L_0x000b:
                r0 = r5.c;	 Catch:{ RemoteException -> 0x0046 }
                r0 = r0.w();	 Catch:{ RemoteException -> 0x0046 }
                r0 = r0.f();	 Catch:{ RemoteException -> 0x0046 }
                r2 = "Failed to get user properties";
                r0.a(r2);	 Catch:{ RemoteException -> 0x0046 }
                r0 = r2;	 Catch:{ all -> 0x0043 }
                r0.notify();	 Catch:{ all -> 0x0043 }
                monitor-exit(r1);	 Catch:{ all -> 0x0043 }
            L_0x0020:
                return;
            L_0x0021:
                r2 = r2;	 Catch:{ RemoteException -> 0x0046 }
                r3 = r5.c;	 Catch:{ RemoteException -> 0x0046 }
                r3 = r3.m();	 Catch:{ RemoteException -> 0x0046 }
                r4 = 0;
                r3 = r3.a(r4);	 Catch:{ RemoteException -> 0x0046 }
                r4 = r3;	 Catch:{ RemoteException -> 0x0046 }
                r0 = r0.a(r3, r4);	 Catch:{ RemoteException -> 0x0046 }
                r2.set(r0);	 Catch:{ RemoteException -> 0x0046 }
                r0 = r5.c;	 Catch:{ RemoteException -> 0x0046 }
                r0.D();	 Catch:{ RemoteException -> 0x0046 }
                r0 = r2;	 Catch:{ all -> 0x0043 }
                r0.notify();	 Catch:{ all -> 0x0043 }
            L_0x0041:
                monitor-exit(r1);	 Catch:{ all -> 0x0043 }
                goto L_0x0020;
            L_0x0043:
                r0 = move-exception;
                monitor-exit(r1);	 Catch:{ all -> 0x0043 }
                throw r0;
            L_0x0046:
                r0 = move-exception;
                r2 = r5.c;	 Catch:{ all -> 0x005c }
                r2 = r2.w();	 Catch:{ all -> 0x005c }
                r2 = r2.f();	 Catch:{ all -> 0x005c }
                r3 = "Failed to get user properties";
                r2.a(r3, r0);	 Catch:{ all -> 0x005c }
                r0 = r2;	 Catch:{ all -> 0x0043 }
                r0.notify();	 Catch:{ all -> 0x0043 }
                goto L_0x0041;
            L_0x005c:
                r0 = move-exception;
                r2 = r2;	 Catch:{ all -> 0x0043 }
                r2.notify();	 Catch:{ all -> 0x0043 }
                throw r0;	 Catch:{ all -> 0x0043 }
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.e.6.run():void");
            }
        });
    }

    protected void e() {
    }

    @WorkerThread
    public boolean f() {
        j();
        c();
        return this.b != null;
    }

    @WorkerThread
    protected void g() {
        j();
        c();
        a(new Runnable(this) {
            final /* synthetic */ e a;

            {
                this.a = r1;
            }

            public void run() {
                y c = this.a.b;
                if (c == null) {
                    this.a.w().f().a("Failed to send measurementEnabled to service");
                    return;
                }
                try {
                    c.b(this.a.m().a(this.a.w().F()));
                    this.a.D();
                } catch (RemoteException e) {
                    this.a.w().f().a("Failed to send measurementEnabled to the service", e);
                }
            }
        });
    }

    public /* bridge */ /* synthetic */ void h() {
        super.h();
    }

    public /* bridge */ /* synthetic */ void i() {
        super.i();
    }

    public /* bridge */ /* synthetic */ void j() {
        super.j();
    }

    public /* bridge */ /* synthetic */ o k() {
        return super.k();
    }

    public /* bridge */ /* synthetic */ d l() {
        return super.l();
    }

    public /* bridge */ /* synthetic */ z m() {
        return super.m();
    }

    public /* bridge */ /* synthetic */ s n() {
        return super.n();
    }

    public /* bridge */ /* synthetic */ e o() {
        return super.o();
    }

    public /* bridge */ /* synthetic */ com.google.android.gms.common.util.e p() {
        return super.p();
    }

    public /* bridge */ /* synthetic */ Context q() {
        return super.q();
    }

    public /* bridge */ /* synthetic */ q r() {
        return super.r();
    }

    public /* bridge */ /* synthetic */ m s() {
        return super.s();
    }

    public /* bridge */ /* synthetic */ ah t() {
        return super.t();
    }

    public /* bridge */ /* synthetic */ g u() {
        return super.u();
    }

    public /* bridge */ /* synthetic */ ai v() {
        return super.v();
    }

    public /* bridge */ /* synthetic */ ab w() {
        return super.w();
    }

    public /* bridge */ /* synthetic */ af x() {
        return super.x();
    }

    public /* bridge */ /* synthetic */ p y() {
        return super.y();
    }

    @WorkerThread
    protected void z() {
        j();
        c();
        a(new Runnable(this) {
            final /* synthetic */ e a;

            {
                this.a = r1;
            }

            public void run() {
                y c = this.a.b;
                if (c == null) {
                    this.a.w().f().a("Discarding data. Failed to send app launch");
                    return;
                }
                try {
                    c.a(this.a.m().a(this.a.w().F()));
                    this.a.D();
                } catch (RemoteException e) {
                    this.a.w().f().a("Failed to send app launch to the service", e);
                }
            }
        });
    }
}
