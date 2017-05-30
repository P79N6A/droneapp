package com.fimi.soul.biz.camera.entity;

import com.fimi.soul.biz.camera.e;

public class X11FileInfo
{
  public static final String FILE_TYPE_JPG = ".jpg";
  public static final String FILE_TYPE_MP4 = ".MP4";
  private String absolutePath;
  private String createDate;
  private String localPath;
  private String md5;
  private String name;
  private int offset;
  private String remotePath;
  private long size;
  
  public String getAbsolutePath()
  {
    return this.absolutePath;
  }
  
  public String getCreateDate()
  {
    return this.createDate;
  }
  
  public String getHttpThmUrl()
  {
    int i = this.remotePath.indexOf(".");
    if (i > 0) {
      String.format("http://%s/%s", new Object[] { e.a(), this.remotePath.substring(0, i) + "_THM.MP4" });
    }
    return null;
  }
  
  public String getHttpUrl()
  {
    return String.format("http://%s/%s", new Object[] { e.a(), this.remotePath });
  }
  
  public String getLocalPath()
  {
    return this.localPath;
  }
  
  public String getMd5()
  {
    return this.md5;
  }
  
  public String getName()
  {
    return this.name;
  }
  
  public int getOffset()
  {
    return this.offset;
  }
  
  public String getRemotePath()
  {
    return this.remotePath;
  }
  
  public long getSize()
  {
    return this.size;
  }
  
  public void setAbsolutePath(String paramString)
  {
    this.absolutePath = paramString;
  }
  
  public void setCreateDate(String paramString)
  {
    this.createDate = paramString;
  }
  
  public void setLocalPath(String paramString)
  {
    this.localPath = paramString;
  }
  
  public void setMd5(String paramString)
  {
    this.md5 = paramString;
  }
  
  public void setName(String paramString)
  {
    this.name = paramString;
  }
  
  public void setOffset(int paramInt)
  {
    this.offset = paramInt;
  }
  
  public void setRemotePath(String paramString)
  {
    this.remotePath = paramString;
  }
  
  public void setSize(long paramLong)
  {
    this.size = paramLong;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/biz/camera/entity/X11FileInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */