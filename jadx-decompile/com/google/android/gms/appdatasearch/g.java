package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.appdatasearch.GetRecentContextCall.Response;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import java.util.List;

public class g implements Creator<Response> {
    static void a(Response response, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, response.a, i, false);
        b.c(parcel, 2, response.b, false);
        b.a(parcel, 3, response.c, false);
        b.a(parcel, 1000, response.d);
        b.a(parcel, a);
    }

    public Response a(Parcel parcel) {
        String[] strArr = null;
        int b = a.b(parcel);
        int i = 0;
        List list = null;
        Status status = null;
        while (parcel.dataPosition() < b) {
            int i2;
            Status status2;
            String[] strArr2;
            List list2;
            int a = a.a(parcel);
            String[] strArr3;
            switch (a.a(a)) {
                case 1:
                    i2 = i;
                    List list3 = list;
                    status2 = (Status) a.a(parcel, a, Status.CREATOR);
                    strArr2 = strArr;
                    list2 = list3;
                    break;
                case 2:
                    status2 = status;
                    i2 = i;
                    strArr3 = strArr;
                    Object c = a.c(parcel, a, UsageInfo.CREATOR);
                    strArr2 = strArr3;
                    break;
                case 3:
                    strArr2 = a.C(parcel, a);
                    list2 = list;
                    status2 = status;
                    i2 = i;
                    break;
                case 1000:
                    strArr3 = strArr;
                    list2 = list;
                    status2 = status;
                    i2 = a.g(parcel, a);
                    strArr2 = strArr3;
                    break;
                default:
                    a.b(parcel, a);
                    strArr2 = strArr;
                    list2 = list;
                    status2 = status;
                    i2 = i;
                    break;
            }
            i = i2;
            status = status2;
            list = list2;
            strArr = strArr2;
        }
        if (parcel.dataPosition() == b) {
            return new Response(i, status, list, strArr);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public Response[] a(int i) {
        return new Response[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
