package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class CreateWalletObjectsRequest extends AbstractSafeParcelable {
    public static final Creator<CreateWalletObjectsRequest> CREATOR = new i();
    LoyaltyWalletObject a;
    OfferWalletObject b;
    GiftCardWalletObject c;
    private final int d;

    CreateWalletObjectsRequest() {
        this.d = 3;
    }

    CreateWalletObjectsRequest(int i, LoyaltyWalletObject loyaltyWalletObject, OfferWalletObject offerWalletObject, GiftCardWalletObject giftCardWalletObject) {
        this.d = i;
        this.a = loyaltyWalletObject;
        this.b = offerWalletObject;
        this.c = giftCardWalletObject;
    }

    public int a() {
        return this.d;
    }

    public void writeToParcel(Parcel parcel, int i) {
        i.a(this, parcel, i);
    }
}
