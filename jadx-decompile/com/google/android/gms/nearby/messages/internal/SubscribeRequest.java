package com.google.android.gms.nearby.messages.internal;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.messages.MessageFilter;
import com.google.android.gms.nearby.messages.Strategy;
import com.google.android.gms.nearby.messages.internal.j.a;

public final class SubscribeRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Creator<SubscribeRequest> CREATOR = new y();
    final int a;
    public final j b;
    public final Strategy c;
    public final k d;
    public final MessageFilter e;
    public final PendingIntent f;
    public final int g;
    @Deprecated
    public final String h;
    @Deprecated
    public final String i;
    public final byte[] j;
    @Deprecated
    public final boolean k;
    public final o l;
    @Deprecated
    public final boolean m;
    @Deprecated
    public final ClientAppContext n;
    public final boolean o;

    public SubscribeRequest(int i, IBinder iBinder, Strategy strategy, IBinder iBinder2, MessageFilter messageFilter, PendingIntent pendingIntent, int i2, String str, String str2, byte[] bArr, boolean z, IBinder iBinder3, boolean z2, ClientAppContext clientAppContext, boolean z3) {
        this.a = i;
        this.b = a.a(iBinder);
        this.c = strategy;
        this.d = k.a.a(iBinder2);
        this.e = messageFilter;
        this.f = pendingIntent;
        this.g = i2;
        this.h = str;
        this.i = str2;
        this.j = bArr;
        this.k = z;
        this.l = iBinder3 == null ? null : o.a.a(iBinder3);
        this.m = z2;
        this.n = ClientAppContext.a(clientAppContext, str2, str, z2);
        this.o = z3;
    }

    public SubscribeRequest(IBinder iBinder, Strategy strategy, IBinder iBinder2, MessageFilter messageFilter, PendingIntent pendingIntent, int i, byte[] bArr, IBinder iBinder3, boolean z) {
        this(3, iBinder, strategy, iBinder2, messageFilter, pendingIntent, i, null, null, bArr, false, iBinder3, false, null, z);
    }

    IBinder a() {
        return this.d == null ? null : this.d.asBinder();
    }

    IBinder b() {
        return this.b == null ? null : this.b.asBinder();
    }

    IBinder c() {
        return this.l == null ? null : this.l.asBinder();
    }

    public String toString() {
        String str;
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.c);
        String valueOf3 = String.valueOf(this.d);
        String valueOf4 = String.valueOf(this.e);
        String valueOf5 = String.valueOf(this.f);
        int i = this.g;
        if (this.j == null) {
            str = null;
        } else {
            str = "<" + this.j.length + " bytes>";
        }
        String valueOf6 = String.valueOf(this.l);
        boolean z = this.m;
        String valueOf7 = String.valueOf(this.n);
        boolean z2 = this.o;
        String str2 = this.h;
        String str3 = this.i;
        return new StringBuilder((((((((((String.valueOf(valueOf).length() + 295) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf3).length()) + String.valueOf(valueOf4).length()) + String.valueOf(valueOf5).length()) + String.valueOf(str).length()) + String.valueOf(valueOf6).length()) + String.valueOf(valueOf7).length()) + String.valueOf(str2).length()) + String.valueOf(str3).length()).append("SubscribeRequest{messageListener=").append(valueOf).append(", strategy=").append(valueOf2).append(", callback=").append(valueOf3).append(", filter=").append(valueOf4).append(", pendingIntent=").append(valueOf5).append(", messageListenerKey=").append(i).append(", hint=").append(str).append(", subscribeCallback=").append(valueOf6).append(", useRealClientApiKey=").append(z).append(", clientAppContext=").append(valueOf7).append(", isDiscardPendingIntent=").append(z2).append(", zeroPartyPackageName=").append(str2).append(", realClientPackageName=").append(str3).append(", isIgnoreNearbyPermission=").append(this.k).append("}").toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        y.a(this, parcel, i);
    }
}
