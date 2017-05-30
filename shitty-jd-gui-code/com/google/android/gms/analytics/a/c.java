package com.google.android.gms.analytics.a;

import com.google.android.gms.analytics.n;
import com.google.android.gms.common.internal.d;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class c
{
  public static final String a = "click";
  public static final String b = "view";
  Map<String, String> c = new HashMap();
  
  public c a(String paramString)
  {
    a("id", paramString);
    return this;
  }
  
  void a(String paramString1, String paramString2)
  {
    d.a(paramString1, "Name should be non-null");
    this.c.put(paramString1, paramString2);
  }
  
  public c b(String paramString)
  {
    a("nm", paramString);
    return this;
  }
  
  public c c(String paramString)
  {
    a("cr", paramString);
    return this;
  }
  
  public c d(String paramString)
  {
    a("ps", paramString);
    return this;
  }
  
  public Map<String, String> e(String paramString)
  {
    HashMap localHashMap = new HashMap();
    Iterator localIterator = this.c.entrySet().iterator();
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
    return n.a(this.c);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/analytics/a/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */