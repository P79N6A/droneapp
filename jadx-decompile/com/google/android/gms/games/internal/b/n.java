package com.google.android.gms.games.internal.b;

public final class n {
    private n() {
    }

    public static String a(int i) {
        switch (i) {
            case 0:
                return "ANDROID";
            case 1:
                return "IOS";
            case 2:
                return "WEB_APP";
            default:
                throw new IllegalArgumentException("Unknown platform type: " + i);
        }
    }
}
