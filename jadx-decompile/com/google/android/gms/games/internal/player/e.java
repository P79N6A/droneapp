package com.google.android.gms.games.internal.player;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class e implements Creator<StockProfileImageEntity> {
    static void a(StockProfileImageEntity stockProfileImageEntity, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, stockProfileImageEntity.c(), false);
        b.a(parcel, 2, stockProfileImageEntity.d(), i, false);
        b.a(parcel, 1000, stockProfileImageEntity.e());
        b.a(parcel, a);
    }

    public StockProfileImageEntity a(Parcel parcel) {
        Uri uri = null;
        int b = a.b(parcel);
        int i = 0;
        String str = null;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    str = a.q(parcel, a);
                    break;
                case 2:
                    uri = (Uri) a.a(parcel, a, Uri.CREATOR);
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
            return new StockProfileImageEntity(i, str, uri);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public StockProfileImageEntity[] a(int i) {
        return new StockProfileImageEntity[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
