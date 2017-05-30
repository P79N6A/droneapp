package com.fimi.soul.entity;

import java.io.Serializable;

public class Describehistor
  implements Serializable
{
  private String name;
  private double sumTime;
  private String userID;
  private String userImgUrl;
  
  public String getName()
  {
    return this.name;
  }
  
  public double getSumTime()
  {
    return this.sumTime;
  }
  
  public String getUserID()
  {
    return this.userID;
  }
  
  public String getUserImgUrl()
  {
    return this.userImgUrl;
  }
  
  public void setName(String paramString)
  {
    this.name = paramString;
  }
  
  public void setSumTime(double paramDouble)
  {
    this.sumTime = paramDouble;
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


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/entity/Describehistor.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */