package com.google.android.gms.ads.internal.request;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class m
  implements Parcelable.Creator<LargeParcelTeleporter>
{
  static void a(LargeParcelTeleporter paramLargeParcelTeleporter, Parcel paramParcel, int paramInt)
  {
    int i = b.a(paramParcel);
    b.a(paramParcel, 1, paramLargeParcelTeleporter.a);
    b.a(paramParcel, 2, paramLargeParcelTeleporter.b, paramInt, false);
    b.a(paramParcel, i);
  }
  
  public LargeParcelTeleporter a(Parcel paramParcel)
  {
    int j = a.b(paramParcel);
    int i = 0;
    ParcelFileDescriptor localParcelFileDescriptor = null;
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
        localParcelFileDescriptor = (ParcelFileDescriptor)a.a(paramParcel, k, ParcelFileDescriptor.CREATOR);
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new a.a(37 + "Overread allowed size end=" + j, paramParcel);
    }
    return new LargeParcelTeleporter(i, localParcelFileDescriptor);
  }
  
  public LargeParcelTeleporter[] a(int paramInt)
  {
    return new LargeParcelTeleporter[paramInt];
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/ads/internal/request/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */