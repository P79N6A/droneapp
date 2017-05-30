package com.google.android.gms.auth.api.proxy;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class ProxyGrpcRequest extends AbstractSafeParcelable {
    public static final Creator<ProxyGrpcRequest> CREATOR = new c();
    final int a;
    public final String b;
    public final int c;
    public final long d;
    public final byte[] e;
    public final String f;

    ProxyGrpcRequest(int i, String str, int i2, long j, byte[] bArr, String str2) {
        this.a = i;
        this.b = str;
        this.c = i2;
        this.d = j;
        this.e = bArr;
        this.f = str2;
    }

    public void writeToParcel(Parcel parcel, int i) {
        c.a(this, parcel, i);
    }
}
