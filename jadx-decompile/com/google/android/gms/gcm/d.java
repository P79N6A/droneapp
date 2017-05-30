package com.google.android.gms.gcm;

import android.os.Bundle;

public class d {
    private final String a;
    private final Bundle b;

    public d(String str) {
        this(str, null);
    }

    public d(String str, Bundle bundle) {
        this.a = str;
        this.b = bundle;
    }

    public String a() {
        return this.a;
    }

    public Bundle b() {
        return this.b;
    }
}
