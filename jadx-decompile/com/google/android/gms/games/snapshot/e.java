package com.google.android.gms.games.snapshot;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class e implements Creator<SnapshotMetadataChangeEntity> {
    static void a(SnapshotMetadataChangeEntity snapshotMetadataChangeEntity, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, snapshotMetadataChangeEntity.a(), false);
        b.a(parcel, 2, snapshotMetadataChangeEntity.b(), false);
        b.a(parcel, 4, snapshotMetadataChangeEntity.g(), i, false);
        b.a(parcel, 5, snapshotMetadataChangeEntity.c(), i, false);
        b.a(parcel, 6, snapshotMetadataChangeEntity.e(), false);
        b.a(parcel, 1000, snapshotMetadataChangeEntity.f());
        b.a(parcel, a);
    }

    public SnapshotMetadataChangeEntity a(Parcel parcel) {
        Long l = null;
        int b = a.b(parcel);
        int i = 0;
        Uri uri = null;
        BitmapTeleporter bitmapTeleporter = null;
        Long l2 = null;
        String str = null;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    str = a.q(parcel, a);
                    break;
                case 2:
                    l2 = a.j(parcel, a);
                    break;
                case 4:
                    uri = (Uri) a.a(parcel, a, Uri.CREATOR);
                    break;
                case 5:
                    bitmapTeleporter = (BitmapTeleporter) a.a(parcel, a, BitmapTeleporter.CREATOR);
                    break;
                case 6:
                    l = a.j(parcel, a);
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
            return new SnapshotMetadataChangeEntity(i, str, l2, bitmapTeleporter, uri, l);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public SnapshotMetadataChangeEntity[] a(int i) {
        return new SnapshotMetadataChangeEntity[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
