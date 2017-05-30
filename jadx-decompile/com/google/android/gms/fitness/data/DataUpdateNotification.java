package com.google.android.gms.fitness.data;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.c;
import java.util.concurrent.TimeUnit;

public class DataUpdateNotification extends AbstractSafeParcelable {
    public static final Creator<DataUpdateNotification> CREATOR = new q();
    public static final String a = "com.google.android.gms.fitness.DATA_UPDATE_NOTIFICATION";
    public static final int b = 1;
    public static final int c = 2;
    public static final int d = 3;
    public static final String e = "vnd.google.fitness.data_udpate_notification";
    final int f;
    private final long g;
    private final long h;
    private final int i;
    private final DataSource j;
    private final DataType k;

    DataUpdateNotification(int i, long j, long j2, int i2, DataSource dataSource, DataType dataType) {
        this.f = i;
        this.g = j;
        this.h = j2;
        this.i = i2;
        this.j = dataSource;
        this.k = dataType;
    }

    public static DataUpdateNotification a(Intent intent) {
        return (DataUpdateNotification) c.a(intent, e, CREATOR);
    }

    private boolean a(DataUpdateNotification dataUpdateNotification) {
        return this.g == dataUpdateNotification.g && this.h == dataUpdateNotification.h && this.i == dataUpdateNotification.i && com.google.android.gms.common.internal.c.a(this.j, dataUpdateNotification.j) && com.google.android.gms.common.internal.c.a(this.k, dataUpdateNotification.k);
    }

    public long a() {
        return this.g;
    }

    public long a(TimeUnit timeUnit) {
        return timeUnit.convert(this.g, TimeUnit.NANOSECONDS);
    }

    public long b() {
        return this.h;
    }

    public long b(TimeUnit timeUnit) {
        return timeUnit.convert(this.h, TimeUnit.NANOSECONDS);
    }

    public int c() {
        return this.i;
    }

    public DataSource d() {
        return this.j;
    }

    public DataType e() {
        return this.k;
    }

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof DataUpdateNotification) && a((DataUpdateNotification) obj));
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.c.a(new Object[]{Long.valueOf(this.g), Long.valueOf(this.h), Integer.valueOf(this.i), this.j, this.k});
    }

    public String toString() {
        return com.google.android.gms.common.internal.c.a(this).a("updateStartTimeNanos", Long.valueOf(this.g)).a("updateEndTimeNanos", Long.valueOf(this.h)).a("operationType", Integer.valueOf(this.i)).a("dataSource", this.j).a("dataType", this.k).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        q.a(this, parcel, i);
    }
}
