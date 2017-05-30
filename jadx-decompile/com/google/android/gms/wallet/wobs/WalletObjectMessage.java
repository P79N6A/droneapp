package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class WalletObjectMessage extends AbstractSafeParcelable {
    public static final Creator<WalletObjectMessage> CREATOR = new i();
    String a;
    String b;
    TimeInterval c;
    UriData d;
    UriData e;
    private final int f;

    WalletObjectMessage() {
        this.f = 1;
    }

    WalletObjectMessage(int i, String str, String str2, TimeInterval timeInterval, UriData uriData, UriData uriData2) {
        this.f = i;
        this.a = str;
        this.b = str2;
        this.c = timeInterval;
        this.d = uriData;
        this.e = uriData2;
    }

    public int a() {
        return this.f;
    }

    public void writeToParcel(Parcel parcel, int i) {
        i.a(this, parcel, i);
    }
}
