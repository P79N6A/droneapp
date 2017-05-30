package com.fimi.soul.entity;

import java.io.Serializable;
import java.util.Date;

public class MomentAction
  implements Serializable
{
  private static final long serialVersionUID = 1L;
  private double curHight;
  private double curLatitude;
  private double curLongitude;
  private double curSpeed;
  private Date curTime;
  private PlaneAction planeAction;
  
  public double getCurHight()
  {
    return this.curHight;
  }
  
  public double getCurLatitude()
  {
    return this.curLatitude;
  }
  
  public double getCurLongitude()
  {
    return this.curLongitude;
  }
  
  public double getCurSpeed()
  {
    return this.curSpeed;
  }
  
  public Date getCurTime()
  {
    return this.curTime;
  }
  
  public PlaneAction getPlaneAction()
  {
    return this.planeAction;
  }
  
  public void setCurHight(double paramDouble)
  {
    this.curHight = paramDouble;
  }
  
  public void setCurLatitude(double paramDouble)
  {
    this.curLatitude = paramDouble;
  }
  
  public void setCurLongitude(double paramDouble)
  {
    this.curLongitude = paramDouble;
  }
  
  public void setCurSpeed(double paramDouble)
  {
    this.curSpeed = paramDouble;
  }
  
  public void setCurTime(Date paramDate)
  {
    this.curTime = paramDate;
  }
  
  public void setPlaneAction(PlaneAction paramPlaneAction)
  {
    this.planeAction = paramPlaneAction;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/entity/MomentAction.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */