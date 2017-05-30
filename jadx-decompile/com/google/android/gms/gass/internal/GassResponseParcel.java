package com.google.android.gms.gass.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.df.a;
import com.google.android.gms.internal.rd;

public final class GassResponseParcel extends AbstractSafeParcelable {
    public static final Creator<GassResponseParcel> CREATOR = new d();
    public final int a;
    private a b = null;
    private byte[] c;

    GassResponseParcel(int i, byte[] bArr) {
        this.a = i;
        this.c = bArr;
        e();
    }

    private boolean c() {
        return this.b != null;
    }

    private void d() {
        if (!c()) {
            try {
                this.b = a.a(this.c);
                this.c = null;
            } catch (Throwable e) {
                throw new IllegalStateException(e);
            }
        }
        e();
    }

    private void e() {
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

    public byte[] a() {
        return this.c != null ? this.c : rd.a(this.b);
    }

    public a b() {
        d();
        return this.b;
    }

    public void writeToParcel(Parcel parcel, int i) {
        d.a(this, parcel, i);
    }
}
