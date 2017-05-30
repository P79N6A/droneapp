package com.google.android.gms.internal;

import android.content.Context;
import android.content.SharedPreferences.Editor;

class abt$10 extends abt$a {
    final /* synthetic */ Context a;
    final /* synthetic */ long b;

    abt$10(Context context, long j) {
        this.a = context;
        this.b = j;
        super();
    }

    public void a() {
        Editor edit = abt.a(this.a).edit();
        edit.putLong("app_last_background_time_ms", this.b);
        edit.apply();
    }
}
