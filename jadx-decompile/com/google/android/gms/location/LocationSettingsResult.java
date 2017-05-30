package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class LocationSettingsResult extends AbstractSafeParcelable implements m {
    public static final Creator<LocationSettingsResult> CREATOR = new aa();
    private final int a;
    private final Status b;
    private final LocationSettingsStates c;

    LocationSettingsResult(int i, Status status, LocationSettingsStates locationSettingsStates) {
        this.a = i;
        this.b = status;
        this.c = locationSettingsStates;
    }

    public LocationSettingsResult(Status status) {
        this(1, status, null);
    }

    public Status a() {
        return this.b;
    }

    public int b() {
        return this.a;
    }

    public LocationSettingsStates c() {
        return this.c;
    }

    public void writeToParcel(Parcel parcel, int i) {
        aa.a(this, parcel, i);
    }
}
