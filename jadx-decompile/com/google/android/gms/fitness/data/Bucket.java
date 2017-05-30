package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.fimi.soul.utils.a.b.a;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fitness.d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Bucket extends AbstractSafeParcelable {
    public static final Creator<Bucket> CREATOR = new i();
    public static final int a = 1;
    public static final int b = 2;
    public static final int c = 3;
    public static final int d = 4;
    private final int e;
    private final long f;
    private final long g;
    private final Session h;
    private final int i;
    private final List<DataSet> j;
    private final int k;
    private boolean l;

    Bucket(int i, long j, long j2, Session session, int i2, List<DataSet> list, int i3, boolean z) {
        this.l = false;
        this.e = i;
        this.f = j;
        this.g = j2;
        this.h = session;
        this.i = i2;
        this.j = list;
        this.k = i3;
        this.l = z;
    }

    public Bucket(RawBucket rawBucket, List<DataSource> list) {
        this(2, rawBucket.b, rawBucket.c, rawBucket.d, rawBucket.e, a(rawBucket.f, list), rawBucket.g, rawBucket.h);
    }

    public static String a(int i) {
        switch (i) {
            case 0:
                return "unknown";
            case 1:
                return a.i;
            case 2:
                return "session";
            case 3:
                return "type";
            case 4:
                return "segment";
            default:
                return "bug";
        }
    }

    private static List<DataSet> a(Collection<RawDataSet> collection, List<DataSource> list) {
        List<DataSet> arrayList = new ArrayList(collection.size());
        for (RawDataSet dataSet : collection) {
            arrayList.add(new DataSet(dataSet, list));
        }
        return arrayList;
    }

    private boolean b(Bucket bucket) {
        return this.f == bucket.f && this.g == bucket.g && this.i == bucket.i && c.a(this.j, bucket.j) && this.k == bucket.k && this.l == bucket.l;
    }

    public long a(TimeUnit timeUnit) {
        return timeUnit.convert(this.f, TimeUnit.MILLISECONDS);
    }

    public DataSet a(DataType dataType) {
        for (DataSet dataSet : this.j) {
            if (dataSet.c().equals(dataType)) {
                return dataSet;
            }
        }
        return null;
    }

    public Session a() {
        return this.h;
    }

    public boolean a(Bucket bucket) {
        return this.f == bucket.f && this.g == bucket.g && this.i == bucket.i && this.k == bucket.k;
    }

    public long b(TimeUnit timeUnit) {
        return timeUnit.convert(this.g, TimeUnit.MILLISECONDS);
    }

    public String b() {
        return d.a(this.i);
    }

    public int c() {
        return this.i;
    }

    public List<DataSet> d() {
        return this.j;
    }

    public int e() {
        return this.k;
    }

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof Bucket) && b((Bucket) obj));
    }

    public boolean f() {
        if (this.l) {
            return true;
        }
        for (DataSet f : this.j) {
            if (f.f()) {
                return true;
            }
        }
        return false;
    }

    int g() {
        return this.e;
    }

    public long h() {
        return this.f;
    }

    public int hashCode() {
        return c.a(new Object[]{Long.valueOf(this.f), Long.valueOf(this.g), Integer.valueOf(this.i), Integer.valueOf(this.k)});
    }

    public long i() {
        return this.g;
    }

    public String toString() {
        return c.a(this).a("startTime", Long.valueOf(this.f)).a("endTime", Long.valueOf(this.g)).a("activity", Integer.valueOf(this.i)).a("dataSets", this.j).a("bucketType", a(this.k)).a("serverHasMoreData", Boolean.valueOf(this.l)).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        i.a(this, parcel, i);
    }
}
