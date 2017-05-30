package com.google.android.gms.nearby.internal.connection.dev;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable.Creator;
import android.support.annotation.Nullable;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class ParcelablePayload extends AbstractSafeParcelable {
    public static final Creator<ParcelablePayload> CREATOR = new ah();
    final int a;
    private final long b;
    private final int c;
    @Nullable
    private final byte[] d;
    @Nullable
    private final ParcelFileDescriptor e;

    ParcelablePayload(int i, long j, int i2, @Nullable byte[] bArr, @Nullable ParcelFileDescriptor parcelFileDescriptor) {
        this.a = i;
        this.b = j;
        this.c = i2;
        this.d = bArr;
        this.e = parcelFileDescriptor;
    }

    public long a() {
        return this.b;
    }

    public int b() {
        return this.c;
    }

    @Nullable
    public byte[] c() {
        return this.d;
    }

    @Nullable
    public ParcelFileDescriptor d() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ParcelablePayload)) {
            return false;
        }
        ParcelablePayload parcelablePayload = (ParcelablePayload) obj;
        return this.a == parcelablePayload.a && c.a(Long.valueOf(this.b), Long.valueOf(parcelablePayload.b)) && c.a(Integer.valueOf(this.c), Integer.valueOf(parcelablePayload.c)) && c.a(this.d, parcelablePayload.d) && c.a(this.e, parcelablePayload.e);
    }

    public int hashCode() {
        return c.a(new Object[]{Integer.valueOf(this.a), Long.valueOf(this.b), Integer.valueOf(this.c), this.d, this.e});
    }

    public void writeToParcel(Parcel parcel, int i) {
        ah.a(this, parcel, i);
    }
}
