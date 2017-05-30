package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.location.internal.ParcelableGeofence;
import java.util.ArrayList;
import java.util.List;

public class GeofencingRequest extends AbstractSafeParcelable {
    public static final Creator<GeofencingRequest> CREATOR = new u();
    public static final int a = 1;
    public static final int b = 2;
    public static final int c = 4;
    private final int d;
    private final List<ParcelableGeofence> e;
    private final int f;

    public static final class a {
        private final List<ParcelableGeofence> a = new ArrayList();
        private int b = 5;

        public static int b(int i) {
            return i & 7;
        }

        public a a(int i) {
            this.b = b(i);
            return this;
        }

        public a a(f fVar) {
            d.a(fVar, "geofence can't be null.");
            d.b(fVar instanceof ParcelableGeofence, "Geofence must be created using Geofence.Builder.");
            this.a.add((ParcelableGeofence) fVar);
            return this;
        }

        public a a(List<f> list) {
            if (!(list == null || list.isEmpty())) {
                for (f fVar : list) {
                    if (fVar != null) {
                        a(fVar);
                    }
                }
            }
            return this;
        }

        public GeofencingRequest a() {
            d.b(!this.a.isEmpty(), "No geofence has been added to this request.");
            return new GeofencingRequest(this.a, this.b);
        }
    }

    GeofencingRequest(int i, List<ParcelableGeofence> list, int i2) {
        this.d = i;
        this.e = list;
        this.f = i2;
    }

    private GeofencingRequest(List<ParcelableGeofence> list, int i) {
        this(1, (List) list, i);
    }

    public int a() {
        return this.d;
    }

    public List<ParcelableGeofence> b() {
        return this.e;
    }

    public List<f> c() {
        List<f> arrayList = new ArrayList();
        arrayList.addAll(this.e);
        return arrayList;
    }

    public int d() {
        return this.f;
    }

    public void writeToParcel(Parcel parcel, int i) {
        u.a(this, parcel, i);
    }
}
