package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.view.Window;
import android.webkit.WebChromeClient.CustomViewCallback;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.google.android.gms.ads.internal.InterstitialAdParameterParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.c.e;
import com.google.android.gms.c.f;
import com.google.android.gms.internal.aaa;
import com.google.android.gms.internal.abq;
import com.google.android.gms.internal.abr;
import com.google.android.gms.internal.abv;
import com.google.android.gms.internal.abw;
import com.google.android.gms.internal.aby;
import com.google.android.gms.internal.acf;
import com.google.android.gms.internal.acy;
import com.google.android.gms.internal.acz;
import com.google.android.gms.internal.acz.a;
import com.google.android.gms.internal.ada;
import com.google.android.gms.internal.ub;
import com.google.android.gms.internal.uf;
import com.google.android.gms.internal.yq.a;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.Future;

@aaa
public class d
  extends yq.a
  implements u
{
  static final int a = Color.argb(0, 0, 0, 0);
  AdOverlayInfoParcel b;
  acy c;
  c d;
  o e;
  boolean f = false;
  FrameLayout g;
  WebChromeClient.CustomViewCallback h;
  boolean i = false;
  boolean j = false;
  b k;
  boolean l = false;
  int m = 0;
  l n;
  private final Activity o;
  private final Object p = new Object();
  private Runnable q;
  private boolean r;
  private boolean s;
  private boolean t = false;
  private boolean u = false;
  private boolean v = true;
  
  public d(Activity paramActivity)
  {
    this.o = paramActivity;
    this.n = new s();
  }
  
  public void a()
  {
    this.m = 2;
    this.o.finish();
  }
  
  public void a(int paramInt)
  {
    this.o.setRequestedOrientation(paramInt);
  }
  
  public void a(int paramInt1, int paramInt2, Intent paramIntent) {}
  
  public void a(Bundle paramBundle)
  {
    boolean bool = false;
    this.o.requestWindowFeature(1);
    if (paramBundle != null) {
      bool = paramBundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false);
    }
    this.i = bool;
    try
    {
      this.b = AdOverlayInfoParcel.a(this.o.getIntent());
      if (this.b != null) {
        break label80;
      }
      throw new a("Could not get info for ad overlay.");
    }
    catch (a paramBundle)
    {
      abr.d(paramBundle.getMessage());
      this.m = 3;
      this.o.finish();
    }
    return;
    label80:
    if (this.b.n.d > 7500000) {
      this.m = 3;
    }
    if (this.o.getIntent() != null) {
      this.v = this.o.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true);
    }
    if (this.b.q != null)
    {
      this.j = this.b.q.b;
      label151:
      if ((((Boolean)uf.bA.c()).booleanValue()) && (this.j) && (this.b.q.g != -1)) {
        Future localFuture = (Future)new d(null).e();
      }
      if (paramBundle == null)
      {
        if ((this.b.d != null) && (this.v)) {
          this.b.d.e_();
        }
        if ((this.b.l != 1) && (this.b.c != null)) {
          this.b.c.e();
        }
      }
      this.k = new b(this.o, this.b.p);
      this.k.setId(1000);
      switch (this.b.l)
      {
      }
    }
    for (;;)
    {
      throw new a("Could not determine ad overlay type.");
      this.j = false;
      break label151;
      b(false);
      return;
      this.d = new c(this.b.e);
      b(false);
      return;
      b(true);
      return;
      if (this.i)
      {
        this.m = 3;
        this.o.finish();
        return;
      }
      if (com.google.android.gms.ads.internal.u.b().a(this.o, this.b.b, this.b.j)) {
        break;
      }
      this.m = 3;
      this.o.finish();
      return;
    }
  }
  
  public void a(View paramView, WebChromeClient.CustomViewCallback paramCustomViewCallback)
  {
    this.g = new FrameLayout(this.o);
    this.g.setBackgroundColor(-16777216);
    this.g.addView(paramView, -1, -1);
    this.o.setContentView(this.g);
    l();
    this.h = paramCustomViewCallback;
    this.f = true;
  }
  
  public void a(e parame)
  {
    if ((((Boolean)uf.cK.c()).booleanValue()) && (com.google.android.gms.common.util.s.m()))
    {
      parame = (Configuration)f.a(parame);
      if (com.google.android.gms.ads.internal.u.e().a(this.o, parame))
      {
        this.o.getWindow().addFlags(1024);
        this.o.getWindow().clearFlags(2048);
      }
    }
    else
    {
      return;
    }
    this.o.getWindow().addFlags(2048);
    this.o.getWindow().clearFlags(1024);
  }
  
  public void a(acy paramacy, Map<String, String> paramMap)
  {
    this.n.a(paramacy, paramMap);
  }
  
  public void a(boolean paramBoolean)
  {
    RelativeLayout.LayoutParams localLayoutParams;
    if (paramBoolean)
    {
      i1 = 50;
      this.e = new o(this.o, i1, this);
      localLayoutParams = new RelativeLayout.LayoutParams(-2, -2);
      localLayoutParams.addRule(10);
      if (!paramBoolean) {
        break label88;
      }
    }
    label88:
    for (int i1 = 11;; i1 = 9)
    {
      localLayoutParams.addRule(i1);
      this.e.a(paramBoolean, this.b.h);
      this.k.addView(this.e, localLayoutParams);
      return;
      i1 = 32;
      break;
    }
  }
  
  public void a(boolean paramBoolean1, boolean paramBoolean2)
  {
    if (this.e != null) {
      this.e.a(paramBoolean1, paramBoolean2);
    }
  }
  
  public void b()
  {
    if ((this.b != null) && (this.f)) {
      a(this.b.k);
    }
    if (this.g != null)
    {
      this.o.setContentView(this.k);
      l();
      this.g.removeAllViews();
      this.g = null;
    }
    if (this.h != null)
    {
      this.h.onCustomViewHidden();
      this.h = null;
    }
    this.f = false;
  }
  
  protected void b(int paramInt)
  {
    this.c.a(paramInt);
  }
  
  public void b(Bundle paramBundle)
  {
    paramBundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.i);
  }
  
  protected void b(boolean paramBoolean)
  {
    if (!this.s) {
      this.o.requestWindowFeature(1);
    }
    Object localObject = this.o.getWindow();
    if (localObject == null) {
      throw new a("Invalid activity, no window available.");
    }
    if ((com.google.android.gms.common.util.s.m()) && (((Boolean)uf.cK.c()).booleanValue())) {}
    for (boolean bool1 = com.google.android.gms.ads.internal.u.e().a(this.o, this.o.getResources().getConfiguration());; bool1 = true)
    {
      int i1;
      label159:
      boolean bool2;
      if ((this.b.q != null) && (this.b.q.c))
      {
        i1 = 1;
        if (((!this.j) || (i1 != 0)) && (bool1)) {
          ((Window)localObject).setFlags(1024, 1024);
        }
        acz localacz = this.b.e.l();
        if (localacz == null) {
          break label659;
        }
        bool1 = localacz.b();
        this.l = false;
        if (bool1)
        {
          if (this.b.k != com.google.android.gms.ads.internal.u.g().a()) {
            break label670;
          }
          if (this.o.getResources().getConfiguration().orientation != 1) {
            break label664;
          }
          bool2 = true;
          label204:
          this.l = bool2;
        }
        label210:
        bool2 = this.l;
        abr.a(46 + "Delay onShow to next orientation change: " + bool2);
        a(this.b.k);
        if (com.google.android.gms.ads.internal.u.g().a((Window)localObject)) {
          abr.a("Hardware acceleration on the AdActivity window enabled.");
        }
        if (this.j) {
          break label721;
        }
        this.k.setBackgroundColor(-16777216);
        label287:
        this.o.setContentView(this.k);
        l();
        if (!paramBoolean) {
          break label788;
        }
        this.c = com.google.android.gms.ads.internal.u.f().a(this.o, this.b.e.k(), true, bool1, null, this.b.n, null, null, this.b.e.h());
        this.c.l().a(null, null, this.b.f, this.b.j, true, this.b.o, null, this.b.e.l().a(), null, null);
        this.c.l().a(new acz.a()
        {
          public void a(acy paramAnonymousacy, boolean paramAnonymousBoolean)
          {
            paramAnonymousacy.d();
          }
        });
        if (this.b.m == null) {
          break label734;
        }
        this.c.loadUrl(this.b.m);
        label456:
        if (this.b.e != null) {
          this.b.e.b(this);
        }
        label479:
        this.c.a(this);
        localObject = this.c.getParent();
        if ((localObject != null) && ((localObject instanceof ViewGroup))) {
          ((ViewGroup)localObject).removeView(this.c.b());
        }
        if (this.j) {
          this.c.H();
        }
        this.k.addView(this.c.b(), -1, -1);
        if ((!paramBoolean) && (!this.l)) {
          q();
        }
        a(bool1);
        if (this.c.m()) {
          a(bool1, true);
        }
        localObject = this.c.h();
        if (localObject == null) {
          break label815;
        }
      }
      label659:
      label664:
      label670:
      label721:
      label734:
      label788:
      label815:
      for (localObject = ((com.google.android.gms.ads.internal.d)localObject).c;; localObject = null)
      {
        if (localObject == null) {
          break label821;
        }
        this.n = ((m)localObject).a(this.o, this.c, this.k);
        return;
        i1 = 0;
        break;
        bool1 = false;
        break label159;
        bool2 = false;
        break label204;
        if (this.b.k != com.google.android.gms.ads.internal.u.g().b()) {
          break label210;
        }
        if (this.o.getResources().getConfiguration().orientation == 2) {}
        for (bool2 = true;; bool2 = false)
        {
          this.l = bool2;
          break;
        }
        this.k.setBackgroundColor(a);
        break label287;
        if (this.b.i != null)
        {
          this.c.loadDataWithBaseURL(this.b.g, this.b.i, "text/html", "UTF-8", null);
          break label456;
        }
        throw new a("No URL or HTML to display in ad overlay.");
        this.c = this.b.e;
        this.c.a(this.o);
        break label479;
      }
      label821:
      abr.d("Appstreaming controller is null.");
      return;
    }
  }
  
  public void c()
  {
    this.m = 1;
    this.o.finish();
  }
  
  public void d()
  {
    this.m = 0;
  }
  
  public boolean e()
  {
    boolean bool1 = true;
    boolean bool2 = true;
    this.m = 0;
    if (this.c == null) {
      return bool2;
    }
    if ((this.c.t()) && (this.n.d())) {}
    for (;;)
    {
      bool2 = bool1;
      if (bool1) {
        break;
      }
      this.c.a("onbackblocked", Collections.emptyMap());
      return bool1;
      bool1 = false;
    }
  }
  
  public void f() {}
  
  public void g() {}
  
  public void h()
  {
    if ((this.b != null) && (this.b.l == 4))
    {
      if (this.i)
      {
        this.m = 3;
        this.o.finish();
      }
    }
    else
    {
      if (this.b.d != null) {
        this.b.d.g();
      }
      if ((this.c == null) || (this.c.r())) {
        break label107;
      }
      com.google.android.gms.ads.internal.u.g().b(this.c);
    }
    for (;;)
    {
      this.n.b();
      return;
      this.i = true;
      break;
      label107:
      abr.d("The webview does not exit. Ignoring action.");
    }
  }
  
  public void i()
  {
    this.n.a();
    b();
    if (this.b.d != null) {
      this.b.d.f_();
    }
    if ((this.c != null) && ((!this.o.isFinishing()) || (this.d == null))) {
      com.google.android.gms.ads.internal.u.g().a(this.c);
    }
    n();
  }
  
  public void j()
  {
    n();
  }
  
  public void k()
  {
    if (this.c != null) {
      this.k.removeView(this.c.b());
    }
    n();
  }
  
  public void l()
  {
    this.s = true;
  }
  
  public void m()
  {
    this.k.removeView(this.e);
    a(true);
  }
  
  protected void n()
  {
    if ((!this.o.isFinishing()) || (this.t)) {
      return;
    }
    this.t = true;
    if (this.c != null)
    {
      b(this.m);
      synchronized (this.p)
      {
        if ((!this.r) && (this.c.A()))
        {
          this.q = new Runnable()
          {
            public void run()
            {
              d.this.o();
            }
          };
          abv.a.postDelayed(this.q, ((Long)uf.au.c()).longValue());
          return;
        }
      }
    }
    o();
  }
  
  void o()
  {
    if (this.u) {
      return;
    }
    this.u = true;
    if (this.c != null)
    {
      this.k.removeView(this.c.b());
      if (this.d == null) {
        break label151;
      }
      this.c.a(this.d.d);
      this.c.a(false);
      this.d.c.addView(this.c.b(), this.d.a, this.d.b);
      this.d = null;
    }
    for (;;)
    {
      this.c = null;
      if ((this.b != null) && (this.b.d != null)) {
        this.b.d.d_();
      }
      this.n.c();
      return;
      label151:
      if (this.o.getApplicationContext() != null) {
        this.c.a(this.o.getApplicationContext());
      }
    }
  }
  
  public void p()
  {
    if (this.l)
    {
      this.l = false;
      q();
    }
  }
  
  protected void q()
  {
    this.c.d();
  }
  
  public void r()
  {
    this.k.a();
  }
  
  public void s()
  {
    synchronized (this.p)
    {
      this.r = true;
      if (this.q != null)
      {
        abv.a.removeCallbacks(this.q);
        abv.a.post(this.q);
      }
      return;
    }
  }
  
  @aaa
  private static final class a
    extends Exception
  {
    public a(String paramString)
    {
      super();
    }
  }
  
  @aaa
  static class b
    extends RelativeLayout
  {
    aby a;
    boolean b;
    
    public b(Context paramContext, String paramString)
    {
      super();
      this.a = new aby(paramContext, paramString);
    }
    
    void a()
    {
      this.b = true;
    }
    
    public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
    {
      if (!this.b) {
        this.a.a(paramMotionEvent);
      }
      return false;
    }
  }
  
  @aaa
  public static class c
  {
    public final int a;
    public final ViewGroup.LayoutParams b;
    public final ViewGroup c;
    public final Context d;
    
    public c(acy paramacy)
    {
      this.b = paramacy.getLayoutParams();
      ViewParent localViewParent = paramacy.getParent();
      this.d = paramacy.g();
      if ((localViewParent != null) && ((localViewParent instanceof ViewGroup)))
      {
        this.c = ((ViewGroup)localViewParent);
        this.a = this.c.indexOfChild(paramacy.b());
        this.c.removeView(paramacy.b());
        paramacy.a(true);
        return;
      }
      throw new d.a("Could not get the parent of the WebView for an overlay.");
    }
  }
  
  @aaa
  private class d
    extends abq
  {
    private d() {}
    
    public void a()
    {
      final Object localObject = com.google.android.gms.ads.internal.u.z().a(Integer.valueOf(d.this.b.q.g));
      if (localObject != null)
      {
        localObject = com.google.android.gms.ads.internal.u.g().a(d.a(d.this), (Bitmap)localObject, d.this.b.q.e, d.this.b.q.f);
        abv.a.post(new Runnable()
        {
          public void run()
          {
            d.a(d.this).getWindow().setBackgroundDrawable(localObject);
          }
        });
      }
    }
    
    public void b() {}
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/ads/internal/overlay/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */