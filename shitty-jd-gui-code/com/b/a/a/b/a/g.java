package com.b.a.a.b.a;

import android.graphics.Bitmap;
import com.b.a.a.b.b;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class g
  extends b
{
  private final Map<Bitmap, Integer> a = Collections.synchronizedMap(new HashMap());
  
  public g(int paramInt)
  {
    super(paramInt);
  }
  
  public Bitmap a(String paramString)
  {
    paramString = super.a(paramString);
    if (paramString != null)
    {
      Integer localInteger = (Integer)this.a.get(paramString);
      if (localInteger != null) {
        this.a.put(paramString, Integer.valueOf(localInteger.intValue() + 1));
      }
    }
    return paramString;
  }
  
  protected Reference<Bitmap> a(Bitmap paramBitmap)
  {
    return new WeakReference(paramBitmap);
  }
  
  public boolean a(String paramString, Bitmap paramBitmap)
  {
    boolean bool = false;
    if (super.a(paramString, paramBitmap))
    {
      this.a.put(paramBitmap, Integer.valueOf(0));
      bool = true;
    }
    return bool;
  }
  
  protected int b(Bitmap paramBitmap)
  {
    return paramBitmap.getRowBytes() * paramBitmap.getHeight();
  }
  
  public Bitmap b(String paramString)
  {
    Bitmap localBitmap = super.a(paramString);
    if (localBitmap != null) {
      this.a.remove(localBitmap);
    }
    return super.b(paramString);
  }
  
  public void b()
  {
    this.a.clear();
    super.b();
  }
  
  protected Bitmap d()
  {
    Bitmap localBitmap = null;
    Object localObject1 = this.a.entrySet();
    for (;;)
    {
      synchronized (this.a)
      {
        Iterator localIterator = ((Set)localObject1).iterator();
        localObject1 = null;
        if (localIterator.hasNext())
        {
          Map.Entry localEntry = (Map.Entry)localIterator.next();
          if (localBitmap == null)
          {
            localBitmap = (Bitmap)localEntry.getKey();
            localObject1 = (Integer)localEntry.getValue();
          }
          else
          {
            Integer localInteger = (Integer)localEntry.getValue();
            if (localInteger.intValue() < ((Integer)localObject1).intValue())
            {
              localBitmap = (Bitmap)localEntry.getKey();
              localObject1 = localInteger;
            }
          }
        }
        else
        {
          this.a.remove(localBitmap);
          return localBitmap;
        }
      }
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/b/a/a/b/a/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */