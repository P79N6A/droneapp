package com.fimi.soul.utils;

import java.security.MessageDigest;

public class at
{
  public static String a(String paramString)
  {
    if (paramString == null) {
      return null;
    }
    try
    {
      MessageDigest localMessageDigest = MessageDigest.getInstance("MD5");
      localMessageDigest.update(paramString.getBytes());
      paramString = String.valueOf(a(localMessageDigest.digest()));
      return paramString;
    }
    catch (Exception paramString) {}
    return null;
  }
  
  public static String a(String paramString1, String paramString2)
  {
    if (paramString1 == null) {}
    for (;;)
    {
      return null;
      if (paramString2 != null) {
        try
        {
          if ((paramString2.length() >= 1) && (paramString2.length() <= 128))
          {
            paramString1 = paramString1 + paramString2;
            paramString2 = MessageDigest.getInstance("MD5");
            paramString2.update(paramString1.getBytes());
            paramString1 = String.valueOf(a(paramString2.digest()));
            return paramString1;
          }
        }
        catch (Exception paramString1) {}
      }
    }
    return null;
  }
  
  public static String a(byte[] paramArrayOfByte)
  {
    StringBuffer localStringBuffer = new StringBuffer();
    int j = paramArrayOfByte.length;
    int i = 0;
    if (i < j)
    {
      int k = paramArrayOfByte[i];
      if (k == 0) {
        localStringBuffer.append("00");
      }
      for (;;)
      {
        i += 1;
        break;
        if (k != -1) {
          break label58;
        }
        localStringBuffer.append("ff");
      }
      label58:
      String str2 = Integer.toHexString(k).toLowerCase();
      String str1;
      if (str2.length() == 8) {
        str1 = str2.substring(6, 8);
      }
      for (;;)
      {
        localStringBuffer.append(str1);
        break;
        str1 = str2;
        if (str2.length() < 2) {
          str1 = "0" + str2;
        }
      }
    }
    return localStringBuffer.toString();
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/utils/at.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */