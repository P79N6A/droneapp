package com.google.android.gms.nearby.messages.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.messages.internal.k.a;

public final class RegisterStatusCallbackRequest extends AbstractSafeParcelable {
    public static final Creator<RegisterStatusCallbackRequest> CREATOR = new x();
    final int a;
    public final k b;
    public final n c;
    public boolean d;
    @Deprecated
    public String e;
    @Deprecated
    public final ClientAppContext f;

    RegisterStatusCallbackRequest(int i, IBinder iBinder, IBinder iBinder2, boolean z, String str, ClientAppContext clientAppContext) {
        this.a = i;
        this.b = a.a(iBinder);
        this.c = n.a.a(iBinder2);
        this.d = z;
        this.e = str;
        this.f = ClientAppContext.a(clientAppContext, null, str, false);
    }

    RegisterStatusCallbackRequest(IBinder iBinder, IBinder iBinder2) {
        this(1, iBinder, iBinder2, false, null, null);
    }

    IBinder a() {
        return this.b.asBinder();
    }

    IBinder b() {
        return this.c.asBinder();
    }

    public void writeToParcel(Parcel parcel, int i) {
        x.a(this, parcel, i);
    }
}
