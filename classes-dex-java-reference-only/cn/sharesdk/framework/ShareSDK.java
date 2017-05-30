package cn.sharesdk.framework;

import android.content.Context;
import android.graphics.Bitmap;
import com.mob.tools.utils.DeviceHelper;
import java.util.HashMap;

public class ShareSDK
{
  public static final String SDK_TAG = "SHARESDK";
  public static final int SDK_VERSION_INT = 68;
  private static f a;
  private static boolean b = true;
  
  static String a(int paramInt, String paramString)
  {
    b();
    return a.a(paramInt, paramString);
  }
  
  static String a(Bitmap paramBitmap)
  {
    b();
    return a.a(paramBitmap);
  }
  
  static String a(String paramString)
  {
    b();
    return a.c(paramString);
  }
  
  static String a(String paramString1, boolean paramBoolean, int paramInt, String paramString2)
  {
    b();
    return a.a(paramString1, paramBoolean, paramInt, paramString2);
  }
  
  static void a(int paramInt1, int paramInt2)
  {
    b();
    a.a(paramInt1, paramInt2);
  }
  
  static void a(String paramString1, String paramString2)
  {
    b();
    a.a(paramString1, paramString2);
  }
  
  static boolean a()
  {
    b();
    return a.d();
  }
  
  static boolean a(HashMap<String, Object> paramHashMap)
  {
    b();
    return a.a(paramHashMap);
  }
  
  static String b(String paramString1, String paramString2)
  {
    b();
    return a.b(paramString1, paramString2);
  }
  
  private static void b()
  {
    if (a == null) {
      throw new RuntimeException("Please call ShareSDK.initSDK(Context) in the main process before any action.");
    }
  }
  
  static boolean b(HashMap<String, Object> paramHashMap)
  {
    b();
    return a.b(paramHashMap);
  }
  
  public static void closeDebug()
  {
    b = false;
  }
  
  public static void deleteCache()
  {
    b();
    a.e();
  }
  
  @Deprecated
  public static Platform getPlatform(Context paramContext, String paramString)
  {
    b();
    return a.a(paramString);
  }
  
  public static Platform getPlatform(String paramString)
  {
    b();
    return a.a(paramString);
  }
  
  public static Platform[] getPlatformList()
  {
    try
    {
      b();
      Platform[] arrayOfPlatform = a.a();
      return arrayOfPlatform;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  @Deprecated
  public static Platform[] getPlatformList(Context paramContext)
  {
    try
    {
      paramContext = getPlatformList();
      return paramContext;
    }
    finally
    {
      paramContext = finally;
      throw paramContext;
    }
  }
  
  public static int getSDKVersionCode()
  {
    return 68;
  }
  
  public static String getSDKVersionName()
  {
    b();
    return a.b();
  }
  
  public static <T extends Service> T getService(Class<T> paramClass)
  {
    b();
    return a.c(paramClass);
  }
  
  public static void initSDK(Context paramContext)
  {
    initSDK(paramContext, null, true);
  }
  
  public static void initSDK(Context paramContext, String paramString)
  {
    initSDK(paramContext, paramString, true);
  }
  
  public static void initSDK(Context paramContext, String paramString, boolean paramBoolean)
  {
    if (DeviceHelper.getInstance(paramContext) == null) {
      throw new RuntimeException("The param of context is null which in ShareSDK.initSDK(context)!");
    }
    if (a == null)
    {
      paramContext = new f(paramContext, paramString);
      paramContext.a(paramBoolean);
      paramContext.startThread();
      a = paramContext;
    }
  }
  
  public static void initSDK(Context paramContext, boolean paramBoolean)
  {
    initSDK(paramContext, null, paramBoolean);
  }
  
  public static boolean isDebug()
  {
    return b;
  }
  
  public static boolean isRemoveCookieOnAuthorize()
  {
    b();
    return a.c();
  }
  
  public static void logApiEvent(String paramString, int paramInt)
  {
    b();
    a.a(paramString, paramInt);
  }
  
  public static void logDemoEvent(int paramInt, Platform paramPlatform)
  {
    b();
    a.a(paramInt, paramPlatform);
  }
  
  public static String platformIdToName(int paramInt)
  {
    b();
    return a.c(paramInt);
  }
  
  public static int platformNameToId(String paramString)
  {
    b();
    return a.b(paramString);
  }
  
  public static void registerPlatform(Class<? extends CustomPlatform> paramClass)
  {
    b();
    a.d(paramClass);
  }
  
  public static void registerService(Class<? extends Service> paramClass)
  {
    b();
    a.a(paramClass);
  }
  
  public static void removeCookieOnAuthorize(boolean paramBoolean)
  {
    b();
    a.b(paramBoolean);
  }
  
  public static void setConnTimeout(int paramInt)
  {
    b();
    a.a(paramInt);
  }
  
  public static void setPlatformDevInfo(String paramString, HashMap<String, Object> paramHashMap)
  {
    b();
    a.a(paramString, paramHashMap);
  }
  
  public static void setReadTimeout(int paramInt)
  {
    b();
    a.b(paramInt);
  }
  
  public static void stopSDK() {}
  
  public static void stopSDK(Context paramContext) {}
  
  public static void unregisterPlatform(Class<? extends CustomPlatform> paramClass)
  {
    b();
    a.e(paramClass);
  }
  
  public static void unregisterService(Class<? extends Service> paramClass)
  {
    b();
    a.b(paramClass);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/cn/sharesdk/framework/ShareSDK.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */