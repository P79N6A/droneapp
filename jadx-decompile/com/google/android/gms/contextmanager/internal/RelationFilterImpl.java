package com.google.android.gms.contextmanager.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;

public class RelationFilterImpl extends AbstractSafeParcelable {
    public static final Creator<RelationFilterImpl> CREATOR = new o();
    private final int a;
    private final ArrayList<Inclusion> b;
    private final QueryFilterParameters c;

    public static class Inclusion extends AbstractSafeParcelable {
        public static final Creator<Inclusion> CREATOR = new p();
        private final int a;
        private final int b;
        private final TimeFilterImpl c;
        private final KeyFilterImpl d;

        Inclusion(int i, int i2, TimeFilterImpl timeFilterImpl, KeyFilterImpl keyFilterImpl) {
            this.a = i;
            this.b = i2;
            this.c = timeFilterImpl;
            this.d = keyFilterImpl;
        }

        public int a() {
            return this.a;
        }

        public int b() {
            return this.b;
        }

        public TimeFilterImpl c() {
            return this.c;
        }

        public KeyFilterImpl d() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Inclusion)) {
                return false;
            }
            Inclusion inclusion = (Inclusion) obj;
            return b() == inclusion.b() && c().equals(inclusion.c()) && c.a(d(), inclusion.d());
        }

        public int hashCode() {
            return c.a(new Object[]{Integer.valueOf(this.b), this.c, this.d});
        }

        public void writeToParcel(Parcel parcel, int i) {
            p.a(this, parcel, i);
        }
    }

    RelationFilterImpl(int i, ArrayList<Inclusion> arrayList, QueryFilterParameters queryFilterParameters) {
        this.a = i;
        this.b = arrayList;
        this.c = queryFilterParameters;
    }

    public int a() {
        return this.a;
    }

    public ArrayList<Inclusion> b() {
        return this.b;
    }

    public QueryFilterParameters c() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RelationFilterImpl)) {
            return false;
        }
        return c.a(this.b, ((RelationFilterImpl) obj).b);
    }

    public int hashCode() {
        return c.a(new Object[]{this.b});
    }

    public void writeToParcel(Parcel parcel, int i) {
        o.a(this, parcel, i);
    }
}
