package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.drive.DriveId;

public class k implements Creator<GetMetadataRequest> {
    static void a(GetMetadataRequest getMetadataRequest, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, getMetadataRequest.a);
        b.a(parcel, 2, getMetadataRequest.b, i, false);
        b.a(parcel, 3, getMetadataRequest.c);
        b.a(parcel, a);
    }

    public GetMetadataRequest a(Parcel parcel) {
        boolean z = false;
        int b = a.b(parcel);
        DriveId driveId = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            DriveId driveId2;
            int g;
            boolean z2;
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    boolean z3 = z;
                    driveId2 = driveId;
                    g = a.g(parcel, a);
                    z2 = z3;
                    break;
                case 2:
                    g = i;
                    DriveId driveId3 = (DriveId) a.a(parcel, a, DriveId.CREATOR);
                    z2 = z;
                    driveId2 = driveId3;
                    break;
                case 3:
                    z2 = a.c(parcel, a);
                    driveId2 = driveId;
                    g = i;
                    break;
                default:
                    a.b(parcel, a);
                    z2 = z;
                    driveId2 = driveId;
                    g = i;
                    break;
            }
            i = g;
            driveId = driveId2;
            z = z2;
        }
        if (parcel.dataPosition() == b) {
            return new GetMetadataRequest(i, driveId, z);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public GetMetadataRequest[] a(int i) {
        return new GetMetadataRequest[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
