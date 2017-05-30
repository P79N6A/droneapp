package it.a.a;

import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.StringTokenizer;

class v
  extends Writer
{
  private static final String a = "\r\n";
  private OutputStream b;
  private Writer c;
  
  public v(OutputStream paramOutputStream, String paramString)
  {
    this.b = paramOutputStream;
    this.c = new OutputStreamWriter(paramOutputStream, paramString);
  }
  
  public void a(String paramString)
  {
    try
    {
      this.c = new OutputStreamWriter(this.b, paramString);
      return;
    }
    finally {}
  }
  
  public void b(String paramString)
  {
    StringBuffer localStringBuffer = new StringBuffer();
    paramString = new StringTokenizer(paramString, "\r\n");
    int m = paramString.countTokens();
    int i = 0;
    int k;
    for (int j = 0; i < m; j = k)
    {
      String str = paramString.nextToken();
      k = j;
      if (str.length() > 0)
      {
        if (j != 0)
        {
          localStringBuffer.append('\r');
          localStringBuffer.append('\000');
        }
        localStringBuffer.append(str);
        k = 1;
      }
      i += 1;
    }
    if (localStringBuffer.length() > 0)
    {
      paramString = localStringBuffer.toString();
      this.c.write(paramString);
      this.c.write("\r\n");
      this.c.flush();
    }
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
  
  public void flush()
  {
    try
    {
      this.c.flush();
      return;
    }
    finally {}
  }
  
  public void write(char[] paramArrayOfChar, int paramInt1, int paramInt2)
  {
    try
    {
      this.c.write(paramArrayOfChar, paramInt1, paramInt2);
      return;
    }
    finally {}
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/it/a/a/v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */