package com.google.android.gms.contextmanager.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.contextmanager.internal.InterestUpdateBatchImpl.Operation;
import java.util.ArrayList;

public class j implements Creator<InterestUpdateBatchImpl> {
    static void a(InterestUpdateBatchImpl interestUpdateBatchImpl, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, interestUpdateBatchImpl.a());
        b.c(parcel, 2, interestUpdateBatchImpl.b(), false);
        b.a(parcel, a);
    }

    public InterestUpdateBatchImpl a(Parcel parcel) {
        int b = a.b(parcel);
        int i = 0;
        ArrayList arrayList = null;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i = a.g(parcel, a);
                    break;
                case 2:
                    arrayList = a.c(parcel, a, Operation.CREATOR);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new InterestUpdateBatchImpl(i, arrayList);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public InterestUpdateBatchImpl[] a(int i) {
        return new InterestUpdateBatchImpl[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
