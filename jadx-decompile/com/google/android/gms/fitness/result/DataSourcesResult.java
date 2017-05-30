package com.google.android.gms.fitness.result;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DataSourcesResult extends AbstractSafeParcelable implements m {
    public static final Creator<DataSourcesResult> CREATOR = new e();
    private final int a;
    private final List<DataSource> b;
    private final Status c;

    DataSourcesResult(int i, List<DataSource> list, Status status) {
        this.a = i;
        this.b = Collections.unmodifiableList(list);
        this.c = status;
    }

    public DataSourcesResult(List<DataSource> list, Status status) {
        this.a = 3;
        this.b = Collections.unmodifiableList(list);
        this.c = status;
    }

    public static DataSourcesResult a(Status status) {
        return new DataSourcesResult(Collections.emptyList(), status);
    }

    private boolean a(DataSourcesResult dataSourcesResult) {
        return this.c.equals(dataSourcesResult.c) && c.a(this.b, dataSourcesResult.b);
    }

    public Status a() {
        return this.c;
    }

    public List<DataSource> a(DataType dataType) {
        List arrayList = new ArrayList();
        for (DataSource dataSource : this.b) {
            if (dataSource.a().equals(dataType)) {
                arrayList.add(dataSource);
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    public List<DataSource> b() {
        return this.b;
    }

    int c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof DataSourcesResult) && a((DataSourcesResult) obj));
    }

    public int hashCode() {
        return c.a(new Object[]{this.c, this.b});
    }

    public String toString() {
        return c.a(this).a("status", this.c).a("dataSources", this.b).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        e.a(this, parcel, i);
    }
}
