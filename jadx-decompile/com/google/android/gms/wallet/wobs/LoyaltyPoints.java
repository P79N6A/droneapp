package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class LoyaltyPoints extends AbstractSafeParcelable {
    public static final Creator<LoyaltyPoints> CREATOR = new e();
    String a;
    LoyaltyPointsBalance b;
    String c;
    TimeInterval d;
    private final int e;

    LoyaltyPoints() {
        this.e = 1;
    }

    LoyaltyPoints(int i, String str, LoyaltyPointsBalance loyaltyPointsBalance, String str2, TimeInterval timeInterval) {
        this.e = i;
        this.a = str;
        this.b = loyaltyPointsBalance;
        this.c = str2;
        this.d = timeInterval;
    }

    public int a() {
        return this.e;
    }

    public void writeToParcel(Parcel parcel, int i) {
        e.a(this, parcel, i);
    }
}
