package com.google.android.gms.games.event;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerEntity;

public class b implements Creator<EventEntity> {
    public static final int a = 0;

    static void a(EventEntity eventEntity, Parcel parcel, int i) {
        int a = com.google.android.gms.common.internal.safeparcel.b.a(parcel);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 1, eventEntity.c(), false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 2, eventEntity.d(), false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 3, eventEntity.e(), false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 4, eventEntity.f(), i, false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 5, eventEntity.getIconImageUrl(), false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 6, eventEntity.g(), i, false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 7, eventEntity.h());
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 1000, eventEntity.k());
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 8, eventEntity.i(), false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 9, eventEntity.j());
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, a);
    }

    public EventEntity a(Parcel parcel) {
        boolean z = false;
        String str = null;
        int b = a.b(parcel);
        long j = 0;
        Player player = null;
        String str2 = null;
        Uri uri = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    str5 = a.q(parcel, a);
                    break;
                case 2:
                    str4 = a.q(parcel, a);
                    break;
                case 3:
                    str3 = a.q(parcel, a);
                    break;
                case 4:
                    uri = (Uri) a.a(parcel, a, Uri.CREATOR);
                    break;
                case 5:
                    str2 = a.q(parcel, a);
                    break;
                case 6:
                    player = (PlayerEntity) a.a(parcel, a, PlayerEntity.CREATOR);
                    break;
                case 7:
                    j = a.i(parcel, a);
                    break;
                case 8:
                    str = a.q(parcel, a);
                    break;
                case 9:
                    z = a.c(parcel, a);
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
            return new EventEntity(i, str5, str4, str3, uri, str2, player, j, str, z);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public EventEntity[] a(int i) {
        return new EventEntity[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
