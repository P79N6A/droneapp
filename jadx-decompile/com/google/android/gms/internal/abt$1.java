package com.google.android.gms.internal;

import android.content.Context;
import android.content.SharedPreferences.Editor;

class abt$1 extends abt$a {
    final /* synthetic */ Context a;
    final /* synthetic */ boolean b;

    abt$1(Context context, boolean z) {
        this.a = context;
        this.b = z;
        super();
    }

    public void a() {
        Editor edit = abt.a(this.a).edit();
        edit.putBoolean("use_https", this.b);
        edit.apply();
    }
}
