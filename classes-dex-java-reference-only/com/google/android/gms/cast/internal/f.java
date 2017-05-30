package com.google.android.gms.cast.internal;

import android.text.TextUtils;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class f
{
  private static final Pattern a = Pattern.compile("urn:x-cast:[-A-Za-z0-9_]+(\\.[-A-Za-z0-9_]+)*");
  
  public static double a(long paramLong)
  {
    return paramLong / 1000.0D;
  }
  
  public static long a(double paramDouble)
  {
    return (1000.0D * paramDouble);
  }
  
  public static String a(Locale paramLocale)
  {
    StringBuilder localStringBuilder = new StringBuilder(20);
    localStringBuilder.append(paramLocale.getLanguage());
    String str = paramLocale.getCountry();
    if (!TextUtils.isEmpty(str)) {
      localStringBuilder.append('-').append(str);
    }
    paramLocale = paramLocale.getVariant();
    if (!TextUtils.isEmpty(paramLocale)) {
      localStringBuilder.append('-').append(paramLocale);
    }
    return localStringBuilder.toString();
  }
  
  public static void a(String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {
      throw new IllegalArgumentException("Namespace cannot be null or empty");
    }
    if (paramString.length() > 128) {
      throw new IllegalArgumentException("Invalid namespace length");
    }
    if (!paramString.startsWith("urn:x-cast:")) {
      throw new IllegalArgumentException("Namespace must begin with the prefix \"urn:x-cast:\"");
    }
    if (paramString.length() == "urn:x-cast:".length()) {
      throw new IllegalArgumentException("Namespace must begin with the prefix \"urn:x-cast:\" and have non-empty suffix");
    }
  }
  
  private static boolean a(char paramChar)
  {
    return ((paramChar >= 'A') && (paramChar <= 'Z')) || ((paramChar >= 'a') && (paramChar <= 'z')) || ((paramChar >= '0') && (paramChar <= '9')) || (paramChar == '_') || (paramChar == '-');
  }
  
  public static <T> boolean a(T paramT1, T paramT2)
  {
    return ((paramT1 == null) && (paramT2 == null)) || ((paramT1 != null) && (paramT2 != null) && (paramT1.equals(paramT2)));
  }
  
  public static String b(String paramString)
  {
    String str = String.valueOf("urn:x-cast:");
    paramString = String.valueOf(paramString);
    if (paramString.length() != 0) {
      return str.concat(paramString);
    }
    return new String(str);
  }
  
  public static String c(String paramString)
  {
    if (a.matcher(paramString).matches()) {
      return paramString;
    }
    StringBuilder localStringBuilder = new StringBuilder(paramString.length());
    int j = 0;
    if (j < paramString.length())
    {
      int i = paramString.charAt(j);
      if ((a(i)) || (i == 46) || (i == 58)) {
        localStringBuilder.append(i);
      }
      for (;;)
      {
        j += 1;
        break;
        localStringBuilder.append(String.format("%%%04x", new Object[] { Integer.valueOf(i & 0xFFFF) }));
      }
    }
    return localStringBuilder.toString();
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/cast/internal/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */