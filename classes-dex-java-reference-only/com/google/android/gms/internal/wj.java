package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.d;
import com.google.android.gms.ads.internal.u;
import com.google.android.gms.common.internal.n;
import java.util.Map;
import java.util.concurrent.Future;

@aaa
public class wj
  implements vt
{
  public void a(acy paramacy, Map<String, String> paramMap)
  {
    wh localwh = u.B();
    if (paramMap.containsKey("abort"))
    {
      if (!localwh.a(paramacy)) {
        abr.d("Precache abort but no preload task running.");
      }
      return;
    }
    String str = (String)paramMap.get("src");
    if (str == null)
    {
      abr.d("Precache video action is missing the src parameter.");
      return;
    }
    try
    {
      i = Integer.parseInt((String)paramMap.get("player"));
      if (paramMap.containsKey("mimetype"))
      {
        paramMap = (String)paramMap.get("mimetype");
        if (!localwh.b(paramacy)) {
          break label121;
        }
        abr.d("Precache task already running.");
      }
    }
    catch (NumberFormatException localNumberFormatException)
    {
      int i;
      for (;;)
      {
        i = 0;
        continue;
        paramMap = "";
      }
      label121:
      n.a(paramacy.h());
      paramacy = (Future)new wg(paramacy, paramacy.h().a.a(paramacy, i, paramMap), str).e();
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/internal/wj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */