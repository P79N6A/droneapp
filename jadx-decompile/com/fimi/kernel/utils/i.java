package com.fimi.kernel.utils;

public class i {
    public static String a(String str) {
        if (!b(str)) {
            return str;
        }
        StringBuffer stringBuffer = new StringBuffer(str.length());
        for (int i = 0; i <= str.length() - 1; i++) {
            char charAt = str.charAt(i);
            switch (charAt) {
                case '\"':
                    stringBuffer.append("&quot;");
                    break;
                case '&':
                    stringBuffer.append("&amp;");
                    break;
                case '<':
                    stringBuffer.append("&lt;");
                    break;
                case '>':
                    stringBuffer.append("&gt;");
                    break;
                default:
                    stringBuffer.append(charAt);
                    break;
            }
        }
        return stringBuffer.toString();
    }

    public static boolean b(String str) {
        int i = 0;
        if (str == null || str.length() <= 0) {
            return false;
        }
        boolean z = false;
        while (i <= str.length() - 1) {
            switch (str.charAt(i)) {
                case '\"':
                    z = true;
                    break;
                case '&':
                    z = true;
                    break;
                case '<':
                    z = true;
                    break;
                case '>':
                    z = true;
                    break;
                default:
                    break;
            }
            i++;
        }
        return z;
    }
}
