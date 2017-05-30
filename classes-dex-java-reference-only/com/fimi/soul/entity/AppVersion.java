package com.fimi.soul.entity;

import java.io.Serializable;

public class AppVersion
  implements Serializable
{
  private String apkUrl;
  private String newVersion;
  private String updcontents;
  private String uploadTime;
  
  public String getApkUrl()
  {
    return this.apkUrl;
  }
  
  public String getNewVersion()
  {
    return this.newVersion;
  }
  
  public String getUpdcontents()
  {
    return this.updcontents;
  }
  
  public String getUploadTime()
  {
    return this.uploadTime;
  }
  
  public void setApkUrl(String paramString)
  {
    this.apkUrl = paramString;
  }
  
  public void setNewVersion(String paramString)
  {
    this.newVersion = paramString;
  }
  
  public void setUpdcontents(String paramString)
  {
    this.updcontents = paramString;
  }
  
  public void setUploadTime(String paramString)
  {
    this.uploadTime = paramString;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/entity/AppVersion.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */