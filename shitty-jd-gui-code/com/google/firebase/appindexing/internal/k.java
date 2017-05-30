package com.google.firebase.appindexing.internal;

import android.net.Uri;
import android.support.annotation.NonNull;
import android.webkit.URLUtil;
import com.google.android.gms.common.api.Status;
import com.google.firebase.appindexing.c;
import com.google.firebase.appindexing.e;

public class k
{
  public static c a(@NonNull Status paramStatus, String paramString)
  {
    com.google.android.gms.common.internal.d.a(paramStatus);
    String str2 = paramStatus.c();
    String str1 = paramString;
    if (str2 != null) {
      if (!str2.isEmpty()) {
        break label79;
      }
    }
    label79:
    for (str1 = paramString;; str1 = str2)
    {
      switch (paramStatus.i())
      {
      default: 
        return new c(str1);
      case 17510: 
        return new com.google.firebase.appindexing.d(str1);
      }
      return new e(str1);
    }
  }
  
  public static void a(@NonNull String paramString)
  {
    com.google.android.gms.common.internal.d.a(paramString);
    Uri localUri = Uri.parse(paramString);
    if ((localUri == null) || (!localUri.isAbsolute())) {
      throw new com.google.firebase.appindexing.d(String.valueOf(paramString).length() + 33 + "Invalid String passed as url: '" + paramString + "'.");
    }
  }
  
  public static void b(@NonNull String paramString)
  {
    com.google.android.gms.common.internal.d.a(paramString);
    if ((!URLUtil.isHttpUrl(paramString)) && (!URLUtil.isHttpsUrl(paramString))) {
      throw new com.google.firebase.appindexing.d(String.valueOf(paramString).length() + 46 + "Web url must be with http or https scheme: '" + paramString + "'.");
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/firebase/appindexing/internal/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */