package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.e;
import com.google.android.gms.common.util.f;
import java.util.Map;

@aaa
public class wa
  implements vt
{
  static final Map<String, Integer> a = f.a("resize", Integer.valueOf(1), "playVideo", Integer.valueOf(2), "storePicture", Integer.valueOf(3), "createCalendarEvent", Integer.valueOf(4), "setOrientationProperties", Integer.valueOf(5), "closeResizedAd", Integer.valueOf(6));
  private final e b;
  private final yi c;
  
  public wa(e parame, yi paramyi)
  {
    this.b = parame;
    this.c = paramyi;
  }
  
  public void a(acy paramacy, Map<String, String> paramMap)
  {
    String str = (String)paramMap.get("a");
    int i = ((Integer)a.get(str)).intValue();
    if ((i != 5) && (this.b != null) && (!this.b.b()))
    {
      this.b.a(null);
      return;
    }
    switch (i)
    {
    case 2: 
    default: 
      abr.c("Unknown MRAID command called.");
      return;
    case 1: 
      this.c.a(paramMap);
      return;
    case 4: 
      new yh(paramacy, paramMap).a();
      return;
    case 3: 
      new yk(paramacy, paramMap).a();
      return;
    case 5: 
      new yj(paramacy, paramMap).a();
      return;
    }
    this.c.a(true);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/internal/wa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */