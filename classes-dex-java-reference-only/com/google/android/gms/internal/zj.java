package com.google.android.gms.internal;

import android.content.Context;
import android.os.Handler;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.ads.internal.u;
import com.google.android.gms.common.internal.d;
import java.util.concurrent.atomic.AtomicBoolean;

@aaa
public abstract class zj
  implements abx<Void>, acz.a
{
  protected final zn.a a;
  protected final Context b;
  protected final acy c;
  protected final abi.a d;
  protected AdResponseParcel e;
  protected final Object f = new Object();
  private Runnable g;
  private AtomicBoolean h = new AtomicBoolean(true);
  
  protected zj(Context paramContext, abi.a parama, acy paramacy, zn.a parama1)
  {
    this.b = paramContext;
    this.d = parama;
    this.e = this.d.b;
    this.c = paramacy;
    this.a = parama1;
  }
  
  private abi b(int paramInt)
  {
    AdRequestInfoParcel localAdRequestInfoParcel = this.d.a;
    return new abi(localAdRequestInfoParcel.c, this.c, this.e.d, paramInt, this.e.f, this.e.j, this.e.l, this.e.k, localAdRequestInfoParcel.i, this.e.h, null, null, null, null, null, this.e.i, this.d.d, this.e.g, this.d.f, this.e.n, this.e.o, this.d.h, null, this.e.C, this.e.D, this.e.E, this.e.F, this.e.G, null, this.e.J, this.e.N);
  }
  
  public final Void a()
  {
    d.b("Webview render task needs to be called on UI thread.");
    this.g = new zj.1(this);
    abv.a.postDelayed(this.g, ((Long)uf.aY.c()).longValue());
    b();
    return null;
  }
  
  protected void a(int paramInt)
  {
    if (paramInt != -2) {
      this.e = new AdResponseParcel(paramInt, this.e.k);
    }
    this.c.e();
    this.a.b(b(paramInt));
  }
  
  public void a(acy paramacy, boolean paramBoolean)
  {
    int i = 0;
    abr.a("WebView finished loading.");
    if (!this.h.getAndSet(false)) {
      return;
    }
    if (paramBoolean) {
      i = c();
    }
    a(i);
    abv.a.removeCallbacks(this.g);
  }
  
  protected abstract void b();
  
  protected int c()
  {
    return -2;
  }
  
  public void d()
  {
    if (!this.h.getAndSet(false)) {
      return;
    }
    this.c.stopLoading();
    u.g().a(this.c);
    a(-1);
    abv.a.removeCallbacks(this.g);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/internal/zj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */