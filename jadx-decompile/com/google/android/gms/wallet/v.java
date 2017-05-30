package com.google.android.gms.wallet;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class v implements Creator<PaymentMethodTokenizationParameters> {
    static void a(PaymentMethodTokenizationParameters paymentMethodTokenizationParameters, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, paymentMethodTokenizationParameters.b());
        b.a(parcel, 2, paymentMethodTokenizationParameters.a);
        b.a(parcel, 3, paymentMethodTokenizationParameters.b, false);
        b.a(parcel, a);
    }

    public PaymentMethodTokenizationParameters a(Parcel parcel) {
        int i = 0;
        int b = a.b(parcel);
        Bundle bundle = null;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i2 = a.g(parcel, a);
                    break;
                case 2:
                    i = a.g(parcel, a);
                    break;
                case 3:
                    bundle = a.s(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new PaymentMethodTokenizationParameters(i2, i, bundle);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public PaymentMethodTokenizationParameters[] a(int i) {
        return new PaymentMethodTokenizationParameters[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
