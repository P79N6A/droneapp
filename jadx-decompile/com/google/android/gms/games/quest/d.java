package com.google.android.gms.games.quest;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.games.GameEntity;
import java.util.ArrayList;

public class d implements Creator<QuestEntity> {
    static void a(QuestEntity questEntity, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, questEntity.j(), i, false);
        b.a(parcel, 2, questEntity.c(), false);
        b.a(parcel, 3, questEntity.m());
        b.a(parcel, 4, questEntity.f(), i, false);
        b.a(parcel, 5, questEntity.getBannerImageUrl(), false);
        b.a(parcel, 6, questEntity.e(), false);
        b.a(parcel, 7, questEntity.n());
        b.a(parcel, 1000, questEntity.s());
        b.a(parcel, 8, questEntity.o());
        b.a(parcel, 9, questEntity.g(), i, false);
        b.a(parcel, 10, questEntity.getIconImageUrl(), false);
        b.a(parcel, 12, questEntity.d(), false);
        b.a(parcel, 13, questEntity.p());
        b.a(parcel, 14, questEntity.q());
        b.a(parcel, 15, questEntity.k());
        b.a(parcel, 16, questEntity.l());
        b.c(parcel, 17, questEntity.i(), false);
        b.a(parcel, a);
    }

    public QuestEntity a(Parcel parcel) {
        int b = a.b(parcel);
        int i = 0;
        GameEntity gameEntity = null;
        String str = null;
        long j = 0;
        Uri uri = null;
        String str2 = null;
        String str3 = null;
        long j2 = 0;
        long j3 = 0;
        Uri uri2 = null;
        String str4 = null;
        String str5 = null;
        long j4 = 0;
        long j5 = 0;
        int i2 = 0;
        int i3 = 0;
        ArrayList arrayList = null;
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
                    uri = (Uri) a.a(parcel, a, Uri.CREATOR);
                    break;
                case 5:
                    str2 = a.q(parcel, a);
                    break;
                case 6:
                    str3 = a.q(parcel, a);
                    break;
                case 7:
                    j2 = a.i(parcel, a);
                    break;
                case 8:
                    j3 = a.i(parcel, a);
                    break;
                case 9:
                    uri2 = (Uri) a.a(parcel, a, Uri.CREATOR);
                    break;
                case 10:
                    str4 = a.q(parcel, a);
                    break;
                case 12:
                    str5 = a.q(parcel, a);
                    break;
                case 13:
                    j4 = a.i(parcel, a);
                    break;
                case 14:
                    j5 = a.i(parcel, a);
                    break;
                case 15:
                    i2 = a.g(parcel, a);
                    break;
                case 16:
                    i3 = a.g(parcel, a);
                    break;
                case 17:
                    arrayList = a.c(parcel, a, MilestoneEntity.CREATOR);
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
            return new QuestEntity(i, gameEntity, str, j, uri, str2, str3, j2, j3, uri2, str4, str5, j4, j5, i2, i3, arrayList);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public QuestEntity[] a(int i) {
        return new QuestEntity[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
