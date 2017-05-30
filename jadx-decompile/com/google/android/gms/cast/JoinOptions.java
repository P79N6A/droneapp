package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class JoinOptions extends AbstractSafeParcelable {
    public static final Creator<JoinOptions> CREATOR = new k();
    private final int a;
    private int b;

    public JoinOptions() {
        this(1, 0);
    }

    JoinOptions(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    int a() {
        return this.a;
    }

    public int b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof JoinOptions)) {
            return false;
        }
        return this.b == ((JoinOptions) obj).b;
    }

    public int hashCode() {
        return c.a(Integer.valueOf(this.b));
    }

    public String toString() {
        String str;
        switch (this.b) {
            case 0:
                str = "STRONG";
                break;
            case 2:
                str = "INVISIBLE";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        return String.format("joinOptions(connectionType=%s)", new Object[]{str});
    }

    public void writeToParcel(Parcel parcel, int i) {
        k.a(this, parcel, i);
    }
}
