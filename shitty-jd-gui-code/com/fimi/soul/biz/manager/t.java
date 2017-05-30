package com.fimi.soul.biz.manager;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.TrafficStats;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Message;
import java.util.Timer;
import java.util.TimerTask;

public class t
  implements Handler.Callback
{
  private static t b;
  private static final int h = 1;
  private a a;
  private long c = 0L;
  private long d = 0L;
  private Handler e = new Handler(this);
  private Context f = null;
  private Timer g;
  
  public t(Context paramContext)
  {
    this.f = paramContext;
  }
  
  public static t a(Context paramContext)
  {
    if (b == null) {
      b = new t(paramContext);
    }
    return b;
  }
  
  private String c()
  {
    if (TrafficStats.getUidRxBytes(this.f.getApplicationInfo().uid) == -1L) {}
    for (long l1 = 0L;; l1 = TrafficStats.getTotalRxBytes() / 1024L)
    {
      long l2 = System.currentTimeMillis();
      long l3 = (l1 - this.c) * 1000L / 8L / (l2 - this.d);
      this.d = l2;
      this.c = l1;
      return String.valueOf(l3) + " KB/s";
    }
  }
  
  public void a()
  {
    if (this.g != null) {
      this.g.cancel();
    }
  }
  
  public void a(a parama)
  {
    this.a = parama;
    if (TrafficStats.getUidRxBytes(this.f.getApplicationInfo().uid) == -1L) {}
    for (long l = 0L;; l = TrafficStats.getTotalRxBytes() / 1024L)
    {
      this.c = l;
      this.d = System.currentTimeMillis();
      this.g = new Timer();
      this.g.schedule(new TimerTask()
      {
        public void run()
        {
          String str = t.a(t.this);
          Message localMessage = Message.obtain();
          localMessage.what = 1;
          localMessage.obj = str;
          t.b(t.this).sendMessage(localMessage);
        }
      }, 1000L, 2000L);
      return;
    }
  }
  
  public String b()
  {
    Object localObject = ((ConnectivityManager)this.f.getSystemService("connectivity")).getActiveNetworkInfo();
    if ((localObject != null) && (((NetworkInfo)localObject).isConnected()))
    {
      if (((NetworkInfo)localObject).getType() == 1) {
        localObject = "WiFi";
      }
      String str;
      do
      {
        return (String)localObject;
        if (((NetworkInfo)localObject).getType() != 0) {
          break label173;
        }
        str = ((NetworkInfo)localObject).getSubtypeName();
        switch (((NetworkInfo)localObject).getSubtype())
        {
        default: 
          if ((str.equalsIgnoreCase("TD-SCDMA")) || (str.equalsIgnoreCase("WCDMA"))) {
            break label161;
          }
          localObject = str;
        }
      } while (!str.equalsIgnoreCase("CDMA2000"));
      label161:
      return "3G";
      return "2G";
      return "3G";
      return "4G";
    }
    label173:
    return "";
  }
  
  public boolean handleMessage(Message paramMessage)
  {
    if (paramMessage.what == 1) {
      this.a.a((String)paramMessage.obj, b());
    }
    return false;
  }
  
  public static abstract interface a
  {
    public abstract void a(String paramString1, String paramString2);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/biz/manager/t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */