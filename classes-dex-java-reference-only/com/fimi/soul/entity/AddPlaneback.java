package com.fimi.soul.entity;

import java.io.Serializable;

public class AddPlaneback
  implements Serializable
{
  private int charge_count;
  private String cloud_deck_ID;
  private String fieldNames;
  private String fly_control_ID;
  private String note;
  private int pk;
  private long planeID;
  private String receiver_control_ID;
  private String remote_control_ID;
  private int userID;
  
  public int getCharge_count()
  {
    return this.charge_count;
  }
  
  public String getCloud_deck_ID()
  {
    return this.cloud_deck_ID;
  }
  
  public String getFieldNames()
  {
    return this.fieldNames;
  }
  
  public String getFly_control_ID()
  {
    return this.fly_control_ID;
  }
  
  public String getNote()
  {
    return this.note;
  }
  
  public int getPk()
  {
    return this.pk;
  }
  
  public long getPlaneID()
  {
    return this.planeID;
  }
  
  public String getReceiver_control_ID()
  {
    return this.receiver_control_ID;
  }
  
  public String getRemote_control_ID()
  {
    return this.remote_control_ID;
  }
  
  public int getUserID()
  {
    return this.userID;
  }
  
  public void setCharge_count(int paramInt)
  {
    this.charge_count = paramInt;
  }
  
  public void setCloud_deck_ID(String paramString)
  {
    this.cloud_deck_ID = paramString;
  }
  
  public void setFieldNames(String paramString)
  {
    this.fieldNames = paramString;
  }
  
  public void setFly_control_ID(String paramString)
  {
    this.fly_control_ID = paramString;
  }
  
  public void setNote(String paramString)
  {
    this.note = paramString;
  }
  
  public void setPk(int paramInt)
  {
    this.pk = paramInt;
  }
  
  public void setPlaneID(long paramLong)
  {
    this.planeID = paramLong;
  }
  
  public void setReceiver_control_ID(String paramString)
  {
    this.receiver_control_ID = paramString;
  }
  
  public void setRemote_control_ID(String paramString)
  {
    this.remote_control_ID = paramString;
  }
  
  public void setUserID(int paramInt)
  {
    this.userID = paramInt;
  }
  
  public String toString()
  {
    return "AddPlaneback [fieldNames=" + this.fieldNames + ", pk=" + this.pk + ", userID=" + this.userID + ", note=" + this.note + ", remote_control_ID=" + this.remote_control_ID + ", planeID=" + this.planeID + ", charge_count=" + this.charge_count + ", cloud_deck_ID=" + this.cloud_deck_ID + ", fly_control_ID=" + this.fly_control_ID + ", receiver_control_ID=" + this.receiver_control_ID + "]";
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/entity/AddPlaneback.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */