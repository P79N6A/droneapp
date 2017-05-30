package com.google.android.gms.games.internal.player;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.b;

public class a implements Creator<MostRecentGameInfoEntity> {
    static void a(MostRecentGameInfoEntity mostRecentGameInfoEntity, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, mostRecentGameInfoEntity.c(), false);
        b.a(parcel, 2, mostRecentGameInfoEntity.d(), false);
        b.a(parcel, 3, mostRecentGameInfoEntity.e());
        b.a(parcel, 4, mostRecentGameInfoEntity.f(), i, false);
        b.a(parcel, 5, mostRecentGameInfoEntity.g(), i, false);
        b.a(parcel, 6, mostRecentGameInfoEntity.h(), i, false);
        b.a(parcel, 1000, mostRecentGameInfoEntity.i());
        b.a(parcel, a);
    }

    public MostRecentGameInfoEntity a(Parcel parcel) {
        Uri uri = null;
        int b = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        int i = 0;
        long j = 0;
        Uri uri2 = null;
        Uri uri3 = null;
        String str = null;
        String str2 = null;
        while (parcel.dataPosition() < b) {
            int a = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a(a)) {
                case 1:
                    str2 = com.google.android.gms.common.internal.safeparcel.a.q(parcel, a);
                    break;
                case 2:
                    str = com.google.android.gms.common.internal.safeparcel.a.q(parcel, a);
                    break;
                case 3:
                    j = com.google.android.gms.common.internal.safeparcel.a.i(parcel, a);
                    break;
                case 4:
                    uri3 = (Uri) com.google.android.gms.common.internal.safeparcel.a.a(parcel, a, Uri.CREATOR);
                    break;
                case 5:
                    uri2 = (Uri) com.google.android.gms.common.internal.safeparcel.a.a(parcel, a, Uri.CREATOR);
                    break;
                case 6:
                    uri = (Uri) com.google.android.gms.common.internal.safeparcel.a.a(parcel, a, Uri.CREATOR);
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
            return new MostRecentGameInfoEntity(i, str2, str, j, uri3, uri2, uri);
        }
        throw new com.google.android.gms.common.internal.safeparcel.a.a("Overread allowed size end=" + b, parcel);
    }

    public MostRecentGameInfoEntity[] a(int i) {
        return new MostRecentGameInfoEntity[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
