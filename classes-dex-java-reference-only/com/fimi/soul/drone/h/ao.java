package com.fimi.soul.drone.h;

import com.fimi.soul.drone.a;
import com.fimi.soul.drone.d.a;
import com.fimi.soul.drone.e;

public class ao
  extends e
{
  private byte b;
  private byte c;
  private byte d;
  private byte e;
  private byte f;
  private byte g;
  
  public ao() {}
  
  public ao(a parama)
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
  
  public void a(byte paramByte1, byte paramByte2, byte paramByte3, byte paramByte4, byte paramByte5, byte paramByte6)
  {
    this.b = paramByte1;
    this.c = paramByte2;
    this.d = paramByte3;
    this.e = paramByte4;
    this.f = paramByte5;
    this.g = paramByte6;
    if (this.a != null) {
      this.a.a(d.a.ag);
    }
  }
  
  public byte b()
  {
    return this.c;
  }
  
  public void b(byte paramByte)
  {
    this.g = paramByte;
  }
  
  public byte c()
  {
    return this.d;
  }
  
  public byte d()
  {
    return this.e;
  }
  
  public byte e()
  {
    return this.f;
  }
  
  public byte f()
  {
    return this.g;
  }
  
  public boolean g()
  {
    boolean bool = false;
    if (com.fimi.soul.utils.ao.a(this.f, Math.abs(0)) > 0) {
      bool = true;
    }
    return bool;
  }
  
  public boolean h()
  {
    return com.fimi.soul.utils.ao.a(this.f, Math.abs(1)) > 0;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/drone/h/ao.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */