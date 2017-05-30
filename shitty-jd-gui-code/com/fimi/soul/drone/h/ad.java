package com.fimi.soul.drone.h;

import com.fimi.soul.drone.a;
import com.fimi.soul.drone.e;
import com.fimi.soul.utils.ao;

public class ad
  extends e
{
  private byte b;
  private short c;
  private short d;
  private short e;
  private short f;
  private short g;
  private short h;
  private short i;
  private volatile short j;
  private byte k;
  
  public ad() {}
  
  public ad(a parama)
  {
    super(parama);
  }
  
  public int a(int paramInt1, int paramInt2)
  {
    return (1 << paramInt2 & paramInt1) >> paramInt2;
  }
  
  public void a(byte paramByte)
  {
    this.b = paramByte;
  }
  
  public void a(short paramShort)
  {
    this.j = paramShort;
  }
  
  public boolean a()
  {
    return 1 == a(this.j, 4);
  }
  
  public short b()
  {
    return this.j;
  }
  
  public void b(byte paramByte)
  {
    this.k = paramByte;
  }
  
  public void b(short paramShort)
  {
    this.i = paramShort;
  }
  
  public short c()
  {
    return this.i;
  }
  
  public void c(short paramShort)
  {
    this.h = paramShort;
  }
  
  public short d()
  {
    return this.h;
  }
  
  public void d(short paramShort)
  {
    this.g = paramShort;
  }
  
  public short e()
  {
    return this.g;
  }
  
  public void e(short paramShort)
  {
    this.f = paramShort;
  }
  
  public short f()
  {
    return this.f;
  }
  
  public void f(short paramShort)
  {
    this.e = paramShort;
  }
  
  public short g()
  {
    return this.e;
  }
  
  public void g(short paramShort)
  {
    this.d = paramShort;
  }
  
  public short h()
  {
    return this.d;
  }
  
  public void h(short paramShort)
  {
    this.c = paramShort;
  }
  
  public short i()
  {
    return this.c;
  }
  
  public byte j()
  {
    return this.b;
  }
  
  public boolean k()
  {
    return ao.a(this.j, 4) == 0;
  }
  
  public byte l()
  {
    return this.k;
  }
  
  public boolean m()
  {
    boolean bool = false;
    if (ao.a(this.k, Math.abs(0)) > 0) {
      bool = true;
    }
    return bool;
  }
  
  public boolean n()
  {
    return ao.a(this.k, Math.abs(1)) > 0;
  }
  
  public String toString()
  {
    return "NewRemoteMode{type=" + this.b + ", AD_Value0=" + this.c + ", AD_Value1=" + this.d + ", AD_Value2=" + this.e + ", AD_Value3=" + this.f + ", AD_Value4=" + this.g + ", AD_Value5=" + this.h + ", battery_voltage=" + this.i + ", statuts=" + this.j + '}';
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/drone/h/ad.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */