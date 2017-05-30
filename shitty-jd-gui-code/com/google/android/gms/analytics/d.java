package com.google.android.gms.analytics;

import android.text.TextUtils;
import com.google.android.gms.analytics.a.a;
import com.google.android.gms.analytics.a.b;
import com.google.android.gms.analytics.a.c;
import com.google.android.gms.analytics.internal.f;
import com.google.android.gms.analytics.internal.p;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class d
{
  @Deprecated
  public static class a
    extends d.d<a>
  {
    public a()
    {
      a("&t", "screenview");
    }
  }
  
  public static class b
    extends d.d<b>
  {
    public b()
    {
      a("&t", "event");
    }
    
    public b(String paramString1, String paramString2)
    {
      this();
      a(paramString1);
      b(paramString2);
    }
    
    public b a(long paramLong)
    {
      a("&ev", Long.toString(paramLong));
      return this;
    }
    
    public b a(String paramString)
    {
      a("&ec", paramString);
      return this;
    }
    
    public b b(String paramString)
    {
      a("&ea", paramString);
      return this;
    }
    
    public b c(String paramString)
    {
      a("&el", paramString);
      return this;
    }
  }
  
  public static class c
    extends d.d<c>
  {
    public c()
    {
      a("&t", "exception");
    }
    
    public c a(String paramString)
    {
      a("&exd", paramString);
      return this;
    }
    
    public c a(boolean paramBoolean)
    {
      a("&exf", p.a(paramBoolean));
      return this;
    }
  }
  
  protected static class d<T extends d>
  {
    b a;
    Map<String, List<a>> b = new HashMap();
    List<c> c = new ArrayList();
    List<a> d = new ArrayList();
    private Map<String, String> e = new HashMap();
    
    private T b(String paramString1, String paramString2)
    {
      if (paramString1 != null)
      {
        if (paramString2 != null) {
          this.e.put(paramString1, paramString2);
        }
        return this;
      }
      f.c("HitBuilder.setIfNonNull() called with a null paramName.");
      return this;
    }
    
    public T a(int paramInt, float paramFloat)
    {
      a(j.c(paramInt), Float.toString(paramFloat));
      return this;
    }
    
    public T a(int paramInt, String paramString)
    {
      a(j.a(paramInt), paramString);
      return this;
    }
    
    public T a(a parama)
    {
      if (parama == null)
      {
        f.c("product should be non-null");
        return this;
      }
      this.d.add(parama);
      return this;
    }
    
    public T a(a parama, String paramString)
    {
      if (parama == null)
      {
        f.c("product should be non-null");
        return this;
      }
      String str = paramString;
      if (paramString == null) {
        str = "";
      }
      if (!this.b.containsKey(str)) {
        this.b.put(str, new ArrayList());
      }
      ((List)this.b.get(str)).add(parama);
      return this;
    }
    
    public T a(b paramb)
    {
      this.a = paramb;
      return this;
    }
    
    public T a(c paramc)
    {
      if (paramc == null)
      {
        f.c("promotion should be non-null");
        return this;
      }
      this.c.add(paramc);
      return this;
    }
    
    public final T a(String paramString1, String paramString2)
    {
      if (paramString1 != null)
      {
        this.e.put(paramString1, paramString2);
        return this;
      }
      f.c("HitBuilder.set() called with a null paramName.");
      return this;
    }
    
    public final T a(Map<String, String> paramMap)
    {
      if (paramMap == null) {
        return this;
      }
      this.e.putAll(new HashMap(paramMap));
      return this;
    }
    
    public Map<String, String> a()
    {
      HashMap localHashMap = new HashMap(this.e);
      if (this.a != null) {
        localHashMap.putAll(this.a.a());
      }
      Object localObject = this.c.iterator();
      int i = 1;
      while (((Iterator)localObject).hasNext())
      {
        localHashMap.putAll(((c)((Iterator)localObject).next()).e(j.g(i)));
        i += 1;
      }
      localObject = this.d.iterator();
      i = 1;
      while (((Iterator)localObject).hasNext())
      {
        localHashMap.putAll(((a)((Iterator)localObject).next()).g(j.e(i)));
        i += 1;
      }
      Iterator localIterator1 = this.b.entrySet().iterator();
      i = 1;
      if (localIterator1.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)localIterator1.next();
        localObject = (List)localEntry.getValue();
        String str1 = j.j(i);
        Iterator localIterator2 = ((List)localObject).iterator();
        int j = 1;
        if (localIterator2.hasNext())
        {
          a locala = (a)localIterator2.next();
          localObject = String.valueOf(str1);
          String str2 = String.valueOf(j.i(j));
          if (str2.length() != 0) {}
          for (localObject = ((String)localObject).concat(str2);; localObject = new String((String)localObject))
          {
            localHashMap.putAll(locala.g((String)localObject));
            j += 1;
            break;
          }
        }
        if (!TextUtils.isEmpty((CharSequence)localEntry.getKey()))
        {
          localObject = String.valueOf(str1);
          str1 = String.valueOf("nm");
          if (str1.length() == 0) {
            break label357;
          }
        }
        label357:
        for (localObject = ((String)localObject).concat(str1);; localObject = new String((String)localObject))
        {
          localHashMap.put(localObject, (String)localEntry.getKey());
          i += 1;
          break;
        }
      }
      return localHashMap;
    }
    
    public T b()
    {
      a("&sc", "start");
      return this;
    }
    
    public T b(boolean paramBoolean)
    {
      a("&ni", p.a(paramBoolean));
      return this;
    }
    
    public T d(String paramString)
    {
      paramString = p.c(paramString);
      if (TextUtils.isEmpty(paramString)) {
        return this;
      }
      paramString = p.a(paramString);
      b("&cc", (String)paramString.get("utm_content"));
      b("&cm", (String)paramString.get("utm_medium"));
      b("&cn", (String)paramString.get("utm_campaign"));
      b("&cs", (String)paramString.get("utm_source"));
      b("&ck", (String)paramString.get("utm_term"));
      b("&ci", (String)paramString.get("utm_id"));
      b("&anid", (String)paramString.get("anid"));
      b("&gclid", (String)paramString.get("gclid"));
      b("&dclid", (String)paramString.get("dclid"));
      b("&aclid", (String)paramString.get("aclid"));
      b("&gmob_t", (String)paramString.get("gmob_t"));
      return this;
    }
    
    public T e(String paramString)
    {
      this.e.put("&promoa", paramString);
      return this;
    }
    
    protected T f(String paramString)
    {
      a("&t", paramString);
      return this;
    }
    
    protected String g(String paramString)
    {
      return (String)this.e.get(paramString);
    }
  }
  
  @Deprecated
  public static class e
    extends d.d<e>
  {
    public e()
    {
      a("&t", "item");
    }
    
    public e a(double paramDouble)
    {
      a("&ip", Double.toString(paramDouble));
      return this;
    }
    
    public e a(long paramLong)
    {
      a("&iq", Long.toString(paramLong));
      return this;
    }
    
    public e a(String paramString)
    {
      a("&ti", paramString);
      return this;
    }
    
    public e b(String paramString)
    {
      a("&in", paramString);
      return this;
    }
    
    public e c(String paramString)
    {
      a("&ic", paramString);
      return this;
    }
    
    public e h(String paramString)
    {
      a("&iv", paramString);
      return this;
    }
    
    public e i(String paramString)
    {
      a("&cu", paramString);
      return this;
    }
  }
  
  public static class f
    extends d.d<f>
  {
    public f()
    {
      a("&t", "screenview");
    }
  }
  
  public static class g
    extends d.d<g>
  {
    public g()
    {
      a("&t", "social");
    }
    
    public g a(String paramString)
    {
      a("&sn", paramString);
      return this;
    }
    
    public g b(String paramString)
    {
      a("&sa", paramString);
      return this;
    }
    
    public g c(String paramString)
    {
      a("&st", paramString);
      return this;
    }
  }
  
  public static class h
    extends d.d<h>
  {
    public h()
    {
      a("&t", "timing");
    }
    
    public h(String paramString1, String paramString2, long paramLong)
    {
      this();
      a(paramString2);
      a(paramLong);
      b(paramString1);
    }
    
    public h a(long paramLong)
    {
      a("&utt", Long.toString(paramLong));
      return this;
    }
    
    public h a(String paramString)
    {
      a("&utv", paramString);
      return this;
    }
    
    public h b(String paramString)
    {
      a("&utc", paramString);
      return this;
    }
    
    public h c(String paramString)
    {
      a("&utl", paramString);
      return this;
    }
  }
  
  @Deprecated
  public static class i
    extends d.d<i>
  {
    public i()
    {
      a("&t", "transaction");
    }
    
    public i a(double paramDouble)
    {
      a("&tr", Double.toString(paramDouble));
      return this;
    }
    
    public i a(String paramString)
    {
      a("&ti", paramString);
      return this;
    }
    
    public i b(double paramDouble)
    {
      a("&tt", Double.toString(paramDouble));
      return this;
    }
    
    public i b(String paramString)
    {
      a("&ta", paramString);
      return this;
    }
    
    public i c(double paramDouble)
    {
      a("&ts", Double.toString(paramDouble));
      return this;
    }
    
    public i c(String paramString)
    {
      a("&cu", paramString);
      return this;
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/analytics/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */