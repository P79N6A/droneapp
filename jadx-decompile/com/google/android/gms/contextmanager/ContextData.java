package com.google.android.gms.contextmanager;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.Log;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.py;
import com.google.android.gms.internal.rd;

public class ContextData extends AbstractSafeParcelable {
    public static final Creator<ContextData> CREATOR = new b();
    private final int a;
    private py b = null;
    private byte[] c;

    ContextData(int i, byte[] bArr) {
        this.a = i;
        this.c = bArr;
        f();
    }

    private void e() {
        if (!a()) {
            try {
                this.b = py.a(this.c);
                this.c = null;
            } catch (Throwable e) {
                Log.e("ContextData", "Could not deserialize context bytes.", e);
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
        return this.b.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContextData)) {
            return false;
        }
        ContextData contextData = (ContextData) obj;
        e();
        contextData.e();
        return d().equals(contextData.d()) && this.b.c.c == contextData.b.c.c;
    }

    public int hashCode() {
        e();
        return c.a(new Object[]{d(), Integer.valueOf(this.b.c.c)});
    }

    public String toString() {
        e();
        return this.b.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        b.a(this, parcel, i);
    }
}
