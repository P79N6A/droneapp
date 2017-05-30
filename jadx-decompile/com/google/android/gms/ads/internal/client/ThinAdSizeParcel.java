package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.internal.aaa;

@aaa
public class ThinAdSizeParcel extends AdSizeParcel {
    public ThinAdSizeParcel(AdSizeParcel adSizeParcel) {
        super(adSizeParcel.a, adSizeParcel.b, adSizeParcel.c, adSizeParcel.d, adSizeParcel.e, adSizeParcel.f, adSizeParcel.g, adSizeParcel.h, adSizeParcel.i, adSizeParcel.j, adSizeParcel.k);
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, this.a);
        b.a(parcel, 2, this.b, false);
        b.a(parcel, 3, this.c);
        b.a(parcel, 6, this.f);
        b.a(parcel, a);
    }
}
