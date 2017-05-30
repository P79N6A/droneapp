package com.google.android.gms.common.util;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.accessibility.AccessibilityEventCompat;
import com.google.android.gms.internal.ajp;

public class d {
    public static int a(Context context, String str) {
        return a(b(context, str));
    }

    public static int a(PackageInfo packageInfo) {
        if (packageInfo == null || packageInfo.applicationInfo == null) {
            return -1;
        }
        Bundle bundle = packageInfo.applicationInfo.metaData;
        return bundle != null ? bundle.getInt("com.google.android.gms.version", -1) : -1;
    }

    public static boolean a() {
        return false;
    }

    @Nullable
    public static PackageInfo b(Context context, String str) {
        try {
            return ajp.b(context).b(str, 128);
        } catch (NameNotFoundException e) {
            return null;
        }
    }

    @TargetApi(12)
    public static boolean c(Context context, String str) {
        if (!s.b()) {
            return false;
        }
        if ("com.google.android.gms".equals(str) && a()) {
            return false;
        }
        try {
            return (ajp.b(context).a(str, 0).flags & AccessibilityEventCompat.TYPE_TOUCH_INTERACTION_END) != 0;
        } catch (NameNotFoundException e) {
            return false;
        }
    }
}
