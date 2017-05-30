package com.google.android.gms.awareness.snapshot.internal;

import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.location.ActivityRecognitionResult;

public final class Snapshot
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<Snapshot> CREATOR = new k();
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
  
  Snapshot(int paramInt, ActivityRecognitionResult paramActivityRecognitionResult, BeaconStateImpl paramBeaconStateImpl, HeadphoneStateImpl paramHeadphoneStateImpl, Location paramLocation, NetworkStateImpl paramNetworkStateImpl, DataHolder paramDataHolder, PowerStateImpl paramPowerStateImpl, ScreenStateImpl paramScreenStateImpl, WeatherImpl paramWeatherImpl, DayAttributesImpl paramDayAttributesImpl)
  {
    this.a = paramInt;
    this.b = paramActivityRecognitionResult;
    this.c = paramBeaconStateImpl;
    this.d = paramHeadphoneStateImpl;
    this.e = paramLocation;
    this.f = paramNetworkStateImpl;
    this.g = paramDataHolder;
    this.h = paramPowerStateImpl;
    this.i = paramScreenStateImpl;
    this.j = paramWeatherImpl;
    this.k = paramDayAttributesImpl;
  }
  
  public ActivityRecognitionResult a()
  {
    return this.b;
  }
  
  public BeaconStateImpl b()
  {
    return this.c;
  }
  
  public HeadphoneStateImpl c()
  {
    return this.d;
  }
  
  public Location d()
  {
    return this.e;
  }
  
  public NetworkStateImpl e()
  {
    return this.f;
  }
  
  public DataHolder f()
  {
    return this.g;
  }
  
  public PowerStateImpl g()
  {
    return this.h;
  }
  
  public ScreenStateImpl h()
  {
    return this.i;
  }
  
  public WeatherImpl i()
  {
    return this.j;
  }
  
  public DayAttributesImpl j()
  {
    return this.k;
  }
  
  int k()
  {
    return this.a;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    k.a(this, paramParcel, paramInt);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/awareness/snapshot/internal/Snapshot.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */