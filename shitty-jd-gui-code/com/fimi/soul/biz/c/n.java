package com.fimi.soul.biz.c;

import com.fimi.soul.drone.d.a;
import com.fimi.soul.drone.d.b;
import com.fimi.soul.module.b.b;
import com.fimi.soul.module.b.b.b;

public class n
  implements d.b, b.b
{
  private com.fimi.soul.drone.a a;
  private p b;
  private f c;
  private l d;
  
  public n(com.fimi.soul.drone.a parama)
  {
    this.a = parama;
    parama.a(this);
    b.a().a(this);
    this.b = new p(parama);
    this.c = new f(parama);
    this.d = new l(parama);
  }
  
  public void a()
  {
    this.a.b(this);
  }
  
  public void a(int paramInt) {}
  
  public void onDroneEvent(d.a parama, com.fimi.soul.drone.a parama1)
  {
    switch (1.a[parama.ordinal()])
    {
    default: 
      return;
    case 1: 
      this.b.a();
      return;
    case 2: 
      parama1.a(d.a.bx);
      this.b.a(d.k().f());
      return;
    case 3: 
      this.b.b(1);
      return;
    case 4: 
      com.fimi.soul.module.calibcompass.a.a().a("130");
      parama = parama1.m();
      this.b.a(parama);
      return;
    case 5: 
      this.c.a(d.k().f());
      return;
    case 6: 
      this.c.a();
      return;
    case 7: 
      this.d.a(d.k().f());
      return;
    }
    this.d.a();
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/biz/c/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */