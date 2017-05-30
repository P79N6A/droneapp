package com.google.android.gms.nearby.internal.connection.dev;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.annotation.Nullable;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.internal.connection.dev.v.a;
import java.util.Arrays;

public final class SendPayloadParams extends AbstractSafeParcelable {
    public static final Creator<SendPayloadParams> CREATOR = new d();
    final int a;
    @Nullable
    private final v b;
    private final String[] c;
    @Nullable
    private final ParcelablePayload d;
    private final boolean e;

    SendPayloadParams(int i, @Nullable IBinder iBinder, String[] strArr, @Nullable ParcelablePayload parcelablePayload, boolean z) {
        this.a = i;
        this.b = a.a(iBinder);
        this.c = strArr;
        this.d = parcelablePayload;
        this.e = z;
    }

    @Nullable
    public IBinder a() {
        return this.b == null ? null : this.b.asBinder();
    }

    public String[] b() {
        return this.c;
    }

    @Nullable
    public ParcelablePayload c() {
        return this.d;
    }

    public boolean d() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SendPayloadParams)) {
            return false;
        }
        SendPayloadParams sendPayloadParams = (SendPayloadParams) obj;
        return this.a == sendPayloadParams.a && c.a(this.b, sendPayloadParams.b) && Arrays.equals(this.c, sendPayloadParams.c) && c.a(this.d, sendPayloadParams.d) && c.a(Boolean.valueOf(this.e), Boolean.valueOf(sendPayloadParams.e));
    }

    public int hashCode() {
        return c.a(new Object[]{Integer.valueOf(this.a), this.b, this.c, this.d, Boolean.valueOf(this.e)});
    }

    public void writeToParcel(Parcel parcel, int i) {
        d.a(this, parcel, i);
    }
}
