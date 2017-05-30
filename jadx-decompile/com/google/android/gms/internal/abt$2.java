package com.google.android.gms.internal;

import android.content.Context;
import android.content.SharedPreferences.Editor;

class abt$2 extends abt$a {
    final /* synthetic */ Context a;
    final /* synthetic */ boolean b;

    abt$2(Context context, boolean z) {
        this.a = context;
        this.b = z;
        super();
    }

    public void a() {
        Editor edit = abt.a(this.a).edit();
        edit.putBoolean("content_url_opted_out", this.b);
        edit.apply();
    }
}
