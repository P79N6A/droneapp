package com.fimi.kernel.utils;

public class i
{
  public static String a(String paramString)
  {
    if (!b(paramString)) {
      return paramString;
    }
    StringBuffer localStringBuffer = new StringBuffer(paramString.length());
    int i = 0;
    if (i <= paramString.length() - 1)
    {
      char c = paramString.charAt(i);
      switch (c)
      {
      default: 
        localStringBuffer.append(c);
      }
      for (;;)
      {
        i += 1;
        break;
        localStringBuffer.append("&lt;");
        continue;
        localStringBuffer.append("&gt;");
        continue;
        localStringBuffer.append("&quot;");
        continue;
        localStringBuffer.append("&amp;");
      }
    }
    return localStringBuffer.toString();
  }
  
  public static boolean b(String paramString)
  {
    boolean bool2 = false;
    int i = 0;
    boolean bool1 = bool2;
    if (paramString != null)
    {
      bool1 = bool2;
      if (paramString.length() > 0)
      {
        bool1 = false;
        if (i <= paramString.length() - 1)
        {
          switch (paramString.charAt(i))
          {
          }
          for (;;)
          {
            i += 1;
            break;
            bool1 = true;
            continue;
            bool1 = true;
            continue;
            bool1 = true;
            continue;
            bool1 = true;
          }
        }
      }
    }
    return bool1;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/kernel/utils/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */