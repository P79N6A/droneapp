package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class i
  implements Parcelable.Creator<RegisterSectionInfo>
{
  static void a(RegisterSectionInfo paramRegisterSectionInfo, Parcel paramParcel, int paramInt)
  {
    int i = b.a(paramParcel);
    b.a(paramParcel, 1, paramRegisterSectionInfo.b, false);
    b.a(paramParcel, 2, paramRegisterSectionInfo.c, false);
    b.a(paramParcel, 3, paramRegisterSectionInfo.d);
    b.a(paramParcel, 4, paramRegisterSectionInfo.e);
    b.a(paramParcel, 5, paramRegisterSectionInfo.f);
    b.a(paramParcel, 6, paramRegisterSectionInfo.g, false);
    b.a(paramParcel, 7, paramRegisterSectionInfo.h, paramInt, false);
    b.a(paramParcel, 1000, paramRegisterSectionInfo.a);
    b.a(paramParcel, 8, paramRegisterSectionInfo.i, false);
    b.a(paramParcel, 11, paramRegisterSectionInfo.j, false);
    b.a(paramParcel, i);
  }
  
  public RegisterSectionInfo a(Parcel paramParcel)
  {
    boolean bool1 = false;
    String str1 = null;
    int k = a.b(paramParcel);
    int i = 1;
    int[] arrayOfInt = null;
    Feature[] arrayOfFeature = null;
    String str2 = null;
    boolean bool2 = false;
    String str3 = null;
    String str4 = null;
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
        str4 = a.q(paramParcel, m);
        break;
      case 2: 
        str3 = a.q(paramParcel, m);
        break;
      case 3: 
        bool2 = a.c(paramParcel, m);
        break;
      case 4: 
        i = a.g(paramParcel, m);
        break;
      case 5: 
        bool1 = a.c(paramParcel, m);
        break;
      case 6: 
        str2 = a.q(paramParcel, m);
        break;
      case 7: 
        arrayOfFeature = (Feature[])a.b(paramParcel, m, Feature.CREATOR);
        break;
      case 1000: 
        j = a.g(paramParcel, m);
        break;
      case 8: 
        arrayOfInt = a.w(paramParcel, m);
        break;
      case 11: 
        str1 = a.q(paramParcel, m);
      }
    }
    if (paramParcel.dataPosition() != k) {
      throw new a.a(37 + "Overread allowed size end=" + k, paramParcel);
    }
    return new RegisterSectionInfo(j, str4, str3, bool2, i, bool1, str2, arrayOfFeature, arrayOfInt, str1);
  }
  
  public RegisterSectionInfo[] a(int paramInt)
  {
    return new RegisterSectionInfo[paramInt];
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/appdatasearch/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */