package com.xiaomi.mistatistic.sdk;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.mistatistic.sdk.controller.ab;
import com.xiaomi.mistatistic.sdk.controller.g;
import com.xiaomi.mistatistic.sdk.controller.i;
import com.xiaomi.mistatistic.sdk.controller.m;
import com.xiaomi.mistatistic.sdk.controller.o;
import com.xiaomi.mistatistic.sdk.controller.s;
import com.xiaomi.mistatistic.sdk.controller.t;
import com.xiaomi.mistatistic.sdk.controller.x;
import com.xiaomi.mistatistic.sdk.data.c;
import com.xiaomi.mistatistic.sdk.data.d;
import com.xiaomi.mistatistic.sdk.data.e;
import java.util.Map;

public abstract class MiStatInterface
{
  public static final long MAX_UPLOAD_INTERVAL = 86400000L;
  public static final long MIN_UPLOAD_INTERVAL = 300000L;
  public static final int UPLOAD_POLICY_BATCH = 2;
  public static final int UPLOAD_POLICY_DEVELOPMENT = 5;
  public static final int UPLOAD_POLICY_INTERVAL = 4;
  public static final int UPLOAD_POLICY_REALTIME = 0;
  public static final int UPLOAD_POLICY_WHILE_INITIALIZE = 3;
  public static final int UPLOAD_POLICY_WIFI_ONLY = 1;
  private static boolean sInitialized = false;
  
  private static void checkCategoryAndKey(String paramString1, String paramString2)
  {
    if ((!TextUtils.isEmpty(paramString1)) && (paramString1.startsWith("mistat_"))) {
      throw new IllegalArgumentException("category cannot start with mistat_");
    }
    if ((!TextUtils.isEmpty(paramString2)) && (paramString2.startsWith("mistat_"))) {
      throw new IllegalArgumentException("key cannot start with mistat_");
    }
  }
  
  private static void checkInitialized()
  {
    if (!sInitialized) {
      throw new IllegalStateException("not initialized, do you forget to call initialize when application started?");
    }
  }
  
  public static void enableExceptionCatcher(boolean paramBoolean)
  {
    a.a(false);
    if (paramBoolean) {}
    for (int i = 2;; i = 3)
    {
      a.a(i);
      return;
    }
  }
  
  public static final void enableLog() {}
  
  public static final String getDeviceID(Context paramContext)
  {
    return g.a(paramContext);
  }
  
  public static final void initialize(Context paramContext, String paramString1, String paramString2, String paramString3)
  {
    if ((TextUtils.isEmpty(paramString1)) || (TextUtils.isEmpty(paramString2))) {
      throw new IllegalArgumentException("appID or appKey is empty.");
    }
    Context localContext = paramContext.getApplicationContext();
    paramContext = paramString3;
    if (paramString3 == null) {
      paramContext = "";
    }
    com.xiaomi.mistatistic.sdk.controller.a.a(localContext, paramString1, paramString2, paramContext);
    i.a();
    new g().a();
    ab.a().b();
    sInitialized = true;
  }
  
  public static boolean isExceptionCatcherEnabled()
  {
    return a.d() != 1;
  }
  
  public static final void recordCalculateEvent(String paramString1, String paramString2, long paramLong)
  {
    recordCalculateEvent(paramString1, paramString2, paramLong, null);
  }
  
  public static final void recordCalculateEvent(String paramString1, String paramString2, long paramLong, Map paramMap)
  {
    checkInitialized();
    checkCategoryAndKey(paramString1, paramString2);
    if (!s.a(com.xiaomi.mistatistic.sdk.controller.a.a(), "basic_info_reported")) {
      return;
    }
    if (TextUtils.isEmpty(paramString1)) {
      paramString1 = "mistat_default";
    }
    for (;;)
    {
      m.a(new com.xiaomi.mistatistic.sdk.data.b(paramString1, paramString2, paramLong, paramMap));
      return;
    }
  }
  
  public static final void recordCountEvent(String paramString1, String paramString2)
  {
    recordCountEvent(paramString1, paramString2, null);
  }
  
  public static final void recordCountEvent(String paramString1, String paramString2, Map paramMap)
  {
    checkInitialized();
    checkCategoryAndKey(paramString1, paramString2);
    if (!s.a(com.xiaomi.mistatistic.sdk.controller.a.a(), "basic_info_reported")) {
      return;
    }
    String str = paramString1;
    if (TextUtils.isEmpty(paramString1)) {
      str = "mistat_default";
    }
    m.a(new c(str, paramString2, paramMap));
  }
  
  public static final void recordNumericPropertyEvent(String paramString1, String paramString2, long paramLong)
  {
    checkInitialized();
    checkCategoryAndKey(paramString1, paramString2);
    if (!s.a(com.xiaomi.mistatistic.sdk.controller.a.a(), "basic_info_reported")) {
      return;
    }
    String str = paramString1;
    if (TextUtils.isEmpty(paramString1)) {
      str = "mistat_default";
    }
    m.a(new d(str, paramString2, paramLong));
  }
  
  public static final void recordPageEnd()
  {
    checkInitialized();
    x.a().b();
  }
  
  public static final void recordPageStart(Activity paramActivity, String paramString)
  {
    checkInitialized();
    x.a().a(paramActivity, paramString);
    com.xiaomi.mistatistic.sdk.controller.b.a().a(new com.xiaomi.mistatistic.sdk.controller.a.a());
  }
  
  public static final void recordStringPropertyEvent(String paramString1, String paramString2, String paramString3)
  {
    checkInitialized();
    checkCategoryAndKey(paramString1, paramString2);
    if (!s.a(com.xiaomi.mistatistic.sdk.controller.a.a(), "basic_info_reported")) {
      return;
    }
    String str = paramString1;
    if (TextUtils.isEmpty(paramString1)) {
      str = "mistat_default";
    }
    m.a(new e(str, paramString2, paramString3));
  }
  
  public static final void setUploadPolicy(int paramInt, long paramLong)
  {
    
    if ((paramInt == 4) && ((paramLong < 300000L) || (paramLong > 86400000L))) {
      throw new IllegalArgumentException("interval should be set between 5 minutes and 1 day");
    }
    ab.a().a(paramInt, paramLong);
  }
  
  public static boolean shouldExceptionUploadImmediately()
  {
    return a.d() == 2;
  }
  
  public static final void triggerUploadManually()
  {
    checkInitialized();
    new t().a();
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/xiaomi/mistatistic/sdk/MiStatInterface.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */