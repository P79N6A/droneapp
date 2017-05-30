package com.google.android.gms.games.stats;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;

public class b implements Creator<PlayerStatsEntity> {
    static void a(PlayerStatsEntity playerStatsEntity, Parcel parcel, int i) {
        int a = com.google.android.gms.common.internal.safeparcel.b.a(parcel);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 1, playerStatsEntity.c());
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 2, playerStatsEntity.d());
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 3, playerStatsEntity.e());
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 4, playerStatsEntity.f());
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 5, playerStatsEntity.g());
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 6, playerStatsEntity.h());
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 7, playerStatsEntity.i());
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 1000, playerStatsEntity.n());
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 8, playerStatsEntity.m(), false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 9, playerStatsEntity.j());
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 10, playerStatsEntity.k());
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 11, playerStatsEntity.l());
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, a);
    }

    public PlayerStatsEntity a(Parcel parcel) {
        int b = a.b(parcel);
        int i = 0;
        float f = 0.0f;
        float f2 = 0.0f;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        float f3 = 0.0f;
        float f4 = 0.0f;
        Bundle bundle = null;
        float f5 = 0.0f;
        float f6 = 0.0f;
        float f7 = 0.0f;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    f = a.l(parcel, a);
                    break;
                case 2:
                    f2 = a.l(parcel, a);
                    break;
                case 3:
                    i2 = a.g(parcel, a);
                    break;
                case 4:
                    i3 = a.g(parcel, a);
                    break;
                case 5:
                    i4 = a.g(parcel, a);
                    break;
                case 6:
                    f3 = a.l(parcel, a);
                    break;
                case 7:
                    f4 = a.l(parcel, a);
                    break;
                case 8:
                    bundle = a.s(parcel, a);
                    break;
                case 9:
                    f5 = a.l(parcel, a);
                    break;
                case 10:
                    f6 = a.l(parcel, a);
                    break;
                case 11:
                    f7 = a.l(parcel, a);
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
            return new PlayerStatsEntity(i, f, f2, i2, i3, i4, f3, f4, bundle, f5, f6, f7);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public PlayerStatsEntity[] a(int i) {
        return new PlayerStatsEntity[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
