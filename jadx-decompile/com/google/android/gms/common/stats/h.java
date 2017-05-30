package com.google.android.gms.common.stats;

import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.stats.c.b;
import com.google.android.gms.common.util.d;
import com.google.android.gms.common.util.j;
import java.util.List;

public class h {
    private static String a = "WakeLockTracker";
    private static h b = new h();
    private static Boolean c;

    public static h a() {
        return b;
    }

    private static boolean a(Context context) {
        if (c == null) {
            c = Boolean.valueOf(b(context));
        }
        return c.booleanValue();
    }

    private static boolean b(Context context) {
        try {
            if (!d.a()) {
                return false;
            }
            return ((Integer) b.a.a()).intValue() != d.b;
        } catch (SecurityException e) {
            return false;
        }
    }

    public void a(Context context, String str, int i, String str2, String str3, String str4, int i2, List<String> list) {
        a(context, str, i, str2, str3, str4, i2, list, 0);
    }

    public void a(Context context, String str, int i, String str2, String str3, String str4, int i2, List<String> list, long j) {
        if (!a(context)) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            String str5 = a;
            String str6 = "missing wakeLock key. ";
            String valueOf = String.valueOf(str);
            Log.e(str5, valueOf.length() != 0 ? str6.concat(valueOf) : new String(str6));
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (7 == i || 8 == i || 10 == i || 11 == i) {
            try {
                context.startService(new Intent().setComponent(d.a).putExtra("com.google.android.gms.common.stats.EXTRA_LOG_EVENT", new WakeLockEvent(currentTimeMillis, i, str2, i2, f.a((List) list), str, SystemClock.elapsedRealtime(), j.a(context), str3, f.a(context.getPackageName()), j.b(context), j, str4)));
            } catch (Throwable e) {
                Log.wtf(a, e);
            }
        }
    }
}
