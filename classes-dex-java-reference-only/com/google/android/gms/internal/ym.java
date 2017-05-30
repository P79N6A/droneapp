package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.ac;
import com.google.android.gms.ads.internal.u;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.a;
import java.util.Map;

@aaa
public class ym
  extends yn
  implements vt
{
  DisplayMetrics a;
  int b = -1;
  int c = -1;
  int d = -1;
  int e = -1;
  int f = -1;
  int g = -1;
  private final acy h;
  private final Context i;
  private final WindowManager j;
  private final tx k;
  private float l;
  private int m;
  
  public ym(acy paramacy, Context paramContext, tx paramtx)
  {
    super(paramacy);
    this.h = paramacy;
    this.i = paramContext;
    this.k = paramtx;
    this.j = ((WindowManager)paramContext.getSystemService("window"));
  }
  
  private void g()
  {
    this.a = new DisplayMetrics();
    Display localDisplay = this.j.getDefaultDisplay();
    localDisplay.getMetrics(this.a);
    this.l = this.a.density;
    this.m = localDisplay.getRotation();
  }
  
  private void h()
  {
    int[] arrayOfInt = new int[2];
    this.h.getLocationOnScreen(arrayOfInt);
    a(ac.a().b(this.i, arrayOfInt[0]), ac.a().b(this.i, arrayOfInt[1]));
  }
  
  private yl i()
  {
    return new yl.a().b(this.k.a()).a(this.k.b()).c(this.k.f()).d(this.k.c()).e(this.k.d()).a();
  }
  
  void a()
  {
    this.b = ac.a().b(this.a, this.a.widthPixels);
    this.c = ac.a().b(this.a, this.a.heightPixels);
    Object localObject = this.h.f();
    if ((localObject == null) || (((Activity)localObject).getWindow() == null))
    {
      this.d = this.b;
      this.e = this.c;
      return;
    }
    localObject = u.e().a((Activity)localObject);
    this.d = ac.a().b(this.a, localObject[0]);
    this.e = ac.a().b(this.a, localObject[1]);
  }
  
  public void a(int paramInt1, int paramInt2)
  {
    if ((this.i instanceof Activity)) {}
    for (int n = u.e().d((Activity)this.i)[0];; n = 0)
    {
      if ((this.h.k() == null) || (!this.h.k().e))
      {
        this.f = ac.a().b(this.i, this.h.getMeasuredWidth());
        this.g = ac.a().b(this.i, this.h.getMeasuredHeight());
      }
      b(paramInt1, paramInt2 - n, this.f, this.g);
      this.h.l().a(paramInt1, paramInt2);
      return;
    }
  }
  
  public void a(acy paramacy, Map<String, String> paramMap)
  {
    c();
  }
  
  void b()
  {
    if (this.h.k().e)
    {
      this.f = this.b;
      this.g = this.c;
      return;
    }
    this.h.measure(0, 0);
  }
  
  public void c()
  {
    g();
    a();
    b();
    e();
    f();
    h();
    d();
  }
  
  void d()
  {
    if (abr.a(2)) {
      abr.c("Dispatching Ready Event.");
    }
    c(this.h.o().b);
  }
  
  void e()
  {
    a(this.b, this.c, this.d, this.e, this.l, this.m);
  }
  
  void f()
  {
    yl localyl = i();
    this.h.b("onDeviceFeaturesReceived", localyl.a());
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/internal/ym.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */