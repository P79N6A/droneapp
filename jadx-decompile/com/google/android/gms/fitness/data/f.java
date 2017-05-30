package com.google.android.gms.fitness.data;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class f implements Creator<Value> {
    static void a(Value value, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, value.b());
        b.a(parcel, 2, value.a());
        b.a(parcel, 3, value.h());
        b.a(parcel, 4, value.i(), false);
        b.a(parcel, 5, value.j(), false);
        b.a(parcel, 6, value.k(), false);
        b.a(parcel, 7, value.l(), false);
        b.a(parcel, 1000, value.g());
        b.a(parcel, 8, value.m(), false);
        b.a(parcel, a);
    }

    public Value a(Parcel parcel) {
        boolean z = false;
        byte[] bArr = null;
        int b = a.b(parcel);
        float f = 0.0f;
        float[] fArr = null;
        int[] iArr = null;
        Bundle bundle = null;
        String str = null;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i = a.g(parcel, a);
                    break;
                case 2:
                    z = a.c(parcel, a);
                    break;
                case 3:
                    f = a.l(parcel, a);
                    break;
                case 4:
                    str = a.q(parcel, a);
                    break;
                case 5:
                    bundle = a.s(parcel, a);
                    break;
                case 6:
                    iArr = a.w(parcel, a);
                    break;
                case 7:
                    fArr = a.z(parcel, a);
                    break;
                case 8:
                    bArr = a.t(parcel, a);
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
            return new Value(i2, i, z, f, str, bundle, iArr, fArr, bArr);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public Value[] a(int i) {
        return new Value[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
