package com.fimi.soul.biz.modifyRealyWiFiConfigure;

import java.io.Serializable;

public class CommadBean
  implements Serializable
{
  private String data;
  private String name;
  private String type;
  
  public String getData()
  {
    return this.data;
  }
  
  public String getName()
  {
    return this.name;
  }
  
  public String getType()
  {
    return this.type;
  }
  
  public void setData(String paramString)
  {
    this.data = paramString;
  }
  
  public void setName(String paramString)
  {
    this.name = paramString;
  }
  
  public void setType(String paramString)
  {
    this.type = paramString;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/biz/modifyRealyWiFiConfigure/CommadBean.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */