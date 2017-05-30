package com.fimi.soul.drone.h;

import com.fimi.soul.drone.c.a.d;

public class g
  extends a
{
  private i.b a = i.b.a;
  private a b = a.a;
  private b c = b.a;
  private c d = c.a;
  private byte e;
  private byte f;
  private byte g;
  private byte h;
  
  private i.b a(byte paramByte)
  {
    if (paramByte == 1) {
      return i.b.a;
    }
    if (paramByte == 2) {
      return i.b.b;
    }
    return this.a;
  }
  
  private b b(byte paramByte)
  {
    if (paramByte == 1) {
      return b.a;
    }
    if (paramByte == 2) {
      return b.b;
    }
    if (paramByte == 3) {
      return b.c;
    }
    return b.d;
  }
  
  private c c(byte paramByte)
  {
    if (paramByte == 1) {
      return c.b;
    }
    return c.a;
  }
  
  public void a(d paramd)
  {
    paramd.c();
    byte b1 = paramd.d();
    this.e = b1;
    this.f = paramd.d();
    this.g = paramd.d();
    this.h = paramd.d();
    int i = (byte)(b1 & 0x3);
    b1 = (byte)(b1 >>> 2 & 0x3);
    a(b1);
    b1 = (byte)(b1 >>> 2 & 0x3);
    b(b1);
    c((byte)(b1 >>> 2 & 0x3));
  }
  
  public void a(a parama)
  {
    this.b = parama;
  }
  
  public void a(b paramb)
  {
    this.c = paramb;
  }
  
  public void a(c paramc)
  {
    this.d = paramc;
  }
  
  public void a(i.b paramb)
  {
    this.a = paramb;
  }
  
  public int b()
  {
    return this.e & 0xFF;
  }
  
  public i.b c()
  {
    return this.a;
  }
  
  public long d()
  {
    long l = 0L;
    if (this.e == 1) {
      l = this.f & this.g * 16 + 255;
    }
    if (this.e == 2) {
      l = this.f * 60 * 60 * 1000 + this.g * 60 * 1000 + this.h * 1000;
    }
    return l;
  }
  
  public int e()
  {
    return this.f;
  }
  
  public a f()
  {
    if (this.e == 0) {
      return a.a;
    }
    if (this.e == 1) {
      return a.b;
    }
    if (this.e == 2) {
      return a.c;
    }
    if (this.e == 3) {
      return a.v;
    }
    if (this.e == 16) {
      return a.e;
    }
    if (this.e == 17) {
      return a.o;
    }
    if (this.e == 18) {
      return a.p;
    }
    if (this.e == 19) {
      return a.q;
    }
    if (this.e == 20) {
      return a.r;
    }
    if (this.e == 21) {
      return a.s;
    }
    if (this.e == 32) {
      return a.f;
    }
    if (this.e == 48) {
      return a.u;
    }
    if (this.e == 64) {
      return a.g;
    }
    if (this.e == 80) {
      return a.h;
    }
    if (this.e == 81) {
      return a.j;
    }
    if (this.e == 82) {
      return a.i;
    }
    if (this.e == 83) {
      return a.k;
    }
    if (this.e == 84) {
      return a.l;
    }
    if (this.e == 85) {
      return a.t;
    }
    if ((this.e & 0xFF) == 255) {
      return a.m;
    }
    if ((this.e & 0xFF) == 254) {
      return a.n;
    }
    return a.d;
  }
  
  public b g()
  {
    return this.c;
  }
  
  public c h()
  {
    return this.d;
  }
  
  public String toString()
  {
    return "CloudCameraStatusVariable{cameraMode=" + this.a + ", cameraStatus=" + this.b + ", sdCardStatus=" + this.c + ", waringStatus=" + this.d + ", status = " + this.e + ", time = " + d() + '}';
  }
  
  public static enum a
  {
    private a() {}
  }
  
  public static enum b
  {
    private b() {}
  }
  
  public static enum c
  {
    private c() {}
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/drone/h/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */