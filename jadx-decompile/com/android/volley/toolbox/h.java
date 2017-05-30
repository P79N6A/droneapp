package com.android.volley.toolbox;

import com.android.volley.b.a;
import com.android.volley.j;
import com.xiaomi.mipush.sdk.Constants;
import java.util.Map;
import org.a.a.e;
import org.apache.http.impl.cookie.DateParseException;
import org.apache.http.impl.cookie.DateUtils;

public class h {
    public static long a(String str) {
        try {
            return DateUtils.parseDate(str).getTime();
        } catch (DateParseException e) {
            return 0;
        }
    }

    public static a a(j jVar) {
        Object obj;
        long j;
        Object obj2;
        long currentTimeMillis = System.currentTimeMillis();
        Map map = jVar.c;
        long j2 = 0;
        long j3 = 0;
        long j4 = 0;
        String str = (String) map.get("Date");
        if (str != null) {
            j2 = a(str);
        }
        str = (String) map.get("Cache-Control");
        if (str != null) {
            String[] split = str.split(Constants.ACCEPT_TIME_SEPARATOR_SP);
            obj = null;
            j = 0;
            j4 = 0;
            for (String trim : split) {
                String trim2 = trim2.trim();
                if (trim2.equals("no-cache") || trim2.equals("no-store")) {
                    return null;
                }
                if (trim2.startsWith("max-age=")) {
                    try {
                        j4 = Long.parseLong(trim2.substring(8));
                    } catch (Exception e) {
                    }
                } else if (trim2.startsWith("stale-while-revalidate=")) {
                    try {
                        j = Long.parseLong(trim2.substring(23));
                    } catch (Exception e2) {
                    }
                } else if (trim2.equals("must-revalidate") || trim2.equals("proxy-revalidate")) {
                    obj = 1;
                }
            }
            j3 = j4;
            j4 = j;
            obj2 = 1;
        } else {
            obj = null;
            obj2 = null;
        }
        str = (String) map.get("Expires");
        long a = str != null ? a(str) : 0;
        str = (String) map.get("Last-Modified");
        long a2 = str != null ? a(str) : 0;
        str = (String) map.get(e.v);
        if (obj2 != null) {
            j3 = currentTimeMillis + (1000 * j3);
            j = obj != null ? j3 : (1000 * j4) + j3;
        } else if (j2 <= 0 || a < j2) {
            j = 0;
            j3 = 0;
        } else {
            j = (a - j2) + currentTimeMillis;
            j3 = j;
        }
        a aVar = new a();
        aVar.a = jVar.b;
        aVar.b = str;
        aVar.f = j3;
        aVar.e = j;
        aVar.c = j2;
        aVar.d = a2;
        aVar.g = map;
        return aVar;
    }

    public static String a(Map<String, String> map) {
        return a(map, "ISO-8859-1");
    }

    public static String a(Map<String, String> map, String str) {
        String str2 = (String) map.get("Content-Type");
        if (str2 == null) {
            return str;
        }
        String[] split = str2.split(";");
        for (int i = 1; i < split.length; i++) {
            String[] split2 = split[i].trim().split("=");
            if (split2.length == 2 && split2[0].equals("charset")) {
                return split2[1];
            }
        }
        return str;
    }
}