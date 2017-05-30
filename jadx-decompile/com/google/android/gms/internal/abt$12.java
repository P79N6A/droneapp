package com.google.android.gms.internal;

import android.content.Context;
import android.content.SharedPreferences.Editor;

class abt$12 extends abt$a {
    final /* synthetic */ Context a;
    final /* synthetic */ int b;

    abt$12(Context context, int i) {
        this.a = context;
        this.b = i;
        super();
    }

    public void a() {
        Editor edit = abt.a(this.a).edit();
        edit.putInt("request_in_session_count", this.b);
        edit.apply();
    }
}
