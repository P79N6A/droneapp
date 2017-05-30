package com.google.android.gms.safetynet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class g implements Creator<SafeBrowsingData> {
    static void a(SafeBrowsingData safeBrowsingData, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, safeBrowsingData.a);
        b.a(parcel, 2, safeBrowsingData.a(), false);
        b.a(parcel, 3, safeBrowsingData.b(), i, false);
        b.a(parcel, a);
    }

    public SafeBrowsingData a(Parcel parcel) {
        DataHolder dataHolder = null;
        int b = a.b(parcel);
        int i = 0;
        String str = null;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i = a.g(parcel, a);
                    break;
                case 2:
                    str = a.q(parcel, a);
                    break;
                case 3:
                    dataHolder = (DataHolder) a.a(parcel, a, DataHolder.CREATOR);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new SafeBrowsingData(i, str, dataHolder);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public SafeBrowsingData[] a(int i) {
        return new SafeBrowsingData[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
