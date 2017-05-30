package com.fimi.soul.entity;

public class FdsMsg
{
  private String bucketName;
  private String filePath;
  private String objectName;
  private long total;
  private long transferred;
  private String url;
  
  public String getBucketName()
  {
    return this.bucketName;
  }
  
  public String getFilePath()
  {
    return this.filePath;
  }
  
  public String getObjectName()
  {
    return this.objectName;
  }
  
  public long getTotal()
  {
    return this.total;
  }
  
  public long getTransferred()
  {
    return this.transferred;
  }
  
  public String getUrl()
  {
    return this.url;
  }
  
  public void setBucketName(String paramString)
  {
    this.bucketName = paramString;
  }
  
  public void setFilePath(String paramString)
  {
    this.filePath = paramString;
  }
  
  public void setObjectName(String paramString)
  {
    this.objectName = paramString;
  }
  
  public void setTotal(long paramLong)
  {
    this.total = paramLong;
  }
  
  public void setTransferred(long paramLong)
  {
    this.transferred = paramLong;
  }
  
  public void setUrl(String paramString)
  {
    this.url = paramString;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/entity/FdsMsg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */