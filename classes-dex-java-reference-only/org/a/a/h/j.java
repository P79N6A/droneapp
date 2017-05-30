package org.a.a.h;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;
import org.a.a.a.c;

@c
public class j
  extends a
  implements Cloneable
{
  protected final byte[] e;
  
  public j(String paramString)
  {
    this(paramString, e.m);
  }
  
  public j(String paramString1, String paramString2)
  {
    this(paramString1, e.a(e.j.a(), paramString2));
  }
  
  @Deprecated
  public j(String paramString1, String paramString2, String paramString3)
  {
    org.a.a.o.a.a(paramString1, "Source string");
    if (paramString2 != null) {
      if (paramString3 == null) {
        break label62;
      }
    }
    for (;;)
    {
      this.e = paramString1.getBytes(paramString3);
      a(paramString2 + "; charset=" + paramString3);
      return;
      paramString2 = "text/plain";
      break;
      label62:
      paramString3 = "ISO-8859-1";
    }
  }
  
  public j(String paramString, Charset paramCharset)
  {
    this(paramString, e.a(e.j.a(), paramCharset));
  }
  
  public j(String paramString, e parame)
  {
    org.a.a.o.a.a(paramString, "Source string");
    if (parame != null) {}
    for (Charset localCharset1 = parame.b();; localCharset1 = null)
    {
      Charset localCharset2 = localCharset1;
      if (localCharset1 == null) {
        localCharset2 = Charset.forName("ISO-8859-1");
      }
      try
      {
        this.e = paramString.getBytes(localCharset2.name());
        if (parame != null) {
          a(parame.toString());
        }
        return;
      }
      catch (UnsupportedEncodingException paramString)
      {
        throw new UnsupportedCharsetException(localCharset2.name());
      }
    }
  }
  
  public Object clone()
  {
    return super.clone();
  }
  
  public InputStream getContent()
  {
    return new ByteArrayInputStream(this.e);
  }
  
  public long getContentLength()
  {
    return this.e.length;
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
    paramOutputStream.write(this.e);
    paramOutputStream.flush();
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/org/a/a/h/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */