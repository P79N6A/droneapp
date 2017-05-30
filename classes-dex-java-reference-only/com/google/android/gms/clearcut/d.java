package com.google.android.gms.clearcut;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.playlog.internal.PlayLoggerContext;

public class d
  implements Parcelable.Creator<LogEventParcelable>
{
  static void a(LogEventParcelable paramLogEventParcelable, Parcel paramParcel, int paramInt)
  {
    int i = b.a(paramParcel);
    b.a(paramParcel, 1, paramLogEventParcelable.a);
    b.a(paramParcel, 2, paramLogEventParcelable.b, paramInt, false);
    b.a(paramParcel, 3, paramLogEventParcelable.c, false);
    b.a(paramParcel, 4, paramLogEventParcelable.d, false);
    b.a(paramParcel, 5, paramLogEventParcelable.e, false);
    b.a(paramParcel, 6, paramLogEventParcelable.f, false);
    b.a(paramParcel, 7, paramLogEventParcelable.g, false);
    b.a(paramParcel, 8, paramLogEventParcelable.h);
    b.a(paramParcel, i);
  }
  
  public LogEventParcelable a(Parcel paramParcel)
  {
    byte[][] arrayOfByte = null;
    int j = a.b(paramParcel);
    int i = 0;
    boolean bool = true;
    int[] arrayOfInt1 = null;
    String[] arrayOfString = null;
    int[] arrayOfInt2 = null;
    byte[] arrayOfByte1 = null;
    PlayLoggerContext localPlayLoggerContext = null;
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
        localPlayLoggerContext = (PlayLoggerContext)a.a(paramParcel, k, PlayLoggerContext.CREATOR);
        break;
      case 3: 
        arrayOfByte1 = a.t(paramParcel, k);
        break;
      case 4: 
        arrayOfInt2 = a.w(paramParcel, k);
        break;
      case 5: 
        arrayOfString = a.C(paramParcel, k);
        break;
      case 6: 
        arrayOfInt1 = a.w(paramParcel, k);
        break;
      case 7: 
        arrayOfByte = a.u(paramParcel, k);
        break;
      case 8: 
        bool = a.c(paramParcel, k);
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new a.a(37 + "Overread allowed size end=" + j, paramParcel);
    }
    return new LogEventParcelable(i, localPlayLoggerContext, arrayOfByte1, arrayOfInt2, arrayOfString, arrayOfInt1, arrayOfByte, bool);
  }
  
  public LogEventParcelable[] a(int paramInt)
  {
    return new LogEventParcelable[paramInt];
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/clearcut/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */