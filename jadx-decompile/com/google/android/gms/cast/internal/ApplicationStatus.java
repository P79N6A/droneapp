package com.google.android.gms.cast.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class ApplicationStatus extends AbstractSafeParcelable {
    public static final Creator<ApplicationStatus> CREATOR = new a();
    private final int a;
    private String b;

    public ApplicationStatus() {
        this(1, null);
    }

    ApplicationStatus(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public int a() {
        return this.a;
    }

    public String b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ApplicationStatus)) {
            return false;
        }
        return f.a(this.b, ((ApplicationStatus) obj).b);
    }

    public int hashCode() {
        return c.a(this.b);
    }

    public void writeToParcel(Parcel parcel, int i) {
        a.a(this, parcel, i);
    }
}
