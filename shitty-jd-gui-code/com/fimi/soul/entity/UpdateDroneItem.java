package com.fimi.soul.entity;

import java.io.Serializable;

public class UpdateDroneItem
  implements Serializable
{
  private double distance;
  private String endddata;
  private String fcType;
  private int flag;
  private double latitude;
  private double longitude;
  private double maxhight;
  private int month;
  private String planeID;
  private String record_time;
  private double sportTime;
  private String uploadurl;
  private long user_id;
  private int year;
  
  public double getDistance()
  {
    return this.distance;
  }
  
  public String getEndddata()
  {
    return this.endddata;
  }
  
  public String getFcType()
  {
    return this.fcType;
  }
  
  public int getFlag()
  {
    return this.flag;
  }
  
  public double getLatitude()
  {
    return this.latitude;
  }
  
  public double getLongitude()
  {
    return this.longitude;
  }
  
  public double getMaxhight()
  {
    return this.maxhight;
  }
  
  public int getMonth()
  {
    return this.month;
  }
  
  public String getPlaneID()
  {
    return this.planeID;
  }
  
  public String getRecord_time()
  {
    return this.record_time;
  }
  
  public double getSportTime()
  {
    return this.sportTime;
  }
  
  public String getUploadurl()
  {
    return this.uploadurl;
  }
  
  public long getUser_id()
  {
    return this.user_id;
  }
  
  public int getYear()
  {
    return this.year;
  }
  
  public void setDistance(double paramDouble)
  {
    this.distance = paramDouble;
  }
  
  public void setEndddata(String paramString)
  {
    this.endddata = paramString;
  }
  
  public void setFcType(String paramString)
  {
    this.fcType = paramString;
  }
  
  public void setFlag(int paramInt)
  {
    this.flag = paramInt;
  }
  
  public void setLatitude(double paramDouble)
  {
    this.latitude = paramDouble;
  }
  
  public void setLongitude(double paramDouble)
  {
    this.longitude = paramDouble;
  }
  
  public void setMaxhight(double paramDouble)
  {
    this.maxhight = paramDouble;
  }
  
  public void setMonth(int paramInt)
  {
    this.month = paramInt;
  }
  
  public void setPlaneID(String paramString)
  {
    this.planeID = paramString;
  }
  
  public void setRecord_time(String paramString)
  {
    this.record_time = paramString;
  }
  
  public void setSportTime(double paramDouble)
  {
    this.sportTime = paramDouble;
  }
  
  public void setUploadurl(String paramString)
  {
    this.uploadurl = paramString;
  }
  
  public void setUser_id(long paramLong)
  {
    this.user_id = paramLong;
  }
  
  public void setYear(int paramInt)
  {
    this.year = paramInt;
  }
  
  public String toString()
  {
    return "UpdateDroneItem [planeID=" + this.planeID + ", record_time=" + this.record_time + ", user_id=" + this.user_id + ", year=" + this.year + ", month=" + this.month + ", distance=" + this.distance + ", sportTime=" + this.sportTime + ", maxhight=" + this.maxhight + ", endddata=" + this.endddata + ", uploadurl=" + this.uploadurl + ", flag=" + this.flag + "]";
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/entity/UpdateDroneItem.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */