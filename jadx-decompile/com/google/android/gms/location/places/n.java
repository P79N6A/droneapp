package com.google.android.gms.location.places;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.internal.d;

public class n extends f {
    public static final int a = 9001;
    public static final int b = 9002;
    public static final int c = 9003;
    public static final int d = 9004;
    public static final int e = 9005;
    public static final int f = 9006;
    public static final int g = 9007;
    public static final int h = 9008;

    private n() {
    }

    public static Status a(int i, String str) {
        d.a(str);
        return new Status(i, str);
    }

    public static String a(int i) {
        switch (i) {
            case com.google.android.gms.games.f.Y /*9000*/:
                return "PLACES_API_QUOTA_FAILED";
            case 9001:
                return "PLACES_API_USAGE_LIMIT_EXCEEDED";
            case 9002:
                return "PLACES_API_KEY_INVALID";
            case 9003:
                return "PLACES_API_ACCESS_NOT_CONFIGURED";
            case 9004:
                return "PLACES_API_INVALID_ARGUMENT";
            case e /*9005*/:
                return "PLACES_API_RATE_LIMIT_EXCEEDED";
            case 9006:
                return "PLACES_API_DEVICE_RATE_LIMIT_EXCEEDED";
            case g /*9007*/:
                return "PLACES_API_KEY_EXPIRED";
            case h /*9008*/:
                return "PLACES_API_INVALID_APP";
            case 9051:
                return "PLACE_ALIAS_NOT_FOUND";
            case 9101:
                return "PLACE_PROXIMITY_UNKNOWN";
            case 9102:
                return "NEARBY_ALERTS_NOT_AVAILABLE";
            default:
                return f.b(i);
        }
    }

    public static Status c(int i) {
        return a(i, a(i));
    }
}
