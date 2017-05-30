package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class j implements Creator<UsageInfo> {
    static void a(UsageInfo usageInfo, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, usageInfo.b, i, false);
        b.a(parcel, 2, usageInfo.c);
        b.a(parcel, 3, usageInfo.d);
        b.a(parcel, 4, usageInfo.e, false);
        b.a(parcel, 5, usageInfo.f, i, false);
        b.a(parcel, 6, usageInfo.g);
        b.a(parcel, 7, usageInfo.h);
        b.a(parcel, 1000, usageInfo.a);
        b.a(parcel, 8, usageInfo.i);
        b.a(parcel, a);
    }

    public UsageInfo a(Parcel parcel) {
        DocumentContents documentContents = null;
        int i = 0;
        int b = a.b(parcel);
        long j = 0;
        int i2 = -1;
        boolean z = false;
        String str = null;
        int i3 = 0;
        DocumentId documentId = null;
        int i4 = 0;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    documentId = (DocumentId) a.a(parcel, a, DocumentId.CREATOR);
                    break;
                case 2:
                    j = a.i(parcel, a);
                    break;
                case 3:
                    i3 = a.g(parcel, a);
                    break;
                case 4:
                    str = a.q(parcel, a);
                    break;
                case 5:
                    documentContents = (DocumentContents) a.a(parcel, a, DocumentContents.CREATOR);
                    break;
                case 6:
                    z = a.c(parcel, a);
                    break;
                case 7:
                    i2 = a.g(parcel, a);
                    break;
                case 8:
                    i = a.g(parcel, a);
                    break;
                case 1000:
                    i4 = a.g(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new UsageInfo(i4, documentId, j, i3, str, documentContents, z, i2, i);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public UsageInfo[] a(int i) {
        return new UsageInfo[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
