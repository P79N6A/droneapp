package com.fimi.soul.biz.modifyRealyWiFiConfigure;

import com.fimi.kernel.b.d.c;
import com.fimi.kernel.utils.x;
import com.fimi.soul.biz.e.d;
import com.fimi.soul.utils.ad;

public class ModifyRelayWiFi
{
  private volatile String password;
  private volatile String ssid;
  
  public static ModifyRelayWiFi getInstance()
  {
    return CreatemidifyRelayWiFi.MMIDIFY_RELAY_WI_FI;
  }
  
  public String getPassword()
  {
    return this.password;
  }
  
  public String getSsid()
  {
    return this.ssid;
  }
  
  public void sendModifyCongigure()
  {
    x.b(new Runnable()
    {
      public void run()
      {
        CommadBean localCommadBean = new CommadBean();
        localCommadBean.setType("0");
        localCommadBean.setData("fwdap");
        localCommadBean.setName("modify");
        Fwap localFwap = new Fwap();
        localFwap.setKey(ModifyRelayWiFi.this.password);
        localFwap.setSsid(ModifyRelayWiFi.this.ssid);
        c localc = d.a().o();
        ChangeWifiPAs localChangeWifiPAs = new ChangeWifiPAs();
        localChangeWifiPAs.setmCommadBean(localCommadBean);
        localChangeWifiPAs.setmFwap(localFwap);
        localc.a(ad.a(localChangeWifiPAs).getBytes());
      }
    });
  }
  
  public void setPassword(String paramString)
  {
    this.password = paramString;
  }
  
  public void setSsid(String paramString)
  {
    this.ssid = paramString;
  }
  
  private static class CreatemidifyRelayWiFi
  {
    private static final ModifyRelayWiFi MMIDIFY_RELAY_WI_FI = new ModifyRelayWiFi();
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/biz/modifyRealyWiFiConfigure/ModifyRelayWiFi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */