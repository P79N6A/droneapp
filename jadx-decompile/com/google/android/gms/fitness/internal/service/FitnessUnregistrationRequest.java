package com.google.android.gms.fitness.internal.service;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fitness.data.DataSource;

public class FitnessUnregistrationRequest extends AbstractSafeParcelable {
    public static final Creator<FitnessUnregistrationRequest> CREATOR = new b();
    private final int a;
    private final DataSource b;

    FitnessUnregistrationRequest(int i, DataSource dataSource) {
        this.a = i;
        this.b = dataSource;
    }

    public DataSource a() {
        return this.b;
    }

    int b() {
        return this.a;
    }

    public String toString() {
        return String.format("ApplicationUnregistrationRequest{%s}", new Object[]{this.b});
    }

    public void writeToParcel(Parcel parcel, int i) {
        b.a(this, parcel, i);
    }
}
