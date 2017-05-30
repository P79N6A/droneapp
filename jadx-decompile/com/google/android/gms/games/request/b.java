package com.google.android.gms.games.request;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.games.PlayerEntity;
import java.util.ArrayList;

public class b implements Creator<GameRequestEntity> {
    static void a(GameRequestEntity gameRequestEntity, Parcel parcel, int i) {
        int a = com.google.android.gms.common.internal.safeparcel.b.a(parcel);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 1, gameRequestEntity.f(), i, false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 2, gameRequestEntity.g(), i, false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 3, gameRequestEntity.i(), false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 4, gameRequestEntity.e(), false);
        com.google.android.gms.common.internal.safeparcel.b.c(parcel, 5, gameRequestEntity.o(), false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 7, gameRequestEntity.j());
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 1000, gameRequestEntity.c());
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 9, gameRequestEntity.k());
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 10, gameRequestEntity.l());
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 11, gameRequestEntity.d(), false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 12, gameRequestEntity.m());
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, a);
    }

    public GameRequestEntity a(Parcel parcel) {
        int b = a.b(parcel);
        int i = 0;
        GameEntity gameEntity = null;
        PlayerEntity playerEntity = null;
        byte[] bArr = null;
        String str = null;
        ArrayList arrayList = null;
        int i2 = 0;
        long j = 0;
        long j2 = 0;
        Bundle bundle = null;
        int i3 = 0;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    gameEntity = (GameEntity) a.a(parcel, a, GameEntity.CREATOR);
                    break;
                case 2:
                    playerEntity = (PlayerEntity) a.a(parcel, a, PlayerEntity.CREATOR);
                    break;
                case 3:
                    bArr = a.t(parcel, a);
                    break;
                case 4:
                    str = a.q(parcel, a);
                    break;
                case 5:
                    arrayList = a.c(parcel, a, PlayerEntity.CREATOR);
                    break;
                case 7:
                    i2 = a.g(parcel, a);
                    break;
                case 9:
                    j = a.i(parcel, a);
                    break;
                case 10:
                    j2 = a.i(parcel, a);
                    break;
                case 11:
                    bundle = a.s(parcel, a);
                    break;
                case 12:
                    i3 = a.g(parcel, a);
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
            return new GameRequestEntity(i, gameEntity, playerEntity, bArr, str, arrayList, i2, j, j2, bundle, i3);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public GameRequestEntity[] a(int i) {
        return new GameRequestEntity[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
