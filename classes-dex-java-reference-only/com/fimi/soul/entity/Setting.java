package com.fimi.soul.entity;

import java.util.Observable;

public class Setting
  extends Observable
{
  private String content;
  private boolean displayTv = false;
  private int id;
  private boolean isCheckedButton;
  private Boolean isOPen = Boolean.valueOf(false);
  private int newHandModel;
  
  public String getContent()
  {
    return this.content;
  }
  
  public int getId()
  {
    return this.id;
  }
  
  public Boolean getIsOPen()
  {
    return this.isOPen;
  }
  
  public int getNewHandModel()
  {
    return this.newHandModel;
  }
  
  public boolean isCheckedButton()
  {
    return this.isCheckedButton;
  }
  
  public boolean isDisplayTv()
  {
    return this.displayTv;
  }
  
  public void setCheckedButton(boolean paramBoolean)
  {
    this.isCheckedButton = paramBoolean;
  }
  
  public void setContent(String paramString)
  {
    this.content = paramString;
    setChanged();
    notifyObservers();
  }
  
  public void setDisplayTv(boolean paramBoolean)
  {
    this.displayTv = paramBoolean;
  }
  
  public void setId(int paramInt)
  {
    this.id = paramInt;
  }
  
  public void setIsOPen(Boolean paramBoolean)
  {
    if (this.isOPen != null) {
      if (paramBoolean.booleanValue()) {
        break label41;
      }
    }
    label41:
    for (int i = 1;; i = 0)
    {
      if (i == this.isOPen.booleanValue())
      {
        setChanged();
        notifyObservers();
        this.isOPen = paramBoolean;
      }
      return;
    }
  }
  
  public void setNewHandModel(int paramInt)
  {
    this.newHandModel = paramInt;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/entity/Setting.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */