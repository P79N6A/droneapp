package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.fitness.data.Goal.MetricObjective;

public class aa implements Creator<MetricObjective> {
    static void a(MetricObjective metricObjective, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, metricObjective.a(), false);
        b.a(parcel, 2, metricObjective.b());
        b.a(parcel, 3, metricObjective.c());
        b.a(parcel, 1000, metricObjective.d());
        b.a(parcel, a);
    }

    public MetricObjective a(Parcel parcel) {
        double d = 0.0d;
        int b = a.b(parcel);
        int i = 0;
        String str = null;
        double d2 = 0.0d;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    str = a.q(parcel, a);
                    break;
                case 2:
                    d2 = a.n(parcel, a);
                    break;
                case 3:
                    d = a.n(parcel, a);
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
            return new MetricObjective(i, str, d2, d);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public MetricObjective[] a(int i) {
        return new MetricObjective[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
