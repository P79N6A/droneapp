package com.fimi.soul.drone.h;

import com.fimi.soul.drone.a;
import com.fimi.soul.drone.d.a;
import com.fimi.soul.drone.e;

public class j
  extends e
{
  private byte b;
  private byte c;
  private byte d;
  private byte e;
  private byte f;
  
  public j(a parama)
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
  
  public void a(byte paramByte1, byte paramByte2, byte paramByte3, byte paramByte4, byte paramByte5)
  {
    this.b = paramByte1;
    this.c = paramByte2;
    this.d = paramByte3;
    this.e = paramByte4;
    this.f = paramByte5;
    this.a.a(d.a.ba);
  }
  
  public byte b()
  {
    return this.f;
  }
  
  public void b(byte paramByte)
  {
    this.f = paramByte;
  }
  
  public byte c()
  {
    return this.e;
  }
  
  public void c(byte paramByte)
  {
    this.e = paramByte;
  }
  
  public byte d()
  {
    return this.d;
  }
  
  public void d(byte paramByte)
  {
    this.d = paramByte;
  }
  
  public byte e()
  {
    return this.c;
  }
  
  public void e(byte paramByte)
  {
    this.c = paramByte;
  }
  
  public String toString()
  {
    return "Compass{packetSeq=" + this.b + ", caliType=" + this.c + ", caliStep=" + this.d + ", caliStepStatus=" + this.e + ", report=" + this.f + '}';
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/drone/h/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */