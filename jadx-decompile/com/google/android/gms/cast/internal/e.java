package com.google.android.gms.cast.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.JoinOptions;
import com.google.android.gms.cast.LaunchOptions;
import com.google.android.gms.cast.a.d;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.g.c;
import com.google.android.gms.common.internal.BinderWrapper;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.common.internal.w;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

public class e extends w<j> {
    private static final Object A = new Object();
    private static final Object B = new Object();
    private static final m a = new m("CastClientImpl");
    private ApplicationMetadata e;
    private final CastDevice f;
    private final d g;
    private final Map<String, com.google.android.gms.cast.a.e> h = new HashMap();
    private final long i;
    private b j;
    private String k;
    private boolean l;
    private boolean m;
    private boolean n;
    private boolean o;
    private double p;
    private int q;
    private int r;
    private final AtomicLong s = new AtomicLong(0);
    private String t;
    private String u;
    private Bundle v;
    private final Map<Long, com.google.android.gms.internal.ahl.b<Status>> w = new HashMap();
    private j x;
    private com.google.android.gms.internal.ahl.b<com.google.android.gms.cast.a.a> y;
    private com.google.android.gms.internal.ahl.b<Status> z;

    static final class a implements com.google.android.gms.cast.a.a {
        private final Status a;
        private final ApplicationMetadata b;
        private final String c;
        private final String d;
        private final boolean e;

        public a(Status status) {
            this(status, null, null, null, false);
        }

        public a(Status status, ApplicationMetadata applicationMetadata, String str, String str2, boolean z) {
            this.a = status;
            this.b = applicationMetadata;
            this.c = str;
            this.d = str2;
            this.e = z;
        }

        public Status a() {
            return this.a;
        }

        public ApplicationMetadata b() {
            return this.b;
        }

        public String c() {
            return this.c;
        }

        public String d() {
            return this.d;
        }

        public boolean e() {
            return this.e;
        }
    }

    static class b extends com.google.android.gms.cast.internal.k.a {
        private final AtomicReference<e> a;
        private final Handler b;

        public b(e eVar) {
            this.a = new AtomicReference(eVar);
            this.b = new Handler(eVar.C());
        }

        private void a(e eVar, long j, int i) {
            synchronized (eVar.w) {
                com.google.android.gms.internal.ahl.b bVar = (com.google.android.gms.internal.ahl.b) eVar.w.remove(Long.valueOf(j));
            }
            if (bVar != null) {
                bVar.a(new Status(i));
            }
        }

        private boolean a(e eVar, int i) {
            synchronized (e.B) {
                if (eVar.z != null) {
                    eVar.z.a(new Status(i));
                    eVar.z = null;
                    return true;
                }
                return false;
            }
        }

        public e a() {
            e eVar = (e) this.a.getAndSet(null);
            if (eVar == null) {
                return null;
            }
            eVar.K();
            return eVar;
        }

        public void a(int i) {
            e a = a();
            if (a != null) {
                e.a.b("ICastDeviceControllerListener.onDisconnected: %d", Integer.valueOf(i));
                if (i != 0) {
                    a.b(2);
                }
            }
        }

        public void a(ApplicationMetadata applicationMetadata, String str, String str2, boolean z) {
            e eVar = (e) this.a.get();
            if (eVar != null) {
                eVar.e = applicationMetadata;
                eVar.t = applicationMetadata.b();
                eVar.u = str2;
                eVar.k = str;
                synchronized (e.A) {
                    if (eVar.y != null) {
                        eVar.y.a(new a(new Status(0), applicationMetadata, str, str2, z));
                        eVar.y = null;
                    }
                }
            }
        }

        public void a(final ApplicationStatus applicationStatus) {
            final e eVar = (e) this.a.get();
            if (eVar != null) {
                e.a.b("onApplicationStatusChanged", new Object[0]);
                this.b.post(new Runnable(this) {
                    final /* synthetic */ b c;

                    public void run() {
                        eVar.a(applicationStatus);
                    }
                });
            }
        }

        public void a(final DeviceStatus deviceStatus) {
            final e eVar = (e) this.a.get();
            if (eVar != null) {
                e.a.b("onDeviceStatusChanged", new Object[0]);
                this.b.post(new Runnable(this) {
                    final /* synthetic */ b c;

                    public void run() {
                        eVar.a(deviceStatus);
                    }
                });
            }
        }

        public void a(String str, double d, boolean z) {
            e.a.b("Deprecated callback: \"onStatusreceived\"", new Object[0]);
        }

        public void a(String str, long j) {
            e eVar = (e) this.a.get();
            if (eVar != null) {
                a(eVar, j, 0);
            }
        }

        public void a(String str, long j, int i) {
            e eVar = (e) this.a.get();
            if (eVar != null) {
                a(eVar, j, i);
            }
        }

        public void a(final String str, final String str2) {
            final e eVar = (e) this.a.get();
            if (eVar != null) {
                e.a.b("Receive (type=text, ns=%s) %s", str, str2);
                this.b.post(new Runnable(this) {
                    final /* synthetic */ b d;

                    public void run() {
                        synchronized (eVar.h) {
                            com.google.android.gms.cast.a.e eVar = (com.google.android.gms.cast.a.e) eVar.h.get(str);
                        }
                        if (eVar != null) {
                            eVar.a(eVar.f, str, str2);
                            return;
                        }
                        e.a.b("Discarded message for unknown namespace '%s'", str);
                    }
                });
            }
        }

        public void a(String str, byte[] bArr) {
            if (((e) this.a.get()) != null) {
                e.a.b("IGNORING: Receive (type=binary, ns=%s) <%d bytes>", str, Integer.valueOf(bArr.length));
            }
        }

        public void b(int i) {
            e eVar = (e) this.a.get();
            if (eVar != null) {
                synchronized (e.A) {
                    if (eVar.y != null) {
                        eVar.y.a(new a(new Status(i)));
                        eVar.y = null;
                    }
                }
            }
        }

        public boolean b() {
            return this.a.get() == null;
        }

        public void c(int i) {
            e eVar = (e) this.a.get();
            if (eVar != null) {
                a(eVar, i);
            }
        }

        public void d(int i) {
            e eVar = (e) this.a.get();
            if (eVar != null) {
                a(eVar, i);
            }
        }

        public void e(final int i) {
            final e eVar = (e) this.a.get();
            if (eVar != null) {
                eVar.t = null;
                eVar.u = null;
                a(eVar, i);
                if (eVar.g != null) {
                    this.b.post(new Runnable(this) {
                        final /* synthetic */ b c;

                        public void run() {
                            eVar.g.a(i);
                        }
                    });
                }
            }
        }
    }

    public e(Context context, Looper looper, s sVar, CastDevice castDevice, long j, d dVar, com.google.android.gms.common.api.g.b bVar, c cVar) {
        super(context, looper, 10, sVar, bVar, cVar);
        this.f = castDevice;
        this.g = dVar;
        this.i = j;
        K();
    }

    private void K() {
        this.o = false;
        this.q = -1;
        this.r = -1;
        this.e = null;
        this.k = null;
        this.p = 0.0d;
        this.l = false;
    }

    private void L() {
        a.b("removing all MessageReceivedCallbacks", new Object[0]);
        synchronized (this.h) {
            this.h.clear();
        }
    }

    private void a(ApplicationStatus applicationStatus) {
        boolean z;
        String b = applicationStatus.b();
        if (f.a(b, this.k)) {
            z = false;
        } else {
            this.k = b;
            z = true;
        }
        a.b("hasChanged=%b, mFirstApplicationStatusUpdate=%b", Boolean.valueOf(z), Boolean.valueOf(this.m));
        if (this.g != null && (z || this.m)) {
            this.g.a();
        }
        this.m = false;
    }

    private void a(DeviceStatus deviceStatus) {
        boolean z;
        ApplicationMetadata f = deviceStatus.f();
        if (!f.a(f, this.e)) {
            this.e = f;
            this.g.a(this.e);
        }
        double b = deviceStatus.b();
        if (Double.isNaN(b) || Math.abs(b - this.p) <= 1.0E-7d) {
            z = false;
        } else {
            this.p = b;
            z = true;
        }
        boolean c = deviceStatus.c();
        if (c != this.l) {
            this.l = c;
            z = true;
        }
        a.b("hasVolumeChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z), Boolean.valueOf(this.n));
        if (this.g != null && (z || this.n)) {
            this.g.b();
        }
        int d = deviceStatus.d();
        if (d != this.q) {
            this.q = d;
            z = true;
        } else {
            z = false;
        }
        a.b("hasActiveInputChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z), Boolean.valueOf(this.n));
        if (this.g != null && (z || this.n)) {
            this.g.b(this.q);
        }
        d = deviceStatus.e();
        if (d != this.r) {
            this.r = d;
            z = true;
        } else {
            z = false;
        }
        a.b("hasStandbyStateChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z), Boolean.valueOf(this.n));
        if (this.g != null && (z || this.n)) {
            this.g.c(this.r);
        }
        this.n = false;
    }

    private void b(com.google.android.gms.internal.ahl.b<com.google.android.gms.cast.a.a> bVar) {
        synchronized (A) {
            if (this.y != null) {
                this.y.a(new a(new Status(2002)));
            }
            this.y = bVar;
        }
    }

    private void c(com.google.android.gms.internal.ahl.b<Status> bVar) {
        synchronized (B) {
            if (this.z != null) {
                bVar.a(new Status(2001));
                return;
            }
            this.z = bVar;
        }
    }

    protected j a(IBinder iBinder) {
        return com.google.android.gms.cast.internal.j.a.a(iBinder);
    }

    @NonNull
    protected String a() {
        return "com.google.android.gms.cast.service.BIND_CAST_DEVICE_CONTROLLER_SERVICE";
    }

    public void a(double d) {
        if (Double.isInfinite(d) || Double.isNaN(d)) {
            throw new IllegalArgumentException("Volume cannot be " + d);
        }
        h().a(d, this.p, this.l);
    }

    protected void a(int i, IBinder iBinder, Bundle bundle, int i2) {
        a.b("in onPostInitHandler; statusCode=%d", Integer.valueOf(i));
        if (i == 0 || i == 1001) {
            this.o = true;
            this.m = true;
            this.n = true;
        } else {
            this.o = false;
        }
        if (i == 1001) {
            this.v = new Bundle();
            this.v.putBoolean(com.google.android.gms.cast.a.i, true);
            i = 0;
        }
        super.a(i, iBinder, bundle, i2);
    }

    public void a(ConnectionResult connectionResult) {
        super.a(connectionResult);
        L();
    }

    public void a(com.google.android.gms.internal.ahl.b<Status> bVar) {
        c((com.google.android.gms.internal.ahl.b) bVar);
        h().b();
    }

    public void a(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Channel namespace cannot be null or empty");
        }
        synchronized (this.h) {
            com.google.android.gms.cast.a.e eVar = (com.google.android.gms.cast.a.e) this.h.remove(str);
        }
        if (eVar != null) {
            try {
                h().c(str);
            } catch (Throwable e) {
                a.a(e, "Error unregistering namespace (%s): %s", str, e.getMessage());
            }
        }
    }

    public void a(String str, LaunchOptions launchOptions, com.google.android.gms.internal.ahl.b<com.google.android.gms.cast.a.a> bVar) {
        b((com.google.android.gms.internal.ahl.b) bVar);
        h().a(str, launchOptions);
    }

    public void a(String str, com.google.android.gms.cast.a.e eVar) {
        f.a(str);
        a(str);
        if (eVar != null) {
            synchronized (this.h) {
                this.h.put(str, eVar);
            }
            h().b(str);
        }
    }

    public void a(String str, com.google.android.gms.internal.ahl.b<Status> bVar) {
        c((com.google.android.gms.internal.ahl.b) bVar);
        h().a(str);
    }

    public void a(String str, String str2, JoinOptions joinOptions, com.google.android.gms.internal.ahl.b<com.google.android.gms.cast.a.a> bVar) {
        b((com.google.android.gms.internal.ahl.b) bVar);
        if (joinOptions == null) {
            joinOptions = new JoinOptions();
        }
        h().a(str, str2, joinOptions);
    }

    public void a(String str, String str2, com.google.android.gms.internal.ahl.b<Status> bVar) {
        if (TextUtils.isEmpty(str2)) {
            throw new IllegalArgumentException("The message payload cannot be null or empty");
        } else if (str2.length() > 65536) {
            throw new IllegalArgumentException("Message exceeds maximum size");
        } else {
            f.a(str);
            p();
            long incrementAndGet = this.s.incrementAndGet();
            try {
                this.w.put(Long.valueOf(incrementAndGet), bVar);
                h().a(str, str2, incrementAndGet);
            } catch (Throwable th) {
                this.w.remove(Long.valueOf(incrementAndGet));
            }
        }
    }

    public void a(String str, boolean z, com.google.android.gms.internal.ahl.b<com.google.android.gms.cast.a.a> bVar) {
        LaunchOptions launchOptions = new LaunchOptions();
        launchOptions.a(z);
        a(str, launchOptions, (com.google.android.gms.internal.ahl.b) bVar);
    }

    public void a(boolean z) {
        h().a(z, this.p, this.l);
    }

    protected /* synthetic */ IInterface b(IBinder iBinder) {
        return a(iBinder);
    }

    @NonNull
    protected String b() {
        return "com.google.android.gms.cast.internal.ICastDeviceController";
    }

    protected Bundle c() {
        Bundle bundle = new Bundle();
        a.b("getRemoteService(): mLastApplicationId=%s, mLastSessionId=%s", this.t, this.u);
        this.f.a(bundle);
        bundle.putLong("com.google.android.gms.cast.EXTRA_CAST_FLAGS", this.i);
        this.j = new b(this);
        bundle.putParcelable("listener", new BinderWrapper(this.j.asBinder()));
        if (this.t != null) {
            bundle.putString("last_application_id", this.t);
            if (this.u != null) {
                bundle.putString("last_session_id", this.u);
            }
        }
        return bundle;
    }

    public void f() {
        Throwable e;
        a.b("disconnect(); ServiceListener=%s, isConnected=%b", this.j, Boolean.valueOf(t()));
        b bVar = this.j;
        this.j = null;
        if (bVar == null || bVar.a() == null) {
            a.b("already disposed, so short-circuiting", new Object[0]);
            return;
        }
        L();
        try {
            h().a();
            super.f();
        } catch (RemoteException e2) {
            e = e2;
            try {
                a.a(e, "Error while disconnecting the controller interface: %s", e.getMessage());
            } finally {
                super.f();
            }
        } catch (IllegalStateException e3) {
            e = e3;
            a.a(e, "Error while disconnecting the controller interface: %s", e.getMessage());
        }
    }

    public Bundle g() {
        if (this.v == null) {
            return super.g();
        }
        Bundle bundle = this.v;
        this.v = null;
        return bundle;
    }

    j h() {
        return null == null ? (j) super.G() : this.x;
    }

    public void i() {
        h().c();
    }

    public double j() {
        p();
        return this.p;
    }

    public boolean k() {
        p();
        return this.l;
    }

    public int l() {
        p();
        return this.q;
    }

    public int m() {
        p();
        return this.r;
    }

    public ApplicationMetadata n() {
        p();
        return this.e;
    }

    public String o() {
        p();
        return this.k;
    }

    void p() {
        if (!this.o || this.j == null || this.j.b()) {
            throw new IllegalStateException("Not connected to a device");
        }
    }
}
