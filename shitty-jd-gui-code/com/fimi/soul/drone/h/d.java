package com.fimi.soul.drone.h;

import com.fimi.soul.drone.a;
import com.fimi.soul.drone.d.a;
import com.fimi.soul.drone.e;

public class d
  extends e
{
  public byte b;
  public byte c;
  public byte d;
  public byte e;
  public byte f;
  public byte g;
  public short h;
  public short i;
  public byte j;
  public byte k;
  public byte l;
  public byte m;
  public byte n;
  
  public d() {}
  
  public d(a parama)
  {
    super(parama);
  }
  
  public int a()
  {
    return this.b & 0xFF;
  }
  
  public void a(byte paramByte1, byte paramByte2, byte paramByte3, byte paramByte4, byte paramByte5, byte paramByte6, short paramShort1, short paramShort2, byte paramByte7, byte paramByte8, byte paramByte9, byte paramByte10, byte paramByte11)
  {
    this.b = paramByte1;
    this.c = paramByte2;
    this.d = paramByte3;
    this.e = paramByte4;
    this.f = paramByte5;
    this.g = paramByte6;
    this.h = paramShort1;
    this.i = paramShort2;
    this.j = paramByte7;
    this.k = paramByte8;
    this.l = paramByte9;
    this.m = paramByte10;
    this.n = paramByte11;
    if (this.a != null) {
      this.a.a(d.a.g);
    }
  }
  
  public int b()
  {
    return this.c & 0xFF;
  }
  
  public int c()
  {
    return this.d & 0xFF;
  }
  
  public int d()
  {
    return this.e & 0xFF;
  }
  
  public byte e()
  {
    return this.f;
  }
  
  public byte f()
  {
    return this.g;
  }
  
  public short g()
  {
    return this.h;
  }
  
  public short h()
  {
    return this.i;
  }
  
  public int i()
  {
    return this.j & 0xFF;
  }
  
  public short j()
  {
    return (short)this.k;
  }
  
  public byte k()
  {
    return this.l;
  }
  
  public byte l()
  {
    return this.m;
  }
  
  public byte m()
  {
    return this.n;
  }
  
  public String toString()
  {
    return "Battery{Cell_1_Voltage=" + this.b + ", Cell_2_Voltage=" + this.c + ", Cell_3_Voltage=" + this.d + ", Cell_4_Voltage=" + this.e + ", Cell_5_Voltage=" + this.f + ", Cell_6_Voltage=" + this.g + ", Current_Capacity=" + this.h + ", Current=" + this.i + ", battery_temperature=" + this.j + ", batteryLevel=" + this.k + ", battery_parameter_err=" + this.l + ", battery_over_discharge=" + this.m + ", RCNoUpdateCnt=" + this.n + '}';
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/drone/h/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */