package com.google.android.gms.nearby.bootstrap.request;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.anb;
import com.google.android.gms.internal.anb.a;
import com.google.android.gms.nearby.bootstrap.Device;

public class SendDataRequest extends AbstractSafeParcelable {
    public static final f CREATOR = new f();
    final int a;
    private final Device b;
    private final byte[] c;
    private final anb d;

    SendDataRequest(int i, Device device, byte[] bArr, IBinder iBinder) {
        this.a = i;
        this.b = (Device) d.a(device);
        this.c = (byte[]) d.a(bArr);
        d.a(iBinder);
        this.d = a.a(iBinder);
    }

    public Device a() {
        return this.b;
    }

    public byte[] b() {
        return this.c;
    }

    public IBinder c() {
        return this.d == null ? null : this.d.asBinder();
    }

    public void writeToParcel(Parcel parcel, int i) {
        f fVar = CREATOR;
        f.a(this, parcel, i);
    }
}
