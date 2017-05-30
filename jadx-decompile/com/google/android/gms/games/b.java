package com.google.android.gms.games;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;

public class b implements Creator<GameEntity> {
    static void a(GameEntity gameEntity, Parcel parcel, int i) {
        int a = com.google.android.gms.common.internal.safeparcel.b.a(parcel);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 1, gameEntity.c(), false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 2, gameEntity.d(), false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 3, gameEntity.e(), false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 4, gameEntity.f(), false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 5, gameEntity.g(), false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 6, gameEntity.h(), false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 7, gameEntity.i(), i, false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 8, gameEntity.j(), i, false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 9, gameEntity.k(), i, false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 10, gameEntity.l());
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 11, gameEntity.o());
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 12, gameEntity.p(), false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 13, gameEntity.y());
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 14, gameEntity.q());
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 15, gameEntity.r());
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 16, gameEntity.s());
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 17, gameEntity.t());
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 18, gameEntity.getIconImageUrl(), false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 19, gameEntity.getHiResImageUrl(), false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 20, gameEntity.getFeaturedImageUrl(), false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 21, gameEntity.m());
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 22, gameEntity.n());
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 23, gameEntity.u());
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 24, gameEntity.v(), false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 25, gameEntity.w());
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 1000, gameEntity.x());
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, a);
    }

    public GameEntity a(Parcel parcel) {
        int b = a.b(parcel);
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        Uri uri = null;
        Uri uri2 = null;
        Uri uri3 = null;
        boolean z = false;
        boolean z2 = false;
        String str7 = null;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        boolean z3 = false;
        boolean z4 = false;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        String str11 = null;
        boolean z8 = false;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    str = a.q(parcel, a);
                    break;
                case 2:
                    str2 = a.q(parcel, a);
                    break;
                case 3:
                    str3 = a.q(parcel, a);
                    break;
                case 4:
                    str4 = a.q(parcel, a);
                    break;
                case 5:
                    str5 = a.q(parcel, a);
                    break;
                case 6:
                    str6 = a.q(parcel, a);
                    break;
                case 7:
                    uri = (Uri) a.a(parcel, a, Uri.CREATOR);
                    break;
                case 8:
                    uri2 = (Uri) a.a(parcel, a, Uri.CREATOR);
                    break;
                case 9:
                    uri3 = (Uri) a.a(parcel, a, Uri.CREATOR);
                    break;
                case 10:
                    z = a.c(parcel, a);
                    break;
                case 11:
                    z2 = a.c(parcel, a);
                    break;
                case 12:
                    str7 = a.q(parcel, a);
                    break;
                case 13:
                    i2 = a.g(parcel, a);
                    break;
                case 14:
                    i3 = a.g(parcel, a);
                    break;
                case 15:
                    i4 = a.g(parcel, a);
                    break;
                case 16:
                    z3 = a.c(parcel, a);
                    break;
                case 17:
                    z4 = a.c(parcel, a);
                    break;
                case 18:
                    str8 = a.q(parcel, a);
                    break;
                case 19:
                    str9 = a.q(parcel, a);
                    break;
                case 20:
                    str10 = a.q(parcel, a);
                    break;
                case 21:
                    z5 = a.c(parcel, a);
                    break;
                case 22:
                    z6 = a.c(parcel, a);
                    break;
                case 23:
                    z7 = a.c(parcel, a);
                    break;
                case 24:
                    str11 = a.q(parcel, a);
                    break;
                case 25:
                    z8 = a.c(parcel, a);
                    break;
                case 1000:
                    i = a.g(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new GameEntity(i, str, str2, str3, str4, str5, str6, uri, uri2, uri3, z, z2, str7, i2, i3, i4, z3, z4, str8, str9, str10, z5, z6, z7, str11, z8);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public GameEntity[] a(int i) {
        return new GameEntity[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
