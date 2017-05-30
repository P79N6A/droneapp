package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.MainThread;
import com.google.android.gms.common.internal.d;

public final class ag {
    static Boolean a;
    static Boolean b;
    private final a c;

    public interface a {
        void a(Context context, Intent intent);
    }

    public ag(a aVar) {
        d.a((Object) aVar);
        this.c = aVar;
    }

    public static boolean a(Context context, boolean z) {
        d.a((Object) context);
        if (a != null && !z) {
            return a.booleanValue();
        }
        if (b != null && z) {
            return b.booleanValue();
        }
        boolean a = m.a(context, z ? "com.google.android.gms.measurement.PackageMeasurementReceiver" : "com.google.android.gms.measurement.AppMeasurementReceiver", false);
        if (z) {
            b = Boolean.valueOf(a);
            return a;
        }
        a = Boolean.valueOf(a);
        return a;
    }

    @MainThread
    public void a(Context context, Intent intent) {
        aj a = aj.a(context);
        ab f = a.f();
        if (intent == null) {
            f.z().a("Receiver called with null intent");
            return;
        }
        boolean N = a.d().N();
        String action = intent.getAction();
        if (N) {
            f.E().a("Device receiver got", action);
        } else {
            f.E().a("Local receiver got", action);
        }
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            boolean z = N && !a.D();
            f.a(context, z);
            Intent intent2 = new Intent();
            action = (!N || a.D()) ? "com.google.android.gms.measurement.AppMeasurementService" : "com.google.android.gms.measurement.PackageMeasurementService";
            Intent className = intent2.setClassName(context, action);
            className.setAction("com.google.android.gms.measurement.UPLOAD");
            this.c.a(context, className);
        } else if (!N && "com.android.vending.INSTALL_REFERRER".equals(action)) {
            action = intent.getStringExtra("referrer");
            if (action == null) {
                f.E().a("Install referrer extras are null");
                return;
            }
            Bundle a2 = a.o().a(Uri.parse(action));
            if (a2 == null) {
                f.E().a("No campaign defined in install referrer broadcast");
                return;
            }
            long longExtra = 1000 * intent.getLongExtra("referrer_timestamp_seconds", 0);
            if (longExtra == 0) {
                f.z().a("Install referrer is missing timestamp");
            }
            a.h().a(new 1(this, a, longExtra, a2, context, f));
        }
    }
}
