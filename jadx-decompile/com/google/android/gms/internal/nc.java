package com.google.android.gms.internal;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.d;
import java.net.URLEncoder;

public class nc {
    @NonNull
    public static String a(@Nullable String str) {
        return TextUtils.isEmpty(str) ? "" : b(URLEncoder.encode(str, "UTF8"));
    }

    @NonNull
    public static String b(@NonNull String str) {
        d.a(str);
        return str.replace("%2F", "/");
    }

    @NonNull
    public static String c(@NonNull String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (!str.startsWith("/") && !str.endsWith("/") && !str.contains("//")) {
            return str;
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (String str2 : str.split("/")) {
            if (!TextUtils.isEmpty(str2)) {
                if (stringBuilder.length() > 0) {
                    stringBuilder.append("/").append(str2);
                } else {
                    stringBuilder.append(str2);
                }
            }
        }
        return stringBuilder.toString();
    }
}
