package com.google.android.gms.drive.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class e implements Creator<DriveServiceResponse> {
    static void a(DriveServiceResponse driveServiceResponse, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, driveServiceResponse.a);
        b.a(parcel, 2, driveServiceResponse.b, false);
        b.a(parcel, a);
    }

    public DriveServiceResponse a(Parcel parcel) {
        int b = a.b(parcel);
        int i = 0;
        IBinder iBinder = null;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i = a.g(parcel, a);
                    break;
                case 2:
                    iBinder = a.r(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new DriveServiceResponse(i, iBinder);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public DriveServiceResponse[] a(int i) {
        return new DriveServiceResponse[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
