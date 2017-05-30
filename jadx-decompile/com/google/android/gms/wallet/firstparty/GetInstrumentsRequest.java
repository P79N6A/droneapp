package com.google.android.gms.wallet.firstparty;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class GetInstrumentsRequest extends AbstractSafeParcelable {
    public static final Creator<GetInstrumentsRequest> CREATOR = new g();
    int[] a;
    private final int b;

    GetInstrumentsRequest() {
        this(1, null);
    }

    GetInstrumentsRequest(int i, int[] iArr) {
        this.b = i;
        this.a = iArr;
    }

    public int a() {
        return this.b;
    }

    public void writeToParcel(Parcel parcel, int i) {
        g.a(this, parcel, i);
    }
}
