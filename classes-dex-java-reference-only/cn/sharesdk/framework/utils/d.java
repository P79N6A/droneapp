package cn.sharesdk.framework.utils;

import android.content.Context;
import com.mob.commons.logcollector.LogsCollector;
import com.mob.tools.log.NLog;

public class d
  extends NLog
{
  private d(Context paramContext, final int paramInt, final String paramString)
  {
    setCollector("SHARESDK", new LogsCollector(paramContext)
    {
      protected String getAppkey()
      {
        return paramString;
      }
      
      protected String getSDKTag()
      {
        return "SHARESDK";
      }
      
      protected int getSDKVersion()
      {
        return paramInt;
      }
    });
  }
  
  public static NLog a()
  {
    return getInstanceForSDK("SHARESDK", true);
  }
  
  public static NLog a(Context paramContext, int paramInt, String paramString)
  {
    return new d(paramContext, paramInt, paramString);
  }
  
  protected String getSDKTag()
  {
    return "SHARESDK";
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/cn/sharesdk/framework/utils/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */