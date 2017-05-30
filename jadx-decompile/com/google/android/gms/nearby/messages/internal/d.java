package com.google.android.gms.nearby.messages.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class d implements Creator<ClientAppContext> {
    static void a(ClientAppContext clientAppContext, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, clientAppContext.a);
        b.a(parcel, 2, clientAppContext.b, false);
        b.a(parcel, 3, clientAppContext.c, false);
        b.a(parcel, 4, clientAppContext.d);
        b.a(parcel, 5, clientAppContext.e);
        b.a(parcel, 6, clientAppContext.f, false);
        b.a(parcel, a);
    }

    public ClientAppContext a(Parcel parcel) {
        String str = null;
        int i = 0;
        int b = a.b(parcel);
        boolean z = false;
        String str2 = null;
        String str3 = null;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i2 = a.g(parcel, a);
                    break;
                case 2:
                    str3 = a.q(parcel, a);
                    break;
                case 3:
                    str2 = a.q(parcel, a);
                    break;
                case 4:
                    z = a.c(parcel, a);
                    break;
                case 5:
                    i = a.g(parcel, a);
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
            return new ClientAppContext(i2, str3, str2, z, i, str);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public ClientAppContext[] a(int i) {
        return new ClientAppContext[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
