package com.google.android.gms.games.internal.b;

public final class h {
    private h() {
    }

    public static String a(int i) {
        switch (i) {
            case 0:
                return "PUBLIC";
            case 1:
                return "SOCIAL";
            case 2:
                return "SOCIAL_1P";
            default:
                throw new IllegalArgumentException("Unknown leaderboard collection: " + i);
        }
    }
}
