package com.google.android.gms.nearby.bootstrap.request;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.anb;
import com.google.android.gms.internal.anb.a;
import com.google.android.gms.nearby.bootstrap.Device;

public class DisconnectRequest extends AbstractSafeParcelable {
    public static final d CREATOR = new d();
    final int a;
    private final Device b;
    private final anb c;

    DisconnectRequest(int i, Device device, IBinder iBinder) {
        this.a = i;
        this.b = (Device) d.a(device);
        d.a(iBinder);
        this.c = a.a(iBinder);
    }

    public Device a() {
        return this.b;
    }

    public IBinder b() {
        return this.c.asBinder();
    }

    public void writeToParcel(Parcel parcel, int i) {
        d dVar = CREATOR;
        d.a(this, parcel, i);
    }
}
