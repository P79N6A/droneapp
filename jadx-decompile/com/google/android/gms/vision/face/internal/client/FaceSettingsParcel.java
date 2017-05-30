package com.google.android.gms.vision.face.internal.client;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class FaceSettingsParcel extends AbstractSafeParcelable {
    public static final c CREATOR = new c();
    public final int a;
    public int b;
    public int c;
    public int d;
    public boolean e;
    public boolean f;
    public float g;

    public FaceSettingsParcel() {
        this.a = 2;
    }

    public FaceSettingsParcel(int i, int i2, int i3, int i4, boolean z, boolean z2, float f) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = z;
        this.f = z2;
        this.g = f;
    }

    public void writeToParcel(Parcel parcel, int i) {
        c.a(this, parcel, i);
    }
}
