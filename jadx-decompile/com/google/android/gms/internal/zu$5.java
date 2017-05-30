package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.formats.a;
import com.google.android.gms.ads.internal.formats.c;
import java.util.List;

class zu$5 implements acn$a<List<c>, a> {
    final /* synthetic */ String a;
    final /* synthetic */ Integer b;
    final /* synthetic */ Integer c;
    final /* synthetic */ int d;
    final /* synthetic */ int e;
    final /* synthetic */ int f;
    final /* synthetic */ int g;
    final /* synthetic */ zu h;

    zu$5(zu zuVar, String str, Integer num, Integer num2, int i, int i2, int i3, int i4) {
        this.h = zuVar;
        this.a = str;
        this.b = num;
        this.c = num2;
        this.d = i;
        this.e = i2;
        this.f = i3;
        this.g = i4;
    }

    public a a(List<c> list) {
        a aVar;
        if (list != null) {
            try {
                if (!list.isEmpty()) {
                    aVar = new a(this.a, zu.a(list), this.b, this.c, this.d > 0 ? Integer.valueOf(this.d) : null, this.e + this.f, this.g);
                    return aVar;
                }
            } catch (Throwable e) {
                abr.b("Could not get attribution icon", e);
                return null;
            }
        }
        aVar = null;
        return aVar;
    }

    public /* synthetic */ Object a(Object obj) {
        return a((List) obj);
    }
}
