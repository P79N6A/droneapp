package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class i
  implements Parcelable.Creator<SignInConfiguration>
{
  static void a(SignInConfiguration paramSignInConfiguration, Parcel paramParcel, int paramInt)
  {
    int i = b.a(paramParcel);
    b.a(paramParcel, 1, paramSignInConfiguration.a);
    b.a(paramParcel, 2, paramSignInConfiguration.a(), false);
    b.a(paramParcel, 5, paramSignInConfiguration.b(), paramInt, false);
    b.a(paramParcel, i);
  }
  
  public SignInConfiguration a(Parcel paramParcel)
  {
    GoogleSignInOptions localGoogleSignInOptions = null;
    int j = a.b(paramParcel);
    int i = 0;
    String str = null;
    while (paramParcel.dataPosition() < j)
    {
      int k = a.a(paramParcel);
      switch (a.a(k))
      {
      case 3: 
      case 4: 
      default: 
        a.b(paramParcel, k);
        break;
      case 1: 
        i = a.g(paramParcel, k);
        break;
      case 2: 
        str = a.q(paramParcel, k);
        break;
      case 5: 
        localGoogleSignInOptions = (GoogleSignInOptions)a.a(paramParcel, k, GoogleSignInOptions.CREATOR);
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new a.a(37 + "Overread allowed size end=" + j, paramParcel);
    }
    return new SignInConfiguration(i, str, localGoogleSignInOptions);
  }
  
  public SignInConfiguration[] a(int paramInt)
  {
    return new SignInConfiguration[paramInt];
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/auth/api/signin/internal/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */