package com.fimi.soul.drone.f;

import java.util.ArrayList;
import java.util.List;

public class a
{
  public static int[] a(byte[] paramArrayOfByte)
  {
    int j = 0;
    int i = paramArrayOfByte.length;
    ArrayList localArrayList = new ArrayList();
    byte[] arrayOfByte = new byte[4];
    i = 0;
    if (i < paramArrayOfByte.length)
    {
      if ((paramArrayOfByte.length - i < 4) && (paramArrayOfByte.length % 4 == 1))
      {
        arrayOfByte[0] = paramArrayOfByte[i];
        arrayOfByte[1] = 0;
        arrayOfByte[2] = 0;
        arrayOfByte[3] = 0;
      }
      for (;;)
      {
        localArrayList.add(b(arrayOfByte));
        arrayOfByte = new byte[4];
        i += 4;
        break;
        if ((paramArrayOfByte.length - i < 4) && (paramArrayOfByte.length % 4 == 2))
        {
          arrayOfByte[0] = paramArrayOfByte[i];
          arrayOfByte[1] = paramArrayOfByte[(i + 1)];
          arrayOfByte[2] = 0;
          arrayOfByte[3] = 0;
        }
        else if ((paramArrayOfByte.length - i < 4) && (paramArrayOfByte.length % 4 == 3))
        {
          arrayOfByte[0] = paramArrayOfByte[i];
          arrayOfByte[1] = paramArrayOfByte[(i + 1)];
          arrayOfByte[2] = paramArrayOfByte[(i + 2)];
          arrayOfByte[3] = 0;
        }
        else
        {
          arrayOfByte[0] = paramArrayOfByte[i];
          arrayOfByte[1] = paramArrayOfByte[(i + 1)];
          arrayOfByte[2] = paramArrayOfByte[(i + 2)];
          arrayOfByte[3] = paramArrayOfByte[(i + 3)];
        }
      }
    }
    paramArrayOfByte = new int[localArrayList.size()];
    i = j;
    while (i < localArrayList.size())
    {
      paramArrayOfByte[i] = c((byte[])localArrayList.get(i));
      i += 1;
    }
    return paramArrayOfByte;
  }
  
  public static byte[] b(byte[] paramArrayOfByte)
  {
    byte[] arrayOfByte = new byte[4];
    int i = 0;
    while (i < paramArrayOfByte.length)
    {
      arrayOfByte[i] = paramArrayOfByte[(paramArrayOfByte.length - i - 1)];
      i += 1;
    }
    return arrayOfByte;
  }
  
  public static int c(byte[] paramArrayOfByte)
  {
    return paramArrayOfByte[3] & 0xFF | (paramArrayOfByte[2] & 0xFF) << 8 | (paramArrayOfByte[1] & 0xFF) << 16 | (paramArrayOfByte[0] & 0xFF) << 24;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/drone/f/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */