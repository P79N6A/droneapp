package com.fimi.soul.biz.camera.c;

import com.fimi.kernel.utils.v;
import com.fimi.soul.biz.camera.b;
import com.fimi.soul.biz.camera.c.a;
import com.fimi.soul.biz.camera.d;
import com.fimi.soul.biz.camera.entity.BaseX11Cmd;
import com.fimi.soul.biz.camera.entity.X11RespCmd;

public class f
  extends a
{
  int a = 0;
  
  public f(com.fimi.soul.biz.camera.c paramc)
  {
    super(paramc);
  }
  
  public void a(boolean paramBoolean)
  {
    BaseX11Cmd localBaseX11Cmd = b(1793, null, null);
    localBaseX11Cmd.setToken(this.a);
    if (paramBoolean) {}
    for (int i = 0;; i = -1)
    {
      localBaseX11Cmd.setRval(i);
      if (paramBoolean)
      {
        localBaseX11Cmd.setToken(this.a);
        a().a(this.a);
      }
      a(localBaseX11Cmd);
      return;
    }
  }
  
  public void a(boolean paramBoolean, X11RespCmd paramX11RespCmd)
  {
    super.a(paramBoolean, paramX11RespCmd);
    switch (paramX11RespCmd.getMsg_id())
    {
    default: 
      return;
    case 257: 
      if (paramBoolean)
      {
        a().a(Integer.parseInt(paramX11RespCmd.getParam().toString()));
        this.a = a().e();
        a().a(c.a.b);
        a().o();
        ((d)b.a().d()).r().d();
        com.fimi.kernel.c.e().c(true);
        com.fimi.kernel.c.e().d(true);
        return;
      }
      a().a(-1);
      return;
    }
    a(true);
  }
  
  public void b()
  {
    BaseX11Cmd localBaseX11Cmd = b(257, null, null);
    localBaseX11Cmd.setToken(0);
    a(localBaseX11Cmd);
  }
  
  public void c()
  {
    a(258);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/biz/camera/c/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */