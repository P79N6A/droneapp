package com.google.android.gms.auth.a;

import android.accounts.Account;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.m;

public abstract interface b
{
  public abstract i<m> a(g paramg, Account paramAccount);
  
  public abstract i<a> a(g paramg, String paramString);
  
  public abstract void a(g paramg, boolean paramBoolean);
  
  public static abstract interface a
    extends m
  {
    public abstract Account b();
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/auth/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */