package com.google.android.gms.internal;

import android.content.Context;
import android.os.Build.VERSION;
import com.google.android.gms.ads.internal.u;
import java.util.LinkedHashMap;
import java.util.Map;

@aaa
public class ug
{
  private boolean a;
  private String b;
  private Map<String, String> c;
  private Context d = null;
  private String e = null;
  
  public ug(Context paramContext, String paramString)
  {
    this.d = paramContext;
    this.e = paramString;
    this.a = ((Boolean)uf.N.c()).booleanValue();
    this.b = ((String)uf.O.c());
    this.c = new LinkedHashMap();
    this.c.put("s", "gmob_sdk");
    this.c.put("v", "3");
    this.c.put("os", Build.VERSION.RELEASE);
    this.c.put("sdk", Build.VERSION.SDK);
    this.c.put("device", u.e().e());
    Map localMap = this.c;
    if (paramContext.getApplicationContext() != null)
    {
      paramString = paramContext.getApplicationContext().getPackageName();
      localMap.put("app", paramString);
      paramString = this.c;
      if (!u.e().l(paramContext)) {
        break label256;
      }
    }
    label256:
    for (paramContext = "1";; paramContext = "0")
    {
      paramString.put("is_lite_sdk", paramContext);
      paramContext = u.n().a(this.d);
      this.c.put("network_coarse", Integer.toString(paramContext.m));
      this.c.put("network_fine", Integer.toString(paramContext.n));
      return;
      paramString = paramContext.getPackageName();
      break;
    }
  }
  
  boolean a()
  {
    return this.a;
  }
  
  String b()
  {
    return this.b;
  }
  
  Context c()
  {
    return this.d;
  }
  
  String d()
  {
    return this.e;
  }
  
  Map<String, String> e()
  {
    return this.c;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/internal/ug.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */