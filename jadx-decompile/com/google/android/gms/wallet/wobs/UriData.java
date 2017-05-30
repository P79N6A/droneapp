package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class UriData extends AbstractSafeParcelable {
    public static final Creator<UriData> CREATOR = new h();
    String a;
    String b;
    private final int c;

    UriData() {
        this.c = 1;
    }

    UriData(int i, String str, String str2) {
        this.c = i;
        this.a = str;
        this.b = str2;
    }

    public int a() {
        return this.c;
    }

    public void writeToParcel(Parcel parcel, int i) {
        h.a(this, parcel, i);
    }
}
