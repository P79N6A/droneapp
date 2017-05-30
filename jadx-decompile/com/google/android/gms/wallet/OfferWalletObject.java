package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.wallet.wobs.CommonWalletObject;

public final class OfferWalletObject extends AbstractSafeParcelable {
    public static final Creator<OfferWalletObject> CREATOR = new t();
    String a;
    String b;
    CommonWalletObject c;
    private final int d;

    OfferWalletObject() {
        this.d = 3;
    }

    OfferWalletObject(int i, String str, String str2, CommonWalletObject commonWalletObject) {
        this.d = i;
        this.b = str2;
        if (i < 3) {
            this.c = CommonWalletObject.a().a(str).a();
        } else {
            this.c = commonWalletObject;
        }
    }

    public int a() {
        return this.d;
    }

    public String b() {
        return this.c.c();
    }

    public String c() {
        return this.b;
    }

    public void writeToParcel(Parcel parcel, int i) {
        t.a(this, parcel, i);
    }
}
