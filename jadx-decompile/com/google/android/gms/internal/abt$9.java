package com.google.android.gms.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

class abt$9 extends abt$a {
    final /* synthetic */ Context a;
    final /* synthetic */ abt$b b;

    abt$9(Context context, abt$b com_google_android_gms_internal_abt_b) {
        this.a = context;
        this.b = com_google_android_gms_internal_abt_b;
        super();
    }

    public void a() {
        SharedPreferences a = abt.a(this.a);
        Bundle bundle = new Bundle();
        bundle.putString("app_settings_json", a.getString("app_settings_json", ""));
        bundle.putLong("app_settings_last_update_ms", a.getLong("app_settings_last_update_ms", 0));
        if (this.b != null) {
            this.b.a(bundle);
        }
    }
}
