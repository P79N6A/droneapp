package com.fimi.kernel;

import android.content.Context;
import android.support.multidex.MultiDex;
import android.support.multidex.MultiDexApplication;
import com.fimi.kernel.utils.x;

public class BaseApplication
  extends MultiDexApplication
{
  protected void attachBaseContext(Context paramContext)
  {
    super.attachBaseContext(paramContext);
    MultiDex.install(paramContext);
  }
  
  public void onCreate()
  {
    super.onCreate();
    c.a(getApplicationContext());
  }
  
  public void onTerminate()
  {
    x.b();
    super.onTerminate();
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/kernel/BaseApplication.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */