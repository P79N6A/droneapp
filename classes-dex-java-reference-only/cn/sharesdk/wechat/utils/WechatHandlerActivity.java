package cn.sharesdk.wechat.utils;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import cn.sharesdk.framework.utils.d;
import com.mob.tools.log.NLog;

public class WechatHandlerActivity
  extends Activity
{
  protected void onCreate(Bundle paramBundle)
  {
    setTheme(16973839);
    super.onCreate(paramBundle);
    try
    {
      WechatHelper.a().a(this);
      finish();
      return;
    }
    catch (Throwable paramBundle)
    {
      for (;;)
      {
        d.a().d(paramBundle);
      }
    }
  }
  
  public void onGetMessageFromWXReq(WXMediaMessage paramWXMediaMessage) {}
  
  protected void onNewIntent(Intent paramIntent)
  {
    super.onNewIntent(paramIntent);
    setIntent(paramIntent);
    try
    {
      WechatHelper.a().a(this);
      finish();
      return;
    }
    catch (Throwable paramIntent)
    {
      for (;;)
      {
        d.a().d(paramIntent);
      }
    }
  }
  
  public void onShowMessageFromWXReq(WXMediaMessage paramWXMediaMessage) {}
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/cn/sharesdk/wechat/utils/WechatHandlerActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */