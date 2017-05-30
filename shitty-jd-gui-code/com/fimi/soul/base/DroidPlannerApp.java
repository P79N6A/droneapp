package com.fimi.soul.base;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.os.Debug;
import android.os.Handler;
import android.os.Process;
import android.util.Log;
import com.fimi.kernel.utils.v;
import com.fimi.soul.biz.manager.u;
import com.fimi.soul.drone.d.a;
import com.fimi.soul.drone.droneconnection.connection.f.b;
import com.fimi.soul.drone.h.ao;
import com.fimi.soul.utils.NetUtil;
import com.fimi.soul.utils.i;
import com.fimi.soul.utils.x;
import com.tencent.mm.sdk.platformtools.SystemProperty;
import com.xiaomi.channel.commonutils.logger.LoggerInterface;
import com.xiaomi.mipush.sdk.Logger;
import com.xiaomi.mipush.sdk.MiPushClient;
import com.xiaomi.mistatistic.sdk.MiStatInterface;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class DroidPlannerApp
  extends ErrorReportApp
  implements f.b
{
  static DroidPlannerApp e = null;
  private static HashMap i = new HashMap();
  public com.fimi.soul.drone.a a;
  public com.fimi.soul.drone.a.a b;
  public boolean c = true;
  public com.fimi.soul.drone.droneconnection.connection.service.a d;
  private v f = null;
  private List<Activity> g = new LinkedList();
  private List<Activity> h = new ArrayList();
  
  public static HashMap<String, String> c()
  {
    return i;
  }
  
  public static Context g()
  {
    return e;
  }
  
  private void h()
  {
    boolean bool = "1".equals(SystemProperty.getProperty("ro.kernel.qemu"));
    ApplicationInfo localApplicationInfo = getApplicationInfo();
    int j = localApplicationInfo.flags & 0x2;
    localApplicationInfo.flags = j;
    if ((j != 0) || (Debug.isDebuggerConnected()) || (bool)) {
      Process.killProcess(Process.myPid());
    }
  }
  
  private void i()
  {
    new u(g()).a();
  }
  
  private boolean j()
  {
    Object localObject = ((ActivityManager)getSystemService("activity")).getRunningAppProcesses();
    String str = getPackageName();
    int j = Process.myPid();
    localObject = ((List)localObject).iterator();
    while (((Iterator)localObject).hasNext())
    {
      ActivityManager.RunningAppProcessInfo localRunningAppProcessInfo = (ActivityManager.RunningAppProcessInfo)((Iterator)localObject).next();
      if ((localRunningAppProcessInfo.pid == j) && (str.equals(localRunningAppProcessInfo.processName))) {
        return true;
      }
    }
    return false;
  }
  
  private void k()
  {
    SharedPreferences localSharedPreferences = v.a(this).a();
    com.fimi.soul.biz.n.a locala = com.fimi.soul.biz.n.a.a();
    if (localSharedPreferences.getBoolean("Map_Code_Correction", false))
    {
      locala.a(false);
      return;
    }
    locala.a(true);
  }
  
  public void a()
  {
    if ((this.h != null) && (this.h.size() > 0))
    {
      Iterator localIterator = this.h.iterator();
      while (localIterator.hasNext()) {
        ((Activity)localIterator.next()).finish();
      }
      this.h.clear();
    }
  }
  
  public void a(Activity paramActivity)
  {
    this.h.add(paramActivity);
  }
  
  public void a(com.fimi.soul.drone.c.a.b paramb)
  {
    this.b.a(paramb);
  }
  
  public void a(boolean paramBoolean)
  {
    com.fimi.soul.drone.a locala = this.a;
    if ((paramBoolean) || (this.a.K().a() > 5)) {}
    for (paramBoolean = true;; paramBoolean = false)
    {
      locala.b(paramBoolean);
      return;
    }
  }
  
  public void b()
  {
    if ((this.g != null) && (this.g.size() > 0)) {
      this.g.clear();
    }
  }
  
  public void b(Activity paramActivity)
  {
    this.g.add(paramActivity);
  }
  
  public void b(boolean paramBoolean)
  {
    this.a.a(paramBoolean);
    if (!paramBoolean)
    {
      this.a.b(false);
      this.a.a(d.a.as);
    }
  }
  
  public void d()
  {
    try
    {
      Iterator localIterator = this.g.iterator();
      while (localIterator.hasNext())
      {
        Activity localActivity = (Activity)localIterator.next();
        if (localActivity != null) {
          localActivity.finish();
        }
      }
      return;
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
  }
  
  public void e()
  {
    this.a.a(d.a.aL);
  }
  
  public void f()
  {
    this.a.K().a((byte)0);
    this.a.b(false);
    this.a.a(d.a.as);
  }
  
  public void onCreate()
  {
    super.onCreate();
    i.a(this);
    e = this;
    this.d = new com.fimi.soul.drone.droneconnection.connection.service.a(this, this);
    NetUtil.a();
    this.f = v.a(this);
    this.a = new com.fimi.soul.drone.a(this.d, this, new Handler());
    this.b = new com.fimi.soul.drone.a.a(this.a, g());
    if ((j()) && (this.f.a().contains("isfirstloading"))) {
      MiPushClient.registerPush(this, "2882303761517518920", "5761751863920");
    }
    Logger.setLogger(this, new LoggerInterface()
    {
      public void log(String paramAnonymousString)
      {
        Log.d("MiPlaneApp", paramAnonymousString);
      }
      
      public void log(String paramAnonymousString, Throwable paramAnonymousThrowable)
      {
        Log.d("MiPlaneApp", paramAnonymousString, paramAnonymousThrowable);
      }
      
      public void setTag(String paramAnonymousString) {}
    });
    MiStatInterface.initialize(this, "2882303761517518920", "5761751863920", "Xiao Mi");
    MiStatInterface.setUploadPolicy(3, 0L);
    MiStatInterface.enableExceptionCatcher(false);
    i();
    com.fimi.soul.biz.camera.b.a(this);
    x.a();
    k();
  }
  
  public void onTerminate()
  {
    super.onTerminate();
    x.b();
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/base/DroidPlannerApp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */