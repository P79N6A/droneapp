package com.google.android.gms.games.internal.multiplayer;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.games.multiplayer.InvitationEntity;
import java.util.ArrayList;

public class a implements Creator<ZInvitationCluster> {
    static void a(ZInvitationCluster zInvitationCluster, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.c(parcel, 1, zInvitationCluster.d(), false);
        b.a(parcel, 1000, zInvitationCluster.c());
        b.a(parcel, a);
    }

    public ZInvitationCluster a(Parcel parcel) {
        int b = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        int i = 0;
        ArrayList arrayList = null;
        while (parcel.dataPosition() < b) {
            int a = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a(a)) {
                case 1:
                    arrayList = com.google.android.gms.common.internal.safeparcel.a.c(parcel, a, InvitationEntity.CREATOR);
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
            return new ZInvitationCluster(i, arrayList);
        }
        throw new com.google.android.gms.common.internal.safeparcel.a.a("Overread allowed size end=" + b, parcel);
    }

    public ZInvitationCluster[] a(int i) {
        return new ZInvitationCluster[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
