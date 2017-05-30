package com.fimi.soul.entity;

import com.fimi.kernel.b.b.b;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class WifiDistanceFile
  implements Serializable
{
  public static final int FILE_TYPE_DIR = 0;
  public static final int FILE_TYPE_IMAGE = 1;
  public static final int FILE_TYPE_UNKNOW_FILE = -1;
  public static final int FILE_TYPE_VIDEO = 2;
  public static final int FILE_TYPE_VOICE = 3;
  private static final long serialVersionUID = 1L;
  private String absolutePath;
  private String dateString;
  b downloadTaskInfo;
  private String durationString;
  private boolean isDir;
  private String localDownloadCachePath;
  private String localThumbnailPath;
  private List<WifiDistanceFile> mFiles = new ArrayList();
  private String name;
  private WifiDistanceFile parentDir;
  private String parentStrDir;
  private String path = "/";
  private String realPath;
  private String remoteThmUrl;
  private String remoteUrl;
  private long size;
  private Object tag;
  private int type;
  
  public WifiDistanceFile(String paramString)
  {
    this.name = paramString;
    this.type = getFileType(paramString);
  }
  
  public static int getFileType(String paramString)
  {
    if (paramString != null)
    {
      int i = paramString.lastIndexOf(".");
      if (i >= 0)
      {
        paramString = paramString.substring(i + 1);
        if ("jpg".equals(paramString.toLowerCase())) {
          return 1;
        }
        if ("mp4".equals(paramString.toLowerCase())) {
          return 2;
        }
        if ("mp3".equals(paramString.toLowerCase())) {
          return 3;
        }
      }
      else
      {
        return 0;
      }
    }
    return -1;
  }
  
  public void addFile(WifiDistanceFile paramWifiDistanceFile)
  {
    paramWifiDistanceFile.setParentStrDir(getPath());
    this.mFiles.add(paramWifiDistanceFile);
  }
  
  public String getAbsolutePath()
  {
    return this.absolutePath;
  }
  
  public String getDateString()
  {
    return this.dateString;
  }
  
  public b getDownloadTaskInfo()
  {
    return this.downloadTaskInfo;
  }
  
  public String getDurationString()
  {
    return this.durationString;
  }
  
  public String getLocalDownloadCachePath()
  {
    return this.localDownloadCachePath;
  }
  
  public String getLocalThumbnailPath()
  {
    return this.localThumbnailPath;
  }
  
  public String getName()
  {
    return this.name;
  }
  
  public WifiDistanceFile getParentDir()
  {
    return this.parentDir;
  }
  
  public String getParentStrDir()
  {
    return this.parentStrDir;
  }
  
  public String getPath()
  {
    return this.path;
  }
  
  public String getRealPath()
  {
    return this.realPath;
  }
  
  public String getRemoteThmUrl()
  {
    return this.remoteThmUrl;
  }
  
  public String getRemoteUrl()
  {
    return this.remoteUrl;
  }
  
  public long getSize()
  {
    return this.size;
  }
  
  public Object getTag()
  {
    return this.tag;
  }
  
  public int getType()
  {
    return this.type;
  }
  
  public List<WifiDistanceFile> getWifDistanceDir()
  {
    return this.mFiles;
  }
  
  public boolean isDir()
  {
    return this.type == 0;
  }
  
  public void setAbsolutePath(String paramString)
  {
    this.absolutePath = paramString;
  }
  
  public void setDateString(String paramString)
  {
    this.dateString = paramString;
  }
  
  public void setDownloadTaskInfo(b paramb)
  {
    this.downloadTaskInfo = paramb;
  }
  
  public void setDurationString(String paramString)
  {
    this.durationString = paramString;
  }
  
  public void setLocalDownloadCachePath(String paramString)
  {
    this.localDownloadCachePath = paramString;
  }
  
  public void setLocalThumbnailPath(String paramString)
  {
    this.localThumbnailPath = paramString;
  }
  
  public void setName(String paramString)
  {
    this.name = paramString;
  }
  
  public void setParentDir(WifiDistanceFile paramWifiDistanceFile)
  {
    this.parentDir = paramWifiDistanceFile;
  }
  
  public void setParentStrDir(String paramString)
  {
    this.parentStrDir = paramString;
  }
  
  public void setPath(String paramString)
  {
    this.path = paramString;
  }
  
  public void setRealPath(String paramString)
  {
    this.realPath = paramString;
  }
  
  public void setRemoteThmUrl(String paramString)
  {
    this.remoteThmUrl = paramString;
  }
  
  public void setRemoteUrl(String paramString)
  {
    this.remoteUrl = paramString;
  }
  
  public void setSize(long paramLong)
  {
    this.size = paramLong;
  }
  
  public void setTag(Object paramObject)
  {
    this.tag = paramObject;
  }
  
  public void setType(int paramInt)
  {
    this.type = paramInt;
  }
  
  public void setWifDistanceDir(List<WifiDistanceFile> paramList)
  {
    this.mFiles = paramList;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/entity/WifiDistanceFile.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */