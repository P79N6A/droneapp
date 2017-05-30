package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.support.annotation.MainThread;
import com.google.android.gms.common.internal.d;

public final class f {
    private static Boolean d;
    private static Boolean e;
    private final Handler a = new Handler();
    private final Context b;
    private final a c;

    public interface a {
        Context a();

        boolean a(int i);
    }

    public f(a aVar) {
        this.b = aVar.a();
        d.a(this.b);
        this.c = aVar;
    }

    public static boolean a(Context context, boolean z) {
        d.a((Object) context);
        if (d != null && !z) {
            return d.booleanValue();
        }
        if (e != null && z) {
            return e.booleanValue();
        }
        boolean a = m.a(context, z ? "com.google.android.gms.measurement.PackageMeasurementService" : "com.google.android.gms.measurement.AppMeasurementService");
        if (z) {
            e = Boolean.valueOf(a);
            return a;
        }
        d = Boolean.valueOf(a);
        return a;
    }

    private ab c() {
        return aj.a(this.b).f();
    }

    @MainThread
    public int a(Intent intent, int i, int i2) {
        aj a = aj.a(this.b);
        ab f = a.f();
        if (intent == null) {
            f.z().a("AppMeasurementService started with null intent");
        } else {
            String action = intent.getAction();
            if (a.d().N()) {
                f.E().a("Device PackageMeasurementService called. startId, action", Integer.valueOf(i2), action);
            } else {
                f.E().a("Local AppMeasurementService called. startId, action", Integer.valueOf(i2), action);
            }
            if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
                a.h().a(new 1(this, a, i2, f));
            }
        }
        return 2;
    }

    @MainThread
    public IBinder a(Intent intent) {
        if (intent == null) {
            c().f().a("onBind called with null intent");
            return null;
        }
        String action = intent.getAction();
        if ("com.google.android.gms.measurement.START".equals(action)) {
            return new ak(aj.a(this.b));
        }
        c().z().a("onBind received unknown action", action);
        return null;
    }

    @MainThread
    public void a() {
        aj a = aj.a(this.b);
        ab f = a.f();
        if (a.d().N()) {
            f.E().a("Device PackageMeasurementService is starting up");
        } else {
            f.E().a("Local AppMeasurementService is starting up");
        }
    }

    @MainThread
    public void b() {
        aj a = aj.a(this.b);
        ab f = a.f();
        if (a.d().N()) {
            f.E().a("Device PackageMeasurementService is shutting down");
        } else {
            f.E().a("Local AppMeasurementService is shutting down");
        }
    }

    @MainThread
    public boolean b(Intent intent) {
        if (intent == null) {
            c().f().a("onUnbind called with null intent");
        } else {
            c().E().a("onUnbind called for intent. action", intent.getAction());
        }
        return true;
    }

    @MainThread
    public void c(Intent intent) {
        if (intent == null) {
            c().f().a("onRebind called with null intent");
            return;
        }
        c().E().a("onRebind called. action", intent.getAction());
    }
}
