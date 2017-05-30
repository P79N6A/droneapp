package com.google.android.gms.measurement;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.MainThread;
import android.support.v4.content.WakefulBroadcastReceiver;
import com.google.android.gms.measurement.internal.ag;
import com.google.android.gms.measurement.internal.ag.a;

public final class AppMeasurementReceiver extends WakefulBroadcastReceiver implements a {
    private ag a;

    private ag a() {
        if (this.a == null) {
            this.a = new ag(this);
        }
        return this.a;
    }

    @MainThread
    public void a(Context context, Intent intent) {
        WakefulBroadcastReceiver.startWakefulService(context, intent);
    }

    @MainThread
    public void onReceive(Context context, Intent intent) {
        a().a(context, intent);
    }
}
