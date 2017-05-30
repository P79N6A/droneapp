package com.google.android.gms.awareness;

import com.google.android.gms.common.api.f;

public class c extends f {
    public static final int a = 7503;
    public static final int b = 7504;
    public static final int c = 7506;
    public static final int d = 7507;
    public static final int e = 7510;
    public static final int f = 7511;
    public static final int g = 7512;
    public static final int h = 7513;
    public static final int i = 7514;
    public static final int j = 7515;

    private c() {
    }

    public static String a(int i) {
        switch (i) {
            case -7501:
                return "SUCCESS_WROTE_INJECTED";
            case -7500:
                return "SUCCESS_INJECTED_ONLY";
            case 7500:
                return "MISSING_MODULE_ID";
            case 7501:
                return "EMPTY_CONTEXT_DATA_FILTER";
            case 7502:
                return "EMPTY_TRANSITION_FILTER";
            case a /*7503*/:
                return "ACL_ACCESS_DENIED";
            case b /*7504*/:
                return "BAD_ACCOUNT";
            case 7505:
                return "WRITE_FAILED";
            case c /*7506*/:
                return "BLUETOOTH_OFF";
            case d /*7507*/:
                return "INTERNAL_API_CLIENT_CONNECTION_FAILED";
            case 7508:
                return "PLACES_API_CALL_FAILED";
            case 7509:
                return "UNRESOLVED_PLACE_ALIAS";
            case e /*7510*/:
                return "INCONSISTENT_ACCOUNT";
            case f /*7511*/:
                return "INCONSISTENT_MODULE_ID";
            case g /*7512*/:
                return "API_NOT_AVAILABLE";
            case h /*7513*/:
                return "INCONSISTENT_UID";
            case i /*7514*/:
                return "FENCE_NOT_AVAILABLE";
            case j /*7515*/:
                return "MAX_LIMIT_OF_FENCE_REGISTRATIONS_EXCEEDED";
            default:
                return f.b(i);
        }
    }
}
