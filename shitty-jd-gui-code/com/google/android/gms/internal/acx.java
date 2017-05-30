package com.google.android.gms.internal;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import com.google.android.gms.ads.internal.overlay.k;
import com.google.android.gms.common.internal.d;

@aaa
public class acx
{
  private final acy a;
  private final Context b;
  private final ViewGroup c;
  private k d;
  
  public acx(Context paramContext, ViewGroup paramViewGroup, acy paramacy)
  {
    this(paramContext, paramViewGroup, paramacy, null);
  }
  
  acx(Context paramContext, ViewGroup paramViewGroup, acy paramacy, k paramk)
  {
    this.b = paramContext;
    this.c = paramViewGroup;
    this.a = paramacy;
    this.d = paramk;
  }
  
  public k a()
  {
    d.b("getAdVideoUnderlay must be called from the UI thread.");
    return this.d;
  }
  
  public void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    d.b("The underlay may only be modified from the UI thread.");
    if (this.d != null) {
      this.d.a(paramInt1, paramInt2, paramInt3, paramInt4);
    }
  }
  
  public void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, boolean paramBoolean)
  {
    if (this.d != null) {
      return;
    }
    uj.a(this.a.y().a(), this.a.x(), new String[] { "vpr2" });
    this.d = new k(this.b, this.a, paramInt5, paramBoolean, this.a.y().a());
    this.c.addView(this.d, 0, new ViewGroup.LayoutParams(-1, -1));
    this.d.a(paramInt1, paramInt2, paramInt3, paramInt4);
    this.a.l().a(false);
  }
  
  public void b()
  {
    d.b("onPause must be called from the UI thread.");
    if (this.d != null) {
      this.d.h();
    }
  }
  
  public void c()
  {
    d.b("onDestroy must be called from the UI thread.");
    if (this.d != null)
    {
      this.d.m();
      this.c.removeView(this.d);
      this.d = null;
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/internal/acx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */