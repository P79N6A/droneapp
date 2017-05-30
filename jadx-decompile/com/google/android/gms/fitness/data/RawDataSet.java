package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.akf;
import java.util.List;

@KeepName
public final class RawDataSet extends AbstractSafeParcelable {
    public static final Creator<RawDataSet> CREATOR = new ad();
    final int a;
    public final int b;
    public final int c;
    public final List<RawDataPoint> d;
    public final boolean e;

    public RawDataSet(int i, int i2, int i3, List<RawDataPoint> list, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = list;
        this.e = z;
    }

    public RawDataSet(DataSet dataSet, List<DataSource> list, List<DataType> list2) {
        this.a = 3;
        this.d = dataSet.a((List) list);
        this.e = dataSet.f();
        this.b = akf.a(dataSet.b(), list);
        this.c = akf.a(dataSet.c(), list2);
    }

    private boolean a(RawDataSet rawDataSet) {
        return this.b == rawDataSet.b && this.e == rawDataSet.e && c.a(this.d, rawDataSet.d);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof RawDataSet) && a((RawDataSet) obj));
    }

    public int hashCode() {
        return c.a(new Object[]{Integer.valueOf(this.b)});
    }

    public String toString() {
        return String.format("RawDataSet{%s@[%s]}", new Object[]{Integer.valueOf(this.b), this.d});
    }

    public void writeToParcel(Parcel parcel, int i) {
        ad.a(this, parcel, i);
    }
}
