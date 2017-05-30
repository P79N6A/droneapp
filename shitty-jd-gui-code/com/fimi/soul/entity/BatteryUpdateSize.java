package com.fimi.soul.entity;

public class BatteryUpdateSize
{
  private String batteryId;
  private int batteryUpdateSize;
  private int messageHintSize;
  
  public String getBatteryId()
  {
    return this.batteryId;
  }
  
  public int getBatteryUpdateSize()
  {
    return this.batteryUpdateSize;
  }
  
  public int getMessageHintSize()
  {
    return this.messageHintSize;
  }
  
  public void setBatteryId(String paramString)
  {
    this.batteryId = paramString;
  }
  
  public void setBatteryUpdateSize(int paramInt)
  {
    this.batteryUpdateSize = paramInt;
  }
  
  public void setMessageHintSize(int paramInt)
  {
    this.messageHintSize = paramInt;
  }
  
  public String toString()
  {
    return "BatteryUpdateSize{batteryId='" + this.batteryId + '\'' + ", batteryUpdateSize=" + this.batteryUpdateSize + ", messageHintSize=" + this.messageHintSize + '}';
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/entity/BatteryUpdateSize.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */