package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class o implements Creator<GetCloudSyncSettingResponse> {
    static void a(GetCloudSyncSettingResponse getCloudSyncSettingResponse, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, getCloudSyncSettingResponse.a);
        b.a(parcel, 2, getCloudSyncSettingResponse.b);
        b.a(parcel, 3, getCloudSyncSettingResponse.c);
        b.a(parcel, a);
    }

    public GetCloudSyncSettingResponse a(Parcel parcel) {
        boolean z = false;
        int b = a.b(parcel);
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i2 = a.g(parcel, a);
                    break;
                case 2:
                    i = a.g(parcel, a);
                    break;
                case 3:
                    z = a.c(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new GetCloudSyncSettingResponse(i2, i, z);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public GetCloudSyncSettingResponse[] a(int i) {
        return new GetCloudSyncSettingResponse[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
