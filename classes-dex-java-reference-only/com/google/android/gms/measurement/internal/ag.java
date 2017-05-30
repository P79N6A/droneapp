package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.MainThread;
import com.google.android.gms.common.internal.d;

public final class ag
{
  static Boolean a;
  static Boolean b;
  private final a c;
  
  public ag(a parama)
  {
    d.a(parama);
    this.c = parama;
  }
  
  public static boolean a(Context paramContext, boolean paramBoolean)
  {
    d.a(paramContext);
    if ((a != null) && (!paramBoolean)) {
      return a.booleanValue();
    }
    if ((b != null) && (paramBoolean)) {
      return b.booleanValue();
    }
    if (paramBoolean) {}
    boolean bool;
    for (String str = "com.google.android.gms.measurement.PackageMeasurementReceiver";; str = "com.google.android.gms.measurement.AppMeasurementReceiver")
    {
      bool = m.a(paramContext, str, false);
      if (!paramBoolean) {
        break;
      }
      b = Boolean.valueOf(bool);
      return bool;
    }
    a = Boolean.valueOf(bool);
    return bool;
  }
  
  @MainThread
  public void a(Context paramContext, Intent paramIntent)
  {
    aj localaj = aj.a(paramContext);
    Object localObject1 = localaj.f();
    if (paramIntent == null) {
      ((ab)localObject1).z().a("Receiver called with null intent");
    }
    boolean bool2;
    label86:
    label159:
    label164:
    do
    {
      return;
      bool2 = localaj.d().N();
      localObject2 = paramIntent.getAction();
      boolean bool1;
      if (bool2)
      {
        ((ab)localObject1).E().a("Device receiver got", localObject2);
        if (!"com.google.android.gms.measurement.UPLOAD".equals(localObject2)) {
          continue;
        }
        if ((!bool2) || (localaj.D())) {
          break label159;
        }
        bool1 = true;
        f.a(paramContext, bool1);
        localObject1 = new Intent();
        if ((!bool2) || (localaj.D())) {
          break label164;
        }
      }
      for (paramIntent = "com.google.android.gms.measurement.PackageMeasurementService";; paramIntent = "com.google.android.gms.measurement.AppMeasurementService")
      {
        paramIntent = ((Intent)localObject1).setClassName(paramContext, paramIntent);
        paramIntent.setAction("com.google.android.gms.measurement.UPLOAD");
        this.c.a(paramContext, paramIntent);
        return;
        ((ab)localObject1).E().a("Local receiver got", localObject2);
        break;
        bool1 = false;
        break label86;
      }
    } while ((bool2) || (!"com.android.vending.INSTALL_REFERRER".equals(localObject2)));
    Object localObject2 = paramIntent.getStringExtra("referrer");
    if (localObject2 == null)
    {
      ((ab)localObject1).E().a("Install referrer extras are null");
      return;
    }
    localObject2 = Uri.parse((String)localObject2);
    localObject2 = localaj.o().a((Uri)localObject2);
    if (localObject2 == null)
    {
      ((ab)localObject1).E().a("No campaign defined in install referrer broadcast");
      return;
    }
    long l = 1000L * paramIntent.getLongExtra("referrer_timestamp_seconds", 0L);
    if (l == 0L) {
      ((ab)localObject1).z().a("Install referrer is missing timestamp");
    }
    localaj.h().a(new ag.1(this, localaj, l, (Bundle)localObject2, paramContext, (ab)localObject1));
  }
  
  public static abstract interface a
  {
    public abstract void a(Context paramContext, Intent paramIntent);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/measurement/internal/ag.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */