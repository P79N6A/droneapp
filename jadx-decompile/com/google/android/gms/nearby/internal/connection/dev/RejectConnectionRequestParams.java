package com.google.android.gms.nearby.internal.connection.dev;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.annotation.Nullable;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.internal.connection.dev.v.a;

public final class RejectConnectionRequestParams extends AbstractSafeParcelable {
    public static final Creator<RejectConnectionRequestParams> CREATOR = new b();
    final int a;
    @Nullable
    private final v b;
    private final String c;

    RejectConnectionRequestParams(int i, @Nullable IBinder iBinder, String str) {
        this.a = i;
        this.b = a.a(iBinder);
        this.c = str;
    }

    @Nullable
    public IBinder a() {
        return this.b == null ? null : this.b.asBinder();
    }

    public String b() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RejectConnectionRequestParams)) {
            return false;
        }
        RejectConnectionRequestParams rejectConnectionRequestParams = (RejectConnectionRequestParams) obj;
        return this.a == rejectConnectionRequestParams.a && c.a(this.b, rejectConnectionRequestParams.b) && c.a(this.c, rejectConnectionRequestParams.c);
    }

    public int hashCode() {
        return c.a(new Object[]{Integer.valueOf(this.a), this.b, this.c});
    }

    public void writeToParcel(Parcel parcel, int i) {
        b.a(this, parcel, i);
    }
}
