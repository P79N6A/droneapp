package com.google.android.gms.nearby.internal.connection.dev;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.annotation.Nullable;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.connection.dev.AdvertisingOptions;
import com.google.android.gms.nearby.internal.connection.dev.w.a;

public final class StartAdvertisingParams extends AbstractSafeParcelable {
    public static final Creator<StartAdvertisingParams> CREATOR = new e();
    final int a;
    @Nullable
    private final w b;
    @Nullable
    private final p c;
    private final String d;
    private final long e;
    private final AdvertisingOptions f;

    StartAdvertisingParams(int i, @Nullable IBinder iBinder, @Nullable IBinder iBinder2, String str, long j, AdvertisingOptions advertisingOptions) {
        this.a = i;
        this.b = a.a(iBinder);
        this.c = p.a.a(iBinder2);
        this.d = str;
        this.e = j;
        this.f = advertisingOptions;
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

    public AdvertisingOptions e() {
        return this.f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StartAdvertisingParams)) {
            return false;
        }
        StartAdvertisingParams startAdvertisingParams = (StartAdvertisingParams) obj;
        return this.a == startAdvertisingParams.a && c.a(this.b, startAdvertisingParams.b) && c.a(this.c, startAdvertisingParams.c) && c.a(this.d, startAdvertisingParams.d) && c.a(Long.valueOf(this.e), Long.valueOf(startAdvertisingParams.e)) && c.a(this.f, startAdvertisingParams.f);
    }

    public int hashCode() {
        return c.a(new Object[]{Integer.valueOf(this.a), this.b, this.c, this.d, Long.valueOf(this.e), this.f});
    }

    public void writeToParcel(Parcel parcel, int i) {
        e.a(this, parcel, i);
    }
}
