package com.fimi.kernel.utils;

import java.text.DecimalFormat;

public class t
{
  private static byte a(char paramChar)
  {
    return (byte)"0123456789ABCDEF".indexOf(paramChar);
  }
  
  public static double a(double paramDouble)
  {
    return a(paramDouble / 0.3048D, 1);
  }
  
  public static double a(double paramDouble, int paramInt)
  {
    if (paramInt == 1) {}
    try
    {
      return Double.valueOf(new DecimalFormat("0.0").format(paramDouble)).doubleValue();
    }
    catch (Exception localException)
    {
      double d;
      localException.printStackTrace();
    }
    if (paramInt == 2) {
      return Double.valueOf(new DecimalFormat("0.00").format(paramDouble)).doubleValue();
    }
    if (paramInt == 7)
    {
      d = Double.valueOf(new DecimalFormat("0.0000000").format(paramDouble)).doubleValue();
      return d;
    }
    return paramDouble;
  }
  
  public static String a(byte[] paramArrayOfByte)
  {
    StringBuilder localStringBuilder = new StringBuilder("");
    if ((paramArrayOfByte == null) || (paramArrayOfByte.length <= 0)) {
      return null;
    }
    int i = 0;
    while (i < paramArrayOfByte.length)
    {
      String str = Integer.toHexString(paramArrayOfByte[i] & 0xFF);
      if (str.length() < 2) {
        localStringBuilder.append(0);
      }
      localStringBuilder.append(str);
      i += 1;
    }
    return localStringBuilder.toString();
  }
  
  public static byte[] a(String paramString)
  {
    if ((paramString == null) || (paramString.equals("")))
    {
      paramString = null;
      return paramString;
    }
    paramString = paramString.toUpperCase();
    int j = paramString.length() / 2;
    char[] arrayOfChar = paramString.toCharArray();
    byte[] arrayOfByte = new byte[j];
    int i = 0;
    for (;;)
    {
      paramString = arrayOfByte;
      if (i >= j) {
        break;
      }
      int k = i * 2;
      int m = a(arrayOfChar[k]);
      arrayOfByte[i] = ((byte)(a(arrayOfChar[(k + 1)]) | m << 4));
      i += 1;
    }
  }
  
  public static double b(double paramDouble)
  {
    return a(2.2369D * paramDouble, 1);
  }
  
  public static String b(double paramDouble, int paramInt)
  {
    if (paramInt == 1) {
      return new DecimalFormat("0.0").format(paramDouble);
    }
    if (paramInt == 2) {
      return new DecimalFormat("0.00").format(paramDouble);
    }
    if (paramInt == 7) {
      return new DecimalFormat("0.0000000").format(paramDouble);
    }
    return paramDouble + "";
  }
  
  public static double c(double paramDouble)
  {
    return a(paramDouble / 2.2369D, 1);
  }
  
  public static double d(double paramDouble)
  {
    return a(0.3048D * paramDouble, 1);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/kernel/utils/t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */