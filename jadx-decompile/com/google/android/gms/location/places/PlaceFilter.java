package com.google.android.gms.location.places;

import android.os.Parcel;
import android.support.annotation.Nullable;
import com.google.android.gms.common.internal.c;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public final class PlaceFilter extends AbstractPlaceFilter {
    public static final t CREATOR = new t();
    private static final PlaceFilter f = new PlaceFilter();
    final int a;
    final List<Integer> b;
    final boolean c;
    final List<UserDataType> d;
    final List<String> e;
    private final Set<Integer> g;
    private final Set<UserDataType> h;
    private final Set<String> i;

    @Deprecated
    public static final class a {
        private Collection<Integer> a;
        private boolean b;
        private Collection<UserDataType> c;
        private String[] d;

        private a() {
            this.a = null;
            this.b = false;
            this.c = null;
            this.d = null;
        }

        public PlaceFilter a() {
            return new PlaceFilter(null, false, null, null);
        }
    }

    public PlaceFilter() {
        this(false, null);
    }

    PlaceFilter(int i, @Nullable List<Integer> list, boolean z, @Nullable List<String> list2, @Nullable List<UserDataType> list3) {
        this.a = i;
        this.b = list == null ? Collections.emptyList() : Collections.unmodifiableList(list);
        this.c = z;
        this.d = list3 == null ? Collections.emptyList() : Collections.unmodifiableList(list3);
        this.e = list2 == null ? Collections.emptyList() : Collections.unmodifiableList(list2);
        this.g = a(this.b);
        this.h = a(this.d);
        this.i = a(this.e);
    }

    public PlaceFilter(@Nullable Collection<Integer> collection, boolean z, @Nullable Collection<String> collection2, @Nullable Collection<UserDataType> collection3) {
        this(0, a(collection), z, a(collection2), a(collection3));
    }

    public PlaceFilter(boolean z, @Nullable Collection<String> collection) {
        this(null, z, collection, null);
    }

    @Deprecated
    public static PlaceFilter d() {
        return new a().a();
    }

    public boolean a() {
        return this.c;
    }

    public Set<String> b() {
        return this.i;
    }

    public Set<Integer> c() {
        return this.g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlaceFilter)) {
            return false;
        }
        PlaceFilter placeFilter = (PlaceFilter) obj;
        return this.g.equals(placeFilter.g) && this.c == placeFilter.c && this.h.equals(placeFilter.h) && this.i.equals(placeFilter.i);
    }

    public int hashCode() {
        return c.a(this.g, Boolean.valueOf(this.c), this.h, this.i);
    }

    public String toString() {
        com.google.android.gms.common.internal.c.a a = c.a((Object) this);
        if (!this.g.isEmpty()) {
            a.a("types", this.g);
        }
        a.a("requireOpenNow", Boolean.valueOf(this.c));
        if (!this.i.isEmpty()) {
            a.a("placeIds", this.i);
        }
        if (!this.h.isEmpty()) {
            a.a("requestedUserDataTypes", this.h);
        }
        return a.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        t.a(this, parcel, i);
    }
}
