package com.google.android.gms.auth.api.credentials.internal;

import android.app.PendingIntent;
import android.content.Context;
import com.google.android.gms.auth.api.a.a;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.auth.api.credentials.CredentialRequest;
import com.google.android.gms.auth.api.credentials.HintRequest;
import com.google.android.gms.auth.api.credentials.PasswordSpecification;
import com.google.android.gms.auth.api.credentials.b;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.i;
import com.google.android.gms.internal.ahl.b;

public final class e
  implements b
{
  private PasswordSpecification b(com.google.android.gms.common.api.g paramg)
  {
    paramg = ((g)paramg.a(com.google.android.gms.auth.api.a.a)).d();
    if ((paramg != null) && (paramg.a() != null)) {
      return paramg.a();
    }
    return PasswordSpecification.a;
  }
  
  public PendingIntent a(com.google.android.gms.common.api.g paramg, HintRequest paramHintRequest)
  {
    com.google.android.gms.common.internal.d.a(paramg, "client must not be null");
    com.google.android.gms.common.internal.d.a(paramHintRequest, "request must not be null");
    com.google.android.gms.common.internal.d.b(paramg.a(com.google.android.gms.auth.api.a.e), "Auth.CREDENTIALS_API must be added to GoogleApiClient to use this API");
    paramHintRequest = c.a(paramg.b(), paramHintRequest, b(paramg));
    return PendingIntent.getActivity(paramg.b(), 2000, paramHintRequest, 268435456);
  }
  
  public i<Status> a(com.google.android.gms.common.api.g paramg)
  {
    paramg.b(new f(paramg)
    {
      protected Status a(Status paramAnonymousStatus)
      {
        return paramAnonymousStatus;
      }
      
      protected void a(Context paramAnonymousContext, k paramAnonymousk)
      {
        paramAnonymousk.a(new e.a(this));
      }
    });
  }
  
  public i<Status> a(com.google.android.gms.common.api.g paramg, final Credential paramCredential)
  {
    paramg.b(new f(paramg)
    {
      protected Status a(Status paramAnonymousStatus)
      {
        return paramAnonymousStatus;
      }
      
      protected void a(Context paramAnonymousContext, k paramAnonymousk)
      {
        paramAnonymousk.a(new e.a(this), new SaveRequest(paramCredential));
      }
    });
  }
  
  public i<com.google.android.gms.auth.api.credentials.a> a(com.google.android.gms.common.api.g paramg, final CredentialRequest paramCredentialRequest)
  {
    paramg.a(new f(paramg)
    {
      protected com.google.android.gms.auth.api.credentials.a a(Status paramAnonymousStatus)
      {
        return d.a(paramAnonymousStatus);
      }
      
      protected void a(Context paramAnonymousContext, k paramAnonymousk)
      {
        paramAnonymousk.a(new a()
        {
          public void a(Status paramAnonymous2Status)
          {
            e.1.this.b(d.a(paramAnonymous2Status));
          }
          
          public void a(Status paramAnonymous2Status, Credential paramAnonymous2Credential)
          {
            e.1.this.b(new d(paramAnonymous2Status, paramAnonymous2Credential));
          }
        }, paramCredentialRequest);
      }
    });
  }
  
  public i<Status> b(com.google.android.gms.common.api.g paramg, final Credential paramCredential)
  {
    paramg.b(new f(paramg)
    {
      protected Status a(Status paramAnonymousStatus)
      {
        return paramAnonymousStatus;
      }
      
      protected void a(Context paramAnonymousContext, k paramAnonymousk)
      {
        paramAnonymousk.a(new e.a(this), new DeleteRequest(paramCredential));
      }
    });
  }
  
  private static class a
    extends a
  {
    private ahl.b<Status> a;
    
    a(ahl.b<Status> paramb)
    {
      this.a = paramb;
    }
    
    public void a(Status paramStatus)
    {
      this.a.a(paramStatus);
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/auth/api/credentials/internal/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */