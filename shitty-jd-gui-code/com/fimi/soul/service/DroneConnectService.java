package com.fimi.soul.service;

import android.app.PendingIntent;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.hardware.usb.UsbDevice;
import android.hardware.usb.UsbManager;
import android.os.AsyncTask;
import android.os.IBinder;
import com.fimi.soul.base.DroidPlannerApp;
import com.fimi.soul.biz.camera.b;
import com.fimi.soul.biz.camera.c.f;
import com.fimi.soul.biz.camera.d;
import com.fimi.soul.drone.droneconnection.connection.f.a;
import com.fimi.soul.drone.g.c;
import com.fimi.soul.utils.ao;
import com.hoho.android.usbserial.driver.UsbSerialProber;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class DroneConnectService
  extends Service
{
  public static final String c = "android.hardware.usb.action.USB_DEVICE_DETACHED";
  public static final String d = "android.hardware.usb.action.USB_DEVICE_ATTACHED";
  public static final String e = "USBHAVECONNECT";
  public static final String f = "TCPSONNECTSUCESS";
  public static final String g = "android.hardware.usb.action.USB_STATE";
  public static final String h = "android.net.conn.TETHER_STATE_CHANGED";
  private static final String l = "com.android.example.USB_PERMISSION";
  public com.fimi.soul.drone.a a;
  public DroidPlannerApp b;
  BroadcastReceiver i = new BroadcastReceiver()
  {
    public void onReceive(Context paramAnonymousContext, Intent paramAnonymousIntent)
    {
      if ("com.android.example.USB_PERMISSION".equals(paramAnonymousIntent.getAction())) {}
      do
      {
        try
        {
          paramAnonymousContext = (UsbDevice)paramAnonymousIntent.getParcelableExtra("device");
          if ((paramAnonymousIntent.getBooleanExtra("permission", false)) && (paramAnonymousContext != null)) {
            DroneConnectService.this.a(paramAnonymousContext);
          }
          if (("android.hardware.usb.action.USB_DEVICE_ATTACHED".equals(paramAnonymousIntent.getAction())) && (!DroneConnectService.this.a.T().a()))
          {
            com.fimi.soul.drone.droneconnection.connection.a.a.a(c.c);
            DroneConnectService.this.a.T().b();
            return;
          }
        }
        finally {}
        if (("android.hardware.usb.action.USB_DEVICE_DETACHED".equals(paramAnonymousIntent.getAction())) && (DroneConnectService.this.a.T().a()))
        {
          DroneConnectService.this.a.T().d();
          return;
        }
      } while (("android.net.conn.TETHER_STATE_CHANGED".equals(paramAnonymousIntent.getAction())) && (c.c.equals(DroneConnectService.this.a.T().e())));
      new AsyncTask()
      {
        protected Boolean a(Void... paramAnonymous2VarArgs)
        {
          return Boolean.valueOf(ao.d(c.b()));
        }
        
        protected void a(Boolean paramAnonymous2Boolean)
        {
          super.onPostExecute(paramAnonymous2Boolean);
          d locald = (d)b.a().d();
          if ((!DroneConnectService.this.a.T().a()) && (paramAnonymous2Boolean.booleanValue()))
          {
            com.fimi.soul.drone.droneconnection.connection.a.a.a(c.d);
            DroneConnectService.this.a.T().b();
            locald.t().b();
          }
          while ((!DroneConnectService.this.a.T().a()) || (paramAnonymous2Boolean.booleanValue()) || (!DroneConnectService.this.a.T().e().equals(c.d))) {
            return;
          }
          DroneConnectService.this.a.T().d();
          locald.a(-1);
          locald.m();
        }
      }.execute(new Void[0]);
    }
  };
  private UsbManager j;
  private PendingIntent k;
  
  public void a()
  {
    if (UsbSerialProber.findFirstDevice(this.j) == null) {
      if (this.j != null)
      {
        Iterator localIterator = this.j.getDeviceList().values().iterator();
        while (localIterator.hasNext()) {
          a((UsbDevice)localIterator.next());
        }
        if (!this.a.T().a()) {
          new AsyncTask()
          {
            protected Boolean a(Void... paramAnonymousVarArgs)
            {
              return Boolean.valueOf(ao.d(c.b()));
            }
            
            protected void a(Boolean paramAnonymousBoolean)
            {
              super.onPostExecute(paramAnonymousBoolean);
              if (paramAnonymousBoolean.booleanValue())
              {
                com.fimi.soul.drone.droneconnection.connection.a.a.a(c.d);
                DroneConnectService.this.a.T().b();
              }
            }
          }.execute(new Void[0]);
        }
      }
    }
    do
    {
      return;
      com.fimi.soul.drone.droneconnection.connection.a.a.a(c.c);
    } while (this.a.T().a());
    this.a.T().b();
  }
  
  public void a(UsbDevice paramUsbDevice)
  {
    if ((paramUsbDevice.getVendorId() == 1155) && (paramUsbDevice.getProductId() == 22336))
    {
      if (!this.j.hasPermission(paramUsbDevice))
      {
        this.k = PendingIntent.getBroadcast(getApplicationContext(), 0, new Intent("com.android.example.USB_PERMISSION"), 0);
        this.j.requestPermission(paramUsbDevice, this.k);
      }
      com.fimi.soul.drone.droneconnection.connection.a.a.a(c.c);
      if (!this.a.T().a()) {
        this.a.T().b();
      }
    }
  }
  
  public void b()
  {
    IntentFilter localIntentFilter = new IntentFilter();
    localIntentFilter.addAction("android.hardware.usb.action.USB_DEVICE_ATTACHED");
    localIntentFilter.addAction("android.hardware.usb.action.USB_DEVICE_DETACHED");
    localIntentFilter.addAction("USBHAVECONNECT");
    localIntentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
    localIntentFilter.addAction("android.net.wifi.WIFI_STATE_CHANGED");
    localIntentFilter.addAction("android.net.wifi.STATE_CHANGE");
    localIntentFilter.addAction("android.hardware.usb.action.USB_STATE");
    localIntentFilter.addAction("TCPSONNECTSUCESS");
    localIntentFilter.addAction("android.net.conn.TETHER_STATE_CHANGED");
    localIntentFilter.addAction("com.android.example.USB_PERMISSION");
    registerReceiver(this.i, localIntentFilter);
  }
  
  public void c()
  {
    unregisterReceiver(this.i);
  }
  
  public IBinder onBind(Intent paramIntent)
  {
    return null;
  }
  
  public void onCreate()
  {
    super.onCreate();
    this.b = ((DroidPlannerApp)getApplication());
    this.a = this.b.a;
    this.j = ((UsbManager)getSystemService("usb"));
    b();
  }
  
  public void onDestroy()
  {
    super.onDestroy();
    c();
  }
  
  public int onStartCommand(Intent paramIntent, int paramInt1, int paramInt2)
  {
    a();
    return super.onStartCommand(paramIntent, paramInt1, paramInt2);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/service/DroneConnectService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */