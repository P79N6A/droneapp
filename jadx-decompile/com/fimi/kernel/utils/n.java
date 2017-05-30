package com.fimi.kernel.utils;

import com.fimi.kernel.c;
import com.fimi.soul.media.player.FimiMediaMeta;
import com.xiaomi.mipush.sdk.Constants;
import java.util.regex.Pattern;

public class n {
    public static int a(String str, int i) {
        String str2 = "[Α-￥]";
        int i2 = 0;
        for (int i3 = 0; i3 < str.length(); i3++) {
            i2 = str.substring(i3, i3 + 1).matches(str2) ? i2 + 2 : i2 + 1;
            if (i2 >= i) {
                return i3;
            }
        }
        return 0;
    }

    public static int a(String str, String str2) {
        int i = 0;
        if (!(str == null || str.length() == 0)) {
            try {
                i = str.getBytes(str2).length;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return i;
    }

    public static String a(long j) {
        String str = "B";
        if (j >= FimiMediaMeta.AV_CH_SIDE_RIGHT) {
            str = "K";
            j >>= 10;
            if (j >= FimiMediaMeta.AV_CH_SIDE_RIGHT) {
                str = "M";
                j >>= 10;
                if (j >= FimiMediaMeta.AV_CH_SIDE_RIGHT) {
                    str = "G";
                    j >>= 10;
                }
            }
        }
        return j + str;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String a(java.io.InputStream r4) {
        /*
        r0 = new java.io.BufferedReader;
        r1 = new java.io.InputStreamReader;
        r1.<init>(r4);
        r0.<init>(r1);
        r1 = new java.lang.StringBuilder;
        r1.<init>();
    L_0x000f:
        r2 = r0.readLine();	 Catch:{ IOException -> 0x002c }
        if (r2 == 0) goto L_0x0038;
    L_0x0015:
        r3 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x002c }
        r3.<init>();	 Catch:{ IOException -> 0x002c }
        r2 = r3.append(r2);	 Catch:{ IOException -> 0x002c }
        r3 = "\n";
        r2 = r2.append(r3);	 Catch:{ IOException -> 0x002c }
        r2 = r2.toString();	 Catch:{ IOException -> 0x002c }
        r1.append(r2);	 Catch:{ IOException -> 0x002c }
        goto L_0x000f;
    L_0x002c:
        r0 = move-exception;
        r0.printStackTrace();	 Catch:{ all -> 0x006e }
        r4.close();	 Catch:{ IOException -> 0x0069 }
    L_0x0033:
        r0 = r1.toString();
        return r0;
    L_0x0038:
        r0 = "\n";
        r0 = r1.indexOf(r0);	 Catch:{ IOException -> 0x002c }
        r2 = -1;
        if (r0 == r2) goto L_0x0060;
    L_0x0041:
        r0 = "\n";
        r0 = r1.lastIndexOf(r0);	 Catch:{ IOException -> 0x002c }
        r2 = r1.length();	 Catch:{ IOException -> 0x002c }
        r2 = r2 + -1;
        if (r0 != r2) goto L_0x0060;
    L_0x004f:
        r0 = "\n";
        r0 = r1.lastIndexOf(r0);	 Catch:{ IOException -> 0x002c }
        r2 = "\n";
        r2 = r1.lastIndexOf(r2);	 Catch:{ IOException -> 0x002c }
        r2 = r2 + 1;
        r1.delete(r0, r2);	 Catch:{ IOException -> 0x002c }
    L_0x0060:
        r4.close();	 Catch:{ IOException -> 0x0064 }
        goto L_0x0033;
    L_0x0064:
        r0 = move-exception;
        r0.printStackTrace();
        goto L_0x0033;
    L_0x0069:
        r0 = move-exception;
        r0.printStackTrace();
        goto L_0x0033;
    L_0x006e:
        r0 = move-exception;
        r4.close();	 Catch:{ IOException -> 0x0073 }
    L_0x0072:
        throw r0;
    L_0x0073:
        r1 = move-exception;
        r1.printStackTrace();
        goto L_0x0072;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fimi.kernel.utils.n.a(java.io.InputStream):java.lang.String");
    }

    public static String a(String str) {
        if (str == null || "null".equals(str.trim())) {
            str = "";
        }
        return str.trim();
    }

    public static String a(String str, int i, String str2) {
        int i2 = 0;
        if (a(str, "GBK") <= i) {
            return str;
        }
        StringBuffer stringBuffer = new StringBuffer(i);
        for (char c : str.toCharArray()) {
            stringBuffer.append(c);
            i2 = c > 'Ā' ? i2 + 2 : i2 + 1;
            if (i2 >= i) {
                if (str2 != null) {
                    stringBuffer.append(str2);
                }
                return stringBuffer.toString();
            }
        }
        return stringBuffer.toString();
    }

    public static String a(String str, String str2, int i) {
        if (b(str)) {
            return "";
        }
        int indexOf = str.indexOf(str2);
        return (indexOf == -1 || str.length() <= indexOf + i) ? "" : str.substring(indexOf + i);
    }

    public static void a(String[] strArr) {
        System.out.println(k("2012-3-2 12:2:20"));
    }

    public static String b(String str, int i) {
        return a(str, i, "");
    }

    public static String b(String str, String str2) {
        return b(str) ? "" : str.substring(0, str.indexOf(str2));
    }

    public static boolean b(String str) {
        return str == null || str.trim().length() == 0;
    }

    public static int c(String str) {
        int i = 0;
        String str2 = "[Α-￥]";
        if (b(str)) {
            return 0;
        }
        int i2 = 0;
        while (i < str.length()) {
            if (str.substring(i, i + 1).matches(str2)) {
                i2 += 2;
            }
            i++;
        }
        return i2;
    }

    public static int d(String str) {
        int i = 0;
        String str2 = "[Α-￥]";
        if (b(str)) {
            return 0;
        }
        int i2 = 0;
        while (i < str.length()) {
            i2 = str.substring(i, i + 1).matches(str2) ? i2 + 2 : i2 + 1;
            i++;
        }
        return i2;
    }

    public static Boolean e(String str) {
        Boolean valueOf = Boolean.valueOf(false);
        try {
            valueOf = Boolean.valueOf(Pattern.compile("^((13[0-9])|(15[^4,\\D])|(18[0,5-9]))\\d{8}$").matcher(str).matches());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return valueOf;
    }

    public static Boolean f(String str) {
        return str.matches("^[A-Za-z0-9]+$") ? Boolean.valueOf(true) : Boolean.valueOf(false);
    }

    public static Boolean g(String str) {
        return str.matches("^[0-9]+$") ? Boolean.valueOf(true) : Boolean.valueOf(false);
    }

    public static Boolean h(String str) {
        return str.matches("^([a-z0-9A-Z]+[-|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$") ? Boolean.valueOf(true) : Boolean.valueOf(false);
    }

    public static Boolean i(String str) {
        Boolean valueOf = Boolean.valueOf(true);
        String str2 = "[Α-￥]";
        if (b(str)) {
            return valueOf;
        }
        Boolean bool = valueOf;
        for (int i = 0; i < str.length(); i++) {
            if (!str.substring(i, i + 1).matches(str2)) {
                bool = Boolean.valueOf(false);
            }
        }
        return bool;
    }

    public static Boolean j(String str) {
        int i = 0;
        Boolean valueOf = Boolean.valueOf(false);
        String str2 = "[Α-￥]";
        if (!b(str)) {
            while (i < str.length()) {
                if (str.substring(i, i + 1).matches(str2)) {
                    valueOf = Boolean.valueOf(true);
                }
                i++;
            }
        }
        return valueOf;
    }

    public static String k(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        try {
            if (b(str)) {
                return null;
            }
            String[] split = str.split(" ");
            if (split.length > 0) {
                for (String str2 : split) {
                    String[] split2;
                    int i;
                    if (str2.indexOf(Constants.ACCEPT_TIME_SEPARATOR_SERVER) != -1) {
                        split2 = str2.split(Constants.ACCEPT_TIME_SEPARATOR_SERVER);
                        for (i = 0; i < split2.length; i++) {
                            stringBuilder.append(l(split2[i]));
                            if (i < split2.length - 1) {
                                stringBuilder.append(Constants.ACCEPT_TIME_SEPARATOR_SERVER);
                            }
                        }
                    } else if (str2.indexOf(":") != -1) {
                        stringBuilder.append(" ");
                        split2 = str2.split(":");
                        for (i = 0; i < split2.length; i++) {
                            stringBuilder.append(l(split2[i]));
                            if (i < split2.length - 1) {
                                stringBuilder.append(":");
                            }
                        }
                    }
                }
            }
            return stringBuilder.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String l(String str) {
        try {
            if (str.length() <= 1) {
                str = "0" + str;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return str;
    }

    public static long m(String str) {
        String[] split = str.replace(".", Constants.ACCEPT_TIME_SEPARATOR_SP).split(Constants.ACCEPT_TIME_SEPARATOR_SP);
        return Long.valueOf(split[3]).longValue() | (((Long.valueOf(split[0]).longValue() << 24) | (Long.valueOf(split[1]).longValue() << 16)) | (Long.valueOf(split[2]).longValue() << 8));
    }

    public static int n(String str) {
        int i = -1;
        if (str != null) {
            try {
                if (str != "") {
                    int lastIndexOf = str.toLowerCase().lastIndexOf("sp");
                    i = Integer.valueOf(str.substring(lastIndexOf - 2, lastIndexOf) + str.substring(lastIndexOf + 2, lastIndexOf + 4)).intValue();
                }
            } catch (Exception e) {
                z.b(c.a(), "解析逻辑版本出错!");
            }
        }
        return i;
    }
}
