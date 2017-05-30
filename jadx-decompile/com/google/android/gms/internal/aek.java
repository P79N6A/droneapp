package com.google.android.gms.internal;

import android.content.Intent;
import com.google.android.gms.appinvite.d;
import com.google.android.gms.common.api.Status;

public class aek implements d {
    private final Status a;
    private final Intent b;

    public aek(Status status, Intent intent) {
        this.a = status;
        this.b = intent;
    }

    public Status a() {
        return this.a;
    }

    public Intent b() {
        return this.b;
    }
}
