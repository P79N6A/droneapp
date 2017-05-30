package com.fimi.soul.entity;

import java.io.Serializable;

public class FirmwareReqType
  implements Serializable
{
  private String deviceID;
  private int sysID;
  private String type;
  private String version;
  
  public String getDeviceID()
  {
    return this.deviceID;
  }
  
  public int getSysID()
  {
    return this.sysID;
  }
  
  public String getType()
  {
    return this.type;
  }
  
  public String getVersion()
  {
    return this.version;
  }
  
  public void setDeviceID(String paramString)
  {
    this.deviceID = paramString;
  }
  
  public void setSysID(int paramInt)
  {
    this.sysID = paramInt;
  }
  
  public void setType(String paramString)
  {
    this.type = paramString;
  }
  
  public void setVersion(String paramString)
  {
    this.version = paramString;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/entity/FirmwareReqType.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */