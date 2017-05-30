package com.google.android.gms.fitness.request;

import android.os.SystemClock;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.internal.akj;
import com.google.android.gms.location.LocationRequest;
import java.util.concurrent.TimeUnit;

public class c {
    public static final int a = 1;
    public static final int b = 2;
    public static final int c = 3;
    private final DataSource d;
    private final DataType e;
    private final long f;
    private final long g;
    private final long h;
    private final int i;
    private final LocationRequest j;
    private final long k;

    public static class a {
        private DataSource a;
        private DataType b;
        private long c = -1;
        private long d = 0;
        private long e = 0;
        private boolean f = false;
        private int g = 2;
        private long h = Long.MAX_VALUE;

        public a a(int i) {
            this.g = akj.a(i);
            return this;
        }

        public a a(int i, TimeUnit timeUnit) {
            d.b(i >= 0, "Cannot use a negative interval");
            this.f = true;
            this.d = timeUnit.toMicros((long) i);
            return this;
        }

        public a a(long j, TimeUnit timeUnit) {
            d.b(j >= 0, "Cannot use a negative sampling interval");
            this.c = timeUnit.toMicros(j);
            if (!this.f) {
                this.d = this.c / 2;
            }
            return this;
        }

        public a a(DataSource dataSource) {
            this.a = dataSource;
            return this;
        }

        public a a(DataType dataType) {
            this.b = dataType;
            return this;
        }

        public c a() {
            boolean z = false;
            boolean z2 = (this.a == null && this.b == null) ? false : true;
            d.a(z2, "Must call setDataSource() or setDataType()");
            if (this.b == null || this.a == null || this.b.equals(this.a.a())) {
                z = true;
            }
            d.a(z, "Specified data type is incompatible with specified data source");
            return new c();
        }

        public a b(int i, TimeUnit timeUnit) {
            d.b(i >= 0, "Cannot use a negative delivery interval");
            this.e = timeUnit.toMicros((long) i);
            return this;
        }

        public a b(long j, TimeUnit timeUnit) {
            boolean z = true;
            d.b(j > 0, "Invalid time out value specified: %d", new Object[]{Long.valueOf(j)});
            if (timeUnit == null) {
                z = false;
            }
            d.b(z, "Invalid time unit specified");
            this.h = timeUnit.toMicros(j);
            return this;
        }
    }

    private c(DataSource dataSource, LocationRequest locationRequest) {
        this.j = locationRequest;
        this.f = TimeUnit.MILLISECONDS.toMicros(locationRequest.c());
        this.g = TimeUnit.MILLISECONDS.toMicros(locationRequest.e());
        this.h = this.f;
        this.e = dataSource.a();
        this.i = a(locationRequest);
        this.d = dataSource;
        long f = locationRequest.f();
        if (f == Long.MAX_VALUE) {
            this.k = Long.MAX_VALUE;
        } else {
            this.k = TimeUnit.MILLISECONDS.toMicros(f - SystemClock.elapsedRealtime());
        }
    }

    private c(a aVar) {
        this.d = aVar.a;
        this.e = aVar.b;
        this.f = aVar.c;
        this.g = aVar.d;
        this.h = aVar.e;
        this.i = aVar.g;
        this.j = null;
        this.k = aVar.h;
    }

    private static int a(LocationRequest locationRequest) {
        switch (locationRequest.b()) {
            case 100:
                return 3;
            case 104:
                return 1;
            default:
                return 2;
        }
    }

    public static c a(DataSource dataSource, LocationRequest locationRequest) {
        return new c(dataSource, locationRequest);
    }

    private boolean a(c cVar) {
        return com.google.android.gms.common.internal.c.a(this.d, cVar.d) && com.google.android.gms.common.internal.c.a(this.e, cVar.e) && this.f == cVar.f && this.g == cVar.g && this.h == cVar.h && this.i == cVar.i && com.google.android.gms.common.internal.c.a(this.j, cVar.j) && this.k == cVar.k;
    }

    public long a(TimeUnit timeUnit) {
        return timeUnit.convert(this.f, TimeUnit.MICROSECONDS);
    }

    public DataSource a() {
        return this.d;
    }

    public long b(TimeUnit timeUnit) {
        return timeUnit.convert(this.g, TimeUnit.MICROSECONDS);
    }

    public DataType b() {
        return this.e;
    }

    public int c() {
        return this.i;
    }

    public long c(TimeUnit timeUnit) {
        return timeUnit.convert(this.h, TimeUnit.MICROSECONDS);
    }

    public long d() {
        return this.k;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof c) && a((c) obj));
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.c.a(new Object[]{this.d, this.e, Long.valueOf(this.f), Long.valueOf(this.g), Long.valueOf(this.h), Integer.valueOf(this.i), this.j, Long.valueOf(this.k)});
    }

    public String toString() {
        return com.google.android.gms.common.internal.c.a(this).a("dataSource", this.d).a("dataType", this.e).a("samplingRateMicros", Long.valueOf(this.f)).a("deliveryLatencyMicros", Long.valueOf(this.h)).a("timeOutMicros", Long.valueOf(this.k)).toString();
    }
}
