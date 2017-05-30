package com.google.android.gms.drive;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.Base64;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.ajt;
import com.google.android.gms.internal.rd;

public class ChangeSequenceNumber extends AbstractSafeParcelable {
    public static final Creator<ChangeSequenceNumber> CREATOR = new p();
    final int a;
    final long b;
    final long c;
    final long d;
    private volatile String e = null;

    ChangeSequenceNumber(int i, long j, long j2, long j3) {
        boolean z = true;
        d.b(j != -1);
        d.b(j2 != -1);
        if (j3 == -1) {
            z = false;
        }
        d.b(z);
        this.a = i;
        this.b = j;
        this.c = j2;
        this.d = j3;
    }

    public final String a() {
        if (this.e == null) {
            String encodeToString = Base64.encodeToString(b(), 10);
            String valueOf = String.valueOf("ChangeSequenceNumber:");
            encodeToString = String.valueOf(encodeToString);
            this.e = encodeToString.length() != 0 ? valueOf.concat(encodeToString) : new String(valueOf);
        }
        return this.e;
    }

    final byte[] b() {
        rd com_google_android_gms_internal_ajt = new ajt();
        com_google_android_gms_internal_ajt.a = this.a;
        com_google_android_gms_internal_ajt.b = this.b;
        com_google_android_gms_internal_ajt.c = this.c;
        com_google_android_gms_internal_ajt.d = this.d;
        return rd.a(com_google_android_gms_internal_ajt);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ChangeSequenceNumber)) {
            return false;
        }
        ChangeSequenceNumber changeSequenceNumber = (ChangeSequenceNumber) obj;
        return changeSequenceNumber.c == this.c && changeSequenceNumber.d == this.d && changeSequenceNumber.b == this.b;
    }

    public int hashCode() {
        String valueOf = String.valueOf(String.valueOf(this.b));
        String valueOf2 = String.valueOf(String.valueOf(this.c));
        String valueOf3 = String.valueOf(String.valueOf(this.d));
        return new StringBuilder(((String.valueOf(valueOf).length() + 0) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf3).length()).append(valueOf).append(valueOf2).append(valueOf3).toString().hashCode();
    }

    public String toString() {
        return a();
    }

    public void writeToParcel(Parcel parcel, int i) {
        p.a(this, parcel, i);
    }
}
