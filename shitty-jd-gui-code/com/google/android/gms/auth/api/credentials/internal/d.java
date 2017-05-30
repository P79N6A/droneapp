package com.google.android.gms.auth.api.credentials.internal;

import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.auth.api.credentials.a;
import com.google.android.gms.common.api.Status;

public final class d
  implements a
{
  private final Status a;
  private final Credential b;
  
  public d(Status paramStatus, Credential paramCredential)
  {
    this.a = paramStatus;
    this.b = paramCredential;
  }
  
  public static d a(Status paramStatus)
  {
    return new d(paramStatus, null);
  }
  
  public Status a()
  {
    return this.a;
  }
  
  public Credential b()
  {
    return this.b;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/auth/api/credentials/internal/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */