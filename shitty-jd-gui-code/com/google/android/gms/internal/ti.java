package com.google.android.gms.internal;

import android.content.Context;
import android.support.annotation.Nullable;
import android.view.View;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.formats.i;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.WeakHashMap;

@aaa
public class ti
  implements tj
{
  private final Object a = new Object();
  private final WeakHashMap<abi, tf> b = new WeakHashMap();
  private final ArrayList<tf> c = new ArrayList();
  private final Context d;
  private final VersionInfoParcel e;
  private final wx f;
  
  public ti(Context paramContext, VersionInfoParcel paramVersionInfoParcel, wx paramwx)
  {
    this.d = paramContext.getApplicationContext();
    this.e = paramVersionInfoParcel;
    this.f = paramwx;
  }
  
  public tf a(AdSizeParcel paramAdSizeParcel, abi paramabi)
  {
    return a(paramAdSizeParcel, paramabi, paramabi.b.b());
  }
  
  public tf a(AdSizeParcel paramAdSizeParcel, abi paramabi, View paramView)
  {
    return a(paramAdSizeParcel, paramabi, new tf.d(paramView, paramabi), null);
  }
  
  public tf a(AdSizeParcel paramAdSizeParcel, abi paramabi, View paramView, wy paramwy)
  {
    return a(paramAdSizeParcel, paramabi, new tf.d(paramView, paramabi), paramwy);
  }
  
  public tf a(AdSizeParcel paramAdSizeParcel, abi paramabi, i parami)
  {
    return a(paramAdSizeParcel, paramabi, new tf.a(parami), null);
  }
  
  public tf a(AdSizeParcel paramAdSizeParcel, abi paramabi, tm paramtm, @Nullable wy paramwy)
  {
    for (;;)
    {
      synchronized (this.a)
      {
        if (a(paramabi))
        {
          paramAdSizeParcel = (tf)this.b.get(paramabi);
          return paramAdSizeParcel;
        }
        if (paramwy != null)
        {
          paramAdSizeParcel = new tk(this.d, paramAdSizeParcel, paramabi, this.e, paramtm, paramwy);
          paramAdSizeParcel.a(this);
          this.b.put(paramabi, paramAdSizeParcel);
          this.c.add(paramAdSizeParcel);
          return paramAdSizeParcel;
        }
      }
      paramAdSizeParcel = new tl(this.d, paramAdSizeParcel, paramabi, this.e, paramtm, this.f);
    }
  }
  
  public void a(tf paramtf)
  {
    synchronized (this.a)
    {
      if (!paramtf.f())
      {
        this.c.remove(paramtf);
        Iterator localIterator = this.b.entrySet().iterator();
        while (localIterator.hasNext()) {
          if (((Map.Entry)localIterator.next()).getValue() == paramtf) {
            localIterator.remove();
          }
        }
      }
    }
  }
  
  public boolean a(abi paramabi)
  {
    for (;;)
    {
      synchronized (this.a)
      {
        paramabi = (tf)this.b.get(paramabi);
        if ((paramabi != null) && (paramabi.f()))
        {
          bool = true;
          return bool;
        }
      }
      boolean bool = false;
    }
  }
  
  public void b(abi paramabi)
  {
    synchronized (this.a)
    {
      paramabi = (tf)this.b.get(paramabi);
      if (paramabi != null) {
        paramabi.d();
      }
      return;
    }
  }
  
  public void c(abi paramabi)
  {
    synchronized (this.a)
    {
      paramabi = (tf)this.b.get(paramabi);
      if (paramabi != null) {
        paramabi.n();
      }
      return;
    }
  }
  
  public void d(abi paramabi)
  {
    synchronized (this.a)
    {
      paramabi = (tf)this.b.get(paramabi);
      if (paramabi != null) {
        paramabi.o();
      }
      return;
    }
  }
  
  public void e(abi paramabi)
  {
    synchronized (this.a)
    {
      paramabi = (tf)this.b.get(paramabi);
      if (paramabi != null) {
        paramabi.p();
      }
      return;
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/internal/ti.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */