package com.google.android.gms.fitness.result;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.io.Closeable;
import java.util.Collections;
import java.util.List;

public class ReadRawResult extends AbstractSafeParcelable implements m, Closeable {
    public static final Creator<ReadRawResult> CREATOR = new k();
    private final int a;
    private final DataHolder b;
    private final List<DataHolder> c;

    ReadRawResult(int i, DataHolder dataHolder, List<DataHolder> list) {
        List singletonList;
        this.a = i;
        this.b = dataHolder;
        if (list == null) {
            singletonList = Collections.singletonList(dataHolder);
        }
        this.c = singletonList;
    }

    public Status a() {
        return new Status(this.b.e());
    }

    int b() {
        return this.a;
    }

    DataHolder c() {
        return this.b;
    }

    public void close() {
        if (this.b != null) {
            this.b.close();
        }
        for (DataHolder close : this.c) {
            close.close();
        }
    }

    public List<DataHolder> d() {
        return this.c;
    }

    public void writeToParcel(Parcel parcel, int i) {
        k.a(this, parcel, i);
    }
}
