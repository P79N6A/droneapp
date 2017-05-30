package com.google.android.gms.games.internal.b;

import com.google.android.gms.games.internal.h;

public final class z {
    public static String a(int i) {
        switch (i) {
            case 0:
                return "TURN_STATUS_INVITED";
            case 1:
                return "TURN_STATUS_MY_TURN";
            case 2:
                return "TURN_STATUS_THEIR_TURN";
            case 3:
                return "TURN_STATUS_COMPLETE";
            default:
                h.b("MatchTurnStatus", "Unknown match turn status: " + i);
                return "TURN_STATUS_UNKNOWN";
        }
    }
}
