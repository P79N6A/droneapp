package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.annotation.Nullable;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Goal extends AbstractSafeParcelable {
    public static final Creator<Goal> CREATOR = new v();
    private final int a;
    private final long b;
    private final long c;
    private final List<Integer> d;
    private final Recurrence e;
    private final int f;
    private final MetricObjective g;
    private final DurationObjective h;
    private final FrequencyObjective i;

    public static class DurationObjective extends AbstractSafeParcelable {
        public static final Creator<DurationObjective> CREATOR = new s();
        private final int a;
        private final long b;

        DurationObjective(int i, long j) {
            this.a = i;
            this.b = j;
        }

        private boolean a(DurationObjective durationObjective) {
            return this.b == durationObjective.b;
        }

        public long a() {
            return this.b;
        }

        int b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof DurationObjective) && a((DurationObjective) obj));
        }

        public int hashCode() {
            return c.a(new Object[]{Long.valueOf(this.b)});
        }

        public String toString() {
            return c.a(this).a("duration", Long.valueOf(this.b)).toString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            s.a(this, parcel, i);
        }
    }

    public static class FrequencyObjective extends AbstractSafeParcelable {
        public static final Creator<FrequencyObjective> CREATOR = new u();
        private final int a;
        private final int b;

        FrequencyObjective(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        private boolean a(FrequencyObjective frequencyObjective) {
            return this.b == frequencyObjective.b;
        }

        public int a() {
            return this.b;
        }

        int b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof FrequencyObjective) && a((FrequencyObjective) obj));
        }

        public int hashCode() {
            return c.a(new Object[]{Integer.valueOf(this.b)});
        }

        public String toString() {
            return c.a(this).a("frequency", Integer.valueOf(this.b)).toString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            u.a(this, parcel, i);
        }
    }

    public static class MetricObjective extends AbstractSafeParcelable {
        public static final Creator<MetricObjective> CREATOR = new aa();
        private final int a;
        private final String b;
        private final double c;
        private final double d;

        MetricObjective(int i, String str, double d, double d2) {
            this.a = i;
            this.b = str;
            this.c = d;
            this.d = d2;
        }

        private boolean a(MetricObjective metricObjective) {
            return c.a(this.b, metricObjective.b) && this.c == metricObjective.c && this.d == metricObjective.d;
        }

        public String a() {
            return this.b;
        }

        public double b() {
            return this.c;
        }

        public double c() {
            return this.d;
        }

        int d() {
            return this.a;
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof MetricObjective) && a((MetricObjective) obj));
        }

        public int hashCode() {
            return c.a(new Object[]{this.b, Double.valueOf(this.c), Double.valueOf(this.d)});
        }

        public String toString() {
            return c.a(this).a("dataTypeName", this.b).a("value", Double.valueOf(this.c)).a("initValue", Double.valueOf(this.d)).toString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            aa.a(this, parcel, i);
        }
    }

    public static class Recurrence extends AbstractSafeParcelable {
        public static final Creator<Recurrence> CREATOR = new ae();
        private final int a;
        private final int b;
        private final int c;

        Recurrence(int i, int i2, int i3) {
            this.a = i;
            this.b = i2;
            boolean z = i3 > 0 && i3 <= 3;
            d.a(z);
            this.c = i3;
        }

        private static String a(int i) {
            switch (i) {
                case 1:
                    return "day";
                case 2:
                    return "week";
                case 3:
                    return "month";
                default:
                    throw new IllegalArgumentException("invalid unit value");
            }
        }

        private boolean a(Recurrence recurrence) {
            return this.b == recurrence.b && this.c == recurrence.c;
        }

        public int a() {
            return this.b;
        }

        public int b() {
            return this.c;
        }

        int c() {
            return this.a;
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof Recurrence) && a((Recurrence) obj));
        }

        public int hashCode() {
            return c.a(new Object[]{Integer.valueOf(this.b), Integer.valueOf(this.c)});
        }

        public String toString() {
            return c.a(this).a("count", Integer.valueOf(this.b)).a("unit", a(this.c)).toString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            ae.a(this, parcel, i);
        }
    }

    Goal(int i, long j, long j2, List<Integer> list, Recurrence recurrence, int i2, MetricObjective metricObjective, DurationObjective durationObjective, FrequencyObjective frequencyObjective) {
        List emptyList;
        this.a = i;
        this.b = j;
        this.c = j2;
        if (list == null) {
            emptyList = Collections.emptyList();
        }
        this.d = emptyList;
        this.e = recurrence;
        this.f = i2;
        this.g = metricObjective;
        this.h = durationObjective;
        this.i = frequencyObjective;
    }

    private static String a(int i) {
        switch (i) {
            case 0:
                return "unknown";
            case 1:
                return "metric";
            case 2:
                return "duration";
            case 3:
                return "frequency";
            default:
                throw new IllegalArgumentException("invalid objective type value");
        }
    }

    private boolean a(Goal goal) {
        return this.b == goal.b && this.c == goal.c && c.a(this.d, goal.d) && c.a(this.e, goal.e) && this.f == goal.f && c.a(this.g, goal.g) && c.a(this.h, goal.h) && c.a(this.i, goal.i);
    }

    @Nullable
    public Set<String> a() {
        if (this.d.isEmpty()) {
            return null;
        }
        Set<String> hashSet = new HashSet();
        for (Integer intValue : this.d) {
            hashSet.add(com.google.android.gms.fitness.d.a(intValue.intValue()));
        }
        return hashSet;
    }

    public Recurrence b() {
        return this.e;
    }

    public int c() {
        return this.f;
    }

    int d() {
        return this.a;
    }

    public long e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof Goal) && a((Goal) obj));
    }

    public long f() {
        return this.c;
    }

    public List<Integer> g() {
        return this.d;
    }

    public MetricObjective h() {
        return this.g;
    }

    public int hashCode() {
        return c.a(new Object[]{Long.valueOf(this.b), Long.valueOf(this.c), a(), this.e, Integer.valueOf(this.f), this.g, this.h, this.i});
    }

    public DurationObjective i() {
        return this.h;
    }

    public FrequencyObjective j() {
        return this.i;
    }

    public String toString() {
        return c.a(this).a("startTime", Long.valueOf(this.b)).a("endTime", Long.valueOf(this.c)).a("activities", a()).a("recurrence", this.e).a("objectiveType", a(this.f)).a("metricObjective", this.g).a("durationObjective", this.h).a("frequencyObjective", this.i).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        v.a(this, parcel, i);
    }
}
