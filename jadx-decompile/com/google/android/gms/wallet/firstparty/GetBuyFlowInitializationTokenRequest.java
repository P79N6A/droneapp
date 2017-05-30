package com.google.android.gms.wallet.firstparty;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

@Deprecated
public final class GetBuyFlowInitializationTokenRequest extends AbstractSafeParcelable {
    public static final Creator<GetBuyFlowInitializationTokenRequest> CREATOR = new c();
    byte[] a;
    byte[] b;
    private final int c;

    GetBuyFlowInitializationTokenRequest() {
        this(1, null, null);
    }

    GetBuyFlowInitializationTokenRequest(int i, byte[] bArr, byte[] bArr2) {
        this.c = i;
        this.a = bArr;
        this.b = bArr2;
    }

    public int a() {
        return this.c;
    }

    public void writeToParcel(Parcel parcel, int i) {
        c.a(this, parcel, i);
    }
}
