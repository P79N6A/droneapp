package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class Scope extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Creator<Scope> CREATOR = new x();
    final int a;
    private final String b;

    Scope(int i, String str) {
        d.a(str, (Object) "scopeUri must not be null or empty");
        this.a = i;
        this.b = str;
    }

    public Scope(String str) {
        this(1, str);
    }

    public String a() {
        return this.b;
    }

    public boolean equals(Object obj) {
        return this == obj ? true : !(obj instanceof Scope) ? false : this.b.equals(((Scope) obj).b);
    }

    public int hashCode() {
        return this.b.hashCode();
    }

    public String toString() {
        return this.b;
    }

    public void writeToParcel(Parcel parcel, int i) {
        x.a(this, parcel, i);
    }
}
