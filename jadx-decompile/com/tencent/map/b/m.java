package com.tencent.map.b;

public final class m {
    private static m b;
    private int a = 0;

    private m() {
    }

    public static m a() {
        if (b == null) {
            b = new m();
        }
        return b;
    }
}
