package com.google.android.gms.fitness.service;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.y;
import com.google.android.gms.fitness.data.y.a;
import java.util.concurrent.TimeUnit;

public class FitnessSensorServiceRequest extends AbstractSafeParcelable {
    public static final Creator<FitnessSensorServiceRequest> CREATOR = new b();
    public static final int a = -1;
    private final int b;
    private final DataSource c;
    private final y d;
    private final long e;
    private final long f;

    FitnessSensorServiceRequest(int i, DataSource dataSource, IBinder iBinder, long j, long j2) {
        this.b = i;
        this.c = dataSource;
        this.d = a.a(iBinder);
        this.e = j;
        this.f = j2;
    }

    private boolean a(FitnessSensorServiceRequest fitnessSensorServiceRequest) {
        return c.a(this.c, fitnessSensorServiceRequest.c) && this.e == fitnessSensorServiceRequest.e && this.f == fitnessSensorServiceRequest.f;
    }

    public long a(TimeUnit timeUnit) {
        return this.e == -1 ? -1 : timeUnit.convert(this.e, TimeUnit.MICROSECONDS);
    }

    public DataSource a() {
        return this.c;
    }

    public long b(TimeUnit timeUnit) {
        return timeUnit.convert(this.f, TimeUnit.MICROSECONDS);
    }

    public a b() {
        return new c(this.d);
    }

    int c() {
        return this.b;
    }

    IBinder d() {
        return this.d.asBinder();
    }

    public long e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof FitnessSensorServiceRequest) && a((FitnessSensorServiceRequest) obj));
    }

    public long f() {
        return this.f;
    }

    public int hashCode() {
        return c.a(new Object[]{this.c, Long.valueOf(this.e), Long.valueOf(this.f)});
    }

    public String toString() {
        return String.format("FitnessSensorServiceRequest{%s}", new Object[]{this.c});
    }

    public void writeToParcel(Parcel parcel, int i) {
        b.a(this, parcel, i);
    }
}
