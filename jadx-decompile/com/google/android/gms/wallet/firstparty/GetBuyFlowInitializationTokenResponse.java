package com.google.android.gms.wallet.firstparty;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class GetBuyFlowInitializationTokenResponse extends AbstractSafeParcelable {
    public static final Creator<GetBuyFlowInitializationTokenResponse> CREATOR = new d();
    byte[] a;
    private final int b;

    GetBuyFlowInitializationTokenResponse() {
        this(1, new byte[0]);
    }

    GetBuyFlowInitializationTokenResponse(int i, byte[] bArr) {
        this.b = i;
        this.a = bArr;
    }

    public int a() {
        return this.b;
    }

    public void writeToParcel(Parcel parcel, int i) {
        d.a(this, parcel, i);
    }
}
