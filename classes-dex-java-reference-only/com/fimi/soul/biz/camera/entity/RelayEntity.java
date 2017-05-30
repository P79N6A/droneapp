package com.fimi.soul.biz.camera.entity;

public class RelayEntity
{
  private String device_type;
  private int firmupg_finished;
  private String hw_version;
  private boolean isConnectCamera;
  private int quality;
  private String sw_version;
  
  public String getDevice_type()
  {
    return this.device_type;
  }
  
  public int getFirmupg_finished()
  {
    return this.firmupg_finished;
  }
  
  public String getHw_version()
  {
    return this.hw_version;
  }
  
  public int getQuality()
  {
    return this.quality;
  }
  
  public String getSw_version()
  {
    return this.sw_version;
  }
  
  public boolean isConnectCamera()
  {
    return this.isConnectCamera;
  }
  
  public void setDevice_type(String paramString)
  {
    this.device_type = paramString;
  }
  
  public void setFirmupg_finished(int paramInt)
  {
    this.firmupg_finished = paramInt;
  }
  
  public void setHw_version(String paramString)
  {
    this.hw_version = paramString;
  }
  
  public void setIsConnectCamera(boolean paramBoolean)
  {
    this.isConnectCamera = paramBoolean;
  }
  
  public void setQuality(int paramInt)
  {
    this.quality = paramInt;
  }
  
  public void setSw_version(String paramString)
  {
    this.sw_version = paramString;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/biz/camera/entity/RelayEntity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */