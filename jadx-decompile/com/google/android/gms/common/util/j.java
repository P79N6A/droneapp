package com.google.android.gms.common.util;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.PowerManager;
import android.os.SystemClock;
import com.google.firebase.a.a.b;
import com.tencent.mm.sdk.platformtools.Util;

public final class j {
    private static IntentFilter a = new IntentFilter("android.intent.action.BATTERY_CHANGED");
    private static long b;
    private static float c = Float.NaN;

    @TargetApi(20)
    public static int a(Context context) {
        int i = 1;
        if (context == null || context.getApplicationContext() == null) {
            return -1;
        }
        Intent registerReceiver = context.getApplicationContext().registerReceiver(null, a);
        int i2 = ((registerReceiver == null ? 0 : registerReceiver.getIntExtra("plugged", 0)) & 7) != 0 ? 1 : 0;
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager == null) {
            return -1;
        }
        int i3 = (a(powerManager) ? 1 : 0) << 1;
        if (i2 == 0) {
            i = 0;
        }
        return i3 | i;
    }

    @TargetApi(20)
    public static boolean a(PowerManager powerManager) {
        return s.i() ? powerManager.isInteractive() : powerManager.isScreenOn();
    }

    public static synchronized float b(Context context) {
        float f;
        synchronized (j.class) {
            if (SystemClock.elapsedRealtime() - b >= Util.MILLSECONDS_OF_MINUTE || Float.isNaN(c)) {
                Intent registerReceiver = context.getApplicationContext().registerReceiver(null, a);
                if (registerReceiver != null) {
                    c = ((float) registerReceiver.getIntExtra(b.q, -1)) / ((float) registerReceiver.getIntExtra("scale", -1));
                }
                b = SystemClock.elapsedRealtime();
                f = c;
            } else {
                f = c;
            }
        }
        return f;
    }
}
