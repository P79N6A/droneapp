package com.google.android.gms.location;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.c;

public final class LocationSettingsStates extends AbstractSafeParcelable {
    public static final Creator<LocationSettingsStates> CREATOR = new ab();
    private final int a;
    private final boolean b;
    private final boolean c;
    private final boolean d;
    private final boolean e;
    private final boolean f;
    private final boolean g;

    LocationSettingsStates(int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.a = i;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = z5;
        this.g = z6;
    }

    public static LocationSettingsStates a(Intent intent) {
        return (LocationSettingsStates) c.a(intent, "com.google.android.gms.location.LOCATION_SETTINGS_STATES", CREATOR);
    }

    public int a() {
        return this.a;
    }

    public boolean b() {
        return this.b;
    }

    public boolean c() {
        return this.e;
    }

    public boolean d() {
        return this.c;
    }

    public boolean e() {
        return this.f;
    }

    public boolean f() {
        return this.b || this.c;
    }

    public boolean g() {
        return this.e || this.f;
    }

    public boolean h() {
        return this.d;
    }

    public boolean i() {
        return this.g;
    }

    public void writeToParcel(Parcel parcel, int i) {
        ab.a(this, parcel, i);
    }
}
