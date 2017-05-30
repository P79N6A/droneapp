package com.fimi.soul.biz.camera.c;

import com.fimi.soul.biz.camera.c;
import com.fimi.soul.biz.camera.entity.X11ApWifiConfig;
import com.fimi.soul.biz.camera.entity.X11RespCmd;

public class g
  extends a
{
  private X11ApWifiConfig a = null;
  
  public g(c paramc)
  {
    super(paramc);
  }
  
  public void a(X11ApWifiConfig paramX11ApWifiConfig)
  {
    String str = String.format("AP_SSID=%s\\nLOCAL_IP=%s\\nESSID=%s\\nAP_CHANNEL=%d", new Object[] { paramX11ApWifiConfig.getApSSID(), paramX11ApWifiConfig.getApIP(), paramX11ApWifiConfig.getApESSID(), Integer.valueOf(paramX11ApWifiConfig.getApChannel()) });
    this.a = paramX11ApWifiConfig;
    a(1538, str);
  }
  
  public void a(boolean paramBoolean, X11RespCmd paramX11RespCmd)
  {
    super.a(paramBoolean, paramX11RespCmd);
    switch (paramX11RespCmd.getMsg_id())
    {
    default: 
      return;
    }
    a().a(this.a);
  }
  
  public void b()
  {
    a(1537);
  }
  
  public void b(X11ApWifiConfig paramX11ApWifiConfig)
  {
    a(1539);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/biz/camera/c/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */