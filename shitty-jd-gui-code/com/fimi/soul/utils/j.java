package com.fimi.soul.utils;

import android.os.Environment;
import java.io.File;

public class j
{
  public static String a()
  {
    String str = Environment.getExternalStorageDirectory().getPath();
    return str + "/MiDroneEn/";
  }
  
  public static String a(String paramString)
  {
    return b(n(), paramString);
  }
  
  public static String a(String paramString1, String paramString2)
  {
    if (paramString2 != null) {}
    for (paramString2 = paramString2.replaceAll(" ", "");; paramString2 = "") {
      return n() + "THUMB_VIDEO_" + paramString2 + "_" + paramString1.substring(0, paramString1.lastIndexOf(".")) + ".jpg";
    }
  }
  
  public static String b()
  {
    return a() + "/Parameters/";
  }
  
  public static String b(String paramString)
  {
    return b(o(), paramString);
  }
  
  private static String b(String paramString1, String paramString2)
  {
    return String.format("%s%s", new Object[] { paramString1, paramString2 });
  }
  
  public static String c()
  {
    return a() + "/Waypoints/";
  }
  
  public static String d()
  {
    return a() + "/GCP/";
  }
  
  public static String e()
  {
    return a() + "/Logs/";
  }
  
  public static String f()
  {
    return a() + "/Maps/";
  }
  
  public static String g()
  {
    return a() + "/CameraInfo/";
  }
  
  public static String h()
  {
    return a() + "/LogCat/";
  }
  
  public static String i()
  {
    return a() + "/update/";
  }
  
  public static String j()
  {
    return a() + "/wifi/";
  }
  
  public static String k()
  {
    return a() + "/ErrorCode/";
  }
  
  public static String l()
  {
    return a() + "PlaneMedia/";
  }
  
  public static String m()
  {
    return a() + "LOGDOWN/";
  }
  
  public static String n()
  {
    return l() + "cache/";
  }
  
  public static String o()
  {
    String str = Environment.getExternalStorageDirectory().getPath();
    return str + "/DCIM/" + "MiDrone/";
  }
  
  public static String p()
  {
    return a() + "/firmware/";
  }
  
  public static String q()
  {
    return a() + "/CameraCmdLog/log.txt";
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/utils/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */