package com.fimi.soul.entity;

public class DroneInfoBean
{
  private String appSoftVersion;
  private String camerId;
  private int camerVersion;
  private int cloudSoftVersion;
  private int cloudXVersion;
  private String cloudXid;
  private String coulidId;
  private int flySoftVersion;
  private int lightStreamVersion;
  private int nosafeZoneVersion;
  private String phoneDevice;
  private String receiverId;
  private int receiverSoftVersion;
  private String relayId;
  private int relayVersion;
  private String remoteId;
  private int remoteSoftVersion;
  private String telePhoneId;
  
  public DroneInfoBean() {}
  
  public DroneInfoBean(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7)
  {
    this.flySoftVersion = paramInt1;
    this.remoteSoftVersion = paramInt2;
    this.cloudSoftVersion = paramInt3;
    this.camerVersion = paramInt4;
    this.relayVersion = paramInt5;
    this.cloudXVersion = paramInt6;
    this.nosafeZoneVersion = paramInt7;
  }
  
  public String getAppSoftVersion()
  {
    return this.appSoftVersion;
  }
  
  public String getCamerId()
  {
    return this.camerId;
  }
  
  public int getCamerVersion()
  {
    return this.camerVersion;
  }
  
  public int getCloudSoftVersion()
  {
    return this.cloudSoftVersion;
  }
  
  public int getCloudXVersion()
  {
    return this.cloudXVersion;
  }
  
  public String getCoulidId()
  {
    return this.coulidId;
  }
  
  public int getFlySoftVersion()
  {
    return this.flySoftVersion;
  }
  
  public int getLightStreamVersion()
  {
    return this.lightStreamVersion;
  }
  
  public int getNosafeZoneVersion()
  {
    return this.nosafeZoneVersion;
  }
  
  public String getPhoneDevice()
  {
    return this.phoneDevice;
  }
  
  public String getReceiverId()
  {
    return this.receiverId;
  }
  
  public int getReceiverSoftVersion()
  {
    return this.receiverSoftVersion;
  }
  
  public String getRelayId()
  {
    return this.relayId;
  }
  
  public int getRelayVersion()
  {
    return this.relayVersion;
  }
  
  public String getRemoteId()
  {
    return this.remoteId;
  }
  
  public int getRemoteSoftVersion()
  {
    return this.remoteSoftVersion;
  }
  
  public String getTelePhoneId()
  {
    return this.telePhoneId;
  }
  
  public boolean isNeedVersionAgain()
  {
    return (this.flySoftVersion <= 0) || (this.remoteSoftVersion <= 0) || (this.cloudSoftVersion <= 0) || (this.cloudXVersion <= 0) || (this.nosafeZoneVersion <= 0) || (this.lightStreamVersion <= 0);
  }
  
  public void setAppSoftVersion(String paramString)
  {
    this.appSoftVersion = paramString;
  }
  
  public void setCamerId(String paramString)
  {
    this.camerId = paramString;
  }
  
  public void setCamerVersion(int paramInt)
  {
    this.camerVersion = paramInt;
  }
  
  public void setCloudSoftVersion(int paramInt)
  {
    this.cloudSoftVersion = paramInt;
  }
  
  public void setCloudXVersion(int paramInt)
  {
    this.cloudXVersion = paramInt;
  }
  
  public void setCoulidId(String paramString)
  {
    this.coulidId = paramString;
  }
  
  public void setFlySoftVersion(int paramInt)
  {
    this.flySoftVersion = paramInt;
  }
  
  public void setLightStreamVersion(int paramInt)
  {
    this.lightStreamVersion = paramInt;
  }
  
  public void setNosafeZoneVersion(int paramInt)
  {
    this.nosafeZoneVersion = paramInt;
  }
  
  public void setPhoneDevice(String paramString)
  {
    this.phoneDevice = paramString;
  }
  
  public void setReceiverId(String paramString)
  {
    this.receiverId = paramString;
  }
  
  public void setReceiverSoftVersion(int paramInt)
  {
    this.receiverSoftVersion = paramInt;
  }
  
  public void setRelayId(String paramString)
  {
    this.relayId = paramString;
  }
  
  public void setRelayVersion(int paramInt)
  {
    this.relayVersion = paramInt;
  }
  
  public void setRemoteId(String paramString)
  {
    this.remoteId = paramString;
  }
  
  public void setRemoteSoftVersion(int paramInt)
  {
    this.remoteSoftVersion = paramInt;
  }
  
  public void setTelePhoneId(String paramString)
  {
    this.telePhoneId = paramString;
  }
  
  public String toString()
  {
    StringBuffer localStringBuffer = new StringBuffer();
    if (this.remoteSoftVersion > 0)
    {
      localStringBuffer.append("遥控器逻辑版本：" + this.remoteSoftVersion + "\n");
      if (this.flySoftVersion <= 0) {
        break label335;
      }
      localStringBuffer.append("飞控逻辑版本：" + this.flySoftVersion + "\n");
      label86:
      if (this.cloudSoftVersion <= 0) {
        break label345;
      }
      localStringBuffer.append("云台逻辑版本：" + this.cloudSoftVersion + "\n");
      label125:
      if (this.lightStreamVersion <= 0) {
        break label355;
      }
      localStringBuffer.append("光流的逻辑版本：" + this.lightStreamVersion + "\n");
      label164:
      if (this.nosafeZoneVersion <= 0) {
        break label365;
      }
      localStringBuffer.append("禁飞区逻辑版本：" + this.nosafeZoneVersion + "\n");
      label203:
      if (this.cloudXVersion <= 0) {
        break label375;
      }
      localStringBuffer.append("伺服逻辑版本：" + this.cloudXVersion + "\n");
      label242:
      if (this.relayVersion <= 0) {
        break label385;
      }
      localStringBuffer.append("中继逻辑版本：" + this.relayVersion + "\n");
      label281:
      if (this.camerVersion <= 0) {
        break label395;
      }
      localStringBuffer.append("相机逻辑版本：" + this.camerVersion + "\n");
    }
    for (;;)
    {
      return localStringBuffer.toString();
      localStringBuffer.append("遥控器逻辑版本：未获取到。\n");
      break;
      label335:
      localStringBuffer.append("飞控逻辑版本：未获取到。\n");
      break label86;
      label345:
      localStringBuffer.append("云台逻辑版本：未获取到。\n");
      break label125;
      label355:
      localStringBuffer.append("光流逻辑版本：未获取到。\n");
      break label164;
      label365:
      localStringBuffer.append("禁飞区逻辑版本：未获取到\n");
      break label203;
      label375:
      localStringBuffer.append("伺服逻辑版本：未获取到。\n");
      break label242;
      label385:
      localStringBuffer.append("中继逻辑版本:未获取到。\n");
      break label281;
      label395:
      localStringBuffer.append("相机逻辑版本：未获取到。\n");
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/entity/DroneInfoBean.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */