package com.google.android.gms.location;

import android.content.Intent;
import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.annotation.NonNull;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class LocationResult extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Creator<LocationResult> CREATOR = new y();
    static final List<Location> a = Collections.emptyList();
    private final int b;
    private final List<Location> c;

    LocationResult(int i, List<Location> list) {
        this.b = i;
        this.c = list;
    }

    public static LocationResult a(List<Location> list) {
        List list2;
        if (list == null) {
            list2 = a;
        }
        return new LocationResult(2, list2);
    }

    public static boolean a(Intent intent) {
        return intent == null ? false : intent.hasExtra("com.google.android.gms.location.EXTRA_LOCATION_RESULT");
    }

    public static LocationResult b(Intent intent) {
        return !a(intent) ? null : (LocationResult) intent.getExtras().getParcelable("com.google.android.gms.location.EXTRA_LOCATION_RESULT");
    }

    public Location a() {
        int size = this.c.size();
        return size == 0 ? null : (Location) this.c.get(size - 1);
    }

    @NonNull
    public List<Location> b() {
        return this.c;
    }

    int c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof LocationResult)) {
            return false;
        }
        LocationResult locationResult = (LocationResult) obj;
        if (locationResult.c.size() != this.c.size()) {
            return false;
        }
        Iterator it = this.c.iterator();
        for (Location time : locationResult.c) {
            if (((Location) it.next()).getTime() != time.getTime()) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = 17;
        for (Location time : this.c) {
            long time2 = time.getTime();
            i = ((int) (time2 ^ (time2 >>> 32))) + (i * 31);
        }
        return i;
    }

    public String toString() {
        String valueOf = String.valueOf(this.c);
        return new StringBuilder(String.valueOf(valueOf).length() + 27).append("LocationResult[locations: ").append(valueOf).append("]").toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        y.a(this, parcel, i);
    }
}
