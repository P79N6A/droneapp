package com.fimi.soul.entity;

import java.io.Serializable;

public class SoftInfo
  implements Serializable
{
  private String downloadUrl;
  private String officialWebsite;
  private String softInfoVersion;
  private String userAgreement;
  
  public String getDownloadUrl()
  {
    return this.downloadUrl;
  }
  
  public String getOfficialWebsite()
  {
    return this.officialWebsite;
  }
  
  public String getSoftInfoVersion()
  {
    return this.softInfoVersion;
  }
  
  public String getUserAgreement()
  {
    return this.userAgreement;
  }
  
  public void setDownloadUrl(String paramString)
  {
    this.downloadUrl = paramString;
  }
  
  public void setOfficialWebsite(String paramString)
  {
    this.officialWebsite = paramString;
  }
  
  public void setSoftInfoVersion(String paramString)
  {
    this.softInfoVersion = paramString;
  }
  
  public void setUserAgreement(String paramString)
  {
    this.userAgreement = paramString;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/entity/SoftInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */