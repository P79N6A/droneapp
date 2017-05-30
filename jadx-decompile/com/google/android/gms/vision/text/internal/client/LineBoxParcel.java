package com.google.android.gms.vision.text.internal.client;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class LineBoxParcel extends AbstractSafeParcelable {
    public static final d CREATOR = new d();
    public final int a;
    public final WordBoxParcel[] b;
    public final BoundingBoxParcel c;
    public final BoundingBoxParcel d;
    public final BoundingBoxParcel e;
    public final String f;
    public final float g;
    public final String h;
    public final int i;
    public final boolean j;
    public final int k;
    public final int l;

    public LineBoxParcel(int i, WordBoxParcel[] wordBoxParcelArr, BoundingBoxParcel boundingBoxParcel, BoundingBoxParcel boundingBoxParcel2, BoundingBoxParcel boundingBoxParcel3, String str, float f, String str2, int i2, boolean z, int i3, int i4) {
        this.a = i;
        this.b = wordBoxParcelArr;
        this.c = boundingBoxParcel;
        this.d = boundingBoxParcel2;
        this.e = boundingBoxParcel3;
        this.f = str;
        this.g = f;
        this.h = str2;
        this.i = i2;
        this.j = z;
        this.k = i3;
        this.l = i4;
    }

    public void writeToParcel(Parcel parcel, int i) {
        d.a(this, parcel, i);
    }
}
