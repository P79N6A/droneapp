package com.google.android.gms.wallet;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.a.b;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.g.c;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.internal.fa;

class d$1 extends b<fa, d$a> {
    d$1() {
    }

    public fa a(Context context, Looper looper, s sVar, d$a com_google_android_gms_wallet_d_a, g.b bVar, c cVar) {
        if (com_google_android_gms_wallet_d_a == null) {
            com_google_android_gms_wallet_d_a = new d$a();
        }
        return new fa(context, looper, sVar, bVar, cVar, com_google_android_gms_wallet_d_a.a, com_google_android_gms_wallet_d_a.b, com_google_android_gms_wallet_d_a.c);
    }
}
