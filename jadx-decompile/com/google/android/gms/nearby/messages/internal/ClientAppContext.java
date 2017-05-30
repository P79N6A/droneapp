package com.google.android.gms.nearby.messages.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class ClientAppContext extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Creator<ClientAppContext> CREATOR = new d();
    final int a;
    @Nullable
    public final String b;
    @Nullable
    public final String c;
    public final boolean d;
    public final int e;
    public final String f;

    ClientAppContext(int i, @Nullable String str, @Nullable String str2, boolean z, int i2, @Nullable String str3) {
        this.a = i;
        this.b = str;
        if (!(str2 == null || str2.isEmpty() || str2.startsWith("0p:"))) {
            Log.w("NearbyMessages", String.format("ClientAppContext: 0P identifier(%s) without 0P prefix(%s)", new Object[]{str2, "0p:"}));
            String valueOf = String.valueOf("0p:");
            String valueOf2 = String.valueOf(str2);
            str2 = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
        }
        this.c = str2;
        this.d = z;
        this.e = i2;
        this.f = str3;
    }

    public ClientAppContext(@Nullable String str, @Nullable String str2, boolean z) {
        this(str, str2, z, null, 0);
    }

    public ClientAppContext(@Nullable String str, @Nullable String str2, boolean z, @Nullable String str3, int i) {
        this(1, str, str2, z, i, str3);
    }

    @Nullable
    static final ClientAppContext a(@Nullable ClientAppContext clientAppContext, @Nullable String str, @Nullable String str2, boolean z) {
        return clientAppContext != null ? clientAppContext : (str == null && str2 == null) ? null : new ClientAppContext(str, str2, z);
    }

    private static boolean a(String str, String str2) {
        return TextUtils.isEmpty(str) ? TextUtils.isEmpty(str2) : str.equals(str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClientAppContext)) {
            return false;
        }
        ClientAppContext clientAppContext = (ClientAppContext) obj;
        return a(this.b, clientAppContext.b) && a(this.c, clientAppContext.c) && this.d == clientAppContext.d && a(this.f, clientAppContext.f) && this.e == clientAppContext.e;
    }

    public int hashCode() {
        return c.a(new Object[]{this.b, this.c, Boolean.valueOf(this.d), this.f, Integer.valueOf(this.e)});
    }

    public String toString() {
        return String.format("{realClientPackageName: %s, zeroPartyIdentifier: %s, useRealClientApiKey: %b, apiKey: %s, callingContext: %d}", new Object[]{this.b, this.c, Boolean.valueOf(this.d), this.f, Integer.valueOf(this.e)});
    }

    public void writeToParcel(Parcel parcel, int i) {
        d.a(this, parcel, i);
    }
}
