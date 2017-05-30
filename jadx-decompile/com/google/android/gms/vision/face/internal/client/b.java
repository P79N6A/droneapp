package com.google.android.gms.vision.face.internal.client;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;

public class b implements Creator<FaceParcel> {
    static void a(FaceParcel faceParcel, Parcel parcel, int i) {
        int a = com.google.android.gms.common.internal.safeparcel.b.a(parcel);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 1, faceParcel.a);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 2, faceParcel.b);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 3, faceParcel.c);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 4, faceParcel.d);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 5, faceParcel.e);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 6, faceParcel.f);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 7, faceParcel.g);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 8, faceParcel.h);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 9, faceParcel.i, i, false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 10, faceParcel.j);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 11, faceParcel.k);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 12, faceParcel.l);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, a);
    }

    public FaceParcel a(Parcel parcel) {
        int b = a.b(parcel);
        int i = 0;
        int i2 = 0;
        float f = 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        float f4 = 0.0f;
        float f5 = 0.0f;
        float f6 = 0.0f;
        LandmarkParcel[] landmarkParcelArr = null;
        float f7 = 0.0f;
        float f8 = 0.0f;
        float f9 = 0.0f;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i = a.g(parcel, a);
                    break;
                case 2:
                    i2 = a.g(parcel, a);
                    break;
                case 3:
                    f = a.l(parcel, a);
                    break;
                case 4:
                    f2 = a.l(parcel, a);
                    break;
                case 5:
                    f3 = a.l(parcel, a);
                    break;
                case 6:
                    f4 = a.l(parcel, a);
                    break;
                case 7:
                    f5 = a.l(parcel, a);
                    break;
                case 8:
                    f6 = a.l(parcel, a);
                    break;
                case 9:
                    landmarkParcelArr = (LandmarkParcel[]) a.b(parcel, a, LandmarkParcel.CREATOR);
                    break;
                case 10:
                    f7 = a.l(parcel, a);
                    break;
                case 11:
                    f8 = a.l(parcel, a);
                    break;
                case 12:
                    f9 = a.l(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new FaceParcel(i, i2, f, f2, f3, f4, f5, f6, landmarkParcelArr, f7, f8, f9);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public FaceParcel[] a(int i) {
        return new FaceParcel[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
