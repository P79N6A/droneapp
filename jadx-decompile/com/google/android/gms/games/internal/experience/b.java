package com.google.android.gms.games.internal.experience;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.games.GameEntity;

public class b implements Creator<ExperienceEventEntity> {
    static void a(ExperienceEventEntity experienceEventEntity, Parcel parcel, int i) {
        int a = com.google.android.gms.common.internal.safeparcel.b.a(parcel);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 1, experienceEventEntity.c(), false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 2, experienceEventEntity.d(), i, false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 3, experienceEventEntity.e(), false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 4, experienceEventEntity.f(), false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 5, experienceEventEntity.getIconImageUrl(), false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 6, experienceEventEntity.g(), i, false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 7, experienceEventEntity.h());
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 1000, experienceEventEntity.m());
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 8, experienceEventEntity.i());
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 9, experienceEventEntity.j());
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 10, experienceEventEntity.k());
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 11, experienceEventEntity.l());
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, a);
    }

    public ExperienceEventEntity a(Parcel parcel) {
        int b = a.b(parcel);
        int i = 0;
        String str = null;
        GameEntity gameEntity = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Uri uri = null;
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    str = a.q(parcel, a);
                    break;
                case 2:
                    gameEntity = (GameEntity) a.a(parcel, a, GameEntity.CREATOR);
                    break;
                case 3:
                    str2 = a.q(parcel, a);
                    break;
                case 4:
                    str3 = a.q(parcel, a);
                    break;
                case 5:
                    str4 = a.q(parcel, a);
                    break;
                case 6:
                    uri = (Uri) a.a(parcel, a, Uri.CREATOR);
                    break;
                case 7:
                    j = a.i(parcel, a);
                    break;
                case 8:
                    j2 = a.i(parcel, a);
                    break;
                case 9:
                    j3 = a.i(parcel, a);
                    break;
                case 10:
                    i2 = a.g(parcel, a);
                    break;
                case 11:
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
            return new ExperienceEventEntity(i, str, gameEntity, str2, str3, str4, uri, j, j2, j3, i2, i3);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public ExperienceEventEntity[] a(int i) {
        return new ExperienceEventEntity[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
