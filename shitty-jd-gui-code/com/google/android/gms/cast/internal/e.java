package com.google.android.gms.cast.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.JoinOptions;
import com.google.android.gms.cast.LaunchOptions;
import com.google.android.gms.cast.a.a;
import com.google.android.gms.cast.a.d;
import com.google.android.gms.cast.a.e;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.g.b;
import com.google.android.gms.common.api.g.c;
import com.google.android.gms.common.internal.BinderWrapper;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.common.internal.w;
import com.google.android.gms.internal.ahl.b;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

public class e
  extends w<j>
{
  private static final Object A = new Object();
  private static final Object B = new Object();
  private static final m a = new m("CastClientImpl");
  private ApplicationMetadata e;
  private final CastDevice f;
  private final a.d g;
  private final Map<String, a.e> h;
  private final long i;
  private b j;
  private String k;
  private boolean l;
  private boolean m;
  private boolean n;
  private boolean o;
  private double p;
  private int q;
  private int r;
  private final AtomicLong s;
  private String t;
  private String u;
  private Bundle v;
  private final Map<Long, ahl.b<Status>> w;
  private j x;
  private ahl.b<a.a> y;
  private ahl.b<Status> z;
  
  public e(Context paramContext, Looper paramLooper, s params, CastDevice paramCastDevice, long paramLong, a.d paramd, g.b paramb, g.c paramc)
  {
    super(paramContext, paramLooper, 10, params, paramb, paramc);
    this.f = paramCastDevice;
    this.g = paramd;
    this.i = paramLong;
    this.h = new HashMap();
    this.s = new AtomicLong(0L);
    this.w = new HashMap();
    K();
  }
  
  private void K()
  {
    this.o = false;
    this.q = -1;
    this.r = -1;
    this.e = null;
    this.k = null;
    this.p = 0.0D;
    this.l = false;
  }
  
  private void L()
  {
    a.b("removing all MessageReceivedCallbacks", new Object[0]);
    synchronized (this.h)
    {
      this.h.clear();
      return;
    }
  }
  
  private void a(ApplicationStatus paramApplicationStatus)
  {
    paramApplicationStatus = paramApplicationStatus.b();
    if (!f.a(paramApplicationStatus, this.k)) {
      this.k = paramApplicationStatus;
    }
    for (boolean bool = true;; bool = false)
    {
      a.b("hasChanged=%b, mFirstApplicationStatusUpdate=%b", new Object[] { Boolean.valueOf(bool), Boolean.valueOf(this.m) });
      if ((this.g != null) && ((bool) || (this.m))) {
        this.g.a();
      }
      this.m = false;
      return;
    }
  }
  
  private void a(DeviceStatus paramDeviceStatus)
  {
    ApplicationMetadata localApplicationMetadata = paramDeviceStatus.f();
    if (!f.a(localApplicationMetadata, this.e))
    {
      this.e = localApplicationMetadata;
      this.g.a(this.e);
    }
    double d = paramDeviceStatus.b();
    if ((!Double.isNaN(d)) && (Math.abs(d - this.p) > 1.0E-7D)) {
      this.p = d;
    }
    for (boolean bool1 = true;; bool1 = false)
    {
      boolean bool2 = paramDeviceStatus.c();
      if (bool2 != this.l)
      {
        this.l = bool2;
        bool1 = true;
      }
      a.b("hasVolumeChanged=%b, mFirstDeviceStatusUpdate=%b", new Object[] { Boolean.valueOf(bool1), Boolean.valueOf(this.n) });
      if ((this.g != null) && ((bool1) || (this.n))) {
        this.g.b();
      }
      int i1 = paramDeviceStatus.d();
      if (i1 != this.q) {
        this.q = i1;
      }
      for (bool1 = true;; bool1 = false)
      {
        a.b("hasActiveInputChanged=%b, mFirstDeviceStatusUpdate=%b", new Object[] { Boolean.valueOf(bool1), Boolean.valueOf(this.n) });
        if ((this.g != null) && ((bool1) || (this.n))) {
          this.g.b(this.q);
        }
        i1 = paramDeviceStatus.e();
        if (i1 != this.r) {
          this.r = i1;
        }
        for (bool1 = true;; bool1 = false)
        {
          a.b("hasStandbyStateChanged=%b, mFirstDeviceStatusUpdate=%b", new Object[] { Boolean.valueOf(bool1), Boolean.valueOf(this.n) });
          if ((this.g != null) && ((bool1) || (this.n))) {
            this.g.c(this.r);
          }
          this.n = false;
          return;
        }
      }
    }
  }
  
  private void b(ahl.b<a.a> paramb)
  {
    synchronized (A)
    {
      if (this.y != null) {
        this.y.a(new a(new Status(2002)));
      }
      this.y = paramb;
      return;
    }
  }
  
  private void c(ahl.b<Status> paramb)
  {
    synchronized (B)
    {
      if (this.z != null)
      {
        paramb.a(new Status(2001));
        return;
      }
      this.z = paramb;
      return;
    }
  }
  
  protected j a(IBinder paramIBinder)
  {
    return j.a.a(paramIBinder);
  }
  
  @NonNull
  protected String a()
  {
    return "com.google.android.gms.cast.service.BIND_CAST_DEVICE_CONTROLLER_SERVICE";
  }
  
  public void a(double paramDouble)
  {
    if ((Double.isInfinite(paramDouble)) || (Double.isNaN(paramDouble))) {
      throw new IllegalArgumentException(41 + "Volume cannot be " + paramDouble);
    }
    h().a(paramDouble, this.p, this.l);
  }
  
  protected void a(int paramInt1, IBinder paramIBinder, Bundle paramBundle, int paramInt2)
  {
    a.b("in onPostInitHandler; statusCode=%d", new Object[] { Integer.valueOf(paramInt1) });
    if ((paramInt1 == 0) || (paramInt1 == 1001))
    {
      this.o = true;
      this.m = true;
      this.n = true;
    }
    for (;;)
    {
      int i1 = paramInt1;
      if (paramInt1 == 1001)
      {
        this.v = new Bundle();
        this.v.putBoolean("com.google.android.gms.cast.EXTRA_APP_NO_LONGER_RUNNING", true);
        i1 = 0;
      }
      super.a(i1, paramIBinder, paramBundle, paramInt2);
      return;
      this.o = false;
    }
  }
  
  public void a(ConnectionResult paramConnectionResult)
  {
    super.a(paramConnectionResult);
    L();
  }
  
  public void a(ahl.b<Status> paramb)
  {
    c(paramb);
    h().b();
  }
  
  public void a(String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {
      throw new IllegalArgumentException("Channel namespace cannot be null or empty");
    }
    synchronized (this.h)
    {
      a.e locale = (a.e)this.h.remove(paramString);
      if (locale == null) {}
    }
  }
  
  public void a(String paramString, LaunchOptions paramLaunchOptions, ahl.b<a.a> paramb)
  {
    b(paramb);
    h().a(paramString, paramLaunchOptions);
  }
  
  public void a(String paramString, a.e parame)
  {
    f.a(paramString);
    a(paramString);
    if (parame != null) {}
    synchronized (this.h)
    {
      this.h.put(paramString, parame);
      h().b(paramString);
      return;
    }
  }
  
  public void a(String paramString, ahl.b<Status> paramb)
  {
    c(paramb);
    h().a(paramString);
  }
  
  public void a(String paramString1, String paramString2, JoinOptions paramJoinOptions, ahl.b<a.a> paramb)
  {
    b(paramb);
    paramb = paramJoinOptions;
    if (paramJoinOptions == null) {
      paramb = new JoinOptions();
    }
    h().a(paramString1, paramString2, paramb);
  }
  
  public void a(String paramString1, String paramString2, ahl.b<Status> paramb)
  {
    if (TextUtils.isEmpty(paramString2)) {
      throw new IllegalArgumentException("The message payload cannot be null or empty");
    }
    if (paramString2.length() > 65536) {
      throw new IllegalArgumentException("Message exceeds maximum size");
    }
    f.a(paramString1);
    p();
    long l1 = this.s.incrementAndGet();
    try
    {
      this.w.put(Long.valueOf(l1), paramb);
      h().a(paramString1, paramString2, l1);
      return;
    }
    catch (Throwable paramString1)
    {
      this.w.remove(Long.valueOf(l1));
      throw paramString1;
    }
  }
  
  public void a(String paramString, boolean paramBoolean, ahl.b<a.a> paramb)
  {
    LaunchOptions localLaunchOptions = new LaunchOptions();
    localLaunchOptions.a(paramBoolean);
    a(paramString, localLaunchOptions, paramb);
  }
  
  public void a(boolean paramBoolean)
  {
    h().a(paramBoolean, this.p, this.l);
  }
  
  @NonNull
  protected String b()
  {
    return "com.google.android.gms.cast.internal.ICastDeviceController";
  }
  
  protected Bundle c()
  {
    Bundle localBundle = new Bundle();
    a.b("getRemoteService(): mLastApplicationId=%s, mLastSessionId=%s", new Object[] { this.t, this.u });
    this.f.a(localBundle);
    localBundle.putLong("com.google.android.gms.cast.EXTRA_CAST_FLAGS", this.i);
    this.j = new b(this);
    localBundle.putParcelable("listener", new BinderWrapper(this.j.asBinder()));
    if (this.t != null)
    {
      localBundle.putString("last_application_id", this.t);
      if (this.u != null) {
        localBundle.putString("last_session_id", this.u);
      }
    }
    return localBundle;
  }
  
  /* Error */
  public void f()
  {
    // Byte code:
    //   0: getstatic 75	com/google/android/gms/cast/internal/e:a	Lcom/google/android/gms/cast/internal/m;
    //   3: ldc_w 464
    //   6: iconst_2
    //   7: anewarray 77	java/lang/Object
    //   10: dup
    //   11: iconst_0
    //   12: aload_0
    //   13: getfield 437	com/google/android/gms/cast/internal/e:j	Lcom/google/android/gms/cast/internal/e$b;
    //   16: aastore
    //   17: dup
    //   18: iconst_1
    //   19: aload_0
    //   20: invokevirtual 466	com/google/android/gms/cast/internal/e:t	()Z
    //   23: invokestatic 162	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   26: aastore
    //   27: invokevirtual 131	com/google/android/gms/cast/internal/m:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   30: aload_0
    //   31: getfield 437	com/google/android/gms/cast/internal/e:j	Lcom/google/android/gms/cast/internal/e$b;
    //   34: astore_1
    //   35: aload_0
    //   36: aconst_null
    //   37: putfield 437	com/google/android/gms/cast/internal/e:j	Lcom/google/android/gms/cast/internal/e$b;
    //   40: aload_1
    //   41: ifnull +10 -> 51
    //   44: aload_1
    //   45: invokevirtual 469	com/google/android/gms/cast/internal/e$b:a	()Lcom/google/android/gms/cast/internal/e;
    //   48: ifnonnull +17 -> 65
    //   51: getstatic 75	com/google/android/gms/cast/internal/e:a	Lcom/google/android/gms/cast/internal/m;
    //   54: ldc_w 471
    //   57: iconst_0
    //   58: anewarray 77	java/lang/Object
    //   61: invokevirtual 131	com/google/android/gms/cast/internal/m:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   64: return
    //   65: aload_0
    //   66: invokespecial 317	com/google/android/gms/cast/internal/e:L	()V
    //   69: aload_0
    //   70: invokevirtual 286	com/google/android/gms/cast/internal/e:h	()Lcom/google/android/gms/cast/internal/j;
    //   73: invokeinterface 472 1 0
    //   78: aload_0
    //   79: invokespecial 474	com/google/android/gms/common/internal/w:f	()V
    //   82: return
    //   83: astore_1
    //   84: getstatic 75	com/google/android/gms/cast/internal/e:a	Lcom/google/android/gms/cast/internal/m;
    //   87: aload_1
    //   88: ldc_w 476
    //   91: iconst_1
    //   92: anewarray 77	java/lang/Object
    //   95: dup
    //   96: iconst_0
    //   97: aload_1
    //   98: invokevirtual 479	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   101: aastore
    //   102: invokevirtual 346	com/google/android/gms/cast/internal/m:a	(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   105: aload_0
    //   106: invokespecial 474	com/google/android/gms/common/internal/w:f	()V
    //   109: return
    //   110: astore_1
    //   111: aload_0
    //   112: invokespecial 474	com/google/android/gms/common/internal/w:f	()V
    //   115: aload_1
    //   116: athrow
    //   117: astore_1
    //   118: goto -34 -> 84
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	121	0	this	e
    //   34	11	1	localb	b
    //   83	15	1	localRemoteException	android.os.RemoteException
    //   110	6	1	localObject	Object
    //   117	1	1	localIllegalStateException	IllegalStateException
    // Exception table:
    //   from	to	target	type
    //   69	78	83	android/os/RemoteException
    //   69	78	110	finally
    //   84	105	110	finally
    //   69	78	117	java/lang/IllegalStateException
  }
  
  public Bundle g()
  {
    if (this.v != null)
    {
      Bundle localBundle = this.v;
      this.v = null;
      return localBundle;
    }
    return super.g();
  }
  
  j h()
  {
    if (0 == 0) {
      return (j)super.G();
    }
    return this.x;
  }
  
  public void i()
  {
    h().c();
  }
  
  public double j()
  {
    p();
    return this.p;
  }
  
  public boolean k()
  {
    p();
    return this.l;
  }
  
  public int l()
  {
    p();
    return this.q;
  }
  
  public int m()
  {
    p();
    return this.r;
  }
  
  public ApplicationMetadata n()
  {
    p();
    return this.e;
  }
  
  public String o()
  {
    p();
    return this.k;
  }
  
  void p()
  {
    if ((!this.o) || (this.j == null) || (this.j.b())) {
      throw new IllegalStateException("Not connected to a device");
    }
  }
  
  static final class a
    implements a.a
  {
    private final Status a;
    private final ApplicationMetadata b;
    private final String c;
    private final String d;
    private final boolean e;
    
    public a(Status paramStatus)
    {
      this(paramStatus, null, null, null, false);
    }
    
    public a(Status paramStatus, ApplicationMetadata paramApplicationMetadata, String paramString1, String paramString2, boolean paramBoolean)
    {
      this.a = paramStatus;
      this.b = paramApplicationMetadata;
      this.c = paramString1;
      this.d = paramString2;
      this.e = paramBoolean;
    }
    
    public Status a()
    {
      return this.a;
    }
    
    public ApplicationMetadata b()
    {
      return this.b;
    }
    
    public String c()
    {
      return this.c;
    }
    
    public String d()
    {
      return this.d;
    }
    
    public boolean e()
    {
      return this.e;
    }
  }
  
  static class b
    extends k.a
  {
    private final AtomicReference<e> a;
    private final Handler b;
    
    public b(e parame)
    {
      this.a = new AtomicReference(parame);
      this.b = new Handler(parame.C());
    }
    
    private void a(e parame, long paramLong, int paramInt)
    {
      synchronized (e.f(parame))
      {
        parame = (ahl.b)e.f(parame).remove(Long.valueOf(paramLong));
        if (parame != null) {
          parame.a(new Status(paramInt));
        }
        return;
      }
    }
    
    private boolean a(e parame, int paramInt)
    {
      synchronized ()
      {
        if (e.g(parame) != null)
        {
          e.g(parame).a(new Status(paramInt));
          e.b(parame, null);
          return true;
        }
        return false;
      }
    }
    
    public e a()
    {
      e locale = (e)this.a.getAndSet(null);
      if (locale == null) {
        return null;
      }
      e.a(locale);
      return locale;
    }
    
    public void a(int paramInt)
    {
      e locale = a();
      if (locale == null) {}
      do
      {
        return;
        e.q().b("ICastDeviceControllerListener.onDisconnected: %d", new Object[] { Integer.valueOf(paramInt) });
      } while (paramInt == 0);
      locale.b(2);
    }
    
    public void a(ApplicationMetadata paramApplicationMetadata, String paramString1, String paramString2, boolean paramBoolean)
    {
      e locale = (e)this.a.get();
      if (locale == null) {
        return;
      }
      e.a(locale, paramApplicationMetadata);
      e.a(locale, paramApplicationMetadata.b());
      e.b(locale, paramString2);
      e.c(locale, paramString1);
      synchronized (e.r())
      {
        if (e.b(locale) != null)
        {
          e.b(locale).a(new e.a(new Status(0), paramApplicationMetadata, paramString1, paramString2, paramBoolean));
          e.a(locale, null);
        }
        return;
      }
    }
    
    public void a(final ApplicationStatus paramApplicationStatus)
    {
      final e locale = (e)this.a.get();
      if (locale == null) {
        return;
      }
      e.q().b("onApplicationStatusChanged", new Object[0]);
      this.b.post(new Runnable()
      {
        public void run()
        {
          e.a(locale, paramApplicationStatus);
        }
      });
    }
    
    public void a(final DeviceStatus paramDeviceStatus)
    {
      final e locale = (e)this.a.get();
      if (locale == null) {
        return;
      }
      e.q().b("onDeviceStatusChanged", new Object[0]);
      this.b.post(new Runnable()
      {
        public void run()
        {
          e.a(locale, paramDeviceStatus);
        }
      });
    }
    
    public void a(String paramString, double paramDouble, boolean paramBoolean)
    {
      e.q().b("Deprecated callback: \"onStatusreceived\"", new Object[0]);
    }
    
    public void a(String paramString, long paramLong)
    {
      paramString = (e)this.a.get();
      if (paramString == null) {
        return;
      }
      a(paramString, paramLong, 0);
    }
    
    public void a(String paramString, long paramLong, int paramInt)
    {
      paramString = (e)this.a.get();
      if (paramString == null) {
        return;
      }
      a(paramString, paramLong, paramInt);
    }
    
    public void a(final String paramString1, final String paramString2)
    {
      final e locale = (e)this.a.get();
      if (locale == null) {
        return;
      }
      e.q().b("Receive (type=text, ns=%s) %s", new Object[] { paramString1, paramString2 });
      this.b.post(new Runnable()
      {
        public void run()
        {
          synchronized (e.d(locale))
          {
            a.e locale = (a.e)e.d(locale).get(paramString1);
            if (locale != null)
            {
              locale.a(e.e(locale), paramString1, paramString2);
              return;
            }
          }
          e.q().b("Discarded message for unknown namespace '%s'", new Object[] { paramString1 });
        }
      });
    }
    
    public void a(String paramString, byte[] paramArrayOfByte)
    {
      if ((e)this.a.get() == null) {
        return;
      }
      e.q().b("IGNORING: Receive (type=binary, ns=%s) <%d bytes>", new Object[] { paramString, Integer.valueOf(paramArrayOfByte.length) });
    }
    
    public void b(int paramInt)
    {
      e locale = (e)this.a.get();
      if (locale == null) {
        return;
      }
      synchronized (e.r())
      {
        if (e.b(locale) != null)
        {
          e.b(locale).a(new e.a(new Status(paramInt)));
          e.a(locale, null);
        }
        return;
      }
    }
    
    public boolean b()
    {
      return this.a.get() == null;
    }
    
    public void c(int paramInt)
    {
      e locale = (e)this.a.get();
      if (locale == null) {
        return;
      }
      a(locale, paramInt);
    }
    
    public void d(int paramInt)
    {
      e locale = (e)this.a.get();
      if (locale == null) {
        return;
      }
      a(locale, paramInt);
    }
    
    public void e(final int paramInt)
    {
      final e locale = (e)this.a.get();
      if (locale == null) {}
      do
      {
        return;
        e.a(locale, null);
        e.b(locale, null);
        a(locale, paramInt);
      } while (e.c(locale) == null);
      this.b.post(new Runnable()
      {
        public void run()
        {
          e.c(locale).a(paramInt);
        }
      });
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/cast/internal/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */