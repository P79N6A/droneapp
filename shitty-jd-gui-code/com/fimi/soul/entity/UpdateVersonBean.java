package com.fimi.soul.entity;

import java.io.Serializable;

public class UpdateVersonBean
  implements Serializable
{
  public static final String SP_CAMERA_VERSION = "sp_camera_version";
  public static final String SP_NEED_DOWN_FIRMWWARES = "sp_need_down_firmwares";
  public static final String SP_RELAY_VERSION = "sp_relay_version";
  public static final int SYSID_AP_CONTROL = 5;
  public static final int SYSID_CAMERRA = 4;
  public static final int SYSID_CLOUD_CONTROL = 3;
  public static final int SYSID_FLY_CONTROL = 0;
  public static final int SYSID_HAND_CONTROL = 1;
  public static final int SYSID_RECEIVER_CONTROL = 2;
  public static final int SYSID_RELAY = 11;
  public static final int SYS_CLOUD_X = 6;
  public static final int SYS_LIGHT_STREAM = 9;
  public static final int SYS_SAFETY_ZONE = 10;
  public static final String UPGRADE_FORCE = "1";
  public static final String UPGRADE_FORCE_IGNORE_VERSION = "2";
  public static final String UPGRADE_UNFORCE = "0";
  private int adminid;
  private String binKey;
  private String fieldNames;
  private String fileEncode;
  private String forceSign;
  private int id;
  private String modelName;
  private String newVersion;
  private int pk;
  private String preversion;
  private String size;
  private int sort;
  private String status;
  private int sysid;
  private String sysname;
  private String updcontents;
  private String uploadTime;
  private String url;
  
  public int getAdminid()
  {
    return this.adminid;
  }
  
  public String getBinKey()
  {
    return this.binKey;
  }
  
  public String getFieldNames()
  {
    return this.fieldNames;
  }
  
  public String getFileEncode()
  {
    return this.fileEncode;
  }
  
  public String getForceSign()
  {
    return this.forceSign;
  }
  
  public int getId()
  {
    return this.id;
  }
  
  public String getModelName()
  {
    return this.modelName;
  }
  
  public String getNewVersion()
  {
    return this.newVersion;
  }
  
  public int getPk()
  {
    return this.pk;
  }
  
  public String getPreversion()
  {
    return this.preversion;
  }
  
  public String getSize()
  {
    return this.size;
  }
  
  public int getSort()
  {
    return this.sort;
  }
  
  public String getStatus()
  {
    return this.status;
  }
  
  public int getSysid()
  {
    return this.sysid;
  }
  
  public String getSysname()
  {
    return this.sysname;
  }
  
  public String getUpdcontents()
  {
    return this.updcontents;
  }
  
  public String getUploadTime()
  {
    return this.uploadTime;
  }
  
  public String getUrl()
  {
    return this.url;
  }
  
  public void setAdminid(int paramInt)
  {
    this.adminid = paramInt;
  }
  
  public void setBinKey(String paramString)
  {
    this.binKey = paramString;
  }
  
  public void setFieldNames(String paramString)
  {
    this.fieldNames = paramString;
  }
  
  public void setFileEncode(String paramString)
  {
    this.fileEncode = paramString;
  }
  
  public void setForceSign(String paramString)
  {
    this.forceSign = paramString;
  }
  
  public void setId(int paramInt)
  {
    this.id = paramInt;
  }
  
  public void setModelName(String paramString)
  {
    this.modelName = paramString;
  }
  
  public void setNewVersion(String paramString)
  {
    this.newVersion = paramString;
  }
  
  public void setPk(int paramInt)
  {
    this.pk = paramInt;
  }
  
  public void setPreversion(String paramString)
  {
    this.preversion = paramString;
  }
  
  public void setSize(String paramString)
  {
    this.size = paramString;
  }
  
  public void setSort(int paramInt)
  {
    this.sort = paramInt;
  }
  
  public void setStatus(String paramString)
  {
    this.status = paramString;
  }
  
  public void setSysid(int paramInt)
  {
    this.sysid = paramInt;
  }
  
  public void setSysname(String paramString)
  {
    this.sysname = paramString;
  }
  
  public void setUpdcontents(String paramString)
  {
    this.updcontents = paramString;
  }
  
  public void setUploadTime(String paramString)
  {
    this.uploadTime = paramString;
  }
  
  public void setUrl(String paramString)
  {
    this.url = paramString;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/entity/UpdateVersonBean.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */