package com.google.android.gms.common.internal;

import android.support.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.r;
import com.google.android.gms.common.api.v;

public class m {
    @NonNull
    public static r a(@NonNull ConnectionResult connectionResult) {
        return a(new Status(connectionResult.c(), connectionResult.e(), connectionResult.d()));
    }

    @NonNull
    public static r a(@NonNull Status status) {
        return status.e() ? new v(status) : new r(status);
    }
}
