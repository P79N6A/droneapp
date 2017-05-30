package com.fimi.soul.module.b;

import com.fimi.soul.drone.c.a.a.ak;
import com.fimi.soul.drone.c.a.a.an;
import com.fimi.soul.drone.c.a.a.ao;
import com.fimi.soul.drone.c.a.a.bc;
import com.fimi.soul.drone.c.a.a.bf;
import com.fimi.soul.drone.droneconnection.connection.f.a;
import com.fimi.soul.drone.g.c.a;

public class d
{
  private static d a = null;
  private static com.fimi.soul.drone.a b;
  private com.fimi.soul.module.calibcompass.a c = com.fimi.soul.module.calibcompass.a.a();
  private b d = b.a();
  
  public static d a(com.fimi.soul.drone.a parama)
  {
    b = parama;
    if (a == null) {
      a = new d();
    }
    return a;
  }
  
  private void a(com.fimi.soul.drone.c.a.c paramc)
  {
    a locala = a.a(this.d);
    this.c.a(paramc.c + "", locala);
    locala.a(b, paramc);
    locala.a();
    com.fimi.soul.drone.g.c.a(c.a.a);
  }
  
  public void a()
  {
    if (!b.ac())
    {
      bc localbc = new bc();
      localbc.d = 1;
      b.T().a(localbc.a());
      a(localbc.a());
    }
  }
  
  public void a(byte paramByte)
  {
    com.fimi.soul.drone.c.a.c localc = new com.fimi.soul.drone.c.a.c();
    localc.c = 153;
    localc.b = 2;
    localc.d.b((byte)1);
    localc.d.b(paramByte);
    b.T().a(localc);
    a(localc);
  }
  
  public void a(byte paramByte1, byte paramByte2, byte paramByte3)
  {
    com.fimi.soul.drone.c.a.c localc = new com.fimi.soul.drone.c.a.c();
    localc.c = 153;
    localc.b = 3;
    localc.d.b(paramByte1);
    localc.d.b(paramByte2);
    localc.d.b(paramByte3);
    b.T().a(localc);
    a(localc);
  }
  
  public void a(byte paramByte1, byte paramByte2, short paramShort1, short paramShort2, byte paramByte3, short paramShort3, float paramFloat1, float paramFloat2)
  {
    com.fimi.soul.drone.c.a.c localc = new com.fimi.soul.drone.c.a.c();
    localc.c = 134;
    localc.b = 19;
    localc.d.b((byte)1);
    localc.d.b(paramByte1);
    localc.d.b(paramByte2);
    localc.d.a(paramShort1);
    localc.d.a(paramShort2);
    localc.d.b(paramByte3);
    localc.d.a(paramShort3);
    localc.d.a(paramFloat1);
    localc.d.a(paramFloat2);
    localc.d.b((byte)0);
    b.T().a(localc);
    a(localc);
  }
  
  public void a(double paramDouble1, double paramDouble2)
  {
    com.fimi.soul.drone.c.a.c localc = new com.fimi.soul.drone.c.a.c();
    localc.c = 128;
    localc.b = 14;
    localc.d.b((byte)1);
    localc.d.b((byte)0);
    localc.d.a((float)paramDouble1);
    localc.d.a((float)paramDouble2);
    localc.d.a((short)0);
    localc.d.b((byte)0);
    localc.d.b((byte)0);
    b.T().a(localc);
    a(localc);
  }
  
  public void a(int paramInt)
  {
    com.fimi.soul.drone.c.a.c localc = new com.fimi.soul.drone.c.a.c();
    localc.c = 130;
    localc.b = 2;
    localc.d.a((short)paramInt);
    b.T().a(localc);
    a(localc);
  }
  
  public void a(int paramInt1, double paramDouble1, double paramDouble2, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8)
  {
    com.fimi.soul.drone.c.a.c localc = new com.fimi.soul.drone.c.a.c();
    localc.c = 129;
    localc.b = 19;
    localc.d.b((byte)paramInt1);
    localc.d.b((byte)paramInt3);
    localc.d.a((float)paramDouble1);
    localc.d.a((float)paramDouble2);
    localc.d.a((short)paramInt2);
    localc.d.a((short)paramInt4);
    localc.d.b((byte)paramInt5);
    localc.d.b((byte)paramInt6);
    localc.d.b((byte)paramInt7);
    localc.d.b((byte)paramInt8);
    localc.d.b((byte)0);
    b.T().a(localc);
    a(localc);
  }
  
  public void a(int paramInt1, double paramDouble1, double paramDouble2, short paramShort, int paramInt2, int paramInt3)
  {
    com.fimi.soul.drone.c.a.c localc = new com.fimi.soul.drone.c.a.c();
    localc.c = 133;
    localc.b = 16;
    localc.d.b((byte)paramInt1);
    localc.d.b((byte)paramInt3);
    localc.d.a((float)paramDouble1);
    localc.d.a((float)paramDouble2);
    localc.d.a(paramShort);
    localc.d.b((byte)0);
    localc.d.b((byte)paramInt2);
    localc.d.b((byte)0);
    localc.d.b((byte)0);
    b.T().a(localc);
    a(localc);
  }
  
