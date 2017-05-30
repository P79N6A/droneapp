package com.fimi.soul.drone.e;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class c
{
  public static String a()
  {
    return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
  }
  
  public static Date a(String paramString)
  {
    SimpleDateFormat localSimpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    try
    {
      paramString = localSimpleDateFormat.parse(paramString);
      return paramString;
    }
    catch (ParseException paramString)
    {
      paramString.printStackTrace();
    }
    return null;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/drone/e/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */