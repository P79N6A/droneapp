package com.fimi.soul.drone.h;

import com.fimi.soul.drone.a;
import com.fimi.soul.drone.e;

public class x
  extends e
{
  private byte b = 0;
  private short c = 0;
  private byte d = 0;
  
  public x(a parama)
  {
    super(parama);
  }
  
  public byte a()
  {
    return this.b;
  }
  
  public void a(byte paramByte)
  {
    this.b = paramByte;
  }
  
  public void a(short paramShort)
  {
    this.c = ((short)(paramShort & 0xFF));
  }
  
  public short b()
  {
    return this.c;
  }
  
  public void b(byte paramByte)
  {
    this.d = paramByte;
  }
  
  public byte c()
  {
    return this.d;
  }
  
  public String toString()
  {
    return "GimbalVariable [pitch_angle=" + this.c;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/drone/h/x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */