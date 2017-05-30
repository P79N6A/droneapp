package com.fimi.soul.drone.c.a;

import java.math.BigInteger;
import java.nio.ByteBuffer;

public class d
{
  public static final int a = 512;
  public ByteBuffer b = ByteBuffer.allocate(512);
  public int c;
  
  public ByteBuffer a()
  {
    return this.b;
  }
  
  public void a(byte paramByte)
  {
    this.b.put(paramByte);
  }
  
  public void a(char paramChar)
  {
    a((byte)(paramChar >> '\000'));
    a((byte)(paramChar >> '\b'));
  }
  
  public void a(double paramDouble)
  {
    b(Double.doubleToLongBits(paramDouble));
  }
  
  public void a(float paramFloat)
  {
    b(Float.floatToIntBits(paramFloat));
  }
  
  public void a(int paramInt)
  {
    a((byte)(paramInt >> 0));
    a((byte)(paramInt >> 8));
    a((byte)(paramInt >> 16));
  }
  
  public void a(long paramLong)
  {
    a((byte)(int)(paramLong >> 0));
    a((byte)(int)(paramLong >> 8));
    a((byte)(int)(paramLong >> 16));
    a((byte)(int)(paramLong >> 24));
  }
  
  public void a(short paramShort)
  {
    a((byte)(paramShort >> 0));
    a((byte)(paramShort >> 8));
  }
  
  public int b()
  {
    return this.b.position() + 1;
  }
  
  public void b(byte paramByte)
  {
    a(paramByte);
  }
  
  public void b(int paramInt)
  {
    a((byte)(paramInt >> 0));
    a((byte)(paramInt >> 8));
    a((byte)(paramInt >> 16));
    a((byte)(paramInt >> 24));
  }
  
  public void b(long paramLong)
  {
    a((byte)(int)(paramLong >> 0));
    a((byte)(int)(paramLong >> 8));
    a((byte)(int)(paramLong >> 16));
    a((byte)(int)(paramLong >> 24));
    a((byte)(int)(paramLong >> 32));
    a((byte)(int)(paramLong >> 40));
    a((byte)(int)(paramLong >> 48));
    a((byte)(int)(paramLong >> 56));
  }
  
  public void c()
  {
    this.c = 0;
  }
  
  public void c(int paramInt)
  {
    this.c = paramInt;
  }
  
  public byte d()
  {
    byte b1 = (byte)(0x0 | this.b.get(this.c + 0) & 0xFF);
    this.c += 1;
    return b1;
  }
  
  public short e()
  {
    short s = (short)((short)(0x0 | (this.b.get(this.c + 1) & 0xFF) << 8) | this.b.get(this.c + 0) & 0xFF);
    this.c += 2;
    return s;
  }
  
  public int f()
  {
    int i = this.b.get(this.c + 3);
    int j = this.b.get(this.c + 2);
    int k = this.b.get(this.c + 1);
    int m = this.b.get(this.c + 0);
    this.c += 4;
    return 0x0 | (i & 0xFF) << 24 | (j & 0xFF) << 16 | (k & 0xFF) << 8 | m & 0xFF;
  }
  
  public long g()
  {
    long l1 = this.b.get(this.c + 7);
    long l2 = this.b.get(this.c + 6);
    long l3 = this.b.get(this.c + 5);
    long l4 = this.b.get(this.c + 4);
    long l5 = this.b.get(this.c + 3);
    long l6 = this.b.get(this.c + 2);
    long l7 = this.b.get(this.c + 1);
    long l8 = this.b.get(this.c + 0);
    this.c += 8;
    return 0L | (l1 & 0xFF) << 56 | (l2 & 0xFF) << 48 | (l3 & 0xFF) << 40 | (l4 & 0xFF) << 32 | (l5 & 0xFF) << 24 | (l6 & 0xFF) << 16 | (l7 & 0xFF) << 8 | l8 & 0xFF;
  }
  
  public long h()
  {
    long l1 = this.b.get(this.c + 0);
    long l2 = this.b.get(this.c + 1);
    long l3 = this.b.get(this.c + 2);
    long l4 = this.b.get(this.c + 3);
    long l5 = this.b.get(this.c + 4);
    long l6 = this.b.get(this.c + 5);
    long l7 = this.b.get(this.c + 6);
    long l8 = this.b.get(this.c + 7);
    this.c += 8;
    return 0L | (l1 & 0xFF) << 56 | (l2 & 0xFF) << 48 | (l3 & 0xFF) << 40 | (l4 & 0xFF) << 32 | (l5 & 0xFF) << 24 | (l6 & 0xFF) << 16 | (l7 & 0xFF) << 8 | l8 & 0xFF;
  }
  
  public float i()
  {
    return Float.intBitsToFloat(f());
  }
  
  public float j()
  {
    BigInteger localBigInteger = new BigInteger(1, new byte[] { (byte)(this.b.get(this.c + 2) & 0xFF | 0x0), (byte)(this.b.get(this.c + 1) & 0xFF | 0x0), (byte)(this.b.get(this.c + 0) & 0xFF | 0x0) });
    this.c += 3;
    return Float.parseFloat(localBigInteger.toString());
  }
  
  public Double k()
  {
    return Double.valueOf(Double.longBitsToDouble(g()));
  }
  
  public char l()
  {
    char c1 = (char)((char)(0x0 | (this.b.get(this.c + 1) & 0xFF) << 8) | this.b.get(this.c + 0) & 0xFF);
    this.c += 2;
    return c1;
  }
  
  public long m()
  {
    long l1 = this.b.get(this.c + 3);
    long l2 = this.b.get(this.c + 2);
    long l3 = this.b.get(this.c + 1);
    long l4 = this.b.get(this.c + 0);
    this.c += 4;
    return 0L | (l1 & 0xFF) << 24 | (l2 & 0xFF) << 16 | (l3 & 0xFF) << 8 | l4 & 0xFF;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/drone/c/a/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */