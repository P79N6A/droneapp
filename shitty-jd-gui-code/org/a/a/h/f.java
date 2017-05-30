package org.a.a.h;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import org.a.a.a.c;

@c
public class f
  extends a
  implements Cloneable
{
  protected final File e;
  
  public f(File paramFile)
  {
    this.e = ((File)org.a.a.o.a.a(paramFile, "File"));
  }
  
  @Deprecated
  public f(File paramFile, String paramString)
  {
    this.e = ((File)org.a.a.o.a.a(paramFile, "File"));
    a(paramString);
  }
  
  public f(File paramFile, e parame)
  {
    this.e = ((File)org.a.a.o.a.a(paramFile, "File"));
    if (parame != null) {
      a(parame.toString());
    }
  }
  
  public Object clone()
  {
    return super.clone();
  }
  
  public InputStream getContent()
  {
    return new FileInputStream(this.e);
  }
  
  public long getContentLength()
  {
    return this.e.length();
  }
  
  public boolean isRepeatable()
  {
    return true;
  }
  
  public boolean isStreaming()
  {
    return false;
  }
  
  public void writeTo(OutputStream paramOutputStream)
  {
    org.a.a.o.a.a(paramOutputStream, "Output stream");
    FileInputStream localFileInputStream = new FileInputStream(this.e);
    try
    {
      byte[] arrayOfByte = new byte['က'];
      for (;;)
      {
        int i = localFileInputStream.read(arrayOfByte);
        if (i == -1) {
          break;
        }
        paramOutputStream.write(arrayOfByte, 0, i);
      }
    }
    finally
    {
      localFileInputStream.close();
    }
    localFileInputStream.close();
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/org/a/a/h/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */