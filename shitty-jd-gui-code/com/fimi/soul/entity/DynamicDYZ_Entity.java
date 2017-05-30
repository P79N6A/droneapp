package com.fimi.soul.entity;

import java.io.Serializable;

public class DynamicDYZ_Entity
  implements Serializable
{
  private String encryptKey;
  private String encryptValue;
  private long endDate;
  private int id;
  private long insertDate;
  private double latitude;
  private double logitude;
  private int radius;
  private String remarks;
  private long startDate;
  private int status;
  private int type;
  
  public String getEncryptKey()
  {
    return this.encryptKey;
  }
  
  public String getEncryptValue()
  {
    return this.encryptValue;
  }
  
  public long getEndDate()
  {
    return this.endDate;
  }
  
  public int getId()
  {
    return this.id;
  }
  
  public long getInsertDate()
  {
    return this.insertDate;
  }
  
  public double getLatitude()
  {
    return this.latitude;
  }
  
  public double getLogitude()
  {
    return this.logitude;
  }
  
  public int getRadius()
  {
    return this.radius;
  }
  
  public String getRemarks()
  {
    return this.remarks;
  }
  
  public long getStartDate()
  {
    return this.startDate;
  }
  
  public int getStatus()
  {
    return this.status;
  }
  
  public int getType()
  {
    return this.type;
  }
  
  public void setEncryptKey(String paramString)
  {
    this.encryptKey = paramString;
  }
  
  public void setEncryptValue(String paramString)
  {
    this.encryptValue = paramString;
  }
  
  public void setEndDate(long paramLong)
  {
    this.endDate = paramLong;
  }
  
  public void setId(int paramInt)
  {
    this.id = paramInt;
  }
  
  public void setInsertDate(long paramLong)
  {
    this.insertDate = paramLong;
  }
  
  public void setLatitude(double paramDouble)
  {
    this.latitude = paramDouble;
  }
  
  public void setLogitude(double paramDouble)
  {
    this.logitude = paramDouble;
  }
  
  public void setRadius(int paramInt)
  {
    this.radius = paramInt;
  }
  
  public void setRemarks(String paramString)
  {
    this.remarks = paramString;
  }
  
  public void setStartDate(long paramLong)
  {
    this.startDate = paramLong;
  }
  
  public void setStatus(int paramInt)
  {
    this.status = paramInt;
  }
  
  public void setType(int paramInt)
  {
    this.type = paramInt;
  }
  
  public String toString()
  {
    return "DynamicDYZ_Entity{encryptValue='" + this.encryptValue + '\'' + ", logitude=" + this.logitude + ", endDate=" + this.endDate + ", latitude=" + this.latitude + ", insertDate=" + this.insertDate + ", id=" + this.id + ", radius=" + this.radius + ", encryptKey='" + this.encryptKey + '\'' + ", type=" + this.type + ", startDate=" + this.startDate + ", status=" + this.status + ", remarks='" + this.remarks + '\'' + '}';
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/entity/DynamicDYZ_Entity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */