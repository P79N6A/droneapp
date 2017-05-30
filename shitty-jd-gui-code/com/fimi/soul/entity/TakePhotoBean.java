package com.fimi.soul.entity;

import java.io.Serializable;

public class TakePhotoBean
  implements Serializable
{
  private byte CMD_ID;
  private short Climb_Angle;
  private byte Mode;
  private byte Opration_Code;
  private short Route_Length;
  private short Route_Speed;
  
  public byte getCMD_ID()
  {
    return this.CMD_ID;
  }
  
  public short getClimb_Angle()
  {
    return this.Climb_Angle;
  }
  
  public byte getMode()
  {
    return this.Mode;
  }
  
  public byte getOpration_Code()
  {
    return this.Opration_Code;
  }
  
  public short getRoute_Length()
  {
    return this.Route_Length;
  }
  
  public short getRoute_Speed()
  {
    return this.Route_Speed;
  }
  
  public void setCMD_ID(byte paramByte)
  {
    this.CMD_ID = paramByte;
  }
  
  public void setClimb_Angle(short paramShort)
  {
    this.Climb_Angle = paramShort;
  }
  
  public void setMode(byte paramByte)
  {
    this.Mode = paramByte;
  }
  
  public void setOpration_Code(byte paramByte)
  {
    this.Opration_Code = paramByte;
  }
  
  public void setRoute_Length(short paramShort)
  {
    this.Route_Length = paramShort;
  }
  
  public void setRoute_Speed(short paramShort)
  {
    this.Route_Speed = paramShort;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/entity/TakePhotoBean.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */