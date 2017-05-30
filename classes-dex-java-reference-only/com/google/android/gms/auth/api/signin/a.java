package com.google.android.gms.auth.api.signin;

import android.content.Intent;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.i;

public abstract interface a
{
  public static final String a = "signInAccount";
  
  public abstract Intent a(g paramg);
  
  public abstract b a(Intent paramIntent);
  
  public abstract h<b> b(g paramg);
  
  public abstract i<Status> c(g paramg);
  
  public abstract i<Status> d(g paramg);
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/auth/api/signin/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */