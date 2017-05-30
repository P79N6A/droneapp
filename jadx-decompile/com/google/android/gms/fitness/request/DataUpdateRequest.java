package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fitness.data.DataPoint;
import com.google.android.gms.fitness.data.DataSet;
import com.google.android.gms.internal.alq;
import java.util.concurrent.TimeUnit;

public class DataUpdateRequest extends AbstractSafeParcelable {
    public static final Creator<DataUpdateRequest> CREATOR = new aa();
    private final int a;
    private final long b;
    private final long c;
    private final DataSet d;
    private final alq e;

    public static class a {
        private long a;
        private long b;
        private DataSet c;

        private void b() {
            d.a(this.a, "Must set a non-zero value for startTimeMillis/startTime");
            d.a(this.b, "Must set a non-zero value for endTimeMillis/endTime");
            d.a(this.c, "Must set the data set");
            for (DataPoint dataPoint : this.c.d()) {
                long b = dataPoint.b(TimeUnit.MILLISECONDS);
                long c = dataPoint.c(TimeUnit.MILLISECONDS);
                int i = (b > c || ((b != 0 && b < this.a) || ((b != 0 && b > this.b) || c > this.b || c < this.a))) ? 1 : 0;
                d.a(i == 0, "Data Point's startTimeMillis %d, endTimeMillis %d should lie between timeRange provided in the request. StartTimeMillis %d, EndTimeMillis: %d", new Object[]{Long.valueOf(b), Long.valueOf(c), Long.valueOf(this.a), Long.valueOf(this.b)});
            }
        }

        public a a(long j, long j2, TimeUnit timeUnit) {
            d.b(j > 0, "Invalid start time :%d", new Object[]{Long.valueOf(j)});
            d.b(j2 >= j, "Invalid end time :%d", new Object[]{Long.valueOf(j2)});
            this.a = timeUnit.toMillis(j);
            this.b = timeUnit.toMillis(j2);
            return this;
        }

        public a a(DataSet dataSet) {
            d.a(dataSet, "Must set the data set");
            this.c = dataSet;
            return this;
        }

        public DataUpdateRequest a() {
            b();
            return new DataUpdateRequest();
        }
    }

    DataUpdateRequest(int i, long j, long j2, DataSet dataSet, IBinder iBinder) {
        this.a = i;
        this.b = j;
        this.c = j2;
        this.d = dataSet;
        this.e = com.google.android.gms.internal.alq.a.a(iBinder);
    }

    public DataUpdateRequest(long j, long j2, DataSet dataSet, IBinder iBinder) {
        this.a = 1;
        this.b = j;
        this.c = j2;
        this.d = dataSet;
        this.e = com.google.android.gms.internal.alq.a.a(iBinder);
    }

    private DataUpdateRequest(a aVar) {
        this(aVar.a, aVar.b, aVar.c, null);
    }

    public DataUpdateRequest(DataUpdateRequest dataUpdateRequest, IBinder iBinder) {
        this(dataUpdateRequest.a(), dataUpdateRequest.b(), dataUpdateRequest.c(), iBinder);
    }

    private boolean a(DataUpdateRequest dataUpdateRequest) {
        return this.b == dataUpdateRequest.b && this.c == dataUpdateRequest.c && c.a(this.d, dataUpdateRequest.d);
    }

    public long a() {
        return this.b;
    }

    public long a(TimeUnit timeUnit) {
        return timeUnit.convert(this.b, TimeUnit.MILLISECONDS);
    }

    public long b() {
        return this.c;
    }

    public long b(TimeUnit timeUnit) {
        return timeUnit.convert(this.c, TimeUnit.MILLISECONDS);
    }

    public DataSet c() {
        return this.d;
    }

    public IBinder d() {
        return this.e == null ? null : this.e.asBinder();
    }

    int e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof DataUpdateRequest) && a((DataUpdateRequest) obj));
    }

    public int hashCode() {
        return c.a(new Object[]{Long.valueOf(this.b), Long.valueOf(this.c), this.d});
    }

    public String toString() {
        return c.a(this).a("startTimeMillis", Long.valueOf(this.b)).a("endTimeMillis", Long.valueOf(this.c)).a("dataSet", this.d).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        aa.a(this, parcel, i);
    }
}
