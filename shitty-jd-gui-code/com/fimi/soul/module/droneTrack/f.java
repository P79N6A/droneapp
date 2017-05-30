package com.fimi.soul.module.droneTrack;

import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class f
{
  public static final int c = 256;
  public ByteBuffer a;
  public int b;
  
  public f(char[] paramArrayOfChar)
  {
    try
    {
      this.a = ByteBuffer.allocate(256);
      if (paramArrayOfChar != null)
      {
        while (i < paramArrayOfChar.length - 1)
        {
          String str = paramArrayOfChar[i] + "" + paramArrayOfChar[(i + 1)];
          this.a.put((byte)Integer.parseInt(str, 16));
          i += 2;
        }
        this.b = 0;
      }
      return;
    }
    catch (Exception paramArrayOfChar) {}
  }
  
  public byte a()
  {
    byte b1 = (byte)(0x0 | this.a.get(this.b + 0) & 0xFF);
    this.b += 1;
    return b1;
  }
  
  public boolean a(String paramString)
  {
    return Pattern.compile("[0-9a-zA-Z]*").matcher(paramString).matches();
  }
  
  public short b()
  {
    short s = (short)((short)(0x0 | (this.a.get(this.b + 1) & 0xFF) << 8) | this.a.get(this.b + 0) & 0xFF);
    this.b += 2;
    return s;
  }
  
  public int c()
  {
    int i = this.a.get(this.b + 3);
    int j = this.a.get(this.b + 2);
    int k = this.a.get(this.b + 1);
    int m = this.a.get(this.b + 0);
    this.b += 4;
    return 0x0 | (i & 0xFF) << 24 | (j & 0xFF) << 16 | (k & 0xFF) << 8 | m & 0xFF;
  }
  
  public long d()
  {
    long l1 = this.a.get(this.b + 7);
    long l2 = this.a.get(this.b + 6);
    long l3 = this.a.get(this.b + 5);
    long l4 = this.a.get(this.b + 4);
    long l5 = this.a.get(this.b + 3);
    long l6 = this.a.get(this.b + 2);
    long l7 = this.a.get(this.b + 1);
    long l8 = this.a.get(this.b + 0);
    this.b += 8;
    return 0L | (l1 & 0xFF) << 56 | (l2 & 0xFF) << 48 | (l3 & 0xFF) << 40 | (l4 & 0xFF) << 32 | (l5 & 0xFF) << 24 | (l6 & 0xFF) << 16 | (l7 & 0xFF) << 8 | l8 & 0xFF;
  }
  
  public long e()
  {
    long l1 = this.a.get(this.b + 0);
    long l2 = this.a.get(this.b + 1);
    long l3 = this.a.get(this.b + 2);
    long l4 = this.a.get(this.b + 3);
    long l5 = this.a.get(this.b + 4);
    long l6 = this.a.get(this.b + 5);
    long l7 = this.a.get(this.b + 6);
    long l8 = this.a.get(this.b + 7);
    this.b += 8;
    return 0L | (l1 & 0xFF) << 56 | (l2 & 0xFF) << 48 | (l3 & 0xFF) << 40 | (l4 & 0xFF) << 32 | (l5 & 0xFF) << 24 | (l6 & 0xFF) << 16 | (l7 & 0xFF) << 8 | l8 & 0xFF;
  }
  
  public float f()
  {
    return Float.intBitsToFloat(c());
  }
  
  public float g()
  {
    BigInteger localBigInteger = new BigInteger(1, new byte[] { (byte)(this.a.get(this.b + 2) & 0xFF | 0x0), (byte)(this.a.get(this.b + 1) & 0xFF | 0x0), (byte)(this.a.get(this.b + 0) & 0xFF | 0x0) });
    this.b += 3;
    return Float.parseFloat(localBigInteger.toString());
  }
  
  public Double h()
  {
    return Double.valueOf(Double.longBitsToDouble(d()));
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/module/droneTrack/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */