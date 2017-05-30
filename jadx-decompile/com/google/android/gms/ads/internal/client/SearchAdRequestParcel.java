package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import com.google.android.gms.ads.search.b;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.aaa;

@aaa
public final class SearchAdRequestParcel extends AbstractSafeParcelable {
    public static final p CREATOR = new p();
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final String j;
    public final int k;
    public final String l;
    public final int m;
    public final int n;
    public final String o;

    SearchAdRequestParcel(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, String str, int i10, String str2, int i11, int i12, String str3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = i6;
        this.g = i7;
        this.h = i8;
        this.i = i9;
        this.j = str;
        this.k = i10;
        this.l = str2;
        this.m = i11;
        this.n = i12;
        this.o = str3;
    }

    public SearchAdRequestParcel(b bVar) {
        this.a = 1;
        this.b = bVar.a();
        this.c = bVar.b();
        this.d = bVar.c();
        this.e = bVar.d();
        this.f = bVar.e();
        this.g = bVar.f();
        this.h = bVar.g();
        this.i = bVar.h();
        this.j = bVar.i();
        this.k = bVar.j();
        this.l = bVar.k();
        this.m = bVar.l();
        this.n = bVar.m();
        this.o = bVar.o();
    }

    public void writeToParcel(Parcel parcel, int i) {
        p.a(this, parcel, i);
    }
}
