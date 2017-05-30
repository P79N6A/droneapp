package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions.a;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.g.b;
import com.google.android.gms.common.api.g.c;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.common.internal.w;
import java.util.Iterator;
import java.util.Set;

public class c
  extends w<g>
{
  private final GoogleSignInOptions a;
  
  public c(Context paramContext, Looper paramLooper, s params, GoogleSignInOptions paramGoogleSignInOptions, g.b paramb, g.c paramc)
  {
    super(paramContext, paramLooper, 91, params, paramb, paramc);
    if (paramGoogleSignInOptions != null) {}
    for (;;)
    {
      paramContext = paramGoogleSignInOptions;
      if (params.f().isEmpty()) {
        break label103;
      }
      paramContext = new GoogleSignInOptions.a(paramGoogleSignInOptions);
      paramLooper = params.f().iterator();
      while (paramLooper.hasNext()) {
        paramContext.a((Scope)paramLooper.next(), new Scope[0]);
      }
      paramGoogleSignInOptions = new GoogleSignInOptions.a().d();
    }
    paramContext = paramContext.d();
    label103:
    this.a = paramContext;
  }
  
  protected g a(IBinder paramIBinder)
  {
    return g.a.a(paramIBinder);
  }
  
  protected String a()
  {
    return "com.google.android.gms.auth.api.signin.service.START";
  }
  
  protected String b()
  {
    return "com.google.android.gms.auth.api.signin.internal.ISignInService";
  }
  
  public Intent e()
  {
    SignInConfiguration localSignInConfiguration = new SignInConfiguration(B().getPackageName(), this.a);
    Intent localIntent = new Intent("com.google.android.gms.auth.GOOGLE_SIGN_IN");
    localIntent.setClass(B(), SignInHubActivity.class);
    localIntent.putExtra("config", localSignInConfiguration);
    return localIntent;
  }
  
  public boolean h_()
  {
    return true;
  }
  
  public GoogleSignInOptions i_()
  {
    return this.a;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/auth/api/signin/internal/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */