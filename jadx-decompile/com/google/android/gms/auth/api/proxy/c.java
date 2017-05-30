package com.google.android.gms.auth.api.proxy;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class c implements Creator<ProxyGrpcRequest> {
    static void a(ProxyGrpcRequest proxyGrpcRequest, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, proxyGrpcRequest.b, false);
        b.a(parcel, 2, proxyGrpcRequest.c);
        b.a(parcel, 3, proxyGrpcRequest.d);
        b.a(parcel, 4, proxyGrpcRequest.e, false);
        b.a(parcel, 5, proxyGrpcRequest.f, false);
        b.a(parcel, 1000, proxyGrpcRequest.a);
        b.a(parcel, a);
    }

    public ProxyGrpcRequest a(Parcel parcel) {
        int i = 0;
        String str = null;
        int b = a.b(parcel);
        long j = 0;
        byte[] bArr = null;
        String str2 = null;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    str2 = a.q(parcel, a);
                    break;
                case 2:
                    i = a.g(parcel, a);
                    break;
                case 3:
                    j = a.i(parcel, a);
                    break;
                case 4:
                    bArr = a.t(parcel, a);
                    break;
                case 5:
                    str = a.q(parcel, a);
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
            return new ProxyGrpcRequest(i2, str2, i, j, bArr, str);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public ProxyGrpcRequest[] a(int i) {
        return new ProxyGrpcRequest[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
