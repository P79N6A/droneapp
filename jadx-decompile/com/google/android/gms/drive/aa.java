package com.google.android.gms.drive;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class aa implements Creator<UserMetadata> {
    static void a(UserMetadata userMetadata, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, userMetadata.a);
        b.a(parcel, 2, userMetadata.b, false);
        b.a(parcel, 3, userMetadata.c, false);
        b.a(parcel, 4, userMetadata.d, false);
        b.a(parcel, 5, userMetadata.e);
        b.a(parcel, 6, userMetadata.f, false);
        b.a(parcel, a);
    }

    public UserMetadata a(Parcel parcel) {
        boolean z = false;
        String str = null;
        int b = a.b(parcel);
        String str2 = null;
        String str3 = null;
        String str4 = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i = a.g(parcel, a);
                    break;
                case 2:
                    str4 = a.q(parcel, a);
                    break;
                case 3:
                    str3 = a.q(parcel, a);
                    break;
                case 4:
                    str2 = a.q(parcel, a);
                    break;
                case 5:
                    z = a.c(parcel, a);
                    break;
                case 6:
                    str = a.q(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new UserMetadata(i, str4, str3, str2, z, str);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public UserMetadata[] a(int i) {
        return new UserMetadata[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
