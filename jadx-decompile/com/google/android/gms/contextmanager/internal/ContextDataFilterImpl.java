package com.google.android.gms.contextmanager.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.Iterator;

public class ContextDataFilterImpl extends AbstractSafeParcelable {
    public static final Creator<ContextDataFilterImpl> CREATOR = new a();
    private final int a;
    private final ArrayList<Inclusion> b;
    private final ArrayList<String> c;
    private final QueryFilterParameters d;

    public static class Inclusion extends AbstractSafeParcelable {
        public static final Creator<Inclusion> CREATOR = new b();
        private final int a;
        private final int b;
        private final int c;
        private final TimeFilterImpl d;
        private final KeyFilterImpl e;

        Inclusion(int i, int i2, int i3, TimeFilterImpl timeFilterImpl, KeyFilterImpl keyFilterImpl) {
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = timeFilterImpl;
            this.e = keyFilterImpl;
        }

        int a() {
            return this.a;
        }

        public int b() {
            return this.b;
        }

        public int c() {
            return this.c;
        }

        public TimeFilterImpl d() {
            return this.d;
        }

        public KeyFilterImpl e() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Inclusion)) {
                return false;
            }
            Inclusion inclusion = (Inclusion) obj;
            return this.b == inclusion.b() && this.c == inclusion.c() && this.d.equals(inclusion.d()) && c.a(this.e, inclusion.e());
        }

        public int hashCode() {
            return c.a(new Object[]{Integer.valueOf(this.b), Integer.valueOf(this.c), this.d, this.e});
        }

        public void writeToParcel(Parcel parcel, int i) {
            b.a(this, parcel, i);
        }
    }

    public ContextDataFilterImpl(int i, ArrayList<Inclusion> arrayList, ArrayList<String> arrayList2, QueryFilterParameters queryFilterParameters) {
        this.a = i;
        this.b = arrayList;
        this.c = arrayList2;
        this.d = queryFilterParameters;
    }

    public ArrayList<Inclusion> a() {
        return this.b;
    }

    public ArrayList<String> b() {
        return this.c;
    }

    public QueryFilterParameters c() {
        return this.d;
    }

    int d() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContextDataFilterImpl)) {
            return false;
        }
        ContextDataFilterImpl contextDataFilterImpl = (ContextDataFilterImpl) obj;
        return c.a(this.b, contextDataFilterImpl.b) && c.a(this.c, contextDataFilterImpl.c);
    }

    public int hashCode() {
        return c.a(new Object[]{this.b, this.c});
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("contexts=[");
        if (this.b != null && this.b.size() > 0) {
            Iterator it = this.b.iterator();
            while (it.hasNext()) {
                stringBuilder.append(((Inclusion) it.next()).c()).append(Constants.ACCEPT_TIME_SEPARATOR_SP);
            }
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        a.a(this, parcel, i);
    }
}
