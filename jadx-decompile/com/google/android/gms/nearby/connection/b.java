package com.google.android.gms.nearby.connection;

import com.google.android.gms.common.api.f;

public final class b extends f {
    public static final int a = 0;
    public static final int b = 13;
    public static final int c = 8000;
    public static final int d = 8001;
    public static final int e = 8002;
    public static final int f = 8003;
    public static final int g = 8004;
    public static final int h = 8005;

    private b() {
    }

    public static String a(int i) {
        switch (i) {
            case 8000:
                return "STATUS_NETWORK_NOT_CONNECTED";
            case 8001:
                return "STATUS_ALREADY_ADVERTISING";
            case 8002:
                return "STATUS_ALREADY_DISCOVERING";
            case 8003:
                return "STATUS_ALREADY_CONNECTED_TO_ENDPOINT";
            case g /*8004*/:
                return "STATUS_CONNECTION_REJECTED";
            case h /*8005*/:
                return "STATUS_NOT_CONNECTED_TO_ENDPOINT";
            default:
                return f.b(i);
        }
    }
}
