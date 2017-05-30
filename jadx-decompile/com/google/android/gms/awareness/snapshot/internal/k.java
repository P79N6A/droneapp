package com.google.android.gms.awareness.snapshot.internal;

import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.location.ActivityRecognitionResult;

public class k implements Creator<Snapshot> {
    static void a(Snapshot snapshot, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, snapshot.k());
        b.a(parcel, 2, snapshot.a(), i, false);
        b.a(parcel, 3, snapshot.b(), i, false);
        b.a(parcel, 4, snapshot.c(), i, false);
        b.a(parcel, 5, snapshot.d(), i, false);
        b.a(parcel, 6, snapshot.e(), i, false);
        b.a(parcel, 7, snapshot.f(), i, false);
        b.a(parcel, 8, snapshot.g(), i, false);
        b.a(parcel, 9, snapshot.h(), i, false);
        b.a(parcel, 10, snapshot.i(), i, false);
        b.a(parcel, 11, snapshot.j(), i, false);
        b.a(parcel, a);
    }

    public Snapshot a(Parcel parcel) {
        DayAttributesImpl dayAttributesImpl = null;
        int b = a.b(parcel);
        int i = 0;
        WeatherImpl weatherImpl = null;
        ScreenStateImpl screenStateImpl = null;
        PowerStateImpl powerStateImpl = null;
        DataHolder dataHolder = null;
        NetworkStateImpl networkStateImpl = null;
        Location location = null;
        HeadphoneStateImpl headphoneStateImpl = null;
        BeaconStateImpl beaconStateImpl = null;
        ActivityRecognitionResult activityRecognitionResult = null;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i = a.g(parcel, a);
                    break;
                case 2:
                    activityRecognitionResult = (ActivityRecognitionResult) a.a(parcel, a, ActivityRecognitionResult.CREATOR);
                    break;
                case 3:
                    beaconStateImpl = (BeaconStateImpl) a.a(parcel, a, BeaconStateImpl.CREATOR);
                    break;
                case 4:
                    headphoneStateImpl = (HeadphoneStateImpl) a.a(parcel, a, HeadphoneStateImpl.CREATOR);
                    break;
                case 5:
                    location = (Location) a.a(parcel, a, Location.CREATOR);
                    break;
                case 6:
                    networkStateImpl = (NetworkStateImpl) a.a(parcel, a, NetworkStateImpl.CREATOR);
                    break;
                case 7:
                    dataHolder = (DataHolder) a.a(parcel, a, DataHolder.CREATOR);
                    break;
                case 8:
                    powerStateImpl = (PowerStateImpl) a.a(parcel, a, PowerStateImpl.CREATOR);
                    break;
                case 9:
                    screenStateImpl = (ScreenStateImpl) a.a(parcel, a, ScreenStateImpl.CREATOR);
                    break;
                case 10:
                    weatherImpl = (WeatherImpl) a.a(parcel, a, WeatherImpl.CREATOR);
                    break;
                case 11:
                    dayAttributesImpl = (DayAttributesImpl) a.a(parcel, a, DayAttributesImpl.CREATOR);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new Snapshot(i, activityRecognitionResult, beaconStateImpl, headphoneStateImpl, location, networkStateImpl, dataHolder, powerStateImpl, screenStateImpl, weatherImpl, dayAttributesImpl);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public Snapshot[] a(int i) {
        return new Snapshot[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
