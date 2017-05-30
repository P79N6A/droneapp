package com.fimi.soul.drone.c.a;

import android.util.Log;
import com.fimi.soul.drone.c.a.a.aa;
import com.fimi.soul.drone.c.a.a.ab;
import com.fimi.soul.drone.c.a.a.ac;
import com.fimi.soul.drone.c.a.a.ad;
import com.fimi.soul.drone.c.a.a.ae;
import com.fimi.soul.drone.c.a.a.af;
import com.fimi.soul.drone.c.a.a.ag;
import com.fimi.soul.drone.c.a.a.ah;
import com.fimi.soul.drone.c.a.a.ai;
import com.fimi.soul.drone.c.a.a.aj;
import com.fimi.soul.drone.c.a.a.ak;
import com.fimi.soul.drone.c.a.a.al;
import com.fimi.soul.drone.c.a.a.am;
import com.fimi.soul.drone.c.a.a.an;
import com.fimi.soul.drone.c.a.a.ao;
import com.fimi.soul.drone.c.a.a.ap;
import com.fimi.soul.drone.c.a.a.aq;
import com.fimi.soul.drone.c.a.a.ar;
import com.fimi.soul.drone.c.a.a.at;
import com.fimi.soul.drone.c.a.a.au;
import com.fimi.soul.drone.c.a.a.av;
import com.fimi.soul.drone.c.a.a.ax;
import com.fimi.soul.drone.c.a.a.ay;
import com.fimi.soul.drone.c.a.a.bb;
import com.fimi.soul.drone.c.a.a.bc;
import com.fimi.soul.drone.c.a.a.bd;
import com.fimi.soul.drone.c.a.a.be;
import com.fimi.soul.drone.c.a.a.bf;
import com.fimi.soul.drone.c.a.a.bg;
import com.fimi.soul.drone.c.a.a.bh;
import com.fimi.soul.drone.c.a.a.bi;
import com.fimi.soul.drone.c.a.a.bj;
import com.fimi.soul.drone.c.a.a.bm;
import com.fimi.soul.drone.c.a.a.bo;
import com.fimi.soul.drone.c.a.a.bq;
import com.fimi.soul.drone.c.a.a.br;
import com.fimi.soul.drone.c.a.a.e;
import com.fimi.soul.drone.c.a.a.h;
import com.fimi.soul.drone.c.a.a.i;
import com.fimi.soul.drone.c.a.a.j;
import com.fimi.soul.drone.c.a.a.k;
import com.fimi.soul.drone.c.a.a.l;
import com.fimi.soul.drone.c.a.a.m;
import com.fimi.soul.drone.c.a.a.n;
import com.fimi.soul.drone.c.a.a.o;
import com.fimi.soul.drone.c.a.a.p;
import com.fimi.soul.drone.c.a.a.q;
import com.fimi.soul.drone.c.a.a.r;
import com.fimi.soul.drone.c.a.a.s;
import com.fimi.soul.drone.c.a.a.t;
import com.fimi.soul.drone.c.a.a.u;
import com.fimi.soul.drone.c.a.a.v;
import com.fimi.soul.drone.c.a.a.w;
import com.fimi.soul.drone.c.a.a.x;
import com.fimi.soul.drone.c.a.a.y;
import java.io.Serializable;
import java.nio.ByteBuffer;

public class c
  implements Serializable
{
  public static final int a = 254;
  private static final long serialVersionUID = 2095947771227815314L;
  public int b;
  public int c;
  public d d;
  public a e;
  
  public c()
  {
    this.d = new d();
  }
  
  public c(d paramd)
  {
    this.d = paramd;
  }
  
  public boolean a()
  {
    if (this.d.b() >= 511) {}
    while (this.d.b() == this.b) {
      return true;
    }
    return false;
  }
  
  public void b()
  {
    this.e = new a();
    this.e.a(this.b);
    this.e.a(this.c);
    this.d.c();
    int i = 0;
    while (i < this.d.b())
    {
      this.e.a(this.d.d());
      i += 1;
    }
  }
  
  public void c()
  {
    this.e = new a();
    this.e.a(this.b + 1);
    this.e.a(this.c);
    this.d.c();
    int i = 0;
    while (i < this.d.b())
    {
      this.e.a(this.d.d());
      i += 1;
    }
  }
  
  public byte[] d()
  {
    int j = 0;
    byte[] arrayOfByte = new byte[this.b + 3 + 2];
    arrayOfByte[0] = -2;
    arrayOfByte[1] = ((byte)(this.b + 1));
    int i = 3;
    arrayOfByte[2] = ((byte)this.c);
    while (j < this.d.b() - 1)
    {
      arrayOfByte[i] = this.d.b.get(j);
      j += 1;
      i += 1;
    }
    c();
    j = i + 1;
    arrayOfByte[i] = ((byte)this.e.c());
    arrayOfByte[j] = ((byte)this.e.b());
    return arrayOfByte;
  }
  
  public byte[] e()
  {
    int j = 0;
    byte[] arrayOfByte = new byte[this.b + 2 + 2];
    arrayOfByte[0] = -2;
    arrayOfByte[1] = ((byte)this.b);
    int i = 3;
    arrayOfByte[2] = ((byte)this.c);
    while (j < this.d.b() - 1)
    {
      arrayOfByte[i] = this.d.b.get(j);
      j += 1;
      i += 1;
    }
    b();
    j = i + 1;
    arrayOfByte[i] = ((byte)this.e.c());
    arrayOfByte[j] = ((byte)this.e.b());
    return arrayOfByte;
  }
  
  public b f()
  {
    Object localObject;
    int i;
    switch (this.c)
    {
    default: 
      localObject = h.a(this.c, this);
      if (localObject != null) {
        return (b)localObject;
      }
      break;
    case 100: 
      return new bh(this);
    case 201: 
      return new bo(this);
    case 199: 
      return new bm(this);
    case 200: 
      return new bj(this);
    case 202: 
      return new br(this);
    case 203: 
      return new bq(this);
    case 1: 
      return new av(this);
    case 2: 
      return new am(this);
    case 3: 
      return new ar(this);
    case 4: 
      return new ap(this);
    case 5: 
      return new e(this);
    case 6: 
      return new bd(this);
    case 129: 
      return new au(this);
    case 130: 
      return new ae(this);
    case 131: 
      return new bb(this);
    case 132: 
      return new be(this);
    case 133: 
      return new p(this);
    case 134: 
      this.d.c(1);
      i = this.d.d();
      if ((i == 18) || (i == 19)) {
        return new ac(this);
      }
      return new j(this);
    case 148: 
      return new ag(this);
    case 151: 
      return new ah(this);
    case 149: 
      return new aq(this);
    case 150: 
      return new ax(this);
    case 144: 
      return new ak(this);
    case 146: 
      return new bc(this);
    case 147: 
      return new an(this);
    case 145: 
      return new ao(this);
    case 152: 
      return new com.fimi.soul.drone.c.a.a.b(this);
    case 192: 
      return new al(this);
    case 193: 
      return new ai(this);
    case 99: 
      return new bg(this);
    case 197: 
      return new ay(this);
    case 198: 
      return new af(this);
    case 98: 
      return new bf(this);
    case 16: 
      return new aj(this, 16);
    case 113: 
      return new aj(this, 113);
    case 102: 
      return new com.fimi.soul.drone.c.a.a.d(this);
    case 204: 
      return new y(this);
    case 9: 
      return new n(this);
    case 7: 
      return new w(this);
    case 138: 
      return new o(this);
    case 106: 
      return new aa(this);
    case 153: 
      this.d.c(1);
      i = this.d.d();
      if ((this.b > 5) && (i == 4)) {
        return new r(this);
      }
      if ((this.b > 5) && (i == 5)) {
        return new i(this);
      }
      if ((this.b > 5) && (i == 7)) {
        return new s(this);
      }
      return new com.fimi.soul.drone.c.a.a.c(this);
    case 11: 
      return new u(this);
    case 135: 
      return new v(this);
    case 122: 
      return new q(this);
    case 105: 
      return new bi(this);
    case 10: 
      return new ab(this);
    case 128: 
      return new at(this);
    case 108: 
      localObject = new t();
      ((t)localObject).a(this);
      return (b)localObject;
    case 52: 
      localObject = new m();
      ((m)localObject).a(this);
      return (b)localObject;
    case 12: 
      return new x(this);
    case 136: 
      localObject = new k();
      ((k)localObject).a(this);
      return (b)localObject;
    case 137: 
      localObject = new l();
      ((l)localObject).a(this);
      return (b)localObject;
    }
    Log.d("MILink", "UNKNOW MESSAGE - " + this.c);
    return new ad(this);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/drone/c/a/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */