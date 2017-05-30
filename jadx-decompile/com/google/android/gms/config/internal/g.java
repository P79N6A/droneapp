package com.google.android.gms.config.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import java.util.List;

public class g implements Creator<FetchConfigIpcRequest> {
    static void a(FetchConfigIpcRequest fetchConfigIpcRequest, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, fetchConfigIpcRequest.a);
        b.a(parcel, 2, fetchConfigIpcRequest.a(), false);
        b.a(parcel, 3, fetchConfigIpcRequest.b());
        b.a(parcel, 4, fetchConfigIpcRequest.c(), i, false);
        b.a(parcel, 5, fetchConfigIpcRequest.d(), false);
        b.a(parcel, 6, fetchConfigIpcRequest.e(), false);
        b.a(parcel, 7, fetchConfigIpcRequest.f(), false);
        b.b(parcel, 8, fetchConfigIpcRequest.g(), false);
        b.a(parcel, 9, fetchConfigIpcRequest.h());
        b.c(parcel, 10, fetchConfigIpcRequest.i(), false);
        b.a(parcel, a);
    }

    public FetchConfigIpcRequest a(Parcel parcel) {
        int i = 0;
        List list = null;
        int b = a.b(parcel);
        long j = 0;
        List list2 = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        DataHolder dataHolder = null;
        String str4 = null;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i2 = a.g(parcel, a);
                    break;
                case 2:
                    str4 = a.q(parcel, a);
                    break;
                case 3:
                    j = a.i(parcel, a);
                    break;
                case 4:
                    dataHolder = (DataHolder) a.a(parcel, a, DataHolder.CREATOR);
                    break;
                case 5:
                    str3 = a.q(parcel, a);
                    break;
                case 6:
                    str2 = a.q(parcel, a);
                    break;
                case 7:
                    str = a.q(parcel, a);
                    break;
                case 8:
                    list2 = a.E(parcel, a);
                    break;
                case 9:
                    i = a.g(parcel, a);
                    break;
                case 10:
                    list = a.c(parcel, a, AnalyticsUserProperty.CREATOR);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new FetchConfigIpcRequest(i2, str4, j, dataHolder, str3, str2, str, list2, i, list);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public FetchConfigIpcRequest[] a(int i) {
        return new FetchConfigIpcRequest[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
