package com.google.android.gms.cast.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class g
  implements Parcelable.Creator<DeviceStatus>
{
  static void a(DeviceStatus paramDeviceStatus, Parcel paramParcel, int paramInt)
  {
    int i = b.a(paramParcel);
    b.a(paramParcel, 1, paramDeviceStatus.a());
    b.a(paramParcel, 2, paramDeviceStatus.b());
    b.a(paramParcel, 3, paramDeviceStatus.c());
    b.a(paramParcel, 4, paramDeviceStatus.d());
    b.a(paramParcel, 5, paramDeviceStatus.f(), paramInt, false);
    b.a(paramParcel, 6, paramDeviceStatus.e());
    b.a(paramParcel, i);
  }
  
  public DeviceStatus a(Parcel paramParcel)
  {
    int i = 0;
    int m = a.b(paramParcel);
    double d = 0.0D;
    ApplicationMetadata localApplicationMetadata = null;
    int j = 0;
    boolean bool = false;
    int k = 0;
    while (paramParcel.dataPosition() < m)
    {
      int n = a.a(paramParcel);
      switch (a.a(n))
      {
      default: 
        a.b(paramParcel, n);
        break;
      case 1: 
        k = a.g(paramParcel, n);
        break;
      case 2: 
        d = a.n(paramParcel, n);
        break;
      case 3: 
        bool = a.c(paramParcel, n);
        break;
      case 4: 
        j = a.g(paramParcel, n);
        break;
      case 5: 
        localApplicationMetadata = (ApplicationMetadata)a.a(paramParcel, n, ApplicationMetadata.CREATOR);
        break;
      case 6: 
        i = a.g(paramParcel, n);
      }
    }
    if (paramParcel.dataPosition() != m) {
      throw new a.a(37 + "Overread allowed size end=" + m, paramParcel);
    }
    return new DeviceStatus(k, d, bool, j, localApplicationMetadata, i);
  }
  
  public DeviceStatus[] a(int paramInt)
  {
    return new DeviceStatus[paramInt];
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/cast/internal/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */