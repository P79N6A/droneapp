package com.fimi.soul.entity;

import java.io.Serializable;

public class UpdateAllPlannerHistory
  implements Serializable
{
  private String endDate;
  private String flyFileUrl;
  private double flyJourney;
  private double flyTime;
  private double flyTimeSum;
  private double maxHight;
  private int month;
  private String planeID;
  private String startDate;
  private int userID;
  private int year;
  
  public String getEndDate()
  {
    return this.endDate;
  }
  
  public String getFlyFileUrl()
  {
    return this.flyFileUrl;
  }
  
  public double getFlyJourney()
  {
    return this.flyJourney;
  }
  
  public double getFlyTime()
  {
    return this.flyTime;
  }
  
  public double getFlyTimeSum()
  {
    return this.flyTimeSum;
  }
  
  public double getMaxHight()
  {
    return this.maxHight;
  }
  
  public int getMonth()
  {
    return this.month;
  }
  
  public String getPlaneID()
  {
    return this.planeID;
  }
  
  public String getStartDate()
  {
    return this.startDate;
  }
  
  public int getUserID()
  {
    return this.userID;
  }
  
  public int getYear()
  {
    return this.year;
  }
  
  public void setEndDate(String paramString)
  {
    this.endDate = paramString;
  }
  
  public void setFlyFileUrl(String paramString)
  {
    this.flyFileUrl = paramString;
  }
  
  public void setFlyJourney(double paramDouble)
  {
    this.flyJourney = paramDouble;
  }
  
  public void setFlyTime(double paramDouble)
  {
    this.flyTime = paramDouble;
  }
  
  public void setFlyTimeSum(double paramDouble)
  {
    this.flyTimeSum = paramDouble;
  }
  
  public void setMaxHight(double paramDouble)
  {
    this.maxHight = paramDouble;
  }
  
  public void setMonth(int paramInt)
  {
    this.month = paramInt;
  }
  
  public void setPlaneID(String paramString)
  {
    this.planeID = paramString;
  }
  
  public void setStartDate(String paramString)
  {
    this.startDate = paramString;
  }
  
  public void setUserID(int paramInt)
  {
    this.userID = paramInt;
  }
  
  public void setYear(int paramInt)
  {
    this.year = paramInt;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/entity/UpdateAllPlannerHistory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */