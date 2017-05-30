package com.google.android.gms.playlog.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.b;

public class a implements Creator<PlayLoggerContext> {
    static void a(PlayLoggerContext playLoggerContext, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, playLoggerContext.a);
        b.a(parcel, 2, playLoggerContext.b, false);
        b.a(parcel, 3, playLoggerContext.c);
        b.a(parcel, 4, playLoggerContext.d);
        b.a(parcel, 5, playLoggerContext.e, false);
        b.a(parcel, 6, playLoggerContext.f, false);
        b.a(parcel, 7, playLoggerContext.g);
        b.a(parcel, 8, playLoggerContext.h, false);
        b.a(parcel, 9, playLoggerContext.i);
        b.a(parcel, 10, playLoggerContext.j);
        b.a(parcel, a);
    }

    public PlayLoggerContext a(Parcel parcel) {
        String str = null;
        int i = 0;
        int b = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        boolean z = true;
        boolean z2 = false;
        String str2 = null;
        String str3 = null;
        int i2 = 0;
        int i3 = 0;
        String str4 = null;
        int i4 = 0;
        while (parcel.dataPosition() < b) {
            int a = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a(a)) {
                case 1:
                    i4 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, a);
                    break;
                case 2:
                    str4 = com.google.android.gms.common.internal.safeparcel.a.q(parcel, a);
                    break;
                case 3:
                    i3 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, a);
                    break;
                case 4:
                    i2 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, a);
                    break;
                case 5:
                    str3 = com.google.android.gms.common.internal.safeparcel.a.q(parcel, a);
                    break;
                case 6:
                    str2 = com.google.android.gms.common.internal.safeparcel.a.q(parcel, a);
                    break;
                case 7:
                    z = com.google.android.gms.common.internal.safeparcel.a.c(parcel, a);
                    break;
                case 8:
                    str = com.google.android.gms.common.internal.safeparcel.a.q(parcel, a);
                    break;
                case 9:
                    z2 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, a);
                    break;
                case 10:
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, a);
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new PlayLoggerContext(i4, str4, i3, i2, str3, str2, z, str, z2, i);
        }
        throw new com.google.android.gms.common.internal.safeparcel.a.a("Overread allowed size end=" + b, parcel);
    }

    public PlayLoggerContext[] a(int i) {
        return new PlayLoggerContext[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
