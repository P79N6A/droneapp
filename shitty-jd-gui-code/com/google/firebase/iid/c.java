package com.google.firebase.iid;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import java.io.IOException;
import java.security.KeyPair;
import java.util.HashMap;
import java.util.Map;

public class c
{
  static Map<String, c> a = new HashMap();
  static String e;
  private static f f;
  private static e g;
  Context b;
  KeyPair c;
  String d = "";
  
  protected c(Context paramContext, String paramString, Bundle paramBundle)
  {
    this.b = paramContext.getApplicationContext();
    this.d = paramString;
  }
  
  public static c a(Context paramContext, Bundle paramBundle)
  {
    String str;
    if (paramBundle == null) {
      str = "";
    }
    for (;;)
    {
      try
      {
        Context localContext = paramContext.getApplicationContext();
        if (f == null)
        {
          f = new f(localContext);
          g = new e(localContext);
        }
        e = Integer.toString(FirebaseInstanceId.b(localContext));
        c localc = (c)a.get(str);
        paramContext = localc;
        if (localc == null)
        {
          paramContext = new c(localContext, str, paramBundle);
          a.put(str, paramContext);
        }
        return paramContext;
      }
      finally {}
      str = paramBundle.getString("subtype");
      while (str != null) {
        break;
      }
      str = "";
    }
  }
  
  KeyPair a()
  {
    if (this.c == null) {
      this.c = f.e(this.d);
    }
    if (this.c == null) {
      this.c = f.b(this.d);
    }
    return this.c;
  }
  
  public void a(String paramString1, String paramString2, Bundle paramBundle)
  {
    if (Looper.getMainLooper() == Looper.myLooper()) {
      throw new IOException("MAIN_THREAD");
    }
    f.b(this.d, paramString1, paramString2);
    Bundle localBundle = paramBundle;
    if (paramBundle == null) {
      localBundle = new Bundle();
    }
    localBundle.putString("sender", paramString1);
    if (paramString2 != null) {
      localBundle.putString("scope", paramString2);
    }
    localBundle.putString("subscription", paramString1);
    localBundle.putString("delete", "1");
    localBundle.putString("X-delete", "1");
    if ("".equals(this.d))
    {
      paramString2 = paramString1;
      localBundle.putString("subtype", paramString2);
      if (!"".equals(this.d)) {
        break label165;
      }
    }
    for (;;)
    {
      localBundle.putString("X-subtype", paramString1);
      paramString1 = g.a(localBundle, a());
      g.b(paramString1);
      return;
      paramString2 = this.d;
      break;
      label165:
      paramString1 = this.d;
    }
  }
  
  public long b()
  {
    return f.a(this.d);
  }
  
  public String b(String paramString1, String paramString2, Bundle paramBundle)
  {
    if (Looper.getMainLooper() == Looper.myLooper()) {
      throw new IOException("MAIN_THREAD");
    }
    Bundle localBundle = paramBundle;
    if (paramBundle == null) {
      localBundle = new Bundle();
    }
    int j = 1;
    int i;
    if ((localBundle.getString("ttl") != null) || ("jwt".equals(localBundle.getString("type")))) {
      i = 0;
    }
    do
    {
      do
      {
        paramBundle = c(paramString1, paramString2, localBundle);
        if ((paramBundle != null) && (i != 0)) {
          f.a(this.d, paramString1, paramString2, paramBundle, e);
        }
        return paramBundle;
        paramBundle = f.a(this.d, paramString1, paramString2);
        i = j;
      } while (paramBundle == null);
      i = j;
    } while (paramBundle.b(e));
    return paramBundle.a;
  }
  
  public String c(String paramString1, String paramString2, Bundle paramBundle)
  {
    if (paramString2 != null) {
      paramBundle.putString("scope", paramString2);
    }
    paramBundle.putString("sender", paramString1);
    if ("".equals(this.d)) {}
    for (paramString2 = paramString1;; paramString2 = this.d)
    {
      if (!paramBundle.containsKey("legacy.register"))
      {
        paramBundle.putString("subscription", paramString1);
        paramBundle.putString("subtype", paramString2);
        paramBundle.putString("X-subscription", paramString1);
        paramBundle.putString("X-subtype", paramString2);
      }
      paramString1 = g.a(paramBundle, a());
      return g.b(paramString1);
    }
  }
  
  public void c()
  {
    f.c(this.d);
    this.c = null;
  }
  
  public f d()
  {
    return f;
  }
  
  public e e()
  {
    return g;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/firebase/iid/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */