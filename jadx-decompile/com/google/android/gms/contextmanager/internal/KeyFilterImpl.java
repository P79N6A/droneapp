package com.google.android.gms.contextmanager.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;

public class KeyFilterImpl extends AbstractSafeParcelable {
    public static final Creator<KeyFilterImpl> CREATOR = new l();
    private final int a;
    private final ArrayList<Inclusion> b;

    public static class Inclusion extends AbstractSafeParcelable {
        public static final Creator<Inclusion> CREATOR = new m();
        private final int a;
        private final String[] b;
        private final String[] c;
        private final String[] d;

        Inclusion(int i, String[] strArr, String[] strArr2, String[] strArr3) {
            this.a = i;
            this.b = strArr;
            this.c = strArr2;
            this.d = strArr3;
        }

        int a() {
            return this.a;
        }

        public String[] b() {
            return this.b;
        }

        public String[] c() {
            return this.c;
        }

        public String[] d() {
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
            return Arrays.equals(b(), inclusion.b()) && Arrays.equals(c(), inclusion.c()) && Arrays.equals(d(), inclusion.d());
        }

        public int hashCode() {
            return (Arrays.hashCode(this.b) + Arrays.hashCode(this.c)) + Arrays.hashCode(this.d);
        }

        public void writeToParcel(Parcel parcel, int i) {
            m.a(this, parcel, i);
        }
    }

    KeyFilterImpl(int i, ArrayList<Inclusion> arrayList) {
        this.a = i;
        this.b = arrayList;
    }

    int a() {
        return this.a;
    }

    public ArrayList<Inclusion> b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KeyFilterImpl)) {
            return false;
        }
        return b().equals(((KeyFilterImpl) obj).b());
    }

    public int hashCode() {
        return c.a(new Object[]{this.b});
    }

    public void writeToParcel(Parcel parcel, int i) {
        l.a(this, parcel, i);
    }
}
