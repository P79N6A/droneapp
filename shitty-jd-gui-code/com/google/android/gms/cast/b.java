package com.google.android.gms.cast;

import android.text.TextUtils;
import com.google.android.gms.cast.internal.f;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;

public final class b
{
  public static final String a = "CC1AD845";
  public static final String b = "com.google.android.gms.cast.ACTION_SYNC_STATUS";
  public static final String c = "com.google.android.gms.cast.EXTRA_CUSTOM_DATA";
  public static final String d = "com.google.android.gms.cast.EXTRA_CAST_APPLICATION_ID";
  public static final String e = "com.google.android.gms.cast.EXTRA_CAST_RELAUNCH_APPLICATION";
  public static final String f = "com.google.android.gms.cast.EXTRA_CAST_LANGUAGE_CODE";
  public static final String g = "com.google.android.gms.cast.EXTRA_CAST_STOP_APPLICATION_WHEN_SESSION_ENDS";
  public static final String h = "com.google.android.gms.cast.EXTRA_DEBUG_LOGGING_ENABLED";
  public static final String i = "com.google.android.gms.cast.EXTRA_ERROR_CODE";
  public static final int j = 1;
  public static final int k = 2;
  public static final int l = 3;
  
  public static String a()
  {
    return a("com.google.android.gms.cast.CATEGORY_CAST_REMOTE_PLAYBACK", null, null);
  }
  
  public static String a(String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {
      throw new IllegalArgumentException("applicationId cannot be null or empty");
    }
    return a("com.google.android.gms.cast.CATEGORY_CAST_REMOTE_PLAYBACK", paramString, null);
  }
  
  private static String a(String paramString1, String paramString2, Collection<String> paramCollection)
  {
    paramString1 = new StringBuilder(paramString1);
    if (paramString2 != null)
    {
      String str = paramString2.toUpperCase();
      if (!str.matches("[A-F0-9]+"))
      {
        paramString1 = String.valueOf(paramString2);
        if (paramString1.length() != 0) {}
        for (paramString1 = "Invalid application ID: ".concat(paramString1);; paramString1 = new String("Invalid application ID: ")) {
          throw new IllegalArgumentException(paramString1);
        }
      }
      paramString1.append("/").append(str);
    }
    if (paramCollection != null)
    {
      if (paramCollection.isEmpty()) {
        throw new IllegalArgumentException("Must specify at least one namespace");
      }
      if (paramString2 == null) {
        paramString1.append("/");
      }
      paramString1.append("/");
      paramString2 = paramCollection.iterator();
      int m = 1;
      if (paramString2.hasNext())
      {
        paramCollection = (String)paramString2.next();
        f.a(paramCollection);
        if (m != 0) {
          m = 0;
        }
        for (;;)
        {
          paramString1.append(f.c(paramCollection));
          break;
          paramString1.append(",");
        }
      }
    }
    return paramString1.toString();
  }
  
  public static String a(String paramString, Collection<String> paramCollection)
  {
    if (paramString == null) {
      throw new IllegalArgumentException("applicationId cannot be null");
    }
    if (paramCollection == null) {
      throw new IllegalArgumentException("namespaces cannot be null");
    }
    return a("com.google.android.gms.cast.CATEGORY_CAST", paramString, paramCollection);
  }
  
  public static String a(Collection<String> paramCollection)
  {
    if (paramCollection == null) {
      throw new IllegalArgumentException("namespaces cannot be null");
    }
    return a("com.google.android.gms.cast.CATEGORY_CAST", null, paramCollection);
  }
  
  public static String a(Locale paramLocale)
  {
    return f.a(paramLocale);
  }
  
  public static String b(String paramString)
  {
    if (paramString == null) {
      throw new IllegalArgumentException("applicationId cannot be null");
    }
    return a("com.google.android.gms.cast.CATEGORY_CAST", paramString, null);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/cast/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */