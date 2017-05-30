package com.fimi.soul.drone.h;

import com.fimi.soul.drone.c.a.d;

public class i
  extends a
{
  private boolean a = false;
  private boolean b = false;
  private b c = b.a;
  private a d = a.a;
  private int e = 0;
  private int f = 0;
  
  private a a(byte paramByte)
  {
    if (paramByte == 1) {
      return a.b;
    }
    if (paramByte == 2) {
      return a.c;
    }
    if (paramByte == 6) {
      return a.d;
    }
    if (paramByte == 9) {
      return a.e;
    }
    if (paramByte == 5) {
      return a.f;
    }
    return a.a;
  }
  
  private b b(byte paramByte)
  {
    if (paramByte == 1) {
      return b.a;
    }
    if (paramByte == 2) {
      return b.b;
    }
    return b.a;
  }
  
  public void a(d paramd)
  {
    paramd.c();
    byte b1 = paramd.d();
    byte b2 = paramd.d();
    if (a() == 51)
    {
      this.e = (b2 * 100 + paramd.d());
      this.f = paramd.d();
    }
    a(a(b1));
    a(b(b2));
    if (paramd.d() == 1) {
      b(true);
    }
    if (paramd.d() == 1) {
      a(true);
    }
  }
  
  public void a(a parama)
  {
    this.d = parama;
  }
  
  public void a(b paramb)
  {
    this.c = paramb;
  }
  
  public void a(boolean paramBoolean)
  {
    this.b = paramBoolean;
  }
  
  public int b()
  {
    return this.f;
  }
  
  public void b(int paramInt)
  {
    this.f = paramInt;
  }
  
  public void b(boolean paramBoolean)
  {
    this.a = paramBoolean;
  }
  
  public b c()
  {
    return this.c;
  }
  
  public int d()
  {
    return this.e;
  }
  
  public a e()
  {
    return this.d;
  }
  
  public boolean f()
  {
    return this.b;
  }
  
  public boolean g()
  {
    return this.a;
  }
  
  public String toString()
  {
    return "CloudCamraActionVariable{isFormatSDCard=" + this.a + ", isResetFactory=" + this.b + ", cameraRequestType=" + this.c + ", cameraActionType=" + this.d + '}';
  }
  
  public static enum a
  {
    private a() {}
  }
  
  public static enum b
  {
    private b() {}
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/drone/h/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */