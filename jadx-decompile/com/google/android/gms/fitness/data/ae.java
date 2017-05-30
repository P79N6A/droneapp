package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.fitness.data.Goal.Recurrence;

public class ae implements Creator<Recurrence> {
    static void a(Recurrence recurrence, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, recurrence.a());
        b.a(parcel, 2, recurrence.b());
        b.a(parcel, 1000, recurrence.c());
        b.a(parcel, a);
    }

    public Recurrence a(Parcel parcel) {
        int i = 0;
        int b = a.b(parcel);
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i2 = a.g(parcel, a);
                    break;
                case 2:
                    i = a.g(parcel, a);
                    break;
                case 1000:
                    i3 = a.g(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new Recurrence(i3, i2, i);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public Recurrence[] a(int i) {
        return new Recurrence[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
