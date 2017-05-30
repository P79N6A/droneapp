package com.google.android.gms.vision.face.internal.client;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class FaceParcel extends AbstractSafeParcelable {
    public static final b CREATOR = new b();
    public final int a;
    public final int b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;
    public final LandmarkParcel[] i;
    public final float j;
    public final float k;
    public final float l;

    public FaceParcel(int i, int i2, float f, float f2, float f3, float f4, float f5, float f6, LandmarkParcel[] landmarkParcelArr, float f7, float f8, float f9) {
        this.a = i;
        this.b = i2;
        this.c = f;
        this.d = f2;
        this.e = f3;
        this.f = f4;
        this.g = f5;
        this.h = f6;
        this.i = landmarkParcelArr;
        this.j = f7;
        this.k = f8;
        this.l = f9;
    }

    public void writeToParcel(Parcel parcel, int i) {
        b.a(this, parcel, i);
    }
}
