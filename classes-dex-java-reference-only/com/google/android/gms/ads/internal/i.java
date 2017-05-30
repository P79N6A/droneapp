package com.google.android.gms.ads.internal;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.ads.internal.client.ac;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.a;
import com.google.android.gms.internal.aaa;
import com.google.android.gms.internal.abr;
import com.google.android.gms.internal.abu;
import com.google.android.gms.internal.oq;
import com.google.android.gms.internal.rn;
import com.google.android.gms.internal.ub;
import com.google.android.gms.internal.uf;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

@aaa
class i
  implements oq, Runnable
{
  CountDownLatch a = new CountDownLatch(1);
  private final List<Object[]> b = new Vector();
  private final AtomicReference<oq> c = new AtomicReference();
  private v d;
  
  public i(v paramv)
  {
    this.d = paramv;
    if (ac.a().b())
    {
      abu.a(this);
      return;
    }
    run();
  }
  
  private Context b(Context paramContext)
  {
    if (!((Boolean)uf.n.c()).booleanValue()) {}
    Context localContext;
    do
    {
      return paramContext;
      localContext = paramContext.getApplicationContext();
    } while (localContext == null);
    return localContext;
  }
  
  private void b()
  {
    if (this.b.isEmpty()) {
      return;
    }
    Iterator localIterator = this.b.iterator();
    while (localIterator.hasNext())
    {
      Object[] arrayOfObject = (Object[])localIterator.next();
      if (arrayOfObject.length == 1) {
        ((oq)this.c.get()).a((MotionEvent)arrayOfObject[0]);
      } else if (arrayOfObject.length == 3) {
        ((oq)this.c.get()).a(((Integer)arrayOfObject[0]).intValue(), ((Integer)arrayOfObject[1]).intValue(), ((Integer)arrayOfObject[2]).intValue());
      }
    }
    this.b.clear();
  }
  
  protected oq a(String paramString, Context paramContext, boolean paramBoolean)
  {
    return rn.a(paramString, paramContext, paramBoolean);
  }
  
  public String a(Context paramContext)
  {
    if (a())
    {
      oq localoq = (oq)this.c.get();
      if (localoq != null)
      {
        b();
        return localoq.a(b(paramContext));
      }
    }
    return "";
  }
  
  public String a(Context paramContext, String paramString, View paramView)
  {
    if (a())
    {
      oq localoq = (oq)this.c.get();
      if (localoq != null)
      {
        b();
        return localoq.a(b(paramContext), paramString, paramView);
      }
    }
    return "";
  }
  
  public void a(int paramInt1, int paramInt2, int paramInt3)
  {
    oq localoq = (oq)this.c.get();
    if (localoq != null)
    {
      b();
      localoq.a(paramInt1, paramInt2, paramInt3);
      return;
    }
    this.b.add(new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
  }
  
  public void a(MotionEvent paramMotionEvent)
  {
    oq localoq = (oq)this.c.get();
    if (localoq != null)
    {
      b();
      localoq.a(paramMotionEvent);
      return;
    }
    this.b.add(new Object[] { paramMotionEvent });
  }
  
  protected void a(oq paramoq)
  {
    this.c.set(paramoq);
  }
  
  protected boolean a()
  {
    try
    {
      this.a.await();
      return true;
    }
    catch (InterruptedException localInterruptedException)
    {
      abr.d("Interrupted during GADSignals creation.", localInterruptedException);
    }
    return false;
  }
  
  public void run()
  {
    label94:
    for (;;)
    {
      try
      {
        if (((Boolean)uf.F.c()).booleanValue()) {
          if (this.d.e.e)
          {
            break label94;
            a(a(this.d.e.b, b(this.d.c), bool));
          }
          else
          {
            bool = false;
            continue;
          }
        }
        boolean bool = true;
      }
      finally
      {
        this.a.countDown();
        this.d = null;
      }
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/ads/internal/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */