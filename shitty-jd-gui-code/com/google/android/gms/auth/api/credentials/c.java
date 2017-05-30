package com.google.android.gms.auth.api.credentials;

import android.accounts.Account;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.google.android.gms.common.internal.d;

public final class c
{
  public static final String a = "https://www.facebook.com";
  public static final String b = "https://accounts.google.com";
  public static final String c = "https://www.linkedin.com";
  public static final String d = "https://login.live.com";
  public static final String e = "https://www.paypal.com";
  public static final String f = "https://twitter.com";
  public static final String g = "https://login.yahoo.com";
  
  @Nullable
  public static final String a(@NonNull Account paramAccount)
  {
    d.a(paramAccount, "account cannot be null");
    if ("com.google".equals(paramAccount.type)) {
      return "https://accounts.google.com";
    }
    if ("com.facebook.auth.login".equals(paramAccount.type)) {
      return "https://www.facebook.com";
    }
    return null;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/auth/api/credentials/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */