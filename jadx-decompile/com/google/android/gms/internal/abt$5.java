package com.google.android.gms.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

class abt$5 extends abt$a {
    final /* synthetic */ Context a;
    final /* synthetic */ abt$b b;

    abt$5(Context context, abt$b com_google_android_gms_internal_abt_b) {
        this.a = context;
        this.b = com_google_android_gms_internal_abt_b;
        super();
    }

    public void a() {
        SharedPreferences a = abt.a(this.a);
        Bundle bundle = new Bundle();
        bundle.putString("content_url_hashes", a.getString("content_url_hashes", ""));
        if (this.b != null) {
            this.b.a(bundle);
        }
    }
}
