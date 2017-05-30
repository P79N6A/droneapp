package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class d implements Creator<DocumentSection> {
    static void a(DocumentSection documentSection, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, documentSection.c, false);
        b.a(parcel, 3, documentSection.d, i, false);
        b.a(parcel, 4, documentSection.e);
        b.a(parcel, 5, documentSection.f, false);
        b.a(parcel, 1000, documentSection.b);
        b.a(parcel, a);
    }

    public DocumentSection a(Parcel parcel) {
        byte[] bArr = null;
        int b = a.b(parcel);
        int i = 0;
        int i2 = -1;
        RegisterSectionInfo registerSectionInfo = null;
        String str = null;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    str = a.q(parcel, a);
                    break;
                case 3:
                    registerSectionInfo = (RegisterSectionInfo) a.a(parcel, a, RegisterSectionInfo.CREATOR);
                    break;
                case 4:
                    i2 = a.g(parcel, a);
                    break;
                case 5:
                    bArr = a.t(parcel, a);
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
            return new DocumentSection(i, str, registerSectionInfo, i2, bArr);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public DocumentSection[] a(int i) {
        return new DocumentSection[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
