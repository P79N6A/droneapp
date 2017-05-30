package com.google.android.gms.common.api;

import android.support.annotation.NonNull;

public class r extends Exception {
    protected final Status a;

    public r(@NonNull Status status) {
        super(status.c());
        this.a = status;
    }
}
