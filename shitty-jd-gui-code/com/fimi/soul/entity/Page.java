package com.fimi.soul.entity;

import java.io.Serializable;

public class Page
  implements Serializable
{
  private static final long serialVersionUID = 1L;
  private int curpage;
  private int rows = 20;
  private int total;
  
  public int getCurpage()
  {
    return this.curpage;
  }
  
  public int getRows()
  {
    return this.rows;
  }
  
  public int getTotal()
  {
    return this.total;
  }
  
  public void setCurpage(int paramInt)
  {
    this.curpage = paramInt;
  }
  
  public void setRows(int paramInt)
  {
    this.rows = paramInt;
  }
  
  public void setTotal(int paramInt)
  {
    this.total = paramInt;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/entity/Page.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */