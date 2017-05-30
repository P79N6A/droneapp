package com.fimi.soul.drone.h;

import com.fimi.soul.drone.a;
import com.fimi.soul.drone.d.a;
import com.fimi.soul.drone.e;

public class az
  extends e
{
  public byte b;
  public short c;
  public byte d;
  
  public az(a parama)
  {
    super(parama);
  }
  
  public short a()
  {
    return this.c;
  }
  
  public void a(byte paramByte1, short paramShort, byte paramByte2)
  {
    this.b = paramByte1;
    this.c = paramShort;
    this.d = paramByte2;
    this.a.a(d.a.a);
  }
  
  public byte b()
  {
    return this.d;
  }
  
  public byte c()
  {
    return this.b;
  }
  
  public String toString()
  {
    return "UpdateDronerepory{target_ID=" + this.b + ", Packet_sequence=" + this.c + ", report=" + this.d + '}';
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/drone/h/az.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */