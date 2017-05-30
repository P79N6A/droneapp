package com.google.android.gms.nearby.connection.dev;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class PayloadTransferUpdate extends AbstractSafeParcelable {
    public static final Creator<PayloadTransferUpdate> CREATOR = new f();
    final int a;
    private final long b;
    private final int c;
    private final long d;
    private final long e;

    PayloadTransferUpdate(int i, long j, int i2, long j2, long j3) {
        this.a = i;
        this.b = j;
        this.c = i2;
        this.d = j2;
        this.e = j3;
    }

    public long a() {
        return this.b;
    }

    public int b() {
        return this.c;
    }

    public long c() {
        return this.d;
    }

    public long d() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PayloadTransferUpdate)) {
            return false;
        }
        PayloadTransferUpdate payloadTransferUpdate = (PayloadTransferUpdate) obj;
        return this.a == payloadTransferUpdate.a && c.a(Long.valueOf(this.b), Long.valueOf(payloadTransferUpdate.b)) && c.a(Integer.valueOf(this.c), Integer.valueOf(payloadTransferUpdate.c)) && c.a(Long.valueOf(this.d), Long.valueOf(payloadTransferUpdate.d)) && c.a(Long.valueOf(this.e), Long.valueOf(payloadTransferUpdate.e));
    }

    public int hashCode() {
        return c.a(new Object[]{Integer.valueOf(this.a), Long.valueOf(this.b), Integer.valueOf(this.c), Long.valueOf(this.d), Long.valueOf(this.e)});
    }

    public void writeToParcel(Parcel parcel, int i) {
        f.a(this, parcel, i);
    }
}
