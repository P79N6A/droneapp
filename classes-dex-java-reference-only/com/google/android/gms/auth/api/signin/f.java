package com.google.android.gms.auth.api.signin;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class f
  implements Parcelable.Creator<SignInAccount>
{
  static void a(SignInAccount paramSignInAccount, Parcel paramParcel, int paramInt)
  {
    int i = b.a(paramParcel);
    b.a(paramParcel, 1, paramSignInAccount.a);
    b.a(paramParcel, 4, paramSignInAccount.b, false);
    b.a(paramParcel, 7, paramSignInAccount.a(), paramInt, false);
    b.a(paramParcel, 8, paramSignInAccount.c, false);
    b.a(paramParcel, i);
  }
  
  public SignInAccount a(Parcel paramParcel)
  {
    int j = a.b(paramParcel);
    int i = 0;
    Object localObject1 = "";
    Object localObject2 = null;
    String str = "";
    if (paramParcel.dataPosition() < j)
    {
      int k = a.a(paramParcel);
      Object localObject3;
      switch (a.a(k))
      {
      case 2: 
      case 3: 
      case 5: 
      case 6: 
      default: 
        a.b(paramParcel, k);
        localObject3 = localObject2;
        localObject2 = localObject1;
        localObject1 = localObject3;
      }
      for (;;)
      {
        localObject3 = localObject2;
        localObject2 = localObject1;
        localObject1 = localObject3;
        break;
        i = a.g(paramParcel, k);
        localObject3 = localObject1;
        localObject1 = localObject2;
        localObject2 = localObject3;
        continue;
        localObject3 = a.q(paramParcel, k);
        localObject1 = localObject2;
        localObject2 = localObject3;
        continue;
        localObject3 = (GoogleSignInAccount)a.a(paramParcel, k, GoogleSignInAccount.CREATOR);
        localObject2 = localObject1;
        localObject1 = localObject3;
        continue;
        str = a.q(paramParcel, k);
        localObject3 = localObject1;
        localObject1 = localObject2;
        localObject2 = localObject3;
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new a.a(37 + "Overread allowed size end=" + j, paramParcel);
    }
    return new SignInAccount(i, (String)localObject1, (GoogleSignInAccount)localObject2, str);
  }
  
  public SignInAccount[] a(int paramInt)
  {
    return new SignInAccount[paramInt];
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/auth/api/signin/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */