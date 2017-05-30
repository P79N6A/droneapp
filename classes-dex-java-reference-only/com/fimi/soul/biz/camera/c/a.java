package com.fimi.soul.biz.camera.c;

import android.util.Log;
import com.fimi.soul.biz.camera.b.e;
import com.fimi.soul.biz.camera.c;
import com.fimi.soul.biz.camera.entity.BaseX11Cmd;
import com.fimi.soul.biz.camera.entity.X11RespCmd;
import com.fimi.soul.utils.ad;

public abstract class a
  implements e<X11RespCmd>
{
  private c a;
  
  protected a(c paramc)
  {
    this.a = paramc;
  }
  
  public c a()
  {
    return this.a;
  }
  
  protected void a(int paramInt)
  {
    a(paramInt, null);
  }
  
  protected void a(int paramInt, String paramString)
  {
    a(paramInt, paramString, null);
  }
  
  protected void a(int paramInt, String paramString1, String paramString2)
  {
    BaseX11Cmd localBaseX11Cmd = new BaseX11Cmd();
    localBaseX11Cmd.setMsg_id(paramInt);
    localBaseX11Cmd.setParam(paramString1);
    localBaseX11Cmd.setType(paramString2);
    localBaseX11Cmd.setToken(a().e());
    a(localBaseX11Cmd);
  }
  
  protected void a(BaseX11Cmd paramBaseX11Cmd)
  {
    paramBaseX11Cmd = ad.a(paramBaseX11Cmd) + "\n";
    Log.d("Good", "send cmd:" + paramBaseX11Cmd);
    a().a(paramBaseX11Cmd.getBytes());
  }
  
  public void a(boolean paramBoolean, X11RespCmd paramX11RespCmd) {}
  
  protected void a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    a().a(paramArrayOfByte, paramInt1, paramInt2);
  }
  
  protected BaseX11Cmd b(int paramInt, String paramString1, String paramString2)
  {
    BaseX11Cmd localBaseX11Cmd = new BaseX11Cmd();
    localBaseX11Cmd.setMsg_id(paramInt);
    localBaseX11Cmd.setParam(paramString1);
    localBaseX11Cmd.setType(paramString2);
    localBaseX11Cmd.setToken(a().e());
    return localBaseX11Cmd;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/biz/camera/c/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */