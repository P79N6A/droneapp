package com.google.android.gms.games.multiplayer;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.games.GameEntity;
import java.util.ArrayList;

public class b implements Creator<InvitationEntity> {
    static void a(InvitationEntity invitationEntity, Parcel parcel, int i) {
        int a = com.google.android.gms.common.internal.safeparcel.b.a(parcel);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 1, invitationEntity.e(), i, false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 2, invitationEntity.f(), false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 3, invitationEntity.h());
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 4, invitationEntity.i());
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 5, invitationEntity.g(), i, false);
        com.google.android.gms.common.internal.safeparcel.b.c(parcel, 6, invitationEntity.m(), false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 7, invitationEntity.j());
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 1000, invitationEntity.l());
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 8, invitationEntity.k());
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, a);
    }

    public InvitationEntity a(Parcel parcel) {
        ArrayList arrayList = null;
        int i = 0;
        int b = a.b(parcel);
        long j = 0;
        int i2 = 0;
        ParticipantEntity participantEntity = null;
        int i3 = 0;
        String str = null;
        GameEntity gameEntity = null;
        int i4 = 0;
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
                    j = a.i(parcel, a);
                    break;
                case 4:
                    i3 = a.g(parcel, a);
                    break;
                case 5:
                    participantEntity = (ParticipantEntity) a.a(parcel, a, ParticipantEntity.CREATOR);
                    break;
                case 6:
                    arrayList = a.c(parcel, a, ParticipantEntity.CREATOR);
                    break;
                case 7:
                    i2 = a.g(parcel, a);
                    break;
                case 8:
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
            return new InvitationEntity(i4, gameEntity, str, j, i3, participantEntity, arrayList, i2, i);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public InvitationEntity[] a(int i) {
        return new InvitationEntity[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
