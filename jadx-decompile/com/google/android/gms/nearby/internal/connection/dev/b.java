package com.google.android.gms.nearby.internal.connection.dev;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;

public class b implements Creator<RejectConnectionRequestParams> {
    static void a(RejectConnectionRequestParams rejectConnectionRequestParams, Parcel parcel, int i) {
        int a = com.google.android.gms.common.internal.safeparcel.b.a(parcel);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 1, rejectConnectionRequestParams.a(), false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 2, rejectConnectionRequestParams.b(), false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 1000, rejectConnectionRequestParams.a);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, a);
    }

    public RejectConnectionRequestParams a(Parcel parcel) {
        String str = null;
        int b = a.b(parcel);
        int i = 0;
        IBinder iBinder = null;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    iBinder = a.r(parcel, a);
                    break;
                case 2:
                    str = a.q(parcel, a);
                    break;
                case 1000:
                    i = a.g(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new RejectConnectionRequestParams(i, iBinder, str);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public RejectConnectionRequestParams[] a(int i) {
        return new RejectConnectionRequestParams[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
