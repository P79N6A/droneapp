package com.google.android.gms.cast;

import com.google.android.gms.iid.a;

public final class f {
    public static final int a = 0;
    public static final int b = 7;
    public static final int c = 15;
    public static final int d = 14;
    public static final int e = 2000;
    public static final int f = 2001;
    public static final int g = 2002;
    public static final int h = 2003;
    public static final int i = 2004;
    public static final int j = 2005;
    public static final int k = 2006;
    public static final int l = 2007;
    public static final int m = 2100;
    public static final int n = 2103;
    public static final int o = 8;
    public static final int p = 13;
    public static final int q = 2200;
    public static final int r = 2201;

    private f() {
    }

    public static String a(int i) {
        switch (i) {
            case 0:
                return "SUCCESS";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 13:
                return "UNKNOWN_ERROR";
            case 14:
                return "INTERRUPTED";
            case 15:
                return a.b;
            case 2000:
                return "AUTHENTICATION_FAILED";
            case 2001:
                return "INVALID_REQUEST";
            case 2002:
                return "CANCELED";
            case h /*2003*/:
                return "NOT_ALLOWED";
            case i /*2004*/:
                return "APPLICATION_NOT_FOUND";
            case j /*2005*/:
                return "APPLICATION_NOT_RUNNING";
            case k /*2006*/:
                return "MESSAGE_TOO_LARGE";
            case l /*2007*/:
                return "MESSAGE_SEND_BUFFER_TOO_FULL";
            case 2100:
                return "FAILED";
            case g.g /*2101*/:
                return "STATUS_CANCELLED";
            case g.h /*2102*/:
                return "STATUS_TIMED_OUT";
            case 2103:
                return "REPLACED";
            case q /*2200*/:
                return "ERROR_SERVICE_CREATION_FAILED";
            case r /*2201*/:
                return "ERROR_SERVICE_DISCONNECTED";
            default:
                return com.google.android.gms.common.api.f.b(i);
        }
    }
}
