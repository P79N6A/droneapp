package com.google.android.gms.tagmanager;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import java.util.HashMap;
import java.util.Map;

public class an {
    static Map<String, String> a = new HashMap();
    private static String b;

    public static String a(Context context, String str, String str2) {
        String str3 = (String) a.get(str);
        if (str3 == null) {
            SharedPreferences sharedPreferences = context.getSharedPreferences("gtm_click_referrers", 0);
            str3 = sharedPreferences != null ? sharedPreferences.getString(str, "") : "";
            a.put(str, str3);
        }
        return a(str3, str2);
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

    static void a(Context context, String str) {
        cn.a(context, "gtm_install_referrer", "referrer", str);
        c(context, str);
    }

    public static void a(String str) {
        synchronized (an.class) {
            b = str;
        }
    }

    public static String b(Context context, String str) {
        if (b == null) {
            synchronized (an.class) {
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

    public static void c(Context context, String str) {
        String a = a(str, "conv");
        if (a != null && a.length() > 0) {
            a.put(a, str);
            cn.a(context, "gtm_click_referrers", a, str);
        }
    }
}
