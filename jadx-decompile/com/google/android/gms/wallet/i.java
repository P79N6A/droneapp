package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class i implements Creator<CreateWalletObjectsRequest> {
    static void a(CreateWalletObjectsRequest createWalletObjectsRequest, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, createWalletObjectsRequest.a());
        b.a(parcel, 2, createWalletObjectsRequest.a, i, false);
        b.a(parcel, 3, createWalletObjectsRequest.b, i, false);
        b.a(parcel, 4, createWalletObjectsRequest.c, i, false);
        b.a(parcel, a);
    }

    public CreateWalletObjectsRequest a(Parcel parcel) {
        GiftCardWalletObject giftCardWalletObject = null;
        int b = a.b(parcel);
        int i = 0;
        OfferWalletObject offerWalletObject = null;
        LoyaltyWalletObject loyaltyWalletObject = null;
        while (parcel.dataPosition() < b) {
            OfferWalletObject offerWalletObject2;
            LoyaltyWalletObject loyaltyWalletObject2;
            int g;
            GiftCardWalletObject giftCardWalletObject2;
            int a = a.a(parcel);
            GiftCardWalletObject giftCardWalletObject3;
            switch (a.a(a)) {
                case 1:
                    giftCardWalletObject3 = giftCardWalletObject;
                    offerWalletObject2 = offerWalletObject;
                    loyaltyWalletObject2 = loyaltyWalletObject;
                    g = a.g(parcel, a);
                    giftCardWalletObject2 = giftCardWalletObject3;
                    break;
                case 2:
                    g = i;
                    OfferWalletObject offerWalletObject3 = offerWalletObject;
                    loyaltyWalletObject2 = (LoyaltyWalletObject) a.a(parcel, a, LoyaltyWalletObject.CREATOR);
                    giftCardWalletObject2 = giftCardWalletObject;
                    offerWalletObject2 = offerWalletObject3;
                    break;
                case 3:
                    loyaltyWalletObject2 = loyaltyWalletObject;
                    g = i;
                    giftCardWalletObject3 = giftCardWalletObject;
                    offerWalletObject2 = (OfferWalletObject) a.a(parcel, a, OfferWalletObject.CREATOR);
                    giftCardWalletObject2 = giftCardWalletObject3;
                    break;
                case 4:
                    giftCardWalletObject2 = (GiftCardWalletObject) a.a(parcel, a, GiftCardWalletObject.CREATOR);
                    offerWalletObject2 = offerWalletObject;
                    loyaltyWalletObject2 = loyaltyWalletObject;
                    g = i;
                    break;
                default:
                    a.b(parcel, a);
                    giftCardWalletObject2 = giftCardWalletObject;
                    offerWalletObject2 = offerWalletObject;
                    loyaltyWalletObject2 = loyaltyWalletObject;
                    g = i;
                    break;
            }
            i = g;
            loyaltyWalletObject = loyaltyWalletObject2;
            offerWalletObject = offerWalletObject2;
            giftCardWalletObject = giftCardWalletObject2;
        }
        if (parcel.dataPosition() == b) {
            return new CreateWalletObjectsRequest(i, loyaltyWalletObject, offerWalletObject, giftCardWalletObject);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public CreateWalletObjectsRequest[] a(int i) {
        return new CreateWalletObjectsRequest[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
