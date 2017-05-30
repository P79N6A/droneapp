package com.google.android.gms.internal;

import android.content.Context;
import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import com.google.android.gms.ads.internal.client.ac;
import com.google.android.gms.ads.internal.overlay.d;
import com.google.android.gms.ads.internal.overlay.k;
import com.google.android.gms.ads.internal.util.client.a;
import java.util.Map;
import org.json.JSONObject;

@aaa
public final class we
  implements vt
{
  private boolean a;
  
  private static int a(Context paramContext, Map<String, String> paramMap, String paramString, int paramInt)
  {
    paramMap = (String)paramMap.get(paramString);
    int i = paramInt;
    if (paramMap != null) {}
    try
    {
      i = ac.a().a(paramContext, Integer.parseInt(paramMap));
      return i;
    }
    catch (NumberFormatException paramContext)
    {
      abr.d(String.valueOf(paramString).length() + 34 + String.valueOf(paramMap).length() + "Could not parse " + paramString + " in a video GMSG: " + paramMap);
    }
    return paramInt;
  }
  
  public void a(acy paramacy, Map<String, String> paramMap)
  {
    Object localObject2 = (String)paramMap.get("action");
    if (localObject2 == null)
    {
      abr.d("Action missing from video GMSG.");
      return;
    }
    if (abr.a(3))
    {
      localObject1 = new JSONObject(paramMap);
      ((JSONObject)localObject1).remove("google.afma.Notify_dt");
      localObject1 = String.valueOf(((JSONObject)localObject1).toString());
      abr.a(String.valueOf(localObject2).length() + 13 + String.valueOf(localObject1).length() + "Video GMSG: " + (String)localObject2 + " " + (String)localObject1);
    }
    if ("background".equals(localObject2))
    {
      paramMap = (String)paramMap.get("color");
      if (TextUtils.isEmpty(paramMap))
      {
        abr.d("Color parameter missing from color video GMSG.");
        return;
      }
      try
      {
        paramacy.setBackgroundColor(Color.parseColor(paramMap));
        return;
      }
      catch (IllegalArgumentException paramacy)
      {
        abr.d("Invalid color parameter in video GMSG.");
        return;
      }
    }
    Object localObject1 = paramacy.w();
    if (localObject1 == null)
    {
      abr.d("Could not get underlay container for a video GMSG.");
      return;
    }
    boolean bool1 = "new".equals(localObject2);
    boolean bool2 = "position".equals(localObject2);
    int m;
    int n;
    int i;
    int j;
    if ((bool1) || (bool2))
    {
      localObject2 = paramacy.getContext();
      m = a((Context)localObject2, paramMap, "x", 0);
      n = a((Context)localObject2, paramMap, "y", 0);
      i = a((Context)localObject2, paramMap, "w", -1);
      j = a((Context)localObject2, paramMap, "h", -1);
      if (!((Boolean)uf.bR.c()).booleanValue()) {
        break label930;
      }
      i = Math.min(i, paramacy.getMeasuredWidth() - m);
      j = Math.min(j, paramacy.getMeasuredHeight() - n);
    }
    label930:
    for (;;)
    {
      try
      {
        k = Integer.parseInt((String)paramMap.get("player"));
        bool2 = Boolean.parseBoolean((String)paramMap.get("spherical"));
        if ((bool1) && (((acx)localObject1).a() == null))
        {
          ((acx)localObject1).a(m, n, i, j, k, bool2);
          return;
        }
      }
      catch (NumberFormatException paramacy)
      {
        int k = 0;
        continue;
        ((acx)localObject1).a(m, n, i, j);
        return;
      }
      localObject1 = ((acx)localObject1).a();
      if (localObject1 == null)
      {
        k.a(paramacy);
        return;
      }
      if ("click".equals(localObject2))
      {
        paramacy = paramacy.getContext();
        i = a(paramacy, paramMap, "x", 0);
        j = a(paramacy, paramMap, "y", 0);
        long l = SystemClock.uptimeMillis();
        paramacy = MotionEvent.obtain(l, l, 0, i, j, 0);
        ((k)localObject1).a(paramacy);
        paramacy.recycle();
        return;
      }
      if ("currentTime".equals(localObject2))
      {
        paramacy = (String)paramMap.get("time");
        if (paramacy == null)
        {
          abr.d("Time parameter missing from currentTime video GMSG.");
          return;
        }
        try
        {
          ((k)localObject1).a((int)(Float.parseFloat(paramacy) * 1000.0F));
          return;
        }
        catch (NumberFormatException paramMap)
        {
          paramacy = String.valueOf(paramacy);
          if (paramacy.length() == 0) {}
        }
        for (paramacy = "Could not parse time parameter from currentTime video GMSG: ".concat(paramacy);; paramacy = new String("Could not parse time parameter from currentTime video GMSG: "))
        {
          abr.d(paramacy);
          return;
        }
      }
      if ("hide".equals(localObject2))
      {
        ((k)localObject1).setVisibility(4);
        return;
      }
      if ("load".equals(localObject2))
      {
        ((k)localObject1).g();
        return;
      }
      if ("muted".equals(localObject2))
      {
        if (Boolean.parseBoolean((String)paramMap.get("muted")))
        {
          ((k)localObject1).j();
          return;
        }
        ((k)localObject1).k();
        return;
      }
      if ("pause".equals(localObject2))
      {
        ((k)localObject1).h();
        return;
      }
      if ("play".equals(localObject2))
      {
        ((k)localObject1).i();
        return;
      }
      if ("show".equals(localObject2))
      {
        ((k)localObject1).setVisibility(0);
        return;
      }
      if ("src".equals(localObject2))
      {
        ((k)localObject1).a((String)paramMap.get("src"));
        return;
      }
      if ("touchMove".equals(localObject2))
      {
        localObject2 = paramacy.getContext();
        i = a((Context)localObject2, paramMap, "dx", 0);
        j = a((Context)localObject2, paramMap, "dy", 0);
        ((k)localObject1).a(i, j);
        if (this.a) {
          break;
        }
        paramacy.i().r();
        this.a = true;
        return;
      }
      if ("volume".equals(localObject2))
      {
        paramacy = (String)paramMap.get("volume");
        if (paramacy == null)
        {
          abr.d("Level parameter missing from volume video GMSG.");
          return;
        }
        try
        {
          ((k)localObject1).a(Float.parseFloat(paramacy));
          return;
        }
        catch (NumberFormatException paramMap)
        {
          paramacy = String.valueOf(paramacy);
          if (paramacy.length() == 0) {}
        }
        for (paramacy = "Could not parse volume parameter from volume video GMSG: ".concat(paramacy);; paramacy = new String("Could not parse volume parameter from volume video GMSG: "))
        {
          abr.d(paramacy);
          return;
        }
      }
      if ("watermark".equals(localObject2))
      {
        ((k)localObject1).l();
        return;
      }
      paramacy = String.valueOf(localObject2);
      if (paramacy.length() != 0) {}
      for (paramacy = "Unknown video action: ".concat(paramacy);; paramacy = new String("Unknown video action: "))
      {
        abr.d(paramacy);
        return;
      }
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/internal/we.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */