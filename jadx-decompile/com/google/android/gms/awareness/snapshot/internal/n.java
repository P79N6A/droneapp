package com.google.android.gms.awareness.snapshot.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.awareness.snapshot.internal.BeaconStateImpl.TypeFilterImpl;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class n implements Creator<TypeFilterImpl> {
    static void a(TypeFilterImpl typeFilterImpl, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, typeFilterImpl.e());
        b.a(parcel, 2, typeFilterImpl.f(), false);
        b.a(parcel, a);
    }

    public TypeFilterImpl a(Parcel parcel) {
        int b = a.b(parcel);
        int i = 0;
        byte[] bArr = null;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i = a.g(parcel, a);
                    break;
                case 2:
                    bArr = a.t(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new TypeFilterImpl(i, bArr);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public TypeFilterImpl[] a(int i) {
        return new TypeFilterImpl[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
