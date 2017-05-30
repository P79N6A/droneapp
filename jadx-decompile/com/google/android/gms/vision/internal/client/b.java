package com.google.android.gms.vision.internal.client;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;

public class b implements Creator<FrameMetadataParcel> {
    static void a(FrameMetadataParcel frameMetadataParcel, Parcel parcel, int i) {
        int a = com.google.android.gms.common.internal.safeparcel.b.a(parcel);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 1, frameMetadataParcel.a);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 2, frameMetadataParcel.b);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 3, frameMetadataParcel.c);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 4, frameMetadataParcel.d);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 5, frameMetadataParcel.e);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 6, frameMetadataParcel.f);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, a);
    }

    public FrameMetadataParcel a(Parcel parcel) {
        int i = 0;
        int b = a.b(parcel);
        long j = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i5 = a.g(parcel, a);
                    break;
                case 2:
                    i4 = a.g(parcel, a);
                    break;
                case 3:
                    i3 = a.g(parcel, a);
                    break;
                case 4:
                    i2 = a.g(parcel, a);
                    break;
                case 5:
                    j = a.i(parcel, a);
                    break;
                case 6:
                    i = a.g(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new FrameMetadataParcel(i5, i4, i3, i2, j, i);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public FrameMetadataParcel[] a(int i) {
        return new FrameMetadataParcel[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
