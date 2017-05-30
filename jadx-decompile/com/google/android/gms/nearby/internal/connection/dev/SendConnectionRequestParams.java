package com.google.android.gms.nearby.internal.connection.dev;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.annotation.Nullable;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.internal.connection.dev.v.a;

public final class SendConnectionRequestParams extends AbstractSafeParcelable {
    public static final Creator<SendConnectionRequestParams> CREATOR = new c();
    final int a;
    @Nullable
    private final v b;
    @Nullable
    private final q c;
    @Nullable
    private final r d;
    private final String e;
    private final String f;
    @Nullable
    private final byte[] g;

    SendConnectionRequestParams(int i, @Nullable IBinder iBinder, @Nullable IBinder iBinder2, @Nullable IBinder iBinder3, String str, String str2, @Nullable byte[] bArr) {
        this.a = i;
        this.b = a.a(iBinder);
        this.c = q.a.a(iBinder2);
        this.d = r.a.a(iBinder3);
        this.e = str;
        this.f = str2;
        this.g = bArr;
    }

    @Nullable
    public IBinder a() {
        return this.b == null ? null : this.b.asBinder();
    }

    @Nullable
    public IBinder b() {
        return this.c == null ? null : this.c.asBinder();
    }

    @Nullable
    public IBinder c() {
        return this.d == null ? null : this.d.asBinder();
    }

    public String d() {
        return this.e;
    }

    public String e() {
        return this.f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SendConnectionRequestParams)) {
            return false;
        }
        SendConnectionRequestParams sendConnectionRequestParams = (SendConnectionRequestParams) obj;
        return this.a == sendConnectionRequestParams.a && c.a(this.b, sendConnectionRequestParams.b) && c.a(this.c, sendConnectionRequestParams.c) && c.a(this.d, sendConnectionRequestParams.d) && c.a(this.e, sendConnectionRequestParams.e) && c.a(this.f, sendConnectionRequestParams.f) && c.a(this.g, sendConnectionRequestParams.g);
    }

    @Nullable
    public byte[] f() {
        return this.g;
    }

    public int hashCode() {
        return c.a(new Object[]{Integer.valueOf(this.a), this.b, this.c, this.d, this.e, this.f, this.g});
    }

    public void writeToParcel(Parcel parcel, int i) {
        c.a(this, parcel, i);
    }
}
