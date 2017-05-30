package com.fimi.soul.entity;

import java.io.Serializable;

public class Relation
  implements Serializable
{
  private static final long serialVersionUID = 1L;
  private String flyTimes;
  private String nickName;
  private String relationID;
  private String signature;
  private String userID;
  private String userImgUrl;
  
  public String getFlyTimes()
  {
    return this.flyTimes;
  }
  
  public String getNickName()
  {
    return this.nickName;
  }
  
  public String getRelationID()
  {
    return this.relationID;
  }
  
  public String getSignature()
  {
    return this.signature;
  }
  
  public String getUserID()
  {
    return this.userID;
  }
  
  public String getUserImgUrl()
  {
    return this.userImgUrl;
  }
  
  public void setFlyTimes(String paramString)
  {
    this.flyTimes = paramString;
  }
  
  public void setNickName(String paramString)
  {
    this.nickName = paramString;
  }
  
  public void setRelationID(String paramString)
  {
    this.relationID = paramString;
  }
  
  public void setSignature(String paramString)
  {
    this.signature = paramString;
  }
  
  public void setUserID(String paramString)
  {
    this.userID = paramString;
  }
  
  public void setUserImgUrl(String paramString)
  {
    this.userImgUrl = paramString;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/entity/Relation.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */