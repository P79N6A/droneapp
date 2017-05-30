package com.google.android.gms.games.internal.b;

import com.google.android.gms.games.internal.h;

public final class r {
    private r() {
    }

    public static String a(int i) {
        switch (i) {
            case 1:
                return "GIFT";
            case 2:
                return "WISH";
            default:
                h.b("RequestType", "Unknown request type: " + i);
                return "UNKNOWN_TYPE";
        }
    }
}
