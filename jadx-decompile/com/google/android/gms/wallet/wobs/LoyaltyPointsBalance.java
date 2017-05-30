package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class LoyaltyPointsBalance extends AbstractSafeParcelable {
    public static final Creator<LoyaltyPointsBalance> CREATOR = new d();
    int a;
    String b;
    double c;
    String d;
    long e;
    int f;
    private final int g;

    LoyaltyPointsBalance() {
        this.g = 1;
        this.f = -1;
        this.a = -1;
        this.c = -1.0d;
    }

    LoyaltyPointsBalance(int i, int i2, String str, double d, String str2, long j, int i3) {
        this.g = i;
        this.a = i2;
        this.b = str;
        this.c = d;
        this.d = str2;
        this.e = j;
        this.f = i3;
    }

    public int a() {
        return this.g;
    }

    public void writeToParcel(Parcel parcel, int i) {
        d.a(this, parcel, i);
    }
}
