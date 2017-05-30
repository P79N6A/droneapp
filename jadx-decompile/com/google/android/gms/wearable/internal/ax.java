package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class ax implements Creator<AmsEntityUpdateParcelable> {
    static void a(AmsEntityUpdateParcelable amsEntityUpdateParcelable, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, amsEntityUpdateParcelable.a);
        b.a(parcel, 2, amsEntityUpdateParcelable.a());
        b.a(parcel, 3, amsEntityUpdateParcelable.b());
        b.a(parcel, 4, amsEntityUpdateParcelable.c(), false);
        b.a(parcel, a);
    }

    public AmsEntityUpdateParcelable a(Parcel parcel) {
        byte b = (byte) 0;
        int b2 = a.b(parcel);
        String str = null;
        byte b3 = (byte) 0;
        int i = 0;
        while (parcel.dataPosition() < b2) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i = a.g(parcel, a);
                    break;
                case 2:
                    b3 = a.e(parcel, a);
                    break;
                case 3:
                    b = a.e(parcel, a);
                    break;
                case 4:
                    str = a.q(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b2) {
            return new AmsEntityUpdateParcelable(i, b3, b, str);
        }
        throw new a.a("Overread allowed size end=" + b2, parcel);
    }

    public AmsEntityUpdateParcelable[] a(int i) {
        return new AmsEntityUpdateParcelable[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
