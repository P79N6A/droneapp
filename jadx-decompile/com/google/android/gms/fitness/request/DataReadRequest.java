package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fitness.data.Bucket;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.fitness.data.Device;
import com.google.android.gms.internal.akx;
import com.tencent.mm.sdk.platformtools.LocaleUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class DataReadRequest extends AbstractSafeParcelable {
    public static final Creator<DataReadRequest> CREATOR = new t();
    public static final int a = 0;
    private final int b;
    private final List<DataType> c;
    private final List<DataSource> d;
    private final long e;
    private final long f;
    private final List<DataType> g;
    private final List<DataSource> h;
    private final int i;
    private final long j;
    private final DataSource k;
    private final int l;
    private final boolean m;
    private final boolean n;
    private final akx o;
    private final List<Device> p;
    private final List<Integer> q;

    public static class a {
        private List<DataType> a = new ArrayList();
        private List<DataSource> b = new ArrayList();
        private List<DataType> c = new ArrayList();
        private List<DataSource> d = new ArrayList();
        private DataSource e;
        private long f;
        private long g;
        private int h = 0;
        private long i = 0;
        private int j = 0;
        private boolean k = false;
        private boolean l = false;
        private final List<Device> m = new ArrayList();
        private final List<Integer> n = new ArrayList();

        public a a() {
            this.l = true;
            return this;
        }

        public a a(int i) {
            d.b(i > 0, "Invalid limit %d is specified", new Object[]{Integer.valueOf(i)});
            this.j = i;
            return this;
        }

        public a a(int i, TimeUnit timeUnit) {
            d.b(this.h == 0, "Bucketing strategy already set to %s", new Object[]{Integer.valueOf(this.h)});
            d.b(i > 0, "Must specify a valid minimum duration for an activity segment: %d", new Object[]{Integer.valueOf(i)});
            this.h = 1;
            this.i = timeUnit.toMillis((long) i);
            return this;
        }

        public a a(int i, TimeUnit timeUnit, DataSource dataSource) {
            d.b(this.h == 0, "Bucketing strategy already set to %s", new Object[]{Integer.valueOf(this.h)});
            d.b(i > 0, "Must specify a valid minimum duration for an activity segment: %d", new Object[]{Integer.valueOf(i)});
            d.b(dataSource != null, "Invalid activity data source specified");
            d.b(dataSource.a().equals(DataType.e), "Invalid activity data source specified: %s", new Object[]{dataSource});
            this.e = dataSource;
            this.h = 3;
            this.i = timeUnit.toMillis((long) i);
            return this;
        }

        public a a(long j, long j2, TimeUnit timeUnit) {
            this.f = timeUnit.toMillis(j);
            this.g = timeUnit.toMillis(j2);
            return this;
        }

        public a a(DataSource dataSource) {
            d.a(dataSource, "Attempting to add a null data source");
            d.b(!this.d.contains(dataSource), "Cannot add the same data source as aggregated and detailed");
            if (!this.b.contains(dataSource)) {
                this.b.add(dataSource);
            }
            return this;
        }

        public a a(DataSource dataSource, DataType dataType) {
            d.a(dataSource, "Attempting to add a null data source");
            d.a(!this.b.contains(dataSource), "Cannot add the same data source for aggregated and detailed");
            DataType a = dataSource.a();
            d.b(DataType.W.contains(a), "Unsupported input data type specified for aggregation: %s", new Object[]{a});
            d.b(DataType.a(a).contains(dataType), "Invalid output aggregate data type specified: %s -> %s", new Object[]{a, dataType});
            if (!this.d.contains(dataSource)) {
                this.d.add(dataSource);
            }
            return this;
        }

        public a a(DataType dataType) {
            d.a(dataType, "Attempting to use a null data type");
            d.a(!this.c.contains(dataType), "Cannot add the same data type as aggregated and detailed");
            if (!this.a.contains(dataType)) {
                this.a.add(dataType);
            }
            return this;
        }

        public a a(DataType dataType, DataType dataType2) {
            d.a(dataType, "Attempting to use a null data type");
            d.a(!this.a.contains(dataType), "Cannot add the same data type as aggregated and detailed");
            d.b(DataType.W.contains(dataType), "Unsupported input data type specified for aggregation: %s", new Object[]{dataType});
            d.b(DataType.a(dataType).contains(dataType2), "Invalid output aggregate data type specified: %s -> %s", new Object[]{dataType, dataType2});
            if (!this.c.contains(dataType)) {
                this.c.add(dataType);
            }
            return this;
        }

        public a b(int i, TimeUnit timeUnit) {
            d.b(this.h == 0, "Bucketing strategy already set to %s", new Object[]{Integer.valueOf(this.h)});
            d.b(i > 0, "Must specify a valid minimum duration for an activity segment: %d", new Object[]{Integer.valueOf(i)});
            this.h = 3;
            this.i = timeUnit.toMillis((long) i);
            return this;
        }

        public a b(int i, TimeUnit timeUnit, DataSource dataSource) {
            d.b(this.h == 0, "Bucketing strategy already set to %s", new Object[]{Integer.valueOf(this.h)});
            d.b(i > 0, "Must specify a valid minimum duration for an activity segment: %d", new Object[]{Integer.valueOf(i)});
            d.b(dataSource != null, "Invalid activity data source specified");
            d.b(dataSource.a().equals(DataType.e), "Invalid activity data source specified: %s", new Object[]{dataSource});
            this.e = dataSource;
            this.h = 4;
            this.i = timeUnit.toMillis((long) i);
            return this;
        }

        public DataReadRequest b() {
            boolean z = true;
            boolean z2 = (this.b.isEmpty() && this.a.isEmpty() && this.d.isEmpty() && this.c.isEmpty()) ? false : true;
            d.a(z2, "Must add at least one data source (aggregated or detailed)");
            d.a(this.f > 0, "Invalid start time: %s", new Object[]{Long.valueOf(this.f)});
            z2 = this.g > 0 && this.g > this.f;
            d.a(z2, "Invalid end time: %s", new Object[]{Long.valueOf(this.g)});
            z2 = this.d.isEmpty() && this.c.isEmpty();
            if (!(z2 && this.h == 0) && (z2 || this.h == 0)) {
                z = false;
            }
            d.a(z, "Must specify a valid bucketing strategy while requesting aggregation");
            return new DataReadRequest();
        }

        public a c(int i, TimeUnit timeUnit) {
            d.b(this.h == 0, "Bucketing strategy already set to %s", new Object[]{Integer.valueOf(this.h)});
            d.b(i > 0, "Must specify a valid minimum duration for an activity segment: %d", new Object[]{Integer.valueOf(i)});
            this.h = 4;
            this.i = timeUnit.toMillis((long) i);
            return this;
        }

        public a d(int i, TimeUnit timeUnit) {
            d.b(this.h == 0, "Bucketing strategy already set to %s", new Object[]{Integer.valueOf(this.h)});
            d.b(i > 0, "Must specify a valid minimum duration for an activity segment: %d", new Object[]{Integer.valueOf(i)});
            this.h = 2;
            this.i = timeUnit.toMillis((long) i);
            return this;
        }
    }

    DataReadRequest(int i, List<DataType> list, List<DataSource> list2, long j, long j2, List<DataType> list3, List<DataSource> list4, int i2, long j3, DataSource dataSource, int i3, boolean z, boolean z2, IBinder iBinder, List<Device> list5, List<Integer> list6) {
        this.b = i;
        this.c = list;
        this.d = list2;
        this.e = j;
        this.f = j2;
        this.g = list3;
        this.h = list4;
        this.i = i2;
        this.j = j3;
        this.k = dataSource;
        this.l = i3;
        this.m = z;
        this.n = z2;
        this.o = iBinder == null ? null : com.google.android.gms.internal.akx.a.a(iBinder);
        if (list5 == null) {
            list5 = Collections.emptyList();
        }
        this.p = list5;
        if (list6 == null) {
            list6 = Collections.emptyList();
        }
        this.q = list6;
    }

    private DataReadRequest(a aVar) {
        this(aVar.a, aVar.b, aVar.f, aVar.g, aVar.c, aVar.d, aVar.h, aVar.i, aVar.e, aVar.j, false, aVar.l, null, aVar.m, aVar.n);
    }

    public DataReadRequest(DataReadRequest dataReadRequest, akx com_google_android_gms_internal_akx) {
        this(dataReadRequest.c, dataReadRequest.d, dataReadRequest.e, dataReadRequest.f, dataReadRequest.g, dataReadRequest.h, dataReadRequest.i, dataReadRequest.j, dataReadRequest.k, dataReadRequest.l, dataReadRequest.m, dataReadRequest.n, com_google_android_gms_internal_akx, dataReadRequest.p, dataReadRequest.q);
    }

    public DataReadRequest(List<DataType> list, List<DataSource> list2, long j, long j2, List<DataType> list3, List<DataSource> list4, int i, long j3, DataSource dataSource, int i2, boolean z, boolean z2, akx com_google_android_gms_internal_akx, List<Device> list5, List<Integer> list6) {
        this(6, list, list2, j, j2, list3, list4, i, j3, dataSource, i2, z, z2, com_google_android_gms_internal_akx == null ? null : com_google_android_gms_internal_akx.asBinder(), list5, list6);
    }

    private boolean a(DataReadRequest dataReadRequest) {
        return this.c.equals(dataReadRequest.c) && this.d.equals(dataReadRequest.d) && this.e == dataReadRequest.e && this.f == dataReadRequest.f && this.i == dataReadRequest.i && this.h.equals(dataReadRequest.h) && this.g.equals(dataReadRequest.g) && c.a(this.k, dataReadRequest.k) && this.j == dataReadRequest.j && this.n == dataReadRequest.n && this.l == dataReadRequest.l && this.m == dataReadRequest.m && c.a(this.o, dataReadRequest.o) && c.a(this.p, dataReadRequest.p) && c.a(this.q, dataReadRequest.q);
    }

    public long a(TimeUnit timeUnit) {
        return timeUnit.convert(this.e, TimeUnit.MILLISECONDS);
    }

    public List<DataType> a() {
        return this.c;
    }

    public long b(TimeUnit timeUnit) {
        return timeUnit.convert(this.f, TimeUnit.MILLISECONDS);
    }

    public List<DataSource> b() {
        return this.d;
    }

    public long c(TimeUnit timeUnit) {
        return timeUnit.convert(this.j, TimeUnit.MILLISECONDS);
    }

    public List<DataType> c() {
        return this.g;
    }

    public List<DataSource> d() {
        return this.h;
    }

    public int e() {
        return this.i;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof DataReadRequest) && a((DataReadRequest) obj));
    }

    public DataSource f() {
        return this.k;
    }

    public int g() {
        return this.l;
    }

    public boolean h() {
        return this.n;
    }

    public int hashCode() {
        return c.a(new Object[]{Integer.valueOf(this.i), Long.valueOf(this.e), Long.valueOf(this.f)});
    }

    public boolean i() {
        return this.m;
    }

    int j() {
        return this.b;
    }

    public long k() {
        return this.f;
    }

    public long l() {
        return this.e;
    }

    public long m() {
        return this.j;
    }

    public IBinder n() {
        return this.o == null ? null : this.o.asBinder();
    }

    public List<Device> o() {
        return this.p;
    }

    public List<Integer> p() {
        return this.q;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("DataReadRequest{");
        if (!this.c.isEmpty()) {
            for (DataType c : this.c) {
                stringBuilder.append(c.c()).append(" ");
            }
        }
        if (!this.d.isEmpty()) {
            for (DataSource j : this.d) {
                stringBuilder.append(j.j()).append(" ");
            }
        }
        if (this.i != 0) {
            stringBuilder.append("bucket by ").append(Bucket.a(this.i));
            if (this.j > 0) {
                stringBuilder.append(" >").append(this.j).append(LocaleUtil.MALAY);
            }
            stringBuilder.append(": ");
        }
        if (!this.g.isEmpty()) {
            for (DataType c2 : this.g) {
                stringBuilder.append(c2.c()).append(" ");
            }
        }
        if (!this.h.isEmpty()) {
            for (DataSource j2 : this.h) {
                stringBuilder.append(j2.j()).append(" ");
            }
        }
        stringBuilder.append(String.format("(%tF %tT - %tF %tT)", new Object[]{Long.valueOf(this.e), Long.valueOf(this.e), Long.valueOf(this.f), Long.valueOf(this.f)}));
        if (this.k != null) {
            stringBuilder.append("activities: ").append(this.k.j());
        }
        if (!this.q.isEmpty()) {
            stringBuilder.append("quality: ");
            for (Integer intValue : this.q) {
                stringBuilder.append(DataSource.b(intValue.intValue())).append(" ");
            }
        }
        if (this.n) {
            stringBuilder.append(" +server");
        }
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        t.a(this, parcel, i);
    }
}
