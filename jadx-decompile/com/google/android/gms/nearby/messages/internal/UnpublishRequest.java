package com.google.android.gms.nearby.messages.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.messages.internal.k.a;

public final class UnpublishRequest extends AbstractSafeParcelable {
    public static final Creator<UnpublishRequest> CREATOR = new z();
    final int a;
    public final MessageWrapper b;
    public final k c;
    @Deprecated
    public final String d;
    @Deprecated
    public final String e;
    @Deprecated
    public final boolean f;
    @Deprecated
    public final ClientAppContext g;

    UnpublishRequest(int i, MessageWrapper messageWrapper, IBinder iBinder, String str, String str2, boolean z, ClientAppContext clientAppContext) {
        this.a = i;
        this.b = messageWrapper;
        this.c = a.a(iBinder);
        this.d = str;
        this.e = str2;
        this.f = z;
        this.g = ClientAppContext.a(clientAppContext, str2, str, z);
    }

    UnpublishRequest(MessageWrapper messageWrapper, IBinder iBinder, ClientAppContext clientAppContext) {
        this(1, messageWrapper, iBinder, null, null, false, clientAppContext);
    }

    IBinder a() {
        return this.c.asBinder();
    }

    public void writeToParcel(Parcel parcel, int i) {
        z.a(this, parcel, i);
    }
}
