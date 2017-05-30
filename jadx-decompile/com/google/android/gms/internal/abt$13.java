package com.google.android.gms.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

class abt$13 extends abt$a {
    final /* synthetic */ Context a;
    final /* synthetic */ abt$b b;

    abt$13(Context context, abt$b com_google_android_gms_internal_abt_b) {
        this.a = context;
        this.b = com_google_android_gms_internal_abt_b;
        super();
    }

    public void a() {
        SharedPreferences a = abt.a(this.a);
        Bundle bundle = new Bundle();
        bundle.putBoolean("use_https", a.getBoolean("use_https", true));
        if (this.b != null) {
            this.b.a(bundle);
        }
    }
}
