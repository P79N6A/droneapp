package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.drive.DriveId;
import java.util.ArrayList;
import java.util.List;

public class as implements Creator<SetResourceParentsRequest> {
    static void a(SetResourceParentsRequest setResourceParentsRequest, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, setResourceParentsRequest.a);
        b.a(parcel, 2, setResourceParentsRequest.b, i, false);
        b.c(parcel, 3, setResourceParentsRequest.c, false);
        b.a(parcel, a);
    }

    public SetResourceParentsRequest a(Parcel parcel) {
        List list = null;
        int b = a.b(parcel);
        int i = 0;
        DriveId driveId = null;
        while (parcel.dataPosition() < b) {
            DriveId driveId2;
            int g;
            ArrayList c;
            int a = a.a(parcel);
            List list2;
            switch (a.a(a)) {
                case 1:
                    List list3 = list;
                    driveId2 = driveId;
                    g = a.g(parcel, a);
                    list2 = list3;
                    break;
                case 2:
                    g = i;
                    DriveId driveId3 = (DriveId) a.a(parcel, a, DriveId.CREATOR);
                    list2 = list;
                    driveId2 = driveId3;
                    break;
                case 3:
                    c = a.c(parcel, a, DriveId.CREATOR);
                    driveId2 = driveId;
                    g = i;
                    break;
                default:
                    a.b(parcel, a);
                    c = list;
                    driveId2 = driveId;
                    g = i;
                    break;
            }
            i = g;
            driveId = driveId2;
            Object obj = c;
        }
        if (parcel.dataPosition() == b) {
            return new SetResourceParentsRequest(i, driveId, list);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public SetResourceParentsRequest[] a(int i) {
        return new SetResourceParentsRequest[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
