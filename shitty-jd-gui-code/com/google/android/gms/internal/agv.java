package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IBinder.DeathRecipient;
import android.os.Looper;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.d.b;
import com.google.android.gms.cast.internal.m;
import com.google.android.gms.common.api.g.b;
import com.google.android.gms.common.api.g.c;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.common.internal.w;

public class agv
  extends w<agx>
  implements IBinder.DeathRecipient
{
  private static final m a = new m("CastRemoteDisplayClientImpl");
  private d.b e;
  private CastDevice f;
  private Bundle g;
  
  public agv(Context paramContext, Looper paramLooper, s params, CastDevice paramCastDevice, Bundle paramBundle, d.b paramb, g.b paramb1, g.c paramc)
  {
    super(paramContext, paramLooper, 83, params, paramb1, paramc);
    a.b("instance created", new Object[0]);
    this.e = paramb;
    this.f = paramCastDevice;
    this.g = paramBundle;
  }
  
  public agx a(IBinder paramIBinder)
  {
    return agx.a.a(paramIBinder);
  }
  
  protected String a()
  {
    return "com.google.android.gms.cast.remote_display.service.START";
  }
  
  public void a(agw paramagw)
  {
    a.b("stopRemoteDisplay", new Object[0]);
    ((agx)G()).a(paramagw);
  }
  
  public void a(agw paramagw, int paramInt)
  {
    ((agx)G()).a(paramagw, paramInt);
  }
  
  public void a(agw paramagw, agy paramagy, String paramString)
  {
    a.b("startRemoteDisplay", new Object[0]);
    paramagy = new agv.1(this, paramagy);
    ((agx)G()).a(paramagw, paramagy, this.f.b(), paramString, this.g);
  }
  
  protected String b()
  {
    return "com.google.android.gms.cast.remote_display.ICastRemoteDisplayService";
  }
  
  public void binderDied() {}
  
  /* Error */
  public void f()
  {
    // Byte code:
    //   0: getstatic 27	com/google/android/gms/internal/agv:a	Lcom/google/android/gms/cast/internal/m;
    //   3: ldc 97
    //   5: iconst_0
    //   6: anewarray 36	java/lang/Object
    //   9: invokevirtual 40	com/google/android/gms/cast/internal/m:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   12: aload_0
    //   13: aconst_null
    //   14: putfield 42	com/google/android/gms/internal/agv:e	Lcom/google/android/gms/cast/d$b;
    //   17: aload_0
    //   18: aconst_null
    //   19: putfield 44	com/google/android/gms/internal/agv:f	Lcom/google/android/gms/cast/CastDevice;
    //   22: aload_0
    //   23: invokevirtual 64	com/google/android/gms/internal/agv:G	()Landroid/os/IInterface;
    //   26: checkcast 66	com/google/android/gms/internal/agx
    //   29: invokeinterface 99 1 0
    //   34: aload_0
    //   35: invokespecial 101	com/google/android/gms/common/internal/w:f	()V
    //   38: return
    //   39: astore_1
    //   40: aload_0
    //   41: invokespecial 101	com/google/android/gms/common/internal/w:f	()V
    //   44: return
    //   45: astore_1
    //   46: aload_0
    //   47: invokespecial 101	com/google/android/gms/common/internal/w:f	()V
    //   50: aload_1
    //   51: athrow
    //   52: astore_1
    //   53: goto -13 -> 40
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	56	0	this	agv
    //   39	1	1	localRemoteException	android.os.RemoteException
    //   45	6	1	localObject	Object
    //   52	1	1	localIllegalStateException	IllegalStateException
    // Exception table:
    //   from	to	target	type
    //   22	34	39	android/os/RemoteException
    //   22	34	45	finally
    //   22	34	52	java/lang/IllegalStateException
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/internal/agv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */