package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.fitness.data.Goal.DurationObjective;
import com.google.android.gms.fitness.data.Goal.FrequencyObjective;
import com.google.android.gms.fitness.data.Goal.MetricObjective;
import com.google.android.gms.fitness.data.Goal.Recurrence;
import java.util.ArrayList;
import java.util.List;

public class v implements Creator<Goal> {
    static void a(Goal goal, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, goal.e());
        b.a(parcel, 2, goal.f());
        b.d(parcel, 3, goal.g(), false);
        b.a(parcel, 4, goal.b(), i, false);
        b.a(parcel, 5, goal.c());
        b.a(parcel, 6, goal.h(), i, false);
        b.a(parcel, 7, goal.i(), i, false);
        b.a(parcel, 1000, goal.d());
        b.a(parcel, 8, goal.j(), i, false);
        b.a(parcel, a);
    }

    public Goal a(Parcel parcel) {
        long j = 0;
        int i = 0;
        FrequencyObjective frequencyObjective = null;
        int b = a.b(parcel);
        List arrayList = new ArrayList();
        DurationObjective durationObjective = null;
        MetricObjective metricObjective = null;
        Recurrence recurrence = null;
        long j2 = 0;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    j2 = a.i(parcel, a);
                    break;
                case 2:
                    j = a.i(parcel, a);
                    break;
                case 3:
                    a.a(parcel, a, arrayList, getClass().getClassLoader());
                    break;
                case 4:
                    recurrence = (Recurrence) a.a(parcel, a, Recurrence.CREATOR);
                    break;
                case 5:
                    i = a.g(parcel, a);
                    break;
                case 6:
                    metricObjective = (MetricObjective) a.a(parcel, a, MetricObjective.CREATOR);
                    break;
                case 7:
                    durationObjective = (DurationObjective) a.a(parcel, a, DurationObjective.CREATOR);
                    break;
                case 8:
                    frequencyObjective = (FrequencyObjective) a.a(parcel, a, FrequencyObjective.CREATOR);
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
            return new Goal(i2, j2, j, arrayList, recurrence, i, metricObjective, durationObjective, frequencyObjective);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public Goal[] a(int i) {
        return new Goal[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
