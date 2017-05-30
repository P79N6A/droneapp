package com.fimi.soul.entity;

public class CameraInfo
{
  public Double focalLength;
  public boolean isInLandscapeOrientation = true;
  public String name;
  public Double overlap;
  public Double sensorHeight;
  public Double sensorResolution;
  public Double sensorWidth;
  public Double sidelap;
  
  public Double getSensorLateralSize()
  {
    if (this.isInLandscapeOrientation) {
      return this.sensorWidth;
    }
    return this.sensorHeight;
  }
  
  public Double getSensorLongitudinalSize()
  {
    if (this.isInLandscapeOrientation) {
      return this.sensorHeight;
    }
    return this.sensorWidth;
  }
  
  public String toString()
  {
    return "ImageWidth:" + this.sensorWidth + " ImageHeight:" + this.sensorHeight + " FocalLength:" + this.focalLength + " Overlap:" + this.overlap + " Sidelap:" + this.sidelap + " isInLandscapeOrientation:" + this.isInLandscapeOrientation;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/entity/CameraInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */