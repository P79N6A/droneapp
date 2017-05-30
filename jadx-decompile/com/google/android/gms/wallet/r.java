package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.identity.intents.model.CountrySpecification;
import java.util.ArrayList;

public class r implements Creator<MaskedWalletRequest> {
    static void a(MaskedWalletRequest maskedWalletRequest, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, maskedWalletRequest.b());
        b.a(parcel, 2, maskedWalletRequest.a, false);
        b.a(parcel, 3, maskedWalletRequest.b);
        b.a(parcel, 4, maskedWalletRequest.c);
        b.a(parcel, 5, maskedWalletRequest.d);
        b.a(parcel, 6, maskedWalletRequest.e, false);
        b.a(parcel, 7, maskedWalletRequest.f, false);
        b.a(parcel, 8, maskedWalletRequest.g, false);
        b.a(parcel, 9, maskedWalletRequest.h, i, false);
        b.a(parcel, 10, maskedWalletRequest.i);
        b.a(parcel, 11, maskedWalletRequest.j);
        b.a(parcel, 12, maskedWalletRequest.k, i, false);
        b.a(parcel, 13, maskedWalletRequest.l);
        b.a(parcel, 14, maskedWalletRequest.m);
        b.c(parcel, 15, maskedWalletRequest.n, false);
        b.a(parcel, 16, maskedWalletRequest.o, i, false);
        b.a(parcel, 17, maskedWalletRequest.p, false);
        b.a(parcel, 18, maskedWalletRequest.q, false);
        b.a(parcel, a);
    }

    public MaskedWalletRequest a(Parcel parcel) {
        int b = a.b(parcel);
        int i = 0;
        String str = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Cart cart = null;
        boolean z4 = false;
        boolean z5 = false;
        CountrySpecification[] countrySpecificationArr = null;
        boolean z6 = true;
        boolean z7 = true;
        ArrayList arrayList = null;
        PaymentMethodTokenizationParameters paymentMethodTokenizationParameters = null;
        ArrayList arrayList2 = null;
        String str5 = null;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i = a.g(parcel, a);
                    break;
                case 2:
                    str = a.q(parcel, a);
                    break;
                case 3:
                    z = a.c(parcel, a);
                    break;
                case 4:
                    z2 = a.c(parcel, a);
                    break;
                case 5:
                    z3 = a.c(parcel, a);
                    break;
                case 6:
                    str2 = a.q(parcel, a);
                    break;
                case 7:
                    str3 = a.q(parcel, a);
                    break;
                case 8:
                    str4 = a.q(parcel, a);
                    break;
                case 9:
                    cart = (Cart) a.a(parcel, a, Cart.CREATOR);
                    break;
                case 10:
                    z4 = a.c(parcel, a);
                    break;
                case 11:
                    z5 = a.c(parcel, a);
                    break;
                case 12:
                    countrySpecificationArr = (CountrySpecification[]) a.b(parcel, a, CountrySpecification.CREATOR);
                    break;
                case 13:
                    z6 = a.c(parcel, a);
                    break;
                case 14:
                    z7 = a.c(parcel, a);
                    break;
                case 15:
                    arrayList = a.c(parcel, a, CountrySpecification.CREATOR);
                    break;
                case 16:
                    paymentMethodTokenizationParameters = (PaymentMethodTokenizationParameters) a.a(parcel, a, PaymentMethodTokenizationParameters.CREATOR);
                    break;
                case 17:
                    arrayList2 = a.D(parcel, a);
                    break;
                case 18:
                    str5 = a.q(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new MaskedWalletRequest(i, str, z, z2, z3, str2, str3, str4, cart, z4, z5, countrySpecificationArr, z6, z7, arrayList, paymentMethodTokenizationParameters, arrayList2, str5);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public MaskedWalletRequest[] a(int i) {
        return new MaskedWalletRequest[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
