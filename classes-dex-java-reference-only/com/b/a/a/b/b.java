package com.b.a.a.b;

import android.graphics.Bitmap;
import com.b.a.c.d;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class b
  extends a
{
  private static final int a = 16;
  private static final int b = 16777216;
  private final int c;
  private final AtomicInteger d;
  private final List<Bitmap> e = Collections.synchronizedList(new LinkedList());
  
  public b(int paramInt)
  {
    this.c = paramInt;
    this.d = new AtomicInteger();
    if (paramInt > 16777216) {
      d.c("You set too large memory cache size (more than %1$d Mb)", new Object[] { Integer.valueOf(16) });
    }
  }
  
  public boolean a(String paramString, Bitmap paramBitmap)
  {
    boolean bool = false;
    int j = b(paramBitmap);
    int k = c();
    int i = this.d.get();
    if (j < k)
    {
      while (i + j > k)
      {
        Bitmap localBitmap = d();
        if (this.e.remove(localBitmap)) {
          i = this.d.addAndGet(-b(localBitmap));
        }
      }
      this.e.add(paramBitmap);
      this.d.addAndGet(j);
      bool = true;
    }
    super.a(paramString, paramBitmap);
    return bool;
  }
  
  protected abstract int b(Bitmap paramBitmap);
  
  public Bitmap b(String paramString)
  {
    Bitmap localBitmap = super.a(paramString);
    if ((localBitmap != null) && (this.e.remove(localBitmap))) {
      this.d.addAndGet(-b(localBitmap));
    }
    return super.b(paramString);
  }
  
  public void b()
  {
    this.e.clear();
    this.d.set(0);
    super.b();
  }
  
  protected int c()
  {
    return this.c;
  }
  
  protected abstract Bitmap d();
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/b/a/a/b/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */