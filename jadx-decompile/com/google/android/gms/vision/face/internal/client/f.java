package com.google.android.gms.vision.face.internal.client;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class f implements Creator<LandmarkParcel> {
    static void a(LandmarkParcel landmarkParcel, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, landmarkParcel.a);
        b.a(parcel, 2, landmarkParcel.b);
        b.a(parcel, 3, landmarkParcel.c);
        b.a(parcel, 4, landmarkParcel.d);
        b.a(parcel, a);
    }

    public LandmarkParcel a(Parcel parcel) {
        int i = 0;
        float f = 0.0f;
        int b = a.b(parcel);
        float f2 = 0.0f;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i2 = a.g(parcel, a);
                    break;
                case 2:
                    f2 = a.l(parcel, a);
                    break;
                case 3:
                    f = a.l(parcel, a);
                    break;
                case 4:
                    i = a.g(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new LandmarkParcel(i2, f2, f, i);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public LandmarkParcel[] a(int i) {
        return new LandmarkParcel[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
