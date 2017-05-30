package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class c implements Creator<DocumentId> {
    static void a(DocumentId documentId, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, documentId.b, false);
        b.a(parcel, 2, documentId.c, false);
        b.a(parcel, 3, documentId.d, false);
        b.a(parcel, 1000, documentId.a);
        b.a(parcel, a);
    }

    public DocumentId a(Parcel parcel) {
        String str = null;
        int b = a.b(parcel);
        int i = 0;
        String str2 = null;
        String str3 = null;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    str3 = a.q(parcel, a);
                    break;
                case 2:
                    str2 = a.q(parcel, a);
                    break;
                case 3:
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
            return new DocumentId(i, str3, str2, str);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public DocumentId[] a(int i) {
        return new DocumentId[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
