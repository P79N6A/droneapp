package com.google.android.gms.location.places;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class z implements Creator<UserDataType> {
    static void a(UserDataType userDataType, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, userDataType.f, false);
        b.a(parcel, 2, userDataType.g);
        b.a(parcel, 1000, userDataType.e);
        b.a(parcel, a);
    }

    public UserDataType a(Parcel parcel) {
        int i = 0;
        int b = a.b(parcel);
        String str = null;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    str = a.q(parcel, a);
                    break;
                case 2:
                    i = a.g(parcel, a);
                    break;
                case 1000:
                    i2 = a.g(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new UserDataType(i2, str, i);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public UserDataType[] a(int i) {
        return new UserDataType[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
