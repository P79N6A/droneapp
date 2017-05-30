package com.google.android.gms.common.util;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;

public final class i {
    private static Boolean a;
    private static Boolean b;
    private static Boolean c;
    private static Boolean d;

    @TargetApi(20)
    public static boolean a(Context context) {
        if (c == null) {
            boolean z = s.i() && context.getPackageManager().hasSystemFeature("android.hardware.type.watch");
            c = Boolean.valueOf(z);
        }
        return c.booleanValue();
    }

    public static boolean a(Resources resources) {
        boolean z = false;
        if (resources == null) {
            return false;
        }
        if (a == null) {
            boolean z2 = (resources.getConfiguration().screenLayout & 15) > 3;
            if ((s.a() && z2) || b(resources)) {
                z = true;
            }
            a = Boolean.valueOf(z);
        }
        return a.booleanValue();
    }

    @TargetApi(21)
    public static boolean b(Context context) {
        if (d == null) {
            boolean z = s.k() && context.getPackageManager().hasSystemFeature("cn.google");
            d = Boolean.valueOf(z);
        }
        return d.booleanValue();
    }

    @TargetApi(13)
    private static boolean b(Resources resources) {
        if (b == null) {
            Configuration configuration = resources.getConfiguration();
            boolean z = s.c() && (configuration.screenLayout & 15) <= 3 && configuration.smallestScreenWidthDp >= 600;
            b = Boolean.valueOf(z);
        }
        return b.booleanValue();
    }
}
