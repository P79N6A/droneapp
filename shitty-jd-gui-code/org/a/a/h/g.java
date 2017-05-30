package org.a.a.h;

import java.io.InputStream;
import java.io.OutputStream;
import org.a.a.a.c;
import org.a.a.o.a;
import org.apache.http.Header;
import org.apache.http.HttpEntity;

@c
public class g
  implements HttpEntity
{
  protected HttpEntity a;
  
  public g(HttpEntity paramHttpEntity)
  {
    this.a = ((HttpEntity)a.a(paramHttpEntity, "Wrapped entity"));
  }
  
  @Deprecated
  public void consumeContent()
  {
    this.a.consumeContent();
  }
  
  public InputStream getContent()
  {
    return this.a.getContent();
  }
  
  public Header getContentEncoding()
  {
    return this.a.getContentEncoding();
  }
  
  public long getContentLength()
  {
    return this.a.getContentLength();
  }
  
  public Header getContentType()
  {
    return this.a.getContentType();
  }
  
  public boolean isChunked()
  {
    return this.a.isChunked();
  }
  
  public boolean isRepeatable()
  {
    return this.a.isRepeatable();
  }
  
  public boolean isStreaming()
  {
    return this.a.isStreaming();
  }
  
  public void writeTo(OutputStream paramOutputStream)
  {
    this.a.writeTo(paramOutputStream);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/org/a/a/h/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */