package com.google.android.gms.vision.internal.client;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.vision.d;

public class FrameMetadataParcel extends AbstractSafeParcelable {
    public static final b CREATOR = new b();
    final int a;
    public int b;
    public int c;
    public int d;
    public long e;
    public int f;

    public FrameMetadataParcel() {
        this.a = 1;
    }

    public FrameMetadataParcel(int i, int i2, int i3, int i4, long j, int i5) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = j;
        this.f = i5;
    }

    public static FrameMetadataParcel a(d dVar) {
        FrameMetadataParcel frameMetadataParcel = new FrameMetadataParcel();
        frameMetadataParcel.b = dVar.a().a();
        frameMetadataParcel.c = dVar.a().b();
        frameMetadataParcel.f = dVar.a().e();
        frameMetadataParcel.d = dVar.a().c();
        frameMetadataParcel.e = dVar.a().d();
        return frameMetadataParcel;
    }

    public void writeToParcel(Parcel parcel, int i) {
        b bVar = CREATOR;
        b.a(this, parcel, i);
    }
}
