package com.google.android.gms.auth.api.proxy;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class d implements Creator<ProxyRequest> {
    static void a(ProxyRequest proxyRequest, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, proxyRequest.l, false);
        b.a(parcel, 2, proxyRequest.m);
        b.a(parcel, 3, proxyRequest.n);
        b.a(parcel, 4, proxyRequest.o, false);
        b.a(parcel, 5, proxyRequest.p, false);
        b.a(parcel, 1000, proxyRequest.k);
        b.a(parcel, a);
    }

    public ProxyRequest a(Parcel parcel) {
        int i = 0;
        Bundle bundle = null;
        int b = a.b(parcel);
        long j = 0;
        byte[] bArr = null;
        String str = null;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    str = a.q(parcel, a);
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
                    bundle = a.s(parcel, a);
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
            return new ProxyRequest(i2, str, i, j, bArr, bundle);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public ProxyRequest[] a(int i) {
        return new ProxyRequest[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
