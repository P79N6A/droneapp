package com.fimi.soul.drone.c.a.a;

import com.fimi.soul.drone.c.a.b;
import com.fimi.soul.drone.c.a.c;
import com.fimi.soul.drone.c.a.d;
import java.io.Serializable;

public class k
  extends b
  implements Serializable
{
  public final int b = 136;
  private byte c = 19;
  private byte[] d = new byte[2];
  private byte[] e;
  private byte f;
  private byte g;
  private byte h;
  private byte i;
  private byte j = 0;
  private byte k;
  private byte l;
  private byte m;
  private boolean n = false;
  private boolean o = true;
  private boolean p = false;
  
  public k()
  {
    this.a = 136;
  }
  
  private c o()
  {
    int i1 = 0;
    c localc = new c();
    localc.c = 136;
    if (this.o)
    {
      localc.b = 19;
      if ((this.e != null) && (this.e.length > 0))
      {
        byte[] arrayOfByte = this.e;
        int i2 = arrayOfByte.length;
        while (i1 < i2)
        {
          byte b1 = arrayOfByte[i1];
          localc.d.b(b1);
          i1 += 1;
        }
      }
    }
    else
    {
      localc.b = 10;
      localc.d.b((byte)0);
      localc.d.b((byte)0);
      localc.d.b((byte)13);
      localc.d.b((byte)1);
      localc.d.b(this.j);
      localc.d.b((byte)0);
      localc.d.b((byte)0);
      localc.d.b((byte)0);
      localc.d.b(this.l);
      localc.d.b((byte)0);
    }
    return localc;
  }
  
  private c p()
  {
    int i1 = 0;
    c localc = new c();
    localc.c = 136;
    localc.d.b((byte)0);
    localc.d.b((byte)0);
    localc.d.b((byte)13);
    if (this.o)
    {
      localc.d.b((byte)0);
      if (this.p)
      {
        localc.b = 26;
        localc.d.b((byte)0);
        localc.d.b(this.d[0]);
        localc.d.b(this.d[1]);
        if (this.o) {
          break label198;
        }
        localc.d.b((byte)0);
        localc.d.b((byte)0);
        localc.d.b((byte)0);
      }
    }
    for (;;)
    {
      return localc;
      localc.b = 36;
      localc.d.b((byte)1);
      break;
      localc.b = 10;
      localc.d.b((byte)1);
      localc.d.b((byte)0);
      break;
      label198:
      if ((this.e != null) && (this.e.length > 0))
      {
        byte[] arrayOfByte = this.e;
        int i2 = arrayOfByte.length;
        while (i1 < i2)
        {
          byte b1 = arrayOfByte[i1];
          localc.d.b(b1);
          i1 += 1;
        }
      }
    }
  }
  
  public c a()
  {
    if (this.n) {
      return p();
    }
    return o();
  }
  
  public void a(byte paramByte)
  {
    this.c = paramByte;
  }
  
  public void a(c paramc)
  {
    a(paramc.d);
  }
  
  public void a(d paramd)
  {
    paramd.c();
    this.g = paramd.d();
    this.f = paramd.d();
    this.h = paramd.d();
    this.i = paramd.d();
    this.j = paramd.d();
    this.d[0] = paramd.d();
    this.d[1] = paramd.d();
    this.k = paramd.d();
    this.l = paramd.d();
    this.m = paramd.d();
    int i1 = this.g;
    i1 = this.f;
    i1 = this.h;
    i1 = this.i;
    k();
    i1 = this.d[0];
    i1 = this.d[1];
    i1 = this.k;
    i1 = this.l;
    i1 = this.m;
  }
  
  public void a(boolean paramBoolean)
  {
    this.n = paramBoolean;
  }
  
  public void a(byte[] paramArrayOfByte)
  {
    this.d = paramArrayOfByte;
  }
  
  public void b(byte paramByte)
  {
    this.i = paramByte;
  }
  
  public void b(boolean paramBoolean)
  {
    this.p = paramBoolean;
  }
  
  public void b(byte[] paramArrayOfByte)
  {
    this.e = paramArrayOfByte;
  }
  
  public boolean b()
  {
    return this.n;
  }
  
  public void c(byte paramByte)
  {
    this.f = paramByte;
  }
  
  public void c(boolean paramBoolean)
  {
    this.o = paramBoolean;
  }
  
  public boolean c()
  {
    return this.p;
  }
  
  public void d(byte paramByte)
  {
    this.h = paramByte;
  }
  
  public boolean d()
  {
    return this.o;
  }
  
  public byte e()
  {
    return this.c;
  }
  
  public void e(byte paramByte)
  {
    this.j = paramByte;
  }
  
  public void f(byte paramByte)
  {
    this.k = paramByte;
  }
  
  public byte[] f()
  {
    return this.d;
  }
  
  public byte g()
  {
    return this.i;
  }
  
  public void g(byte paramByte)
  {
    this.l = paramByte;
  }
  
  public void h(byte paramByte)
  {
    this.m = paramByte;
  }
  
  public byte[] h()
  {
    return this.e;
  }
  
  public byte i()
  {
    return this.f;
  }
  
  public byte j()
  {
    return this.h;
  }
  
  public byte k()
  {
    return this.j;
  }
  
  public byte l()
  {
    return this.k;
  }
  
  public byte m()
  {
    return this.l;
  }
  
  public byte n()
  {
    return this.m;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/drone/c/a/a/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */