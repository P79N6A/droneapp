package com.fimi.soul.service;

import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.os.IBinder;
import android.support.annotation.Nullable;
import com.fimi.kernel.utils.x;
import com.fimi.soul.base.DroidPlannerApp;
import com.fimi.soul.biz.e.d;
import com.fimi.soul.drone.droneconnection.connection.f.a;
import com.fimi.soul.utils.ao;

public class UsbStatus
  extends Service
{
  public static final String a = "android.hardware.usb.action.USB_STATE";
  public static final String b = "android.net.conn.CONNECTIVITY_CHANGE";
  BroadcastReceiver c = new BroadcastReceiver()
  {
    private void a()
    {
      UsbStatus.a(UsbStatus.this).T().d();
      d.a().a(false);
      UsbStatus.a(UsbStatus.this).V();
    }
    
    public void onReceive(Context paramAnonymousContext, Intent paramAnonymousIntent)
    {
      if ("android.hardware.usb.action.USB_STATE".equals(paramAnonymousIntent.getAction())) {
        if ((!paramAnonymousIntent.getExtras().getBoolean("connected")) && ((UsbStatus.a(UsbStatus.this).U()) || (UsbStatus.a(UsbStatus.this).T().a())) && (com.fimi.soul.biz.a.a.a().b() == 1)) {
          a();
        }
      }
      do
      {
        do
        {
          do
          {
            return;
          } while (!"android.net.conn.CONNECTIVITY_CHANGE".equals(paramAnonymousIntent.getAction()));
          UsbStatus.a(UsbStatus.this, 0);
        } while (com.fimi.soul.biz.a.a.a().b() != 2);
        paramAnonymousContext = (WifiManager)paramAnonymousContext.getSystemService("wifi");
        if (paramAnonymousContext.getWifiState() == 3)
        {
          x.b(new Runnable()
          {
            public void run()
            {
              boolean bool = false;
              while (UsbStatus.b(UsbStatus.this) < 2)
              {
                bool = ao.d("192.168.100.1");
                UsbStatus.c(UsbStatus.this);
              }
              if (!bool) {
                UsbStatus.1.a(UsbStatus.1.this);
              }
            }
          });
          return;
        }
      } while ((paramAnonymousContext.getWifiState() != 1) && (paramAnonymousContext.getWifiState() != 0));
      a();
    }
  };
  private DroidPlannerApp d;
  private com.fimi.soul.drone.a e;
  private int f = 0;
  
  public void a()
  {
    IntentFilter localIntentFilter = new IntentFilter();
    localIntentFilter.addAction("android.hardware.usb.action.USB_STATE");
    localIntentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
    registerReceiver(this.c, localIntentFilter);
  }
  
  @Nullable
  public IBinder onBind(Intent paramIntent)
  {
    return null;
  }
  
  public void onCreate()
  {
    super.onCreate();
    this.d = ((DroidPlannerApp)getApplication());
    this.e = this.d.a;
  }
  
  public int onStartCommand(Intent paramIntent, int paramInt1, int paramInt2)
  {
    a();
    return super.onStartCommand(paramIntent, paramInt1, paramInt2);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/service/UsbStatus.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */