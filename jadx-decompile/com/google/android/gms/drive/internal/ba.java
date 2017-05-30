package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.drive.DriveId;

public class ba implements Creator<UpdatePermissionRequest> {
    static void a(UpdatePermissionRequest updatePermissionRequest, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, updatePermissionRequest.a);
        b.a(parcel, 2, updatePermissionRequest.b, i, false);
        b.a(parcel, 3, updatePermissionRequest.c, false);
        b.a(parcel, 4, updatePermissionRequest.d);
        b.a(parcel, 5, updatePermissionRequest.e);
        b.a(parcel, 6, updatePermissionRequest.f, false);
        b.a(parcel, a);
    }

    public UpdatePermissionRequest a(Parcel parcel) {
        String str = null;
        boolean z = false;
        int b = a.b(parcel);
        int i = 0;
        String str2 = null;
        DriveId driveId = null;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i2 = a.g(parcel, a);
                    break;
                case 2:
                    driveId = (DriveId) a.a(parcel, a, DriveId.CREATOR);
                    break;
                case 3:
                    str2 = a.q(parcel, a);
                    break;
                case 4:
                    i = a.g(parcel, a);
                    break;
                case 5:
                    z = a.c(parcel, a);
                    break;
                case 6:
                    str = a.q(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new UpdatePermissionRequest(i2, driveId, str2, i, z, str);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public UpdatePermissionRequest[] a(int i) {
        return new UpdatePermissionRequest[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
