package com.google.android.gms.auth.api.signin;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.m;

public class b
  implements m
{
  private Status a;
  private GoogleSignInAccount b;
  
  public b(@Nullable GoogleSignInAccount paramGoogleSignInAccount, @NonNull Status paramStatus)
  {
    this.b = paramGoogleSignInAccount;
    this.a = paramStatus;
  }
  
  @NonNull
  public Status a()
  {
    return this.a;
  }
  
  @Nullable
  public GoogleSignInAccount b()
  {
    return this.b;
  }
  
  public boolean c()
  {
    return this.a.f();
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/auth/api/signin/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */