package com.fimi.soul.biz.camera.a;

import android.os.Message;
import com.fimi.kernel.b.c.a;
import com.fimi.soul.biz.camera.b.f;
import com.fimi.soul.biz.camera.e;

public class b
  extends com.fimi.kernel.b
  implements f
{
  private com.fimi.kernel.b.d.c a = (com.fimi.kernel.b.d.c)com.fimi.kernel.c.a(com.fimi.kernel.b.d.c);
  private com.fimi.kernel.b.d.c b;
  
  public b()
  {
    com.fimi.kernel.b.d.d locald = this.a.f();
    locald.a(e.a());
    locald.a(7878);
    locald.b(10240);
    locald.b(true);
    this.b = ((com.fimi.kernel.b.d.c)com.fimi.kernel.c.a(com.fimi.kernel.b.d.c));
    locald = this.b.f();
    locald.a(e.a());
    locald.a(8787);
    locald.b(10240);
    locald.b(true);
  }
  
  protected void a(Message paramMessage) {}
  
  public void a(a parama)
  {
    this.b.b(parama);
  }
  
  public void a(com.fimi.kernel.b.c.d paramd)
  {
    this.a.a(paramd);
  }
  
  public void a(final byte[] paramArrayOfByte)
  {
    try
    {
      a(new Runnable()
      {
        public void run()
        {
          try
          {
            if (!b.a(b.this).b()) {
              b.a(b.this).d();
            }
            b.a(b.this).a(paramArrayOfByte);
            return;
          }
          catch (Exception localException)
          {
            localException.printStackTrace();
          }
        }
      });
      return;
    }
    finally
    {
      paramArrayOfByte = finally;
      throw paramArrayOfByte;
    }
  }
  
  public void a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    try
    {
      if (!this.b.b()) {
        this.b.d();
      }
      this.b.a(paramArrayOfByte, paramInt1, paramInt2);
      return;
    }
    finally {}
  }
  
  public void b()
  {
    this.a.g();
    this.b.g();
  }
  
  public void b(a parama)
  {
    this.b.a(parama);
  }
  
  public void b(com.fimi.kernel.b.c.d paramd)
  {
    this.a.b(paramd);
  }
  
  public boolean c()
  {
    return this.a.b();
  }
  
  public void d()
  {
    this.a.g();
    this.a.d();
  }
  
  public void e()
  {
    this.b.g();
    this.b.d();
  }
  
  public com.fimi.kernel.b.d.c f()
  {
    return this.a;
  }
  
  public com.fimi.kernel.b.d.c g()
  {
    return this.b;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/biz/camera/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */