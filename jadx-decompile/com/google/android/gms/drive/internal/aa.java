package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class aa implements Creator<OnListEntriesResponse> {
    static void a(OnListEntriesResponse onListEntriesResponse, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, onListEntriesResponse.a);
        b.a(parcel, 2, onListEntriesResponse.b, i, false);
        b.a(parcel, 3, onListEntriesResponse.c);
        b.a(parcel, a);
    }

    public OnListEntriesResponse a(Parcel parcel) {
        boolean z = false;
        int b = a.b(parcel);
        DataHolder dataHolder = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            DataHolder dataHolder2;
            int g;
            boolean z2;
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    boolean z3 = z;
                    dataHolder2 = dataHolder;
                    g = a.g(parcel, a);
                    z2 = z3;
                    break;
                case 2:
                    g = i;
                    DataHolder dataHolder3 = (DataHolder) a.a(parcel, a, DataHolder.CREATOR);
                    z2 = z;
                    dataHolder2 = dataHolder3;
                    break;
                case 3:
                    z2 = a.c(parcel, a);
                    dataHolder2 = dataHolder;
                    g = i;
                    break;
                default:
                    a.b(parcel, a);
                    z2 = z;
                    dataHolder2 = dataHolder;
                    g = i;
                    break;
            }
            i = g;
            dataHolder = dataHolder2;
            z = z2;
        }
        if (parcel.dataPosition() == b) {
            return new OnListEntriesResponse(i, dataHolder, z);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public OnListEntriesResponse[] a(int i) {
        return new OnListEntriesResponse[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
