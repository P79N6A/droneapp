package com.google.android.gms.nearby.internal.connection.dev;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.annotation.Nullable;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.internal.connection.dev.v.a;

public final class AcceptConnectionRequestParams extends AbstractSafeParcelable {
    public static final Creator<AcceptConnectionRequestParams> CREATOR = new a();
    final int a;
    @Nullable
    private final v b;
    @Nullable
    private final q c;
    private final String d;
    @Nullable
    private final byte[] e;

    AcceptConnectionRequestParams(int i, @Nullable IBinder iBinder, @Nullable IBinder iBinder2, String str, @Nullable byte[] bArr) {
        this.a = i;
        this.b = a.a(iBinder);
        this.c = q.a.a(iBinder2);
        this.d = str;
        this.e = bArr;
    }

    @Nullable
    public IBinder a() {
        return this.b == null ? null : this.b.asBinder();
    }

    @Nullable
    public IBinder b() {
        return this.c == null ? null : this.c.asBinder();
    }

    public String c() {
        return this.d;
    }

    @Nullable
    public byte[] d() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AcceptConnectionRequestParams)) {
            return false;
        }
        AcceptConnectionRequestParams acceptConnectionRequestParams = (AcceptConnectionRequestParams) obj;
        return this.a == acceptConnectionRequestParams.a && c.a(this.b, acceptConnectionRequestParams.b) && c.a(this.c, acceptConnectionRequestParams.c) && c.a(this.d, acceptConnectionRequestParams.d) && c.a(this.e, acceptConnectionRequestParams.e);
    }

    public int hashCode() {
        return c.a(new Object[]{Integer.valueOf(this.a), this.b, this.c, this.d, this.e});
    }

    public void writeToParcel(Parcel parcel, int i) {
        a.a(this, parcel, i);
    }
}
