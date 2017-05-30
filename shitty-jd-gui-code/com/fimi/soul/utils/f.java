package com.fimi.soul.utils;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class f
{
  private static f d = new f();
  private BufferedWriter a;
  private File b;
  private StringBuffer c = new StringBuffer();
  
  public static f a()
  {
    if (d == null) {
      d = new f();
    }
    return d;
  }
  
  public void a(String paramString)
  {
    String str = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss-SSSS", Locale.US).format(new Date());
    this.c.append(str).append("   ");
    this.c.append(paramString);
    this.c.append("\n");
    try
    {
      this.a.write(this.c.toString());
      this.a.flush();
      this.c = this.c.delete(0, this.c.length());
      return;
    }
    catch (IOException paramString)
    {
      paramString.printStackTrace();
    }
  }
  
  public void b()
  {
    this.b = new File(j.q());
    if (!this.b.exists()) {
      this.b.getParentFile().mkdirs();
    }
    try
    {
      this.b.createNewFile();
      if (this.a != null) {}
    }
    catch (IOException localIOException1)
    {
      for (;;)
      {
        try
        {
          this.a = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.b, true)));
          this.a.flush();
          this.c = this.c.delete(0, this.c.length());
          return;
        }
        catch (FileNotFoundException localFileNotFoundException)
        {
          localFileNotFoundException.printStackTrace();
          return;
        }
        catch (IOException localIOException2)
        {
          localIOException2.printStackTrace();
        }
        localIOException1 = localIOException1;
        localIOException1.printStackTrace();
      }
    }
  }
  
  public boolean c()
  {
    if ((this.b != null) && (!this.b.exists())) {}
    try
    {
      this.a.close();
      this.a = null;
      if ((this.a != null) && (this.b != null) && (this.b.exists())) {
        return true;
      }
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        localIOException.printStackTrace();
      }
    }
    return false;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/utils/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */