package com.google.android.gms.fitness.result;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.annotation.Nullable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fitness.data.DataSet;
import com.google.android.gms.fitness.data.DataSource.a;
import com.google.android.gms.fitness.data.DataType;

public class DailyTotalResult extends AbstractSafeParcelable implements m {
    public static final Creator<DailyTotalResult> CREATOR = new b();
    private final int a;
    private final Status b;
    private final DataSet c;

    DailyTotalResult(int i, Status status, DataSet dataSet) {
        this.a = i;
        this.b = status;
        this.c = dataSet;
    }

    public DailyTotalResult(DataSet dataSet, Status status) {
        this.a = 1;
        this.b = status;
        this.c = dataSet;
    }

    public static DailyTotalResult a(Status status, DataType dataType) {
        return new DailyTotalResult(DataSet.a(new a().a(dataType).a(1).a()), status);
    }

    private boolean a(DailyTotalResult dailyTotalResult) {
        return this.b.equals(dailyTotalResult.b) && c.a(this.c, dailyTotalResult.c);
    }

    public Status a() {
        return this.b;
    }

    @Nullable
    public DataSet b() {
        return this.c;
    }

    int c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof DailyTotalResult) && a((DailyTotalResult) obj));
    }

    public int hashCode() {
        return c.a(new Object[]{this.b, this.c});
    }

    public String toString() {
        return c.a(this).a("status", this.b).a("dataPoint", this.c).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        b.a(this, parcel, i);
    }
}
