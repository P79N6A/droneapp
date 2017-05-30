package org.a.a.i.f;

import java.io.InputStream;
import java.io.OutputStream;
import org.a.a.a.c;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpRequest;

@c
class j
  implements HttpEntity
{
  private final HttpEntity a;
  private boolean b = false;
  
  j(HttpEntity paramHttpEntity)
  {
    this.a = paramHttpEntity;
  }
  
  static void a(HttpEntityEnclosingRequest paramHttpEntityEnclosingRequest)
  {
    HttpEntity localHttpEntity = paramHttpEntityEnclosingRequest.getEntity();
    if ((localHttpEntity != null) && (!localHttpEntity.isRepeatable()) && (!a(localHttpEntity))) {
      paramHttpEntityEnclosingRequest.setEntity(new j(localHttpEntity));
    }
  }
  
  static boolean a(HttpEntity paramHttpEntity)
  {
    return paramHttpEntity instanceof j;
  }
  
  static boolean a(HttpRequest paramHttpRequest)
  {
    if ((paramHttpRequest instanceof HttpEntityEnclosingRequest))
    {
      paramHttpRequest = ((HttpEntityEnclosingRequest)paramHttpRequest).getEntity();
      if (paramHttpRequest != null)
      {
        if ((a(paramHttpRequest)) && (!((j)paramHttpRequest).b())) {
          return true;
        }
        return paramHttpRequest.isRepeatable();
      }
    }
    return true;
  }
  
  public HttpEntity a()
  {
    return this.a;
  }
  
  public boolean b()
  {
    return this.b;
  }
  
  @Deprecated
  public void consumeContent()
  {
    this.b = true;
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
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("RequestEntityProxy{");
    localStringBuilder.append(this.a);
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
  
  public void writeTo(OutputStream paramOutputStream)
  {
    this.b = true;
    this.a.writeTo(paramOutputStream);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/org/a/a/i/f/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */