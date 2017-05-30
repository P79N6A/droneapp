package com.google.android.gms.games.internal.player;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class c implements Creator<ProfileSettingsEntity> {
    static void a(ProfileSettingsEntity profileSettingsEntity, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, profileSettingsEntity.a(), i, false);
        b.a(parcel, 2, profileSettingsEntity.d(), false);
        b.a(parcel, 3, profileSettingsEntity.f());
        b.a(parcel, 4, profileSettingsEntity.b());
        b.a(parcel, 5, profileSettingsEntity.c());
        b.a(parcel, 6, profileSettingsEntity.e(), i, false);
        b.a(parcel, 7, profileSettingsEntity.g());
        b.a(parcel, 1000, profileSettingsEntity.i());
        b.a(parcel, 8, profileSettingsEntity.h());
        b.a(parcel, a);
    }

    public ProfileSettingsEntity a(Parcel parcel) {
        StockProfileImageEntity stockProfileImageEntity = null;
        boolean z = false;
        int b = a.b(parcel);
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        String str = null;
        Status status = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    status = (Status) a.a(parcel, a, Status.CREATOR);
                    break;
                case 2:
                    str = a.q(parcel, a);
                    break;
                case 3:
                    z5 = a.c(parcel, a);
                    break;
                case 4:
                    z4 = a.c(parcel, a);
                    break;
                case 5:
                    z3 = a.c(parcel, a);
                    break;
                case 6:
                    stockProfileImageEntity = (StockProfileImageEntity) a.a(parcel, a, StockProfileImageEntity.CREATOR);
                    break;
                case 7:
                    z2 = a.c(parcel, a);
                    break;
                case 8:
                    z = a.c(parcel, a);
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
            return new ProfileSettingsEntity(i, status, str, z5, z4, z3, stockProfileImageEntity, z2, z);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public ProfileSettingsEntity[] a(int i) {
        return new ProfileSettingsEntity[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
