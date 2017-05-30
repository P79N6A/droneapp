package com.google.android.gms.games.multiplayer.turnbased;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.games.multiplayer.ParticipantEntity;
import java.util.ArrayList;

public class f implements Creator<TurnBasedMatchEntity> {
    static void a(TurnBasedMatchEntity turnBasedMatchEntity, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, turnBasedMatchEntity.c(), i, false);
        b.a(parcel, 2, turnBasedMatchEntity.d(), false);
        b.a(parcel, 3, turnBasedMatchEntity.e(), false);
        b.a(parcel, 4, turnBasedMatchEntity.f());
        b.a(parcel, 5, turnBasedMatchEntity.k(), false);
        b.a(parcel, 6, turnBasedMatchEntity.l());
        b.a(parcel, 7, turnBasedMatchEntity.n(), false);
        b.a(parcel, 1000, turnBasedMatchEntity.A());
        b.a(parcel, 8, turnBasedMatchEntity.g());
        b.a(parcel, 10, turnBasedMatchEntity.j());
        b.a(parcel, 11, turnBasedMatchEntity.p());
        b.a(parcel, 12, turnBasedMatchEntity.o(), false);
        b.c(parcel, 13, turnBasedMatchEntity.m(), false);
        b.a(parcel, 14, turnBasedMatchEntity.r(), false);
        b.a(parcel, 15, turnBasedMatchEntity.s(), false);
        b.a(parcel, 16, turnBasedMatchEntity.t());
        b.a(parcel, 17, turnBasedMatchEntity.u(), false);
        b.a(parcel, 18, turnBasedMatchEntity.h());
        b.a(parcel, 19, turnBasedMatchEntity.w());
        b.a(parcel, 20, turnBasedMatchEntity.i(), false);
        b.a(parcel, 21, turnBasedMatchEntity.y(), false);
        b.a(parcel, a);
    }

    public TurnBasedMatchEntity a(Parcel parcel) {
        int b = a.b(parcel);
        int i = 0;
        GameEntity gameEntity = null;
        String str = null;
        String str2 = null;
        long j = 0;
        String str3 = null;
        long j2 = 0;
        String str4 = null;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        byte[] bArr = null;
        ArrayList arrayList = null;
        String str5 = null;
        byte[] bArr2 = null;
        int i5 = 0;
        Bundle bundle = null;
        int i6 = 0;
        boolean z = false;
        String str6 = null;
        String str7 = null;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    gameEntity = (GameEntity) a.a(parcel, a, GameEntity.CREATOR);
                    break;
                case 2:
                    str = a.q(parcel, a);
                    break;
                case 3:
                    str2 = a.q(parcel, a);
                    break;
                case 4:
                    j = a.i(parcel, a);
                    break;
                case 5:
                    str3 = a.q(parcel, a);
                    break;
                case 6:
                    j2 = a.i(parcel, a);
                    break;
                case 7:
                    str4 = a.q(parcel, a);
                    break;
                case 8:
                    i2 = a.g(parcel, a);
                    break;
                case 10:
                    i3 = a.g(parcel, a);
                    break;
                case 11:
                    i4 = a.g(parcel, a);
                    break;
                case 12:
                    bArr = a.t(parcel, a);
                    break;
                case 13:
                    arrayList = a.c(parcel, a, ParticipantEntity.CREATOR);
                    break;
                case 14:
                    str5 = a.q(parcel, a);
                    break;
                case 15:
                    bArr2 = a.t(parcel, a);
                    break;
                case 16:
                    i5 = a.g(parcel, a);
                    break;
                case 17:
                    bundle = a.s(parcel, a);
                    break;
                case 18:
                    i6 = a.g(parcel, a);
                    break;
                case 19:
                    z = a.c(parcel, a);
                    break;
                case 20:
                    str6 = a.q(parcel, a);
                    break;
                case 21:
                    str7 = a.q(parcel, a);
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
            return new TurnBasedMatchEntity(i, gameEntity, str, str2, j, str3, j2, str4, i2, i3, i4, bArr, arrayList, str5, bArr2, i5, bundle, i6, z, str6, str7);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public TurnBasedMatchEntity[] a(int i) {
        return new TurnBasedMatchEntity[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
