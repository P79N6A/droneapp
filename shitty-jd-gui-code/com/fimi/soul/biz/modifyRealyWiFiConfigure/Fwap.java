package com.fimi.soul.biz.modifyRealyWiFiConfigure;

import java.io.Serializable;

public class Fwap
  implements Serializable
{
  private String key;
  private String ssid;
  
  public String getKey()
  {
    return this.key;
  }
  
  public String getSsid()
  {
    return this.ssid;
  }
  
  public void setKey(String paramString)
  {
    this.key = paramString;
  }
  
  public void setSsid(String paramString)
  {
    this.ssid = paramString;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/biz/modifyRealyWiFiConfigure/Fwap.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */