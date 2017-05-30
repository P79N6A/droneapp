package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class PaymentMethodToken extends AbstractSafeParcelable {
    public static final Creator<PaymentMethodToken> CREATOR = new u();
    int a;
    String b;
    private final int c;

    private PaymentMethodToken() {
        this.c = 1;
    }

    PaymentMethodToken(int i, int i2, String str) {
        this.c = i;
        this.a = i2;
        this.b = str;
    }

    public int a() {
        return this.c;
    }

    public int b() {
        return this.a;
    }

    public String c() {
        return this.b;
    }

    public void writeToParcel(Parcel parcel, int i) {
        u.a(this, parcel, i);
    }
}
