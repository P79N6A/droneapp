package com.fimi.kernel.utils;

import com.fimi.kernel.c;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class n
{
  public static int a(String paramString, int paramInt)
  {
    int j = 0;
    int i = 0;
    while (j < paramString.length())
    {
      if (paramString.substring(j, j + 1).matches("[Α-￥]")) {
        i += 2;
      }
      while (i >= paramInt)
      {
        return j;
        i += 1;
      }
      j += 1;
    }
    return 0;
  }
  
  public static int a(String paramString1, String paramString2)
  {
    if ((paramString1 == null) || (paramString1.length() == 0)) {
      return 0;
    }
    try
    {
      int i = paramString1.getBytes(paramString2).length;
      return i;
    }
    catch (Exception paramString1)
    {
      paramString1.printStackTrace();
    }
    return 0;
  }
  
  public static String a(long paramLong)
  {
    String str = "B";
    long l = paramLong;
    if (paramLong >= 1024L)
    {
      str = "K";
      paramLong >>= 10;
      l = paramLong;
      if (paramLong >= 1024L)
      {
        str = "M";
        paramLong >>= 10;
        l = paramLong;
        if (paramLong >= 1024L)
        {
          str = "G";
          l = paramLong >> 10;
        }
      }
    }
    return l + str;
  }
  
  public static String a(InputStream paramInputStream)
  {
    BufferedReader localBufferedReader = new BufferedReader(new InputStreamReader(paramInputStream));
    StringBuilder localStringBuilder = new StringBuilder();
    try
    {
      for (;;)
      {
        String str = localBufferedReader.readLine();
        if (str == null) {
          break;
        }
        localStringBuilder.append(str + "\n");
      }
      try
      {
        paramInputStream.close();
        throw ((Throwable)localObject);
      }
      catch (IOException paramInputStream)
      {
        for (;;)
        {
          paramInputStream.printStackTrace();
        }
      }
    }
    catch (IOException localIOException)
    {
      localIOException = localIOException;
      localIOException.printStackTrace();
      try
      {
        paramInputStream.close();
        for (;;)
        {
          return localStringBuilder.toString();
          if ((localStringBuilder.indexOf("\n") != -1) && (localStringBuilder.lastIndexOf("\n") == localStringBuilder.length() - 1)) {
            localStringBuilder.delete(localStringBuilder.lastIndexOf("\n"), localStringBuilder.lastIndexOf("\n") + 1);
          }
          try
          {
            paramInputStream.close();
          }
          catch (IOException paramInputStream)
          {
            paramInputStream.printStackTrace();
          }
        }
      }
      catch (IOException paramInputStream)
      {
        for (;;)
        {
          paramInputStream.printStackTrace();
        }
      }
    }
    finally {}
  }
  
  public static String a(String paramString)
  {
    String str;
    if (paramString != null)
    {
      str = paramString;
      if (!"null".equals(paramString.trim())) {}
    }
    else
    {
      str = "";
    }
    return str.trim();
  }
  
  public static String a(String paramString1, int paramInt, String paramString2)
  {
    int i = 0;
    if (a(paramString1, "GBK") <= paramInt) {
      return paramString1;
    }
    StringBuffer localStringBuffer = new StringBuffer(paramInt);
    paramString1 = paramString1.toCharArray();
    int k = paramString1.length;
    int j = 0;
    for (;;)
    {
      if (j < k)
      {
        char c = paramString1[j];
        localStringBuffer.append(c);
        if (c <= 'Ā') {
          break label92;
        }
        i += 2;
      }
      while (i >= paramInt)
      {
        if (paramString2 != null) {
          localStringBuffer.append(paramString2);
        }
        return localStringBuffer.toString();
        label92:
        i += 1;
      }
      j += 1;
    }
  }
  
  public static String a(String paramString1, String paramString2, int paramInt)
  {
    if (b(paramString1)) {
      return "";
    }
    int i = paramString1.indexOf(paramString2);
    if ((i != -1) && (paramString1.length() > i + paramInt)) {
      return paramString1.substring(i + paramInt);
    }
    return "";
  }
  
  public static void a(String[] paramArrayOfString)
  {
    System.out.println(k("2012-3-2 12:2:20"));
  }
  
  public static String b(String paramString, int paramInt)
  {
    return a(paramString, paramInt, "");
  }
  
  public static String b(String paramString1, String paramString2)
  {
    if (b(paramString1)) {
      return "";
    }
    return paramString1.substring(0, paramString1.indexOf(paramString2));
  }
  
  public static boolean b(String paramString)
  {
    return (paramString == null) || (paramString.trim().length() == 0);
  }
  
  public static int c(String paramString)
  {
    int j = 0;
    if (!b(paramString)) {
      for (int i = 0;; i = k)
      {
        k = i;
        if (j >= paramString.length()) {
          break;
        }
        k = i;
        if (paramString.substring(j, j + 1).matches("[Α-￥]")) {
          k = i + 2;
        }
        j += 1;
      }
    }
    int k = 0;
    return k;
  }
  
  public static int d(String paramString)
  {
    int j = 0;
    int k;
    if (!b(paramString))
    {
      int i = 0;
      k = i;
      if (j < paramString.length())
      {
        if (paramString.substring(j, j + 1).matches("[Α-￥]")) {
          i += 2;
        }
        for (;;)
        {
          j += 1;
          break;
          i += 1;
        }
      }
    }
    else
    {
      k = 0;
    }
    return k;
  }
  
  public static Boolean e(String paramString)
  {
    try
    {
      boolean bool = Pattern.compile("^((13[0-9])|(15[^4,\\D])|(18[0,5-9]))\\d{8}$").matcher(paramString).matches();
      return Boolean.valueOf(bool);
    }
    catch (Exception paramString)
    {
      paramString.printStackTrace();
    }
    return Boolean.valueOf(false);
  }
  
  public static Boolean f(String paramString)
  {
    Boolean localBoolean = Boolean.valueOf(false);
    if (paramString.matches("^[A-Za-z0-9]+$")) {
      localBoolean = Boolean.valueOf(true);
    }
    return localBoolean;
  }
  
  public static Boolean g(String paramString)
  {
    Boolean localBoolean = Boolean.valueOf(false);
    if (paramString.matches("^[0-9]+$")) {
      localBoolean = Boolean.valueOf(true);
    }
    return localBoolean;
  }
  
  public static Boolean h(String paramString)
  {
    Boolean localBoolean = Boolean.valueOf(false);
    if (paramString.matches("^([a-z0-9A-Z]+[-|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$")) {
      localBoolean = Boolean.valueOf(true);
    }
    return localBoolean;
  }
  
  public static Boolean i(String paramString)
  {
    Boolean localBoolean1 = Boolean.valueOf(true);
    Boolean localBoolean2;
    if (!b(paramString))
    {
      int i = 0;
      localBoolean2 = localBoolean1;
      if (i < paramString.length())
      {
        if (paramString.substring(i, i + 1).matches("[Α-￥]")) {}
        for (;;)
        {
          i += 1;
          break;
          localBoolean1 = Boolean.valueOf(false);
        }
      }
    }
    else
    {
      localBoolean2 = localBoolean1;
    }
    return localBoolean2;
  }
  
  public static Boolean j(String paramString)
  {
    int i = 0;
    Boolean localBoolean1 = Boolean.valueOf(false);
    Boolean localBoolean2 = localBoolean1;
    if (!b(paramString)) {
      for (;;)
      {
        localBoolean2 = localBoolean1;
        if (i >= paramString.length()) {
          break;
        }
        if (paramString.substring(i, i + 1).matches("[Α-￥]")) {
          localBoolean1 = Boolean.valueOf(true);
        }
        i += 1;
      }
    }
    return localBoolean2;
  }
  
  public static String k(String paramString)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    for (;;)
    {
      int j;
      try
      {
        if (b(paramString)) {
          return null;
        }
        paramString = paramString.split(" ");
        if (paramString.length > 0)
        {
          int k = paramString.length;
          int i = 0;
          if (i < k)
          {
            String[] arrayOfString = paramString[i];
            if (arrayOfString.indexOf("-") != -1)
            {
              arrayOfString = arrayOfString.split("-");
              j = 0;
              if (j < arrayOfString.length)
              {
                localStringBuilder.append(l(arrayOfString[j]));
                if (j >= arrayOfString.length - 1) {
                  break label201;
                }
                localStringBuilder.append("-");
                break label201;
              }
            }
            else if (arrayOfString.indexOf(":") != -1)
            {
              localStringBuilder.append(" ");
              arrayOfString = arrayOfString.split(":");
              j = 0;
              if (j < arrayOfString.length)
              {
                localStringBuilder.append(l(arrayOfString[j]));
                if (j < arrayOfString.length - 1) {
                  localStringBuilder.append(":");
                }
                j += 1;
                continue;
              }
            }
            i += 1;
            continue;
          }
        }
        return localStringBuilder.toString();
      }
      catch (Exception paramString)
      {
        paramString.printStackTrace();
        return null;
      }
      label201:
      j += 1;
    }
  }
  
  public static String l(String paramString)
  {
    String str = paramString;
    try
    {
      if (paramString.length() <= 1) {
        str = "0" + paramString;
      }
      return str;
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
    return paramString;
  }
  
  public static long m(String paramString)
  {
    paramString = paramString.replace(".", ",").split(",");
    long l1 = Long.valueOf(paramString[0]).longValue();
    long l2 = Long.valueOf(paramString[1]).longValue();
    long l3 = Long.valueOf(paramString[2]).longValue();
    return Long.valueOf(paramString[3]).longValue() | l1 << 24 | l2 << 16 | l3 << 8;
  }
  
  public static int n(String paramString)
  {
    if (paramString != null)
    {
      if (paramString == "") {
        return -1;
      }
      try
      {
        int i = paramString.toLowerCase().lastIndexOf("sp");
        i = Integer.valueOf(paramString.substring(i - 2, i) + paramString.substring(i + 2, i + 4)).intValue();
        return i;
      }
      catch (Exception paramString)
      {
        z.b(c.a(), "解析逻辑版本出错!");
      }
    }
    return -1;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/kernel/utils/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */