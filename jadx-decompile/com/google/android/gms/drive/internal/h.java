package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class h implements Creator<FileUploadPreferencesImpl> {
    static void a(FileUploadPreferencesImpl fileUploadPreferencesImpl, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, fileUploadPreferencesImpl.f);
        b.a(parcel, 2, fileUploadPreferencesImpl.g);
        b.a(parcel, 3, fileUploadPreferencesImpl.h);
        b.a(parcel, 4, fileUploadPreferencesImpl.i);
        b.a(parcel, a);
    }

    public FileUploadPreferencesImpl a(Parcel parcel) {
        boolean z = false;
        int b = a.b(parcel);
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i3 = a.g(parcel, a);
                    break;
                case 2:
                    i2 = a.g(parcel, a);
                    break;
                case 3:
                    i = a.g(parcel, a);
                    break;
                case 4:
                    z = a.c(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new FileUploadPreferencesImpl(i3, i2, i, z);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public FileUploadPreferencesImpl[] a(int i) {
        return new FileUploadPreferencesImpl[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
