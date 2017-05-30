package com.google.android.gms.location.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class ClientIdentity extends AbstractSafeParcelable {
    public static final c CREATOR = new c();
    public final int a;
    public final String b;
    private final int c;

    ClientIdentity(int i, int i2, String str) {
        this.c = i;
        this.a = i2;
        this.b = str;
    }

    int a() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof ClientIdentity)) {
            return false;
        }
        ClientIdentity clientIdentity = (ClientIdentity) obj;
        return clientIdentity.a == this.a && c.a(clientIdentity.b, this.b);
    }

    public int hashCode() {
        return this.a;
    }

    public String toString() {
        return String.format("%d:%s", new Object[]{Integer.valueOf(this.a), this.b});
    }

    public void writeToParcel(Parcel parcel, int i) {
        c.a(this, parcel, i);
    }
}
