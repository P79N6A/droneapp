package com.google.android.gms.auth.api.proxy;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class e implements Creator<ProxyResponse> {
    static void a(ProxyResponse proxyResponse, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, proxyResponse.c);
        b.a(parcel, 2, proxyResponse.d, i, false);
        b.a(parcel, 3, proxyResponse.e);
        b.a(parcel, 4, proxyResponse.f, false);
        b.a(parcel, 5, proxyResponse.g, false);
        b.a(parcel, 1000, proxyResponse.b);
        b.a(parcel, a);
    }

    public ProxyResponse a(Parcel parcel) {
        byte[] bArr = null;
        int i = 0;
        int b = a.b(parcel);
        Bundle bundle = null;
        PendingIntent pendingIntent = null;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i2 = a.g(parcel, a);
                    break;
                case 2:
                    pendingIntent = (PendingIntent) a.a(parcel, a, PendingIntent.CREATOR);
                    break;
                case 3:
                    i = a.g(parcel, a);
                    break;
                case 4:
                    bundle = a.s(parcel, a);
                    break;
                case 5:
                    bArr = a.t(parcel, a);
                    break;
                case 1000:
                    i3 = a.g(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new ProxyResponse(i3, i2, pendingIntent, i, bundle, bArr);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public ProxyResponse[] a(int i) {
        return new ProxyResponse[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
