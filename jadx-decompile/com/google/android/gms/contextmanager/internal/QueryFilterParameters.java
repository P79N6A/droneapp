package com.google.android.gms.contextmanager.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class QueryFilterParameters extends AbstractSafeParcelable {
    public static final Creator<QueryFilterParameters> CREATOR = new n();
    private final int a;
    private final int b;
    private final int c;
    private final int[] d;

    QueryFilterParameters(int i, int i2, int i3, int[] iArr) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = iArr;
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

    public int[] d() {
        return this.d;
    }

    public boolean e() {
        return this.d != null;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof QueryFilterParameters)) {
            return false;
        }
        QueryFilterParameters queryFilterParameters = (QueryFilterParameters) obj;
        if (queryFilterParameters.c != this.c) {
            return false;
        }
        if (queryFilterParameters.b != this.b) {
            return false;
        }
        if (queryFilterParameters.a != this.a) {
            return false;
        }
        if (e() != queryFilterParameters.e()) {
            return false;
        }
        if (!e()) {
            return true;
        }
        if (this.d.length != queryFilterParameters.d.length) {
            return false;
        }
        for (int i : queryFilterParameters.d) {
            boolean z;
            for (int i2 : this.d) {
                if (i2 == i) {
                    z = true;
                    break;
                }
            }
            z = false;
            if (!z) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i;
        if (this.d != null) {
            int[] iArr = this.d;
            int i2 = 0;
            i = 0;
            while (i2 < iArr.length) {
                int i3 = (iArr[i2] * 13) + i;
                i2++;
                i = i3;
            }
        } else {
            i = 0;
        }
        return c.a(new Object[]{Integer.valueOf(i), Integer.valueOf(this.b), Integer.valueOf(this.c), Integer.valueOf(this.a)});
    }

    public void writeToParcel(Parcel parcel, int i) {
        n.a(this, parcel, i);
    }
}
