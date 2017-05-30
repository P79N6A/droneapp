package com.fimi.soul.drone.c.a.a;

import com.fimi.soul.drone.c.a.b;
import com.fimi.soul.drone.c.a.c;
import com.fimi.soul.drone.c.a.d;
import java.io.Serializable;

public class m
  extends b
  implements Serializable
{
  public static final byte b = 115;
  public static final byte c = 1;
  public static final byte d = 0;
  public static final byte e = 1;
  public static final byte f = 2;
  public byte g;
  public byte h;
  public byte i;
  public byte j;
  private final byte k = 52;
  private byte l = 0;
  
  public m()
  {
    this.a = 52;
  }
  
  public c a()
  {
    c localc = new c();
    localc.c = 52;
    localc.b = 2;
    localc.d.b((byte)1);
    localc.d.b((byte)1);
    return localc;
  }
  
  public void a(byte paramByte)
  {
    switch (paramByte)
    {
    default: 
      return;
    case 1: 
      this.l = 1;
      return;
    case 2: 
      this.l = 2;
      return;
    }
    this.l = 0;
  }
  
  public void a(c paramc)
  {
    a(paramc.d);
  }
  
  public void a(d paramd)
  {
    paramd.c();
    this.g = paramd.d();
    this.h = paramd.d();
    this.i = paramd.d();
    this.j = paramd.d();
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/drone/c/a/a/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */