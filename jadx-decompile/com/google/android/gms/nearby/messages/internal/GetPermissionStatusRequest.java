package com.google.android.gms.nearby.messages.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.messages.internal.k.a;

@Deprecated
public class GetPermissionStatusRequest extends AbstractSafeParcelable {
    public static final Creator<GetPermissionStatusRequest> CREATOR = new g();
    final int a;
    public final k b;
    @Deprecated
    public final String c;
    @Deprecated
    public final ClientAppContext d;

    GetPermissionStatusRequest(int i, IBinder iBinder, String str, ClientAppContext clientAppContext) {
        this.a = i;
        this.b = a.a(iBinder);
        this.c = str;
        this.d = ClientAppContext.a(clientAppContext, null, str, false);
    }

    GetPermissionStatusRequest(IBinder iBinder) {
        this(1, iBinder, null, null);
    }

    IBinder a() {
        return this.b.asBinder();
    }

    public void writeToParcel(Parcel parcel, int i) {
        g.a(this, parcel, i);
    }
}
