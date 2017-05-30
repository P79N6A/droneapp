package com.google.android.gms.games.quest;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;

public class b implements Creator<MilestoneEntity> {
    static void a(MilestoneEntity milestoneEntity, Parcel parcel, int i) {
        int a = com.google.android.gms.common.internal.safeparcel.b.a(parcel);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 1, milestoneEntity.c(), false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 2, milestoneEntity.d());
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 3, milestoneEntity.g());
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 4, milestoneEntity.h(), false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 5, milestoneEntity.f());
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 6, milestoneEntity.e(), false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 1000, milestoneEntity.i());
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, a);
    }

    public MilestoneEntity a(Parcel parcel) {
        long j = 0;
        int i = 0;
        String str = null;
        int b = a.b(parcel);
        byte[] bArr = null;
        long j2 = 0;
        String str2 = null;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    str2 = a.q(parcel, a);
                    break;
                case 2:
                    j2 = a.i(parcel, a);
                    break;
                case 3:
                    j = a.i(parcel, a);
                    break;
                case 4:
                    bArr = a.t(parcel, a);
                    break;
                case 5:
                    i = a.g(parcel, a);
                    break;
                case 6:
                    str = a.q(parcel, a);
                    break;
                case 1000:
                    i2 = a.g(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new MilestoneEntity(i2, str2, j2, j, bArr, i, str);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public MilestoneEntity[] a(int i) {
        return new MilestoneEntity[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
