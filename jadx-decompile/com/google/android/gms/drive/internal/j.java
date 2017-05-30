package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class j implements Creator<GetDriveIdFromUniqueIdentifierRequest> {
    static void a(GetDriveIdFromUniqueIdentifierRequest getDriveIdFromUniqueIdentifierRequest, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, getDriveIdFromUniqueIdentifierRequest.a);
        b.a(parcel, 2, getDriveIdFromUniqueIdentifierRequest.b, false);
        b.a(parcel, 3, getDriveIdFromUniqueIdentifierRequest.c);
        b.a(parcel, a);
    }

    public GetDriveIdFromUniqueIdentifierRequest a(Parcel parcel) {
        boolean z = false;
        int b = a.b(parcel);
        String str = null;
        int i = 0;
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
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new GetDriveIdFromUniqueIdentifierRequest(i, str, z);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public GetDriveIdFromUniqueIdentifierRequest[] a(int i) {
        return new GetDriveIdFromUniqueIdentifierRequest[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
