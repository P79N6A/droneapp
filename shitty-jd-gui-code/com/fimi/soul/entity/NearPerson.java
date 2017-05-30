package com.fimi.soul.entity;

import java.io.Serializable;

public class NearPerson
  implements Serializable
{
  private String curLatitude;
  private String curLongitude;
  private String distance;
  private String nickName;
  private String timeDifference;
  private String userID;
  private String userImgUrl;
  
  public String getCurLatitude()
  {
    return this.curLatitude;
  }
  
  public String getCurLongitude()
  {
    return this.curLongitude;
  }
  
  public String getDistance()
  {
    return this.distance;
  }
  
  public String getNickName()
  {
    return this.nickName;
  }
  
  public String getTimeDifference()
  {
    return this.timeDifference;
  }
  
  public String getUserID()
  {
    return this.userID;
  }
  
  public String getUserImgUrl()
  {
    return this.userImgUrl;
  }
  
  public void setCurLatitude(String paramString)
  {
    this.curLatitude = paramString;
  }
  
  public void setCurLongitude(String paramString)
  {
    this.curLongitude = paramString;
  }
  
  public void setDistance(String paramString)
  {
    this.distance = paramString;
  }
  
  public void setNickName(String paramString)
  {
    this.nickName = paramString;
  }
  
  public void setTimeDifference(String paramString)
  {
    this.timeDifference = paramString;
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


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/entity/NearPerson.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */