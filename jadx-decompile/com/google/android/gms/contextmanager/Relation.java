package com.google.android.gms.contextmanager;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.Log;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.qo;
import com.google.android.gms.internal.rd;

public class Relation extends AbstractSafeParcelable {
    public static final Creator<Relation> CREATOR = new g();
    private final int a;
    private qo b = null;
    private byte[] c;

    Relation(int i, byte[] bArr) {
        this.a = i;
        this.c = bArr;
        f();
    }

    private void e() {
        if (!a()) {
            try {
                this.b = qo.a(this.c);
                this.c = null;
            } catch (Throwable e) {
                Log.e("Relation", "Could not deserialize relation bytes.", e);
                throw new IllegalStateException(e);
            }
        }
        f();
    }

    private void f() {
        if (this.b == null && this.c != null) {
            return;
        }
        if (this.b != null && this.c == null) {
            return;
        }
        if (this.b != null && this.c != null) {
            throw new IllegalStateException("Invalid internal representation - full");
        } else if (this.b == null && this.c == null) {
            throw new IllegalStateException("Invalid internal representation - empty");
        } else {
            throw new IllegalStateException("Impossible");
        }
    }

    boolean a() {
        return this.b != null;
    }

    int b() {
        return this.a;
    }

    byte[] c() {
        return this.c != null ? this.c : rd.a(this.b);
    }

    public String d() {
        e();
        return this.b.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Relation)) {
            return false;
        }
        Relation relation = (Relation) obj;
        e();
        relation.e();
        return d().equals(relation.d()) && this.b.c.c == relation.b.c.c;
    }

    public int hashCode() {
        e();
        return c.a(new Object[]{d(), Integer.valueOf(this.b.c.c)});
    }

    public void writeToParcel(Parcel parcel, int i) {
        g.a(this, parcel, i);
    }
}
