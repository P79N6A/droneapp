package com.google.android.gms.games.snapshot;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.drive.Contents;

public class a implements Creator<SnapshotContentsEntity> {
    static void a(SnapshotContentsEntity snapshotContentsEntity, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, snapshotContentsEntity.b(), i, false);
        b.a(parcel, 1000, snapshotContentsEntity.f());
        b.a(parcel, a);
    }

    public SnapshotContentsEntity a(Parcel parcel) {
        int b = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        int i = 0;
        Contents contents = null;
        while (parcel.dataPosition() < b) {
            int a = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a(a)) {
                case 1:
                    contents = (Contents) com.google.android.gms.common.internal.safeparcel.a.a(parcel, a, Contents.CREATOR);
                    break;
                case 1000:
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, a);
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new SnapshotContentsEntity(i, contents);
        }
        throw new com.google.android.gms.common.internal.safeparcel.a.a("Overread allowed size end=" + b, parcel);
    }

    public SnapshotContentsEntity[] a(int i) {
        return new SnapshotContentsEntity[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
