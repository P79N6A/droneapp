package com.b.a.a.b.a;

import android.graphics.Bitmap;
import com.b.a.a.b.c;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;

public class b
  implements c
{
  private final c a;
  private final Comparator<String> b;
  
  public b(c paramc, Comparator<String> paramComparator)
  {
    this.a = paramc;
    this.b = paramComparator;
  }
  
  public Bitmap a(String paramString)
  {
    return this.a.a(paramString);
  }
  
  public Collection<String> a()
  {
    return this.a.a();
  }
  
  public boolean a(String paramString, Bitmap paramBitmap)
  {
    for (;;)
    {
      synchronized (this.a)
      {
        Iterator localIterator = this.a.a().iterator();
        if (localIterator.hasNext())
        {
          str = (String)localIterator.next();
          if (this.b.compare(paramString, str) != 0) {
            continue;
          }
          if (str != null) {
            this.a.b(str);
          }
          return this.a.a(paramString, paramBitmap);
        }
      }
      String str = null;
    }
  }
  
  public Bitmap b(String paramString)
  {
    return this.a.b(paramString);
  }
  
  public void b()
  {
    this.a.b();
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/b/a/a/b/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */