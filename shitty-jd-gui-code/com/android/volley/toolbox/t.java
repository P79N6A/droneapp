package com.android.volley.toolbox;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.http.AndroidHttpClient;
import android.os.Build.VERSION;
import com.android.volley.o;
import java.io.File;

public class t
{
  private static final String a = "volley";
  
  public static o a(Context paramContext)
  {
    return a(paramContext, null);
  }
  
  public static o a(Context paramContext, int paramInt)
  {
    return a(paramContext, null, paramInt);
  }
  
  public static o a(Context paramContext, i parami)
  {
    return a(paramContext, parami, -1);
  }
  
  public static o a(Context paramContext, i parami, int paramInt)
  {
    File localFile = new File(paramContext.getCacheDir(), "volley");
    Object localObject = "volley/0";
    try
    {
      String str = paramContext.getPackageName();
      paramContext = paramContext.getPackageManager().getPackageInfo(str, 0);
      paramContext = str + "/" + paramContext.versionCode;
      localObject = paramContext;
    }
    catch (PackageManager.NameNotFoundException paramContext)
    {
      label140:
      for (;;) {}
    }
    paramContext = parami;
    if (parami == null)
    {
      if (Build.VERSION.SDK_INT >= 9) {
        paramContext = new j();
      }
    }
    else
    {
      paramContext = new c(paramContext);
      if (paramInt > -1) {
        break label140;
      }
    }
    for (paramContext = new o(new f(localFile), paramContext);; paramContext = new o(new f(localFile, paramInt), paramContext))
    {
      paramContext.a();
      return paramContext;
      paramContext = new g(AndroidHttpClient.newInstance((String)localObject));
      break;
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/android/volley/toolbox/t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */