package com.google.android.gms.internal;

import android.content.Context;
import android.content.SharedPreferences.Editor;

class abt$4 extends abt$a {
    final /* synthetic */ Context a;
    final /* synthetic */ String b;

    abt$4(Context context, String str) {
        this.a = context;
        this.b = str;
        super();
    }

    public void a() {
        Editor edit = abt.a(this.a).edit();
        edit.putString("content_url_hashes", this.b);
        edit.apply();
    }
}
