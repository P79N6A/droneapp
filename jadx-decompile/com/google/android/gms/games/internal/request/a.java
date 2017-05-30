package com.google.android.gms.games.internal.request;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.games.request.GameRequestEntity;
import java.util.ArrayList;

public class a implements Creator<GameRequestCluster> {
    static void a(GameRequestCluster gameRequestCluster, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.c(parcel, 1, gameRequestCluster.d(), false);
        b.a(parcel, 1000, gameRequestCluster.c());
        b.a(parcel, a);
    }

    public GameRequestCluster a(Parcel parcel) {
        int b = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        int i = 0;
        ArrayList arrayList = null;
        while (parcel.dataPosition() < b) {
            int a = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a(a)) {
                case 1:
                    arrayList = com.google.android.gms.common.internal.safeparcel.a.c(parcel, a, GameRequestEntity.CREATOR);
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
            return new GameRequestCluster(i, arrayList);
        }
        throw new com.google.android.gms.common.internal.safeparcel.a.a("Overread allowed size end=" + b, parcel);
    }

    public GameRequestCluster[] a(int i) {
        return new GameRequestCluster[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
