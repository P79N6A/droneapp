package cn.sharesdk.wechat.utils;

import android.os.Bundle;

public abstract class j
{
  public String c;
  
  public abstract int a();
  
  public void a(Bundle paramBundle)
  {
    paramBundle.putInt("_wxapi_command_type", a());
    paramBundle.putString("_wxapi_basereq_transaction", this.c);
  }
  
  public abstract boolean b();
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/cn/sharesdk/wechat/utils/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */