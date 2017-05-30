package cn.sharesdk.framework.b;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import cn.sharesdk.framework.b.b.c;
import cn.sharesdk.framework.b.b.g;
import com.mob.commons.SHARESDK;
import com.mob.commons.appcollector.PackageCollector;
import com.mob.commons.appcollector.RuntimeCollector;
import com.mob.commons.deviceinfo.DeviceInfoCollector;
import com.mob.commons.iosbridge.UDPServer;
import com.mob.tools.SSDKHandlerThread;
import com.mob.tools.log.NLog;
import com.mob.tools.utils.DeviceHelper;
import com.mob.tools.utils.FileLocker;
import java.io.File;
import java.io.PrintStream;
import java.util.Calendar;

public class d
  extends SSDKHandlerThread
{
  private static d a;
  private Context b;
  private DeviceHelper c;
  private a d;
  private String e;
  private Handler f;
  private boolean g;
  private int h;
  private boolean i;
  private long j;
  private boolean k;
  private File l;
  private FileLocker m;
  
  private d(Context paramContext, String paramString)
  {
    this.b = paramContext;
    this.e = paramString;
    this.c = DeviceHelper.getInstance(paramContext);
    this.d = a.a(paramContext, paramString);
    this.m = new FileLocker();
    this.l = new File(paramContext.getFilesDir(), ".statistics");
    if (!this.l.exists()) {}
    try
    {
      this.l.createNewFile();
      return;
    }
    catch (Exception paramContext)
    {
      cn.sharesdk.framework.utils.d.a().d(paramContext);
    }
  }
  
  /* Error */
  public static d a(Context paramContext, String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: ldc 2
    //   4: monitorenter
    //   5: getstatic 95	cn/sharesdk/framework/b/d:a	Lcn/sharesdk/framework/b/d;
    //   8: astore_3
    //   9: aload_3
    //   10: ifnonnull +34 -> 44
    //   13: aload_0
    //   14: ifnonnull +8 -> 22
    //   17: ldc 2
    //   19: monitorexit
    //   20: aload_2
    //   21: areturn
    //   22: aload_1
    //   23: invokestatic 101	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   26: ifne -9 -> 17
    //   29: new 2	cn/sharesdk/framework/b/d
    //   32: dup
    //   33: aload_0
    //   34: invokevirtual 105	android/content/Context:getApplicationContext	()Landroid/content/Context;
    //   37: aload_1
    //   38: invokespecial 107	cn/sharesdk/framework/b/d:<init>	(Landroid/content/Context;Ljava/lang/String;)V
    //   41: putstatic 95	cn/sharesdk/framework/b/d:a	Lcn/sharesdk/framework/b/d;
    //   44: getstatic 95	cn/sharesdk/framework/b/d:a	Lcn/sharesdk/framework/b/d;
    //   47: astore_2
    //   48: goto -31 -> 17
    //   51: astore_0
    //   52: ldc 2
    //   54: monitorexit
    //   55: aload_0
    //   56: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	57	0	paramContext	Context
    //   0	57	1	paramString	String
    //   1	47	2	locald1	d
    //   8	2	3	locald2	d
    // Exception table:
    //   from	to	target	type
    //   5	9	51	finally
    //   22	44	51	finally
    //   44	48	51	finally
  }
  
  private void a()
  {
    boolean bool = b();
    if (bool) {
      if (!this.k)
      {
        this.k = bool;
        this.j = System.currentTimeMillis();
        a(new g());
      }
    }
    while (!this.k) {
      return;
    }
    this.k = bool;
    long l1 = System.currentTimeMillis();
    long l2 = this.j;
    cn.sharesdk.framework.b.b.e locale = new cn.sharesdk.framework.b.b.e();
    locale.a = (l1 - l2);
    a(locale);
  }
  
  private void b(c paramc)
  {
    paramc.f = this.c.getDeviceKey();
    paramc.g = this.e;
    paramc.h = this.c.getPackageName();
    paramc.i = this.c.getAppVersion();
    paramc.j = String.valueOf(60000 + this.h);
    paramc.k = this.c.getPlatformCode();
    paramc.l = this.c.getDetailNetworkTypeForStatic();
    if (TextUtils.isEmpty(this.e)) {
      System.err.println("Your appKey of ShareSDK is null , this will cause its data won't be count!");
    }
    for (;;)
    {
      paramc.m = this.c.getDeviceData();
      return;
      if ((!"cn.sharesdk.demo".equals(paramc.h)) && (("api20".equals(this.e)) || ("androidv1101".equals(this.e)))) {
        System.err.println("Your app is using the appkey of ShareSDK Demo, this will cause its data won't be count!");
      }
    }
  }
  
  private boolean b()
  {
    Object localObject = DeviceHelper.getInstance(this.b);
    String str = ((DeviceHelper)localObject).getTopTaskPackageName();
    localObject = ((DeviceHelper)localObject).getPackageName();
    return (localObject != null) && (((String)localObject).equals(str));
  }
  
  private void c(c paramc)
  {
    try
    {
      this.d.a(paramc);
      paramc.b(this.b);
      return;
    }
    catch (Throwable localThrowable)
    {
      cn.sharesdk.framework.utils.d.a().d(localThrowable);
      cn.sharesdk.framework.utils.d.a().d(paramc.toString(), new Object[0]);
    }
  }
  
  public void a(int paramInt)
  {
    this.h = paramInt;
  }
  
  public void a(Handler paramHandler)
  {
    this.f = paramHandler;
  }
  
  public void a(c paramc)
  {
    Message localMessage;
    if (this.i)
    {
      b(paramc);
      if (paramc.a(this.b))
      {
        localMessage = new Message();
        localMessage.what = 3;
        localMessage.obj = paramc;
      }
    }
    else
    {
      try
      {
        this.handler.sendMessage(localMessage);
        return;
      }
      catch (Throwable paramc)
      {
        cn.sharesdk.framework.utils.d.a().d(paramc);
        return;
      }
    }
    cn.sharesdk.framework.utils.d.a().d("Drop event: " + paramc.toString(), new Object[0]);
  }
  
  public void a(boolean paramBoolean)
  {
    this.g = paramBoolean;
  }
  
  protected void onMessage(Message paramMessage)
  {
    switch (paramMessage.what)
    {
    default: 
    case 3: 
      do
      {
        return;
      } while (paramMessage.obj == null);
      c((c)paramMessage.obj);
      this.handler.removeMessages(2);
      this.handler.sendEmptyMessageDelayed(2, 10000L);
      return;
    case 1: 
      a();
      try
      {
        this.handler.sendEmptyMessageDelayed(1, 5000L);
        return;
      }
      catch (Throwable paramMessage)
      {
        cn.sharesdk.framework.utils.d.a().d(paramMessage);
        return;
      }
    case 2: 
      try
      {
        this.d.c();
        return;
      }
      catch (Throwable paramMessage)
      {
        cn.sharesdk.framework.utils.d.a().d(paramMessage);
        return;
      }
    }
    long l1 = cn.sharesdk.framework.b.a.e.a(this.b).f().longValue();
    paramMessage = Calendar.getInstance();
    paramMessage.setTimeInMillis(l1);
    int n = paramMessage.get(1);
    int i1 = paramMessage.get(2);
    int i2 = paramMessage.get(5);
    paramMessage.setTimeInMillis(System.currentTimeMillis());
    int i3 = paramMessage.get(1);
    int i4 = paramMessage.get(2);
    int i5 = paramMessage.get(5);
    if ((n != i3) || (i1 != i4) || (i2 != i5)) {
      this.d.b();
    }
    this.handler.sendEmptyMessageDelayed(4, 3600000L);
  }
  
  protected void onStart(Message paramMessage)
  {
    if (!this.i) {
      this.i = true;
    }
    try
    {
      this.m.setLockFile(this.l.getAbsolutePath());
      if (this.m.lock(false))
      {
        this.d.a();
        this.d.b();
        SHARESDK.setAppKey(this.e);
        new SHARESDK().getDuid(this.b);
        DeviceInfoCollector.startCollector(this.b);
        PackageCollector.startCollector(this.b);
        RuntimeCollector.startCollector(this.b);
        UDPServer.start(this.b);
        this.handler.sendEmptyMessageDelayed(4, 3600000L);
        this.d.a(this.g);
        this.handler.sendEmptyMessage(1);
        this.handler.sendEmptyMessage(2);
      }
      return;
    }
    catch (Throwable paramMessage)
    {
      cn.sharesdk.framework.utils.d.a().d(paramMessage);
    }
  }
  
  protected void onStop(Message paramMessage)
  {
    if (this.i)
    {
      long l1 = System.currentTimeMillis();
      long l2 = this.j;
      paramMessage = new cn.sharesdk.framework.b.b.e();
      paramMessage.a = (l1 - l2);
      a(paramMessage);
      this.i = false;
    }
    try
    {
      this.f.sendEmptyMessage(1);
      a = null;
      this.handler.getLooper().quit();
      return;
    }
    catch (Throwable paramMessage)
    {
      for (;;)
      {
        cn.sharesdk.framework.utils.d.a().d(paramMessage);
      }
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/cn/sharesdk/framework/b/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */