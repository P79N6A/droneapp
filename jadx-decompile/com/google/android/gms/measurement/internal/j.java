package com.google.android.gms.measurement.internal;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.util.e;

public class j extends b {
    private boolean a;
    private final AlarmManager b = ((AlarmManager) q().getSystemService("alarm"));
    private final r c;

    protected j(aj ajVar) {
        super(ajVar);
        this.c = new r(this, ajVar) {
            final /* synthetic */ j a;

            public void a() {
                this.a.z();
            }
        };
    }

    private PendingIntent g() {
        Intent intent = new Intent();
        Context q = q();
        String str = (!y().N() || this.n.D()) ? "com.google.android.gms.measurement.AppMeasurementReceiver" : "com.google.android.gms.measurement.PackageMeasurementReceiver";
        Intent className = intent.setClassName(q, str);
        className.setAction("com.google.android.gms.measurement.UPLOAD");
        return PendingIntent.getBroadcast(q(), 0, className, 0);
    }

    private void z() {
        Intent intent = new Intent();
        Context q = q();
        String str = (!y().N() || this.n.D()) ? "com.google.android.gms.measurement.AppMeasurementReceiver" : "com.google.android.gms.measurement.PackageMeasurementReceiver";
        Intent className = intent.setClassName(q, str);
        className.setAction("com.google.android.gms.measurement.UPLOAD");
        q().sendBroadcast(className);
    }

    public void a(long j) {
        boolean z = false;
        c();
        boolean z2 = y().N() || ag.a(q(), false);
        d.a(z2, "Receiver not registered/enabled");
        if (y().N() || f.a(q(), false)) {
            z = true;
        }
        d.a(z, "Service not registered/enabled");
        f();
        long b = p().b() + j;
        this.a = true;
        if (j < y().ae() && !this.c.b()) {
            this.c.a(j);
        }
        this.b.setInexactRepeating(2, b, Math.max(y().af(), j), g());
    }

    protected void e() {
        this.b.cancel(g());
    }

    public void f() {
        c();
        this.a = false;
        this.b.cancel(g());
        this.c.c();
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

    public /* bridge */ /* synthetic */ e p() {
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
}
