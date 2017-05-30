package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.drive.DriveId;

public class aj implements Creator<OpenContentsRequest> {
    static void a(OpenContentsRequest openContentsRequest, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, openContentsRequest.a);
        b.a(parcel, 2, openContentsRequest.b, i, false);
        b.a(parcel, 3, openContentsRequest.c);
        b.a(parcel, 4, openContentsRequest.d);
        b.a(parcel, a);
    }

    public OpenContentsRequest a(Parcel parcel) {
        int i = 0;
        int b = a.b(parcel);
        DriveId driveId = null;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < b) {
            DriveId driveId2;
            int g;
            int a = a.a(parcel);
            int i4;
            switch (a.a(a)) {
                case 1:
                    i4 = i;
                    i = i2;
                    driveId2 = driveId;
                    g = a.g(parcel, a);
                    a = i4;
                    break;
                case 2:
                    g = i3;
                    i4 = i2;
                    driveId2 = (DriveId) a.a(parcel, a, DriveId.CREATOR);
                    a = i;
                    i = i4;
                    break;
                case 3:
                    driveId2 = driveId;
                    g = i3;
                    i4 = i;
                    i = a.g(parcel, a);
                    a = i4;
                    break;
                case 4:
                    a = a.g(parcel, a);
                    i = i2;
                    driveId2 = driveId;
                    g = i3;
                    break;
                default:
                    a.b(parcel, a);
                    a = i;
                    i = i2;
                    driveId2 = driveId;
                    g = i3;
                    break;
            }
            i3 = g;
            driveId = driveId2;
            i2 = i;
            i = a;
        }
        if (parcel.dataPosition() == b) {
            return new OpenContentsRequest(i3, driveId, i2, i);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public OpenContentsRequest[] a(int i) {
        return new OpenContentsRequest[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
