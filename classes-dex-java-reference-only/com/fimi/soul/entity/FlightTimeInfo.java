package com.fimi.soul.entity;

import java.io.Serializable;

public class FlightTimeInfo
  implements Serializable
{
  private int flyCount;
  private String planeID;
  private long totalDistance;
  private long totalFlyTime;
  private long totalRealFlyTime;
  
  public int getFlyCount()
  {
    return this.flyCount;
  }
  
  public String getPlaneID()
  {
    return this.planeID;
  }
  
  public long getTotalDistance()
  {
    return this.totalDistance;
  }
  
  public long getTotalFlyTime()
  {
    return this.totalFlyTime;
  }
  
  public long getTotalRealFlyTime()
  {
    return this.totalRealFlyTime;
  }
  
  public void setFlyCount(int paramInt)
  {
    this.flyCount = paramInt;
  }
  
  public void setPlaneID(String paramString)
  {
    this.planeID = paramString;
  }
  
  public void setTotalDistance(long paramLong)
  {
    this.totalDistance = paramLong;
  }
  
  public void setTotalFlyTime(long paramLong)
  {
    this.totalFlyTime = paramLong;
  }
  
  public void setTotalRealFlyTime(long paramLong)
  {
    this.totalRealFlyTime = paramLong;
  }
  
  public String toString()
  {
    return "FlightTimeInfo{totalFlyTime=" + this.totalFlyTime + ", flyCount=" + this.flyCount + ", totalDistance=" + this.totalDistance + ", planeID='" + this.planeID + '\'' + ", totalRealFlyTime=" + this.totalRealFlyTime + '}';
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/entity/FlightTimeInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */