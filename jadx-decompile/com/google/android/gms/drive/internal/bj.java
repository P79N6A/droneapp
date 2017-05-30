package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.drive.e;

public class bj implements Creator<CreateContentsRequest> {
    static void a(CreateContentsRequest createContentsRequest, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, createContentsRequest.a);
        b.a(parcel, 2, createContentsRequest.b);
        b.a(parcel, a);
    }

    public CreateContentsRequest a(Parcel parcel) {
        int b = a.b(parcel);
        int i = 0;
        int i2 = e.c;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i = a.g(parcel, a);
                    break;
                case 2:
                    i2 = a.g(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new CreateContentsRequest(i, i2);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public CreateContentsRequest[] a(int i) {
        return new CreateContentsRequest[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
