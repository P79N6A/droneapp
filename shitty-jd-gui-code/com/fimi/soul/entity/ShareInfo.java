package com.fimi.soul.entity;

import android.graphics.Bitmap;
import java.io.Serializable;

public class ShareInfo
  implements Serializable
{
  private static final long serialVersionUID = 1L;
  private String appName;
  private String description;
  private Bitmap thumbData;
  private String title;
  private String url;
  private String webpageUrl;
  
  public String getAppName()
  {
    return this.appName;
  }
  
  public String getDescription()
  {
    return this.description;
  }
  
  public Bitmap getThumbData()
  {
    return this.thumbData;
  }
  
  public String getTitle()
  {
    return this.title;
  }
  
  public String getUrl()
  {
    return this.url;
  }
  
  public String getWebpageUrl()
  {
    return this.webpageUrl;
  }
  
  public void setAppName(String paramString)
  {
    this.appName = paramString;
  }
  
  public void setDescription(String paramString)
  {
    this.description = paramString;
  }
  
  public void setThumbData(Bitmap paramBitmap)
  {
    this.thumbData = paramBitmap;
  }
  
  public void setTitle(String paramString)
  {
    this.title = paramString;
  }
  
  public void setUrl(String paramString)
  {
    this.url = paramString;
  }
  
  public void setWebpageUrl(String paramString)
  {
    this.webpageUrl = paramString;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/entity/ShareInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */