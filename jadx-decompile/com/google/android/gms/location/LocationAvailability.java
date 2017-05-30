package com.google.android.gms.location;

import android.content.Intent;
import android.os.Parcel;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class LocationAvailability extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final j CREATOR = new j();
    int a;
    int b;
    long c;
    int d;
    private final int e;

    LocationAvailability(int i, int i2, int i3, int i4, long j) {
        this.e = i;
        this.d = i2;
        this.a = i3;
        this.b = i4;
        this.c = j;
    }

    public static boolean a(Intent intent) {
        return intent == null ? false : intent.hasExtra("com.google.android.gms.location.EXTRA_LOCATION_AVAILABILITY");
    }

    public static LocationAvailability b(Intent intent) {
        return !a(intent) ? null : (LocationAvailability) intent.getExtras().getParcelable("com.google.android.gms.location.EXTRA_LOCATION_AVAILABILITY");
    }

    public boolean a() {
        return this.d < 1000;
    }

    int b() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof LocationAvailability)) {
            return false;
        }
        LocationAvailability locationAvailability = (LocationAvailability) obj;
        return this.d == locationAvailability.d && this.a == locationAvailability.a && this.b == locationAvailability.b && this.c == locationAvailability.c;
    }

    public int hashCode() {
        return c.a(new Object[]{Integer.valueOf(this.d), Integer.valueOf(this.a), Integer.valueOf(this.b), Long.valueOf(this.c)});
    }

    public String toString() {
        return "LocationAvailability[isLocationAvailable: " + a() + "]";
    }

    public void writeToParcel(Parcel parcel, int i) {
        j.a(this, parcel, i);
    }
}
