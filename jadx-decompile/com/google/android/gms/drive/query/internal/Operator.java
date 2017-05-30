package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class Operator extends AbstractSafeParcelable {
    public static final Creator<Operator> CREATOR = new n();
    public static final Operator a = new Operator("=");
    public static final Operator b = new Operator("<");
    public static final Operator c = new Operator("<=");
    public static final Operator d = new Operator(">");
    public static final Operator e = new Operator(">=");
    public static final Operator f = new Operator("and");
    public static final Operator g = new Operator("or");
    public static final Operator h = new Operator("not");
    public static final Operator i = new Operator("contains");
    final String j;
    final int k;

    Operator(int i, String str) {
        this.k = i;
        this.j = str;
    }

    private Operator(String str) {
        this(1, str);
    }

    public String a() {
        return this.j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Operator operator = (Operator) obj;
        return this.j == null ? operator.j == null : this.j.equals(operator.j);
    }

    public int hashCode() {
        return (this.j == null ? 0 : this.j.hashCode()) + 31;
    }

    public void writeToParcel(Parcel parcel, int i) {
        n.a(this, parcel, i);
    }
}
