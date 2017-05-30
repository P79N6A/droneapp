package com.google.android.gms.internal;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

public class gh {
    @Nullable
    public static String a(@NonNull String str) {
        try {
            Object invoke = Class.forName("android.os.SystemProperties").getDeclaredMethod("get", new Class[]{String.class}).invoke(null, new Object[]{str});
            if (invoke != null && String.class.isAssignableFrom(invoke.getClass())) {
                return (String) invoke;
            }
        } catch (Exception e) {
        }
        return null;
    }
}
