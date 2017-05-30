package com.google.android.gms.internal;

import java.util.Map;

@aaa
public final class vo
  implements vt
{
  private final vp a;
  
  public vo(vp paramvp)
  {
    this.a = paramvp;
  }
  
  public void a(acy paramacy, Map<String, String> paramMap)
  {
    paramacy = (String)paramMap.get("name");
    if (paramacy == null)
    {
      abr.d("App event with no name parameter.");
      return;
    }
    this.a.a(paramacy, (String)paramMap.get("info"));
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/internal/vo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */