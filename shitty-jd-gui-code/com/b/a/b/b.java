package com.b.a.b;

import android.graphics.Bitmap;
import com.b.a.c.d;

final class b
  implements Runnable
{
  private static final String a = "Display image in ImageAware (loaded from %1$s) [%2$s]";
  private static final String b = "ImageAware is reused for another image. Task is cancelled. [%s]";
  private static final String c = "ImageAware was collected by GC. Task is cancelled. [%s]";
  private final Bitmap d;
  private final String e;
  private final com.b.a.b.e.a f;
  private final String g;
  private final com.b.a.b.c.a h;
  private final com.b.a.b.f.a i;
  private final f j;
  private final com.b.a.b.a.f k;
  
  public b(Bitmap paramBitmap, g paramg, f paramf, com.b.a.b.a.f paramf1)
  {
    this.d = paramBitmap;
    this.e = paramg.a;
    this.f = paramg.c;
    this.g = paramg.b;
    this.h = paramg.e.q();
    this.i = paramg.f;
    this.j = paramf;
    this.k = paramf1;
  }
  
  private boolean a()
  {
    String str = this.j.a(this.f);
    return !this.g.equals(str);
  }
  
  public void run()
  {
    if (this.f.e())
    {
      d.a("ImageAware was collected by GC. Task is cancelled. [%s]", new Object[] { this.g });
      this.i.b(this.e, this.f.d());
      return;
    }
    if (a())
    {
      d.a("ImageAware is reused for another image. Task is cancelled. [%s]", new Object[] { this.g });
      this.i.b(this.e, this.f.d());
      return;
    }
    d.a("Display image in ImageAware (loaded from %1$s) [%2$s]", new Object[] { this.k, this.g });
    this.h.a(this.d, this.f, this.k);
    this.j.b(this.f);
    this.i.a(this.e, this.f.d(), this.d);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/b/a/b/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */