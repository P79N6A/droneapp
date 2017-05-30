package com.google.android.gms.common;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager.NameNotFoundException;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.aa;
import com.google.android.gms.common.util.i;
import com.google.android.gms.drive.e;
import com.google.android.gms.internal.ajp;
import com.xiaomi.mipush.sdk.Constants;

public class j {
    private static final j a = new j();
    public static final int c = l.e;
    public static final String d = "com.google.android.gms";

    j() {
    }

    public static j b() {
        return a;
    }

    private String b(@Nullable Context context, @Nullable String str) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("gcore_");
        stringBuilder.append(c);
        stringBuilder.append(Constants.ACCEPT_TIME_SEPARATOR_SERVER);
        if (!TextUtils.isEmpty(str)) {
            stringBuilder.append(str);
        }
        stringBuilder.append(Constants.ACCEPT_TIME_SEPARATOR_SERVER);
        if (context != null) {
            stringBuilder.append(context.getPackageName());
        }
        stringBuilder.append(Constants.ACCEPT_TIME_SEPARATOR_SERVER);
        if (context != null) {
            try {
                stringBuilder.append(ajp.b(context).b(context.getPackageName(), 0).versionCode);
            } catch (NameNotFoundException e) {
            }
        }
        return stringBuilder.toString();
    }

    public int a(Context context) {
        int e = l.e(context);
        return l.d(context, e) ? 18 : e;
    }

    @Nullable
    public PendingIntent a(Context context, int i, int i2) {
        return a(context, i, i2, null);
    }

    @Nullable
    public PendingIntent a(Context context, int i, int i2, @Nullable String str) {
        if (i.a(context) && i == 2) {
            i = 42;
        }
        Intent a = a(context, i, str);
        return a == null ? null : PendingIntent.getActivity(context, i2, a, e.a_);
    }

    @Nullable
    public Intent a(Context context, int i, @Nullable String str) {
        switch (i) {
            case 1:
            case 2:
                return aa.a("com.google.android.gms", b(context, str));
            case 3:
                return aa.a("com.google.android.gms");
            case 42:
                return aa.a();
            default:
                return null;
        }
    }

    public boolean a(int i) {
        return l.g(i);
    }

    public boolean a(Context context, String str) {
        return l.a(context, str);
    }

    @Nullable
    @Deprecated
    public Intent b(int i) {
        return a(null, i, null);
    }

    @Nullable
    public String b(Context context) {
        return l.j(context);
    }

    public boolean b(Context context, int i) {
        return l.d(context, i);
    }

    public int c(Context context) {
        return l.m(context);
    }

    public String c(int i) {
        return l.d(i);
    }

    public void d(Context context) {
        l.f(context);
    }

    public void e(Context context) {
        l.i(context);
    }
}
