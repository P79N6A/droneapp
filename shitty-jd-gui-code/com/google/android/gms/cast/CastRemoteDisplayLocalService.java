package com.google.android.gms.cast;

import android.annotation.TargetApi;
import android.app.Notification;
import android.app.PendingIntent;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.ServiceConnection;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ServiceInfo;
import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.support.annotation.NonNull;
import android.support.v4.app.NotificationCompat.Builder;
import android.support.v7.media.MediaRouteSelector.Builder;
import android.support.v7.media.MediaRouter;
import android.support.v7.media.MediaRouter.Callback;
import android.support.v7.media.MediaRouter.RouteInfo;
import android.text.TextUtils;
import android.view.Display;
import com.google.android.gms.R.drawable;
import com.google.android.gms.R.id;
import com.google.android.gms.R.string;
import com.google.android.gms.cast.internal.m;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.g.a;
import com.google.android.gms.common.api.g.b;
import com.google.android.gms.common.api.g.c;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.n;
import java.util.concurrent.atomic.AtomicBoolean;

@TargetApi(19)
public abstract class CastRemoteDisplayLocalService
  extends Service
{
  private static final m a = new m("CastRemoteDisplayLocalService");
  private static final int b = j();
  private static final Object c = new Object();
  private static AtomicBoolean d = new AtomicBoolean(false);
  private static CastRemoteDisplayLocalService v;
  private g e;
  private d.b f;
  private String g;
  private a h;
  private e i;
  private b j;
  private Notification k;
  private boolean l;
  private PendingIntent m;
  private CastDevice n;
  private Display o;
  private Context p;
  private ServiceConnection q;
  private Handler r;
  private MediaRouter s;
  private boolean t = false;
  private final MediaRouter.Callback u = new MediaRouter.Callback()
  {
    public void onRouteUnselected(MediaRouter paramAnonymousMediaRouter, MediaRouter.RouteInfo paramAnonymousRouteInfo)
    {
      CastRemoteDisplayLocalService.a(CastRemoteDisplayLocalService.this, "onRouteUnselected");
      if (CastRemoteDisplayLocalService.a(CastRemoteDisplayLocalService.this) == null)
      {
        CastRemoteDisplayLocalService.a(CastRemoteDisplayLocalService.this, "onRouteUnselected, no device was selected");
        return;
      }
      if (!CastDevice.b(paramAnonymousRouteInfo.getExtras()).b().equals(CastRemoteDisplayLocalService.a(CastRemoteDisplayLocalService.this).b()))
      {
        CastRemoteDisplayLocalService.a(CastRemoteDisplayLocalService.this, "onRouteUnselected, device does not match");
        return;
      }
      CastRemoteDisplayLocalService.e();
    }
  };
  private final IBinder w = new d(null);
  
  private g a(CastDevice paramCastDevice, c paramc)
  {
    paramCastDevice = new d.a.a(paramCastDevice, this.f);
    if (paramc != null) {
      paramCastDevice.a(paramc.a);
    }
    new g.a(this, new g.b()new g.c
    {
      public void a(int paramAnonymousInt)
      {
        CastRemoteDisplayLocalService.f().d(String.format("[Instance: %s] ConnectionSuspended %d", new Object[] { this, Integer.valueOf(paramAnonymousInt) }), new Object[0]);
      }
      
      public void a(Bundle paramAnonymousBundle)
      {
        CastRemoteDisplayLocalService.a(CastRemoteDisplayLocalService.this, "onConnected");
        CastRemoteDisplayLocalService.f(CastRemoteDisplayLocalService.this);
      }
    }, new g.c()
    {
      public void a(ConnectionResult paramAnonymousConnectionResult)
      {
        CastRemoteDisplayLocalService localCastRemoteDisplayLocalService = CastRemoteDisplayLocalService.this;
        paramAnonymousConnectionResult = String.valueOf(paramAnonymousConnectionResult);
        CastRemoteDisplayLocalService.b(localCastRemoteDisplayLocalService, String.valueOf(paramAnonymousConnectionResult).length() + 19 + "Connection failed: " + paramAnonymousConnectionResult);
        CastRemoteDisplayLocalService.c(CastRemoteDisplayLocalService.this);
      }
    }).a(d.d, paramCastDevice.a()).c();
  }
  
  protected static void a()
  {
    a.a(true);
  }
  
  private static void a(Context paramContext, Class<? extends CastRemoteDisplayLocalService> paramClass)
  {
    try
    {
      paramClass = new ComponentName(paramContext, paramClass);
      paramContext = paramContext.getPackageManager().getServiceInfo(paramClass, 128);
      if ((paramContext != null) && (paramContext.exported)) {
        throw new IllegalStateException("The service must not be exported, verify the manifest configuration");
      }
    }
    catch (PackageManager.NameNotFoundException paramContext)
    {
      throw new IllegalStateException("Service not found, did you forget to configure it in the manifest?");
    }
  }
  
  public static void a(Context paramContext, Class<? extends CastRemoteDisplayLocalService> paramClass, String paramString, CastDevice paramCastDevice, b paramb, a parama)
  {
    a(paramContext, paramClass, paramString, paramCastDevice, new c(), paramb, parama);
  }
  
  public static void a(@NonNull final Context paramContext, @NonNull Class<? extends CastRemoteDisplayLocalService> paramClass, @NonNull String paramString, @NonNull final CastDevice paramCastDevice, @NonNull final c paramc, @NonNull final b paramb, @NonNull final a parama)
  {
    a.b("Starting Service", new Object[0]);
    synchronized (c)
    {
      if (v != null)
      {
        a.d("An existing service had not been stopped before starting one", new Object[0]);
        d(true);
      }
      a(paramContext, paramClass);
      com.google.android.gms.common.internal.d.a(paramContext, "activityContext is required.");
      com.google.android.gms.common.internal.d.a(paramClass, "serviceClass is required.");
      com.google.android.gms.common.internal.d.a(paramString, "applicationId is required.");
      com.google.android.gms.common.internal.d.a(paramCastDevice, "device is required.");
      com.google.android.gms.common.internal.d.a(paramc, "options is required.");
      com.google.android.gms.common.internal.d.a(paramb, "notificationSettings is required.");
      com.google.android.gms.common.internal.d.a(parama, "callbacks is required.");
      if ((b.a(paramb) == null) && (b.d(paramb) == null)) {
        throw new IllegalArgumentException("notificationSettings: Either the notification or the notificationPendingIntent must be provided");
      }
    }
    if (d.getAndSet(true))
    {
      a.e("Service is already being started, startService has been called twice", new Object[0]);
      return;
    }
    paramClass = new Intent(paramContext, paramClass);
    paramContext.startService(paramClass);
    paramContext.bindService(paramClass, new ServiceConnection()
    {
      public void onServiceConnected(ComponentName paramAnonymousComponentName, IBinder paramAnonymousIBinder)
      {
        paramAnonymousComponentName = ((CastRemoteDisplayLocalService.d)paramAnonymousIBinder).a();
        if ((paramAnonymousComponentName == null) || (!CastRemoteDisplayLocalService.a(paramAnonymousComponentName, CastRemoteDisplayLocalService.this, paramCastDevice, paramc, paramb, paramContext, this, parama)))
        {
          CastRemoteDisplayLocalService.f().e("Connected but unable to get the service instance", new Object[0]);
          parama.a(new Status(2200));
          CastRemoteDisplayLocalService.g().set(false);
        }
        try
        {
          paramContext.unbindService(this);
          return;
        }
        catch (IllegalArgumentException paramAnonymousComponentName)
        {
          CastRemoteDisplayLocalService.f().b("No need to unbind service, already unbound", new Object[0]);
        }
      }
      
      public void onServiceDisconnected(ComponentName paramAnonymousComponentName)
      {
        CastRemoteDisplayLocalService.f().b("onServiceDisconnected", new Object[0]);
        parama.a(new Status(2201, "Service Disconnected"));
        CastRemoteDisplayLocalService.g().set(false);
        try
        {
          paramContext.unbindService(this);
          return;
        }
        catch (IllegalArgumentException paramAnonymousComponentName)
        {
          CastRemoteDisplayLocalService.f().b("No need to unbind service, already unbound", new Object[0]);
        }
      }
    }, 64);
  }
  
  private void a(String paramString)
  {
    a.b("[Instance: %s] %s", new Object[] { this, paramString });
  }
  
  private boolean a(String paramString, CastDevice paramCastDevice, c paramc, b paramb, Context paramContext, ServiceConnection paramServiceConnection, a parama)
  {
    a("startRemoteDisplaySession");
    com.google.android.gms.common.internal.d.b("Starting the Cast Remote Display must be done on the main thread");
    for (;;)
    {
      synchronized (c)
      {
        if (v != null)
        {
          a.d("An existing service had not been stopped before starting one", new Object[0]);
          return false;
        }
        v = this;
        this.h = parama;
        this.g = paramString;
        this.n = paramCastDevice;
        this.p = paramContext;
        this.q = paramServiceConnection;
        this.s = MediaRouter.getInstance(getApplicationContext());
        paramString = new MediaRouteSelector.Builder().addControlCategory(b.b(this.g)).build();
        a("addMediaRouterCallback");
        this.s.addCallback(paramString, this.u, 4);
        this.f = new d.b()
        {
          public void a(Status paramAnonymousStatus)
          {
            CastRemoteDisplayLocalService.f().b(String.format("Cast screen has ended: %d", new Object[] { Integer.valueOf(paramAnonymousStatus.i()) }), new Object[0]);
            CastRemoteDisplayLocalService.a(false);
          }
        };
        this.k = b.a(paramb);
        this.i = new e(null);
        registerReceiver(this.i, new IntentFilter("com.google.android.gms.cast.remote_display.ACTION_NOTIFICATION_DISCONNECT"));
        this.j = new b(paramb, null);
        if (b.a(this.j) == null)
        {
          this.l = true;
          this.k = e(false);
          startForeground(b, this.k);
          this.e = a(paramCastDevice, paramc);
          this.e.e();
          if (this.h != null) {
            this.h.a(this);
          }
          return true;
        }
      }
      this.l = false;
      this.k = b.a(this.j);
    }
  }
  
  private void b(Display paramDisplay)
  {
    this.o = paramDisplay;
    if (this.l)
    {
      this.k = e(true);
      startForeground(b, this.k);
    }
    if (this.h != null)
    {
      this.h.b(this);
      this.h = null;
    }
    a(this.o);
  }
  
  private void b(b paramb)
  {
    com.google.android.gms.common.internal.d.b("updateNotificationSettingsInternal must be called on the main thread");
    if (this.j == null) {
      throw new IllegalStateException("No current notification settings to update");
    }
    if (this.l)
    {
      if (b.a(paramb) != null) {
        throw new IllegalStateException("Current mode is default notification, notification attribute must not be provided");
      }
      if (b.d(paramb) != null) {
        b.a(this.j, b.d(paramb));
      }
      if (!TextUtils.isEmpty(b.b(paramb))) {
        b.a(this.j, b.b(paramb));
      }
      if (!TextUtils.isEmpty(b.c(paramb))) {
        b.b(this.j, b.c(paramb));
      }
      this.k = e(true);
    }
    for (;;)
    {
      startForeground(b, this.k);
      return;
      com.google.android.gms.common.internal.d.a(b.a(paramb), "notification is required.");
      this.k = b.a(paramb);
      b.a(this.j, this.k);
    }
  }
  
  private void b(String paramString)
  {
    a.e("[Instance: %s] %s", new Object[] { this, paramString });
  }
  
  private void b(final boolean paramBoolean)
  {
    if (this.r != null)
    {
      if (Looper.myLooper() != Looper.getMainLooper()) {
        this.r.post(new Runnable()
        {
          public void run()
          {
            CastRemoteDisplayLocalService.a(CastRemoteDisplayLocalService.this, paramBoolean);
          }
        });
      }
    }
    else {
      return;
    }
    c(paramBoolean);
  }
  
  private void c(boolean paramBoolean)
  {
    a("Stopping Service");
    com.google.android.gms.common.internal.d.b("stopServiceInstanceInternal must be called on the main thread");
    if ((!paramBoolean) && (this.s != null))
    {
      a("Setting default route");
      this.s.selectRoute(this.s.getDefaultRoute());
    }
    if (this.i != null)
    {
      a("Unregistering notification receiver");
      unregisterReceiver(this.i);
    }
    o();
    p();
    k();
    if (this.e != null)
    {
      this.e.g();
      this.e = null;
    }
    if ((this.p != null) && (this.q != null)) {}
    try
    {
      this.p.unbindService(this.q);
      this.q = null;
      this.p = null;
      this.g = null;
      this.e = null;
      this.k = null;
      this.o = null;
      return;
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      for (;;)
      {
        a("No need to unbind service, already unbound");
      }
    }
  }
  
  public static CastRemoteDisplayLocalService d()
  {
    synchronized (c)
    {
      CastRemoteDisplayLocalService localCastRemoteDisplayLocalService = v;
      return localCastRemoteDisplayLocalService;
    }
  }
  
  private static void d(boolean paramBoolean)
  {
    a.b("Stopping Service", new Object[0]);
    d.set(false);
    synchronized (c)
    {
      if (v == null)
      {
        a.e("Service is already being stopped", new Object[0]);
        return;
      }
      CastRemoteDisplayLocalService localCastRemoteDisplayLocalService = v;
      v = null;
      localCastRemoteDisplayLocalService.b(paramBoolean);
      return;
    }
  }
  
  private Notification e(boolean paramBoolean)
  {
    a("createDefaultNotification");
    int i3 = getApplicationInfo().labelRes;
    String str3 = b.b(this.j);
    String str2 = b.c(this.j);
    int i2;
    int i1;
    String str1;
    if (paramBoolean)
    {
      i2 = R.string.cast_notification_connected_message;
      i1 = R.drawable.cast_ic_notification_on;
      str1 = str3;
      if (TextUtils.isEmpty(str3)) {
        str1 = getString(i3);
      }
      if (!TextUtils.isEmpty(str2)) {
        break label163;
      }
      str2 = getString(i2, new Object[] { this.n.e() });
    }
    label163:
    for (;;)
    {
      return new NotificationCompat.Builder(this).setContentTitle(str1).setContentText(str2).setContentIntent(b.d(this.j)).setSmallIcon(i1).setOngoing(true).addAction(17301560, getString(R.string.cast_notification_disconnect), q()).build();
      i2 = R.string.cast_notification_connecting_message;
      i1 = R.drawable.cast_ic_notification_connecting;
      break;
    }
  }
  
  public static void e()
  {
    d(false);
  }
  
  private static int j()
  {
    return R.id.cast_notification_id;
  }
  
  private void k()
  {
    if (this.s != null)
    {
      com.google.android.gms.common.internal.d.b("CastRemoteDisplayLocalService calls must be done on the main thread");
      a("removeMediaRouterCallback");
      this.s.removeCallback(this.u);
    }
  }
  
  private void l()
  {
    a("startRemoteDisplay");
    if ((this.e == null) || (!this.e.j()))
    {
      a.e("Unable to start the remote display as the API client is not ready", new Object[0]);
      return;
    }
    d.e.a(this.e, this.g).a(new n()
    {
      public void a(d.c paramAnonymousc)
      {
        if (!paramAnonymousc.a().f())
        {
          CastRemoteDisplayLocalService.f().e("Connection was not successful", new Object[0]);
          CastRemoteDisplayLocalService.c(CastRemoteDisplayLocalService.this);
          return;
        }
        CastRemoteDisplayLocalService.f().b("startRemoteDisplay successful", new Object[0]);
        synchronized (CastRemoteDisplayLocalService.h())
        {
          if (CastRemoteDisplayLocalService.i() == null)
          {
            CastRemoteDisplayLocalService.f().b("Remote Display started but session already cancelled", new Object[0]);
            CastRemoteDisplayLocalService.c(CastRemoteDisplayLocalService.this);
            return;
          }
        }
        paramAnonymousc = paramAnonymousc.b();
        if (paramAnonymousc != null) {
          CastRemoteDisplayLocalService.a(CastRemoteDisplayLocalService.this, paramAnonymousc);
        }
        for (;;)
        {
          CastRemoteDisplayLocalService.g().set(false);
          if ((CastRemoteDisplayLocalService.d(CastRemoteDisplayLocalService.this) == null) || (CastRemoteDisplayLocalService.e(CastRemoteDisplayLocalService.this) == null)) {
            break;
          }
          try
          {
            CastRemoteDisplayLocalService.d(CastRemoteDisplayLocalService.this).unbindService(CastRemoteDisplayLocalService.e(CastRemoteDisplayLocalService.this));
            CastRemoteDisplayLocalService.a(CastRemoteDisplayLocalService.this, null);
            CastRemoteDisplayLocalService.a(CastRemoteDisplayLocalService.this, null);
            return;
            CastRemoteDisplayLocalService.f().e("Cast Remote Display session created without display", new Object[0]);
          }
          catch (IllegalArgumentException paramAnonymousc)
          {
            for (;;)
            {
              CastRemoteDisplayLocalService.f().b("No need to unbind service, already unbound", new Object[0]);
            }
          }
        }
      }
    });
  }
  
  private void m()
  {
    a("stopRemoteDisplay");
    if ((this.e == null) || (!this.e.j()))
    {
      a.e("Unable to stop the remote display as the API client is not ready", new Object[0]);
      return;
    }
    d.e.a(this.e).a(new n()
    {
      public void a(d.c paramAnonymousc)
      {
        if (!paramAnonymousc.a().f()) {
          CastRemoteDisplayLocalService.a(CastRemoteDisplayLocalService.this, "Unable to stop the remote display, result unsuccessful");
        }
        for (;;)
        {
          CastRemoteDisplayLocalService.b(CastRemoteDisplayLocalService.this, null);
          return;
          CastRemoteDisplayLocalService.a(CastRemoteDisplayLocalService.this, "remote display stopped");
        }
      }
    });
  }
  
  private void n()
  {
    if (this.h != null)
    {
      this.h.a(new Status(2200));
      this.h = null;
    }
    e();
  }
  
  private void o()
  {
    a("stopRemoteDisplaySession");
    m();
    c();
  }
  
  private void p()
  {
    a("Stopping the remote display Service");
    stopForeground(true);
    stopSelf();
  }
  
  private PendingIntent q()
  {
    if (this.m == null)
    {
      Intent localIntent = new Intent("com.google.android.gms.cast.remote_display.ACTION_NOTIFICATION_DISCONNECT");
      localIntent.setPackage(this.p.getPackageName());
      this.m = PendingIntent.getBroadcast(this, 0, localIntent, 268435456);
    }
    return this.m;
  }
  
  public abstract void a(Display paramDisplay);
  
  public void a(final b paramb)
  {
    com.google.android.gms.common.internal.d.a(paramb, "notificationSettings is required.");
    com.google.android.gms.common.internal.d.a(this.r, "Service is not ready yet.");
    this.r.post(new Runnable()
    {
      public void run()
      {
        CastRemoteDisplayLocalService.a(CastRemoteDisplayLocalService.this, paramb);
      }
    });
  }
  
  protected Display b()
  {
    return this.o;
  }
  
  public abstract void c();
  
  public IBinder onBind(Intent paramIntent)
  {
    a("onBind");
    return this.w;
  }
  
  public void onCreate()
  {
    a("onCreate");
    super.onCreate();
    this.r = new Handler(getMainLooper());
    this.r.postDelayed(new Runnable()
    {
      public void run()
      {
        CastRemoteDisplayLocalService localCastRemoteDisplayLocalService = CastRemoteDisplayLocalService.this;
        boolean bool = CastRemoteDisplayLocalService.b(CastRemoteDisplayLocalService.this);
        CastRemoteDisplayLocalService.a(localCastRemoteDisplayLocalService, 59 + "onCreate after delay. The local service been started: " + bool);
        if (!CastRemoteDisplayLocalService.b(CastRemoteDisplayLocalService.this))
        {
          CastRemoteDisplayLocalService.b(CastRemoteDisplayLocalService.this, "The local service has not been been started, stopping it");
          CastRemoteDisplayLocalService.this.stopSelf();
        }
      }
    }, 100L);
  }
  
  public int onStartCommand(Intent paramIntent, int paramInt1, int paramInt2)
  {
    a("onStartCommand");
    this.t = true;
    return 2;
  }
  
  public static abstract interface a
  {
    public abstract void a(CastRemoteDisplayLocalService paramCastRemoteDisplayLocalService);
    
    public abstract void a(Status paramStatus);
    
    public abstract void b(CastRemoteDisplayLocalService paramCastRemoteDisplayLocalService);
  }
  
  public static final class b
  {
    private Notification a;
    private PendingIntent b;
    private String c;
    private String d;
    
    private b() {}
    
    private b(b paramb)
    {
      this.a = paramb.a;
      this.b = paramb.b;
      this.c = paramb.c;
      this.d = paramb.d;
    }
    
    public static final class a
    {
      private CastRemoteDisplayLocalService.b a = new CastRemoteDisplayLocalService.b(null);
      
      public a a(Notification paramNotification)
      {
        CastRemoteDisplayLocalService.b.a(this.a, paramNotification);
        return this;
      }
      
      public a a(PendingIntent paramPendingIntent)
      {
        CastRemoteDisplayLocalService.b.a(this.a, paramPendingIntent);
        return this;
      }
      
      public a a(String paramString)
      {
        CastRemoteDisplayLocalService.b.a(this.a, paramString);
        return this;
      }
      
      public CastRemoteDisplayLocalService.b a()
      {
        if (CastRemoteDisplayLocalService.b.a(this.a) != null)
        {
          if (!TextUtils.isEmpty(CastRemoteDisplayLocalService.b.b(this.a))) {
            throw new IllegalArgumentException("notificationTitle requires using the default notification");
          }
          if (!TextUtils.isEmpty(CastRemoteDisplayLocalService.b.c(this.a))) {
            throw new IllegalArgumentException("notificationText requires using the default notification");
          }
          if (CastRemoteDisplayLocalService.b.d(this.a) != null) {
            throw new IllegalArgumentException("notificationPendingIntent requires using the default notification");
          }
        }
        else if ((TextUtils.isEmpty(CastRemoteDisplayLocalService.b.b(this.a))) && (TextUtils.isEmpty(CastRemoteDisplayLocalService.b.c(this.a))) && (CastRemoteDisplayLocalService.b.d(this.a) == null))
        {
          throw new IllegalArgumentException("At least an argument must be provided");
        }
        return this.a;
      }
      
      public a b(String paramString)
      {
        CastRemoteDisplayLocalService.b.b(this.a, paramString);
        return this;
      }
    }
  }
  
  public static class c
  {
    @d.d
    int a = 2;
    
    public int a()
    {
      return this.a;
    }
    
    public void a(@d.d int paramInt)
    {
      this.a = paramInt;
    }
  }
  
  private class d
    extends Binder
  {
    private d() {}
    
    CastRemoteDisplayLocalService a()
    {
      return CastRemoteDisplayLocalService.this;
    }
  }
  
  private static final class e
    extends BroadcastReceiver
  {
    public void onReceive(Context paramContext, Intent paramIntent)
    {
      if (paramIntent.getAction().equals("com.google.android.gms.cast.remote_display.ACTION_NOTIFICATION_DISCONNECT"))
      {
        CastRemoteDisplayLocalService.f().b("disconnecting", new Object[0]);
        CastRemoteDisplayLocalService.e();
      }
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/cast/CastRemoteDisplayLocalService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */