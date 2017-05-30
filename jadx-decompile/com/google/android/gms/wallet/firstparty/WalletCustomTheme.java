package com.google.android.gms.wallet.firstparty;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class WalletCustomTheme extends AbstractSafeParcelable {
    public static final Creator<WalletCustomTheme> CREATOR = new j();
    final int a;
    int b;
    Bundle c;
    String d;

    public WalletCustomTheme() {
        this.a = 2;
        this.b = 0;
        this.c = new Bundle();
        this.d = "";
    }

    WalletCustomTheme(int i, int i2, Bundle bundle, String str) {
        this.a = i;
        this.c = bundle;
        this.b = i2;
        this.d = str;
    }

    public void writeToParcel(Parcel parcel, int i) {
        j.a(this, parcel, i);
    }
}
