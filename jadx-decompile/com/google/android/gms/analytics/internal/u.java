package com.google.android.gms.analytics.internal;

import com.google.android.gms.common.j;

public class u {
    public static final String a = String.valueOf(j.c / 1000).replaceAll("(\\d+)(\\d)(\\d\\d)", "$1.$2.$3");
    public static final String b;

    static {
        String str = "ma";
        String valueOf = String.valueOf(a);
        b = valueOf.length() != 0 ? str.concat(valueOf) : new String(str);
    }
}
