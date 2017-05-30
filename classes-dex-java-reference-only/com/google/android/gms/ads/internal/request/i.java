package com.google.android.gms.ads.internal.request;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;
import java.util.ArrayList;

public class i
  implements Parcelable.Creator<AutoClickProtectionConfigurationParcel>
{
  static void a(AutoClickProtectionConfigurationParcel paramAutoClickProtectionConfigurationParcel, Parcel paramParcel, int paramInt)
  {
    paramInt = b.a(paramParcel);
    b.a(paramParcel, 1, paramAutoClickProtectionConfigurationParcel.a);
    b.a(paramParcel, 2, paramAutoClickProtectionConfigurationParcel.b);
    b.b(paramParcel, 3, paramAutoClickProtectionConfigurationParcel.c, false);
    b.a(paramParcel, paramInt);
  }
  
  public AutoClickProtectionConfigurationParcel a(Parcel paramParcel)
  {
    boolean bool = false;
    int j = a.b(paramParcel);
    ArrayList localArrayList = null;
    int i = 0;
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
        bool = a.c(paramParcel, k);
        break;
      case 3: 
        localArrayList = a.E(paramParcel, k);
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new a.a(37 + "Overread allowed size end=" + j, paramParcel);
    }
    return new AutoClickProtectionConfigurationParcel(i, bool, localArrayList);
  }
  
  public AutoClickProtectionConfigurationParcel[] a(int paramInt)
  {
    return new AutoClickProtectionConfigurationParcel[paramInt];
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/ads/internal/request/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */