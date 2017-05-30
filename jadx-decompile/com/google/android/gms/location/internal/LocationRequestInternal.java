package com.google.android.gms.location.internal;

import android.os.Parcel;
import android.support.annotation.Nullable;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.location.LocationRequest;
import java.util.Collections;
import java.util.List;

public class LocationRequestInternal extends AbstractSafeParcelable {
    public static final m CREATOR = new m();
    static final List<ClientIdentity> a = Collections.emptyList();
    LocationRequest b;
    boolean c;
    List<ClientIdentity> d;
    @Nullable
    String e;
    boolean f;
    boolean g;
    private final int h;

    LocationRequestInternal(int i, LocationRequest locationRequest, boolean z, List<ClientIdentity> list, @Nullable String str, boolean z2, boolean z3) {
        this.h = i;
        this.b = locationRequest;
        this.c = z;
        this.d = list;
        this.e = str;
        this.f = z2;
        this.g = z3;
    }

    @Deprecated
    public static LocationRequestInternal a(LocationRequest locationRequest) {
        return a(null, locationRequest);
    }

    public static LocationRequestInternal a(@Nullable String str, LocationRequest locationRequest) {
        return new LocationRequestInternal(1, locationRequest, true, a, str, false, false);
    }

    int a() {
        return this.h;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof LocationRequestInternal)) {
            return false;
        }
        LocationRequestInternal locationRequestInternal = (LocationRequestInternal) obj;
        return c.a(this.b, locationRequestInternal.b) && this.c == locationRequestInternal.c && this.f == locationRequestInternal.f && c.a(this.d, locationRequestInternal.d) && this.g == locationRequestInternal.g;
    }

    public int hashCode() {
        return this.b.hashCode();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.b.toString());
        if (this.e != null) {
            stringBuilder.append(" tag=").append(this.e);
        }
        stringBuilder.append(" trigger=").append(this.c);
        stringBuilder.append(" hideAppOps=").append(this.f);
        stringBuilder.append(" clients=").append(this.d);
        stringBuilder.append(" forceCoarseLocation=").append(this.g);
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        m.a(this, parcel, i);
    }
}
