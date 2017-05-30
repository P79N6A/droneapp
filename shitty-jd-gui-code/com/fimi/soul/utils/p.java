package com.fimi.soul.utils;

import java.io.File;
import java.io.FilenameFilter;

public class p
{
  public static String[] a()
  {
    FilenameFilter local1 = new FilenameFilter()
    {
      public boolean accept(File paramAnonymousFile, String paramAnonymousString)
      {
        return paramAnonymousString.contains(".txt");
      }
    };
    return a(j.c(), local1);
  }
  
  public static String[] a(String paramString, FilenameFilter paramFilenameFilter)
  {
    paramString = new File(paramString);
    try
    {
      paramString.mkdirs();
      if (paramString.exists())
      {
        paramString = paramString.list(paramFilenameFilter);
        return paramString;
      }
    }
    catch (SecurityException paramString) {}
    return new String[0];
  }
  
  public static String[] b()
  {
    FilenameFilter local2 = new FilenameFilter()
    {
      public boolean accept(File paramAnonymousFile, String paramAnonymousString)
      {
        return paramAnonymousString.contains(".param");
      }
    };
    return a(j.b(), local2);
  }
  
  public static String[] c()
  {
    FilenameFilter local3 = new FilenameFilter()
    {
      public boolean accept(File paramAnonymousFile, String paramAnonymousString)
      {
        return (paramAnonymousString.contains(".kml")) || (paramAnonymousString.contains(".kmz"));
      }
    };
    return a(j.d(), local3);
  }
  
  public static String[] d()
  {
    FilenameFilter local4 = new FilenameFilter()
    {
      public boolean accept(File paramAnonymousFile, String paramAnonymousString)
      {
        return paramAnonymousString.contains(".xml");
      }
    };
    return a(j.g(), local4);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/utils/p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */