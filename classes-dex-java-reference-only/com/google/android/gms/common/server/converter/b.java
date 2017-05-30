package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import java.util.ArrayList;

public class b
  implements Parcelable.Creator<StringToIntConverter>
{
  static void a(StringToIntConverter paramStringToIntConverter, Parcel paramParcel, int paramInt)
  {
    paramInt = com.google.android.gms.common.internal.safeparcel.b.a(paramParcel);
    com.google.android.gms.common.internal.safeparcel.b.a(paramParcel, 1, paramStringToIntConverter.a());
    com.google.android.gms.common.internal.safeparcel.b.c(paramParcel, 2, paramStringToIntConverter.b(), false);
    com.google.android.gms.common.internal.safeparcel.b.a(paramParcel, paramInt);
  }
  
  public StringToIntConverter a(Parcel paramParcel)
  {
    int j = a.b(paramParcel);
    int i = 0;
    ArrayList localArrayList = null;
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
        localArrayList = a.c(paramParcel, k, StringToIntConverter.Entry.CREATOR);
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new a.a(37 + "Overread allowed size end=" + j, paramParcel);
    }
    return new StringToIntConverter(i, localArrayList);
  }
  
  public StringToIntConverter[] a(int paramInt)
  {
    return new StringToIntConverter[paramInt];
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/common/server/converter/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */