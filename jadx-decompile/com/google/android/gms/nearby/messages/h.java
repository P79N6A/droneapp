package com.google.android.gms.nearby.messages;

import com.google.android.gms.common.api.f;

public class h extends f {
    public static final int a = 2801;
    public static final int b = 2802;
    public static final int c = 2803;
    public static final int d = 2804;
    public static final int e = 2805;
    public static final int f = 2806;
    public static final int g = 2807;
    public static final int h = 2820;
    public static final int i = 2821;
    public static final int j = 2822;

    private h() {
    }

    public static String a(int i) {
        switch (i) {
            case a /*2801*/:
                return "TOO_MANY_PENDING_INTENTS";
            case b /*2802*/:
                return "APP_NOT_OPTED_IN";
            case c /*2803*/:
                return "DISALLOWED_CALLING_CONTEXT";
            case e /*2805*/:
                return "NOT_AUTHORIZED";
            case f /*2806*/:
                return "FORBIDDEN";
            case h /*2820*/:
                return "BLUETOOTH_OFF";
            case i /*2821*/:
                return "BLE_ADVERTISING_UNSUPPORTED";
            case j /*2822*/:
                return "BLE_SCANNING_UNSUPPORTED";
            default:
                return f.b(i);
        }
    }
}
