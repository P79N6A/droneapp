package com.google.android.gms.awareness.snapshot.internal;

import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.location.ActivityRecognitionResult;

public class k
  implements Parcelable.Creator<Snapshot>
{
  static void a(Snapshot paramSnapshot, Parcel paramParcel, int paramInt)
  {
    int i = b.a(paramParcel);
    b.a(paramParcel, 1, paramSnapshot.k());
    b.a(paramParcel, 2, paramSnapshot.a(), paramInt, false);
    b.a(paramParcel, 3, paramSnapshot.b(), paramInt, false);
    b.a(paramParcel, 4, paramSnapshot.c(), paramInt, false);
    b.a(paramParcel, 5, paramSnapshot.d(), paramInt, false);
    b.a(paramParcel, 6, paramSnapshot.e(), paramInt, false);
    b.a(paramParcel, 7, paramSnapshot.f(), paramInt, false);
    b.a(paramParcel, 8, paramSnapshot.g(), paramInt, false);
    b.a(paramParcel, 9, paramSnapshot.h(), paramInt, false);
    b.a(paramParcel, 10, paramSnapshot.i(), paramInt, false);
    b.a(paramParcel, 11, paramSnapshot.j(), paramInt, false);
    b.a(paramParcel, i);
  }
  
  public Snapshot a(Parcel paramParcel)
  {
    DayAttributesImpl localDayAttributesImpl = null;
    int j = a.b(paramParcel);
    int i = 0;
    WeatherImpl localWeatherImpl = null;
    ScreenStateImpl localScreenStateImpl = null;
    PowerStateImpl localPowerStateImpl = null;
    DataHolder localDataHolder = null;
    NetworkStateImpl localNetworkStateImpl = null;
    Location localLocation = null;
    HeadphoneStateImpl localHeadphoneStateImpl = null;
    BeaconStateImpl localBeaconStateImpl = null;
    ActivityRecognitionResult localActivityRecognitionResult = null;
    while (paramParcel.dataPosition() < j)
    {
      int k = a.a(paramParcel);
      switch (a.a(k))
      {
      default: 
        a.b(paramParcel, k);
        break;
      case 1: 
        i = a.g(paramParcel, k);
        break;
      case 2: 
        localActivityRecognitionResult = (ActivityRecognitionResult)a.a(paramParcel, k, ActivityRecognitionResult.CREATOR);
        break;
      case 3: 
        localBeaconStateImpl = (BeaconStateImpl)a.a(paramParcel, k, BeaconStateImpl.CREATOR);
        break;
      case 4: 
        localHeadphoneStateImpl = (HeadphoneStateImpl)a.a(paramParcel, k, HeadphoneStateImpl.CREATOR);
        break;
      case 5: 
        localLocation = (Location)a.a(paramParcel, k, Location.CREATOR);
        break;
      case 6: 
        localNetworkStateImpl = (NetworkStateImpl)a.a(paramParcel, k, NetworkStateImpl.CREATOR);
        break;
      case 7: 
        localDataHolder = (DataHolder)a.a(paramParcel, k, DataHolder.CREATOR);
        break;
      case 8: 
        localPowerStateImpl = (PowerStateImpl)a.a(paramParcel, k, PowerStateImpl.CREATOR);
        break;
      case 9: 
        localScreenStateImpl = (ScreenStateImpl)a.a(paramParcel, k, ScreenStateImpl.CREATOR);
        break;
      case 10: 
        localWeatherImpl = (WeatherImpl)a.a(paramParcel, k, WeatherImpl.CREATOR);
        break;
      case 11: 
        localDayAttributesImpl = (DayAttributesImpl)a.a(paramParcel, k, DayAttributesImpl.CREATOR);
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new a.a(37 + "Overread allowed size end=" + j, paramParcel);
    }
    return new Snapshot(i, localActivityRecognitionResult, localBeaconStateImpl, localHeadphoneStateImpl, localLocation, localNetworkStateImpl, localDataHolder, localPowerStateImpl, localScreenStateImpl, localWeatherImpl, localDayAttributesImpl);
  }
  
  public Snapshot[] a(int paramInt)
  {
    return new Snapshot[paramInt];
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/awareness/snapshot/internal/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */