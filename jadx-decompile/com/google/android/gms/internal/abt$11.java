package com.google.android.gms.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

class abt$11 extends abt$a {
    final /* synthetic */ Context a;
    final /* synthetic */ abt$b b;

    abt$11(Context context, abt$b com_google_android_gms_internal_abt_b) {
        this.a = context;
        this.b = com_google_android_gms_internal_abt_b;
        super();
    }

    public void a() {
        SharedPreferences a = abt.a(this.a);
        Bundle bundle = new Bundle();
        bundle.putLong("app_last_background_time_ms", a.getLong("app_last_background_time_ms", 0));
        if (this.b != null) {
            this.b.a(bundle);
        }
    }
}
