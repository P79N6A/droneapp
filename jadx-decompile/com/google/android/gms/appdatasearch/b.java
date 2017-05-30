package com.google.android.gms.appdatasearch;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;

public class b implements Creator<DocumentContents> {
    static void a(DocumentContents documentContents, Parcel parcel, int i) {
        int a = com.google.android.gms.common.internal.safeparcel.b.a(parcel);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 1, documentContents.b, i, false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 2, documentContents.c, false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 3, documentContents.d);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 4, documentContents.e, i, false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 1000, documentContents.a);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, a);
    }

    public DocumentContents a(Parcel parcel) {
        boolean z = false;
        Account account = null;
        int b = a.b(parcel);
        String str = null;
        DocumentSection[] documentSectionArr = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    documentSectionArr = (DocumentSection[]) a.b(parcel, a, DocumentSection.CREATOR);
                    break;
                case 2:
                    str = a.q(parcel, a);
                    break;
                case 3:
                    z = a.c(parcel, a);
                    break;
                case 4:
                    account = (Account) a.a(parcel, a, Account.CREATOR);
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
            return new DocumentContents(i, documentSectionArr, str, z, account);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public DocumentContents[] a(int i) {
        return new DocumentContents[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
