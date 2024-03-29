package com.mob.tools;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import com.mob.tools.log.NLog;
import com.mob.tools.utils.ReflectHelper;
import java.util.HashMap;

public class MobUIShell
  extends Activity
{
  private static HashMap<String, FakeActivity> executors = new HashMap();
  public static int forceTheme;
  private FakeActivity executor;
  
  static
  {
    MobLog.getInstance().d("===============================", new Object[0]);
    String str = "2016-11-07".replace("-0", "-").replace("-", ".");
    MobLog.getInstance().d("MobTools " + str, new Object[0]);
    MobLog.getInstance().d("===============================", new Object[0]);
  }
  
  protected static String registerExecutor(Object paramObject)
  {
    return registerExecutor(String.valueOf(System.currentTimeMillis()), paramObject);
  }
  
  protected static String registerExecutor(String paramString, Object paramObject)
  {
    executors.put(paramString, (FakeActivity)paramObject);
    return paramString;
  }
  
  public void finish()
  {
    if ((this.executor != null) && (this.executor.onFinish())) {
      return;
    }
    super.finish();
  }
  
  public FakeActivity getDefault()
  {
    try
    {
      String str = getPackageManager().getActivityInfo(getComponentName(), 128).metaData.getString("defaultActivity");
      if (!TextUtils.isEmpty(str))
      {
        Object localObject = str;
        if (str.startsWith(".")) {
          localObject = getPackageName() + str;
        }
        localObject = ReflectHelper.importClass((String)localObject);
        if (!TextUtils.isEmpty((CharSequence)localObject))
        {
          localObject = ReflectHelper.newInstance((String)localObject, new Object[0]);
          if ((localObject != null) && ((localObject instanceof FakeActivity)))
          {
            localObject = (FakeActivity)localObject;
            return (FakeActivity)localObject;
          }
        }
      }
    }
    catch (Throwable localThrowable)
    {
      MobLog.getInstance().w(localThrowable);
    }
    return null;
  }
  
  public Object getExecutor()
  {
    return this.executor;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    if (this.executor != null) {
      this.executor.onActivityResult(paramInt1, paramInt2, paramIntent);
    }
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    super.onConfigurationChanged(paramConfiguration);
    if (this.executor != null) {
      this.executor.onConfigurationChanged(paramConfiguration);
    }
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    Object localObject = getIntent();
    try
    {
      String str1 = ((Intent)localObject).getStringExtra("launch_time");
      String str2 = ((Intent)localObject).getStringExtra("executor_name");
      this.executor = ((FakeActivity)executors.remove(str1));
      if (this.executor == null)
      {
        localObject = ((Intent)localObject).getScheme();
        this.executor = ((FakeActivity)executors.remove(localObject));
        if (this.executor == null)
        {
          this.executor = getDefault();
          if (this.executor == null)
          {
            MobLog.getInstance().w(new RuntimeException("Executor lost! launchTime = " + str1 + ", executorName: " + str2));
            super.onCreate(paramBundle);
            finish();
            return;
          }
        }
      }
    }
    catch (Throwable localThrowable)
    {
      MobLog.getInstance().w(localThrowable);
      super.onCreate(paramBundle);
      finish();
      return;
    }
    MobLog.getInstance().i("MobUIShell found executor: " + this.executor.getClass(), new Object[0]);
    this.executor.setActivity(this);
    super.onCreate(paramBundle);
    MobLog.getInstance().d(this.executor.getClass().getSimpleName() + " onCreate", new Object[0]);
    this.executor.onCreate();
  }
  
  public boolean onCreateOptionsMenu(Menu paramMenu)
  {
    boolean bool = super.onCreateOptionsMenu(paramMenu);
    if (this.executor != null) {
      bool = this.executor.onCreateOptionsMenu(paramMenu);
    }
    return bool;
  }
  
  protected void onDestroy()
  {
    if (this.executor != null)
    {
      this.executor.sendResult();
      MobLog.getInstance().d(this.executor.getClass().getSimpleName() + " onDestroy", new Object[0]);
      this.executor.onDestroy();
    }
    super.onDestroy();
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    boolean bool = false;
    if (this.executor != null) {
      bool = this.executor.onKeyEvent(paramInt, paramKeyEvent);
    }
    if (bool) {
      return true;
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
  
  public boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent)
  {
    boolean bool = false;
    if (this.executor != null) {
      bool = this.executor.onKeyEvent(paramInt, paramKeyEvent);
    }
    if (bool) {
      return true;
    }
    return super.onKeyUp(paramInt, paramKeyEvent);
  }
  
  protected void onNewIntent(Intent paramIntent)
  {
    if (this.executor == null)
    {
      super.onNewIntent(paramIntent);
      return;
    }
    this.executor.onNewIntent(paramIntent);
  }
  
  public boolean onOptionsItemSelected(MenuItem paramMenuItem)
  {
    boolean bool = super.onOptionsItemSelected(paramMenuItem);
    if (this.executor != null) {
      bool = this.executor.onOptionsItemSelected(paramMenuItem);
    }
    return bool;
  }
  
  protected void onPause()
  {
    if (this.executor != null)
    {
      MobLog.getInstance().d(this.executor.getClass().getSimpleName() + " onPause", new Object[0]);
      this.executor.onPause();
    }
    super.onPause();
  }
  
  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    if (this.executor != null) {
      this.executor.onRequestPermissionsResult(paramInt, paramArrayOfString, paramArrayOfInt);
    }
  }
  
  protected void onRestart()
  {
    if (this.executor != null)
    {
      MobLog.getInstance().d(this.executor.getClass().getSimpleName() + " onRestart", new Object[0]);
      this.executor.onRestart();
    }
    super.onRestart();
  }
  
  protected void onResume()
  {
    if (this.executor != null)
    {
      MobLog.getInstance().d(this.executor.getClass().getSimpleName() + " onResume", new Object[0]);
      this.executor.onResume();
    }
    super.onResume();
  }
  
  protected void onStart()
  {
    if (this.executor != null)
    {
      MobLog.getInstance().d(this.executor.getClass().getSimpleName() + " onStart", new Object[0]);
      this.executor.onStart();
    }
    super.onStart();
  }
  
  protected void onStop()
  {
    if (this.executor != null)
    {
      MobLog.getInstance().d(this.executor.getClass().getSimpleName() + " onStop", new Object[0]);
      this.executor.onStop();
    }
    super.onStop();
  }
  
  public void setContentView(int paramInt)
  {
    setContentView(LayoutInflater.from(this).inflate(paramInt, null));
  }
  
  public void setContentView(View paramView)
  {
    if (paramView == null) {}
    do
    {
      return;
      super.setContentView(paramView);
    } while (this.executor == null);
    this.executor.setContentView(paramView);
  }
  
  public void setContentView(View paramView, ViewGroup.LayoutParams paramLayoutParams)
  {
    if (paramView == null) {}
    for (;;)
    {
      return;
      if (paramLayoutParams == null) {
        super.setContentView(paramView);
      }
      while (this.executor != null)
      {
        this.executor.setContentView(paramView);
        return;
        super.setContentView(paramView, paramLayoutParams);
      }
    }
  }
  
  public void setTheme(int paramInt)
  {
    if (forceTheme > 0)
    {
      super.setTheme(forceTheme);
      return;
    }
    super.setTheme(paramInt);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/mob/tools/MobUIShell.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */