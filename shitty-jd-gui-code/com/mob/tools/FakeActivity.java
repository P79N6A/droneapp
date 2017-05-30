package com.mob.tools;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.os.Message;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import com.mob.tools.log.NLog;
import com.mob.tools.utils.R;
import com.mob.tools.utils.ReflectHelper;
import com.mob.tools.utils.UIHandler;
import java.lang.reflect.Method;
import java.util.HashMap;

public class FakeActivity
{
  private static Class<? extends Activity> shellClass;
  protected Activity activity;
  private View contentView;
  private HashMap<String, Object> result;
  private FakeActivity resultReceiver;
  
  public static void registerExecutor(String paramString, Object paramObject)
  {
    if (shellClass != null) {
      try
      {
        Method localMethod = shellClass.getMethod("registerExecutor", new Class[] { String.class, Object.class });
        localMethod.setAccessible(true);
        localMethod.invoke(null, new Object[] { paramString, paramObject });
        return;
      }
      catch (Throwable paramString)
      {
        MobLog.getInstance().w(paramString);
        return;
      }
    }
    MobUIShell.registerExecutor(paramString, paramObject);
  }
  
  public static void setShell(Class<? extends Activity> paramClass)
  {
    shellClass = paramClass;
  }
  
  public <T extends View> T findViewById(int paramInt)
  {
    if (this.activity == null) {
      return null;
    }
    return this.activity.findViewById(paramInt);
  }
  
  public <T extends View> T findViewByResName(View paramView, String paramString)
  {
    if (this.activity == null) {}
    int i;
    do
    {
      return null;
      i = R.getIdRes(this.activity, paramString);
    } while (i <= 0);
    return paramView.findViewById(i);
  }
  
  public <T extends View> T findViewByResName(String paramString)
  {
    if (this.activity == null) {}
    int i;
    do
    {
      return null;
      i = R.getIdRes(this.activity, paramString);
    } while (i <= 0);
    return findViewById(i);
  }
  
  public final void finish()
  {
    if (this.activity != null) {
      this.activity.finish();
    }
  }
  
  public View getContentView()
  {
    return this.contentView;
  }
  
  public Context getContext()
  {
    return this.activity;
  }
  
  public int getOrientation()
  {
    return this.activity.getResources().getConfiguration().orientation;
  }
  
  public FakeActivity getParent()
  {
    return this.resultReceiver;
  }
  
  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent) {}
  
  public void onConfigurationChanged(Configuration paramConfiguration) {}
  
  public void onCreate() {}
  
  public boolean onCreateOptionsMenu(Menu paramMenu)
  {
    return true;
  }
  
  public void onDestroy() {}
  
  public boolean onFinish()
  {
    return false;
  }
  
  public boolean onKeyEvent(int paramInt, KeyEvent paramKeyEvent)
  {
    return false;
  }
  
  public void onNewIntent(Intent paramIntent) {}
  
  public boolean onOptionsItemSelected(MenuItem paramMenuItem)
  {
    return false;
  }
  
  public void onPause() {}
  
  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt) {}
  
  public void onRestart() {}
  
  public void onResult(HashMap<String, Object> paramHashMap) {}
  
  public void onResume() {}
  
  public void onStart() {}
  
  public void onStop() {}
  
  public void requestFullScreen(boolean paramBoolean)
  {
    if (this.activity == null) {
      return;
    }
    if (paramBoolean)
    {
      this.activity.getWindow().addFlags(1024);
      this.activity.getWindow().clearFlags(2048);
    }
    for (;;)
    {
      this.activity.getWindow().getDecorView().requestLayout();
      return;
      this.activity.getWindow().addFlags(2048);
      this.activity.getWindow().clearFlags(1024);
    }
  }
  
  public void requestLandscapeOrientation()
  {
    setRequestedOrientation(0);
  }
  
  public void requestPermissions(String[] paramArrayOfString, int paramInt)
  {
    if (this.activity == null) {}
    while (Build.VERSION.SDK_INT < 23) {
      return;
    }
    try
    {
      ReflectHelper.invokeInstanceMethod(this.activity, "requestPermissions", new Object[] { paramArrayOfString, Integer.valueOf(paramInt) });
      return;
    }
    catch (Throwable paramArrayOfString)
    {
      MobLog.getInstance().d(paramArrayOfString);
    }
  }
  
  public void requestPortraitOrientation()
  {
    setRequestedOrientation(1);
  }
  
  public void runOnUIThread(Runnable paramRunnable)
  {
    UIHandler.sendEmptyMessage(0, new FakeActivity.2(this, paramRunnable));
  }
  
  public void runOnUIThread(Runnable paramRunnable, long paramLong)
  {
    UIHandler.sendEmptyMessageDelayed(0, paramLong, new FakeActivity.3(this, paramRunnable));
  }
  
  public void sendResult()
  {
    if (this.resultReceiver != null) {
      this.resultReceiver.onResult(this.result);
    }
  }
  
  public void setActivity(Activity paramActivity)
  {
    this.activity = paramActivity;
  }
  
  public void setContentView(View paramView)
  {
    this.contentView = paramView;
  }
  
  public void setContentViewLayoutResName(String paramString)
  {
    if (this.activity == null) {}
    int i;
    do
    {
      return;
      i = R.getLayoutRes(this.activity, paramString);
    } while (i <= 0);
    this.activity.setContentView(i);
  }
  
  public void setRequestedOrientation(int paramInt)
  {
    if (this.activity == null) {
      return;
    }
    this.activity.setRequestedOrientation(paramInt);
  }
  
  public final void setResult(HashMap<String, Object> paramHashMap)
  {
    this.result = paramHashMap;
  }
  
  public void show(Context paramContext, Intent paramIntent)
  {
    showForResult(paramContext, paramIntent, null);
  }
  
  public void show(Context paramContext, Intent paramIntent, boolean paramBoolean)
  {
    showForResult(paramContext, paramIntent, null, paramBoolean);
  }
  
  public void showForResult(Context paramContext, Intent paramIntent, FakeActivity paramFakeActivity)
  {
    showForResult(paramContext, paramIntent, paramFakeActivity, false);
  }
  
  public void showForResult(Context paramContext, Intent paramIntent, FakeActivity paramFakeActivity, boolean paramBoolean)
  {
    this.resultReceiver = paramFakeActivity;
    Message localMessage = new Message();
    if (shellClass != null) {}
    for (paramFakeActivity = new Intent(paramContext, shellClass);; paramFakeActivity = MobUIShell.registerExecutor(this))
    {
      try
      {
        localObject1 = shellClass.getMethod("registerExecutor", new Class[] { Object.class });
        ((Method)localObject1).setAccessible(true);
        str = (String)((Method)localObject1).invoke(null, new Object[] { this });
        localObject1 = paramFakeActivity;
        paramFakeActivity = str;
      }
      catch (Throwable localThrowable)
      {
        for (;;)
        {
          Object localObject1;
          MobLog.getInstance().w(localThrowable);
          String str = null;
          localObject2 = paramFakeActivity;
          paramFakeActivity = str;
        }
      }
      ((Intent)localObject1).putExtra("launch_time", paramFakeActivity);
      ((Intent)localObject1).putExtra("executor_name", getClass().getName());
      if (paramIntent != null) {
        ((Intent)localObject1).putExtras(paramIntent);
      }
      localMessage.obj = new Object[] { paramContext, localObject1 };
      UIHandler.sendMessage(localMessage, new FakeActivity.1(this, paramBoolean));
      return;
      Object localObject2 = new Intent(paramContext, MobUIShell.class);
    }
  }
  
  public void startActivity(Intent paramIntent)
  {
    startActivityForResult(paramIntent, -1);
  }
  
  public void startActivityForResult(Intent paramIntent, int paramInt)
  {
    if (this.activity == null) {
      return;
    }
    this.activity.startActivityForResult(paramIntent, paramInt);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/mob/tools/FakeActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */