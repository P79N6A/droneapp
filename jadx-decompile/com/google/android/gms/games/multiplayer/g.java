package com.google.android.gms.games.multiplayer;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.games.PlayerEntity;

public class g implements Creator<ParticipantEntity> {
    static void a(ParticipantEntity participantEntity, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, participantEntity.j(), false);
        b.a(parcel, 2, participantEntity.g(), false);
        b.a(parcel, 3, participantEntity.h(), i, false);
        b.a(parcel, 4, participantEntity.i(), i, false);
        b.a(parcel, 5, participantEntity.c());
        b.a(parcel, 6, participantEntity.d(), false);
        b.a(parcel, 7, participantEntity.f());
        b.a(parcel, 1000, participantEntity.m());
        b.a(parcel, 8, participantEntity.k(), i, false);
        b.a(parcel, 9, participantEntity.e());
        b.a(parcel, 10, participantEntity.l(), i, false);
        b.a(parcel, 11, participantEntity.getIconImageUrl(), false);
        b.a(parcel, 12, participantEntity.getHiResImageUrl(), false);
        b.a(parcel, a);
    }

    public ParticipantEntity a(Parcel parcel) {
        int b = a.b(parcel);
        int i = 0;
        String str = null;
        String str2 = null;
        Uri uri = null;
        Uri uri2 = null;
        int i2 = 0;
        String str3 = null;
        boolean z = false;
        PlayerEntity playerEntity = null;
        int i3 = 0;
        ParticipantResult participantResult = null;
        String str4 = null;
        String str5 = null;
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
                    uri = (Uri) a.a(parcel, a, Uri.CREATOR);
                    break;
                case 4:
                    uri2 = (Uri) a.a(parcel, a, Uri.CREATOR);
                    break;
                case 5:
                    i2 = a.g(parcel, a);
                    break;
                case 6:
                    str3 = a.q(parcel, a);
                    break;
                case 7:
                    z = a.c(parcel, a);
                    break;
                case 8:
                    playerEntity = (PlayerEntity) a.a(parcel, a, PlayerEntity.CREATOR);
                    break;
                case 9:
                    i3 = a.g(parcel, a);
                    break;
                case 10:
                    participantResult = (ParticipantResult) a.a(parcel, a, ParticipantResult.CREATOR);
                    break;
                case 11:
                    str4 = a.q(parcel, a);
                    break;
                case 12:
                    str5 = a.q(parcel, a);
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
            return new ParticipantEntity(i, str, str2, uri, uri2, i2, str3, z, playerEntity, i3, participantResult, str4, str5);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public ParticipantEntity[] a(int i) {
        return new ParticipantEntity[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
