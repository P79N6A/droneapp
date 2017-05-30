package com.b.a.a.a.b;

import com.b.a.c.d;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class c
  implements a
{
  private static final String a = "MD5";
  private static final int b = 36;
  
  private byte[] a(byte[] paramArrayOfByte)
  {
    try
    {
      MessageDigest localMessageDigest = MessageDigest.getInstance("MD5");
      localMessageDigest.update(paramArrayOfByte);
      paramArrayOfByte = localMessageDigest.digest();
      return paramArrayOfByte;
    }
    catch (NoSuchAlgorithmException paramArrayOfByte)
    {
      d.a(paramArrayOfByte);
    }
    return null;
  }
  
  public String a(String paramString)
  {
    return new BigInteger(a(paramString.getBytes())).abs().toString(36);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/b/a/a/a/b/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */