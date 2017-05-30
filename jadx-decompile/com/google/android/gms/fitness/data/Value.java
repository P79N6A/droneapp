package com.google.android.gms.fitness.data;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.annotation.Nullable;
import android.support.v4.util.ArrayMap;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.util.m;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public final class Value extends AbstractSafeParcelable {
    public static final Creator<Value> CREATOR = new f();
    private final int a;
    private final int b;
    private boolean c;
    private float d;
    private String e;
    private Map<String, MapValue> f;
    private int[] g;
    private float[] h;
    private byte[] i;

    public Value(int i) {
        this(3, i, false, 0.0f, null, null, null, null, null);
    }

    Value(int i, int i2, boolean z, float f, String str, Bundle bundle, int[] iArr, float[] fArr, byte[] bArr) {
        this.a = i;
        this.b = i2;
        this.c = z;
        this.d = f;
        this.e = str;
        this.f = a(bundle);
        this.g = iArr;
        this.h = fArr;
        this.i = bArr;
    }

    private static Map<String, MapValue> a(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        bundle.setClassLoader(MapValue.class.getClassLoader());
        Map<String, MapValue> arrayMap = new ArrayMap(bundle.size());
        for (String str : bundle.keySet()) {
            arrayMap.put(str, (MapValue) bundle.getParcelable(str));
        }
        return arrayMap;
    }

    private boolean a(Value value) {
        if (this.b != value.b || this.c != value.c) {
            return false;
        }
        switch (this.b) {
            case 1:
                return c() == value.c();
            case 2:
                return this.d == value.d;
            case 3:
                return c.a(this.e, value.e);
            case 4:
                return c.a(this.f, value.f);
            case 5:
                return Arrays.equals(this.g, value.g);
            case 6:
                return Arrays.equals(this.h, value.h);
            case 7:
                return Arrays.equals(this.i, value.i);
            default:
                return this.d == value.d;
        }
    }

    public void a(float f) {
        d.a(this.b == 2, "Attempting to set an float value to a field that is not in FLOAT format.  Please check the data type definition and use the right format.");
        this.c = true;
        this.d = f;
    }

    public void a(int i) {
        d.a(this.b == 1, "Attempting to set an int value to a field that is not in INT32 format.  Please check the data type definition and use the right format.");
        this.c = true;
        this.d = Float.intBitsToFloat(i);
    }

    public void a(String str) {
        d.a(this.b == 3, "Attempting to set a string value to a field that is not in STRING format.  Please check the data type definition and use the right format.");
        this.c = true;
        this.e = str;
    }

    public void a(String str, float f) {
        d.a(this.b == 4, "Attempting to set a key's value to a field that is not in FLOAT_MAP format.  Please check the data type definition and use the right format.");
        this.c = true;
        if (this.f == null) {
            this.f = new HashMap();
        }
        this.f.put(str, MapValue.a(f));
    }

    public boolean a() {
        return this.c;
    }

    public int b() {
        return this.b;
    }

    public void b(String str) {
        d.a(this.b == 4, "Attempting to set a key's value to a field that is not in FLOAT_MAP format.  Please check the data type definition and use the right format.");
        if (this.f != null) {
            this.f.remove(str);
        }
    }

    public int c() {
        boolean z = true;
        if (this.b != 1) {
            z = false;
        }
        d.a(z, "Value is not in int format");
        return Float.floatToRawIntBits(this.d);
    }

    public void c(String str) {
        a(com.google.android.gms.fitness.d.a(str));
    }

    public float d() {
        d.a(this.b == 2, "Value is not in float format");
        return this.d;
    }

    @Nullable
    public Float d(String str) {
        d.a(this.b == 4, "Value is not in float map format");
        return (this.f == null || !this.f.containsKey(str)) ? null : Float.valueOf(((MapValue) this.f.get(str)).a());
    }

    public String e() {
        d.a(this.b == 3, "Value is not in string format");
        return this.e;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof Value) && a((Value) obj));
    }

    public String f() {
        return com.google.android.gms.fitness.d.a(c());
    }

    int g() {
        return this.a;
    }

    float h() {
        return this.d;
    }

    public int hashCode() {
        return c.a(new Object[]{Float.valueOf(this.d), this.e, this.f, this.g, this.h, this.i});
    }

    String i() {
        return this.e;
    }

    Bundle j() {
        if (this.f == null) {
            return null;
        }
        Bundle bundle = new Bundle(this.f.size());
        for (Entry entry : this.f.entrySet()) {
            bundle.putParcelable((String) entry.getKey(), (Parcelable) entry.getValue());
        }
        return bundle;
    }

    int[] k() {
        return this.g;
    }

    float[] l() {
        return this.h;
    }

    byte[] m() {
        return this.i;
    }

    public String toString() {
        if (!this.c) {
            return "unset";
        }
        switch (this.b) {
            case 1:
                return Integer.toString(c());
            case 2:
                return Float.toString(this.d);
            case 3:
                return this.e;
            case 4:
                return new TreeMap(this.f).toString();
            case 5:
                return Arrays.toString(this.g);
            case 6:
                return Arrays.toString(this.h);
            case 7:
                return m.a(this.i, 0, this.i.length, false);
            default:
                return "unknown";
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        f.a(this, parcel, i);
    }
}
