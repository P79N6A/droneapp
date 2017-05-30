package com.mining.app.zxing.a;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.hardware.Camera;
import android.os.Build.VERSION;
import android.os.Handler;
import android.util.Log;
import android.view.SurfaceHolder;
import java.io.IOException;

public final class c
{
  static final int a;
  private static final String b = c.class.getSimpleName();
  private static final int c = 240;
  private static final int d = 240;
  private static final int e = 480;
  private static final int f = 360;
  private static c g;
  private final Context h;
  private final b i;
  private Camera j;
  private Rect k;
  private Rect l;
  private Rect m;
  private boolean n;
  private boolean o;
  private final boolean p;
  private final f q;
  private final a r;
  private int s;
  
  static
  {
    try
    {
      i1 = Integer.parseInt(Build.VERSION.SDK);
      a = i1;
      return;
    }
    catch (NumberFormatException localNumberFormatException)
    {
      for (;;)
      {
        int i1 = 10000;
      }
    }
  }
  
  private c(Context paramContext)
  {
    this.h = paramContext;
    this.i = new b(paramContext);
    if (Integer.parseInt(Build.VERSION.SDK) > 3) {}
    for (boolean bool = true;; bool = false)
    {
      this.p = bool;
      this.q = new f(this.i, this.p);
      this.r = new a();
      return;
    }
  }
  
  public static c a()
  {
    return g;
  }
  
  public static void a(Context paramContext)
  {
    if (g == null) {
      g = new c(paramContext);
    }
  }
  
  public int a(int paramInt)
  {
    return paramInt * 58 / 108;
  }
  
  public e a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    Rect localRect = f();
    int i1 = this.i.c();
    String str = this.i.d();
    switch (i1)
    {
    default: 
      if ("yuv420p".equals(str)) {
        return new e(paramArrayOfByte, paramInt1, paramInt2, localRect.left, localRect.top, localRect.width(), localRect.height());
      }
      break;
    case 16: 
    case 17: 
      return new e(paramArrayOfByte, paramInt1, paramInt2, localRect.left, localRect.top, localRect.width(), localRect.height());
    }
    throw new IllegalArgumentException("Unsupported picture format: " + i1 + '/' + str);
  }
  
  public void a(Handler paramHandler, int paramInt)
  {
    if ((this.j != null) && (this.o))
    {
      this.q.a(paramHandler, paramInt);
      if (this.p) {
        this.j.setOneShotPreviewCallback(this.q);
      }
    }
    else
    {
      return;
    }
    this.j.setPreviewCallback(this.q);
  }
  
  public void a(SurfaceHolder paramSurfaceHolder)
  {
    if (this.j == null)
    {
      this.j = Camera.open();
      if (this.j == null) {
        throw new IOException();
      }
      this.j.setPreviewDisplay(paramSurfaceHolder);
      if (!this.n)
      {
        this.n = true;
        this.i.a(this.j);
      }
      this.i.b(this.j);
      d.b();
    }
  }
  
  public int b(int paramInt)
  {
    return paramInt * 42 / 192;
  }
  
  public void b()
  {
    if (this.j != null)
    {
      d.b();
      this.j.release();
      this.j = null;
    }
  }
  
  public void b(Handler paramHandler, int paramInt)
  {
    if ((this.j != null) && (this.o))
    {
      this.r.a(paramHandler, paramInt);
      this.j.autoFocus(this.r);
    }
  }
  
  public void c()
  {
    if ((this.j != null) && (!this.o))
    {
      this.j.startPreview();
      this.o = true;
    }
  }
  
  public void d()
  {
    if ((this.j != null) && (this.o))
    {
      if (!this.p) {
        this.j.setPreviewCallback(null);
      }
      this.j.stopPreview();
      this.q.a(null, 0);
      this.r.a(null, 0);
      this.o = false;
    }
  }
  
  public Rect e()
  {
    Point localPoint = this.i.b();
    if (this.k == null)
    {
      if (this.j == null) {
        return null;
      }
      int i1 = a(localPoint.x);
      this.s = b(localPoint.y);
      int i2 = (localPoint.x - i1) / 2;
      int i3 = (localPoint.y - this.s - i1) / 2;
      this.k = new Rect(i2, i3, i2 + i1, i1 + i3);
      Log.d(b, "Calculated framing rect: " + this.k);
    }
    return this.k;
  }
  
  public Rect f()
  {
    if (this.m == null)
    {
      Rect localRect = new Rect(e());
      Point localPoint1 = this.i.a();
      Point localPoint2 = this.i.b();
      localRect.left = (localRect.left * localPoint1.y / localPoint2.x);
      localRect.right = (localRect.right * localPoint1.y / localPoint2.x);
      localRect.top = (localRect.top * localPoint1.x / localPoint2.y);
      int i1 = localRect.bottom;
      localRect.bottom = (localPoint1.x * i1 / localPoint2.y);
      this.m = localRect;
    }
    return this.m;
  }
  
  public Context g()
  {
    return this.h;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/mining/app/zxing/a/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */