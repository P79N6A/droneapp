package com.google.android.gms.wearable;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class aa implements Creator<PutDataRequest> {
    static void a(PutDataRequest putDataRequest, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, putDataRequest.b);
        b.a(parcel, 2, putDataRequest.a(), i, false);
        b.a(parcel, 4, putDataRequest.d(), false);
        b.a(parcel, 5, putDataRequest.b(), false);
        b.a(parcel, 6, putDataRequest.e());
        b.a(parcel, a);
    }

    public PutDataRequest a(Parcel parcel) {
        byte[] bArr = null;
        int b = a.b(parcel);
        int i = 0;
        long j = 0;
        Bundle bundle = null;
        Uri uri = null;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i = a.g(parcel, a);
                    break;
                case 2:
                    uri = (Uri) a.a(parcel, a, Uri.CREATOR);
                    break;
                case 4:
                    bundle = a.s(parcel, a);
                    break;
                case 5:
                    bArr = a.t(parcel, a);
                    break;
                case 6:
                    j = a.i(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new PutDataRequest(i, uri, bundle, bArr, j);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public PutDataRequest[] a(int i) {
        return new PutDataRequest[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
