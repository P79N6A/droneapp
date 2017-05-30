package com.fimi.soul.drone.h;

import com.fimi.soul.drone.a;
import com.fimi.soul.drone.d.a;
import com.fimi.soul.drone.e;
import java.util.Arrays;

public class o
  extends e
{
  public byte b;
  public byte c;
  public byte d;
  public byte e;
  public byte f;
  private byte g;
  private byte[] h;
  
  public o(a parama)
  {
    super(parama);
    parama.a(d.a.bX);
  }
  
  public byte a()
  {
    return this.g;
  }
  
  public void a(byte paramByte)
  {
    this.g = paramByte;
  }
  
  public void a(byte[] paramArrayOfByte)
  {
    this.h = paramArrayOfByte;
  }
  
  public byte b()
  {
    return this.b;
  }
  
  public void b(byte paramByte)
  {
    this.b = paramByte;
  }
  
  public byte c()
  {
    return this.c;
  }
  
  public void c(byte paramByte)
  {
    this.c = paramByte;
  }
  
  public void d(byte paramByte)
  {
    this.d = paramByte;
  }
  
  public byte[] d()
  {
    return this.h;
  }
  
  public byte e()
  {
    return this.d;
  }
  
  public void e(byte paramByte)
  {
    this.e = paramByte;
  }
  
  public byte f()
  {
    return this.e;
  }
  
  public void f(byte paramByte)
  {
    this.f = paramByte;
  }
  
  public byte g()
  {
    return this.f;
  }
  
  public String toString()
  {
    return "DynamicStatus{msg_id=" + this.g + ", tagertId=" + this.b + ", sourceId=" + this.c + ", packetNum=" + Arrays.toString(this.h) + ", gps_status=" + this.d + ", received=" + this.e + ", report_status=" + this.f + '}';
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/drone/h/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */