package com.google.android.gms.vision.text.internal.client;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class BoundingBoxParcel extends AbstractSafeParcelable {
    public static final a CREATOR = new a();
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final float f;

    public BoundingBoxParcel(int i, int i2, int i3, int i4, int i5, float f) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = f;
    }

    public void writeToParcel(Parcel parcel, int i) {
        a.a(this, parcel, i);
    }
}
