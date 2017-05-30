package com.google.android.gms.awareness.snapshot.internal;

import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.location.ActivityRecognitionResult;

public final class Snapshot extends AbstractSafeParcelable {
    public static final Creator<Snapshot> CREATOR = new k();
    private final int a;
    private final ActivityRecognitionResult b;
    private final BeaconStateImpl c;
    private final HeadphoneStateImpl d;
    private final Location e;
    private final NetworkStateImpl f;
    private final DataHolder g;
    private final PowerStateImpl h;
    private final ScreenStateImpl i;
    private final WeatherImpl j;
    private final DayAttributesImpl k;

    Snapshot(int i, ActivityRecognitionResult activityRecognitionResult, BeaconStateImpl beaconStateImpl, HeadphoneStateImpl headphoneStateImpl, Location location, NetworkStateImpl networkStateImpl, DataHolder dataHolder, PowerStateImpl powerStateImpl, ScreenStateImpl screenStateImpl, WeatherImpl weatherImpl, DayAttributesImpl dayAttributesImpl) {
        this.a = i;
        this.b = activityRecognitionResult;
        this.c = beaconStateImpl;
        this.d = headphoneStateImpl;
        this.e = location;
        this.f = networkStateImpl;
        this.g = dataHolder;
        this.h = powerStateImpl;
        this.i = screenStateImpl;
        this.j = weatherImpl;
        this.k = dayAttributesImpl;
    }

    public ActivityRecognitionResult a() {
        return this.b;
    }

    public BeaconStateImpl b() {
        return this.c;
    }

    public HeadphoneStateImpl c() {
        return this.d;
    }

    public Location d() {
        return this.e;
    }

    public NetworkStateImpl e() {
        return this.f;
    }

    public DataHolder f() {
        return this.g;
    }

    public PowerStateImpl g() {
        return this.h;
    }

    public ScreenStateImpl h() {
        return this.i;
    }

    public WeatherImpl i() {
        return this.j;
    }

    public DayAttributesImpl j() {
        return this.k;
    }

    int k() {
        return this.a;
    }

    public void writeToParcel(Parcel parcel, int i) {
        k.a(this, parcel, i);
    }
}
