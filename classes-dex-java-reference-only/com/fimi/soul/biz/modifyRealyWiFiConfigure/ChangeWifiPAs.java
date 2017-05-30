package com.fimi.soul.biz.modifyRealyWiFiConfigure;

import java.io.Serializable;

public class ChangeWifiPAs
  implements Serializable
{
  private CommadBean command;
  private Fwap fwdap;
  
  public CommadBean getmCommadBean()
  {
    return this.command;
  }
  
  public Fwap getmFwap()
  {
    return this.fwdap;
  }
  
  public void setmCommadBean(CommadBean paramCommadBean)
  {
    this.command = paramCommadBean;
  }
  
  public void setmFwap(Fwap paramFwap)
  {
    this.fwdap = paramFwap;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/biz/modifyRealyWiFiConfigure/ChangeWifiPAs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */