package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.fitness.data.Goal.DurationObjective;

public class s implements Creator<DurationObjective> {
    static void a(DurationObjective durationObjective, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, durationObjective.a());
        b.a(parcel, 1000, durationObjective.b());
        b.a(parcel, a);
    }

    public DurationObjective a(Parcel parcel) {
        int b = a.b(parcel);
        int i = 0;
        long j = 0;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    j = a.i(parcel, a);
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
            return new DurationObjective(i, j);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public DurationObjective[] a(int i) {
        return new DurationObjective[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
