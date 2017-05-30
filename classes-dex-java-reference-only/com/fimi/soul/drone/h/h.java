package com.fimi.soul.drone.h;

import com.fimi.soul.drone.c.a.d;

public class h
  extends a
{
  private boolean a = true;
  private d b = d.b;
  private f c = f.c;
  private e d = e.i;
  private a e = a.b;
  private c f = c.a;
  private b g = b.c;
  private boolean h = true;
  private boolean i = true;
  private boolean j = true;
  private int k = 0;
  private short l = 0;
  private short m = 0;
  
  private d a(byte paramByte)
  {
    if (paramByte == 1) {
      return d.a;
    }
    if (paramByte == 2) {
      return d.b;
    }
    if (paramByte == 3) {
      return d.c;
    }
    return d.b;
  }
  
  private f b(byte paramByte)
  {
    if (paramByte == 1) {
      return f.a;
    }
    if (paramByte == 2) {
      return f.b;
    }
    if (paramByte == 3) {
      return f.c;
    }
    f localf = this.c;
    return f.a;
  }
  
  private e c(byte paramByte)
  {
    if (paramByte == 1) {
      return e.a;
    }
    if (paramByte == 2) {
      return e.b;
    }
    if (paramByte == 3) {
      return e.c;
    }
    if (paramByte == 4) {
      return e.d;
    }
    if (paramByte == 5) {
      return e.e;
    }
    if (paramByte == 6) {
      return e.f;
    }
    if (paramByte == 7) {
      return e.g;
    }
    if (paramByte == 8) {
      return e.h;
    }
    if (paramByte == 9) {
      return e.i;
    }
    if (paramByte == 10) {
      return e.j;
    }
    return e.i;
  }
  
  private a d(byte paramByte)
  {
    if (paramByte == 1) {
      return a.a;
    }
    if (paramByte == 2) {
      return a.b;
    }
    if (paramByte == 3) {
      return a.c;
    }
    if (paramByte == 4) {
      return a.d;
    }
    return a.a;
  }
  
  private c e(byte paramByte)
  {
    if (paramByte == 1) {
      return c.a;
    }
    if (paramByte == 2) {
      return c.b;
    }
    if (paramByte == 3) {
      return c.c;
    }
    return c.a;
  }
  
  private b f(byte paramByte)
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
    return b.c;
  }
  
  private byte g(byte paramByte)
  {
    return (byte)(paramByte & 0x3F);
  }
  
  private byte h(byte paramByte)
  {
    return (byte)((paramByte & 0xC0) >>> 6);
  }
  
  public void a(d paramd)
  {
    paramd.c();
    a(a(paramd.d()));
    a(b(paramd.d()));
    a(c(paramd.d()));
    a(d(paramd.d()));
    a(e(paramd.d()));
    a(f(paramd.d()));
    if (paramd.d() == 2)
    {
      c(true);
      if (paramd.d() != 2) {
        break label157;
      }
      b(true);
      label102:
      if (paramd.d() != 2) {
        break label165;
      }
      c(true);
    }
    for (;;)
    {
      if (a() == 51)
      {
        this.k = paramd.f();
        this.l = paramd.e();
        this.m = paramd.e();
      }
      return;
      c(false);
      break;
      label157:
      b(false);
      break label102;
      label165:
      c(false);
    }
  }
  
  public void a(a parama)
  {
    this.e = parama;
  }
  
  public void a(b paramb)
  {
    this.g = paramb;
  }
  
  public void a(c paramc)
  {
    this.f = paramc;
  }
  
  public void a(d paramd)
  {
    this.b = paramd;
  }
  
  public void a(e parame)
  {
    this.d = parame;
  }
  
  public void a(f paramf)
  {
    this.c = paramf;
  }
  
  public void a(short paramShort)
  {
    this.l = paramShort;
  }
  
  public void a(boolean paramBoolean)
  {
    this.h = paramBoolean;
  }
  
  public a b()
  {
    return this.e;
  }
  
  public void b(int paramInt)
  {
    this.k = paramInt;
  }
  
  public void b(short paramShort)
  {
    this.m = paramShort;
  }
  
  public void b(boolean paramBoolean)
  {
    this.i = paramBoolean;
  }
  
  public b c()
  {
    return this.g;
  }
  
  public void c(boolean paramBoolean)
  {
    this.j = paramBoolean;
  }
  
  public void d(boolean paramBoolean)
  {
    this.a = paramBoolean;
  }
  
  public boolean d()
  {
    return this.h;
  }
  
  public boolean e()
  {
    return this.i;
  }
  
  public boolean f()
  {
    return this.j;
  }
  
  public e g()
  {
    return this.d;
  }
  
  public boolean h()
  {
    return this.a;
  }
  
  public f i()
  {
    return this.c;
  }
  
  public d j()
  {
    return this.b;
  }
  
  public c k()
  {
    return this.f;
  }
  
  public int l()
  {
    return this.k;
  }
  
  public short m()
  {
    return this.l;
  }
  
  public short n()
  {
    return this.m;
  }
  
  public String toString()
  {
    return "CloudCameraVariable{isLenAC=" + this.a + ", videoQualityType=" + this.b + ", videoTimeStampType=" + this.c + ", videoResolutionType=" + this.d + ", imageResolutionType=" + this.e + ", shotModeType=" + this.f + ", photoTimeStampType=" + this.g + ", enableAutoLowLight=" + this.h + ", enableRecycleRecord=" + this.i + ", enableAutoAC=" + this.j + ", cameraTime=" + this.k + ", cameraTotalStorage=" + this.l + ", cameraRemainStorage=" + this.m + '}';
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
  
  public static enum d
  {
    private d() {}
  }
  
  public static enum e
  {
    private e() {}
  }
  
  public static enum f
  {
    private f() {}
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/drone/h/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */