package com.google.android.gms.phenotype;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class Configuration extends AbstractSafeParcelable implements Comparable<Configuration> {
    public static final Creator<Configuration> CREATOR = new a();
    final int a;
    public final int b;
    public final Flag[] c;
    public final String[] d;
    public final Map<String, Flag> e = new TreeMap();

    Configuration(int i, int i2, Flag[] flagArr, String[] strArr) {
        this.a = i;
        this.b = i2;
        this.c = flagArr;
        for (Flag flag : flagArr) {
            this.e.put(flag.b, flag);
        }
        this.d = strArr;
        if (this.d != null) {
            Arrays.sort(this.d);
        }
    }

    public int a(Configuration configuration) {
        return this.b - configuration.b;
    }

    public /* synthetic */ int compareTo(Object obj) {
        return a((Configuration) obj);
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Configuration)) {
            return false;
        }
        Configuration configuration = (Configuration) obj;
        return this.a == configuration.a && this.b == configuration.b && c.a(this.e, configuration.e) && Arrays.equals(this.d, configuration.d);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("Configuration(");
        stringBuilder.append(this.a);
        stringBuilder.append(", ");
        stringBuilder.append(this.b);
        stringBuilder.append(", ");
        stringBuilder.append("(");
        for (Flag append : this.e.values()) {
            stringBuilder.append(append);
            stringBuilder.append(", ");
        }
        stringBuilder.append(")");
        stringBuilder.append(", ");
        stringBuilder.append("(");
        if (this.d != null) {
            for (String append2 : this.d) {
                stringBuilder.append(append2);
                stringBuilder.append(", ");
            }
        } else {
            stringBuilder.append("null");
        }
        stringBuilder.append(")");
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        a.a(this, parcel, i);
    }
}
