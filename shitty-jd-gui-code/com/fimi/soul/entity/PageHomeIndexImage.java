package com.fimi.soul.entity;

import java.io.Serializable;

public class PageHomeIndexImage
  implements Serializable
{
  private static final long serialVersionUID = 1L;
  private String image;
  private String indeximg_switch;
  private String url;
  
  public String getImage()
  {
    return this.image;
  }
  
  public String getIndeximg_switch()
  {
    return this.indeximg_switch;
  }
  
  public String getUrl()
  {
    return this.url;
  }
  
  public void setImage(String paramString)
  {
    this.image = paramString;
  }
  
  public void setIndeximg_switch(String paramString)
  {
    this.indeximg_switch = paramString;
  }
  
  public void setUrl(String paramString)
  {
    this.url = paramString;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/entity/PageHomeIndexImage.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */