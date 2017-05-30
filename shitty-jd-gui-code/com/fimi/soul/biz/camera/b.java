package com.fimi.soul.biz.camera;

import android.util.Log;
import com.fimi.soul.base.DroidPlannerApp;
import com.fimi.soul.biz.camera.entity.X11FileInfo;
import com.fimi.soul.biz.camera.entity.X11SystemConfig;
import com.fimi.soul.biz.camera.entity.X11SystemConfigOption;
import com.fimi.soul.entity.WifiDistanceFile;
import com.fimi.soul.utils.j;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Map;

public class b
{
  private static b b = new b();
  private static final String d = "SP_KEY_IsDownloadAndDelete";
  private static final String e = "SP_KEY_IsTakePhotoByAPI";
  private b a = b.a;
  private com.fimi.soul.biz.camera.b.c c = new com.fimi.soul.biz.camera.a.b();
  private a[] f = new a[b.values().length];
  
  public static b a()
  {
    try
    {
      if (b == null) {
        b = new b();
      }
      b localb = b;
      return localb;
    }
    finally {}
  }
  
  public static String a(X11FileInfo paramX11FileInfo)
  {
    return String.format("THUMB_%s", new Object[] { paramX11FileInfo.getName() });
  }
  
  public static String a(String paramString)
  {
    return String.format("http://%s/%s", new Object[] { e.a(), paramString });
  }
  
  public static String a(String paramString1, String paramString2)
  {
    return String.format("%s", new Object[] { paramString1 });
  }
  
  public static void a(DroidPlannerApp paramDroidPlannerApp)
  {
    com.fimi.soul.biz.camera.c.e locale = ((d)a().d()).u();
    paramDroidPlannerApp.a.a(locale);
  }
  
  private static void a(X11SystemConfig paramX11SystemConfig, String paramString, int paramInt, String[] paramArrayOfString)
  {
    a(paramX11SystemConfig, paramString, paramInt, paramArrayOfString, paramArrayOfString);
  }
  
  private static void a(X11SystemConfig paramX11SystemConfig, String paramString, int paramInt, String[] paramArrayOfString1, String[] paramArrayOfString2)
  {
    X11SystemConfigOption localX11SystemConfigOption = new X11SystemConfigOption();
    localX11SystemConfigOption.setType(paramString);
    localX11SystemConfigOption.setOptions(paramArrayOfString2);
    localX11SystemConfigOption.setOptionsText(paramArrayOfString1);
    localX11SystemConfigOption.setDefaultOption(paramArrayOfString2[paramInt]);
    paramX11SystemConfig.getSystemConfigOptions().put(paramString, localX11SystemConfigOption);
  }
  
  public static boolean a(WifiDistanceFile paramWifiDistanceFile)
  {
    return c(b(paramWifiDistanceFile));
  }
  
  public static String b(WifiDistanceFile paramWifiDistanceFile)
  {
    Object localObject = paramWifiDistanceFile.getName().split("\\.");
    try
    {
      Log.d("Good", "count" + localObject.length + "");
      SimpleDateFormat localSimpleDateFormat1 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
      SimpleDateFormat localSimpleDateFormat2 = new SimpleDateFormat("yyyyMMddhhmmss");
      Log.d("Good", "date:" + paramWifiDistanceFile.getDateString());
      localObject = String.format("%s_%s.%s", new Object[] { localSimpleDateFormat2.format(localSimpleDateFormat1.parse(paramWifiDistanceFile.getDateString())), localObject[0], localObject[1] });
      Log.d("Good", "target file download:" + (String)localObject);
      return (String)localObject;
    }
    catch (Exception localException) {}
    return paramWifiDistanceFile.getName();
  }
  
  public static boolean b(String paramString)
  {
    return new File(e(paramString)).exists();
  }
  
  public static String c(WifiDistanceFile paramWifiDistanceFile)
  {
    return String.format("%s%s", new Object[] { j.o(), b(paramWifiDistanceFile) });
  }
  
  public static boolean c(String paramString)
  {
    paramString = new File(d(paramString));
    return (paramString.exists()) && (paramString.length() > 0L);
  }
  
  public static String d(String paramString)
  {
    return String.format("%s%s", new Object[] { j.o(), paramString });
  }
  
  public static String e(String paramString)
  {
    return String.format("%s%s", new Object[] { j.n(), paramString });
  }
  
  public static a f(String paramString)
  {
    if (paramString.toUpperCase().contains("THUMB_")) {
      return a.a;
    }
    if (paramString.toLowerCase().contains(".mp4")) {
      return a.b;
    }
    if (paramString.toLowerCase().contains(".jpg")) {
      return a.c;
    }
    return null;
  }
  
  public void a(boolean paramBoolean)
  {
    com.fimi.kernel.c.c().a("SP_KEY_IsTakePhotoByAPI", paramBoolean);
  }
  
  public void b(boolean paramBoolean)
  {
    com.fimi.kernel.c.c().a("SP_KEY_IsDownloadAndDelete", paramBoolean);
  }
  
  public boolean b()
  {
    return com.fimi.kernel.c.c().d("SP_KEY_IsTakePhotoByAPI");
  }
  
  public boolean c()
  {
    return com.fimi.kernel.c.c().d("SP_KEY_IsDownloadAndDelete");
  }
  
  public com.fimi.soul.biz.camera.b.a d()
  {
    int i = this.a.ordinal();
    switch (1.a[this.a.ordinal()])
    {
    }
    for (;;)
    {
      return this.f[i];
      if (this.f[i] == null) {
        this.f[i] = new d(e());
      }
    }
  }
  
  public com.fimi.soul.biz.camera.b.c e()
  {
    return this.c;
  }
  
  public b f()
  {
    return this.a;
  }
  
  public static enum a
  {
    private a() {}
  }
  
  public static enum b
  {
    private b() {}
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/biz/camera/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */