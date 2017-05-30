package com.fimi.soul.utils;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;

public class r
{
  public static FileOutputStream a()
  {
    File localFile = new File(j.b());
    localFile.mkdirs();
    localFile = new File(localFile, "Parameters-" + q.a() + ".param");
    if (localFile.exists()) {
      localFile.delete();
    }
    return new FileOutputStream(localFile);
  }
  
  public static FileOutputStream a(String paramString)
  {
    File localFile = new File(j.c());
    localFile.mkdirs();
    paramString = new File(localFile, paramString + "-" + q.a() + ".txt");
    if (paramString.exists()) {
      paramString.delete();
    }
    return new FileOutputStream(paramString);
  }
  
  public static FileOutputStream b()
  {
    File localFile = new File(j.h());
    localFile.mkdirs();
    localFile = new File(localFile, q.a() + ".txt");
    if (localFile.exists()) {
      localFile.delete();
    }
    return new FileOutputStream(localFile);
  }
  
  public static BufferedOutputStream c()
  {
    File localFile = new File(j.e());
    localFile.mkdirs();
    localFile = new File(localFile, q.a() + ".tlog");
    if (localFile.exists()) {
      localFile.delete();
    }
    return new BufferedOutputStream(new FileOutputStream(localFile));
  }
  
  public static void d()
  {
    File localFile = new File(j.f());
    localFile.mkdirs();
    new File(localFile, ".nomedia").createNewFile();
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/utils/r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */