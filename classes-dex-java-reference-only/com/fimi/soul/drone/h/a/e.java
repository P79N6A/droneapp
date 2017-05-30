package com.fimi.soul.drone.h.a;

import com.fimi.soul.drone.a;
import com.fimi.soul.drone.d.a;
import com.fimi.soul.entity.DroneModelType;

public class e
  extends com.fimi.soul.drone.e
{
  private byte b;
  private byte c = 50;
  private byte d;
  private byte e = 90;
  private byte f;
  private byte g;
  private byte h;
  private DroneModelType i = new DroneModelType();
  
  public e() {}
  
  public e(a parama)
  {
    super(parama);
  }
  
  public byte a()
  {
    return this.e;
  }
  
  public void a(byte paramByte1, byte paramByte2, byte paramByte3, byte paramByte4, byte paramByte5, byte paramByte6, byte paramByte7)
  {
    this.b = paramByte1;
    this.c = paramByte2;
    this.i.setCtrlType(paramByte1);
    this.i.setCtrlMode(paramByte2);
    this.e = paramByte4;
    this.f = paramByte5;
    this.g = paramByte6;
    this.d = paramByte3;
    this.h = paramByte7;
    if (this.a != null) {
      this.a.a(d.a.bt);
    }
  }
  
  public byte b()
  {
    return this.g;
  }
  
  public byte c()
  {
    return this.f;
  }
  
  public byte d()
  {
    return this.b;
  }
  
  public byte e()
  {
    return this.c;
  }
  
  public byte f()
  {
    return this.d;
  }
  
  public DroneModelType g()
  {
    return this.i;
  }
  
  public String toString()
  {
    return "NewDroneModel{CtrlType=" + this.b + ", CtrlMode=" + this.c + ", WP_STA=" + this.d + '}';
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/drone/h/a/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */