package com.google.android.gms.nearby.internal.connection.dev;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class ae implements Creator<OnStartAdvertisingResultParams> {
    static void a(OnStartAdvertisingResultParams onStartAdvertisingResultParams, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, onStartAdvertisingResultParams.a());
        b.a(parcel, 2, onStartAdvertisingResultParams.b(), false);
        b.a(parcel, 1000, onStartAdvertisingResultParams.a);
        b.a(parcel, a);
    }

    public OnStartAdvertisingResultParams a(Parcel parcel) {
        int i = 0;
        int b = a.b(parcel);
        String str = null;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i = a.g(parcel, a);
                    break;
                case 2:
                    str = a.q(parcel, a);
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
            return new OnStartAdvertisingResultParams(i2, i, str);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public OnStartAdvertisingResultParams[] a(int i) {
        return new OnStartAdvertisingResultParams[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
