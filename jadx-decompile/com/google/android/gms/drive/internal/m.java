package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.drive.Permission;
import java.util.List;

public class m implements Creator<GetPermissionsResponse> {
    static void a(GetPermissionsResponse getPermissionsResponse, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, getPermissionsResponse.a);
        b.c(parcel, 2, getPermissionsResponse.b, false);
        b.a(parcel, 3, getPermissionsResponse.c);
        b.a(parcel, a);
    }

    public GetPermissionsResponse a(Parcel parcel) {
        int i = 0;
        int b = a.b(parcel);
        List list = null;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i2 = a.g(parcel, a);
                    break;
                case 2:
                    list = a.c(parcel, a, Permission.CREATOR);
                    break;
                case 3:
                    i = a.g(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new GetPermissionsResponse(i2, list, i);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public GetPermissionsResponse[] a(int i) {
        return new GetPermissionsResponse[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
