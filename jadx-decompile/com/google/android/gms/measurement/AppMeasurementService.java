package com.google.android.gms.measurement;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.MainThread;
import android.support.v4.content.WakefulBroadcastReceiver;
import com.google.android.gms.measurement.internal.f;
import com.google.android.gms.measurement.internal.f.a;

public final class AppMeasurementService extends Service implements a {
    private f a;

    private f b() {
        if (this.a == null) {
            this.a = new f(this);
        }
        return this.a;
    }

    public Context a() {
        return this;
    }

    public boolean a(int i) {
        return stopSelfResult(i);
    }

    @MainThread
    public IBinder onBind(Intent intent) {
        return b().a(intent);
    }

    @MainThread
    public void onCreate() {
        super.onCreate();
        b().a();
    }

    @MainThread
    public void onDestroy() {
        b().b();
        super.onDestroy();
    }

    @MainThread
    public void onRebind(Intent intent) {
        b().c(intent);
    }

    @MainThread
    public int onStartCommand(Intent intent, int i, int i2) {
        int a = b().a(intent, i, i2);
        WakefulBroadcastReceiver.completeWakefulIntent(intent);
        return a;
    }

    @MainThread
    public boolean onUnbind(Intent intent) {
        return b().b(intent);
    }
}
