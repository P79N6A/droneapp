package com.google.android.gms.drive.realtime.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.b;

public class a implements Creator<BeginCompoundOperationRequest> {
    static void a(BeginCompoundOperationRequest beginCompoundOperationRequest, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, beginCompoundOperationRequest.a);
        b.a(parcel, 2, beginCompoundOperationRequest.b);
        b.a(parcel, 3, beginCompoundOperationRequest.c, false);
        b.a(parcel, 4, beginCompoundOperationRequest.d);
        b.a(parcel, a);
    }

    public BeginCompoundOperationRequest a(Parcel parcel) {
        boolean z = false;
        int b = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        String str = null;
        boolean z2 = true;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int a = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a(a)) {
                case 1:
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, a);
                    break;
                case 2:
                    z = com.google.android.gms.common.internal.safeparcel.a.c(parcel, a);
                    break;
                case 3:
                    str = com.google.android.gms.common.internal.safeparcel.a.q(parcel, a);
                    break;
                case 4:
                    z2 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, a);
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new BeginCompoundOperationRequest(i, z, str, z2);
        }
        throw new com.google.android.gms.common.internal.safeparcel.a.a("Overread allowed size end=" + b, parcel);
    }

    public BeginCompoundOperationRequest[] a(int i) {
        return new BeginCompoundOperationRequest[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
