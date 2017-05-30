package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.alm;
import com.google.android.gms.internal.alm.a;
import java.util.List;

public class ReadRawRequest extends AbstractSafeParcelable {
    public static final Creator<ReadRawRequest> CREATOR = new ak();
    private final int a;
    private final alm b;
    private final List<DataSourceQueryParams> c;
    private final boolean d;
    private final boolean e;

    ReadRawRequest(int i, IBinder iBinder, List<DataSourceQueryParams> list, boolean z, boolean z2) {
        this.a = i;
        this.b = a.a(iBinder);
        this.c = list;
        this.d = z;
        this.e = z2;
    }

    public List<DataSourceQueryParams> a() {
        return this.c;
    }

    int b() {
        return this.a;
    }

    public IBinder c() {
        return this.b != null ? this.b.asBinder() : null;
    }

    public boolean d() {
        return this.e;
    }

    public boolean e() {
        return this.d;
    }

    public String toString() {
        return c.a(this).a("params", this.c).a("server", Boolean.valueOf(this.e)).a("flush", Boolean.valueOf(this.d)).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        ak.a(this, parcel, i);
    }
}
