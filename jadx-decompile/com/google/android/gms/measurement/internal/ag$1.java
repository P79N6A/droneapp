package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.measurement.AppMeasurement;

class ag$1 implements Runnable {
    final /* synthetic */ aj a;
    final /* synthetic */ long b;
    final /* synthetic */ Bundle c;
    final /* synthetic */ Context d;
    final /* synthetic */ ab e;
    final /* synthetic */ ag f;

    ag$1(ag agVar, aj ajVar, long j, Bundle bundle, Context context, ab abVar) {
        this.f = agVar;
        this.a = ajVar;
        this.b = j;
        this.c = bundle;
        this.d = context;
        this.e = abVar;
    }

    public void run() {
        l c = this.a.p().c(this.a.v().f(), "_fot");
        long longValue = (c == null || !(c.d instanceof Long)) ? 0 : ((Long) c.d).longValue();
        long j = this.b;
        longValue = (longValue <= 0 || (j < longValue && j > 0)) ? j : longValue - 1;
        if (longValue > 0) {
            this.c.putLong("click_timestamp", longValue);
        }
        AppMeasurement.getInstance(this.d).a("auto", "_cmp", this.c);
        this.e.E().a("Install campaign recorded");
    }
}
