package com.fimi.soul.biz.camera.entity;

public class X11SystemConfigOption
{
  private String defaultOption;
  private String[] options;
  private String[] optionsText;
  private String permission;
  private String type;
  
  public String getDefaultOption()
  {
    return this.defaultOption;
  }
  
  public String[] getOptions()
  {
    return this.options;
  }
  
  public String[] getOptionsText()
  {
    return this.optionsText;
  }
  
  public String getPermission()
  {
    return this.permission;
  }
  
  public String getType()
  {
    return this.type;
  }
  
  public boolean isReadonly()
  {
    return "readonly".equals(this.permission);
  }
  
  public void setDefaultOption(String paramString)
  {
    this.defaultOption = paramString;
  }
  
  public void setOptions(String[] paramArrayOfString)
  {
    this.options = paramArrayOfString;
  }
  
  public void setOptionsText(String[] paramArrayOfString)
  {
    this.optionsText = paramArrayOfString;
  }
  
  public void setPermission(String paramString)
  {
    this.permission = paramString;
  }
  
  public void setType(String paramString)
  {
    this.type = paramString;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/biz/camera/entity/X11SystemConfigOption.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */