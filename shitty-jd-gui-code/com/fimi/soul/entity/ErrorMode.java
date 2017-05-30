package com.fimi.soul.entity;

import java.util.ArrayList;

public class ErrorMode
{
  private boolean isCompassFault = false;
  private boolean isMiddleFault = false;
  ArrayList lightErrorList = new ArrayList();
  ArrayList seriousErrorList = new ArrayList();
  
  public ArrayList getLightErrorList()
  {
    return this.lightErrorList;
  }
  
  public ArrayList getSeriousErrorList()
  {
    return this.seriousErrorList;
  }
  
  public boolean isCompassFault()
  {
    return this.isCompassFault;
  }
  
  public boolean isMiddleFault()
  {
    return this.isMiddleFault;
  }
  
  public void setIsCompassFault(boolean paramBoolean)
  {
    this.isCompassFault = paramBoolean;
  }
  
  public void setIsMiddleFault(boolean paramBoolean)
  {
    this.isMiddleFault = paramBoolean;
  }
  
  public void setLightErrorList(ArrayList paramArrayList)
  {
    this.lightErrorList = paramArrayList;
  }
  
  public void setSeriousErrorList(ArrayList paramArrayList)
  {
    this.seriousErrorList = paramArrayList;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/entity/ErrorMode.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */