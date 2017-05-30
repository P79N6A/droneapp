package com.fimi.soul.entity;

import java.io.Serializable;

public class WeatherInfo
  implements Serializable
{
  private static final long serialVersionUID = 1L;
  private String WD;
  private String WS;
  private String city;
  private String index_tr;
  private String temp;
  private String time;
  private String weather;
  
  public String getCity()
  {
    return this.city;
  }
  
  public String getIndex_tr()
  {
    return this.index_tr;
  }
  
  public String getTemp()
  {
    return this.temp;
  }
  
  public String getTime()
  {
    return this.time;
  }
  
  public String getWD()
  {
    return this.WD;
  }
  
  public String getWS()
  {
    return this.WS;
  }
  
  public String getWeather()
  {
    return this.weather;
  }
  
  public void setCity(String paramString)
  {
    this.city = paramString;
  }
  
  public void setIndex_tr(String paramString)
  {
    this.index_tr = paramString;
  }
  
  public void setTemp(String paramString)
  {
    this.temp = paramString;
  }
  
  public void setTime(String paramString)
  {
    this.time = paramString;
  }
  
  public void setWD(String paramString)
  {
    this.WD = paramString;
  }
  
  public void setWS(String paramString)
  {
    this.WS = paramString;
  }
  
  public void setWeather(String paramString)
  {
    this.weather = paramString;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/entity/WeatherInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */