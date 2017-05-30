package com.google.android.gms.common.data;

import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class l
  implements Parcelable.Creator<DataHolder>
{
  static void a(DataHolder paramDataHolder, Parcel paramParcel, int paramInt)
  {
    int i = b.a(paramParcel);
    b.a(paramParcel, 1, paramDataHolder.c(), false);
    b.a(paramParcel, 2, paramDataHolder.d(), paramInt, false);
    b.a(paramParcel, 3, paramDataHolder.e());
    b.a(paramParcel, 4, paramDataHolder.f(), false);
    b.a(paramParcel, 1000, paramDataHolder.b());
    b.a(paramParcel, i);
  }
  
  public DataHolder a(Parcel paramParcel)
  {
    int i = 0;
    Bundle localBundle = null;
    int k = a.b(paramParcel);
    CursorWindow[] arrayOfCursorWindow = null;
    String[] arrayOfString = null;
    int j = 0;
    while (paramParcel.dataPosition() < k)
    {
      int m = a.a(paramParcel);
      switch (a.a(m))
      {
      default: 
        a.b(paramParcel, m);
        break;
      case 1: 
        arrayOfString = a.C(paramParcel, m);
        break;
      case 2: 
        arrayOfCursorWindow = (CursorWindow[])a.b(paramParcel, m, CursorWindow.CREATOR);
        break;
      case 3: 
        i = a.g(paramParcel, m);
        break;
      case 4: 
        localBundle = a.s(paramParcel, m);
        break;
      case 1000: 
        j = a.g(paramParcel, m);
      }
    }
    if (paramParcel.dataPosition() != k) {
      throw new a.a(37 + "Overread allowed size end=" + k, paramParcel);
    }
    paramParcel = new DataHolder(j, arrayOfString, arrayOfCursorWindow, i, localBundle);
    paramParcel.a();
    return paramParcel;
  }
  
  public DataHolder[] a(int paramInt)
  {
    return new DataHolder[paramInt];
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/common/data/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */