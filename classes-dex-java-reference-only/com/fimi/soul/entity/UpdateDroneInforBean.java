package com.fimi.soul.entity;

public class UpdateDroneInforBean
{
  private DroneInfoBean mDroneInfoBean;
  private String planeID;
  private String userID;
  
  public String getPlaneID()
  {
    return this.planeID;
  }
  
  public String getUserID()
  {
    return this.userID;
  }
  
  public DroneInfoBean getmDroneInfoBean()
  {
    return this.mDroneInfoBean;
  }
  
  public void setPlaneID(String paramString)
  {
    this.planeID = paramString;
  }
  
  public void setUserID(String paramString)
  {
    this.userID = paramString;
  }
  
  public void setmDroneInfoBean(DroneInfoBean paramDroneInfoBean)
  {
    this.mDroneInfoBean = paramDroneInfoBean;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/entity/UpdateDroneInforBean.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */