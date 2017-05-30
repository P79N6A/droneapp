package com.google.android.gms.nearby.bootstrap.request;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.anb;
import com.google.android.gms.internal.anb.a;

public class StopScanRequest extends AbstractSafeParcelable {
    public static final h CREATOR = new h();
    final int a;
    private final anb b;

    StopScanRequest(int i, IBinder iBinder) {
        this.a = i;
        d.a(iBinder);
        this.b = a.a(iBinder);
    }

    public IBinder a() {
        return this.b == null ? null : this.b.asBinder();
    }

    public void writeToParcel(Parcel parcel, int i) {
        h hVar = CREATOR;
        h.a(this, parcel, i);
    }
}
