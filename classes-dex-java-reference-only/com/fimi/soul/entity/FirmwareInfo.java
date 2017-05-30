package com.fimi.soul.entity;

import java.io.Serializable;

public class FirmwareInfo
  implements Serializable
{
  public static final int SC_DOWN_UPGRADE = 1;
  private String fileEncode;
  private String fileName;
  private long fileSize;
  private String forceSign;
  private String inputTime;
  private int isLowVersion;
  private Boolean isUpgradeSuccess = Boolean.valueOf(false);
  private boolean isVersionError;
  private int model;
  private int sort;
  private int source;
  private String status;
  private int sysId;
  private String sysName;
  private int updateTime;
  private String updcontents;
  private String version;
  
  public FirmwareInfo() {}
  
  public FirmwareInfo(int paramInt1, int paramInt2, String paramString1, String paramString2, String paramString3, String paramString4, int paramInt3, int paramInt4, String paramString5)
  {
    this.sysId = paramInt1;
    this.model = paramInt2;
    this.sysName = paramString1;
    this.status = paramString2;
    this.inputTime = paramString3;
    this.version = paramString4;
    this.isLowVersion = paramInt3;
    this.sort = paramInt4;
    this.fileName = paramString5;
  }
  
  public String getFileEncode()
  {
    return this.fileEncode;
  }
  
  public String getFileName()
  {
    return this.fileName;
  }
  
  public long getFileSize()
  {
    return this.fileSize;
  }
  
  public String getForceSign()
  {
    return this.forceSign;
  }
  
  public String getInputTime()
  {
    return this.inputTime;
  }
  
  public int getIsLowVersion()
  {
    return this.isLowVersion;
  }
  
  public int getModel()
  {
    return this.model;
  }
  
  public int getSort()
  {
    return this.sort;
  }
  
  public int getSource()
  {
    return this.source;
  }
  
  public String getStatus()
  {
    return this.status;
  }
  
  public int getSysId()
  {
    return this.sysId;
  }
  
  public String getSysName()
  {
    return this.sysName;
  }
  
  public int getUpdateTime()
  {
    return this.updateTime;
  }
  
  public String getUpdcontents()
  {
    return this.updcontents;
  }
  
  public String getVersion()
  {
    return this.version;
  }
  
  public Boolean isUpgradeSuccess()
  {
    return this.isUpgradeSuccess;
  }
  
  public boolean isVersionError()
  {
    return this.isVersionError;
  }
  
  public void setFileEncode(String paramString)
  {
    this.fileEncode = paramString;
  }
  
  public void setFileName(String paramString)
  {
    this.fileName = paramString;
  }
  
  public void setFileSize(long paramLong)
  {
    this.fileSize = paramLong;
  }
  
  public void setForceSign(String paramString)
  {
    this.forceSign = paramString;
  }
  
  public void setInputTime(String paramString)
  {
    this.inputTime = paramString;
  }
  
  public void setIsLowVersion(int paramInt)
  {
    this.isLowVersion = paramInt;
  }
  
  public void setIsUpgradeSuccess(Boolean paramBoolean)
  {
    this.isUpgradeSuccess = paramBoolean;
  }
  
  public void setModel(int paramInt)
  {
    this.model = paramInt;
  }
  
  public void setSort(int paramInt)
  {
    this.sort = paramInt;
  }
  
  public void setSource(int paramInt)
  {
    this.source = paramInt;
  }
  
  public void setStatus(String paramString)
  {
    this.status = paramString;
  }
  
  public void setSysId(int paramInt)
  {
    this.sysId = paramInt;
  }
  
  public void setSysName(String paramString)
  {
    this.sysName = paramString;
  }
  
  public void setUpdateTime(int paramInt)
  {
    this.updateTime = paramInt;
  }
  
  public void setUpdcontents(String paramString)
  {
    this.updcontents = paramString;
  }
  
  public void setVersion(String paramString)
  {
    this.version = paramString;
  }
  
  public void setVersionError(boolean paramBoolean)
  {
    this.isVersionError = paramBoolean;
  }
  
  public String toString()
  {
    return "FirmwareInfo{sysId=" + this.sysId + ", model=" + this.model + ", sysName='" + this.sysName + '\'' + ", status='" + this.status + '\'' + ", inputTime='" + this.inputTime + '\'' + ", version='" + this.version + '\'' + ", isLowVersion=" + this.isLowVersion + ", sort=" + this.sort + ", fileName='" + this.fileName + '\'' + '}';
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/entity/FirmwareInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */