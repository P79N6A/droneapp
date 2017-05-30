package com.fimi.soul.entity;

import java.io.File;
import java.io.Serializable;

public class PlaneMsg
  implements Serializable
{
  private static final long serialVersionUID = 1L;
  private String commandCode;
  private Object data;
  private String errorCode;
  private String errorMessage;
  private File file;
  private Page page;
  private boolean success;
  
  public String getCommandCode()
  {
    return this.commandCode;
  }
  
  public Object getData()
  {
    return this.data;
  }
  
  public String getErrorCode()
  {
    return this.errorCode;
  }
  
  public String getErrorMessage()
  {
    return this.errorMessage;
  }
  
  public File getFile()
  {
    return this.file;
  }
  
  public Page getPage()
  {
    return this.page;
  }
  
  public boolean isSuccess()
  {
    return this.success;
  }
  
  public void setCommandCode(String paramString)
  {
    this.commandCode = paramString;
  }
  
  public void setData(Object paramObject)
  {
    this.data = paramObject;
  }
  
  public void setErrorCode(String paramString)
  {
    this.errorCode = paramString;
  }
  
  public void setErrorMessage(String paramString)
  {
    this.errorMessage = paramString;
  }
  
  public void setFile(File paramFile)
  {
    this.file = paramFile;
  }
  
  public void setPage(Page paramPage)
  {
    this.page = paramPage;
  }
  
  public void setSuccess(boolean paramBoolean)
  {
    this.success = paramBoolean;
  }
  
  public String toString()
  {
    return "PlaneMsg{errorMessage='" + this.errorMessage + '\'' + ", commandCode='" + this.commandCode + '\'' + ", errorCode='" + this.errorCode + '\'' + ", data=" + this.data + ", page=" + this.page + ", success=" + this.success + ", file=" + this.file + '}';
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/entity/PlaneMsg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */