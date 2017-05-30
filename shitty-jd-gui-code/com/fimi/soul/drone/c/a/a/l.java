package com.fimi.soul.drone.c.a.a;

import com.fimi.soul.drone.c.a.b;
import com.fimi.soul.drone.c.a.c;
import com.fimi.soul.drone.c.a.d;
import java.io.Serializable;

public class l
  extends b
  implements Serializable
{
  public final int b = 137;
  private final byte c = 19;
  private byte[] d = new byte[2];
  private byte[] e;
  private byte f;
  
  public l()
  {
    this.a = 137;
  }
  
  public c a()
  {
    c localc = new c();
    localc.c = 137;
    localc.b = 19;
    if ((this.e != null) && (this.e.length > 0))
    {
      byte[] arrayOfByte = this.e;
      int j = arrayOfByte.length;
      int i = 0;
      while (i < j)
      {
        byte b1 = arrayOfByte[i];
        localc.d.b(b1);
        i += 1;
      }
    }
    return localc;
  }
  
  public void a(byte paramByte)
  {
    this.f = paramByte;
  }
  
  public void a(c paramc)
  {
    a(paramc.d);
  }
  
  public void a(d paramd)
  {
    paramd.c();
    this.d[0] = paramd.d();
    this.d[1] = paramd.d();
    this.f = paramd.d();
  }
  
  public void a(byte[] paramArrayOfByte)
  {
    this.d = paramArrayOfByte;
  }
  
  public void b(byte[] paramArrayOfByte)
  {
    this.e = paramArrayOfByte;
  }
  
  public byte[] b()
  {
    return this.d;
  }
  
  public byte c()
  {
    return this.f;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/drone/c/a/a/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */