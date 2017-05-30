package com.google.android.gms.contextmanager.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class e implements Creator<ContextManagerClientInfo> {
    static void a(ContextManagerClientInfo contextManagerClientInfo, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, contextManagerClientInfo.a());
        b.a(parcel, 2, contextManagerClientInfo.b(), false);
        b.a(parcel, 3, contextManagerClientInfo.d(), false);
        b.a(parcel, 4, contextManagerClientInfo.e());
        b.a(parcel, 5, contextManagerClientInfo.f(), false);
        b.a(parcel, 6, contextManagerClientInfo.g());
        b.a(parcel, 7, contextManagerClientInfo.h());
        b.a(parcel, 8, contextManagerClientInfo.i(), false);
        b.a(parcel, 9, contextManagerClientInfo.j(), false);
        b.a(parcel, 10, contextManagerClientInfo.k());
        b.a(parcel, a);
    }

    public ContextManagerClientInfo a(Parcel parcel) {
        String str = null;
        int i = 0;
        int b = a.b(parcel);
        String str2 = null;
        int i2 = 0;
        int i3 = 0;
        String str3 = null;
        int i4 = 0;
        String str4 = null;
        String str5 = null;
        int i5 = 0;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i5 = a.g(parcel, a);
                    break;
                case 2:
                    str5 = a.q(parcel, a);
                    break;
                case 3:
                    str4 = a.q(parcel, a);
                    break;
                case 4:
                    i4 = a.g(parcel, a);
                    break;
                case 5:
                    str3 = a.q(parcel, a);
                    break;
                case 6:
                    i3 = a.g(parcel, a);
                    break;
                case 7:
                    i2 = a.g(parcel, a);
                    break;
                case 8:
                    str2 = a.q(parcel, a);
                    break;
                case 9:
                    str = a.q(parcel, a);
                    break;
                case 10:
                    i = a.g(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new ContextManagerClientInfo(i5, str5, str4, i4, str3, i3, i2, str2, str, i);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public ContextManagerClientInfo[] a(int i) {
        return new ContextManagerClientInfo[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
