package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.wearable.b;
import com.google.android.gms.wearable.o;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CapabilityInfoParcelable extends AbstractSafeParcelable implements b {
    public static final Creator<CapabilityInfoParcelable> CREATOR = new bc();
    final int a;
    private final Object b = new Object();
    private final String c;
    private final List<NodeParcelable> d;
    private Set<o> e;

    CapabilityInfoParcelable(int i, String str, List<NodeParcelable> list) {
        this.a = i;
        this.c = str;
        this.d = list;
        this.e = null;
        d();
    }

    private void d() {
        d.a(this.c);
        d.a(this.d);
    }

    public String a() {
        return this.c;
    }

    public Set<o> b() {
        Set<o> set;
        synchronized (this.b) {
            if (this.e == null) {
                this.e = new HashSet(this.d);
            }
            set = this.e;
        }
        return set;
    }

    public List<NodeParcelable> c() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CapabilityInfoParcelable capabilityInfoParcelable = (CapabilityInfoParcelable) obj;
        if (this.a != capabilityInfoParcelable.a) {
            return false;
        }
        if (this.c == null ? capabilityInfoParcelable.c != null : !this.c.equals(capabilityInfoParcelable.c)) {
            return false;
        }
        if (this.d != null) {
            if (this.d.equals(capabilityInfoParcelable.d)) {
                return true;
            }
        } else if (capabilityInfoParcelable.d == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((this.c != null ? this.c.hashCode() : 0) + (this.a * 31)) * 31;
        if (this.d != null) {
            i = this.d.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        String str = this.c;
        String valueOf = String.valueOf(this.d);
        return new StringBuilder((String.valueOf(str).length() + 18) + String.valueOf(valueOf).length()).append("CapabilityInfo{").append(str).append(", ").append(valueOf).append("}").toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        bc.a(this, parcel, i);
    }
}
