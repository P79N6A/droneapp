package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import java.util.ArrayList;

public class n implements Creator<IsReadyToPayRequest> {
    static void a(IsReadyToPayRequest isReadyToPayRequest, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, isReadyToPayRequest.a());
        b.a(parcel, 2, isReadyToPayRequest.b, false);
        b.a(parcel, a);
    }

    public IsReadyToPayRequest a(Parcel parcel) {
        int b = a.b(parcel);
        int i = 0;
        ArrayList arrayList = null;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i = a.g(parcel, a);
                    break;
                case 2:
                    arrayList = a.D(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new IsReadyToPayRequest(i, arrayList);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public IsReadyToPayRequest[] a(int i) {
        return new IsReadyToPayRequest[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
