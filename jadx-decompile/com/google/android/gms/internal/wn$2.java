package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.client.am.a;

class wn$2 extends a {
    final /* synthetic */ wn a;

    wn$2(wn wnVar) {
        this.a = wnVar;
    }

    public void a(final String str, final String str2) {
        wn.a(this.a).add(new wn$a(this) {
            final /* synthetic */ wn$2 c;

            public void a(wo woVar) {
                if (woVar.b != null) {
                    woVar.b.a(str, str2);
                }
            }
        });
    }
}
