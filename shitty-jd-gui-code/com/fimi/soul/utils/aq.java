package com.fimi.soul.utils;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.util.LruCache;
import com.android.volley.toolbox.k.b;

@TargetApi(12)
public class aq
  implements k.b
{
  private static LruCache<String, Bitmap> a;
  private static aq b;
  
  public aq()
  {
    a = new LruCache((int)Runtime.getRuntime().maxMemory() / 8)
    {
      protected int a(String paramAnonymousString, Bitmap paramAnonymousBitmap)
      {
        return paramAnonymousBitmap.getRowBytes() * paramAnonymousBitmap.getHeight();
      }
    };
  }
  
  public static aq a()
  {
    if (b == null) {
      b = new aq();
    }
    return b;
  }
  
  public Bitmap a(String paramString)
  {
    return (Bitmap)a.get(paramString);
  }
  
  public void a(String paramString, int paramInt1, int paramInt2)
  {
    a.remove(b(paramString, paramInt1, paramInt2));
  }
  
  public void a(String paramString, Bitmap paramBitmap)
  {
    a.put(paramString, paramBitmap);
  }
  
  public String b(String paramString, int paramInt1, int paramInt2)
  {
    return paramString.length() + 12 + "#W" + paramInt1 + "#H" + paramInt2 + paramString;
  }
  
  public void b()
  {
    a.evictAll();
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/utils/aq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */