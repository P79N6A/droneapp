package com.google.android.gms.appdatasearch;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class Feature extends AbstractSafeParcelable {
    public static final e CREATOR = new e();
    final int a;
    public final int b;
    final Bundle c;

    Feature(int i, int i2, Bundle bundle) {
        this.a = i;
        this.b = i2;
        this.c = bundle;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Feature)) {
            return false;
        }
        Feature feature = (Feature) obj;
        return c.a(Integer.valueOf(feature.b), Integer.valueOf(this.b)) && c.a(feature.c, this.c);
    }

    public int hashCode() {
        return c.a(Integer.valueOf(this.b), this.c);
    }

    public void writeToParcel(Parcel parcel, int i) {
        e eVar = CREATOR;
        e.a(this, parcel, i);
    }
}
