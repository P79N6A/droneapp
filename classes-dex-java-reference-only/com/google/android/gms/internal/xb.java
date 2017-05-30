package com.google.android.gms.internal;

import java.util.AbstractMap.SimpleEntry;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONObject;

@aaa
public class xb
  implements xa
{
  private final wy a;
  private final HashSet<AbstractMap.SimpleEntry<String, vt>> b;
  
  public xb(wy paramwy)
  {
    this.a = paramwy;
    this.b = new HashSet();
  }
  
  public void a()
  {
    Iterator localIterator = this.b.iterator();
    if (localIterator.hasNext())
    {
      AbstractMap.SimpleEntry localSimpleEntry = (AbstractMap.SimpleEntry)localIterator.next();
      String str = String.valueOf(((vt)localSimpleEntry.getValue()).toString());
      if (str.length() != 0) {}
      for (str = "Unregistering eventhandler: ".concat(str);; str = new String("Unregistering eventhandler: "))
      {
        abr.e(str);
        this.a.b((String)localSimpleEntry.getKey(), (vt)localSimpleEntry.getValue());
        break;
      }
    }
    this.b.clear();
  }
  
  public void a(String paramString, vt paramvt)
  {
    this.a.a(paramString, paramvt);
    this.b.add(new AbstractMap.SimpleEntry(paramString, paramvt));
  }
  
  public void a(String paramString1, String paramString2)
  {
    this.a.a(paramString1, paramString2);
  }
  
  public void a(String paramString, JSONObject paramJSONObject)
  {
    this.a.a(paramString, paramJSONObject);
  }
  
  public void b(String paramString, vt paramvt)
  {
    this.a.b(paramString, paramvt);
    this.b.remove(new AbstractMap.SimpleEntry(paramString, paramvt));
  }
  
  public void b(String paramString, JSONObject paramJSONObject)
  {
    this.a.b(paramString, paramJSONObject);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/internal/xb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */