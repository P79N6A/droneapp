package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.wearable.o;

public class NodeParcelable extends AbstractSafeParcelable implements o {
    public static final Creator<NodeParcelable> CREATOR = new ae();
    final int a;
    private final String b;
    private final String c;
    private final int d;
    private final boolean e;

    NodeParcelable(int i, String str, String str2, int i2, boolean z) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = i2;
        this.e = z;
    }

    public String a() {
        return this.b;
    }

    public String b() {
        return this.c;
    }

    public boolean c() {
        return this.e;
    }

    public int d() {
        return this.d;
    }

    public boolean equals(Object obj) {
        return !(obj instanceof NodeParcelable) ? false : ((NodeParcelable) obj).b.equals(this.b);
    }

    public int hashCode() {
        return this.b.hashCode();
    }

    public String toString() {
        String str = this.c;
        String str2 = this.b;
        int i = this.d;
        return new StringBuilder((String.valueOf(str).length() + 45) + String.valueOf(str2).length()).append("Node{").append(str).append(", id=").append(str2).append(", hops=").append(i).append(", isNearby=").append(this.e).append("}").toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        ae.a(this, parcel, i);
    }
}
