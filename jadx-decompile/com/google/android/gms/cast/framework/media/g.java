package com.google.android.gms.cast.framework.media;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import java.util.List;

public class g implements Creator<NotificationOptions> {
    static void a(NotificationOptions notificationOptions, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, notificationOptions.a());
        b.b(parcel, 2, notificationOptions.b(), false);
        b.a(parcel, 3, notificationOptions.c(), false);
        b.a(parcel, 4, notificationOptions.d());
        b.a(parcel, 5, notificationOptions.e(), false);
        b.a(parcel, 6, notificationOptions.f());
        b.a(parcel, 7, notificationOptions.g());
        b.a(parcel, 8, notificationOptions.h());
        b.a(parcel, 9, notificationOptions.i());
        b.a(parcel, 10, notificationOptions.j());
        b.a(parcel, 11, notificationOptions.k());
        b.a(parcel, 12, notificationOptions.l());
        b.a(parcel, 13, notificationOptions.m());
        b.a(parcel, 14, notificationOptions.n());
        b.a(parcel, 15, notificationOptions.o());
        b.a(parcel, 16, notificationOptions.p());
        b.a(parcel, 17, notificationOptions.q());
        b.a(parcel, 18, notificationOptions.r());
        b.a(parcel, 19, notificationOptions.s());
        b.a(parcel, 20, notificationOptions.t());
        b.a(parcel, 21, notificationOptions.u());
        b.a(parcel, 22, notificationOptions.v());
        b.a(parcel, 23, notificationOptions.w());
        b.a(parcel, 24, notificationOptions.x());
        b.a(parcel, 25, notificationOptions.y());
        b.a(parcel, 26, notificationOptions.z());
        b.a(parcel, 27, notificationOptions.A());
        b.a(parcel, 28, notificationOptions.B());
        b.a(parcel, 29, notificationOptions.C());
        b.a(parcel, 30, notificationOptions.D());
        b.a(parcel, 31, notificationOptions.E());
        b.a(parcel, 32, notificationOptions.F());
        b.a(parcel, a);
    }

    public NotificationOptions a(Parcel parcel) {
        int b = a.b(parcel);
        int i = 0;
        List list = null;
        int[] iArr = null;
        long j = 0;
        String str = null;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        int i21 = 0;
        int i22 = 0;
        int i23 = 0;
        int i24 = 0;
        int i25 = 0;
        int i26 = 0;
        int i27 = 0;
        int i28 = 0;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i = a.g(parcel, a);
                    break;
                case 2:
                    list = a.E(parcel, a);
                    break;
                case 3:
                    iArr = a.w(parcel, a);
                    break;
                case 4:
                    j = a.i(parcel, a);
                    break;
                case 5:
                    str = a.q(parcel, a);
                    break;
                case 6:
                    i2 = a.g(parcel, a);
                    break;
                case 7:
                    i3 = a.g(parcel, a);
                    break;
                case 8:
                    i4 = a.g(parcel, a);
                    break;
                case 9:
                    i5 = a.g(parcel, a);
                    break;
                case 10:
                    i6 = a.g(parcel, a);
                    break;
                case 11:
                    i7 = a.g(parcel, a);
                    break;
                case 12:
                    i8 = a.g(parcel, a);
                    break;
                case 13:
                    i9 = a.g(parcel, a);
                    break;
                case 14:
                    i10 = a.g(parcel, a);
                    break;
                case 15:
                    i11 = a.g(parcel, a);
                    break;
                case 16:
                    i12 = a.g(parcel, a);
                    break;
                case 17:
                    i13 = a.g(parcel, a);
                    break;
                case 18:
                    i14 = a.g(parcel, a);
                    break;
                case 19:
                    i15 = a.g(parcel, a);
                    break;
                case 20:
                    i16 = a.g(parcel, a);
                    break;
                case 21:
                    i17 = a.g(parcel, a);
                    break;
                case 22:
                    i18 = a.g(parcel, a);
                    break;
                case 23:
                    i19 = a.g(parcel, a);
                    break;
                case 24:
                    i20 = a.g(parcel, a);
                    break;
                case 25:
                    i21 = a.g(parcel, a);
                    break;
                case 26:
                    i22 = a.g(parcel, a);
                    break;
                case 27:
                    i23 = a.g(parcel, a);
                    break;
                case 28:
                    i24 = a.g(parcel, a);
                    break;
                case 29:
                    i25 = a.g(parcel, a);
                    break;
                case 30:
                    i26 = a.g(parcel, a);
                    break;
                case 31:
                    i27 = a.g(parcel, a);
                    break;
                case 32:
                    i28 = a.g(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new NotificationOptions(i, list, iArr, j, str, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16, i17, i18, i19, i20, i21, i22, i23, i24, i25, i26, i27, i28);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public NotificationOptions[] a(int i) {
        return new NotificationOptions[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
