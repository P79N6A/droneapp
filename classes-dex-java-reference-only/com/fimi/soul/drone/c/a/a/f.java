package com.fimi.soul.drone.c.a.a;

import com.fimi.soul.biz.camera.e.a;
import com.fimi.soul.drone.c.a.b;
import com.fimi.soul.drone.c.a.c;
import com.fimi.soul.drone.d.a;
import com.fimi.soul.drone.h.h.a;
import com.fimi.soul.drone.h.h.c;
import com.fimi.soul.drone.h.h.d;
import com.fimi.soul.drone.h.h.e;
import com.fimi.soul.drone.h.h.f;
import com.fimi.soul.module.dronemanage.j;
import java.nio.ByteBuffer;
import java.text.SimpleDateFormat;
import java.util.Date;

public class f
{
  public static final int a = 49;
  public static final int b = 51;
  public static final int c = 50;
  public static final int d = 51;
  private static f e;
  private com.fimi.soul.drone.a f;
  private com.fimi.soul.module.dronemanage.a g;
  private com.fimi.soul.module.dronemanage.a h;
  private com.fimi.soul.module.dronemanage.a i;
  private com.fimi.soul.module.dronemanage.a j;
  private SimpleDateFormat k = new SimpleDateFormat("yyyyMMddHHmmss");
  
  public static f a(com.fimi.soul.drone.a parama)
  {
    try
    {
      if (e == null)
      {
        e = new f();
        e.f = parama;
      }
      parama = e;
      return parama;
    }
    finally {}
  }
  
  private void a(int paramInt, byte[] paramArrayOfByte)
  {
    a(h.a(paramInt, paramArrayOfByte));
  }
  
  private void a(c paramc)
  {
    n().T().a(paramc);
  }
  
  public static boolean a(b paramb, com.fimi.soul.drone.a parama)
  {
    if ((paramb.a == 49) || (paramb.a == 50) || (paramb.a == 51))
    {
      parama.c = ((g)paramb).b();
      if (paramb.a == 50) {
        parama.a((com.fimi.soul.drone.h.g)parama.c);
      }
      parama.a(d.a.aH);
      return true;
    }
    return false;
  }
  
  private byte[] a(int paramInt)
  {
    byte[] arrayOfByte = new byte[paramInt];
    int m = 0;
    while (m < paramInt)
    {
      arrayOfByte[m] = 0;
      m += 1;
    }
    return arrayOfByte;
  }
  
  private com.fimi.soul.drone.a n()
  {
    return this.f;
  }
  
  private byte[] o()
  {
    return new byte[10];
  }
  
  public void a()
  {
    c localc = h.a(50, new byte[] { 0 });
    if (this.g == null) {
      this.g = new com.fimi.soul.module.dronemanage.a();
    }
    this.g.a(this.f, localc);
    this.g.a();
  }
  
  public void a(e.a parama)
  {
    if (parama == e.a.a)
    {
      if (this.i == null) {
        this.i = new com.fimi.soul.module.dronemanage.a();
      }
      this.i.b();
    }
    if (parama == e.a.c)
    {
      if (this.j == null) {
        this.j = new com.fimi.soul.module.dronemanage.a();
      }
      this.j.b();
    }
    if (parama == e.a.b)
    {
      if (this.h == null) {
        this.h = new com.fimi.soul.module.dronemanage.a();
      }
      this.h.b();
    }
  }
  
  public void a(h.a parama)
  {
    byte[] arrayOfByte = a(13);
    switch (1.d[parama.ordinal()])
    {
    }
    for (;;)
    {
      a(h.a(50, arrayOfByte));
      return;
      arrayOfByte[3] = -63;
      continue;
      arrayOfByte[3] = -62;
      continue;
      arrayOfByte[3] = -61;
    }
  }
  
  public void a(h.c paramc)
  {
    byte[] arrayOfByte = a(13);
    switch (1.e[paramc.ordinal()])
    {
    }
    for (;;)
    {
      a(h.a(50, arrayOfByte));
      return;
      arrayOfByte[4] = -63;
      continue;
      arrayOfByte[4] = -62;
      continue;
      arrayOfByte[4] = -61;
    }
  }
  
  public void a(h.d paramd)
  {
    byte[] arrayOfByte = a(13);
    switch (1.a[paramd.ordinal()])
    {
    }
    for (;;)
    {
      a(h.a(50, arrayOfByte));
      return;
      arrayOfByte[0] = -63;
      continue;
      arrayOfByte[0] = -62;
      continue;
      arrayOfByte[0] = -61;
    }
  }
  
  public void a(h.e parame)
  {
    byte[] arrayOfByte = a(13);
    switch (1.c[parame.ordinal()])
    {
    }
    for (;;)
    {
      a(h.a(50, arrayOfByte));
      return;
      arrayOfByte[2] = -63;
      continue;
      arrayOfByte[2] = -62;
      continue;
      arrayOfByte[2] = -61;
      continue;
      arrayOfByte[2] = -60;
      continue;
      arrayOfByte[2] = -59;
      continue;
      arrayOfByte[2] = -58;
      continue;
      arrayOfByte[2] = -57;
      continue;
      arrayOfByte[2] = -56;
      continue;
      arrayOfByte[2] = -55;
      continue;
      arrayOfByte[2] = -54;
    }
  }
  
  public void a(h.f paramf)
  {
    byte[] arrayOfByte = a(13);
    switch (1.b[paramf.ordinal()])
    {
    }
    for (;;)
    {
      a(h.a(50, arrayOfByte));
      return;
      arrayOfByte[1] = -63;
      continue;
      arrayOfByte[1] = -62;
      continue;
      arrayOfByte[1] = -61;
    }
  }
  
  public void a(Date paramDate)
  {
    byte[] arrayOfByte = a(13);
    paramDate = ByteBuffer.allocate(4).putInt(Integer.parseInt(this.k.format(paramDate))).array();
    int m = 0;
    while (m < paramDate.length)
    {
      arrayOfByte[(arrayOfByte.length - paramDate.length + m)] = paramDate[m];
      m += 1;
    }
    a(h.a(50, arrayOfByte));
  }
  
  public void a(boolean paramBoolean)
  {
    byte[] arrayOfByte = a(13);
    if (paramBoolean) {
      arrayOfByte[6] = -63;
    }
    for (;;)
    {
      a(h.a(50, new byte[] { 1, 0, 0, 0 }));
      return;
      arrayOfByte[6] = -62;
    }
  }
  
  public void b()
  {
    c localc = h.a(49, new byte[] { 1, 0, 0, 0 });
    if (this.i == null) {
      this.i = new com.fimi.soul.module.dronemanage.a();
    }
    this.i.a(this.f, localc);
    this.i.a();
  }
  
  public void b(boolean paramBoolean)
  {
    a(h.a(49, new byte[] { 1, 0, 0, 0 }));
  }
  
  public void c()
  {
    c localc = h.a(51, new byte[] { 1, 0, 0, 0 });
    this.f.T().a(localc);
  }
  
  public void c(boolean paramBoolean)
  {
    a(h.a(50, new byte[] { 1, 0, 0, 0 }));
  }
  
  public void d()
  {
    c localc = h.a(49, new byte[] { 2, 0, 0, 0 });
    if (this.j == null) {
      this.j = new com.fimi.soul.module.dronemanage.a();
    }
    this.j.a(this.f, localc);
    this.j.a();
  }
  
  public void e()
  {
    a(h.a(49, new byte[] { 3, 0, 0, 0 }));
  }
  
  public void f()
  {
    c localc = h.a(49, new byte[] { 4, 0, 0, 0 });
    if (this.h == null) {
      this.h = new com.fimi.soul.module.dronemanage.a();
    }
    this.h.a(this.f, localc);
    this.h.a();
  }
  
  public void g()
  {
    c localc = h.a(49, new byte[] { 8, 0, 0, 0 });
    j.a(this.f, localc);
    j.a();
  }
  
  public void h()
  {
    c localc = h.a(49, new byte[] { 9, 0, 0, 0 });
    j.a(this.f, localc);
    j.a();
  }
  
  public void i()
  {
    c localc = h.a(49, new byte[] { 6, 0, 0, 0 });
    j.a(this.f, localc);
    j.a();
  }
  
  public void j()
  {
    a(h.a(49, new byte[] { 0, 1, 0, 0 }));
  }
  
  public void k()
  {
    a(h.a(49, new byte[] { 0, 2, 0, 0 }));
  }
  
  public void l()
  {
    a(h.a(49, new byte[] { 1, 0, 1, 0 }));
  }
  
  public void m()
  {
    a(h.a(49, new byte[] { 1, 0, 0, 1 }));
  }
  
  public static enum a
  {
    private a() {}
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/drone/c/a/a/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */