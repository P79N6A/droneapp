package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.drive.ChangeSequenceNumber;
import com.google.android.gms.drive.DriveSpace;
import java.util.List;

public class i implements Creator<GetChangesRequest> {
    static void a(GetChangesRequest getChangesRequest, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, getChangesRequest.a);
        b.a(parcel, 2, getChangesRequest.b, i, false);
        b.a(parcel, 3, getChangesRequest.c);
        b.c(parcel, 4, getChangesRequest.d, false);
        b.a(parcel, 5, getChangesRequest.e);
        b.a(parcel, a);
    }

    public GetChangesRequest a(Parcel parcel) {
        List list = null;
        boolean z = false;
        int b = a.b(parcel);
        int i = 0;
        ChangeSequenceNumber changeSequenceNumber = null;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i2 = a.g(parcel, a);
                    break;
                case 2:
                    changeSequenceNumber = (ChangeSequenceNumber) a.a(parcel, a, ChangeSequenceNumber.CREATOR);
                    break;
                case 3:
                    i = a.g(parcel, a);
                    break;
                case 4:
                    list = a.c(parcel, a, DriveSpace.CREATOR);
                    break;
                case 5:
                    z = a.c(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new GetChangesRequest(i2, changeSequenceNumber, i, list, z);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public GetChangesRequest[] a(int i) {
        return new GetChangesRequest[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
