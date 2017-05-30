package com.fimi.soul.drone.h;

import com.fimi.soul.drone.a;
import com.fimi.soul.drone.c.a.c;
import com.fimi.soul.drone.c.a.d;
import com.fimi.soul.drone.d.a;
import com.fimi.soul.drone.e;

public class ac
  extends e
{
  public static final int b = 0;
  public static final int c = 1;
  public static final int d = 2;
  public static final int e = 3;
  public byte f;
  public byte g;
  public byte h;
  public byte i;
  public float j;
  public byte k;
  public byte l = 0;
  private boolean m;
  private boolean n = false;
  private boolean o = true;
  
  public ac(a parama)
  {
    super(parama);
  }
  
  private void k()
  {
    if (this.f == 34) {
      if ((this.h == 1) || (this.h == 3))
      {
        if (((int)this.j & 0x1) == 1) {
          this.m = false;
        }
        if (((int)this.j & 0x2) == 2)
        {
          this.m = false;
          this.n = true;
        }
        if (((int)this.j & 0x4) == 4)
        {
          this.m = true;
          this.n = false;
        }
      }
    }
    while ((this.f != 51) || (this.h != 3) || (this.i != 4)) {
      return;
    }
    if (this.j == 1.0F)
    {
      this.m = true;
      return;
    }
    this.m = false;
  }
  
  public void a(byte paramByte)
  {
    this.l = paramByte;
  }
  
  public void a(byte paramByte1, byte paramByte2, byte paramByte3, byte paramByte4, int paramInt, byte paramByte5)
  {
    this.f = paramByte1;
    this.g = paramByte2;
    this.h = paramByte3;
    this.i = paramByte4;
    this.j = paramInt;
    this.k = paramByte5;
    this.a.a(d.a.bd);
  }
  
  public void a(c paramc)
  {
    paramc = paramc.d;
    paramc.c();
    this.f = paramc.d();
    this.g = paramc.d();
    paramc.d();
    paramc.d();
    paramc.d();
    paramc.d();
    this.k = paramc.d();
    this.a.a(d.a.bd);
  }
  
  public void a(boolean paramBoolean)
  {
    this.o = paramBoolean;
  }
  
  public boolean a()
  {
    return this.n;
  }
  
  public byte b()
  {
    return this.l;
  }
  
  public void b(c paramc)
  {
    paramc = paramc.d;
    paramc.c();
    this.f = paramc.d();
    this.g = paramc.d();
    this.h = paramc.d();
    this.i = paramc.d();
    if (this.h == 4) {}
    for (this.j = paramc.i();; this.j = paramc.f())
    {
      this.k = paramc.d();
      k();
      this.a.a(d.a.bd);
      return;
    }
  }
  
  public void b(boolean paramBoolean)
  {
    this.m = paramBoolean;
  }
  
  public boolean c()
  {
    return this.o;
  }
  
  public byte d()
  {
    return this.f;
  }
  
  public byte e()
  {
    return this.g;
  }
  
  public byte f()
  {
    return this.h;
  }
  
  public byte g()
  {
    return this.i;
  }
  
  public float h()
  {
    return this.j;
  }
  
  public byte i()
  {
    return this.k;
  }
  
  public boolean j()
  {
    return this.m;
  }
  
  public String toString()
  {
    return "NewHandDroneVariable{report=" + this.k + ", valueToBeOperate=" + this.j + ", byteCode=" + this.i + ", targetByteID=" + this.h + ", pilotMode=" + this.g + ", operation=" + this.f + '}';
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/drone/h/ac.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */