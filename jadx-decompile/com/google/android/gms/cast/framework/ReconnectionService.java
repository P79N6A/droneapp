package com.google.android.gms.cast.framework;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.gms.cast.internal.m;
import com.google.android.gms.internal.afc;

public class ReconnectionService extends Service {
    private static final m a = new m("ReconnectionService");
    private y b;

    public IBinder onBind(Intent intent) {
        try {
            return this.b.a(intent);
        } catch (Throwable e) {
            a.a(e, "Unable to call %s on %s.", "onBind", y.class.getSimpleName());
            return null;
        }
    }

    public void onCreate() {
        c a = c.a((Context) this);
        this.b = afc.a(this, a.b().c(), a.e().a());
        try {
            this.b.a();
        } catch (Throwable e) {
            a.a(e, "Unable to call %s on %s.", "onCreate", y.class.getSimpleName());
        }
        super.onCreate();
    }

    public void onDestroy() {
        try {
            this.b.b();
        } catch (Throwable e) {
            a.a(e, "Unable to call %s on %s.", "onDestroy", y.class.getSimpleName());
        }
        super.onDestroy();
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        int i3 = 1;
        try {
            i3 = this.b.a(intent, i, i2);
        } catch (Throwable e) {
            a.a(e, "Unable to call %s on %s.", "onStartCommand", y.class.getSimpleName());
        }
        return i3;
    }
}
