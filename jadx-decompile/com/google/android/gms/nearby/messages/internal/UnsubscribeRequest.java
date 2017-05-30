package com.google.android.gms.nearby.messages.internal;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.annotation.VisibleForTesting;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.messages.internal.j.a;

public final class UnsubscribeRequest extends AbstractSafeParcelable {
    public static final Creator<UnsubscribeRequest> CREATOR = new aa();
    final int a;
    public final j b;
    public final k c;
    public final PendingIntent d;
    public final int e;
    @Deprecated
    public final String f;
    @Deprecated
    public final String g;
    @Deprecated
    public final boolean h;
    @Deprecated
    public final ClientAppContext i;

    UnsubscribeRequest(int i, IBinder iBinder, IBinder iBinder2, PendingIntent pendingIntent, int i2, String str, String str2, boolean z, ClientAppContext clientAppContext) {
        this.a = i;
        this.b = a.a(iBinder);
        this.c = k.a.a(iBinder2);
        this.d = pendingIntent;
        this.e = i2;
        this.f = str;
        this.g = str2;
        this.h = z;
        this.i = ClientAppContext.a(clientAppContext, str2, str, z);
    }

    @VisibleForTesting
    public UnsubscribeRequest(IBinder iBinder, IBinder iBinder2, PendingIntent pendingIntent, int i) {
        this(1, iBinder, iBinder2, pendingIntent, i, null, null, false, null);
    }

    IBinder a() {
        return this.c.asBinder();
    }

    IBinder b() {
        return this.b == null ? null : this.b.asBinder();
    }

    public void writeToParcel(Parcel parcel, int i) {
        aa.a(this, parcel, i);
    }
}
