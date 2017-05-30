package com.fimi.soul.entity;

public class ServerResult<T>
{
  private String commandCode;
  private T data;
  private String errorCode;
  private String errorMessage;
  private String page;
  private String success;
  
  public String getCommandCode()
  {
    return this.commandCode;
  }
  
  public T getData()
  {
    return (T)this.data;
  }
  
  public String getErrorCode()
  {
    return this.errorCode;
  }
  
  public String getErrorMessage()
  {
    return this.errorMessage;
  }
  
  public String getPage()
  {
    return this.page;
  }
  
  public String getSuccess()
  {
    return this.success;
  }
  
  public void setCommandCode(String paramString)
  {
    this.commandCode = paramString;
  }
  
  public void setData(T paramT)
  {
    this.data = paramT;
  }
  
  public void setErrorCode(String paramString)
  {
    this.errorCode = paramString;
  }
  
  public void setErrorMessage(String paramString)
  {
    this.errorMessage = paramString;
  }
  
  public void setPage(String paramString)
  {
    this.page = paramString;
  }
  
  public void setSuccess(String paramString)
  {
    this.success = paramString;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/entity/ServerResult.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */