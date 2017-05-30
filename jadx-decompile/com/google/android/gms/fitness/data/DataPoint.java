package com.google.android.gms.fitness.data;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.Log;
import com.fimi.soul.module.setting.newhand.b;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.internal.ake;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final class DataPoint extends AbstractSafeParcelable {
    public static final Creator<DataPoint> CREATOR = new l();
    private final int a;
    private final DataSource b;
    private long c;
    private long d;
    private final Value[] e;
    private DataSource f;
    private long g;
    private long h;

    DataPoint(int i, DataSource dataSource, long j, long j2, Value[] valueArr, DataSource dataSource2, long j3, long j4) {
        this.a = i;
        this.b = dataSource;
        this.f = dataSource2;
        this.c = j;
        this.d = j2;
        this.e = valueArr;
        this.g = j3;
        this.h = j4;
    }

    private DataPoint(DataSource dataSource) {
        this.a = 4;
        this.b = (DataSource) d.a(dataSource, "Data source cannot be null");
        List<Field> b = dataSource.a().b();
        this.e = new Value[b.size()];
        int i = 0;
        for (Field b2 : b) {
            this.e[i] = new Value(b2.b());
            i++;
        }
    }

    public DataPoint(DataSource dataSource, DataSource dataSource2, RawDataPoint rawDataPoint) {
        this(4, dataSource, a(Long.valueOf(rawDataPoint.b), 0), a(Long.valueOf(rawDataPoint.c), 0), rawDataPoint.d, dataSource2, a(Long.valueOf(rawDataPoint.g), 0), a(Long.valueOf(rawDataPoint.h), 0));
    }

    DataPoint(List<DataSource> list, RawDataPoint rawDataPoint) {
        this(a((List) list, rawDataPoint.e), a((List) list, rawDataPoint.f), rawDataPoint);
    }

    private static long a(Long l, long j) {
        return l != null ? l.longValue() : j;
    }

    public static DataPoint a(Intent intent) {
        return intent == null ? null : (DataPoint) c.a(intent, "com.google.android.gms.fitness.EXTRA_DATA_POINT", CREATOR);
    }

    public static DataPoint a(DataSource dataSource) {
        return new DataPoint(dataSource);
    }

    private static DataSource a(List<DataSource> list, int i) {
        return (i < 0 || i >= list.size()) ? null : (DataSource) list.get(i);
    }

    private boolean a(DataPoint dataPoint) {
        return com.google.android.gms.common.internal.c.a(this.b, dataPoint.b) && this.c == dataPoint.c && this.d == dataPoint.d && Arrays.equals(this.e, dataPoint.e) && com.google.android.gms.common.internal.c.a(d(), dataPoint.d());
    }

    private void b(int i) {
        d.b(i == b().b().size(), "Attempting to insert %s values, but needed %s: %s", new Object[]{Integer.valueOf(i), Integer.valueOf(b().b().size()), b().b()});
    }

    private boolean l() {
        return b() == DataType.p;
    }

    public long a(TimeUnit timeUnit) {
        return timeUnit.convert(this.c, TimeUnit.NANOSECONDS);
    }

    public DataPoint a(long j, long j2, TimeUnit timeUnit) {
        this.d = timeUnit.toNanos(j);
        this.c = timeUnit.toNanos(j2);
        return this;
    }

    public DataPoint a(long j, TimeUnit timeUnit) {
        this.c = timeUnit.toNanos(j);
        if (l() && ake.a(timeUnit)) {
            Log.w("Fitness", "Storing location at more than millisecond granularity is not supported. Extra precision is lost as the value is converted to milliseconds.");
            this.c = ake.a(this.c, TimeUnit.NANOSECONDS, TimeUnit.MILLISECONDS);
        }
        return this;
    }

    public DataPoint a(float... fArr) {
        b(fArr.length);
        for (int i = 0; i < fArr.length; i++) {
            this.e[i].a(fArr[i]);
        }
        return this;
    }

    public DataPoint a(int... iArr) {
        b(iArr.length);
        for (int i = 0; i < iArr.length; i++) {
            this.e[i].a(iArr[i]);
        }
        return this;
    }

    public Value a(int i) {
        DataType b = b();
        if (i >= 0 && i < b.b().size()) {
            return this.e[i];
        }
        throw new IllegalArgumentException(String.format("fieldIndex %s is out of range for %s", new Object[]{Integer.valueOf(i), b}));
    }

    public Value a(Field field) {
        return this.e[b().a(field)];
    }

    public Value[] a() {
        return this.e;
    }

    public long b(TimeUnit timeUnit) {
        return timeUnit.convert(this.d, TimeUnit.NANOSECONDS);
    }

    public DataType b() {
        return this.b.a();
    }

    public long c(TimeUnit timeUnit) {
        return timeUnit.convert(this.c, TimeUnit.NANOSECONDS);
    }

    public DataSource c() {
        return this.b;
    }

    public DataSource d() {
        return this.f != null ? this.f : this.b;
    }

    public DataSource e() {
        return this.f;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof DataPoint) && a((DataPoint) obj));
    }

    public long f() {
        return this.g;
    }

    public long g() {
        return this.h;
    }

    public void h() {
        d.b(b().a().equals(c().a().a()), "Conflicting data types found %s vs %s", new Object[]{b(), b()});
        d.b(this.c > 0, "Data point does not have the timestamp set: %s", new Object[]{this});
        d.b(this.d <= this.c, "Data point with start time greater than end time found: %s", new Object[]{this});
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.c.a(new Object[]{this.b, Long.valueOf(this.c), Long.valueOf(this.d)});
    }

    public int i() {
        return this.a;
    }

    public long j() {
        return this.c;
    }

    public long k() {
        return this.d;
    }

    public String toString() {
        String str = "DataPoint{%s@[%s, %s,raw=%s,insert=%s](%s %s)}";
        Object[] objArr = new Object[7];
        objArr[0] = Arrays.toString(this.e);
        objArr[1] = Long.valueOf(this.d);
        objArr[2] = Long.valueOf(this.c);
        objArr[3] = Long.valueOf(this.g);
        objArr[4] = Long.valueOf(this.h);
        objArr[5] = this.b.j();
        objArr[6] = this.f != null ? this.f.j() : b.ar;
        return String.format(str, objArr);
    }

    public void writeToParcel(Parcel parcel, int i) {
        l.a(this, parcel, i);
    }
}
