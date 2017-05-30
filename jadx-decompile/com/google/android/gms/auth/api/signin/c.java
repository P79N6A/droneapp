package com.google.android.gms.auth.api.signin;

import com.google.android.gms.common.api.f;

public final class c extends f {
    public static final int a = 12500;
    public static final int b = 12501;

    private c() {
    }

    public static String a(int i) {
        switch (i) {
            case a /*12500*/:
                return "A non-recoverable sign in failure occurred";
            default:
                return f.b(i);
        }
    }
}
