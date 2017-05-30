package com.fimi.soul.drone.g;

public class b
{
  public static long a(int[] paramArrayOfInt, int paramInt)
  {
    long l1 = -1L;
    int j = 0;
    int i = paramInt;
    paramInt = j;
    for (;;)
    {
      if (i > 0)
      {
        long l4 = 2147483648L;
        long l5 = paramArrayOfInt[paramInt];
        long l3 = 0L;
        if (l3 < 32L)
        {
          if ((0x80000000 & l1) == 2147483648L) {}
          for (long l2 = l1 << 1 & 0xFFFFFFFF ^ 0x4C11DB7;; l2 = l1 << 1 & 0xFFFFFFFF)
          {
            l1 = l2;
            if ((l5 & l4) == l4) {
              l1 = l2 ^ 0x4C11DB7;
            }
            l4 >>= 1;
            l3 += 1L;
            break;
          }
        }
      }
      else
      {
        return l1;
      }
      i -= 1;
      paramInt += 1;
    }
  }
  
  public static byte[] a(int paramInt)
  {
    byte[] arrayOfByte = new byte[4];
    int i = 0;
    while (i < arrayOfByte.length)
    {
      arrayOfByte[i] = ((byte)(paramInt >> i * 8 & 0xFF));
      i += 1;
    }
    return arrayOfByte;
  }
  
  public static byte[] a(long paramLong)
  {
    byte[] arrayOfByte = new byte[4];
    int i = 0;
    while (i < arrayOfByte.length)
    {
      arrayOfByte[i] = ((byte)(int)(paramLong >> i * 8 & 0xFF));
      i += 1;
    }
    return arrayOfByte;
  }
  
  public static byte[] a(short paramShort)
  {
    byte[] arrayOfByte = new byte[2];
    int i = 0;
    while (i < arrayOfByte.length)
    {
      arrayOfByte[i] = ((byte)(paramShort >> i * 8 & 0xFF));
      i += 1;
    }
    return arrayOfByte;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/drone/g/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */