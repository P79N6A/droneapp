package com.google.android.gms.nearby.bootstrap;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class Device extends AbstractSafeParcelable {
    public static final Creator<Device> CREATOR = new b();
    final int a;
    private final String b;
    private final String c;
    private final String d;
    private final byte e;

    Device(int i, String str, String str2, String str3, byte b) {
        this.a = i;
        this.b = d.a(str);
        this.c = (String) d.a(str2);
        this.d = (String) d.a(str3);
        d.b(b <= (byte) 4, "Unknown device type");
        this.e = b;
    }

    public String a() {
        return this.b;
    }

    public String b() {
        return this.c;
    }

    public String c() {
        return this.d;
    }

    public byte d() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Device)) {
            return false;
        }
        Device device = (Device) obj;
        return this.b.equals(device.b) && this.c.equals(device.c) && this.e == device.e && this.d.equals(device.d);
    }

    public int hashCode() {
        return (((((this.e * 31) * 31) * 31) + ((this.d.hashCode() * 31) * 31)) + (this.b.hashCode() * 31)) + this.c.hashCode();
    }

    public String toString() {
        String str = this.b;
        String str2 = this.c;
        return new StringBuilder((String.valueOf(str).length() + 8) + String.valueOf(str2).length()).append(str).append(": ").append(str2).append("[").append(this.e).append("]").toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        b.a(this, parcel, i);
    }
}
