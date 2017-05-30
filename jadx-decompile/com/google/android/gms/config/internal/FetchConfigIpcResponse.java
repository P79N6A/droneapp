package com.google.android.gms.config.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class FetchConfigIpcResponse extends AbstractSafeParcelable {
    public static final Creator<FetchConfigIpcResponse> CREATOR = new h();
    private final int a;
    private final int b;
    private final DataHolder c;
    private final long d;

    FetchConfigIpcResponse(int i, int i2, DataHolder dataHolder, long j) {
        this.a = i;
        this.b = i2;
        this.c = dataHolder;
        this.d = j;
    }

    public int a() {
        return this.a;
    }

    public int b() {
        return this.b;
    }

    public DataHolder c() {
        return this.c;
    }

    public long d() {
        return this.d;
    }

    public void e() {
        if (this.c != null && !this.c.h()) {
            this.c.close();
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        h.a(this, parcel, i);
    }
}
