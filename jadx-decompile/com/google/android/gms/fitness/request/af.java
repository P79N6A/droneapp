package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import java.util.ArrayList;
import java.util.List;

public class af implements Creator<GoalsReadRequest> {
    static void a(GoalsReadRequest goalsReadRequest, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, goalsReadRequest.c(), false);
        b.d(parcel, 2, goalsReadRequest.a(), false);
        b.a(parcel, 1000, goalsReadRequest.b());
        b.a(parcel, a);
    }

    public GoalsReadRequest a(Parcel parcel) {
        int b = a.b(parcel);
        int i = 0;
        IBinder iBinder = null;
        List arrayList = new ArrayList();
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    iBinder = a.r(parcel, a);
                    break;
                case 2:
                    a.a(parcel, a, arrayList, getClass().getClassLoader());
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
            return new GoalsReadRequest(i, iBinder, arrayList);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public GoalsReadRequest[] a(int i) {
        return new GoalsReadRequest[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
