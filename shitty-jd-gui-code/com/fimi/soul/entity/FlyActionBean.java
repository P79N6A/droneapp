package com.fimi.soul.entity;

import com.google.android.gms.maps.model.LatLng;
import java.io.Serializable;

public class FlyActionBean
  implements Serializable
{
  public int ModelType;
  private int Opration_Code = 16;
  private int Para1 = 3;
  private int drawableRes;
  private int height = 30;
  private int index;
  private boolean isCanExcute = true;
  private boolean isCanclick;
  private LatLng latLng;
  private int ridus = 5;
  private int speek = 1;
  private short start_point_agle;
  private int styleInfo;
  private int type;
  private int yaw_mode;
  
  public int getDrawableRes()
  {
    return this.drawableRes;
  }
  
  public int getHeight()
  {
    return this.height;
  }
  
  public int getIndex()
  {
    return this.index;
  }
  
  public LatLng getLatLng()
  {
    return this.latLng;
  }
  
  public int getModelType()
  {
    return this.ModelType;
  }
  
  public int getOpration_Code()
  {
    return this.Opration_Code;
  }
  
  public int getPara1()
  {
    return this.Para1;
  }
  
  public int getRidus()
  {
    return this.ridus;
  }
  
  public int getSpeek()
  {
    return this.speek;
  }
  
  public short getStart_point_agle()
  {
    return this.start_point_agle;
  }
  
  public int getStyleInfo()
  {
    return this.styleInfo;
  }
  
  public int getType()
  {
    return this.type;
  }
  
  public int getYaw_mode()
  {
    return this.yaw_mode;
  }
  
  public boolean isCanExcute()
  {
    return this.isCanExcute;
  }
  
  public boolean isCanclick()
  {
    return this.isCanclick;
  }
  
  public void setCanExcute(boolean paramBoolean)
  {
    this.isCanExcute = paramBoolean;
  }
  
  public void setCanclick(boolean paramBoolean)
  {
    this.isCanclick = paramBoolean;
  }
  
  public void setDrawableRes(int paramInt)
  {
    this.drawableRes = paramInt;
  }
  
  public void setHeight(int paramInt)
  {
    this.height = paramInt;
  }
  
  public void setIndex(int paramInt)
  {
    this.index = paramInt;
  }
  
  public void setLatLng(LatLng paramLatLng)
  {
    this.latLng = paramLatLng;
  }
  
  public void setModelType(int paramInt)
  {
    this.ModelType = paramInt;
  }
  
  public void setOpration_Code(int paramInt)
  {
    this.Opration_Code = paramInt;
  }
  
  public void setPara1(int paramInt)
  {
    this.Para1 = paramInt;
  }
  
  public void setRidus(int paramInt)
  {
    this.ridus = paramInt;
  }
  
  public void setSpeek(int paramInt)
  {
    this.speek = paramInt;
  }
  
  public void setStart_point_agle(short paramShort)
  {
    this.start_point_agle = paramShort;
  }
  
  public void setStyleInfo(int paramInt)
  {
    this.styleInfo = paramInt;
  }
  
  public void setType(int paramInt)
  {
    this.type = paramInt;
  }
  
  public void setYaw_mode(int paramInt)
  {
    this.yaw_mode = paramInt;
  }
  
  public String toString()
  {
    return "FlyActionBean{styleInfo=" + this.styleInfo + ", height=" + this.height + ", latLng=" + this.latLng + ", drawableRes=" + this.drawableRes + ", index=" + this.index + ", Opration_Code=" + this.Opration_Code + ", speek=" + this.speek + ", ridus=" + this.ridus + ", start_point_agle=" + this.start_point_agle + ", yaw_mode=" + this.yaw_mode + ", Para1=" + this.Para1 + ", ModelType=" + this.ModelType + ", isCanclick=" + this.isCanclick + ", isCanExcute=" + this.isCanExcute + ", type=" + this.type + '}';
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/entity/FlyActionBean.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */