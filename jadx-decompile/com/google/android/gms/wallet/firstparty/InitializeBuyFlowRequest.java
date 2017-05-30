package com.google.android.gms.wallet.firstparty;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class InitializeBuyFlowRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Creator<InitializeBuyFlowRequest> CREATOR = new i();
    byte[][] a;
    private final int b;

    InitializeBuyFlowRequest(int i, byte[][] bArr) {
        this.b = i;
        this.a = bArr;
    }

    public int a() {
        return this.b;
    }

    public void writeToParcel(Parcel parcel, int i) {
        i.a(this, parcel, i);
    }
}
