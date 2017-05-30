package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class InstrumentInfo extends AbstractSafeParcelable {
    public static final Creator<InstrumentInfo> CREATOR = new m();
    private final int a;
    private String b;
    private String c;

    InstrumentInfo(int i, String str, String str2) {
        this.a = i;
        this.b = str;
        this.c = str2;
    }

    public int a() {
        return this.a;
    }

    public String b() {
        return this.b;
    }

    public String c() {
        return this.c;
    }

    public void writeToParcel(Parcel parcel, int i) {
        m.a(this, parcel, i);
    }
}
