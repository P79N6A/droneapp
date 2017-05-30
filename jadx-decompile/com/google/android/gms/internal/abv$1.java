package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import java.util.List;

class abv$1 implements ut$a {
    final /* synthetic */ List a;
    final /* synthetic */ ut b;
    final /* synthetic */ Context c;
    final /* synthetic */ abv d;

    abv$1(abv com_google_android_gms_internal_abv, List list, ut utVar, Context context) {
        this.d = com_google_android_gms_internal_abv;
        this.a = list;
        this.b = utVar;
        this.c = context;
    }

    public void a() {
        for (String str : this.a) {
            String str2 = "Pinging url: ";
            String valueOf = String.valueOf(str);
            abr.c(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
            this.b.a(Uri.parse(str), null, null);
        }
        this.b.a((Activity) this.c);
    }

    public void b() {
    }
}
