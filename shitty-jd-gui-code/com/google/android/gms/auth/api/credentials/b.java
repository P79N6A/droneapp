package com.google.android.gms.auth.api.credentials;

import android.app.PendingIntent;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.i;

public abstract interface b
{
  public static final int a = 1000;
  public static final int b = 1001;
  public static final int c = 2000;
  
  public abstract PendingIntent a(g paramg, HintRequest paramHintRequest);
  
  public abstract i<Status> a(g paramg);
  
  public abstract i<Status> a(g paramg, Credential paramCredential);
  
  public abstract i<a> a(g paramg, CredentialRequest paramCredentialRequest);
  
  public abstract i<Status> b(g paramg, Credential paramCredential);
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/auth/api/credentials/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */