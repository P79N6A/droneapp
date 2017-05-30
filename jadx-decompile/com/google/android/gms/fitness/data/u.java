package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.fitness.data.Goal.FrequencyObjective;

public class u implements Creator<FrequencyObjective> {
    static void a(FrequencyObjective frequencyObjective, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, frequencyObjective.a());
        b.a(parcel, 1000, frequencyObjective.b());
        b.a(parcel, a);
    }

    public FrequencyObjective a(Parcel parcel) {
        int i = 0;
        int b = a.b(parcel);
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i = a.g(parcel, a);
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
            return new FrequencyObjective(i2, i);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public FrequencyObjective[] a(int i) {
        return new FrequencyObjective[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
