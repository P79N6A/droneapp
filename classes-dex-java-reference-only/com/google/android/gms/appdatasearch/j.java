package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class j
  implements Parcelable.Creator<UsageInfo>
{
  static void a(UsageInfo paramUsageInfo, Parcel paramParcel, int paramInt)
  {
    int i = b.a(paramParcel);
    b.a(paramParcel, 1, paramUsageInfo.b, paramInt, false);
    b.a(paramParcel, 2, paramUsageInfo.c);
    b.a(paramParcel, 3, paramUsageInfo.d);
    b.a(paramParcel, 4, paramUsageInfo.e, false);
    b.a(paramParcel, 5, paramUsageInfo.f, paramInt, false);
    b.a(paramParcel, 6, paramUsageInfo.g);
    b.a(paramParcel, 7, paramUsageInfo.h);
    b.a(paramParcel, 1000, paramUsageInfo.a);
    b.a(paramParcel, 8, paramUsageInfo.i);
    b.a(paramParcel, i);
  }
  
  public UsageInfo a(Parcel paramParcel)
  {
    DocumentContents localDocumentContents = null;
    int i = 0;
    int n = a.b(paramParcel);
    long l = 0L;
    int j = -1;
    boolean bool = false;
    String str = null;
    int k = 0;
    DocumentId localDocumentId = null;
    int m = 0;
    while (paramParcel.dataPosition() < n)
    {
      int i1 = a.a(paramParcel);
      switch (a.a(i1))
      {
      default: 
        a.b(paramParcel, i1);
        break;
      case 1: 
        localDocumentId = (DocumentId)a.a(paramParcel, i1, DocumentId.CREATOR);
        break;
      case 2: 
        l = a.i(paramParcel, i1);
        break;
      case 3: 
        k = a.g(paramParcel, i1);
        break;
      case 4: 
        str = a.q(paramParcel, i1);
        break;
      case 5: 
        localDocumentContents = (DocumentContents)a.a(paramParcel, i1, DocumentContents.CREATOR);
        break;
      case 6: 
        bool = a.c(paramParcel, i1);
        break;
      case 7: 
        j = a.g(paramParcel, i1);
        break;
      case 1000: 
        m = a.g(paramParcel, i1);
        break;
      case 8: 
        i = a.g(paramParcel, i1);
      }
    }
    if (paramParcel.dataPosition() != n) {
      throw new a.a(37 + "Overread allowed size end=" + n, paramParcel);
    }
    return new UsageInfo(m, localDocumentId, l, k, str, localDocumentContents, bool, j, i);
  }
  
  public UsageInfo[] a(int paramInt)
  {
    return new UsageInfo[paramInt];
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/appdatasearch/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */