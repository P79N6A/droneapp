package com.google.android.gms.games.social;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.games.PlayerEntity;

public class d implements Creator<SocialInviteEntity> {
    static void a(SocialInviteEntity socialInviteEntity, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, socialInviteEntity.c(), false);
        b.a(parcel, 2, socialInviteEntity.d(), i, false);
        b.a(parcel, 3, socialInviteEntity.e());
        b.a(parcel, 4, socialInviteEntity.f());
        b.a(parcel, 5, socialInviteEntity.g());
        b.a(parcel, 1000, socialInviteEntity.h());
        b.a(parcel, a);
    }

    public SocialInviteEntity a(Parcel parcel) {
        PlayerEntity playerEntity = null;
        int i = 0;
        int b = a.b(parcel);
        long j = 0;
        int i2 = 0;
        String str = null;
        int i3 = 0;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    str = a.q(parcel, a);
                    break;
                case 2:
                    playerEntity = (PlayerEntity) a.a(parcel, a, PlayerEntity.CREATOR);
                    break;
                case 3:
                    i2 = a.g(parcel, a);
                    break;
                case 4:
                    i = a.g(parcel, a);
                    break;
                case 5:
                    j = a.i(parcel, a);
                    break;
                case 1000:
                    i3 = a.g(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new SocialInviteEntity(i3, str, playerEntity, i2, i, j);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public SocialInviteEntity[] a(int i) {
        return new SocialInviteEntity[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
