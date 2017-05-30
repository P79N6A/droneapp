package com.google.android.gms.internal;

import android.graphics.Bitmap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

@aaa
public class acf
{
  Map<Integer, Bitmap> a = new ConcurrentHashMap();
  private AtomicInteger b = new AtomicInteger(0);
  
  public int a(Bitmap paramBitmap)
  {
    if (paramBitmap == null)
    {
      abr.a("Bitmap is null. Skipping putting into the Memory Map.");
      return -1;
    }
    this.a.put(Integer.valueOf(this.b.get()), paramBitmap);
    return this.b.getAndIncrement();
  }
  
  public Bitmap a(Integer paramInteger)
  {
    return (Bitmap)this.a.get(paramInteger);
  }
  
  public void b(Integer paramInteger)
  {
    this.a.remove(paramInteger);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/internal/acf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */