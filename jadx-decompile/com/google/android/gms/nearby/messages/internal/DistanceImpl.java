package com.google.android.gms.nearby.messages.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.annotation.NonNull;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.messages.b;
import java.util.Locale;

public class DistanceImpl extends AbstractSafeParcelable implements b {
    public static final Creator<DistanceImpl> CREATOR = new e();
    final int b;
    public final int c;
    public final double d;

    public DistanceImpl(int i, double d) {
        this(1, i, d);
    }

    DistanceImpl(int i, int i2, double d) {
        this.b = i;
        this.c = i2;
        this.d = d;
    }

    private static String a(int i) {
        switch (i) {
            case 1:
                return "LOW";
            default:
                return "UNKNOWN";
        }
    }

    public int a() {
        return this.c;
    }

    public int a(@NonNull b bVar) {
        return (Double.isNaN(b()) && Double.isNaN(bVar.b())) ? 0 : Double.compare(b(), bVar.b());
    }

    public double b() {
        return this.d;
    }

    public /* synthetic */ int compareTo(@NonNull Object obj) {
        return a((b) obj);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DistanceImpl)) {
            return false;
        }
        b bVar = (DistanceImpl) obj;
        return a() == bVar.a() && a(bVar) == 0;
    }

    public int hashCode() {
        return c.a(Integer.valueOf(a()), Double.valueOf(b()));
    }

    public String toString() {
        return String.format(Locale.US, "(%.1fm, %s)", new Object[]{Double.valueOf(this.d), a(this.c)});
    }

    public void writeToParcel(Parcel parcel, int i) {
        e.a(this, parcel, i);
    }
}
