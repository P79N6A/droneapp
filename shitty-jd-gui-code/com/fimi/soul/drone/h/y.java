package com.fimi.soul.drone.h;

import com.fimi.soul.drone.a;
import com.fimi.soul.drone.d.a;
import com.fimi.soul.drone.e;
import java.io.Serializable;

public class y
  extends e
  implements Serializable
{
  private double b;
  private double c;
  private byte d;
  private byte e;
  private int f;
  private byte g;
  private byte h;
  private double i;
  private double j;
  private double k;
  private double l;
  private double m;
  private double n;
  private double o;
  
  public y() {}
  
  public y(a parama)
  {
    super(parama);
  }
  
  public double a()
  {
    return this.b;
  }
  
  public void a(byte paramByte)
  {
    this.d = paramByte;
  }
  
  public void a(byte paramByte, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6, double paramDouble7, double paramDouble8, double paramDouble9, double paramDouble10, double paramDouble11, double paramDouble12, double paramDouble13)
  {
    this.d = ((byte)(paramByte & 0xFF));
    this.i = paramDouble1;
    this.o = paramDouble2;
    this.n = paramDouble3;
    this.m = paramDouble4;
    this.j = paramDouble5;
    this.k = paramDouble6;
    this.l = paramDouble7;
    this.e = ((byte)(int)paramDouble8);
    this.f = ((int)paramDouble9);
    this.b = paramDouble10;
    this.c = paramDouble11;
    this.g = ((byte)(int)paramDouble12);
    this.h = ((byte)(int)paramDouble13);
  }
  
  public void a(double paramDouble)
  {
    this.b = paramDouble;
  }
  
  public void a(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6, double paramDouble7, byte paramByte1, byte paramByte2, int paramInt, byte paramByte3, byte paramByte4, double paramDouble8, double paramDouble9)
  {
    this.i = paramDouble2;
    this.n = paramDouble1;
    this.j = paramDouble3;
    this.k = paramDouble4;
    this.l = paramDouble5;
    this.m = paramDouble6;
    this.o = paramDouble7;
    this.b = paramDouble8;
    this.c = paramDouble9;
    this.d = paramByte1;
    this.e = paramByte2;
    this.f = paramInt;
    this.g = paramByte3;
    this.h = paramByte4;
    this.a.a(d.a.ay);
  }
  
  public void a(int paramInt)
  {
    this.f = paramInt;
  }
  
  public double b()
  {
    return this.c;
  }
  
  public void b(byte paramByte)
  {
    this.e = paramByte;
  }
  
  public void b(double paramDouble)
  {
    this.c = paramDouble;
  }
  
  public byte c()
  {
    return this.d;
  }
  
  public void c(double paramDouble)
  {
    this.i = paramDouble;
  }
  
  public byte d()
  {
    return this.e;
  }
  
  public void d(double paramDouble)
  {
    this.j = paramDouble;
  }
  
  public int e()
  {
    return this.f;
  }
  
  public void e(double paramDouble)
  {
    this.k = paramDouble;
  }
  
  public byte f()
  {
    return this.g;
  }
  
  public void f(double paramDouble)
  {
    this.l = paramDouble;
  }
  
  public byte g()
  {
    return this.h;
  }
  
  public void g(double paramDouble)
  {
    this.m = paramDouble;
  }
  
  public double h()
  {
    return this.i;
  }
  
  public void h(double paramDouble)
  {
    this.n = paramDouble;
  }
  
  public double i()
  {
    return this.j;
  }
  
  public void i(double paramDouble)
  {
    this.o = paramDouble;
  }
  
  public double j()
  {
    return this.k;
  }
  
  public double k()
  {
    return this.l;
  }
  
  public double l()
  {
    return this.m;
  }
  
  public double m()
  {
    return this.n;
  }
  
  public double n()
  {
    return this.o;
  }
  
  public String toString()
  {
    return "HeardData{GroundSpeed=" + this.b + ", DownVelocity=" + this.c + ", Heartbeat=" + this.d + ", Disarm_count=" + this.e + ", FlightMode=" + this.f + ", rcReceiver=" + this.g + ", takeoffTag=" + this.h + ", ThrottleStick=" + this.i + ", rollangle=" + this.j + ", pitchangle=" + this.k + ", Headingangle=" + this.l + ", YawStick=" + this.m + ", PitchStick=" + this.n + ", RollStick=" + this.o + '}';
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/drone/h/y.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */