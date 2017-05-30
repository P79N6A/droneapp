package org.a.a.h;

import org.a.a.a.c;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.message.BasicHeader;

@c
public abstract class a
  implements HttpEntity
{
  protected static final int a = 4096;
  protected Header b;
  protected Header c;
  protected boolean d;
  
  public void a(String paramString)
  {
    BasicHeader localBasicHeader = null;
    if (paramString != null) {
      localBasicHeader = new BasicHeader("Content-Type", paramString);
    }
    a(localBasicHeader);
  }
  
  public void a(Header paramHeader)
  {
    this.b = paramHeader;
  }
  
  public void a(boolean paramBoolean)
  {
    this.d = paramBoolean;
  }
  
  public void b(String paramString)
  {
    BasicHeader localBasicHeader = null;
    if (paramString != null) {
      localBasicHeader = new BasicHeader("Content-Encoding", paramString);
    }
    b(localBasicHeader);
  }
  
  public void b(Header paramHeader)
  {
    this.c = paramHeader;
  }
  
  @Deprecated
  public void consumeContent() {}
  
  public Header getContentEncoding()
  {
    return this.c;
  }
  
  public Header getContentType()
  {
    return this.b;
  }
  
  public boolean isChunked()
  {
    return this.d;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/org/a/a/h/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */