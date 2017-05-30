package com.fimi.soul.entity;

public class User
  extends BaseModel
{
  public static final String FN_NAME = "name";
  private String appType;
  private String country;
  private String curLatitude;
  private String curLongitude;
  private String device;
  private String loginChannel;
  private String name;
  private String nickName;
  private String objectName;
  private String phone;
  private String sex;
  private String signature;
  private String userID;
  private String userIDs;
  private String userImgUrl;
  private String xiaomiID;
  
  public User() {}
  
  public User(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8, String paramString9, String paramString10, String paramString11, String paramString12, String paramString13)
  {
    this.nickName = paramString1;
    this.sex = paramString2;
    this.country = paramString3;
    this.signature = paramString4;
    this.xiaomiID = paramString5;
    this.curLongitude = paramString6;
    this.curLatitude = paramString7;
    this.device = paramString8;
    this.name = paramString9;
    this.userIDs = paramString10;
    this.phone = paramString11;
    this.loginChannel = paramString12;
    this.appType = paramString13;
  }
  
  public String getCountry()
  {
    return this.country;
  }
  
  public String getCurLatitude()
  {
    return this.curLatitude;
  }
  
  public String getCurLongitude()
  {
    return this.curLongitude;
  }
  
  public String getDevice()
  {
    return this.device;
  }
  
  public String getName()
  {
    return this.name;
  }
  
  public String getNickName()
  {
    return this.nickName;
  }
  
  public String getObjectName()
  {
    return this.objectName;
  }
  
  public String getPhone()
  {
    return this.phone;
  }
  
  public String getSex()
  {
    return this.sex;
  }
  
  public String getSignature()
  {
    return this.signature;
  }
  
  public String getUserID()
  {
    return this.userID;
  }
  
  public String getUserIDs()
  {
    return this.userIDs;
  }
  
  public String getUserImgUrl()
  {
    return this.userImgUrl;
  }
  
  public String getXiaomiID()
  {
    return this.xiaomiID;
  }
  
  public String getappType()
  {
    return this.appType;
  }
  
  public String getloginChannel()
  {
    return this.loginChannel;
  }
  
  public void setCountry(String paramString)
  {
    this.country = paramString;
  }
  
  public void setCurLatitude(String paramString)
  {
    this.curLatitude = paramString;
  }
  
  public void setCurLongitude(String paramString)
  {
    this.curLongitude = paramString;
  }
  
  public void setDevice(String paramString)
  {
    this.device = paramString;
  }
  
  public void setName(String paramString)
  {
    this.name = paramString;
  }
  
  public void setNickName(String paramString)
  {
    this.nickName = paramString;
  }
  
  public void setObjectName(String paramString)
  {
    this.objectName = paramString;
  }
  
  public void setPhone(String paramString)
  {
    this.phone = paramString;
  }
  
  public void setSex(String paramString)
  {
    this.sex = paramString;
  }
  
  public void setSignature(String paramString)
  {
    this.signature = paramString;
  }
  
  public void setUserID(String paramString)
  {
    this.userID = paramString;
  }
  
  public void setUserIDs(String paramString)
  {
    this.userIDs = paramString;
  }
  
  public void setUserImgUrl(String paramString)
  {
    this.userImgUrl = paramString;
  }
  
  public void setXiaomiID(String paramString)
  {
    this.xiaomiID = paramString;
  }
  
  public void setappType(String paramString)
  {
    this.appType = paramString;
  }
  
  public void setloginChannel(String paramString)
  {
    this.loginChannel = paramString;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/entity/User.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */