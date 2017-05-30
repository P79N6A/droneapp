package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class az implements Creator<AncsNotificationParcelable> {
    static void a(AncsNotificationParcelable ancsNotificationParcelable, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, ancsNotificationParcelable.a);
        b.a(parcel, 2, ancsNotificationParcelable.a());
        b.a(parcel, 3, ancsNotificationParcelable.b(), false);
        b.a(parcel, 4, ancsNotificationParcelable.c(), false);
        b.a(parcel, 5, ancsNotificationParcelable.d(), false);
        b.a(parcel, 6, ancsNotificationParcelable.e(), false);
        b.a(parcel, 7, ancsNotificationParcelable.f(), false);
        b.a(parcel, 8, ancsNotificationParcelable.g(), false);
        b.a(parcel, 9, ancsNotificationParcelable.h());
        b.a(parcel, 10, ancsNotificationParcelable.i());
        b.a(parcel, 11, ancsNotificationParcelable.j());
        b.a(parcel, 12, ancsNotificationParcelable.k());
        b.a(parcel, 13, ancsNotificationParcelable.l(), false);
        b.a(parcel, a);
    }

    public AncsNotificationParcelable a(Parcel parcel) {
        int b = a.b(parcel);
        int i = 0;
        int i2 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        byte b2 = (byte) 0;
        byte b3 = (byte) 0;
        byte b4 = (byte) 0;
        byte b5 = (byte) 0;
        String str7 = null;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i = a.g(parcel, a);
                    break;
                case 2:
                    i2 = a.g(parcel, a);
                    break;
                case 3:
                    str = a.q(parcel, a);
                    break;
                case 4:
                    str2 = a.q(parcel, a);
                    break;
                case 5:
                    str3 = a.q(parcel, a);
                    break;
                case 6:
                    str4 = a.q(parcel, a);
                    break;
                case 7:
                    str5 = a.q(parcel, a);
                    break;
                case 8:
                    str6 = a.q(parcel, a);
                    break;
                case 9:
                    b2 = a.e(parcel, a);
                    break;
                case 10:
                    b3 = a.e(parcel, a);
                    break;
                case 11:
                    b4 = a.e(parcel, a);
                    break;
                case 12:
                    b5 = a.e(parcel, a);
                    break;
                case 13:
                    str7 = a.q(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new AncsNotificationParcelable(i, i2, str, str2, str3, str4, str5, str6, b2, b3, b4, b5, str7);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public AncsNotificationParcelable[] a(int i) {
        return new AncsNotificationParcelable[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
