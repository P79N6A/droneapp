package com.google.android.gms.wearable;

import com.google.android.gms.common.api.f;

public final class s extends f {
    public static final int a = 4000;
    public static final int b = 4001;
    public static final int c = 4002;
    public static final int d = 4003;
    public static final int e = 4004;
    public static final int f = 4005;
    public static final int g = 4006;
    public static final int h = 4007;
    public static final int i = 4008;

    private s() {
    }

    public static String a(int i) {
        switch (i) {
            case 4000:
                return "TARGET_NODE_NOT_CONNECTED";
            case 4001:
                return "DUPLICATE_LISTENER";
            case 4002:
                return "UNKNOWN_LISTENER";
            case 4003:
                return "DATA_ITEM_TOO_LARGE";
            case 4004:
                return "INVALID_TARGET_NODE";
            case 4005:
                return "ASSET_UNAVAILABLE";
            default:
                return f.b(i);
        }
    }
}
