package com.fimi.soul.entity;

public class FmMenuItem
{
  private int iconId;
  private int id;
  private String mark;
  private String text;
  
  public FmMenuItem() {}
  
  public FmMenuItem(int paramInt, String paramString)
  {
    this.id = paramInt;
    this.text = paramString;
  }
  
  public FmMenuItem(String paramString)
  {
    this.text = paramString;
  }
  
  public int getIconId()
  {
    return this.iconId;
  }
  
  public int getId()
  {
    return this.id;
  }
  
  public String getMark()
  {
    return this.mark;
  }
  
  public String getText()
  {
    return this.text;
  }
  
  public void setIconId(int paramInt)
  {
    this.iconId = paramInt;
  }
  
  public void setId(int paramInt)
  {
    this.id = paramInt;
  }
  
  public void setMark(String paramString)
  {
    this.mark = paramString;
  }
  
  public void setText(String paramString)
  {
    this.text = paramString;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/entity/FmMenuItem.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */