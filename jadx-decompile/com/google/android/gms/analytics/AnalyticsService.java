package com.google.android.gms.analytics;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.RequiresPermission;
import com.google.android.gms.analytics.internal.l;
import com.google.android.gms.analytics.internal.l.a;

public final class AnalyticsService extends Service implements a {
    private l a;

    private l b() {
        if (this.a == null) {
            this.a = new l(this);
        }
        return this.a;
    }

    public Context a() {
        return this;
    }

    public boolean a(int i) {
        return stopSelfResult(i);
    }

    public IBinder onBind(Intent intent) {
        return b().a(intent);
    }

    @RequiresPermission(allOf = {"android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE"})
    public void onCreate() {
        super.onCreate();
        b().a();
    }

    @RequiresPermission(allOf = {"android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE"})
    public void onDestroy() {
        b().b();
        super.onDestroy();
    }

    @RequiresPermission(allOf = {"android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE"})
    public int onStartCommand(Intent intent, int i, int i2) {
        return b().a(intent, i, i2);
    }
}
