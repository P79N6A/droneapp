package com.google.android.gms.wallet.firstparty;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class ExecuteBuyFlowRequest extends AbstractSafeParcelable {
    public static final Creator<ExecuteBuyFlowRequest> CREATOR = new a();
    byte[] a;
    byte[] b;
    WalletCustomTheme c;
    private final int d;

    ExecuteBuyFlowRequest(int i, byte[] bArr, byte[] bArr2, WalletCustomTheme walletCustomTheme) {
        this.d = i;
        this.a = bArr;
        this.b = bArr2;
        this.c = walletCustomTheme;
    }

    public int a() {
        return this.d;
    }

    public void writeToParcel(Parcel parcel, int i) {
        a.a(this, parcel, i);
    }
}
