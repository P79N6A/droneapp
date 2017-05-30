package com.google.android.gms.appdatasearch;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class e
  implements Parcelable.Creator<Feature>
{
  static void a(Feature paramFeature, Parcel paramParcel, int paramInt)
  {
    paramInt = b.a(paramParcel);
    b.a(paramParcel, 1, paramFeature.b);
    b.a(paramParcel, 2, paramFeature.c, false);
    b.a(paramParcel, 1000, paramFeature.a);
    b.a(paramParcel, paramInt);
  }
  
  public Feature a(Parcel paramParcel)
  {
    int j = 0;
    int k = a.b(paramParcel);
    Bundle localBundle = null;
    int i = 0;
    while (paramParcel.dataPosition() < k)
    {
      int m = a.a(paramParcel);
      switch (a.a(m))
      {
      default: 
        a.b(paramParcel, m);
        break;
      case 1: 
        j = a.g(paramParcel, m);
        break;
      case 2: 
        localBundle = a.s(paramParcel, m);
        break;
      case 1000: 
        i = a.g(paramParcel, m);
      }
    }
    if (paramParcel.dataPosition() != k) {
      throw new a.a(37 + "Overread allowed size end=" + k, paramParcel);
    }
    return new Feature(i, j, localBundle);
  }
  
  public Feature[] a(int paramInt)
  {
    return new Feature[paramInt];
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/appdatasearch/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */