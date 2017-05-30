package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class d
  implements Parcelable.Creator<DocumentSection>
{
  static void a(DocumentSection paramDocumentSection, Parcel paramParcel, int paramInt)
  {
    int i = b.a(paramParcel);
    b.a(paramParcel, 1, paramDocumentSection.c, false);
    b.a(paramParcel, 3, paramDocumentSection.d, paramInt, false);
    b.a(paramParcel, 4, paramDocumentSection.e);
    b.a(paramParcel, 5, paramDocumentSection.f, false);
    b.a(paramParcel, 1000, paramDocumentSection.b);
    b.a(paramParcel, i);
  }
  
  public DocumentSection a(Parcel paramParcel)
  {
    byte[] arrayOfByte = null;
    int k = a.b(paramParcel);
    int j = 0;
    int i = -1;
    RegisterSectionInfo localRegisterSectionInfo = null;
    String str = null;
    while (paramParcel.dataPosition() < k)
    {
      int m = a.a(paramParcel);
      switch (a.a(m))
      {
      default: 
        a.b(paramParcel, m);
        break;
      case 1: 
        str = a.q(paramParcel, m);
        break;
      case 3: 
        localRegisterSectionInfo = (RegisterSectionInfo)a.a(paramParcel, m, RegisterSectionInfo.CREATOR);
        break;
      case 4: 
        i = a.g(paramParcel, m);
        break;
      case 5: 
        arrayOfByte = a.t(paramParcel, m);
        break;
      case 1000: 
        j = a.g(paramParcel, m);
      }
    }
    if (paramParcel.dataPosition() != k) {
      throw new a.a(37 + "Overread allowed size end=" + k, paramParcel);
    }
    return new DocumentSection(j, str, localRegisterSectionInfo, i, arrayOfByte);
  }
  
  public DocumentSection[] a(int paramInt)
  {
    return new DocumentSection[paramInt];
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/appdatasearch/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */