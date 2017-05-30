package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.u;
import com.google.android.gms.ads.internal.util.client.a.a;

class abv$3 implements a {
    final /* synthetic */ Context a;
    final /* synthetic */ String b;
    final /* synthetic */ abv c;

    abv$3(abv com_google_android_gms_internal_abv, Context context, String str) {
        this.c = com_google_android_gms_internal_abv;
        this.a = context;
        this.b = str;
    }

    public void a(String str) {
        u.e().a(this.a, this.b, str);
    }
}
