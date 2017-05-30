package com.fimi.soul.utils;

import java.security.SecureRandom;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;

public class h
{
  private static final String a = "0123456789ABCDEF";
  
  public static String a(String paramString1, String paramString2)
  {
    try
    {
      paramString2 = new String(b(a(paramString1), paramString2));
      return paramString2;
    }
    catch (Exception paramString2)
    {
      paramString2.printStackTrace();
    }
    return paramString1;
  }
  
  private static String a(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte == null) {
      return "";
    }
    StringBuffer localStringBuffer = new StringBuffer(paramArrayOfByte.length * 2);
    int i = 0;
    while (i < paramArrayOfByte.length)
    {
      a(localStringBuffer, paramArrayOfByte[i]);
      i += 1;
    }
    return localStringBuffer.toString();
  }
  
  private static void a(StringBuffer paramStringBuffer, byte paramByte)
  {
    paramStringBuffer.append("0123456789ABCDEF".charAt(paramByte >> 4 & 0xF)).append("0123456789ABCDEF".charAt(paramByte & 0xF));
  }
  
  private static byte[] a(String paramString)
  {
    int j = paramString.length() / 2;
    byte[] arrayOfByte = new byte[j];
    int i = 0;
    while (i < j)
    {
      arrayOfByte[i] = Integer.valueOf(paramString.substring(i * 2, i * 2 + 2), 16).byteValue();
      i += 1;
    }
    return arrayOfByte;
  }
  
  private static byte[] a(byte[] paramArrayOfByte, String paramString)
  {
    try
    {
      SecureRandom localSecureRandom = new SecureRandom();
      paramString = new DESKeySpec(paramString.getBytes("utf-8"));
      paramString = SecretKeyFactory.getInstance("DES").generateSecret(paramString);
      Cipher localCipher = Cipher.getInstance("DES");
      localCipher.init(1, paramString, localSecureRandom);
      paramArrayOfByte = localCipher.doFinal(paramArrayOfByte);
      return paramArrayOfByte;
    }
    catch (Throwable paramArrayOfByte)
    {
      paramArrayOfByte.printStackTrace();
    }
    return null;
  }
  
  public static String b(String paramString1, String paramString2)
  {
    try
    {
      paramString2 = a(a(paramString1.getBytes("utf-8"), paramString2));
      return paramString2;
    }
    catch (Exception paramString2)
    {
      paramString2.printStackTrace();
    }
    return paramString1;
  }
  
  private static byte[] b(byte[] paramArrayOfByte, String paramString)
  {
    SecureRandom localSecureRandom = new SecureRandom();
    paramString = new DESKeySpec(paramString.getBytes("utf-8"));
    paramString = SecretKeyFactory.getInstance("DES").generateSecret(paramString);
    Cipher localCipher = Cipher.getInstance("DES");
    localCipher.init(2, paramString, localSecureRandom);
    return localCipher.doFinal(paramArrayOfByte);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/utils/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */