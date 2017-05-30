package com.google.android.gms.location.places;

import android.os.Parcel;
import android.support.annotation.Nullable;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.c.a;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public final class NearbyAlertFilter extends AbstractPlaceFilter {
    public static final q CREATOR = new q();
    final int a;
    final List<String> b;
    final List<Integer> c;
    final List<UserDataType> d;
    final String e;
    final boolean f;
    private final Set<String> g;
    private final Set<Integer> h;
    private final Set<UserDataType> i;

    NearbyAlertFilter(int i, @Nullable List<String> list, @Nullable List<Integer> list2, @Nullable List<UserDataType> list3, @Nullable String str, boolean z) {
        this.a = i;
        this.c = list2 == null ? Collections.emptyList() : Collections.unmodifiableList(list2);
        this.d = list3 == null ? Collections.emptyList() : Collections.unmodifiableList(list3);
        this.b = list == null ? Collections.emptyList() : Collections.unmodifiableList(list);
        this.h = AbstractPlaceFilter.a(this.c);
        this.i = AbstractPlaceFilter.a(this.d);
        this.g = AbstractPlaceFilter.a(this.b);
        this.e = str;
        this.f = z;
    }

    public static NearbyAlertFilter b(Collection<String> collection) {
        if (collection != null && !collection.isEmpty()) {
            return new NearbyAlertFilter(0, AbstractPlaceFilter.a((Collection) collection), null, null, null, false);
        }
        throw new IllegalArgumentException("NearbyAlertFilters must contain at least oneplace ID to match results with.");
    }

    public static NearbyAlertFilter c(Collection<Integer> collection) {
        if (collection != null && !collection.isEmpty()) {
            return new NearbyAlertFilter(0, null, AbstractPlaceFilter.a((Collection) collection), null, null, false);
        }
        throw new IllegalArgumentException("NearbyAlertFilters must contain at least oneplace type to match results with.");
    }

    public Set<String> b() {
        return this.g;
    }

    public boolean c() {
        return this.f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NearbyAlertFilter)) {
            return false;
        }
        NearbyAlertFilter nearbyAlertFilter = (NearbyAlertFilter) obj;
        return (this.e != null || nearbyAlertFilter.e == null) ? this.h.equals(nearbyAlertFilter.h) && this.i.equals(nearbyAlertFilter.i) && this.g.equals(nearbyAlertFilter.g) && ((this.e == null || this.e.equals(nearbyAlertFilter.e)) && this.f == nearbyAlertFilter.c()) : false;
    }

    public int hashCode() {
        return c.a(new Object[]{this.h, this.i, this.g, this.e, Boolean.valueOf(this.f)});
    }

    public String toString() {
        a a = c.a(this);
        if (!this.h.isEmpty()) {
            a.a("types", this.h);
        }
        if (!this.g.isEmpty()) {
            a.a("placeIds", this.g);
        }
        if (!this.i.isEmpty()) {
            a.a("requestedUserDataTypes", this.i);
        }
        if (this.e != null) {
            a.a("chainName", this.e);
        }
        a.a("Beacon required: ", Boolean.valueOf(this.f));
        return a.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        q.a(this, parcel, i);
    }
}
