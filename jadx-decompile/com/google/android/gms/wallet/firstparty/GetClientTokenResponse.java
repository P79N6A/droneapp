package com.google.android.gms.wallet.firstparty;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class GetClientTokenResponse extends AbstractSafeParcelable {
    public static final Creator<GetClientTokenResponse> CREATOR = new f();
    byte[] a;
    private final int b;

    GetClientTokenResponse() {
        this(1, new byte[0]);
    }

    GetClientTokenResponse(int i, byte[] bArr) {
        this.b = i;
        this.a = bArr;
    }

    public int a() {
        return this.b;
    }

    public void writeToParcel(Parcel parcel, int i) {
        f.a(this, parcel, i);
    }
}
