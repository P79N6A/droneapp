package com.fimi.soul.biz.camera.entity;

import com.fimi.soul.biz.camera.e;
import com.fimi.soul.utils.am;
import java.util.Map;

public class X11ApWifiConfig
{
  private int ApChannel = 4;
  private String ApESSID = "amba_TEST";
  private String ApIP = e.a();
  private String ApSSID = "AMBA";
  
  public static X11ApWifiConfig build(String paramString)
  {
    X11ApWifiConfig localX11ApWifiConfig = new X11ApWifiConfig();
    try
    {
      paramString = am.a(paramString);
      localX11ApWifiConfig.setApSSID((String)paramString.get("AP_SSID"));
      localX11ApWifiConfig.setApIP((String)paramString.get("LOCAL_IP"));
      localX11ApWifiConfig.setApChannel(Integer.parseInt((String)paramString.get("AP_CHANNEL")));
      return localX11ApWifiConfig;
    }
    catch (Exception paramString) {}
    return localX11ApWifiConfig;
  }
  
  public int getApChannel()
  {
    return this.ApChannel;
  }
  
  public String getApESSID()
  {
    return this.ApESSID;
  }
  
  public String getApIP()
  {
    return this.ApIP;
  }
  
  public String getApSSID()
  {
    return this.ApSSID;
  }
  
  public void setApChannel(int paramInt)
  {
    this.ApChannel = paramInt;
  }
  
  public void setApESSID(String paramString)
  {
    this.ApESSID = paramString;
  }
  
  public void setApIP(String paramString)
  {
    this.ApIP = paramString;
  }
  
  public void setApSSID(String paramString)
  {
    this.ApSSID = paramString;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/biz/camera/entity/X11ApWifiConfig.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */