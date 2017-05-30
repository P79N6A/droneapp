package com.google.android.gms.games.snapshot;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;

public class b implements Creator<SnapshotEntity> {
    static void a(SnapshotEntity snapshotEntity, Parcel parcel, int i) {
        int a = com.google.android.gms.common.internal.safeparcel.b.a(parcel);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 1, snapshotEntity.c(), i, false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 3, snapshotEntity.d(), i, false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 1000, snapshotEntity.e());
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, a);
    }

    public SnapshotEntity a(Parcel parcel) {
        SnapshotContentsEntity snapshotContentsEntity = null;
        int b = a.b(parcel);
        int i = 0;
        SnapshotMetadata snapshotMetadata = null;
        while (parcel.dataPosition() < b) {
            int i2;
            SnapshotContentsEntity snapshotContentsEntity2;
            SnapshotMetadata snapshotMetadata2;
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i2 = i;
                    SnapshotMetadataEntity snapshotMetadataEntity = (SnapshotMetadataEntity) a.a(parcel, a, SnapshotMetadataEntity.CREATOR);
                    snapshotContentsEntity2 = snapshotContentsEntity;
                    Object obj = snapshotMetadataEntity;
                    break;
                case 3:
                    snapshotContentsEntity2 = (SnapshotContentsEntity) a.a(parcel, a, SnapshotContentsEntity.CREATOR);
                    snapshotMetadata2 = snapshotMetadata;
                    i2 = i;
                    break;
                case 1000:
                    SnapshotContentsEntity snapshotContentsEntity3 = snapshotContentsEntity;
                    snapshotMetadata2 = snapshotMetadata;
                    i2 = a.g(parcel, a);
                    snapshotContentsEntity2 = snapshotContentsEntity3;
                    break;
                default:
                    a.b(parcel, a);
                    snapshotContentsEntity2 = snapshotContentsEntity;
                    snapshotMetadata2 = snapshotMetadata;
                    i2 = i;
                    break;
            }
            i = i2;
            snapshotMetadata = snapshotMetadata2;
            snapshotContentsEntity = snapshotContentsEntity2;
        }
        if (parcel.dataPosition() == b) {
            return new SnapshotEntity(i, snapshotMetadata, snapshotContentsEntity);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public SnapshotEntity[] a(int i) {
        return new SnapshotEntity[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
