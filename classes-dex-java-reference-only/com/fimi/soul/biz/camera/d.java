package com.fimi.soul.biz.camera;

import com.fimi.soul.biz.camera.c.e;
import com.fimi.soul.biz.camera.c.f;
import com.fimi.soul.biz.camera.c.g;
import java.text.SimpleDateFormat;
import java.util.Date;

public class d
  extends c
{
  private com.fimi.soul.biz.camera.c.c d = new com.fimi.soul.biz.camera.c.c(this);
  private com.fimi.soul.biz.camera.c.d e = new com.fimi.soul.biz.camera.c.d(this);
  private f f = new f(this);
  private e g = new e(this);
  private g h = new g(this);
  private com.fimi.soul.biz.camera.c.b i;
  
  public d(com.fimi.soul.biz.camera.b.c paramc)
  {
    super(paramc);
    a(this.d);
    a(this.e);
    a(this.f);
    a(this.g);
    a(this.h);
    this.i = new com.fimi.soul.biz.camera.c.b(this);
    a(this.i);
  }
  
  public g q()
  {
    return this.h;
  }
  
  public com.fimi.soul.biz.camera.c.c r()
  {
    return this.d;
  }
  
  public com.fimi.soul.biz.camera.c.d s()
  {
    return this.e;
  }
  
  public f t()
  {
    return this.f;
  }
  
  public e u()
  {
    if (b.a().b()) {
      return this.g;
    }
    return this.i;
  }
  
  public void v()
  {
    String str = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
    r().a("camera_clock", str);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/biz/camera/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */