package com.google.android.gms.auth.api.credentials;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;
import java.util.ArrayList;

public class d
  implements Parcelable.Creator<Credential>
{
  static void a(Credential paramCredential, Parcel paramParcel, int paramInt)
  {
    int i = b.a(paramParcel);
    b.a(paramParcel, 1, paramCredential.a(), false);
    b.a(paramParcel, 2, paramCredential.b(), false);
    b.a(paramParcel, 3, paramCredential.c(), paramInt, false);
    b.c(paramParcel, 4, paramCredential.d(), false);
    b.a(paramParcel, 5, paramCredential.e(), false);
    b.a(paramParcel, 6, paramCredential.g(), false);
    b.a(paramParcel, 7, paramCredential.f(), false);
    b.a(paramParcel, 1000, paramCredential.b);
    b.a(paramParcel, 8, paramCredential.h(), false);
    b.a(paramParcel, i);
  }
  
  public Credential a(Parcel paramParcel)
  {
    String str1 = null;
    int j = a.b(paramParcel);
    int i = 0;
    String str2 = null;
    String str3 = null;
    String str4 = null;
    ArrayList localArrayList = null;
    Uri localUri = null;
    String str5 = null;
    String str6 = null;
    while (paramParcel.dataPosition() < j)
    {
      int k = a.a(paramParcel);
      switch (a.a(k))
      {
      default: 
        a.b(paramParcel, k);
        break;
      case 1: 
        str6 = a.q(paramParcel, k);
        break;
      case 2: 
        str5 = a.q(paramParcel, k);
        break;
      case 3: 
        localUri = (Uri)a.a(paramParcel, k, Uri.CREATOR);
        break;
      case 4: 
        localArrayList = a.c(paramParcel, k, IdToken.CREATOR);
        break;
      case 5: 
        str4 = a.q(paramParcel, k);
        break;
      case 6: 
        str3 = a.q(paramParcel, k);
        break;
      case 7: 
        str2 = a.q(paramParcel, k);
        break;
      case 1000: 
        i = a.g(paramParcel, k);
        break;
      case 8: 
        str1 = a.q(paramParcel, k);
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new a.a(37 + "Overread allowed size end=" + j, paramParcel);
    }
    return new Credential(i, str6, str5, localUri, localArrayList, str4, str3, str2, str1);
  }
  
  public Credential[] a(int paramInt)
  {
    return new Credential[paramInt];
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/auth/api/credentials/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */