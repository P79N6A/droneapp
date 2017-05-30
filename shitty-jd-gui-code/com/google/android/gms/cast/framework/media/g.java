package com.google.android.gms.cast.framework.media;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;
import java.util.ArrayList;

public class g
  implements Parcelable.Creator<NotificationOptions>
{
  static void a(NotificationOptions paramNotificationOptions, Parcel paramParcel, int paramInt)
  {
    paramInt = b.a(paramParcel);
    b.a(paramParcel, 1, paramNotificationOptions.a());
    b.b(paramParcel, 2, paramNotificationOptions.b(), false);
    b.a(paramParcel, 3, paramNotificationOptions.c(), false);
    b.a(paramParcel, 4, paramNotificationOptions.d());
    b.a(paramParcel, 5, paramNotificationOptions.e(), false);
    b.a(paramParcel, 6, paramNotificationOptions.f());
    b.a(paramParcel, 7, paramNotificationOptions.g());
    b.a(paramParcel, 8, paramNotificationOptions.h());
    b.a(paramParcel, 9, paramNotificationOptions.i());
    b.a(paramParcel, 10, paramNotificationOptions.j());
    b.a(paramParcel, 11, paramNotificationOptions.k());
    b.a(paramParcel, 12, paramNotificationOptions.l());
    b.a(paramParcel, 13, paramNotificationOptions.m());
    b.a(paramParcel, 14, paramNotificationOptions.n());
    b.a(paramParcel, 15, paramNotificationOptions.o());
    b.a(paramParcel, 16, paramNotificationOptions.p());
    b.a(paramParcel, 17, paramNotificationOptions.q());
    b.a(paramParcel, 18, paramNotificationOptions.r());
    b.a(paramParcel, 19, paramNotificationOptions.s());
    b.a(paramParcel, 20, paramNotificationOptions.t());
    b.a(paramParcel, 21, paramNotificationOptions.u());
    b.a(paramParcel, 22, paramNotificationOptions.v());
    b.a(paramParcel, 23, paramNotificationOptions.w());
    b.a(paramParcel, 24, paramNotificationOptions.x());
    b.a(paramParcel, 25, paramNotificationOptions.y());
    b.a(paramParcel, 26, paramNotificationOptions.z());
    b.a(paramParcel, 27, paramNotificationOptions.A());
    b.a(paramParcel, 28, paramNotificationOptions.B());
    b.a(paramParcel, 29, paramNotificationOptions.C());
    b.a(paramParcel, 30, paramNotificationOptions.D());
    b.a(paramParcel, 31, paramNotificationOptions.E());
    b.a(paramParcel, 32, paramNotificationOptions.F());
    b.a(paramParcel, paramInt);
  }
  
  public NotificationOptions a(Parcel paramParcel)
  {
    int i24 = a.b(paramParcel);
    int i23 = 0;
    ArrayList localArrayList = null;
    int[] arrayOfInt = null;
    long l = 0L;
    String str = null;
    int i22 = 0;
    int i21 = 0;
    int i20 = 0;
    int i19 = 0;
    int i18 = 0;
    int i17 = 0;
    int i16 = 0;
    int i15 = 0;
    int i14 = 0;
    int i13 = 0;
    int i12 = 0;
    int i11 = 0;
    int i10 = 0;
    int i9 = 0;
    int i8 = 0;
    int i7 = 0;
    int i6 = 0;
    int i5 = 0;
    int i4 = 0;
    int i3 = 0;
    int i2 = 0;
    int i1 = 0;
    int n = 0;
    int m = 0;
    int k = 0;
    int j = 0;
    int i = 0;
    while (paramParcel.dataPosition() < i24)
    {
      int i25 = a.a(paramParcel);
      switch (a.a(i25))
      {
      default: 
        a.b(paramParcel, i25);
        break;
      case 1: 
        i23 = a.g(paramParcel, i25);
        break;
      case 2: 
        localArrayList = a.E(paramParcel, i25);
        break;
      case 3: 
        arrayOfInt = a.w(paramParcel, i25);
        break;
      case 4: 
        l = a.i(paramParcel, i25);
        break;
      case 5: 
        str = a.q(paramParcel, i25);
        break;
      case 6: 
        i22 = a.g(paramParcel, i25);
        break;
      case 7: 
        i21 = a.g(paramParcel, i25);
        break;
      case 8: 
        i20 = a.g(paramParcel, i25);
        break;
      case 9: 
        i19 = a.g(paramParcel, i25);
        break;
      case 10: 
        i18 = a.g(paramParcel, i25);
        break;
      case 11: 
        i17 = a.g(paramParcel, i25);
        break;
      case 12: 
        i16 = a.g(paramParcel, i25);
        break;
      case 13: 
        i15 = a.g(paramParcel, i25);
        break;
      case 14: 
        i14 = a.g(paramParcel, i25);
        break;
      case 15: 
        i13 = a.g(paramParcel, i25);
        break;
      case 16: 
        i12 = a.g(paramParcel, i25);
        break;
      case 17: 
        i11 = a.g(paramParcel, i25);
        break;
      case 18: 
        i10 = a.g(paramParcel, i25);
        break;
      case 19: 
        i9 = a.g(paramParcel, i25);
        break;
      case 20: 
        i8 = a.g(paramParcel, i25);
        break;
      case 21: 
        i7 = a.g(paramParcel, i25);
        break;
      case 22: 
        i6 = a.g(paramParcel, i25);
        break;
      case 23: 
        i5 = a.g(paramParcel, i25);
        break;
      case 24: 
        i4 = a.g(paramParcel, i25);
        break;
      case 25: 
        i3 = a.g(paramParcel, i25);
        break;
      case 26: 
        i2 = a.g(paramParcel, i25);
        break;
      case 27: 
        i1 = a.g(paramParcel, i25);
        break;
      case 28: 
        n = a.g(paramParcel, i25);
        break;
      case 29: 
        m = a.g(paramParcel, i25);
        break;
      case 30: 
        k = a.g(paramParcel, i25);
        break;
      case 31: 
        j = a.g(paramParcel, i25);
        break;
      case 32: 
        i = a.g(paramParcel, i25);
      }
    }
    if (paramParcel.dataPosition() != i24) {
      throw new a.a(37 + "Overread allowed size end=" + i24, paramParcel);
    }
    return new NotificationOptions(i23, localArrayList, arrayOfInt, l, str, i22, i21, i20, i19, i18, i17, i16, i15, i14, i13, i12, i11, i10, i9, i8, i7, i6, i5, i4, i3, i2, i1, n, m, k, j, i);
  }
  
  public NotificationOptions[] a(int paramInt)
  {
    return new NotificationOptions[paramInt];
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/cast/framework/media/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */