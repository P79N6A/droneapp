package com.google.android.gms.fitness.internal.service;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fitness.data.DataType;
import java.util.Collections;
import java.util.List;

public class FitnessDataSourcesRequest extends AbstractSafeParcelable {
    public static final Creator<FitnessDataSourcesRequest> CREATOR = new a();
    private final int a;
    private final List<DataType> b;

    FitnessDataSourcesRequest(int i, List<DataType> list) {
        this.a = i;
        this.b = list;
    }

    public List<DataType> a() {
        return Collections.unmodifiableList(this.b);
    }

    int b() {
        return this.a;
    }

    public String toString() {
        return c.a(this).a("dataTypes", this.b).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        a.a(this, parcel, i);
    }
}
