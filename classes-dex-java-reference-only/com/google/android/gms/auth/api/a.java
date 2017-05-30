package com.google.android.gms.auth.api;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.google.android.gms.auth.api.credentials.PasswordSpecification;
import com.google.android.gms.auth.api.credentials.internal.e;
import com.google.android.gms.auth.api.credentials.internal.g;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.a.a.b;
import com.google.android.gms.common.api.a.a.d;
import com.google.android.gms.common.api.a.b;
import com.google.android.gms.common.api.a.g;
import com.google.android.gms.common.api.g.b;
import com.google.android.gms.common.api.g.c;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.internal.aep;
import com.google.android.gms.internal.aeq;
import com.google.android.gms.internal.aer;
import com.google.android.gms.internal.aez;
import java.util.Collections;
import java.util.List;

public final class a
{
  public static final a.g<g> a = new a.g();
  public static final a.g<aer> b = new a.g();
  public static final a.g<com.google.android.gms.auth.api.signin.internal.c> c = new a.g();
  public static final com.google.android.gms.common.api.a<c> d = b.b;
  public static final com.google.android.gms.common.api.a<a> e = new com.google.android.gms.common.api.a("Auth.CREDENTIALS_API", l, a);
  public static final com.google.android.gms.common.api.a<GoogleSignInOptions> f = new com.google.android.gms.common.api.a("Auth.GOOGLE_SIGN_IN_API", n, c);
  public static final com.google.android.gms.common.api.a<a.a.b> g = new com.google.android.gms.common.api.a("Auth.ACCOUNT_STATUS_API", m, b);
  public static final com.google.android.gms.auth.api.proxy.b h = new aez();
  public static final com.google.android.gms.auth.api.credentials.b i = new e();
  public static final aep j = new aeq();
  public static final com.google.android.gms.auth.api.signin.a k = new com.google.android.gms.auth.api.signin.internal.b();
  private static final a.b<g, a> l = new a.b()
  {
    public g a(Context paramAnonymousContext, Looper paramAnonymousLooper, s paramAnonymouss, a.a paramAnonymousa, g.b paramAnonymousb, g.c paramAnonymousc)
    {
      return new g(paramAnonymousContext, paramAnonymousLooper, paramAnonymouss, paramAnonymousa, paramAnonymousb, paramAnonymousc);
    }
  };
  private static final a.b<aer, a.a.b> m = new a.b()
  {
    public aer a(Context paramAnonymousContext, Looper paramAnonymousLooper, s paramAnonymouss, a.a.b paramAnonymousb, g.b paramAnonymousb1, g.c paramAnonymousc)
    {
      return new aer(paramAnonymousContext, paramAnonymousLooper, paramAnonymouss, paramAnonymousb1, paramAnonymousc);
    }
  };
  private static final a.b<com.google.android.gms.auth.api.signin.internal.c, GoogleSignInOptions> n = new a.b()
  {
    public com.google.android.gms.auth.api.signin.internal.c a(Context paramAnonymousContext, Looper paramAnonymousLooper, s paramAnonymouss, @Nullable GoogleSignInOptions paramAnonymousGoogleSignInOptions, g.b paramAnonymousb, g.c paramAnonymousc)
    {
      return new com.google.android.gms.auth.api.signin.internal.c(paramAnonymousContext, paramAnonymousLooper, paramAnonymouss, paramAnonymousGoogleSignInOptions, paramAnonymousb, paramAnonymousc);
    }
    
    public List<Scope> a(@Nullable GoogleSignInOptions paramAnonymousGoogleSignInOptions)
    {
      if (paramAnonymousGoogleSignInOptions == null) {
        return Collections.emptyList();
      }
      return paramAnonymousGoogleSignInOptions.a();
    }
  };
  
  public static final class a
    implements a.a.d
  {
    public PasswordSpecification a()
    {
      return null;
    }
    
    public Bundle b()
    {
      Bundle localBundle = new Bundle();
      localBundle.putString("consumer_package", null);
      localBundle.putParcelable("password_specification", null);
      return localBundle;
    }
    
    public static class a
    {
      @NonNull
      private PasswordSpecification a = PasswordSpecification.a;
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/auth/api/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */