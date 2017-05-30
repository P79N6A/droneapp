package com.google.android.gms.internal;

import android.content.Context;
import android.content.SharedPreferences.Editor;

class abt$8 extends abt$a {
    final /* synthetic */ Context a;
    final /* synthetic */ String b;
    final /* synthetic */ long c;

    abt$8(Context context, String str, long j) {
        this.a = context;
        this.b = str;
        this.c = j;
        super();
    }

    public void a() {
        Editor edit = abt.a(this.a).edit();
        edit.putString("app_settings_json", this.b);
        edit.putLong("app_settings_last_update_ms", this.c);
        edit.apply();
    }
}
