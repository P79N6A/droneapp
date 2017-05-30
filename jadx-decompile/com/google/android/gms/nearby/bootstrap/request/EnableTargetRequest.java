package com.google.android.gms.nearby.bootstrap.request;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.amz;
import com.google.android.gms.internal.amz.a;
import com.google.android.gms.internal.ana;
import com.google.android.gms.internal.anb;

public class EnableTargetRequest extends AbstractSafeParcelable {
    public static final e CREATOR = new e();
    final int a;
    private final String b;
    private final String c;
    private final amz d;
    private final ana e;
    private final anb f;
    private final byte g;
    private final byte h;

    EnableTargetRequest(int i, String str, String str2, byte b, byte b2, IBinder iBinder, IBinder iBinder2, IBinder iBinder3) {
        this.a = i;
        this.b = d.a(str);
        this.c = (String) d.a(str2);
        this.g = b;
        this.h = b2;
        d.a(iBinder);
        this.d = a.a(iBinder);
        d.a(iBinder2);
        this.e = ana.a.a(iBinder2);
        d.a(iBinder3);
        this.f = anb.a.a(iBinder3);
    }

    public String a() {
        return this.b;
    }

    public String b() {
        return this.c;
    }

    public byte c() {
        return this.g;
    }

    public byte d() {
        return this.h;
    }

    public IBinder e() {
        return this.d == null ? null : this.d.asBinder();
    }

    public IBinder f() {
        return this.e == null ? null : this.e.asBinder();
    }

    public IBinder g() {
        return this.f == null ? null : this.f.asBinder();
    }

    public void writeToParcel(Parcel parcel, int i) {
        e eVar = CREATOR;
        e.a(this, parcel, i);
    }
}
