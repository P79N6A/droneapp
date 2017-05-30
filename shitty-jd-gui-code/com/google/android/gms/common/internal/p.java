package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.support.annotation.BinderThread;
import android.support.annotation.CallSuper;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.WorkerThread;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.j;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class p<T extends IInterface>
{
  public static final String[] d = { "service_esmobile", "service_googleme" };
  private int a;
  final Handler b;
  protected AtomicInteger c = new AtomicInteger(0);
  private long e;
  private long f;
  private int g;
  private long h;
  private final Context i;
  private final Looper j;
  private final y k;
  private final j l;
  private final Object m = new Object();
  private final Object n = new Object();
  private ag o;
  private f p;
  private T q;
  private final ArrayList<e<?>> r = new ArrayList();
  private h s;
  private int t = 1;
  private final b u;
  private final c v;
  private final int w;
  private final String x;
  
  protected p(Context paramContext, Looper paramLooper, int paramInt, b paramb, c paramc, String paramString)
  {
    this(paramContext, paramLooper, y.a(paramContext), j.b(), paramInt, (b)d.a(paramb), (c)d.a(paramc), paramString);
  }
  
  protected p(Context paramContext, Looper paramLooper, y paramy, j paramj, int paramInt, b paramb, c paramc, String paramString)
  {
    this.i = ((Context)d.a(paramContext, "Context must not be null"));
    this.j = ((Looper)d.a(paramLooper, "Looper must not be null"));
    this.k = ((y)d.a(paramy, "Supervisor must not be null"));
    this.l = ((j)d.a(paramj, "API availability must not be null"));
    this.b = new d(paramLooper);
    this.w = paramInt;
    this.u = paramb;
    this.v = paramc;
    this.x = paramString;
  }
  
  private boolean a(int paramInt1, int paramInt2, T paramT)
  {
    synchronized (this.m)
    {
      if (this.t != paramInt1) {
        return false;
      }
      b(paramInt2, paramT);
      return true;
    }
  }
  
  private void b(int paramInt, T paramT)
  {
    boolean bool = true;
    int i1;
    int i2;
    if (paramInt == 3)
    {
      i1 = 1;
      if (paramT == null) {
        break label120;
      }
      i2 = 1;
      label17:
      if (i1 != i2) {
        break label126;
      }
    }
    for (;;)
    {
      d.b(bool);
      for (;;)
      {
        synchronized (this.m)
        {
          this.t = paramInt;
          this.q = paramT;
          a(paramInt, paramT);
          switch (paramInt)
          {
          case 2: 
            return;
            h();
          }
        }
        a(paramT);
        continue;
        i();
      }
      i1 = 0;
      break;
      label120:
      i2 = 0;
      break label17;
      label126:
      bool = false;
    }
  }
  
  private void h()
  {
    String str1;
    String str2;
    if (this.s != null)
    {
      str1 = String.valueOf(a());
      str2 = String.valueOf(y());
      Log.e("GmsClient", String.valueOf(str1).length() + 70 + String.valueOf(str2).length() + "Calling connect() while still connected, missing disconnect() for " + str1 + " on " + str2);
      this.k.b(a(), y(), this.s, z());
      this.c.incrementAndGet();
    }
    this.s = new h(this.c.get());
    if (!this.k.a(a(), y(), this.s, z()))
    {
      str1 = String.valueOf(a());
      str2 = String.valueOf(y());
      Log.e("GmsClient", String.valueOf(str1).length() + 34 + String.valueOf(str2).length() + "unable to connect to service: " + str1 + " on " + str2);
      a(16, null, this.c.get());
    }
  }
  
  private void i()
  {
    if (this.s != null)
    {
      this.k.b(a(), y(), this.s, z());
      this.s = null;
    }
  }
  
  public void A()
  {
    int i1 = this.l.a(this.i);
    if (i1 != 0)
    {
      b(1, null);
      this.p = new i();
      this.b.sendMessage(this.b.obtainMessage(3, this.c.get(), i1));
      return;
    }
    a(new i());
  }
  
  public final Context B()
  {
    return this.i;
  }
  
  public final Looper C()
  {
    return this.j;
  }
  
  public Account D()
  {
    return null;
  }
  
  public final Account E()
  {
    if (D() != null) {
      return D();
    }
    return new Account("<<default account>>", "com.google");
  }
  
  protected final void F()
  {
    if (!t()) {
      throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
    }
  }
  
  public final T G()
  {
    synchronized (this.m)
    {
      if (this.t == 4) {
        throw new DeadObjectException();
      }
    }
    F();
    if (this.q != null) {}
    for (boolean bool = true;; bool = false)
    {
      d.a(bool, "Client is connected but service is null");
      IInterface localIInterface = this.q;
      return localIInterface;
    }
  }
  
  public boolean H()
  {
    return false;
  }
  
  protected Set<Scope> I()
  {
    return Collections.EMPTY_SET;
  }
  
  @NonNull
  protected abstract String a();
  
  @CallSuper
  protected void a(int paramInt)
  {
    this.a = paramInt;
    this.e = System.currentTimeMillis();
  }
  
  protected void a(int paramInt1, @Nullable Bundle paramBundle, int paramInt2)
  {
    this.b.sendMessage(this.b.obtainMessage(5, paramInt2, -1, new k(paramInt1, paramBundle)));
  }
  
  @BinderThread
  protected void a(int paramInt1, IBinder paramIBinder, Bundle paramBundle, int paramInt2)
  {
    this.b.sendMessage(this.b.obtainMessage(1, paramInt2, -1, new j(paramInt1, paramIBinder, paramBundle)));
  }
  
  void a(int paramInt, T paramT) {}
  
  @CallSuper
  protected void a(@NonNull T paramT)
  {
    this.f = System.currentTimeMillis();
  }
  
  @CallSuper
  protected void a(ConnectionResult paramConnectionResult)
  {
    this.g = paramConnectionResult.c();
    this.h = System.currentTimeMillis();
  }
  
  @WorkerThread
  public void a(ac arg1, Set<Scope> paramSet)
  {
    try
    {
      Object localObject = c();
      localObject = new GetServiceRequest(this.w).a(this.i.getPackageName()).a((Bundle)localObject);
      if (paramSet != null) {
        ((GetServiceRequest)localObject).a(paramSet);
      }
      if (v()) {
        ((GetServiceRequest)localObject).a(E()).a(???);
      }
      return;
    }
    catch (DeadObjectException ???)
    {
      synchronized (this.n)
      {
        while (this.o != null)
        {
          this.o.a(new g(this, this.c.get()), (GetServiceRequest)localObject);
          return;
          if (H())
          {
            ((GetServiceRequest)localObject).a(D());
            continue;
            ??? = ???;
            Log.w("GmsClient", "service died");
            b(1);
            return;
          }
        }
        Log.w("GmsClient", "mServiceBroker is null, client disconnected");
      }
    }
    catch (RemoteException ???)
    {
      Log.w("GmsClient", "Remote exception occurred", ???);
    }
  }
  
  public void a(@NonNull f paramf)
  {
    this.p = ((f)d.a(paramf, "Connection progress callbacks cannot be null."));
    b(2, null);
  }
  
  public void a(f paramf, ConnectionResult paramConnectionResult)
  {
    this.p = ((f)d.a(paramf, "Connection progress callbacks cannot be null."));
    this.b.sendMessage(this.b.obtainMessage(3, this.c.get(), paramConnectionResult.c(), paramConnectionResult.d()));
  }
  
  public void a(String paramString, FileDescriptor arg2, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    for (;;)
    {
      synchronized (this.m)
      {
        int i1 = this.t;
        paramArrayOfString = this.q;
        paramPrintWriter.append(paramString).append("mConnectState=");
        switch (i1)
        {
        default: 
          paramPrintWriter.print("UNKNOWN");
          paramPrintWriter.append(" mService=");
          if (paramArrayOfString != null) {
            break label482;
          }
          paramPrintWriter.println("null");
          ??? = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
          long l1;
          String str;
          if (this.f > 0L)
          {
            paramArrayOfString = paramPrintWriter.append(paramString).append("lastConnectedTime=");
            l1 = this.f;
            str = String.valueOf(???.format(new Date(this.f)));
            paramArrayOfString.println(String.valueOf(str).length() + 21 + l1 + " " + str);
          }
          if (this.e > 0L) {
            paramPrintWriter.append(paramString).append("lastSuspendedCause=");
          }
          switch (this.a)
          {
          default: 
            paramPrintWriter.append(String.valueOf(this.a));
            paramArrayOfString = paramPrintWriter.append(" lastSuspendedTime=");
            l1 = this.e;
            str = String.valueOf(???.format(new Date(this.e)));
            paramArrayOfString.println(String.valueOf(str).length() + 21 + l1 + " " + str);
            if (this.h > 0L)
            {
              paramPrintWriter.append(paramString).append("lastFailedStatus=").append(f.b(this.g));
              paramString = paramPrintWriter.append(" lastFailedTime=");
              l1 = this.h;
              ??? = String.valueOf(???.format(new Date(this.h)));
              paramString.println(String.valueOf(???).length() + 21 + l1 + " " + ???);
            }
            return;
          }
          break;
        }
      }
      paramPrintWriter.print("CONNECTING");
      continue;
      paramPrintWriter.print("CONNECTED");
      continue;
      paramPrintWriter.print("DISCONNECTING");
      continue;
      paramPrintWriter.print("DISCONNECTED");
      continue;
      label482:
      paramPrintWriter.append(b()).append("@").println(Integer.toHexString(System.identityHashCode(paramArrayOfString.asBinder())));
      continue;
      paramPrintWriter.append("CAUSE_SERVICE_DISCONNECTED");
      continue;
      paramPrintWriter.append("CAUSE_NETWORK_LOST");
    }
  }
  
  @Nullable
  protected abstract T b(IBinder paramIBinder);
  
  @NonNull
  protected abstract String b();
  
  public void b(int paramInt)
  {
    this.b.sendMessage(this.b.obtainMessage(4, this.c.get(), paramInt));
  }
  
  protected Bundle c()
  {
    return new Bundle();
  }
  
  public Intent e()
  {
    throw new UnsupportedOperationException("Not a sign in API");
  }
  
  public void f()
  {
    this.c.incrementAndGet();
    synchronized (this.r)
    {
      int i2 = this.r.size();
      int i1 = 0;
      while (i1 < i2)
      {
        ((e)this.r.get(i1)).e();
        i1 += 1;
      }
      this.r.clear();
    }
    synchronized (this.n)
    {
      this.o = null;
      b(1, null);
      return;
      localObject2 = finally;
      throw ((Throwable)localObject2);
    }
  }
  
  public Bundle g()
  {
    return null;
  }
  
  public boolean h_()
  {
    return false;
  }
  
  public boolean t()
  {
    for (;;)
    {
      synchronized (this.m)
      {
        if (this.t == 3)
        {
          bool = true;
          return bool;
        }
      }
      boolean bool = false;
    }
  }
  
  public boolean u()
  {
    for (;;)
    {
      synchronized (this.m)
      {
        if (this.t == 2)
        {
          bool = true;
          return bool;
        }
      }
      boolean bool = false;
    }
  }
  
  public boolean v()
  {
    return false;
  }
  
  public boolean w()
  {
    return true;
  }
  
  @Nullable
  public IBinder x()
  {
    synchronized (this.n)
    {
      if (this.o == null) {
        return null;
      }
      IBinder localIBinder = this.o.asBinder();
      return localIBinder;
    }
  }
  
  protected String y()
  {
    return "com.google.android.gms";
  }
  
  @Nullable
  protected final String z()
  {
    if (this.x == null) {
      return this.i.getClass().getName();
    }
    return this.x;
  }
  
  private abstract class a
    extends p.e<Boolean>
  {
    public final int a;
    public final Bundle b;
    
    @BinderThread
    protected a(int paramInt, Bundle paramBundle)
    {
      super(Boolean.valueOf(true));
      this.a = paramInt;
      this.b = paramBundle;
    }
    
    protected abstract void a(ConnectionResult paramConnectionResult);
    
    protected void a(Boolean paramBoolean)
    {
      Object localObject = null;
      if (paramBoolean == null) {
        p.a(p.this, 1, null);
      }
      do
      {
        return;
        switch (this.a)
        {
        default: 
          p.a(p.this, 1, null);
          paramBoolean = (Boolean)localObject;
          if (this.b != null) {
            paramBoolean = (PendingIntent)this.b.getParcelable("pendingIntent");
          }
          a(new ConnectionResult(this.a, paramBoolean));
          return;
        }
      } while (a());
      p.a(p.this, 1, null);
      a(new ConnectionResult(8, null));
      return;
      p.a(p.this, 1, null);
      throw new IllegalStateException("A fatal developer error has occurred. Check the logs for further information.");
    }
    
    protected abstract boolean a();
    
    protected void b() {}
  }
  
  public static abstract interface b
  {
    public abstract void a(int paramInt);
    
    public abstract void a(@Nullable Bundle paramBundle);
  }
  
  public static abstract interface c
  {
    public abstract void a(@NonNull ConnectionResult paramConnectionResult);
  }
  
  final class d
    extends Handler
  {
    public d(Looper paramLooper)
    {
      super();
    }
    
    private void a(Message paramMessage)
    {
      paramMessage = (p.e)paramMessage.obj;
      paramMessage.b();
      paramMessage.d();
    }
    
    private boolean b(Message paramMessage)
    {
      return (paramMessage.what == 2) || (paramMessage.what == 1) || (paramMessage.what == 5);
    }
    
    public void handleMessage(Message paramMessage)
    {
      PendingIntent localPendingIntent = null;
      if (p.this.c.get() != paramMessage.arg1)
      {
        if (b(paramMessage)) {
          a(paramMessage);
        }
        return;
      }
      if (((paramMessage.what == 1) || (paramMessage.what == 5)) && (!p.this.u()))
      {
        a(paramMessage);
        return;
      }
      if (paramMessage.what == 3)
      {
        if ((paramMessage.obj instanceof PendingIntent)) {
          localPendingIntent = (PendingIntent)paramMessage.obj;
        }
        paramMessage = new ConnectionResult(paramMessage.arg2, localPendingIntent);
        p.b(p.this).a(paramMessage);
        p.this.a(paramMessage);
        return;
      }
      if (paramMessage.what == 4)
      {
        p.a(p.this, 4, null);
        if (p.c(p.this) != null) {
          p.c(p.this).a(paramMessage.arg2);
        }
        p.this.a(paramMessage.arg2);
        p.a(p.this, 4, 1, null);
        return;
      }
      if ((paramMessage.what == 2) && (!p.this.t()))
      {
        a(paramMessage);
        return;
      }
      if (b(paramMessage))
      {
        ((p.e)paramMessage.obj).c();
        return;
      }
      int i = paramMessage.what;
      Log.wtf("GmsClient", 45 + "Don't know how to handle message: " + i, new Exception());
    }
  }
  
  protected abstract class e<TListener>
  {
    private TListener a;
    private boolean b;
    
    public e()
    {
      Object localObject;
      this.a = localObject;
      this.b = false;
    }
    
    protected abstract void a(TListener paramTListener);
    
    protected abstract void b();
    
    public void c()
    {
      for (;;)
      {
        try
        {
          Object localObject1 = this.a;
          if (this.b)
          {
            String str = String.valueOf(this);
            Log.w("GmsClient", String.valueOf(str).length() + 47 + "Callback proxy " + str + " being reused. This is not safe.");
          }
          if (localObject1 != null) {}
          b();
        }
        finally
        {
          try
          {
            a(localObject1);
          }
          catch (RuntimeException localRuntimeException)
          {
            b();
            throw localRuntimeException;
          }
          try
          {
            this.b = true;
            d();
            return;
          }
          finally {}
          localObject2 = finally;
        }
      }
    }
    
    public void d()
    {
      e();
      synchronized (p.d(p.this))
      {
        p.d(p.this).remove(this);
        return;
      }
    }
    
    public void e()
    {
      try
      {
        this.a = null;
        return;
      }
      finally {}
    }
  }
  
  public static abstract interface f
  {
    public abstract void a(@NonNull ConnectionResult paramConnectionResult);
  }
  
  public static final class g
    extends af.a
  {
    private p a;
    private final int b;
    
    public g(@NonNull p paramp, int paramInt)
    {
      this.a = paramp;
      this.b = paramInt;
    }
    
    private void a()
    {
      this.a = null;
    }
    
    @BinderThread
    public void a(int paramInt, @Nullable Bundle paramBundle)
    {
      Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
    }
    
    @BinderThread
    public void a(int paramInt, @NonNull IBinder paramIBinder, @Nullable Bundle paramBundle)
    {
      d.a(this.a, "onPostInitComplete can be called only once per call to getRemoteService");
      this.a.a(paramInt, paramIBinder, paramBundle, this.b);
      a();
    }
  }
  
  public final class h
    implements ServiceConnection
  {
    private final int b;
    
    public h(int paramInt)
    {
      this.b = paramInt;
    }
    
    public void onServiceConnected(ComponentName arg1, IBinder paramIBinder)
    {
      d.a(paramIBinder, "Expecting a valid IBinder");
      synchronized (p.a(p.this))
      {
        p.a(p.this, ag.a.a(paramIBinder));
        p.this.a(0, null, this.b);
        return;
      }
    }
    
    public void onServiceDisconnected(ComponentName arg1)
    {
      synchronized (p.a(p.this))
      {
        p.a(p.this, null);
        p.this.b.sendMessage(p.this.b.obtainMessage(4, this.b, 1));
        return;
      }
    }
  }
  
  protected class i
    implements p.f
  {
    public i() {}
    
    public void a(@NonNull ConnectionResult paramConnectionResult)
    {
      if (paramConnectionResult.b()) {
        p.this.a(null, p.this.I());
      }
      while (p.e(p.this) == null) {
        return;
      }
      p.e(p.this).a(paramConnectionResult);
    }
  }
  
  protected final class j
    extends p.a
  {
    public final IBinder e;
    
    @BinderThread
    public j(int paramInt, IBinder paramIBinder, Bundle paramBundle)
    {
      super(paramInt, paramBundle);
      this.e = paramIBinder;
    }
    
    protected void a(ConnectionResult paramConnectionResult)
    {
      if (p.e(p.this) != null) {
        p.e(p.this).a(paramConnectionResult);
      }
      p.this.a(paramConnectionResult);
    }
    
    protected boolean a()
    {
      do
      {
        try
        {
          String str1 = this.e.getInterfaceDescriptor();
          if (!p.this.b().equals(str1))
          {
            String str2 = String.valueOf(p.this.b());
            Log.e("GmsClient", String.valueOf(str2).length() + 34 + String.valueOf(str1).length() + "service descriptor mismatch: " + str2 + " vs. " + str1);
            return false;
          }
        }
        catch (RemoteException localRemoteException)
        {
          Log.w("GmsClient", "service probably died");
          return false;
        }
        localObject = p.this.b(this.e);
      } while ((localObject == null) || (!p.a(p.this, 2, 3, (IInterface)localObject)));
      Object localObject = p.this.g();
      if (p.c(p.this) != null) {
        p.c(p.this).a((Bundle)localObject);
      }
      return true;
    }
  }
  
  protected final class k
    extends p.a
  {
    @BinderThread
    public k(int paramInt, @Nullable Bundle paramBundle)
    {
      super(paramInt, paramBundle);
    }
    
    protected void a(ConnectionResult paramConnectionResult)
    {
      p.b(p.this).a(paramConnectionResult);
      p.this.a(paramConnectionResult);
    }
    
    protected boolean a()
    {
      p.b(p.this).a(ConnectionResult.v);
      return true;
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/common/internal/p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */