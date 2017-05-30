package com.fimi.soul.biz.camera.entity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class X11FileSystem
{
  private X11FileInfo curDownloadFile;
  private long curDownloadOffset = 0L;
  private String curPath;
  private X11FileInfo curUploadFile;
  private long curUploadFileOffset;
  private Map<String, List<X11FileInfo>> fileList = new HashMap();
  private List<X11FileInfo> infos = null;
  
  public List<X11FileInfo> getCurDirFileList()
  {
    List localList1 = null;
    if (this.curPath != null) {
      localList1 = (List)getFileList().get(this.curPath);
    }
    List localList2;
    if ((this.infos != null) && (this.infos.size() > 0)) {
      localList2 = this.infos;
    }
    do
    {
      return localList2;
      localList2 = localList1;
    } while (localList1 != null);
    return new ArrayList();
  }
  
  public X11FileInfo getCurDownloadFile()
  {
    return this.curDownloadFile;
  }
  
  public long getCurDownloadOffset()
  {
    return this.curDownloadOffset;
  }
  
  public String getCurPath()
  {
    return this.curPath;
  }
  
  public X11FileInfo getCurUploadFile()
  {
    return this.curUploadFile;
  }
  
  public long getCurUploadFileOffset()
  {
    return this.curUploadFileOffset;
  }
  
  public Map<String, List<X11FileInfo>> getFileList()
  {
    return this.fileList;
  }
  
  public List<X11FileInfo> getInfos()
  {
    return this.infos;
  }
  
  public void setCurDownloadFile(X11FileInfo paramX11FileInfo)
  {
    this.curDownloadFile = paramX11FileInfo;
  }
  
  public void setCurDownloadOffset(long paramLong)
  {
    this.curDownloadOffset = paramLong;
  }
  
  public void setCurPath(String paramString)
  {
    this.curPath = paramString;
  }
  
  public void setCurUploadFile(X11FileInfo paramX11FileInfo)
  {
    this.curUploadFile = paramX11FileInfo;
  }
  
  public void setCurUploadFileOffset(long paramLong)
  {
    this.curUploadFileOffset = paramLong;
  }
  
  public void setInfos(List<X11FileInfo> paramList)
  {
    this.infos = paramList;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/biz/camera/entity/X11FileSystem.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */