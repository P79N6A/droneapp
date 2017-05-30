package com.b.a.a.b.a;

import android.graphics.Bitmap;
import com.b.a.a.b.c;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class e
  implements c
{
  private final c a;
  private final long b;
  private final Map<String, Long> c = Collections.synchronizedMap(new HashMap());
  
  public e(c paramc, long paramLong)
  {
    this.a = paramc;
    this.b = (1000L * paramLong);
  }
  
  public Bitmap a(String paramString)
  {
    Long localLong = (Long)this.c.get(paramString);
    if ((localLong != null) && (System.currentTimeMillis() - localLong.longValue() > this.b))
    {
      this.a.b(paramString);
      this.c.remove(paramString);
    }
    return this.a.a(paramString);
  }
  
  public Collection<String> a()
  {
    return this.a.a();
  }
  
  public boolean a(String paramString, Bitmap paramBitmap)
  {
    boolean bool = this.a.a(paramString, paramBitmap);
    if (bool) {
      this.c.put(paramString, Long.valueOf(System.currentTimeMillis()));
    }
    return bool;
  }
  
  public Bitmap b(String paramString)
  {
    this.c.remove(paramString);
    return this.a.b(paramString);
  }
  
  public void b()
  {
    this.a.b();
    this.c.clear();
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/b/a/a/b/a/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */