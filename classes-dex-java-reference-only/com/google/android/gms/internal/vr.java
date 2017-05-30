package com.google.android.gms.internal;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.u;
import com.google.android.gms.common.util.e;
import java.util.Map;

@aaa
public final class vr
  implements vt
{
  private long a(long paramLong)
  {
    return paramLong - u.k().a() + u.k().b();
  }
  
  private void b(acy paramacy, Map<String, String> paramMap)
  {
    String str2 = (String)paramMap.get("label");
    String str1 = (String)paramMap.get("start_label");
    paramMap = (String)paramMap.get("timestamp");
    if (TextUtils.isEmpty(str2))
    {
      abr.d("No label given for CSI tick.");
      return;
    }
    if (TextUtils.isEmpty(paramMap))
    {
      abr.d("No timestamp given for CSI tick.");
      return;
    }
    try
    {
      long l = a(Long.parseLong(paramMap));
      paramMap = str1;
      if (TextUtils.isEmpty(str1)) {
        paramMap = "native:view_load";
      }
      paramacy.y().a(str2, paramMap, l);
      return;
    }
    catch (NumberFormatException paramacy)
    {
      abr.d("Malformed timestamp for CSI tick.", paramacy);
    }
  }
  
  private void c(acy paramacy, Map<String, String> paramMap)
  {
    paramMap = (String)paramMap.get("value");
    if (TextUtils.isEmpty(paramMap))
    {
      abr.d("No value given for CSI experiment.");
      return;
    }
    paramacy = paramacy.y().a();
    if (paramacy == null)
    {
      abr.d("No ticker for WebView, dropping experiment ID.");
      return;
    }
    paramacy.a("e", paramMap);
  }
  
  private void d(acy paramacy, Map<String, String> paramMap)
  {
    String str = (String)paramMap.get("name");
    paramMap = (String)paramMap.get("value");
    if (TextUtils.isEmpty(paramMap))
    {
      abr.d("No value given for CSI extra.");
      return;
    }
    if (TextUtils.isEmpty(str))
    {
      abr.d("No name given for CSI extra.");
      return;
    }
    paramacy = paramacy.y().a();
    if (paramacy == null)
    {
      abr.d("No ticker for WebView, dropping extra parameter.");
      return;
    }
    paramacy.a(str, paramMap);
  }
  
  public void a(acy paramacy, Map<String, String> paramMap)
  {
    String str = (String)paramMap.get("action");
    if ("tick".equals(str)) {
      b(paramacy, paramMap);
    }
    do
    {
      return;
      if ("experiment".equals(str))
      {
        c(paramacy, paramMap);
        return;
      }
    } while (!"extra".equals(str));
    d(paramacy, paramMap);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/internal/vr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */