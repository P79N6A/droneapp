package com.google.android.gms.location.places.internal;

import com.google.android.gms.common.api.g;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.location.places.PlacePhotoResult;
import com.google.android.gms.location.places.i;
import com.google.android.gms.location.places.l;
import com.google.android.gms.location.places.s;
import com.google.android.gms.location.places.s.a;

public class p implements i {
    private final String a;
    private final int b;
    private final int c;
    private final CharSequence d;
    private int e;

    public p(String str, int i, int i2, CharSequence charSequence, int i3) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = charSequence;
        this.e = i3;
    }

    public com.google.android.gms.common.api.i<PlacePhotoResult> a(g gVar) {
        return a(gVar, c(), d());
    }

    public com.google.android.gms.common.api.i<PlacePhotoResult> a(g gVar, int i, int i2) {
        final int i3 = i;
        final int i4 = i2;
        return gVar.a(new a<e>(this, l.c, gVar) {
            final /* synthetic */ p c;

            protected void a(e eVar) {
                eVar.a(new s((a) this), this.c.a, i3, i4, this.c.e);
            }
        });
    }

    public /* synthetic */ Object a() {
        return f();
    }

    public boolean b() {
        return true;
    }

    public int c() {
        return this.b;
    }

    public int d() {
        return this.c;
    }

    public CharSequence e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return pVar.b == this.b && pVar.c == this.c && c.a(pVar.a, this.a) && c.a(pVar.d, this.d);
    }

    public i f() {
        return this;
    }

    public int hashCode() {
        return c.a(new Object[]{Integer.valueOf(this.b), Integer.valueOf(this.c), this.a, this.d});
    }
}
