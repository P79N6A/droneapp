package com.fimi.soul.drone.c.a.a;

import com.fimi.soul.drone.c.a.b;
import com.fimi.soul.drone.c.a.c;
import com.fimi.soul.drone.c.a.d;
import java.util.Arrays;

public class bn
  extends b
{
  public static final int b = 201;
  private static final long serialVersionUID = 201L;
  public int c;
  public short d;
  public byte e;
  public byte[] f;
  
  public bn()
  {
    this.a = 201;
  }
  
  public bn(c paramc)
  {
    this.a = 201;
    a(paramc.d);
  }
  
  public c a()
  {
    c localc = new c();
    localc.b = this.c;
    localc.c = 201;
    localc.d.b(this.e);
    localc.d.a(this.d);
    int i = 0;
    while (i < this.f.length)
    {
      localc.d.b(this.f[i]);
      i += 1;
    }
    return localc;
  }
  
  public void a(int paramInt)
  {
    this.f = new byte[paramInt];
  }
  
  public void a(d paramd)
  {
    paramd.c();
    this.d = paramd.e();
  }
  
  public void b(int paramInt)
  {
    this.c = paramInt;
  }
  
  public byte[] b()
  {
    return this.f;
  }
  
  public int c()
  {
    return this.c;
  }
  
  public String toString()
  {
    return "updatedrone [Packet_sequence=" + this.d + ", data=" + Arrays.toString(this.f) + "]";
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/drone/c/a/a/bn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */