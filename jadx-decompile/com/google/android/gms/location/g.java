package com.google.android.gms.location;

import com.google.android.gms.common.api.f;

public final class g extends f {
    public static final int a = 1000;
    public static final int b = 1001;
    public static final int c = 1002;

    private g() {
    }

    public static String a(int i) {
        switch (i) {
            case 1000:
                return "GEOFENCE_NOT_AVAILABLE";
            case 1001:
                return "GEOFENCE_TOO_MANY_GEOFENCES";
            case 1002:
                return "GEOFENCE_TOO_MANY_PENDING_INTENTS";
            default:
                return f.b(i);
        }
    }
}
