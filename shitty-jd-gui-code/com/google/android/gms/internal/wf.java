package com.google.android.gms.internal;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.u;
import java.util.Map;

@aaa
class wf
  implements vt
{
  private int a(Map<String, String> paramMap)
  {
    int j = Integer.parseInt((String)paramMap.get("playbackState"));
    int i;
    if (j >= 0)
    {
      i = j;
      if (3 >= j) {}
    }
    else
    {
      i = 0;
    }
    return i;
  }
  
  public void a(acy paramacy, Map<String, String> paramMap)
  {
    if (!((Boolean)uf.aS.c()).booleanValue()) {
      return;
    }
    add localadd = paramacy.z();
    if (localadd == null) {}
    for (;;)
    {
      try
      {
        localadd = new add(paramacy, Float.parseFloat((String)paramMap.get("duration")));
        paramacy.a(localadd);
        paramacy = localadd;
        bool = "1".equals(paramMap.get("muted"));
        f2 = Float.parseFloat((String)paramMap.get("currentTime"));
        i = a(paramMap);
        paramMap = (String)paramMap.get("aspectRatio");
        if (!TextUtils.isEmpty(paramMap)) {
          continue;
        }
        f1 = 0.0F;
      }
      catch (NullPointerException paramacy)
      {
        boolean bool;
        float f2;
        int i;
        abr.b("Unable to parse videoMeta message.", paramacy);
        u.i().a(paramacy, "VideoMetaGmsgHandler.onGmsg");
        return;
        float f1 = Float.parseFloat(paramMap);
        continue;
      }
      catch (NumberFormatException paramacy)
      {
        continue;
      }
      if (abr.a(3)) {
        abr.a(String.valueOf(paramMap).length() + 79 + "Video Meta GMSG: isMuted : " + bool + " , playbackState : " + i + " , aspectRatio : " + paramMap);
      }
      paramacy.a(f2, i, bool, f1);
      return;
      paramacy = localadd;
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/internal/wf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */