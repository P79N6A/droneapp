package com.google.android.gms.internal;

import android.content.Intent;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.e.b.a;

class ano implements a {
    private final Status a;
    private final Intent b;

    public ano(Status status, Intent intent) {
        this.a = (Status) d.a(status);
        this.b = intent;
    }

    public Status a() {
        return this.a;
    }

    public Intent b() {
        return this.b;
    }
}
