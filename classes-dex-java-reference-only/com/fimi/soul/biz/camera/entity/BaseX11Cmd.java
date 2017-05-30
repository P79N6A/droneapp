package com.fimi.soul.biz.camera.entity;

import java.io.Serializable;

public class BaseX11Cmd
  implements Serializable
{
  private int fetch_size;
  private String md5sum;
  private int msg_id = 0;
  private int offset;
  private String[] options;
  private String param;
  private String rem_size;
  private int rval = 0;
  private long sent_size = 0L;
  private long size = 0L;
  private int token = 0;
  private String type;
  
  public int getFetch_size()
  {
    return this.fetch_size;
  }
  
  public String getMd5sum()
  {
    return this.md5sum;
  }
  
  public int getMsg_id()
  {
    return this.msg_id;
  }
  
  public int getOffset()
  {
    return this.offset;
  }
  
  public String[] getOptions()
  {
    return this.options;
  }
  
  public String getParam()
  {
    return this.param;
  }
  
  public String getRem_size()
  {
    return this.rem_size;
  }
  
  public int getRval()
  {
    return this.rval;
  }
  
  public long getSent_size()
  {
    return this.sent_size;
  }
  
  public long getSize()
  {
    return this.size;
  }
  
  public int getToken()
  {
    return this.token;
  }
  
  public String getType()
  {
    return this.type;
  }
  
  public void setFetch_size(int paramInt)
  {
    this.fetch_size = paramInt;
  }
  
  public void setMd5sum(String paramString)
  {
    this.md5sum = paramString;
  }
  
  public void setMsg_id(int paramInt)
  {
    this.msg_id = paramInt;
  }
  
  public void setOffset(int paramInt)
  {
    this.offset = paramInt;
  }
  
  public void setOptions(String[] paramArrayOfString)
  {
    this.options = paramArrayOfString;
  }
  
  public void setParam(String paramString)
  {
    this.param = paramString;
  }
  
  public void setRem_size(String paramString)
  {
    this.rem_size = paramString;
  }
  
  public void setRval(int paramInt)
  {
    this.rval = paramInt;
  }
  
  public void setSent_size(long paramLong)
  {
    this.sent_size = paramLong;
  }
  
  public void setSize(long paramLong)
  {
    this.size = paramLong;
  }
  
  public void setToken(int paramInt)
  {
    this.token = paramInt;
  }
  
  public void setType(String paramString)
  {
    this.type = paramString;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/biz/camera/entity/BaseX11Cmd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */