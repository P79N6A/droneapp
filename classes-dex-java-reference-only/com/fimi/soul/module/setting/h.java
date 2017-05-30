package com.fimi.soul.module.setting;

import java.io.Serializable;

public class h
  implements Serializable
{
  private String a;
  private boolean b = false;
  
  public String a()
  {
    return this.a;
  }
  
  public void a(String paramString)
  {
    this.a = paramString;
  }
  
  public void a(boolean paramBoolean)
  {
    this.b = paramBoolean;
  }
  
  public boolean b()
  {
    return this.b;
  }
  
  public String toString()
  {
    return "RollerItemEntity{itemName='" + this.a + '\'' + ", is_able=" + this.b + '}';
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/module/setting/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */