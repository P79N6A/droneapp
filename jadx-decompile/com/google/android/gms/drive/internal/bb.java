package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.drive.DriveId;

public class bb implements Creator<AuthorizeAccessRequest> {
    static void a(AuthorizeAccessRequest authorizeAccessRequest, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, authorizeAccessRequest.a);
        b.a(parcel, 2, authorizeAccessRequest.b);
        b.a(parcel, 3, authorizeAccessRequest.c, i, false);
        b.a(parcel, a);
    }

    public AuthorizeAccessRequest a(Parcel parcel) {
        int b = a.b(parcel);
        int i = 0;
        long j = 0;
        DriveId driveId = null;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i = a.g(parcel, a);
                    break;
                case 2:
                    j = a.i(parcel, a);
                    break;
                case 3:
                    driveId = (DriveId) a.a(parcel, a, DriveId.CREATOR);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new AuthorizeAccessRequest(i, j, driveId);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public AuthorizeAccessRequest[] a(int i) {
        return new AuthorizeAccessRequest[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
