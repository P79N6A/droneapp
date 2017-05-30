package com.fimi.soul.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class SuggestBean
  implements Serializable
{
  private String commandCode = "addSuggestion";
  private String contact;
  private String content;
  private List<String> list = new ArrayList();
  private String model;
  private String userID;
  
  public String getCommandCode()
  {
    return this.commandCode;
  }
  
  public String getContact()
  {
    return this.contact;
  }
  
  public String getContent()
  {
    return this.content;
  }
  
  public List<String> getList()
  {
    return this.list;
  }
  
  public String getModel()
  {
    return this.model;
  }
  
  public String getUserID()
  {
    return this.userID;
  }
  
  public void setCommandCode(String paramString)
  {
    this.commandCode = paramString;
  }
  
  public void setContact(String paramString)
  {
    this.contact = paramString;
  }
  
  public void setContent(String paramString)
  {
    this.content = paramString;
  }
  
  public void setList(List<String> paramList)
  {
    this.list = paramList;
  }
  
  public void setModel(String paramString)
  {
    this.model = paramString;
  }
  
  public void setUserID(String paramString)
  {
    if ((paramString == null) || ("".equals(paramString)))
    {
      this.userID = "0";
      return;
    }
    this.userID = paramString;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/entity/SuggestBean.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */