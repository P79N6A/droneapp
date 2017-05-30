package com.google.android.gms.common.api;

import android.support.v4.util.ArrayMap;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.internal.ahh;

public class s extends t {
    private final ConnectionResult a;

    public s(Status status, ArrayMap<ahh<?>, ConnectionResult> arrayMap) {
        super(status, arrayMap);
        this.a = (ConnectionResult) arrayMap.get(arrayMap.keyAt(0));
    }
}
