package com.fimi.soul.drone.h;

import com.fimi.soul.drone.a;
import com.fimi.soul.drone.d.a;
import com.fimi.soul.drone.e;

public class ab
  extends e
{
  public int b;
  public int c;
  public byte d;
  
  public ab(a parama)
  {
    super(parama);
  }
  
  public int a()
  {
    return this.b;
  }
  
  public void a(int paramInt1, int paramInt2, byte paramByte)
  {
    this.b = paramInt1;
    this.c = paramInt2;
    this.d = paramByte;
    if (this.a != null) {
      this.a.a(d.a.j);
    }
  }
  
  public byte b()
  {
    return this.d;
  }
  
  public int c()
  {
    return this.c;
  }
  
  public String toString()
  {
    return "IMUWorkStateInfo{isCheck=" + (this.d & 0xFF) + "imuWorkState=" + (this.b & 0xFF) + ", magWorkState=" + (this.c & 0xFF) + "}";
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/drone/h/ab.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */