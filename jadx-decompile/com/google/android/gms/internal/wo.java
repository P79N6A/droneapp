package com.google.android.gms.internal;

import android.support.annotation.Nullable;
import com.google.android.gms.ads.internal.client.af;
import com.google.android.gms.ads.internal.client.ag;
import com.google.android.gms.ads.internal.client.am;
import com.google.android.gms.ads.internal.l;
import com.google.android.gms.ads.internal.reward.client.d;

@aaa
class wo {
    @Nullable
    ag a;
    @Nullable
    am b;
    @Nullable
    yy c;
    @Nullable
    ur d;
    @Nullable
    af e;
    @Nullable
    d f;

    wo() {
    }

    void a(l lVar) {
        if (this.a != null) {
            lVar.a(new a(this.a));
        }
        if (this.b != null) {
            lVar.a(this.b);
        }
        if (this.c != null) {
            lVar.a(this.c);
        }
        if (this.d != null) {
            lVar.a(this.d);
        }
        if (this.e != null) {
            lVar.a(this.e);
        }
        if (this.f != null) {
            lVar.a(this.f);
        }
    }
}
