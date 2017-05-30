package com.google.android.gms.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import java.util.HashMap;
import java.util.Map;

public class apg {
    static Map<String, String> a = new HashMap();
    private static String b;

    public static String a(Context context, String str) {
        if (b == null) {
            synchronized (apg.class) {
                if (b == null) {
                    SharedPreferences sharedPreferences = context.getSharedPreferences("gtm_install_referrer", 0);
                    if (sharedPreferences != null) {
                        b = sharedPreferences.getString("referrer", "");
                    } else {
                        b = "";
                    }
                }
            }
        }
        return a(b, str);
    }

    public static String a(String str, String str2) {
        if (str2 == null) {
            return str.length() > 0 ? str : null;
        } else {
            String str3 = "http://hostname/?";
            String valueOf = String.valueOf(str);
            return Uri.parse(valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3)).getQueryParameter(str2);
        }
    }
}
