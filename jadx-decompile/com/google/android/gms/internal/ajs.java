package com.google.android.gms.internal;

import com.google.android.gms.common.api.f;

public final class ajs extends f {
    public static String a(int i) {
        switch (i) {
            case -6508:
                return "SUCCESS_CACHE_STALE";
            case -6506:
                return "SUCCESS_CACHE";
            case -6505:
                return "SUCCESS_FRESH";
            case com.google.android.gms.games.f.F /*6500*/:
                return "NOT_AUTHORIZED_TO_FETCH";
            case com.google.android.gms.games.f.G /*6501*/:
                return "ANOTHER_FETCH_INFLIGHT";
            case com.google.android.gms.games.f.H /*6502*/:
                return "FETCH_THROTTLED";
            case com.google.android.gms.games.f.I /*6503*/:
                return "NOT_AVAILABLE";
            case com.google.android.gms.games.f.J /*6504*/:
                return "FAILURE_CACHE";
            case com.google.android.gms.games.f.M /*6507*/:
                return "FETCH_THROTTLED_STALE";
            default:
                return f.b(i);
        }
    }
}
