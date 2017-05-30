package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import java.util.ArrayList;

public class g implements Creator<Cart> {
    static void a(Cart cart, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, cart.b());
        b.a(parcel, 2, cart.a, false);
        b.a(parcel, 3, cart.b, false);
        b.c(parcel, 4, cart.c, false);
        b.a(parcel, a);
    }

    public Cart a(Parcel parcel) {
        String str = null;
        int b = a.b(parcel);
        int i = 0;
        ArrayList arrayList = new ArrayList();
        String str2 = null;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i = a.g(parcel, a);
                    break;
                case 2:
                    str2 = a.q(parcel, a);
                    break;
                case 3:
                    str = a.q(parcel, a);
                    break;
                case 4:
                    arrayList = a.c(parcel, a, LineItem.CREATOR);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new Cart(i, str2, str, arrayList);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public Cart[] a(int i) {
        return new Cart[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
