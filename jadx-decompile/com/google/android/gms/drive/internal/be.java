package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.drive.DriveId;
import java.util.ArrayList;
import java.util.List;

public class be implements Creator<ChangeResourceParentsRequest> {
    static void a(ChangeResourceParentsRequest changeResourceParentsRequest, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, changeResourceParentsRequest.a);
        b.a(parcel, 2, changeResourceParentsRequest.b, i, false);
        b.c(parcel, 3, changeResourceParentsRequest.c, false);
        b.c(parcel, 4, changeResourceParentsRequest.d, false);
        b.a(parcel, a);
    }

    public ChangeResourceParentsRequest a(Parcel parcel) {
        List list = null;
        int b = a.b(parcel);
        int i = 0;
        List list2 = null;
        DriveId driveId = null;
        while (parcel.dataPosition() < b) {
            DriveId driveId2;
            int g;
            Object c;
            ArrayList c2;
            int a = a.a(parcel);
            List list3;
            List list4;
            switch (a.a(a)) {
                case 1:
                    list3 = list;
                    list = list2;
                    driveId2 = driveId;
                    g = a.g(parcel, a);
                    list4 = list3;
                    break;
                case 2:
                    g = i;
                    list3 = list2;
                    driveId2 = (DriveId) a.a(parcel, a, DriveId.CREATOR);
                    list4 = list;
                    list = list3;
                    break;
                case 3:
                    driveId2 = driveId;
                    g = i;
                    list3 = list;
                    c = a.c(parcel, a, DriveId.CREATOR);
                    list4 = list3;
                    break;
                case 4:
                    c2 = a.c(parcel, a, DriveId.CREATOR);
                    list = list2;
                    driveId2 = driveId;
                    g = i;
                    break;
                default:
                    a.b(parcel, a);
                    c2 = list;
                    list = list2;
                    driveId2 = driveId;
                    g = i;
                    break;
            }
            i = g;
            driveId = driveId2;
            list2 = list;
            c = c2;
        }
        if (parcel.dataPosition() == b) {
            return new ChangeResourceParentsRequest(i, driveId, list2, list);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public ChangeResourceParentsRequest[] a(int i) {
        return new ChangeResourceParentsRequest[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
