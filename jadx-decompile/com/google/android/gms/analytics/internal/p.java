package com.google.android.gms.analytics.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ServiceInfo;
import android.text.TextUtils;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.util.n;
import com.google.android.gms.internal.adp;
import com.xiaomi.mipush.sdk.Constants;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLDecoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class p {
    private static final char[] a = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    public static double a(String str, double d) {
        if (str != null) {
            try {
                d = Double.parseDouble(str);
            } catch (NumberFormatException e) {
            }
        }
        return d;
    }

    public static adp a(g gVar, String str) {
        d.a((Object) gVar);
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        HashMap hashMap = new HashMap();
        try {
            String str2 = "?";
            String valueOf = String.valueOf(str);
            Map a = n.a(new URI(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2)), "UTF-8");
            adp com_google_android_gms_internal_adp = new adp();
            com_google_android_gms_internal_adp.e((String) a.get("utm_content"));
            com_google_android_gms_internal_adp.c((String) a.get("utm_medium"));
            com_google_android_gms_internal_adp.a((String) a.get("utm_campaign"));
            com_google_android_gms_internal_adp.b((String) a.get("utm_source"));
            com_google_android_gms_internal_adp.d((String) a.get("utm_term"));
            com_google_android_gms_internal_adp.f((String) a.get("utm_id"));
            com_google_android_gms_internal_adp.g((String) a.get("anid"));
            com_google_android_gms_internal_adp.h((String) a.get("gclid"));
            com_google_android_gms_internal_adp.i((String) a.get("dclid"));
            com_google_android_gms_internal_adp.j((String) a.get("aclid"));
            return com_google_android_gms_internal_adp;
        } catch (URISyntaxException e) {
            gVar.d("No valid campaign data found", e);
            return null;
        }
    }

    public static String a(Locale locale) {
        if (locale == null) {
            return null;
        }
        Object language = locale.getLanguage();
        if (TextUtils.isEmpty(language)) {
            return null;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(language.toLowerCase());
        if (!TextUtils.isEmpty(locale.getCountry())) {
            stringBuilder.append(Constants.ACCEPT_TIME_SEPARATOR_SERVER).append(locale.getCountry().toLowerCase());
        }
        return stringBuilder.toString();
    }

    public static String a(boolean z) {
        return z ? "1" : "0";
    }

    public static Map<String, String> a(String str) {
        Map<String, String> hashMap = new HashMap();
        for (String split : str.split("&")) {
            String[] split2 = split.split("=", 3);
            if (split2.length > 1) {
                hashMap.put(split2[0], TextUtils.isEmpty(split2[1]) ? null : split2[1]);
                if (!(split2.length != 3 || TextUtils.isEmpty(split2[1]) || hashMap.containsKey(split2[1]))) {
                    hashMap.put(split2[1], TextUtils.isEmpty(split2[2]) ? null : split2[2]);
                }
            } else if (split2.length == 1 && split2[0].length() != 0) {
                hashMap.put(split2[0], null);
            }
        }
        return hashMap;
    }

    public static void a(Map<String, String> map, String str, String str2) {
        if (str2 != null && !map.containsKey(str)) {
            map.put(str, str2);
        }
    }

    public static void a(Map<String, String> map, String str, Map<String, String> map2) {
        a((Map) map, str, (String) map2.get(str));
    }

    public static void a(Map<String, String> map, String str, boolean z) {
        if (!map.containsKey(str)) {
            map.put(str, z ? "1" : "0");
        }
    }

    public static boolean a(double d, String str) {
        return d > 0.0d && d < 100.0d && ((double) (e(str) % 10000)) >= 100.0d * d;
    }

    public static boolean a(Context context, String str) {
        try {
            ServiceInfo serviceInfo = context.getPackageManager().getServiceInfo(new ComponentName(context, str), 4);
            if (serviceInfo != null && serviceInfo.enabled) {
                return true;
            }
        } catch (NameNotFoundException e) {
        }
        return false;
    }

    public static boolean a(Context context, String str, boolean z) {
        try {
            ActivityInfo receiverInfo = context.getPackageManager().getReceiverInfo(new ComponentName(context, str), 2);
            if (receiverInfo != null && receiverInfo.enabled && (!z || receiverInfo.exported)) {
                return true;
            }
        } catch (NameNotFoundException e) {
        }
        return false;
    }

    public static boolean a(String str, boolean z) {
        return str != null ? (str.equalsIgnoreCase("true") || str.equalsIgnoreCase("yes") || str.equalsIgnoreCase("1")) ? true : (str.equalsIgnoreCase("false") || str.equalsIgnoreCase("no") || str.equalsIgnoreCase("0")) ? false : z : z;
    }

    public static long b(String str) {
        long j = 0;
        if (str != null) {
            try {
                j = Long.parseLong(str);
            } catch (NumberFormatException e) {
            }
        }
        return j;
    }

    public static void b(Map<String, String> map, String str, String str2) {
        if (str2 != null && TextUtils.isEmpty((CharSequence) map.get(str))) {
            map.put(str, str2);
        }
    }

    public static String c(String str) {
        int i = 0;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.contains("?")) {
            String[] split = str.split("[\\?]");
            if (split.length > 1) {
                str = split[1];
            }
        }
        if (str.contains("%3D")) {
            try {
                str = URLDecoder.decode(str, "UTF-8");
            } catch (UnsupportedEncodingException e) {
                return null;
            }
        } else if (!str.contains("=")) {
            return null;
        }
        Map a = a(str);
        String[] strArr = new String[]{"dclid", "utm_source", "gclid", "aclid", "utm_campaign", "utm_medium", "utm_term", "utm_content", "utm_id", "anid", "gmob_t"};
        StringBuilder stringBuilder = new StringBuilder();
        while (i < 11) {
            if (!TextUtils.isEmpty((CharSequence) a.get(strArr[i]))) {
                if (stringBuilder.length() > 0) {
                    stringBuilder.append("&");
                }
                stringBuilder.append(strArr[i]).append("=").append((String) a.get(strArr[i]));
            }
            i++;
        }
        return stringBuilder.toString();
    }

    public static MessageDigest d(String str) {
        int i = 0;
        while (i < 2) {
            try {
                MessageDigest instance = MessageDigest.getInstance(str);
                if (instance != null) {
                    return instance;
                }
                i++;
            } catch (NoSuchAlgorithmException e) {
            }
        }
        return null;
    }

    public static int e(String str) {
        int i = 1;
        if (!TextUtils.isEmpty(str)) {
            i = 0;
            for (int length = str.length() - 1; length >= 0; length--) {
                char charAt = str.charAt(length);
                i = (((i << 6) & 268435455) + charAt) + (charAt << 14);
                int i2 = 266338304 & i;
                if (i2 != 0) {
                    i ^= i2 >> 21;
                }
            }
        }
        return i;
    }

    public static boolean f(String str) {
        return TextUtils.isEmpty(str) || !str.startsWith("http:");
    }
}
