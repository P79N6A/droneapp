package com.fimi.soul.entity;

import java.io.Serializable;

public class UpgradeResultInfo
  implements Serializable
{
  private String jsonStr;
  private String userID;
  
  public String getJsonStr()
  {
    return this.jsonStr;
  }
  
  public String getUserID()
  {
    return this.userID;
  }
  
  public void setJsonStr(String paramString)
  {
    this.jsonStr = paramString;
  }
  
  public void setUserID(String paramString)
  {
    this.userID = paramString;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/entity/UpgradeResultInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */