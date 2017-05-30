package com.fimi.soul.biz.camera.c;

import com.fimi.soul.biz.camera.c;
import com.fimi.soul.biz.camera.c.a;
import com.fimi.soul.biz.camera.e.a;
import com.fimi.soul.biz.camera.entity.X11RespCmd;
import com.fimi.soul.biz.camera.entity.X11SystemConfig;
import com.fimi.soul.drone.d.a;
import com.fimi.soul.drone.d.b;

public class e
  extends a
  implements d.b
{
  public e(c paramc)
  {
    super(paramc);
  }
  
  public void a(e.a parama) {}
  
  public void a(boolean paramBoolean, X11RespCmd paramX11RespCmd)
  {
    super.a(paramBoolean, paramX11RespCmd);
    if (paramBoolean) {}
    switch (paramX11RespCmd.getMsg_id())
    {
    default: 
    case 769: 
      do
      {
        return;
      } while (!a().i().isContinueCaptureMode());
      a().a(c.a.d);
      return;
    case 513: 
      a().a(c.a.c);
      return;
    }
    a().a(c.a.b);
  }
  
  public boolean b()
  {
    return false;
  }
  
  public void c()
  {
    a(769);
  }
  
  public void d()
  {
    a(770);
  }
  
  public void e() {}
  
  public void f()
  {
    a(513);
  }
  
  public void g()
  {
    a(514);
  }
  
  public void i() {}
  
  public void j() {}
  
  public void k() {}
  
  public void m()
  {
    a(515);
  }
  
  public void n()
  {
    a(516);
  }
  
  public void onDroneEvent(d.a parama, com.fimi.soul.drone.a parama1) {}
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/biz/camera/c/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */