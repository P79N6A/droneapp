package com.fimi.soul.drone.droneconnection.connection.service;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;
import com.fimi.soul.drone.c.a.c;
import com.fimi.soul.drone.droneconnection.connection.e;
import com.fimi.soul.drone.droneconnection.connection.g.a;
import java.io.IOException;
import java.lang.ref.WeakReference;

public class MiLinkService
  extends Service
{
  private static final String a = MiLinkService.class.getSimpleName();
  private final a b = new a(this);
  private com.fimi.soul.drone.droneconnection.connection.a c;
  
  private void a()
  {
    g.a locala = g.a.valueOf(com.fimi.soul.drone.droneconnection.connection.a.a.a());
    if ((this.c == null) || (this.c.j() != locala.a())) {
      this.c = locala.a(this);
    }
    if (this.c != null) {}
    try
    {
      this.c.e();
      if (this.c.i() != 2) {
        this.c.g();
      }
      return;
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        localIOException.printStackTrace();
      }
    }
  }
  
  private void b()
  {
    Log.d(a, "Pre disconnect");
    if ((this.c != null) && (this.c.i() != 0)) {
      this.c.h();
    }
  }
  
  public IBinder onBind(Intent paramIntent)
  {
    return this.b;
  }
  
  public void onCreate()
  {
    super.onCreate();
  }
  
  public void onDestroy()
  {
    super.onDestroy();
    b();
  }
  
  public static class a
    extends Binder
  {
    private final WeakReference<MiLinkService> a;
    
    a(MiLinkService paramMiLinkService)
    {
      this.a = new WeakReference(paramMiLinkService);
    }
    
    public int a()
    {
      MiLinkService localMiLinkService = (MiLinkService)this.a.get();
      if (localMiLinkService == null) {
        return 0;
      }
      return MiLinkService.a(localMiLinkService).i();
    }
    
    public void a(c paramc)
    {
      MiLinkService localMiLinkService = (MiLinkService)this.a.get();
      if (localMiLinkService == null) {}
      while ((MiLinkService.a(localMiLinkService) == null) || (MiLinkService.a(localMiLinkService).i() == 0)) {
        return;
      }
      MiLinkService.a(localMiLinkService).b(paramc);
    }
    
    public void a(String paramString)
    {
      MiLinkService localMiLinkService = (MiLinkService)this.a.get();
      if ((localMiLinkService == null) || (MiLinkService.a(localMiLinkService) == null)) {
        return;
      }
      MiLinkService.a(localMiLinkService).a(paramString);
    }
    
    public void a(String paramString, e parame)
    {
      MiLinkService localMiLinkService = (MiLinkService)this.a.get();
      if ((localMiLinkService == null) || (MiLinkService.a(localMiLinkService) == null)) {
        return;
      }
      MiLinkService.a(localMiLinkService).a(paramString, parame);
    }
    
    public void a(boolean paramBoolean)
    {
      if (MiLinkService.a((MiLinkService)this.a.get()) != null) {
        MiLinkService.a((MiLinkService)this.a.get()).a(paramBoolean);
      }
    }
    
    public void a(byte[] paramArrayOfByte)
    {
      MiLinkService localMiLinkService = (MiLinkService)this.a.get();
      if (localMiLinkService == null) {}
      while ((MiLinkService.a(localMiLinkService) == null) || (MiLinkService.a(localMiLinkService).i() == 0)) {
        return;
      }
      MiLinkService.a(localMiLinkService).c(paramArrayOfByte);
    }
    
    public void b()
    {
      MiLinkService localMiLinkService = (MiLinkService)this.a.get();
      if (localMiLinkService == null) {
        return;
      }
      MiLinkService.b(localMiLinkService);
    }
    
    public void b(boolean paramBoolean)
    {
      if (MiLinkService.a((MiLinkService)this.a.get()) != null) {
        MiLinkService.a((MiLinkService)this.a.get()).b(paramBoolean);
      }
    }
    
    public void c()
    {
      MiLinkService localMiLinkService = (MiLinkService)this.a.get();
      if (localMiLinkService == null) {
        return;
      }
      localMiLinkService.stopSelf();
      MiLinkService.c(localMiLinkService);
    }
    
    public boolean d()
    {
      if (MiLinkService.a((MiLinkService)this.a.get()) != null) {
        return MiLinkService.a((MiLinkService)this.a.get()).c();
      }
      return false;
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/drone/droneconnection/connection/service/MiLinkService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */