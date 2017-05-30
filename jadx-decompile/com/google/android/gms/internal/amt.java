package com.google.android.gms.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.util.Log;
import com.google.android.gms.common.m;

final class amt {
    static boolean a(Context context) {
        PackageManager packageManager = context.getPackageManager();
        try {
            if (m.a(context).b(packageManager, packageManager.getPackageInfo("com.google.android.gms", 64))) {
                return true;
            }
            Log.e("InstantAppsApi", "Incorrect signature for Google Play Services");
            return false;
        } catch (NameNotFoundException e) {
            return false;
        }
    }
}
