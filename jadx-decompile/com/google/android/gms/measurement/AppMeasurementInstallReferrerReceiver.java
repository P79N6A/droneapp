package com.google.android.gms.measurement;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.MainThread;
import com.google.android.gms.measurement.internal.ag;
import com.google.android.gms.measurement.internal.ag.a;

public final class AppMeasurementInstallReferrerReceiver extends BroadcastReceiver implements a {
    private ag a;

    private ag a() {
        if (this.a == null) {
            this.a = new ag(this);
        }
        return this.a;
    }

    public void a(Context context, Intent intent) {
    }

    @MainThread
    public void onReceive(Context context, Intent intent) {
        a().a(context, intent);
    }
}
