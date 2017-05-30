package com.google.android.gms.vision.text.internal.client;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class WordBoxParcel extends AbstractSafeParcelable {
    public static final i CREATOR = new i();
    public final int a;
    public final SymbolBoxParcel[] b;
    public final BoundingBoxParcel c;
    public final BoundingBoxParcel d;
    public final String e;
    public final float f;
    public final String g;
    public final boolean h;

    public WordBoxParcel(int i, SymbolBoxParcel[] symbolBoxParcelArr, BoundingBoxParcel boundingBoxParcel, BoundingBoxParcel boundingBoxParcel2, String str, float f, String str2, boolean z) {
        this.a = i;
        this.b = symbolBoxParcelArr;
        this.c = boundingBoxParcel;
        this.d = boundingBoxParcel2;
        this.e = str;
        this.f = f;
        this.g = str2;
        this.h = z;
    }

    public void writeToParcel(Parcel parcel, int i) {
        i.a(this, parcel, i);
    }
}
