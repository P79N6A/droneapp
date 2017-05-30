package com.fimi.soul.entity;

import java.io.Serializable;
import java.util.Date;

public class PlaneAction
  implements Serializable
{
  private static final long serialVersionUID = 1L;
  private Date allTime;
  private double averageSpeed;
  private double distance;
  private String location;
  private double maxSpeed;
  private String note;
  private Plane plane;
  private String status;
  private User user;
  
  public Date getAllTime()
  {
    return this.allTime;
  }
  
  public double getAverageSpeed()
  {
    return this.averageSpeed;
  }
  
  public double getDistance()
  {
    return this.distance;
  }
  
  public String getLocation()
  {
    return this.location;
  }
  
  public double getMaxSpeed()
  {
    return this.maxSpeed;
  }
  
  public String getNote()
  {
    return this.note;
  }
  
  public Plane getPlane()
  {
    return this.plane;
  }
  
  public String getStatus()
  {
    return this.status;
  }
  
  public User getUser()
  {
    return this.user;
  }
  
  public void setAllTime(Date paramDate)
  {
    this.allTime = paramDate;
  }
  
  public void setAverageSpeed(double paramDouble)
  {
    this.averageSpeed = paramDouble;
  }
  
  public void setDistance(double paramDouble)
  {
    this.distance = paramDouble;
  }
  
  public void setLocation(String paramString)
  {
    this.location = paramString;
  }
  
  public void setMaxSpeed(double paramDouble)
  {
    this.maxSpeed = paramDouble;
  }
  
  public void setNote(String paramString)
  {
    this.note = paramString;
  }
  
  public void setPlane(Plane paramPlane)
  {
    this.plane = paramPlane;
  }
  
  public void setStatus(String paramString)
  {
    this.status = paramString;
  }
  
  public void setUser(User paramUser)
  {
    this.user = paramUser;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/entity/PlaneAction.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */