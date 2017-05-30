package com.fimi.soul.drone.h.a;

import com.fimi.soul.drone.d.a;
import com.fimi.soul.drone.e;
import com.fimi.soul.utils.af;
import com.fimi.soul.utils.z;

public class a
  extends e
{
  public byte b;
  public byte c;
  public byte d;
  public short e;
  public short f;
  public short g;
  public short h;
  public float i;
  public float j;
  public byte k;
  
  public a(com.fimi.soul.drone.a parama)
  {
    super(parama);
  }
  
  public byte a()
  {
    return this.b;
  }
  
  public void a(byte paramByte1, byte paramByte2, byte paramByte3, short paramShort1, short paramShort2, short paramShort3, short paramShort4, float paramFloat1, float paramFloat2, byte paramByte4)
  {
    af localaf;
    if (!com.fimi.soul.biz.n.a.a().b())
    {
      localaf = z.a(paramFloat2, paramFloat1);
      this.i = ((float)localaf.b());
    }
    for (this.j = ((float)localaf.a());; this.j = paramFloat2)
    {
      this.b = paramByte1;
      this.c = paramByte2;
      this.d = paramByte3;
      this.e = paramShort1;
      this.f = paramShort2;
      this.g = paramShort3;
      this.h = paramShort4;
      this.k = paramByte4;
      this.a.a(d.a.bK);
      return;
      this.i = paramFloat1;
    }
  }
  
  public byte b()
  {
    return this.k;
  }
  
  public float c()
  {
    return this.j;
  }
  
  public short d()
  {
    return this.h;
  }
  
  public float e()
  {
    return this.i;
  }
  
  public short f()
  {
    return this.f;
  }
  
  public short g()
  {
    return this.g;
  }
  
  public short h()
  {
    return this.e;
  }
  
  public byte i()
  {
    return this.d;
  }
  
  public byte j()
  {
    return this.c;
  }
  
  public String toString()
  {
    return "DroneTakePhotoBean{packPacket_sequence=" + this.b + ", CMD_ID=" + this.c + ", Mode=" + this.d + ", Route_Length=" + this.e + ", Climb_Angle=" + this.f + ", Route_Speed=" + this.g + ", Start_point_Altitude=" + this.h + ", Start_point_Longitude=" + this.i + ", Start_point_Latitude=" + this.j + ", report=" + this.k + '}';
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/drone/h/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */