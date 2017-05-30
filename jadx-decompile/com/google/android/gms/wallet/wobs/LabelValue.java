package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class LabelValue extends AbstractSafeParcelable {
    public static final Creator<LabelValue> CREATOR = new b();
    String a;
    String b;
    private final int c;

    LabelValue() {
        this.c = 1;
    }

    LabelValue(int i, String str, String str2) {
        this.c = i;
        this.a = str;
        this.b = str2;
    }

    public int a() {
        return this.c;
    }

    public void writeToParcel(Parcel parcel, int i) {
        b.a(this, parcel, i);
    }
}
