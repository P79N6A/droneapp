package com.google.android.gms.vision.face.internal.client;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class c implements Creator<FaceSettingsParcel> {
    static void a(FaceSettingsParcel faceSettingsParcel, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, faceSettingsParcel.a);
        b.a(parcel, 2, faceSettingsParcel.b);
        b.a(parcel, 3, faceSettingsParcel.c);
        b.a(parcel, 4, faceSettingsParcel.d);
        b.a(parcel, 5, faceSettingsParcel.e);
        b.a(parcel, 6, faceSettingsParcel.f);
        b.a(parcel, 7, faceSettingsParcel.g);
        b.a(parcel, a);
    }

    public FaceSettingsParcel a(Parcel parcel) {
        boolean z = false;
        int b = a.b(parcel);
        float f = -1.0f;
        boolean z2 = false;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i4 = a.g(parcel, a);
                    break;
                case 2:
                    i3 = a.g(parcel, a);
                    break;
                case 3:
                    i2 = a.g(parcel, a);
                    break;
                case 4:
                    i = a.g(parcel, a);
                    break;
                case 5:
                    z2 = a.c(parcel, a);
                    break;
                case 6:
                    z = a.c(parcel, a);
                    break;
                case 7:
                    f = a.l(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new FaceSettingsParcel(i4, i3, i2, i, z2, z, f);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public FaceSettingsParcel[] a(int i) {
        return new FaceSettingsParcel[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
