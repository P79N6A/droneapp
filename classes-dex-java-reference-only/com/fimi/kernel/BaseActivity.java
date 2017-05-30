package com.fimi.kernel;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v4.app.FragmentActivity;
import com.fimi.kernel.b.d;
import com.fimi.kernel.c.a;
import com.fimi.kernel.utils.x;
import java.util.HashMap;
import java.util.Map;

public abstract class BaseActivity
  extends FragmentActivity
{
  private Handler activityInnerHandler;
  private Map<d, com.fimi.kernel.b.b> networkManagerMap;
  
  protected Handler getHandler()
  {
    return this.activityInnerHandler;
  }
  
  protected a getKeyValueStoreManager()
  {
    return c.c();
  }
  
  public com.fimi.kernel.b.b getNetworkManager(d paramd)
  {
    if (this.networkManagerMap == null) {
      this.networkManagerMap = new HashMap();
    }
    if (this.networkManagerMap.containsKey(paramd)) {
      return (com.fimi.kernel.b.b)this.networkManagerMap.get(paramd);
    }
    com.fimi.kernel.b.b localb = (com.fimi.kernel.b.b)c.a(paramd);
    this.networkManagerMap.put(paramd, localb);
    return localb;
  }
  
  protected com.fimi.kernel.view.b getViewManager()
  {
    return c.b();
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    c.a(this);
    this.activityInnerHandler = new a();
  }
  
  protected void onDestroy()
  {
    c.b(this);
    super.onDestroy();
  }
  
  public void onHandleMessage(Message paramMessage) {}
  
  protected void onResume()
  {
    c.a(this);
    super.onResume();
  }
  
  protected void onStart()
  {
    c.a(this);
    super.onStart();
  }
  
  public void runInBackground(Runnable paramRunnable)
  {
    x.a(paramRunnable);
  }
  
  class a
    extends Handler
  {
    a() {}
    
    public void handleMessage(Message paramMessage)
    {
      BaseActivity.this.onHandleMessage(paramMessage);
      super.handleMessage(paramMessage);
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/kernel/BaseActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */