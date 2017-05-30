package com.google.android.gms.cast;

import android.text.TextUtils;
import com.google.android.gms.cast.internal.f;
import com.xiaomi.mipush.sdk.Constants;
import java.util.Collection;
import java.util.Locale;

public final class b {
    public static final String a = "CC1AD845";
    public static final String b = "com.google.android.gms.cast.ACTION_SYNC_STATUS";
    public static final String c = "com.google.android.gms.cast.EXTRA_CUSTOM_DATA";
    public static final String d = "com.google.android.gms.cast.EXTRA_CAST_APPLICATION_ID";
    public static final String e = "com.google.android.gms.cast.EXTRA_CAST_RELAUNCH_APPLICATION";
    public static final String f = "com.google.android.gms.cast.EXTRA_CAST_LANGUAGE_CODE";
    public static final String g = "com.google.android.gms.cast.EXTRA_CAST_STOP_APPLICATION_WHEN_SESSION_ENDS";
    public static final String h = "com.google.android.gms.cast.EXTRA_DEBUG_LOGGING_ENABLED";
    public static final String i = "com.google.android.gms.cast.EXTRA_ERROR_CODE";
    public static final int j = 1;
    public static final int k = 2;
    public static final int l = 3;

    private b() {
    }

    public static String a() {
        return a("com.google.android.gms.cast.CATEGORY_CAST_REMOTE_PLAYBACK", null, null);
    }

    public static String a(String str) {
        if (!TextUtils.isEmpty(str)) {
            return a("com.google.android.gms.cast.CATEGORY_CAST_REMOTE_PLAYBACK", str, null);
        }
        throw new IllegalArgumentException("applicationId cannot be null or empty");
    }

    private static String a(String str, String str2, Collection<String> collection) {
        String toUpperCase;
        StringBuilder stringBuilder = new StringBuilder(str);
        if (str2 != null) {
            toUpperCase = str2.toUpperCase();
            if (toUpperCase.matches("[A-F0-9]+")) {
                stringBuilder.append("/").append(toUpperCase);
            } else {
                String str3 = "Invalid application ID: ";
                toUpperCase = String.valueOf(str2);
                throw new IllegalArgumentException(toUpperCase.length() != 0 ? str3.concat(toUpperCase) : new String(str3));
            }
        }
        if (collection != null) {
            if (collection.isEmpty()) {
                throw new IllegalArgumentException("Must specify at least one namespace");
            }
            if (str2 == null) {
                stringBuilder.append("/");
            }
            stringBuilder.append("/");
            Object obj = 1;
            for (String toUpperCase2 : collection) {
                f.a(toUpperCase2);
                if (obj != null) {
                    obj = null;
                } else {
                    stringBuilder.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                }
                stringBuilder.append(f.c(toUpperCase2));
            }
        }
        return stringBuilder.toString();
    }

    public static String a(String str, Collection<String> collection) {
        if (str == null) {
            throw new IllegalArgumentException("applicationId cannot be null");
        } else if (collection != null) {
            return a("com.google.android.gms.cast.CATEGORY_CAST", str, collection);
        } else {
            throw new IllegalArgumentException("namespaces cannot be null");
        }
    }

    public static String a(Collection<String> collection) {
        if (collection != null) {
            return a("com.google.android.gms.cast.CATEGORY_CAST", null, collection);
        }
        throw new IllegalArgumentException("namespaces cannot be null");
    }

    public static String a(Locale locale) {
        return f.a(locale);
    }

    public static String b(String str) {
        if (str != null) {
            return a("com.google.android.gms.cast.CATEGORY_CAST", str, null);
        }
        throw new IllegalArgumentException("applicationId cannot be null");
    }
}
