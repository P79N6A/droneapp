package com.google.android.gms.auth.api.credentials.internal;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.common.internal.d;

public class b
{
  public static String a(String paramString)
  {
    boolean bool2 = false;
    if (!TextUtils.isEmpty(paramString)) {}
    for (boolean bool1 = true;; bool1 = false)
    {
      d.b(bool1, "account type cannot be empty");
      String str = Uri.parse(paramString).getScheme();
      if (!"http".equalsIgnoreCase(str))
      {
        bool1 = bool2;
        if (!"https".equalsIgnoreCase(str)) {}
      }
      else
      {
        bool1 = true;
      }
      d.b(bool1, "Account type must be an http or https URI");
      return paramString;
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/auth/api/credentials/internal/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */