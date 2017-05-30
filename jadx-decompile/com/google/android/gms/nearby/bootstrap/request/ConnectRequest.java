package com.google.android.gms.nearby.bootstrap.request;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.amz;
import com.google.android.gms.internal.amz.a;
import com.google.android.gms.internal.ana;
import com.google.android.gms.internal.anb;
import com.google.android.gms.nearby.bootstrap.Device;

public class ConnectRequest extends AbstractSafeParcelable {
    public static final a CREATOR = new a();
    final int a;
    private final Device b;
    private final String c;
    private final String d;
    private final amz e;
    private final ana f;
    private final anb g;
    private final byte h;
    private final long i;
    private final String j;
    private final byte k;
    private final byte l;

    ConnectRequest(int i, Device device, String str, String str2, byte b, long j, String str3, byte b2, byte b3, IBinder iBinder, IBinder iBinder2, IBinder iBinder3) {
        this.a = i;
        this.b = (Device) d.a(device);
        this.c = d.a(str);
        this.d = (String) d.a(str2);
        this.h = b;
        this.i = j;
        this.k = b2;
        this.l = b3;
        this.j = str3;
        d.a(iBinder);
        this.e = a.a(iBinder);
        d.a(iBinder2);
        this.f = ana.a.a(iBinder2);
        d.a(iBinder3);
        this.g = anb.a.a(iBinder3);
    }

    public Device a() {
        return this.b;
    }

    public String b() {
        return this.c;
    }

    public String c() {
        return this.d;
    }

    public byte d() {
        return this.h;
    }

    public long e() {
        return this.i;
    }

    public String f() {
        return this.j;
    }

    public byte g() {
        return this.k;
    }

    public byte h() {
        return this.l;
    }

    public IBinder i() {
        return this.e == null ? null : this.e.asBinder();
    }

    public IBinder j() {
        return this.f == null ? null : this.f.asBinder();
    }

    public IBinder k() {
        return this.g == null ? null : this.g.asBinder();
    }

    public void writeToParcel(Parcel parcel, int i) {
        a aVar = CREATOR;
        a.a(this, parcel, i);
    }
}
