package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;
import java.util.ArrayList;

public class d
  implements Parcelable.Creator<GoogleSignInAccount>
{
  static void a(GoogleSignInAccount paramGoogleSignInAccount, Parcel paramParcel, int paramInt)
  {
    int i = b.a(paramParcel);
    b.a(paramParcel, 1, paramGoogleSignInAccount.b);
    b.a(paramParcel, 2, paramGoogleSignInAccount.a(), false);
    b.a(paramParcel, 3, paramGoogleSignInAccount.b(), false);
    b.a(paramParcel, 4, paramGoogleSignInAccount.c(), false);
    b.a(paramParcel, 5, paramGoogleSignInAccount.d(), false);
    b.a(paramParcel, 6, paramGoogleSignInAccount.g(), paramInt, false);
    b.a(paramParcel, 7, paramGoogleSignInAccount.h(), false);
    b.a(paramParcel, 8, paramGoogleSignInAccount.i());
    b.a(paramParcel, 9, paramGoogleSignInAccount.k(), false);
    b.c(paramParcel, 10, paramGoogleSignInAccount.c, false);
    b.a(paramParcel, 11, paramGoogleSignInAccount.e(), false);
    b.a(paramParcel, 12, paramGoogleSignInAccount.f(), false);
    b.a(paramParcel, i);
  }
  
  public GoogleSignInAccount a(Parcel paramParcel)
  {
    int j = a.b(paramParcel);
    int i = 0;
    String str8 = null;
    String str7 = null;
    String str6 = null;
    String str5 = null;
    Uri localUri = null;
    String str4 = null;
    long l = 0L;
    String str3 = null;
    ArrayList localArrayList = null;
    String str2 = null;
    String str1 = null;
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
        str8 = a.q(paramParcel, k);
        break;
      case 3: 
        str7 = a.q(paramParcel, k);
        break;
      case 4: 
        str6 = a.q(paramParcel, k);
        break;
      case 5: 
        str5 = a.q(paramParcel, k);
        break;
      case 6: 
        localUri = (Uri)a.a(paramParcel, k, Uri.CREATOR);
        break;
      case 7: 
        str4 = a.q(paramParcel, k);
        break;
      case 8: 
        l = a.i(paramParcel, k);
        break;
      case 9: 
        str3 = a.q(paramParcel, k);
        break;
      case 10: 
        localArrayList = a.c(paramParcel, k, Scope.CREATOR);
        break;
      case 11: 
        str2 = a.q(paramParcel, k);
        break;
      case 12: 
        str1 = a.q(paramParcel, k);
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new a.a(37 + "Overread allowed size end=" + j, paramParcel);
    }
    return new GoogleSignInAccount(i, str8, str7, str6, str5, localUri, str4, l, str3, localArrayList, str2, str1);
  }
  
  public GoogleSignInAccount[] a(int paramInt)
  {
    return new GoogleSignInAccount[paramInt];
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/auth/api/signin/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */