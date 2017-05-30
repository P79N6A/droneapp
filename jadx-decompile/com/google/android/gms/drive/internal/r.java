package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.drive.DriveId;

public class r implements Creator<ListParentsRequest> {
    static void a(ListParentsRequest listParentsRequest, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, listParentsRequest.a);
        b.a(parcel, 2, listParentsRequest.b, i, false);
        b.a(parcel, a);
    }

    public ListParentsRequest a(Parcel parcel) {
        int b = a.b(parcel);
        int i = 0;
        DriveId driveId = null;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i = a.g(parcel, a);
                    break;
                case 2:
                    driveId = (DriveId) a.a(parcel, a, DriveId.CREATOR);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new ListParentsRequest(i, driveId);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public ListParentsRequest[] a(int i) {
        return new ListParentsRequest[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
