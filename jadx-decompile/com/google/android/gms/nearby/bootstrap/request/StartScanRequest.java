package com.google.android.gms.nearby.bootstrap.request;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.anb;
import com.google.android.gms.internal.and;
import com.google.android.gms.internal.and.a;

public class StartScanRequest extends AbstractSafeParcelable {
    public static final g CREATOR = new g();
    final int a;
    private final and b;
    private final anb c;
    private final byte d;

    StartScanRequest(int i, byte b, IBinder iBinder, IBinder iBinder2) {
        this.a = i;
        this.d = b;
        d.a(iBinder);
        this.b = a.a(iBinder);
        d.a(iBinder2);
        this.c = anb.a.a(iBinder2);
    }

    public byte a() {
        return this.d;
    }

    public IBinder b() {
        return this.b == null ? null : this.b.asBinder();
    }

    public IBinder c() {
        return this.c == null ? null : this.c.asBinder();
    }

    public void writeToParcel(Parcel parcel, int i) {
        g gVar = CREATOR;
        g.a(this, parcel, i);
    }
}
