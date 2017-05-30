package com.google.android.gms.games.internal.b;

public final class x {
    private x() {
        throw new AssertionError("Uninstantiable");
    }

    public static String a(int i) {
        switch (i) {
            case 0:
                return "DAILY";
            case 1:
                return "WEEKLY";
            case 2:
                return "ALL_TIME";
            default:
                throw new IllegalArgumentException("Unknown time span " + i);
        }
    }
}
