package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.annotation.RequiresPermission;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.util.a;
import com.google.android.gms.common.util.b;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public final class DataType extends AbstractSafeParcelable {
    public static final DataType A = new DataType("com.google.body.waist.circumference", Field.r);
    public static final DataType B = new DataType("com.google.body.hip.circumference", Field.r);
    public static final DataType C = new DataType("com.google.nutrition", Field.H, Field.A, Field.G);
    public static final Creator<DataType> CREATOR = new o();
    public static final DataType D = new DataType("com.google.hydration", Field.z);
    public static final DataType E = new DataType("com.google.activity.exercise", Field.ag, Field.ah, Field.e, Field.aj, Field.ai);
    public static final DataType F = new DataType("com.google.activity.summary", Field.a, Field.e, Field.ar);
    public static final DataType G = new DataType("com.google.floor_change.summary", Field.h, Field.i, Field.ab, Field.ac, Field.ae, Field.af);
    public static final DataType H = new DataType("com.google.calories.bmr.summary", Field.as, Field.at, Field.au);
    public static final DataType I = b;
    public static final DataType J = r;
    @Deprecated
    public static final DataType K = g;
    public static final DataType L = h;
    @RequiresPermission(conditional = true, value = "android.permission.BODY_SENSORS")
    public static final DataType M = new DataType("com.google.heart_rate.summary", Field.as, Field.at, Field.au);
    @RequiresPermission(conditional = true, value = "android.permission.ACCESS_FINE_LOCATION")
    public static final DataType N = new DataType("com.google.location.bounding_box", Field.av, Field.aw, Field.ax, Field.ay);
    public static final DataType O = new DataType("com.google.power.summary", Field.as, Field.at, Field.au);
    public static final DataType P = new DataType("com.google.speed.summary", Field.as, Field.at, Field.au);
    public static final DataType Q = new DataType("com.google.body.fat.percentage.summary", Field.as, Field.at, Field.au);
    public static final DataType R = new DataType("com.google.body.hip.circumference.summary", Field.as, Field.at, Field.au);
    public static final DataType S = new DataType("com.google.body.waist.circumference.summary", Field.as, Field.at, Field.au);
    public static final DataType T = new DataType("com.google.weight.summary", Field.as, Field.at, Field.au);
    @KeepName
    @RequiresPermission(conditional = true, value = "android.permission.ACCESS_FINE_LOCATION")
    public static final DataType TYPE_DISTANCE_CUMULATIVE = new DataType("com.google.distance.cumulative", Field.o);
    @KeepName
    public static final DataType TYPE_STEP_COUNT_CUMULATIVE = new DataType("com.google.step_count.cumulative", Field.d);
    public static final DataType U = new DataType("com.google.nutrition.summary", Field.H, Field.A);
    public static final DataType V = D;
    @Deprecated
    public static final Set<DataType> W = new a();
    public static final String a = "vnd.google.fitness.data_type/";
    public static final DataType b = new DataType("com.google.step_count.delta", Field.d);
    public static final DataType c = new DataType("com.google.step_count.cadence", Field.u);
    public static final DataType d = new DataType("com.google.stride_model", Field.v);
    public static final DataType e = new DataType("com.google.activity.segment", Field.a);
    public static final DataType f = new DataType("com.google.floor_change", Field.a, Field.b, Field.aa, Field.ad);
    @Deprecated
    public static final DataType g = new DataType("com.google.calories.consumed", Field.x);
    public static final DataType h = new DataType("com.google.calories.expended", Field.x);
    public static final DataType i = new DataType("com.google.calories.bmr", Field.x);
    public static final DataType j = new DataType("com.google.power.sample", Field.y);
    @Deprecated
    public static final DataType k = new DataType("com.google.activity.sample", Field.a, Field.b);
    public static final DataType l = new DataType("com.google.activity.samples", Field.c);
    public static final DataType m = new DataType("com.google.accelerometer", Field.a.a, Field.a.b, Field.a.c);
    public static final DataType n = new DataType("com.google.sensor.events", Field.aA, Field.aB, Field.aC);
    @RequiresPermission(conditional = true, value = "android.permission.BODY_SENSORS")
    public static final DataType o = new DataType("com.google.heart_rate.bpm", Field.j);
    @RequiresPermission(conditional = true, value = "android.permission.ACCESS_FINE_LOCATION")
    public static final DataType p = new DataType("com.google.location.sample", Field.k, Field.l, Field.m, Field.n);
    @RequiresPermission(conditional = true, value = "android.permission.ACCESS_FINE_LOCATION")
    public static final DataType q = new DataType("com.google.location.track", Field.k, Field.l, Field.m, Field.n);
    @RequiresPermission(conditional = true, value = "android.permission.ACCESS_FINE_LOCATION")
    public static final DataType r = new DataType("com.google.distance.delta", Field.o);
    @RequiresPermission(conditional = true, value = "android.permission.ACCESS_FINE_LOCATION")
    public static final DataType s = new DataType("com.google.speed", Field.t);
    public static final DataType t = new DataType("com.google.cycling.wheel_revolution.cumulative", Field.w);
    public static final DataType u = new DataType("com.google.cycling.wheel_revolution.rpm", Field.u);
    public static final DataType v = new DataType("com.google.cycling.pedaling.cumulative", Field.w);
    public static final DataType w = new DataType("com.google.cycling.pedaling.cadence", Field.u);
    public static final DataType x = new DataType("com.google.height", Field.p);
    public static final DataType y = new DataType("com.google.weight", Field.q);
    public static final DataType z = new DataType("com.google.body.fat.percentage", Field.s);
    private final int X;
    private final String Y;
    private final List<Field> Z;

    static {
        W.add(e);
        W.add(i);
        W.add(z);
        W.add(B);
        W.add(A);
        W.add(g);
        W.add(h);
        W.add(r);
        W.add(f);
        W.add(p);
        W.add(C);
        W.add(D);
        W.add(o);
        W.add(j);
        W.add(s);
        W.add(b);
        W.add(y);
    }

    DataType(int i, String str, List<Field> list) {
        this.X = i;
        this.Y = str;
        this.Z = Collections.unmodifiableList(list);
    }

    public DataType(String str, Field... fieldArr) {
        this(1, str, b.a(fieldArr));
    }

    public static List<DataType> a(DataType dataType) {
        List list = (List) b.a.get(dataType);
        return list == null ? Collections.emptyList() : Collections.unmodifiableList(list);
    }

    public static String b(DataType dataType) {
        String valueOf = String.valueOf(a);
        String valueOf2 = String.valueOf(dataType.a());
        return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    private boolean c(DataType dataType) {
        return this.Y.equals(dataType.Y) && this.Z.equals(dataType.Z);
    }

    public int a(Field field) {
        int indexOf = this.Z.indexOf(field);
        if (indexOf >= 0) {
            return indexOf;
        }
        throw new IllegalArgumentException(String.format("%s not a field of %s", new Object[]{field, this}));
    }

    public String a() {
        return this.Y;
    }

    public List<Field> b() {
        return this.Z;
    }

    public String c() {
        return this.Y.startsWith("com.google.") ? this.Y.substring(11) : this.Y;
    }

    int d() {
        return this.X;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof DataType) && c((DataType) obj));
    }

    public int hashCode() {
        return this.Y.hashCode();
    }

    public String toString() {
        return String.format("DataType{%s%s}", new Object[]{this.Y, this.Z});
    }

    public void writeToParcel(Parcel parcel, int i) {
        o.a(this, parcel, i);
    }
}
