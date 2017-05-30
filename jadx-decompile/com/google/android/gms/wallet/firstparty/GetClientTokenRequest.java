package com.google.android.gms.wallet.firstparty;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class GetClientTokenRequest extends AbstractSafeParcelable {
    public static final Creator<GetClientTokenRequest> CREATOR = new e();
    WalletCustomTheme a;
    private final int b;

    GetClientTokenRequest() {
        this(1, null);
    }

    GetClientTokenRequest(int i, WalletCustomTheme walletCustomTheme) {
        this.b = i;
        this.a = walletCustomTheme;
    }

    public int a() {
        return this.b;
    }

    public void writeToParcel(Parcel parcel, int i) {
        e.a(this, parcel, i);
    }
}
