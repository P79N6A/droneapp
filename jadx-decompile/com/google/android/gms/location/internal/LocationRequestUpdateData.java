package com.google.android.gms.location.internal;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.support.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.location.w;
import com.google.android.gms.location.x;
import com.google.android.gms.location.x.a;

public class LocationRequestUpdateData extends AbstractSafeParcelable {
    public static final n CREATOR = new n();
    int a;
    LocationRequestInternal b;
    x c;
    PendingIntent d;
    w e;
    g f;
    private final int g;

    LocationRequestUpdateData(int i, int i2, LocationRequestInternal locationRequestInternal, IBinder iBinder, PendingIntent pendingIntent, IBinder iBinder2, IBinder iBinder3) {
        g gVar = null;
        this.g = i;
        this.a = i2;
        this.b = locationRequestInternal;
        this.c = iBinder == null ? null : a.a(iBinder);
        this.d = pendingIntent;
        this.e = iBinder2 == null ? null : w.a.a(iBinder2);
        if (iBinder3 != null) {
            gVar = g.a.a(iBinder3);
        }
        this.f = gVar;
    }

    public static LocationRequestUpdateData a(PendingIntent pendingIntent, @Nullable g gVar) {
        return new LocationRequestUpdateData(1, 2, null, null, pendingIntent, null, gVar != null ? gVar.asBinder() : null);
    }

    public static LocationRequestUpdateData a(LocationRequestInternal locationRequestInternal, PendingIntent pendingIntent, @Nullable g gVar) {
        return new LocationRequestUpdateData(1, 1, locationRequestInternal, null, pendingIntent, null, gVar != null ? gVar.asBinder() : null);
    }

    public static LocationRequestUpdateData a(LocationRequestInternal locationRequestInternal, w wVar, @Nullable g gVar) {
        return new LocationRequestUpdateData(1, 1, locationRequestInternal, null, null, wVar.asBinder(), gVar != null ? gVar.asBinder() : null);
    }

    public static LocationRequestUpdateData a(LocationRequestInternal locationRequestInternal, x xVar, @Nullable g gVar) {
        return new LocationRequestUpdateData(1, 1, locationRequestInternal, xVar.asBinder(), null, null, gVar != null ? gVar.asBinder() : null);
    }

    public static LocationRequestUpdateData a(w wVar, @Nullable g gVar) {
        return new LocationRequestUpdateData(1, 2, null, null, null, wVar.asBinder(), gVar != null ? gVar.asBinder() : null);
    }

    public static LocationRequestUpdateData a(x xVar, @Nullable g gVar) {
        return new LocationRequestUpdateData(1, 2, null, xVar.asBinder(), null, null, gVar != null ? gVar.asBinder() : null);
    }

    int a() {
        return this.g;
    }

    IBinder b() {
        return this.c == null ? null : this.c.asBinder();
    }

    IBinder c() {
        return this.e == null ? null : this.e.asBinder();
    }

    IBinder d() {
        return this.f == null ? null : this.f.asBinder();
    }

    public void writeToParcel(Parcel parcel, int i) {
        n.a(this, parcel, i);
    }
}
