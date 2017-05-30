package com.google.android.gms.vision.text.internal.client;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class SymbolBoxParcel extends AbstractSafeParcelable {
    public static final f CREATOR = new f();
    public final int a;

    public SymbolBoxParcel(int i) {
        this.a = i;
    }

    public void writeToParcel(Parcel parcel, int i) {
        f.a(this, parcel, i);
    }
}
