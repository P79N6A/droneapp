package com.fimi.soul.entity;

import java.io.Serializable;

public class Plane
  implements Serializable
{
  private static final long serialVersionUID = 1L;
  private String flyControlID;
  private long id;
  private String note;
  private String rcIC;
  private User user;
  private String version;
  
  public String getFlyControlID()
  {
    return this.flyControlID;
  }
  
  public long getId()
  {
    return this.id;
  }
  
  public String getNote()
  {
    return this.note;
  }
  
  public String getRcIC()
  {
    return this.rcIC;
  }
  
  public User getUser()
  {
    return this.user;
  }
  
  public String getVersion()
  {
    return this.version;
  }
  
  public void setFlyControlID(String paramString)
  {
    this.flyControlID = paramString;
  }
  
  public void setId(long paramLong)
  {
    this.id = paramLong;
  }
  
  public void setNote(String paramString)
  {
    this.note = paramString;
  }
  
  public void setRcIC(String paramString)
  {
    this.rcIC = paramString;
  }
  
  public void setUser(User paramUser)
  {
    this.user = paramUser;
  }
  
  public void setVersion(String paramString)
  {
    this.version = paramString;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/entity/Plane.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */