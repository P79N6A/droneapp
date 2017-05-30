package com.fimi.soul.drone.h.a;

import com.fimi.soul.drone.d.a;
import com.fimi.soul.drone.e;
import com.fimi.soul.utils.af;
import com.fimi.soul.utils.z;

public class b
  extends e
{
  public byte b;
  public short c;
  public float d;
  public float e;
  public byte f;
  public short g;
  public byte h = 10;
  public byte i;
  public byte j;
  public byte k;
  public byte l;
  
  public b() {}
  
  public b(com.fimi.soul.drone.a parama)
  {
    super(parama);
  }
  
  public byte a()
  {
    return this.b;
  }
  
  public void a(byte paramByte)
  {
    this.f = paramByte;
  }
  
  public void a(byte paramByte1, short paramShort1, float paramFloat1, float paramFloat2, byte paramByte2, short paramShort2, byte paramByte3, byte paramByte4, byte paramByte5, byte paramByte6, byte paramByte7)
  {
    af localaf;
    if (!com.fimi.soul.biz.n.a.a().b())
    {
      localaf = z.a(paramFloat2, paramFloat1);
      this.d = ((float)localaf.b());
    }
    for (this.e = ((float)localaf.a());; this.e = paramFloat2)
    {
      this.b = paramByte1;
      this.c = paramShort1;
      this.f = paramByte2;
      this.g = paramShort2;
      this.h = paramByte3;
      this.i = paramByte4;
      this.j = paramByte5;
      this.k = paramByte6;
      this.l = paramByte7;
      if (this.a != null) {
        this.a.a(d.a.aE);
      }
      return;
      this.d = paramFloat1;
    }
  }
  
  public void a(float paramFloat)
  {
    this.e = paramFloat;
  }
  
  public void a(short paramShort)
  {
    this.c = paramShort;
  }
  
  public byte b()
  {
    return this.l;
  }
  
  public void b(float paramFloat)
  {
    this.d = paramFloat;
  }
  
  public void b(short paramShort)
  {
    this.g = paramShort;
  }
  
  public byte c()
  {
    return this.k;
  }
  
  public byte d()
  {
    return this.j;
  }
  
  public byte e()
  {
    return this.i;
  }
  
  public byte f()
  {
    return this.h;
  }
  
  public short g()
  {
    return this.g;
  }
  
  public short h()
  {
    return this.c;
  }
  
  public byte i()
  {
    return this.f;
  }
  
  public float j()
  {
    return this.e;
  }
  
  public float k()
  {
    return this.d;
  }
  
  public String toString()
  {
    return "FlyZone{Opration_code=" + this.b + ", number=" + this.c + ", Forbiden_Longitude=" + this.d + ", Forbiden_Latitude=" + this.e + ", type=" + this.f + ", radius=" + this.g + ", status=" + this.h + ", reserve1=" + this.i + ", reserve2=" + this.j + ", reserve3=" + this.k + ", report=" + this.l + '}';
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/drone/h/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */