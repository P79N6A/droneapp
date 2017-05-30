package com.fimi.soul.entity;

import java.io.Serializable;
import java.util.List;

public class AddressInfo
  implements Serializable
{
  private static final long serialVersionUID = 1L;
  private String long_name;
  private String short_name;
  private List<String> types;
  
  public String getLong_name()
  {
    return this.long_name;
  }
  
  public String getShort_name()
  {
    return this.short_name;
  }
  
  public List<String> getTypes()
  {
    return this.types;
  }
  
  public void setLong_name(String paramString)
  {
    this.long_name = paramString;
  }
  
  public void setShort_name(String paramString)
  {
    this.short_name = paramString;
  }
  
  public void setTypes(List<String> paramList)
  {
    this.types = paramList;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/entity/AddressInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */