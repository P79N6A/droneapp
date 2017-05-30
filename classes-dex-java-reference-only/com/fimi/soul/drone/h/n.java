package com.fimi.soul.drone.h;

import com.fimi.soul.drone.a;
import com.fimi.soul.drone.d.a;
import com.fimi.soul.drone.e;

public class n
  extends e
{
  public byte b;
  public byte c;
  public float d;
  public byte e;
  
  public n(a parama)
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
  
  public void a(byte paramByte1, byte paramByte2, float paramFloat, byte paramByte3)
  {
    this.b = paramByte1;
    this.c = paramByte2;
    this.d = paramFloat;
    this.e = paramByte3;
    this.a.a(d.a.aT);
  }
  
  public void a(float paramFloat)
  {
    this.d = paramFloat;
  }
  
  public byte b()
  {
    return this.c;
  }
  
  public void b(byte paramByte)
  {
    this.c = paramByte;
  }
  
  public float c()
  {
    return this.d;
  }
  
  public void c(byte paramByte)
  {
    this.e = paramByte;
  }
  
  public byte d()
  {
    return this.e;
  }
  
  public String toString()
  {
    return "DroneRTHVariable{packPacketSequence=" + this.b + ", cmdID=" + this.c + ", height=" + this.d + ", report=" + this.e + '}';
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/drone/h/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */