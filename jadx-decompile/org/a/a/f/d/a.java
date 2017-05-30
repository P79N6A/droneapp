package org.a.a.f.d;

import java.util.regex.Pattern;
import org.a.a.a.b;

@b
public class a {
    private static final String a = "(([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\\.){3}([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])";
    private static final Pattern b = Pattern.compile("^(([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\\.){3}([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])$");
    private static final Pattern c = Pattern.compile("^::[fF]{4}:(([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\\.){3}([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])$");
    private static final Pattern d = Pattern.compile("^[0-9a-fA-F]{1,4}(:[0-9a-fA-F]{1,4}){7}$");
    private static final Pattern e = Pattern.compile("^(([0-9A-Fa-f]{1,4}(:[0-9A-Fa-f]{1,4}){0,5})?)::(([0-9A-Fa-f]{1,4}(:[0-9A-Fa-f]{1,4}){0,5})?)$");
    private static final char f = ':';
    private static final int g = 7;

    private a() {
    }

    public static boolean a(String str) {
        return b.matcher(str).matches();
    }

    public static boolean b(String str) {
        return c.matcher(str).matches();
    }

    public static boolean c(String str) {
        return d.matcher(str).matches();
    }

    public static boolean d(String str) {
        int i = 0;
        for (int i2 = 0; i2 < str.length(); i2++) {
            if (str.charAt(i2) == f) {
                i++;
            }
        }
        return i <= 7 && e.matcher(str).matches();
    }

    public static boolean e(String str) {
        return c(str) || d(str);
    }
}
