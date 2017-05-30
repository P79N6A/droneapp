package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class MapValue extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Creator<MapValue> CREATOR = new z();
    private final int a;
    private final int b;
    private final float c;

    public MapValue(int i, float f) {
        this(1, i, f);
    }

    MapValue(int i, int i2, float f) {
        this.a = i;
        this.b = i2;
        this.c = f;
    }

    public static MapValue a(float f) {
        return new MapValue(2, f);
    }

    private boolean a(MapValue mapValue) {
        if (this.b != mapValue.b) {
            return false;
        }
        switch (this.b) {
            case 2:
                return a() == mapValue.a();
            default:
                return this.c == mapValue.c;
        }
    }

    public float a() {
        d.a(this.b == 2, "Value is not in float format");
        return this.c;
    }

    int b() {
        return this.a;
    }

    int c() {
        return this.b;
    }

    float d() {
        return this.c;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof MapValue) && a((MapValue) obj));
    }

    public int hashCode() {
        return (int) this.c;
    }

    public String toString() {
        switch (this.b) {
            case 2:
                return Float.toString(a());
            default:
                return "unknown";
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        z.a(this, parcel, i);
    }
}
