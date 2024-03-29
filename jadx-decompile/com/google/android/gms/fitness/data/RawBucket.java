package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

@KeepName
public final class RawBucket extends AbstractSafeParcelable {
    public static final Creator<RawBucket> CREATOR = new ab();
    final int a;
    public final long b;
    public final long c;
    public final Session d;
    public final int e;
    public final List<RawDataSet> f;
    public final int g;
    public final boolean h;

    public RawBucket(int i, long j, long j2, Session session, int i2, List<RawDataSet> list, int i3, boolean z) {
        this.a = i;
        this.b = j;
        this.c = j2;
        this.d = session;
        this.e = i2;
        this.f = list;
        this.g = i3;
        this.h = z;
    }

    public RawBucket(Bucket bucket, List<DataSource> list, List<DataType> list2) {
        this.a = 2;
        this.b = bucket.a(TimeUnit.MILLISECONDS);
        this.c = bucket.b(TimeUnit.MILLISECONDS);
        this.d = bucket.a();
        this.e = bucket.c();
        this.g = bucket.e();
        this.h = bucket.f();
        List<DataSet> d = bucket.d();
        this.f = new ArrayList(d.size());
        for (DataSet rawDataSet : d) {
            this.f.add(new RawDataSet(rawDataSet, list, list2));
        }
    }

    private boolean a(RawBucket rawBucket) {
        return this.b == rawBucket.b && this.c == rawBucket.c && this.e == rawBucket.e && c.a(this.f, rawBucket.f) && this.g == rawBucket.g && this.h == rawBucket.h;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof RawBucket) && a((RawBucket) obj));
    }

    public int hashCode() {
        return c.a(new Object[]{Long.valueOf(this.b), Long.valueOf(this.c), Integer.valueOf(this.g)});
    }

    public String toString() {
        return c.a(this).a("startTime", Long.valueOf(this.b)).a("endTime", Long.valueOf(this.c)).a("activity", Integer.valueOf(this.e)).a("dataSets", this.f).a("bucketType", Integer.valueOf(this.g)).a("serverHasMoreData", Boolean.valueOf(this.h)).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        ab.a(this, parcel, i);
    }
}
