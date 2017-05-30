package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.xiaomi.channel.commonutils.logger.LoggerInterface;
import com.xiaomi.channel.commonutils.logger.b;
import com.xiaomi.push.log.e;
import com.xiaomi.push.log.f;

public class Logger
{
  private static boolean sDisablePushLog = false;
  private static LoggerInterface sUserLogger = null;
  
  public static void disablePushFileLog(Context paramContext)
  {
    sDisablePushLog = true;
    setPushLog(paramContext);
  }
  
  public static void enablePushFileLog(Context paramContext)
  {
    sDisablePushLog = false;
    setPushLog(paramContext);
  }
  
  private static boolean hasWritePermission(Context paramContext)
  {
    boolean bool2 = false;
    try
    {
      paramContext = paramContext.getPackageManager().getPackageInfo(paramContext.getPackageName(), 4096).requestedPermissions;
      boolean bool1 = bool2;
      int j;
      int i;
      if (paramContext != null)
      {
        j = paramContext.length;
        i = 0;
      }
      for (;;)
      {
        bool1 = bool2;
        if (i < j)
        {
          bool1 = "android.permission.WRITE_EXTERNAL_STORAGE".equals(paramContext[i]);
          if (bool1) {
            bool1 = true;
          }
        }
        else
        {
          return bool1;
        }
        i += 1;
      }
      return false;
    }
    catch (Exception paramContext) {}
  }
  
  public static void setLogger(Context paramContext, LoggerInterface paramLoggerInterface)
  {
    sUserLogger = paramLoggerInterface;
    setPushLog(paramContext);
  }
  
  private static void setPushLog(Context paramContext)
  {
    if (sUserLogger != null) {}
    f localf;
    for (int i = 1;; i = 0)
    {
      localf = new f(paramContext);
      if ((sDisablePushLog) || (!hasWritePermission(paramContext)) || (i == 0)) {
        break;
      }
      b.a(new e(sUserLogger, localf));
      return;
    }
    if ((!sDisablePushLog) && (hasWritePermission(paramContext)))
    {
      b.a(localf);
      return;
    }
    if (i != 0)
    {
      b.a(sUserLogger);
      return;
    }
    b.a(new e(null, null));
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/xiaomi/mipush/sdk/Logger.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */