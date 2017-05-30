package com.fimi.kernel.utils;

import java.io.File;
import java.io.IOException;

public class u
{
  public static String a(File paramFile)
  {
    try
    {
      paramFile = m.a(paramFile);
      return paramFile;
    }
    catch (IOException paramFile)
    {
      paramFile.printStackTrace();
    }
    return null;
  }
  
  public static String a(String paramString)
  {
    return a(new File(paramString));
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/kernel/utils/u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */