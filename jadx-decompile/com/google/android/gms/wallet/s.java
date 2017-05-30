package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class s implements Creator<NotifyTransactionStatusRequest> {
    static void a(NotifyTransactionStatusRequest notifyTransactionStatusRequest, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, notifyTransactionStatusRequest.a);
        b.a(parcel, 2, notifyTransactionStatusRequest.b, false);
        b.a(parcel, 3, notifyTransactionStatusRequest.c);
        b.a(parcel, 4, notifyTransactionStatusRequest.d, false);
        b.a(parcel, a);
    }

    public NotifyTransactionStatusRequest a(Parcel parcel) {
        String str = null;
        int i = 0;
        int b = a.b(parcel);
        String str2 = null;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i2 = a.g(parcel, a);
                    break;
                case 2:
                    str2 = a.q(parcel, a);
                    break;
                case 3:
                    i = a.g(parcel, a);
                    break;
                case 4:
                    str = a.q(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new NotifyTransactionStatusRequest(i2, str2, i, str);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public NotifyTransactionStatusRequest[] a(int i) {
        return new NotifyTransactionStatusRequest[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
