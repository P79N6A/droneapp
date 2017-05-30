package com.google.android.gms.ads.internal.formats;

import android.support.v4.util.SimpleArrayMap;
import com.google.android.gms.ads.internal.util.client.b;
import com.google.android.gms.internal.aaa;
import com.google.android.gms.internal.uu;
import com.google.android.gms.internal.vd.a;
import java.util.Arrays;
import java.util.List;

@aaa
public class f
  extends vd.a
  implements i.a
{
  private final a a;
  private final String b;
  private final SimpleArrayMap<String, c> c;
  private final SimpleArrayMap<String, String> d;
  private final Object e = new Object();
  private i f;
  
  public f(String paramString, SimpleArrayMap<String, c> paramSimpleArrayMap, SimpleArrayMap<String, String> paramSimpleArrayMap1, a parama)
  {
    this.b = paramString;
    this.c = paramSimpleArrayMap;
    this.d = paramSimpleArrayMap1;
    this.a = parama;
  }
  
  public String a(String paramString)
  {
    return (String)this.d.get(paramString);
  }
  
  public List<String> a()
  {
    int n = 0;
    String[] arrayOfString = new String[this.c.size() + this.d.size()];
    int j = 0;
    int i = 0;
    int k;
    int m;
    for (;;)
    {
      k = n;
      m = i;
      if (j >= this.c.size()) {
        break;
      }
      arrayOfString[i] = ((String)this.c.keyAt(j));
      i += 1;
      j += 1;
    }
    while (k < this.d.size())
    {
      arrayOfString[m] = ((String)this.d.keyAt(k));
      k += 1;
      m += 1;
    }
    return Arrays.asList(arrayOfString);
  }
  
  public void a(i parami)
  {
    synchronized (this.e)
    {
      this.f = parami;
      return;
    }
  }
  
  public uu b(String paramString)
  {
    return (uu)this.c.get(paramString);
  }
  
  public void b()
  {
    synchronized (this.e)
    {
      if (this.f == null)
      {
        b.b("Attempt to perform recordImpression before ad initialized.");
        return;
      }
      this.f.a();
      return;
    }
  }
  
  public void c(String paramString)
  {
    synchronized (this.e)
    {
      if (this.f == null)
      {
        b.b("Attempt to call performClick before ad initialized.");
        return;
      }
      this.f.a(null, paramString, null, null, null);
      return;
    }
  }
  
  public String k()
  {
    return "3";
  }
  
  public String l()
  {
    return this.b;
  }
  
  public a m()
  {
    return this.a;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/ads/internal/formats/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */