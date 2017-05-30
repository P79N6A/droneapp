package com.google.android.gms.games.multiplayer.realtime;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.games.multiplayer.ParticipantEntity;
import java.util.ArrayList;

public class f implements Creator<RoomEntity> {
    static void a(RoomEntity roomEntity, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, roomEntity.c(), false);
        b.a(parcel, 2, roomEntity.d(), false);
        b.a(parcel, 3, roomEntity.e());
        b.a(parcel, 4, roomEntity.f());
        b.a(parcel, 5, roomEntity.g(), false);
        b.a(parcel, 6, roomEntity.h());
        b.a(parcel, 7, roomEntity.i(), false);
        b.a(parcel, 1000, roomEntity.l());
        b.c(parcel, 8, roomEntity.m(), false);
        b.a(parcel, 9, roomEntity.j());
        b.a(parcel, a);
    }

    public RoomEntity a(Parcel parcel) {
        int i = 0;
        ArrayList arrayList = null;
        int b = a.b(parcel);
        long j = 0;
        Bundle bundle = null;
        int i2 = 0;
        String str = null;
        int i3 = 0;
        String str2 = null;
        String str3 = null;
        int i4 = 0;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    str3 = a.q(parcel, a);
                    break;
                case 2:
                    str2 = a.q(parcel, a);
                    break;
                case 3:
                    j = a.i(parcel, a);
                    break;
                case 4:
                    i3 = a.g(parcel, a);
                    break;
                case 5:
                    str = a.q(parcel, a);
                    break;
                case 6:
                    i2 = a.g(parcel, a);
                    break;
                case 7:
                    bundle = a.s(parcel, a);
                    break;
                case 8:
                    arrayList = a.c(parcel, a, ParticipantEntity.CREATOR);
                    break;
                case 9:
                    i = a.g(parcel, a);
                    break;
                case 1000:
                    i4 = a.g(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new RoomEntity(i4, str3, str2, j, i3, str, i2, bundle, arrayList, i);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public RoomEntity[] a(int i) {
        return new RoomEntity[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
