package com.google.android.gms.internal;

import android.content.Context;
import android.net.Uri;
import android.net.Uri.Builder;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.u;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@aaa
public class abz
{
  private final Object a = new Object();
  private String b = "";
  private String c = "";
  private boolean d = false;
  
  private Uri a(Context paramContext, String paramString1, String paramString2)
  {
    paramString1 = Uri.parse(paramString1).buildUpon();
    paramString1.appendQueryParameter("linkedDeviceId", a(paramContext));
    paramString1.appendQueryParameter("adSlotPath", paramString2);
    return paramString1.build();
  }
  
  private void f(Context paramContext, String paramString)
  {
    u.e().a(paramContext, a(paramContext, (String)uf.cE.c(), paramString));
  }
  
  public String a()
  {
    synchronized (this.a)
    {
      String str = this.c;
      return str;
    }
  }
  
  public String a(Context paramContext)
  {
    synchronized (this.a)
    {
      if (TextUtils.isEmpty(this.b))
      {
        this.b = u.e().b(paramContext, "debug_signals_id.txt");
        if (TextUtils.isEmpty(this.b))
        {
          this.b = u.e().c();
          u.e().b(paramContext, "debug_signals_id.txt", this.b);
        }
      }
      paramContext = this.b;
      return paramContext;
    }
  }
  
  public void a(Context paramContext, String paramString)
  {
    if (c(paramContext, paramString))
    {
      abr.a("Device is linked for in app preview.");
      return;
    }
    f(paramContext, paramString);
  }
  
  public void a(Context paramContext, String paramString1, String paramString2, String paramString3)
  {
    paramString3 = a(paramContext, (String)uf.cH.c(), paramString3).buildUpon();
    paramString3.appendQueryParameter("debugData", paramString2);
    u.e().a(paramContext, paramString1, paramString3.build().toString());
  }
  
  public void a(String paramString)
  {
    synchronized (this.a)
    {
      this.c = paramString;
      return;
    }
  }
  
  public void a(boolean paramBoolean)
  {
    synchronized (this.a)
    {
      this.d = paramBoolean;
      return;
    }
  }
  
  public void b(Context paramContext, String paramString)
  {
    if (d(paramContext, paramString))
    {
      abr.a("Device is linked for debug signals.");
      return;
    }
    f(paramContext, paramString);
  }
  
  public boolean b()
  {
    synchronized (this.a)
    {
      boolean bool = this.d;
      return bool;
    }
  }
  
  boolean c(Context paramContext, String paramString)
  {
    paramContext = e(paramContext, a(paramContext, (String)uf.cF.c(), paramString).toString());
    if (TextUtils.isEmpty(paramContext))
    {
      abr.a("Not linked for in app preview.");
      return false;
    }
    a(paramContext.trim());
    return true;
  }
  
  boolean d(Context paramContext, String paramString)
  {
    paramContext = e(paramContext, a(paramContext, (String)uf.cG.c(), paramString).toString());
    if (TextUtils.isEmpty(paramContext))
    {
      abr.a("Not linked for debug signals.");
      return false;
    }
    boolean bool = Boolean.parseBoolean(paramContext.trim());
    a(bool);
    return bool;
  }
  
  protected String e(Context paramContext, String paramString)
  {
    aco localaco = new acc(paramContext).a(paramString, new abz.1(this, paramString));
    try
    {
      paramContext = (String)localaco.get(((Integer)uf.cI.c()).intValue(), TimeUnit.MILLISECONDS);
      return paramContext;
    }
    catch (TimeoutException localTimeoutException)
    {
      paramContext = String.valueOf(paramString);
      if (paramContext.length() != 0) {}
      for (paramContext = "Timeout while retriving a response from: ".concat(paramContext);; paramContext = new String("Timeout while retriving a response from: "))
      {
        abr.b(paramContext, localTimeoutException);
        localaco.cancel(true);
        return null;
      }
    }
    catch (InterruptedException localInterruptedException)
    {
      paramContext = String.valueOf(paramString);
      if (paramContext.length() != 0) {}
      for (paramContext = "Interrupted while retriving a response from: ".concat(paramContext);; paramContext = new String("Interrupted while retriving a response from: "))
      {
        abr.b(paramContext, localInterruptedException);
        localaco.cancel(true);
        break;
      }
    }
    catch (Exception localException)
    {
      paramContext = String.valueOf(paramString);
      if (paramContext.length() == 0) {}
    }
    for (paramContext = "Error retriving a response from: ".concat(paramContext);; paramContext = new String("Error retriving a response from: "))
    {
      abr.b(paramContext, localException);
      break;
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/internal/abz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */