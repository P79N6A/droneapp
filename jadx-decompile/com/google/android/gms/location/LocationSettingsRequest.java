package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public final class LocationSettingsRequest extends AbstractSafeParcelable {
    public static final Creator<LocationSettingsRequest> CREATOR = new z();
    private final int a;
    private final List<LocationRequest> b;
    private final boolean c;
    private final boolean d;

    public static final class a {
        private final ArrayList<LocationRequest> a = new ArrayList();
        private boolean b = false;
        private boolean c = false;

        public a a(LocationRequest locationRequest) {
            this.a.add(locationRequest);
            return this;
        }

        public a a(Collection<LocationRequest> collection) {
            this.a.addAll(collection);
            return this;
        }

        public a a(boolean z) {
            this.b = z;
            return this;
        }

        public LocationSettingsRequest a() {
            return new LocationSettingsRequest(this.a, this.b, this.c);
        }

        public a b(boolean z) {
            this.c = z;
            return this;
        }
    }

    LocationSettingsRequest(int i, List<LocationRequest> list, boolean z, boolean z2) {
        this.a = i;
        this.b = list;
        this.c = z;
        this.d = z2;
    }

    private LocationSettingsRequest(List<LocationRequest> list, boolean z, boolean z2) {
        this(3, (List) list, z, z2);
    }

    public int a() {
        return this.a;
    }

    public List<LocationRequest> b() {
        return Collections.unmodifiableList(this.b);
    }

    public boolean c() {
        return this.c;
    }

    public boolean d() {
        return this.d;
    }

    public void writeToParcel(Parcel parcel, int i) {
        z.a(this, parcel, i);
    }
}
