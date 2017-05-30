package com.baidu.tts.f;

import java.net.InetAddress;

public enum o
{
  private final String d;
  
  private o(String paramString)
  {
    this.d = paramString;
  }
  
  public static String a(String paramString)
  {
    try
    {
      paramString = InetAddress.getByName(paramString).getHostAddress();
      return paramString;
    }
    catch (Exception paramString)
    {
      paramString.printStackTrace();
    }
    return null;
  }
  
  public String a()
  {
    return this.d;
  }
  
  public abstract String b();
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/baidu/tts/f/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */