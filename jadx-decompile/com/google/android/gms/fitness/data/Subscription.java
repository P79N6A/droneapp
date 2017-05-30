package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class Subscription extends AbstractSafeParcelable {
    public static final Creator<Subscription> CREATOR = new e();
    private final int a;
    private final DataSource b;
    private final DataType c;
    private final long d;
    private final int e;

    public static class a {
        private DataSource a;
        private DataType b;
        private long c = -1;
        private int d = 2;

        public a a(DataSource dataSource) {
            this.a = dataSource;
            return this;
        }

        public a a(DataType dataType) {
            this.b = dataType;
            return this;
        }

        public Subscription a() {
            boolean z = false;
            boolean z2 = (this.a == null && this.b == null) ? false : true;
            d.a(z2, "Must call setDataSource() or setDataType()");
            if (this.b == null || this.a == null || this.b.equals(this.a.a())) {
                z = true;
            }
            d.a(z, "Specified data type is incompatible with specified data source");
            return new Subscription();
        }
    }

    Subscription(int i, DataSource dataSource, DataType dataType, long j, int i2) {
        this.a = i;
        this.b = dataSource;
        this.c = dataType;
        this.d = j;
        this.e = i2;
    }

    private Subscription(a aVar) {
        this.a = 1;
        this.c = aVar.b;
        this.b = aVar.a;
        this.d = aVar.c;
        this.e = aVar.d;
    }

    private boolean a(Subscription subscription) {
        return c.a(this.b, subscription.b) && c.a(this.c, subscription.c) && this.d == subscription.d && this.e == subscription.e;
    }

    public DataSource a() {
        return this.b;
    }

    public DataType b() {
        return this.c;
    }

    public int c() {
        return this.e;
    }

    public long d() {
        return this.d;
    }

    public String e() {
        String str = "Subscription{%s}";
        Object[] objArr = new Object[1];
        objArr[0] = this.b == null ? this.c.a() : this.b.j();
        return String.format(str, objArr);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof Subscription) && a((Subscription) obj));
    }

    public DataType f() {
        return this.c == null ? this.b.a() : this.c;
    }

    int g() {
        return this.a;
    }

    public int hashCode() {
        return c.a(new Object[]{this.b, this.b, Long.valueOf(this.d), Integer.valueOf(this.e)});
    }

    public String toString() {
        return c.a(this).a("dataSource", this.b).a("dataType", this.c).a("samplingIntervalMicros", Long.valueOf(this.d)).a("accuracyMode", Integer.valueOf(this.e)).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        e.a(this, parcel, i);
    }
}
