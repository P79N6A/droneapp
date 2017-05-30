package com.google.android.gms.auth;

import android.content.Intent;

public class d extends a {
    private final Intent a;

    public d(String str, Intent intent) {
        super(str);
        this.a = intent;
    }

    public Intent b() {
        return this.a == null ? null : new Intent(this.a);
    }
}
