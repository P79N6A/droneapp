package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.u;
import java.util.Map;

@aaa
public class yj
{
  private final acy a;
  private final boolean b;
  private final String c;
  
  public yj(acy paramacy, Map<String, String> paramMap)
  {
    this.a = paramacy;
    this.c = ((String)paramMap.get("forceOrientation"));
    if (paramMap.containsKey("allowOrientationChange"))
    {
      this.b = Boolean.parseBoolean((String)paramMap.get("allowOrientationChange"));
      return;
    }
    this.b = true;
  }
  
  public void a()
  {
    if (this.a == null)
    {
      abr.d("AdWebView is null");
      return;
    }
    int i;
    if ("portrait".equalsIgnoreCase(this.c)) {
      i = u.g().b();
    }
    for (;;)
    {
      this.a.b(i);
      return;
      if ("landscape".equalsIgnoreCase(this.c)) {
        i = u.g().a();
      } else if (this.b) {
        i = -1;
      } else {
        i = u.g().c();
      }
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/internal/yj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */