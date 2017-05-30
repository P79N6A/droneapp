package com.google.android.gms.ads.mediation.customevent;

import com.google.ads.mediation.j;
import java.util.HashMap;

@Deprecated
public final class d
  implements j
{
  private final HashMap<String, Object> a = new HashMap();
  
  public Object a(String paramString)
  {
    return this.a.get(paramString);
  }
  
  public void a(String paramString, Object paramObject)
  {
    this.a.put(paramString, paramObject);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/ads/mediation/customevent/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */