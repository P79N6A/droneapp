package com.google.android.gms.wearable;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class ConnectionConfiguration extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Creator<ConnectionConfiguration> CREATOR = new z();
    final int a;
    private final String b;
    private final String c;
    private final int d;
    private final int e;
    private final boolean f;
    private boolean g;
    private String h;
    private boolean i;
    private String j;

    ConnectionConfiguration(int i, String str, String str2, int i2, int i3, boolean z, boolean z2, String str3, boolean z3, String str4) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = i2;
        this.e = i3;
        this.f = z;
        this.g = z2;
        this.h = str3;
        this.i = z3;
        this.j = str4;
    }

    public String a() {
        return this.b;
    }

    public String b() {
        return this.c;
    }

    public int c() {
        return this.d;
    }

    public int d() {
        return this.e;
    }

    public boolean e() {
        return this.g;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ConnectionConfiguration)) {
            return false;
        }
        ConnectionConfiguration connectionConfiguration = (ConnectionConfiguration) obj;
        return c.a(Integer.valueOf(this.a), Integer.valueOf(connectionConfiguration.a)) && c.a(this.b, connectionConfiguration.b) && c.a(this.c, connectionConfiguration.c) && c.a(Integer.valueOf(this.d), Integer.valueOf(connectionConfiguration.d)) && c.a(Integer.valueOf(this.e), Integer.valueOf(connectionConfiguration.e)) && c.a(Boolean.valueOf(this.f), Boolean.valueOf(connectionConfiguration.f)) && c.a(Boolean.valueOf(this.i), Boolean.valueOf(connectionConfiguration.i));
    }

    public String f() {
        return this.h;
    }

    public boolean g() {
        return this.i;
    }

    public String h() {
        return this.j;
    }

    public int hashCode() {
        return c.a(new Object[]{Integer.valueOf(this.a), this.b, this.c, Integer.valueOf(this.d), Integer.valueOf(this.e), Boolean.valueOf(this.f), Boolean.valueOf(this.i)});
    }

    public boolean i() {
        return this.f;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("ConnectionConfiguration[ ");
        String str = "mName=";
        String valueOf = String.valueOf(this.b);
        stringBuilder.append(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        str = ", mAddress=";
        valueOf = String.valueOf(this.c);
        stringBuilder.append(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        stringBuilder.append(", mType=" + this.d);
        stringBuilder.append(", mRole=" + this.e);
        stringBuilder.append(", mEnabled=" + this.f);
        stringBuilder.append(", mIsConnected=" + this.g);
        str = ", mPeerNodeId=";
        valueOf = String.valueOf(this.h);
        stringBuilder.append(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        stringBuilder.append(", mBtlePriority=" + this.i);
        str = ", mNodeId=";
        valueOf = String.valueOf(this.j);
        stringBuilder.append(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        z.a(this, parcel, i);
    }
}
