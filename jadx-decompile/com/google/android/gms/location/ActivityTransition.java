package com.google.android.gms.location;

import android.os.Parcel;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class ActivityTransition extends AbstractSafeParcelable {
    public static final s CREATOR = new s();
    private final int a;
    private final int b;
    private final int c;

    ActivityTransition(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public int a() {
        return this.a;
    }

    public int b() {
        return this.b;
    }

    public int c() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActivityTransition)) {
            return false;
        }
        ActivityTransition activityTransition = (ActivityTransition) obj;
        return this.b == activityTransition.b && this.c == activityTransition.c;
    }

    public int hashCode() {
        return c.a(new Object[]{Integer.valueOf(this.b), Integer.valueOf(this.c)});
    }

    public String toString() {
        int i = this.b;
        return "ActivityTransition [mActivityType=" + i + ", mTransitionType=" + this.c + "]";
    }

    public void writeToParcel(Parcel parcel, int i) {
        s.a(this, parcel, i);
    }
}
