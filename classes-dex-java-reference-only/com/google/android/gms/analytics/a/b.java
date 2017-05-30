package com.google.android.gms.analytics.a;

import com.google.android.gms.analytics.n;
import com.google.android.gms.common.internal.d;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class b
{
  public static final String a = "detail";
  public static final String b = "click";
  public static final String c = "add";
  public static final String d = "remove";
  public static final String e = "checkout";
  public static final String f = "checkout_option";
  @Deprecated
  public static final String g = "checkout_options";
  public static final String h = "purchase";
  public static final String i = "refund";
  Map<String, String> j = new HashMap();
  
  public b(String paramString)
  {
    a("&pa", paramString);
  }
  
  public b a(double paramDouble)
  {
    a("&tr", Double.toString(paramDouble));
    return this;
  }
  
  public b a(int paramInt)
  {
    a("&cos", Integer.toString(paramInt));
    return this;
  }
  
  public b a(String paramString)
  {
    a("&ti", paramString);
    return this;
  }
  
  public Map<String, String> a()
  {
    return new HashMap(this.j);
  }
  
  void a(String paramString1, String paramString2)
  {
    d.a(paramString1, "Name should be non-null");
    this.j.put(paramString1, paramString2);
  }
  
  public b b(double paramDouble)
  {
    a("&tt", Double.toString(paramDouble));
    return this;
  }
  
  public b b(String paramString)
  {
    a("&ta", paramString);
    return this;
  }
  
  public b c(double paramDouble)
  {
    a("&ts", Double.toString(paramDouble));
    return this;
  }
  
  public b c(String paramString)
  {
    a("&tcc", paramString);
    return this;
  }
  
  public b d(String paramString)
  {
    a("&col", paramString);
    return this;
  }
  
  public b e(String paramString)
  {
    a("&pal", paramString);
    return this;
  }
  
  public b f(String paramString)
  {
    a("&pls", paramString);
    return this;
  }
  
  public String toString()
  {
    HashMap localHashMap = new HashMap();
    Iterator localIterator = this.j.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      if (((String)localEntry.getKey()).startsWith("&")) {
        localHashMap.put(((String)localEntry.getKey()).substring(1), (String)localEntry.getValue());
      } else {
        localHashMap.put((String)localEntry.getKey(), (String)localEntry.getValue());
      }
    }
    return n.a(localHashMap);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/analytics/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */