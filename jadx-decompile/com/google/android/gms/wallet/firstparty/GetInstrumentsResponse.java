package com.google.android.gms.wallet.firstparty;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class GetInstrumentsResponse extends AbstractSafeParcelable {
    public static final Creator<GetInstrumentsResponse> CREATOR = new h();
    String[] a;
    byte[][] b;
    private final int c;

    GetInstrumentsResponse() {
        this(1, new String[0], new byte[0][]);
    }

    GetInstrumentsResponse(int i, String[] strArr, byte[][] bArr) {
        this.c = i;
        this.a = strArr;
        this.b = bArr;
    }

    public int a() {
        return this.c;
    }

    public void writeToParcel(Parcel parcel, int i) {
        h.a(this, parcel, i);
    }
}
