package com.google.android.gms.common.api;

import android.support.v4.util.ArrayMap;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.internal.ahh;

public class t implements m {
    private final Status a;
    private final ArrayMap<ahh<?>, ConnectionResult> b;

    public t(Status status, ArrayMap<ahh<?>, ConnectionResult> arrayMap) {
        this.a = status;
        this.b = arrayMap;
    }

    public Status a() {
        return this.a;
    }
}
