package com.b.a.b;

import android.graphics.Bitmap;
import android.os.Handler;
import com.b.a.b.g.a;
import com.b.a.c.d;

final class i
  implements Runnable
{
  private static final String a = "PostProcess image before displaying [%s]";
  private final f b;
  private final Bitmap c;
  private final g d;
  private final Handler e;
  
  public i(f paramf, Bitmap paramBitmap, g paramg, Handler paramHandler)
  {
    this.b = paramf;
    this.c = paramBitmap;
    this.d = paramg;
    this.e = paramHandler;
  }
  
  public void run()
  {
    d.a("PostProcess image before displaying [%s]", new Object[] { this.d.b });
    h.a(new b(this.d.e.p().a(this.c), this.d, this.b, com.b.a.b.a.f.c), this.d.e.s(), this.e, this.b);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/b/a/b/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */