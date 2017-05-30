package com.google.android.gms.internal;

import java.security.MessageDigest;

@aaa
public class tu
  extends tr
{
  private MessageDigest b;
  
  byte a(int paramInt)
  {
    return (byte)(paramInt & 0xFF ^ (0xFF00 & paramInt) >> 8 ^ (0xFF0000 & paramInt) >> 16 ^ (0xFF000000 & paramInt) >> 24);
  }
  
  public byte[] a(String arg1)
  {
    int i = 4;
    byte[] arrayOfByte1 = a(???.split(" "));
    this.b = a();
    for (;;)
    {
      synchronized (this.a)
      {
        if (this.b == null) {
          return new byte[0];
        }
        this.b.reset();
        this.b.update(arrayOfByte1);
        arrayOfByte1 = this.b.digest();
        if (arrayOfByte1.length > 4)
        {
          byte[] arrayOfByte2 = new byte[i];
          System.arraycopy(arrayOfByte1, 0, arrayOfByte2, 0, arrayOfByte2.length);
          return arrayOfByte2;
        }
      }
      i = localObject.length;
    }
  }
  
  byte[] a(String[] paramArrayOfString)
  {
    int i = 0;
    Object localObject;
    if (paramArrayOfString.length == 1)
    {
      localObject = tt.b(tt.a(paramArrayOfString[0]));
      return (byte[])localObject;
    }
    if (paramArrayOfString.length < 5)
    {
      localObject = new byte[paramArrayOfString.length * 2];
      i = 0;
      while (i < paramArrayOfString.length)
      {
        arrayOfByte = b(tt.a(paramArrayOfString[i]));
        localObject[(i * 2)] = arrayOfByte[0];
        localObject[(i * 2 + 1)] = arrayOfByte[1];
        i += 1;
      }
      return (byte[])localObject;
    }
    byte[] arrayOfByte = new byte[paramArrayOfString.length];
    for (;;)
    {
      localObject = arrayOfByte;
      if (i >= paramArrayOfString.length) {
        break;
      }
      arrayOfByte[i] = a(tt.a(paramArrayOfString[i]));
      i += 1;
    }
  }
  
  byte[] b(int paramInt)
  {
    paramInt = 0xFFFF & paramInt ^ (0xFFFF0000 & paramInt) >> 16;
    return new byte[] { (byte)paramInt, (byte)(paramInt >> 8) };
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/internal/tu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */