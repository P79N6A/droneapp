package com.fimi.soul.drone.h;

import com.fimi.soul.drone.a;
import com.fimi.soul.drone.d.a;
import com.fimi.soul.drone.e;

public class c
  extends e
{
  public byte b;
  public byte c;
  public byte d;
  
  public c() {}
  
  public c(a parama)
  {
    super(parama);
  }
  
  public byte a()
  {
    return this.d;
  }
  
  public void a(byte paramByte1, byte paramByte2, byte paramByte3)
  {
    this.b = paramByte1;
    this.c = paramByte2;
    this.d = paramByte3;
    if (this.a != null) {
      this.a.a(d.a.ah);
    }
  }
  
  public byte b()
  {
    return this.b;
  }
  
  public byte c()
  {
    return this.c;
  }
  
  public byte d()
  {
    return this.d;
  }
  
  public String toString()
  {
    return "BackControl [model=" + this.b + ", status=" + this.c + ", action=" + this.d + "]";
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/drone/h/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */