package com.fimi.kernel.view;

public class c {
    private static b a = null;

    private c() {
    }

    public static b a() {
        if (a == null) {
            a = new a();
        }
        return a;
    }
}