  public void a(int paramInt1, double paramDouble1, double paramDouble2, short paramShort1, short paramShort2, int paramInt2)
  {
    com.fimi.soul.drone.c.a.c localc = new com.fimi.soul.drone.c.a.c();
    localc.c = 131;
    localc.b = 19;
    localc.d.a((short)paramInt1);
    localc.d.a((float)paramDouble1);
    localc.d.a((float)paramDouble2);
    localc.d.a(paramShort1);
    localc.d.a((short)0);
    localc.d.b((byte)0);
    localc.d.b((byte)paramInt2);
    localc.d.b((byte)0);
    localc.d.a(paramShort2);
    b.T().a(localc);
    a(localc);
  }
  
  public void b()
  {
    ao localao = new ao();
    localao.d = 1;
    b.T().a(localao.a());
    a(localao.a());
  }
  
  public void b(byte paramByte1, byte paramByte2, byte paramByte3)
  {
    com.fimi.soul.drone.c.a.c localc = new com.fimi.soul.drone.c.a.c();
    localc.c = 153;
    localc.b = 3;
    localc.d.b(paramByte1);
    localc.d.b(paramByte2);
    localc.d.b(paramByte3);
    b.T().a(localc);
    a(localc);
  }
  
  public void b(int paramInt)
  {
    com.fimi.soul.drone.c.a.c localc = new com.fimi.soul.drone.c.a.c();
    localc.c = 204;
    localc.b = 2;
    localc.d.b((byte)paramInt);
    localc.d.b((byte)2);
    b.T().a(localc);
    a(localc);
  }
  
  public void c()
  {
    ak localak = new ak();
    localak.d = 1;
    b.T().a(localak.a());
    a(localak.a());
  }
  
  public void c(int paramInt)
  {
    this.c.a(paramInt + "");
  }
  
  public void d()
  {
    an localan = new an();
    localan.d = 1;
    localan.e = 67;
    b.T().a(localan.a());
    a(localan.a());
  }
  
  public void e()
  {
    an localan = new an();
    localan.d = 1;
    localan.e = 82;
    b.T().a(localan.a());
    a(localan.a());
  }
  
  public void f()
  {
    an localan = new an();
    localan.d = 1;
    localan.e = 80;
    b.T().a(localan.a());
    a(localan.a());
  }
  
  public void g()
  {
    bf localbf = new bf();
    localbf.e = 1;
    localbf.d = 114;
    localbf.f = 3;
    b.T().a(localbf.a());
    a(localbf.a());
  }
  
  public void h()
  {
    bf localbf = new bf();
    localbf.e = 1;
    localbf.d = 114;
    localbf.f = 1;
    b.T().a(localbf.a());
    a(localbf.a());
  }
  
  public void i()
  {
    bf localbf = new bf();
    localbf.e = 1;
    localbf.d = 114;
    localbf.f = 2;
    b.T().a(localbf.a());
    a(localbf.a());
  }
  
  public void j()
  {
    bf localbf = new bf();
    localbf.e = 1;
    localbf.d = 87;
    localbf.f = 0;
    b.T().a(localbf.a());
    a(localbf.a());
  }
  
  public void k()
  {
    bf localbf = new bf();
    localbf.e = 2;
    localbf.d = 82;
    localbf.f = 0;
    b.T().a(localbf.a());
    a(localbf.a());
  }
  
  public void l()
  {
    bf localbf = new bf();
    localbf.e = 1;
    localbf.d = 84;
    localbf.f = 0;
    b.T().a(localbf.a());
    a(localbf.a());
  }
  
  public void m()
  {
    bf localbf = new bf();
    localbf.e = 1;
    localbf.d = 88;
    localbf.f = 0;
    b.T().a(localbf.a());
    a(localbf.a());
  }
  
  public void n()
  {
    bf localbf = new bf();
    localbf.e = 1;
    localbf.d = 86;
    localbf.f = 2;
    b.T().a(localbf.a());
    a(localbf.a());
  }
  
  public void o()
  {
    bf localbf = new bf();
    localbf.e = 1;
    localbf.d = 85;
    localbf.f = 1;
    b.T().a(localbf.a());
    a(localbf.a());
  }
  
  public void p()
  {
    bf localbf = new bf();
    localbf.e = 1;
    localbf.d = 86;
    localbf.f = 1;
    b.T().a(localbf.a());
    a(localbf.a());
  }
  
  public void q()
  {
    com.fimi.soul.drone.c.a.c localc = new com.fimi.soul.drone.c.a.c();
    localc.c = 148;
    localc.b = 2;
    localc.d.a((short)1);
    b.T().a(localc);
    a(localc);
  }
  
  public void r()
  {
    com.fimi.soul.drone.c.a.c localc = new com.fimi.soul.drone.c.a.c();
    localc.c = 122;
    localc.b = 2;
    localc.d.b((byte)10);
    localc.d.b((byte)0);
    b.T().a(localc);
    a(localc);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/module/b/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */