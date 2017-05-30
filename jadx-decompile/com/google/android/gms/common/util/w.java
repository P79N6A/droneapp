package com.google.android.gms.common.util;

import com.google.android.gms.common.internal.r;
import java.util.regex.Pattern;

public class w {
    private static final Pattern a = Pattern.compile("\\$\\{(.*?)\\}");

    public static boolean a(String str) {
        return str == null || r.a.b(str);
    }
}
