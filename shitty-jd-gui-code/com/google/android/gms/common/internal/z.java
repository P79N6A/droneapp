package com.google.android.gms.common.internal;

import android.annotation.TargetApi;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.IBinder;
import android.os.Message;
import com.google.android.gms.common.stats.b;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

final class z
  extends y
  implements Handler.Callback
{
  private final HashMap<a, b> a = new HashMap();
  private final Context b;
  private final Handler c;
  private final b d;
  private final long e;
  
  z(Context paramContext)
  {
    this.b = paramContext.getApplicationContext();
    this.c = new Handler(paramContext.getMainLooper(), this);
    this.d = b.a();
    this.e = 5000L;
  }
  
  private boolean a(a parama, ServiceConnection paramServiceConnection, String paramString)
  {
    d.a(paramServiceConnection, "ServiceConnection must not be null");
    for (;;)
    {
      b localb;
      synchronized (this.a)
      {
        localb = (b)this.a.get(parama);
        if (localb == null)
        {
          localb = new b(parama);
          localb.a(paramServiceConnection, paramString);
          localb.a(paramString);
          this.a.put(parama, localb);
          parama = localb;
          boolean bool = parama.a();
          return bool;
        }
        this.c.removeMessages(0, localb);
        if (localb.a(paramServiceConnection))
        {
          parama = String.valueOf(parama);
          throw new IllegalStateException(String.valueOf(parama).length() + 81 + "Trying to bind a GmsServiceConnection that was already connected before.  config=" + parama);
        }
      }
      localb.a(paramServiceConnection, paramString);
      switch (localb.b())
      {
      case 1: 
        paramServiceConnection.onServiceConnected(localb.e(), localb.d());
        parama = localb;
        break;
      case 2: 
        localb.a(paramString);
        parama = localb;
        break;
      default: 
        parama = localb;
      }
    }
  }
  
  private void b(a parama, ServiceConnection paramServiceConnection, String paramString)
  {
    d.a(paramServiceConnection, "ServiceConnection must not be null");
    b localb;
    synchronized (this.a)
    {
      localb = (b)this.a.get(parama);
      if (localb == null)
      {
        parama = String.valueOf(parama);
        throw new IllegalStateException(String.valueOf(parama).length() + 50 + "Nonexistent connection status for service config: " + parama);
      }
    }
    if (!localb.a(paramServiceConnection))
    {
      parama = String.valueOf(parama);
      throw new IllegalStateException(String.valueOf(parama).length() + 76 + "Trying to unbind a GmsServiceConnection  that was not bound before.  config=" + parama);
    }
    localb.b(paramServiceConnection, paramString);
    if (localb.c())
    {
      parama = this.c.obtainMessage(0, localb);
      this.c.sendMessageDelayed(parama, this.e);
    }
  }
  
  public boolean a(ComponentName paramComponentName, ServiceConnection paramServiceConnection, String paramString)
  {
    return a(new a(paramComponentName), paramServiceConnection, paramString);
  }
  
  public boolean a(String paramString1, String paramString2, ServiceConnection paramServiceConnection, String paramString3)
  {
    return a(new a(paramString1, paramString2), paramServiceConnection, paramString3);
  }
  
  public void b(ComponentName paramComponentName, ServiceConnection paramServiceConnection, String paramString)
  {
    b(new a(paramComponentName), paramServiceConnection, paramString);
  }
  
  public void b(String paramString1, String paramString2, ServiceConnection paramServiceConnection, String paramString3)
  {
    b(new a(paramString1, paramString2), paramServiceConnection, paramString3);
  }
  
  public boolean handleMessage(Message arg1)
  {
    switch (???.what)
    {
    default: 
      return false;
    }
    b localb = (b)???.obj;
    synchronized (this.a)
    {
      if (localb.c())
      {
        if (localb.a()) {
          localb.b("GmsClientSupervisor");
        }
        this.a.remove(b.a(localb));
      }
      return true;
    }
  }
  
  private static final class a
  {
    private final String a;
    private final String b;
    private final ComponentName c;
    
    public a(ComponentName paramComponentName)
    {
      this.a = null;
      this.b = null;
      this.c = ((ComponentName)d.a(paramComponentName));
    }
    
    public a(String paramString1, String paramString2)
    {
      this.a = d.a(paramString1);
      this.b = d.a(paramString2);
      this.c = null;
    }
    
    public Intent a()
    {
      if (this.a != null) {
        return new Intent(this.a).setPackage(this.b);
      }
      return new Intent().setComponent(this.c);
    }
    
    public boolean equals(Object paramObject)
    {
      if (this == paramObject) {}
      do
      {
        return true;
        if (!(paramObject instanceof a)) {
          return false;
        }
        paramObject = (a)paramObject;
      } while ((c.a(this.a, ((a)paramObject).a)) && (c.a(this.c, ((a)paramObject).c)));
      return false;
    }
    
    public int hashCode()
    {
      return c.a(new Object[] { this.a, this.c });
    }
    
    public String toString()
    {
      if (this.a == null) {
        return this.c.flattenToString();
      }
      return this.a;
    }
  }
  
  private final class b
  {
    private final a b;
    private final Set<ServiceConnection> c;
    private int d;
    private boolean e;
    private IBinder f;
    private final z.a g;
    private ComponentName h;
    
    public b(z.a parama)
    {
      this.g = parama;
      this.b = new a();
      this.c = new HashSet();
      this.d = 2;
    }
    
    public void a(ServiceConnection paramServiceConnection, String paramString)
    {
      z.c(z.this).a(z.b(z.this), paramServiceConnection, paramString, this.g.a());
      this.c.add(paramServiceConnection);
    }
    
    @TargetApi(14)
    public void a(String paramString)
    {
      this.d = 3;
      this.e = z.c(z.this).a(z.b(z.this), paramString, this.g.a(), this.b, 129);
      if (!this.e) {
        this.d = 2;
      }
      try
      {
        z.c(z.this).a(z.b(z.this), this.b);
        return;
      }
      catch (IllegalArgumentException paramString) {}
    }
    
    public boolean a()
    {
      return this.e;
    }
    
    public boolean a(ServiceConnection paramServiceConnection)
    {
      return this.c.contains(paramServiceConnection);
    }
    
    public int b()
    {
      return this.d;
    }
    
    public void b(ServiceConnection paramServiceConnection, String paramString)
    {
      z.c(z.this).b(z.b(z.this), paramServiceConnection);
      this.c.remove(paramServiceConnection);
    }
    
    public void b(String paramString)
    {
      z.c(z.this).a(z.b(z.this), this.b);
      this.e = false;
      this.d = 2;
    }
    
    public boolean c()
    {
      return this.c.isEmpty();
    }
    
    public IBinder d()
    {
      return this.f;
    }
    
    public ComponentName e()
    {
      return this.h;
    }
    
    public class a
      implements ServiceConnection
    {
      public a() {}
      
      public void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
      {
        synchronized (z.a(z.this))
        {
          z.b.a(z.b.this, paramIBinder);
          z.b.a(z.b.this, paramComponentName);
          Iterator localIterator = z.b.b(z.b.this).iterator();
          if (localIterator.hasNext()) {
            ((ServiceConnection)localIterator.next()).onServiceConnected(paramComponentName, paramIBinder);
          }
        }
        z.b.a(z.b.this, 1);
      }
      
      public void onServiceDisconnected(ComponentName paramComponentName)
      {
        synchronized (z.a(z.this))
        {
          z.b.a(z.b.this, null);
          z.b.a(z.b.this, paramComponentName);
          Iterator localIterator = z.b.b(z.b.this).iterator();
          if (localIterator.hasNext()) {
            ((ServiceConnection)localIterator.next()).onServiceDisconnected(paramComponentName);
          }
        }
        z.b.a(z.b.this, 2);
      }
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/common/internal/z.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */