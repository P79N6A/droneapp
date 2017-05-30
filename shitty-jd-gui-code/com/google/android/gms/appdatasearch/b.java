package com.google.android.gms.appdatasearch;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;

public class b
  implements Parcelable.Creator<DocumentContents>
{
  static void a(DocumentContents paramDocumentContents, Parcel paramParcel, int paramInt)
  {
    int i = com.google.android.gms.common.internal.safeparcel.b.a(paramParcel);
    com.google.android.gms.common.internal.safeparcel.b.a(paramParcel, 1, paramDocumentContents.b, paramInt, false);
    com.google.android.gms.common.internal.safeparcel.b.a(paramParcel, 2, paramDocumentContents.c, false);
    com.google.android.gms.common.internal.safeparcel.b.a(paramParcel, 3, paramDocumentContents.d);
    com.google.android.gms.common.internal.safeparcel.b.a(paramParcel, 4, paramDocumentContents.e, paramInt, false);
    com.google.android.gms.common.internal.safeparcel.b.a(paramParcel, 1000, paramDocumentContents.a);
    com.google.android.gms.common.internal.safeparcel.b.a(paramParcel, i);
  }
  
  public DocumentContents a(Parcel paramParcel)
  {
    boolean bool = false;
    Account localAccount = null;
    int j = a.b(paramParcel);
    String str = null;
    DocumentSection[] arrayOfDocumentSection = null;
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
        arrayOfDocumentSection = (DocumentSection[])a.b(paramParcel, k, DocumentSection.CREATOR);
        break;
      case 2: 
        str = a.q(paramParcel, k);
        break;
      case 3: 
        bool = a.c(paramParcel, k);
        break;
      case 4: 
        localAccount = (Account)a.a(paramParcel, k, Account.CREATOR);
        break;
      case 1000: 
        i = a.g(paramParcel, k);
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new a.a(37 + "Overread allowed size end=" + j, paramParcel);
    }
    return new DocumentContents(i, arrayOfDocumentSection, str, bool, localAccount);
  }
  
  public DocumentContents[] a(int paramInt)
  {
    return new DocumentContents[paramInt];
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/appdatasearch/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */