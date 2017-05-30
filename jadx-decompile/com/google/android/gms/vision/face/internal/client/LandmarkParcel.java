package com.google.android.gms.vision.face.internal.client;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class LandmarkParcel extends AbstractSafeParcelable {
    public static final f CREATOR = new f();
    public final int a;
    public final float b;
    public final float c;
    public final int d;

    public LandmarkParcel(int i, float f, float f2, int i2) {
        this.a = i;
        this.b = f;
        this.c = f2;
        this.d = i2;
    }

    public void writeToParcel(Parcel parcel, int i) {
        f.a(this, parcel, i);
    }
}
