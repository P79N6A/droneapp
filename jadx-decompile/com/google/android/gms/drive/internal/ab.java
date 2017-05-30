package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.Permission;

public class ab implements Creator<AddPermissionRequest> {
    static void a(AddPermissionRequest addPermissionRequest, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, addPermissionRequest.a);
        b.a(parcel, 2, addPermissionRequest.b, i, false);
        b.a(parcel, 3, addPermissionRequest.c, i, false);
        b.a(parcel, 4, addPermissionRequest.d);
        b.a(parcel, 5, addPermissionRequest.e, false);
        b.a(parcel, 6, addPermissionRequest.f);
        b.a(parcel, 7, addPermissionRequest.g, false);
        b.a(parcel, a);
    }

    public AddPermissionRequest a(Parcel parcel) {
        boolean z = false;
        String str = null;
        int b = a.b(parcel);
        String str2 = null;
        boolean z2 = false;
        Permission permission = null;
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
                    permission = (Permission) a.a(parcel, a, Permission.CREATOR);
                    break;
                case 4:
                    z2 = a.c(parcel, a);
                    break;
                case 5:
                    str2 = a.q(parcel, a);
                    break;
                case 6:
                    z = a.c(parcel, a);
                    break;
                case 7:
                    str = a.q(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new AddPermissionRequest(i, driveId, permission, z2, str2, z, str);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public AddPermissionRequest[] a(int i) {
        return new AddPermissionRequest[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
