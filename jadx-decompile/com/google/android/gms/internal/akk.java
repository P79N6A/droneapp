package com.google.android.gms.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.util.i;

public class akk {
    private static int a = -1;

    private static boolean a() {
        return false;
    }

    public static boolean a(Context context) {
        return i.a(context);
    }

    public static int b(Context context) {
        if (a == -1) {
            if (a(context)) {
                a = 3;
            } else if (e(context) || a()) {
                a = 0;
            } else if (c(context)) {
                a = 2;
            } else if (b()) {
                a = 6;
            } else {
                a = 1;
            }
        }
        return a;
    }

    private static boolean b() {
        return !TextUtils.isEmpty(Build.PRODUCT) && Build.PRODUCT.startsWith("glass_");
    }

    private static boolean c(Context context) {
        return i.a(context.getResources()) && !d(context);
    }

    private static boolean d(Context context) {
        try {
            return ((TelephonyManager) context.getSystemService("phone")).getPhoneType() != 0;
        } catch (Throwable e) {
            Log.wtf("Fitness", "Unable to determine type of device, assuming phone.", e);
            return true;
        }
    }

    private static boolean e(Context context) {
        PackageManager packageManager = context.getPackageManager();
        return packageManager.hasSystemFeature("com.google.android.tv") || packageManager.hasSystemFeature("android.hardware.type.television") || packageManager.hasSystemFeature("android.software.leanback");
    }
}
