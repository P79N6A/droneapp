package com.fimi.soul.drone.f;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;

public class c
{
  public static byte[] a(InputStream paramInputStream)
  {
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    byte[] arrayOfByte = new byte['࿐'];
    try
    {
      for (;;)
      {
        int i = paramInputStream.read(arrayOfByte);
        if (i == -1) {
          break;
        }
        localByteArrayOutputStream.write(arrayOfByte, 0, i);
      }
      return localByteArrayOutputStream.toByteArray();
    }
    catch (Exception paramInputStream)
    {
      paramInputStream.printStackTrace();
    }
    for (;;)
    {
      localByteArrayOutputStream.flush();
      localByteArrayOutputStream.close();
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/drone/f/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */