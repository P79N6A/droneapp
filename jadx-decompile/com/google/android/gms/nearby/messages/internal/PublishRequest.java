package com.google.android.gms.nearby.messages.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.messages.Strategy;
import com.google.android.gms.nearby.messages.internal.k.a;

public final class PublishRequest extends AbstractSafeParcelable {
    public static final Creator<PublishRequest> CREATOR = new w();
    final int a;
    public final MessageWrapper b;
    public final Strategy c;
    public final k d;
    @Deprecated
    public final String e;
    @Deprecated
    public final String f;
    @Deprecated
    public final boolean g;
    public final m h;
    @Deprecated
    public final boolean i;
    @Deprecated
    public final ClientAppContext j;

    PublishRequest(int i, MessageWrapper messageWrapper, Strategy strategy, IBinder iBinder, String str, String str2, boolean z, IBinder iBinder2, boolean z2, ClientAppContext clientAppContext) {
        this.a = i;
        this.b = messageWrapper;
        this.c = strategy;
        this.d = a.a(iBinder);
        this.e = str;
        this.f = str2;
        this.g = z;
        this.h = iBinder2 == null ? null : m.a.a(iBinder2);
        this.i = z2;
        this.j = ClientAppContext.a(clientAppContext, str2, str, z2);
    }

    PublishRequest(MessageWrapper messageWrapper, Strategy strategy, IBinder iBinder, IBinder iBinder2) {
        this(2, messageWrapper, strategy, iBinder, null, null, false, iBinder2, false, null);
    }

    IBinder a() {
        return this.d.asBinder();
    }

    IBinder b() {
        return this.h == null ? null : this.h.asBinder();
    }

    public void writeToParcel(Parcel parcel, int i) {
        w.a(this, parcel, i);
    }
}
