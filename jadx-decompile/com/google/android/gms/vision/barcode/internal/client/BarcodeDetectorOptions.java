package com.google.android.gms.vision.barcode.internal.client;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class BarcodeDetectorOptions extends AbstractSafeParcelable {
    public static final a CREATOR = new a();
    final int a;
    public int b;

    public BarcodeDetectorOptions() {
        this.a = 1;
    }

    public BarcodeDetectorOptions(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public void writeToParcel(Parcel parcel, int i) {
        a aVar = CREATOR;
        a.a(this, parcel, i);
    }
}
