package com.google.android.gms.games.snapshot;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.games.PlayerEntity;

public class f implements Creator<SnapshotMetadataEntity> {
    static void a(SnapshotMetadataEntity snapshotMetadataEntity, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, snapshotMetadataEntity.c(), i, false);
        b.a(parcel, 2, snapshotMetadataEntity.d(), i, false);
        b.a(parcel, 3, snapshotMetadataEntity.e(), false);
        b.a(parcel, 5, snapshotMetadataEntity.f(), i, false);
        b.a(parcel, 6, snapshotMetadataEntity.getCoverImageUrl(), false);
        b.a(parcel, 7, snapshotMetadataEntity.i(), false);
        b.a(parcel, 1000, snapshotMetadataEntity.p());
        b.a(parcel, 8, snapshotMetadataEntity.j(), false);
        b.a(parcel, 9, snapshotMetadataEntity.k());
        b.a(parcel, 10, snapshotMetadataEntity.l());
        b.a(parcel, 11, snapshotMetadataEntity.g());
        b.a(parcel, 12, snapshotMetadataEntity.h(), false);
        b.a(parcel, 13, snapshotMetadataEntity.m());
        b.a(parcel, 14, snapshotMetadataEntity.n());
        b.a(parcel, 15, snapshotMetadataEntity.o(), false);
        b.a(parcel, a);
    }

    public SnapshotMetadataEntity a(Parcel parcel) {
        int b = a.b(parcel);
        int i = 0;
        GameEntity gameEntity = null;
        PlayerEntity playerEntity = null;
        String str = null;
        Uri uri = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        long j = 0;
        long j2 = 0;
        float f = 0.0f;
        String str5 = null;
        boolean z = false;
        long j3 = 0;
        String str6 = null;
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
                    str = a.q(parcel, a);
                    break;
                case 5:
                    uri = (Uri) a.a(parcel, a, Uri.CREATOR);
                    break;
                case 6:
                    str2 = a.q(parcel, a);
                    break;
                case 7:
                    str3 = a.q(parcel, a);
                    break;
                case 8:
                    str4 = a.q(parcel, a);
                    break;
                case 9:
                    j = a.i(parcel, a);
                    break;
                case 10:
                    j2 = a.i(parcel, a);
                    break;
                case 11:
                    f = a.l(parcel, a);
                    break;
                case 12:
                    str5 = a.q(parcel, a);
                    break;
                case 13:
                    z = a.c(parcel, a);
                    break;
                case 14:
                    j3 = a.i(parcel, a);
                    break;
                case 15:
                    str6 = a.q(parcel, a);
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
            return new SnapshotMetadataEntity(i, gameEntity, playerEntity, str, uri, str2, str3, str4, j, j2, f, str5, z, j3, str6);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public SnapshotMetadataEntity[] a(int i) {
        return new SnapshotMetadataEntity[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
