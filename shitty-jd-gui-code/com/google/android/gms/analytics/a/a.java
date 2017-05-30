package com.google.android.gms.analytics.a;

import com.google.android.gms.analytics.j;
import com.google.android.gms.analytics.n;
import com.google.android.gms.common.internal.d;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class a
{
  Map<String, String> a = new HashMap();
  
  public a a(double paramDouble)
  {
    a("pr", Double.toString(paramDouble));
    return this;
  }
  
  public a a(int paramInt)
  {
    a("ps", Integer.toString(paramInt));
    return this;
  }
  
  public a a(int paramInt1, int paramInt2)
  {
    a(j.m(paramInt1), Integer.toString(paramInt2));
    return this;
  }
  
  public a a(int paramInt, String paramString)
  {
    a(j.l(paramInt), paramString);
    return this;
  }
  
  public a a(String paramString)
  {
    a("id", paramString);
    return this;
  }
  
  void a(String paramString1, String paramString2)
  {
    d.a(paramString1, "Name should be non-null");
    this.a.put(paramString1, paramString2);
  }
  
  public a b(int paramInt)
  {
    a("qt", Integer.toString(paramInt));
    return this;
  }
  
  public a b(String paramString)
  {
    a("nm", paramString);
    return this;
  }
  
  public a c(String paramString)
  {
    a("br", paramString);
    return this;
  }
  
  public a d(String paramString)
  {
    a("ca", paramString);
    return this;
  }
  
  public a e(String paramString)
  {
    a("va", paramString);
    return this;
  }
  
  public a f(String paramString)
  {
    a("cc", paramString);
    return this;
  }
  
  public Map<String, String> g(String paramString)
  {
    HashMap localHashMap = new HashMap();
    Iterator localIterator = this.a.entrySet().iterator();
    if (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      String str1 = String.valueOf(paramString);
      String str2 = String.valueOf((String)localEntry.getKey());
      if (str2.length() != 0) {}
      for (str1 = str1.concat(str2);; str1 = new String(str1))
      {
        localHashMap.put(str1, (String)localEntry.getValue());
        break;
      }
    }
    return localHashMap;
  }
  
  public String toString()
  {
    return n.a(this.a);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/analytics/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */