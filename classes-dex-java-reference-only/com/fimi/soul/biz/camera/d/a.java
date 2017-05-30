package com.fimi.soul.biz.camera.d;

import com.fimi.soul.biz.camera.b.b;
import com.fimi.soul.biz.camera.b.e;
import com.fimi.soul.biz.camera.entity.X11RespCmd;

public class a
  implements e<X11RespCmd>
{
  private b a;
  
  public void a(b paramb)
  {
    if (this.a != null) {
      this.a.a();
    }
  }
  
  public void a(boolean paramBoolean, X11RespCmd paramX11RespCmd)
  {
    if ((paramBoolean) && (this.a.c())) {
      a(this.a.b());
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/biz/camera/d/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */