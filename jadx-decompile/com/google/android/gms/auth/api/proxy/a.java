package com.google.android.gms.auth.api.proxy;

import com.google.android.gms.common.api.f;

public class a extends f {
    public static final int a = 3000;
    public static final int b = 3001;
    public static final int c = 3002;
    public static final int d = 3003;
    public static final int e = 3004;
    public static final int f = 3005;
    public static final int g = 3006;

    private a() {
    }

    public static String a(int i) {
        switch (i) {
            case 3000:
                return "AUTH_API_INVALID_CREDENTIALS";
            case 3001:
                return "AUTH_API_ACCESS_FORBIDDEN";
            case 3002:
                return "AUTH_API_CLIENT_ERROR";
            case 3003:
                return "AUTH_API_SERVER_ERROR";
            case e /*3004*/:
                return "AUTH_TOKEN_ERROR";
            case f /*3005*/:
                return "AUTH_URL_RESOLUTION";
            case g /*3006*/:
                return "AUTH_APP_CERT_ERROR";
            default:
                return f.b(i);
        }
    }
}
