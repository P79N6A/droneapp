package it.a.a;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

class u
  extends Reader
{
  private static final String a = System.getProperty("line.separator");
  private InputStream b;
  private Reader c;
  
  public u(InputStream paramInputStream, String paramString)
  {
    this.b = paramInputStream;
    this.c = new InputStreamReader(paramInputStream, paramString);
  }
  
  public String a()
  {
    StringBuffer localStringBuffer = new StringBuffer();
    int i = -1;
    int j = this.c.read();
    if (j == -1)
    {
      if (localStringBuffer.length() == 0) {
        return null;
      }
      return localStringBuffer.toString();
    }
    if (j == 10) {
      return localStringBuffer.toString();
    }
    if ((i == 13) && (j == 0)) {
      localStringBuffer.append(a);
    }
    for (;;)
    {
      i = j;
      break;
      if ((j != 0) && (j != 13)) {
        localStringBuffer.append((char)j);
      }
    }
  }
  
  public void a(String paramString)
  {
    try
    {
      this.c = new InputStreamReader(this.b, paramString);
      return;
    }
    finally {}
  }
  
  public void close()
  {
    try
    {
      this.c.close();
      return;
    }
    finally {}
  }
  
  public int read(char[] paramArrayOfChar, int paramInt1, int paramInt2)
  {
    try
    {
      paramInt1 = this.c.read(paramArrayOfChar, paramInt1, paramInt2);
      return paramInt1;
    }
    finally {}
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/it/a/a/u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */