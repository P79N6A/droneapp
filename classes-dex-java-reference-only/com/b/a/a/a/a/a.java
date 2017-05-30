package com.b.a.a.a.a;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import com.b.a.c.c;
import com.b.a.c.c.a;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;

public abstract class a
  implements com.b.a.a.a.a
{
  public static final int a = 32768;
  public static final Bitmap.CompressFormat b = Bitmap.CompressFormat.PNG;
  public static final int c = 100;
  private static final String j = " argument must be not null";
  private static final String k = ".tmp";
  protected final File d;
  protected final File e;
  protected final com.b.a.a.a.b.a f;
  protected int g = 32768;
  protected Bitmap.CompressFormat h = b;
  protected int i = 100;
  
  public a(File paramFile)
  {
    this(paramFile, null);
  }
  
  public a(File paramFile1, File paramFile2)
  {
    this(paramFile1, paramFile2, com.b.a.b.a.b());
  }
  
  public a(File paramFile1, File paramFile2, com.b.a.a.a.b.a parama)
  {
    if (paramFile1 == null) {
      throw new IllegalArgumentException("cacheDir argument must be not null");
    }
    if (parama == null) {
      throw new IllegalArgumentException("fileNameGenerator argument must be not null");
    }
    this.d = paramFile1;
    this.e = paramFile2;
    this.f = parama;
  }
  
  public File a()
  {
    return this.d;
  }
  
  public File a(String paramString)
  {
    return c(paramString);
  }
  
  public void a(int paramInt)
  {
    this.g = paramInt;
  }
  
  public void a(Bitmap.CompressFormat paramCompressFormat)
  {
    this.h = paramCompressFormat;
  }
  
  public boolean a(String paramString, Bitmap paramBitmap)
  {
    File localFile = c(paramString);
    paramString = new File(localFile.getAbsolutePath() + ".tmp");
    BufferedOutputStream localBufferedOutputStream = new BufferedOutputStream(new FileOutputStream(paramString), this.g);
    try
    {
      boolean bool1 = paramBitmap.compress(this.h, this.i, localBufferedOutputStream);
      c.a(localBufferedOutputStream);
      boolean bool2 = bool1;
      if (bool1)
      {
        bool2 = bool1;
        if (!paramString.renameTo(localFile)) {
          bool2 = false;
        }
      }
      if (!bool2) {
        paramString.delete();
      }
      paramBitmap.recycle();
      return bool2;
    }
    finally
    {
      c.a(localBufferedOutputStream);
      paramString.delete();
    }
  }
  
  public boolean a(String paramString, InputStream paramInputStream, c.a parama)
  {
    File localFile1 = c(paramString);
    File localFile2 = new File(localFile1.getAbsolutePath() + ".tmp");
    boolean bool1;
    boolean bool2;
    try
    {
      paramString = new BufferedOutputStream(new FileOutputStream(localFile2), this.g);
      try
      {
        bool1 = c.a(paramInputStream, paramString, parama, this.g);
        paramString = finally;
      }
      finally
      {
        try
        {
          c.a(paramString);
          bool2 = bool1;
          if (bool1)
          {
            bool2 = bool1;
            if (!localFile2.renameTo(localFile1)) {
              bool2 = false;
            }
          }
          if (!bool2) {
            localFile2.delete();
          }
          return bool2;
        }
        finally {}
        paramInputStream = finally;
        c.a(paramString);
      }
      bool2 = bool1;
    }
    finally
    {
      bool1 = false;
    }
    if (bool1)
    {
      bool2 = bool1;
      if (!localFile2.renameTo(localFile1)) {
        bool2 = false;
      }
    }
    if (!bool2) {
      localFile2.delete();
    }
    throw paramString;
  }
  
  public void b() {}
  
  public void b(int paramInt)
  {
    this.i = paramInt;
  }
  
  public boolean b(String paramString)
  {
    return c(paramString).delete();
  }
  
  protected File c(String paramString)
  {
    String str = this.f.a(paramString);
    File localFile = this.d;
    paramString = localFile;
    if (!this.d.exists())
    {
      paramString = localFile;
      if (!this.d.mkdirs())
      {
        paramString = localFile;
        if (this.e != null) {
          if (!this.e.exists())
          {
            paramString = localFile;
            if (!this.e.mkdirs()) {}
          }
          else
          {
            paramString = this.e;
          }
        }
      }
    }
    return new File(paramString, str);
  }
  
  public void c()
  {
    File[] arrayOfFile = this.d.listFiles();
    if (arrayOfFile != null)
    {
      int n = arrayOfFile.length;
      int m = 0;
      while (m < n)
      {
        arrayOfFile[m].delete();
        m += 1;
      }
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/b/a/a/a/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */