package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class u implements Creator<PaymentMethodToken> {
    static void a(PaymentMethodToken paymentMethodToken, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, paymentMethodToken.a());
        b.a(parcel, 2, paymentMethodToken.a);
        b.a(parcel, 3, paymentMethodToken.b, false);
        b.a(parcel, a);
    }

    public PaymentMethodToken a(Parcel parcel) {
        int i = 0;
        int b = a.b(parcel);
        String str = null;
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
                    str = a.q(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new PaymentMethodToken(i2, i, str);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public PaymentMethodToken[] a(int i) {
        return new PaymentMethodToken[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
