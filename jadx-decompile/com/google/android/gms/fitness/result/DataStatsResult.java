package com.google.android.gms.fitness.result;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;
import java.util.Locale;

public class DataStatsResult extends AbstractSafeParcelable implements m {
    public static final Creator<DataStatsResult> CREATOR = new f();
    private final int a;
    private final Status b;
    private final List<DataSourceStatsResult> c;

    DataStatsResult(int i, Status status, List<DataSourceStatsResult> list) {
        this.a = i;
        this.b = status;
        this.c = list;
    }

    public Status a() {
        return this.b;
    }

    int b() {
        return this.a;
    }

    List<DataSourceStatsResult> c() {
        return this.c;
    }

    public String toString() {
        return String.format(Locale.getDefault(), "DataStatsResult{%s %d sources}", new Object[]{this.b, Integer.valueOf(this.c.size())});
    }

    public void writeToParcel(Parcel parcel, int i) {
        f.a(this, parcel, i);
    }
}
