package com.google.android.gms.nearby.internal.connection.dev;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.annotation.Nullable;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.connection.dev.DiscoveryOptions;
import com.google.android.gms.nearby.internal.connection.dev.v.a;

public final class StartDiscoveryParams extends AbstractSafeParcelable {
    public static final Creator<StartDiscoveryParams> CREATOR = new f();
    final int a;
    @Nullable
    private final v b;
    @Nullable
    private final s c;
    private final String d;
    private final long e;
    private final DiscoveryOptions f;

    StartDiscoveryParams(int i, @Nullable IBinder iBinder, @Nullable IBinder iBinder2, String str, long j, DiscoveryOptions discoveryOptions) {
        this.a = i;
        this.b = a.a(iBinder);
        this.c = s.a.a(iBinder2);
        this.d = str;
        this.e = j;
        this.f = discoveryOptions;
    }

    @Nullable
    public IBinder a() {
        return this.b == null ? null : this.b.asBinder();
    }

    @Nullable
    public IBinder b() {
        return this.c == null ? null : this.c.asBinder();
    }

    public String c() {
        return this.d;
    }

    public long d() {
        return this.e;
    }

    public DiscoveryOptions e() {
        return this.f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StartDiscoveryParams)) {
            return false;
        }
        StartDiscoveryParams startDiscoveryParams = (StartDiscoveryParams) obj;
        return this.a == startDiscoveryParams.a && c.a(this.b, startDiscoveryParams.b) && c.a(this.c, startDiscoveryParams.c) && c.a(this.d, startDiscoveryParams.d) && c.a(Long.valueOf(this.e), Long.valueOf(startDiscoveryParams.e)) && c.a(this.f, startDiscoveryParams.f);
    }

    public int hashCode() {
        return c.a(new Object[]{Integer.valueOf(this.a), this.b, this.c, this.d, Long.valueOf(this.e), this.f});
    }

    public void writeToParcel(Parcel parcel, int i) {
        f.a(this, parcel, i);
    }
}
