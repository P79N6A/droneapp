package com.google.android.gms.contextmanager.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;

public class TimeFilterImpl extends AbstractSafeParcelable {
    public static final Creator<TimeFilterImpl> CREATOR = new q();
    private final int a;
    private final ArrayList<Interval> b;
    private final int[] c;

    public static class Interval extends AbstractSafeParcelable {
        public static final Creator<Interval> CREATOR = new r();
        private final int a;
        private final long b;
        private final long c;

        Interval(int i, long j, long j2) {
            this.a = i;
            this.b = j;
            this.c = j2;
        }

        int a() {
            return this.a;
        }

        public long b() {
            return this.b;
        }

        public long c() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Interval)) {
                return false;
            }
            Interval interval = (Interval) obj;
            return this.b == interval.b() && this.c == interval.c();
        }

        public int hashCode() {
            return c.a(new Object[]{Long.valueOf(this.b), Long.valueOf(this.c)});
        }

        public void writeToParcel(Parcel parcel, int i) {
            r.a(this, parcel, i);
        }
    }

    TimeFilterImpl(int i, ArrayList<Interval> arrayList, int[] iArr) {
        this.a = i;
        this.b = arrayList;
        this.c = iArr;
    }

    int a() {
        return this.a;
    }

    public ArrayList<Interval> b() {
        return this.b;
    }

    public int[] c() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TimeFilterImpl)) {
            return false;
        }
        TimeFilterImpl timeFilterImpl = (TimeFilterImpl) obj;
        return c.a(this.b, timeFilterImpl.b) && c.a(this.c, timeFilterImpl.c);
    }

    public int hashCode() {
        return c.a(new Object[]{this.b, this.c});
    }

    public void writeToParcel(Parcel parcel, int i) {
        q.a(this, parcel, i);
    }
}
