package com.google.android.gms.common.server;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.b;

public class a implements Creator<FavaDiagnosticsEntity> {
    static void a(FavaDiagnosticsEntity favaDiagnosticsEntity, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, favaDiagnosticsEntity.a);
        b.a(parcel, 2, favaDiagnosticsEntity.b, false);
        b.a(parcel, 3, favaDiagnosticsEntity.c);
        b.a(parcel, a);
    }

    public FavaDiagnosticsEntity a(Parcel parcel) {
        int i = 0;
        int b = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        String str = null;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a(a)) {
                case 1:
                    i2 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, a);
                    break;
                case 2:
                    str = com.google.android.gms.common.internal.safeparcel.a.q(parcel, a);
                    break;
                case 3:
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, a);
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new FavaDiagnosticsEntity(i2, str, i);
        }
        throw new com.google.android.gms.common.internal.safeparcel.a.a("Overread allowed size end=" + b, parcel);
    }

    public FavaDiagnosticsEntity[] a(int i) {
        return new FavaDiagnosticsEntity[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
