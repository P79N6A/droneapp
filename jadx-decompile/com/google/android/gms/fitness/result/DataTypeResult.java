package com.google.android.gms.fitness.result;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fitness.data.DataType;

public class DataTypeResult extends AbstractSafeParcelable implements m {
    public static final Creator<DataTypeResult> CREATOR = new g();
    private final int a;
    private final Status b;
    private final DataType c;

    DataTypeResult(int i, Status status, DataType dataType) {
        this.a = i;
        this.b = status;
        this.c = dataType;
    }

    public DataTypeResult(Status status, DataType dataType) {
        this.a = 2;
        this.b = status;
        this.c = dataType;
    }

    public static DataTypeResult a(Status status) {
        return new DataTypeResult(status, null);
    }

    private boolean a(DataTypeResult dataTypeResult) {
        return this.b.equals(dataTypeResult.b) && c.a(this.c, dataTypeResult.c);
    }

    public Status a() {
        return this.b;
    }

    public DataType b() {
        return this.c;
    }

    int c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof DataTypeResult) && a((DataTypeResult) obj));
    }

    public int hashCode() {
        return c.a(new Object[]{this.b, this.c});
    }

    public String toString() {
        return c.a(this).a("status", this.b).a("dataType", this.c).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        g.a(this, parcel, i);
    }
}
