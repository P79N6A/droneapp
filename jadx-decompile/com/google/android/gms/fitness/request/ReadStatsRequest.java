package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.internal.aln;
import com.google.android.gms.internal.aln.a;
import java.util.List;

public class ReadStatsRequest extends AbstractSafeParcelable {
    public static final Creator<ReadStatsRequest> CREATOR = new al();
    private final int a;
    private final aln b;
    private final List<DataSource> c;

    ReadStatsRequest(int i, IBinder iBinder, List<DataSource> list) {
        this.a = i;
        this.b = a.a(iBinder);
        this.c = list;
    }

    int a() {
        return this.a;
    }

    public IBinder b() {
        return this.b.asBinder();
    }

    public List<DataSource> c() {
        return this.c;
    }

    public String toString() {
        return String.format("ReadStatsRequest", new Object[0]);
    }

    public void writeToParcel(Parcel parcel, int i) {
        al.a(this, parcel, i);
    }
}
