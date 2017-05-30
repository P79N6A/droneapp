package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.drive.DriveId;

public class ap implements Creator<RemovePermissionRequest> {
    static void a(RemovePermissionRequest removePermissionRequest, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, removePermissionRequest.a);
        b.a(parcel, 2, removePermissionRequest.b, i, false);
        b.a(parcel, 3, removePermissionRequest.c, false);
        b.a(parcel, 4, removePermissionRequest.d);
        b.a(parcel, 5, removePermissionRequest.e, false);
        b.a(parcel, a);
    }

    public RemovePermissionRequest a(Parcel parcel) {
        boolean z = false;
        String str = null;
        int b = a.b(parcel);
        String str2 = null;
        DriveId driveId = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i = a.g(parcel, a);
                    break;
                case 2:
                    driveId = (DriveId) a.a(parcel, a, DriveId.CREATOR);
                    break;
                case 3:
                    str2 = a.q(parcel, a);
                    break;
                case 4:
                    z = a.c(parcel, a);
                    break;
                case 5:
                    str = a.q(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new RemovePermissionRequest(i, driveId, str2, z, str);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public RemovePermissionRequest[] a(int i) {
        return new RemovePermissionRequest[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
