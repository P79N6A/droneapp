package com.fimi.soul.drone.h;

import com.fimi.soul.drone.a;
import com.fimi.soul.drone.d.a;
import com.fimi.soul.drone.e;
import java.text.DecimalFormat;

public class aa
  extends e
{
  public short b;
  public short c;
  public short d;
  public short e;
  public short f;
  public short g;
  
  public aa(a parama)
  {
    super(parama);
  }
  
  public double a(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    return Math.sqrt(StrictMath.pow(paramFloat1, 2.0D) + StrictMath.pow(paramFloat2, 2.0D) + StrictMath.pow(paramFloat3, 2.0D));
  }
  
  public float a()
  {
    return Math.round(this.b * 100) / 100 / 100.0F;
  }
  
  public void a(short paramShort1, short paramShort2, short paramShort3, short paramShort4, short paramShort5, short paramShort6)
  {
    this.b = paramShort1;
    this.c = paramShort2;
    this.d = paramShort3;
    this.e = paramShort4;
    this.f = paramShort5;
    this.g = paramShort6;
    if (this.a != null) {
      this.a.a(d.a.h);
    }
  }
  
  public float b()
  {
    return Math.round(this.c * 100) / 100 / 100.0F;
  }
  
  public float c()
  {
    return Math.round(this.d * 100) / 100 / 100.0F;
  }
  
  public String d()
  {
    return new DecimalFormat("##0.00").format(a(a(), b(), c()));
  }
  
  public float e()
  {
    return Math.round(this.e * 100) / 100 / 100.0F;
  }
  
  public float f()
  {
    return Math.round(this.f * 100) / 100 / 100.0F;
  }
  
  public float g()
  {
    return Math.round(this.g * 100) / 100 / 100.0F;
  }
  
  public String h()
  {
    double d1 = a(e(), f(), g());
    return new DecimalFormat("##0.00").format(d1);
  }
  
  public String toString()
  {
    return "IMUInfo{gyroX=" + this.b + ", gyroY=" + this.c + ", gyroZ=" + this.d + ", accelX=" + this.e + ", accelY=" + this.f + ", accelZ=" + this.g + '}';
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/drone/h/aa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */