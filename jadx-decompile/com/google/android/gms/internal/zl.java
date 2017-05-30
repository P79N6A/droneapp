package com.google.android.gms.internal;

import android.content.Context;
import android.util.DisplayMetrics;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.util.client.b;
import com.google.android.gms.internal.abi.a;

@aaa
public class zl extends zj {
    private zk g;

    zl(Context context, a aVar, acy com_google_android_gms_internal_acy, zn.a aVar2) {
        super(context, aVar, com_google_android_gms_internal_acy, aVar2);
    }

    protected void b() {
        int i;
        int i2;
        AdSizeParcel k = this.c.k();
        if (k.e) {
            DisplayMetrics displayMetrics = this.b.getResources().getDisplayMetrics();
            i = displayMetrics.widthPixels;
            i2 = displayMetrics.heightPixels;
        } else {
            i = k.g;
            i2 = k.d;
        }
        this.g = new zk(this, this.c, i, i2);
        this.c.l().a((acz.a) this);
        this.g.a(this.e);
    }

    protected int c() {
        if (!this.g.c()) {
            return !this.g.d() ? 2 : -2;
        } else {
            b.a("Ad-Network indicated no fill with passback URL.");
            return 3;
        }
    }
}
