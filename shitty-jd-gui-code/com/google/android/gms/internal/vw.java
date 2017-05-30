package com.google.android.gms.internal;

import java.util.Map;

@aaa
public class vw
  implements vt
{
  private final vx a;
  
  public vw(vx paramvx)
  {
    this.a = paramvx;
  }
  
  public void a(acy paramacy, Map<String, String> paramMap)
  {
    boolean bool1 = "1".equals(paramMap.get("transparentBackground"));
    boolean bool2 = "1".equals(paramMap.get("blur"));
    try
    {
      if (paramMap.get("blurRadius") != null)
      {
        f = Float.parseFloat((String)paramMap.get("blurRadius"));
        this.a.b(bool1);
        this.a.a(bool2, f);
        return;
      }
    }
    catch (NumberFormatException paramacy)
    {
      for (;;)
      {
        abr.b("Fail to parse float", paramacy);
        float f = 0.0F;
      }
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/internal/vw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */