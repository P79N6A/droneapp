package org.a.a.i.f;

import java.util.Locale;
import org.a.a.c.c.b;
import org.apache.http.Header;
import org.apache.http.HeaderIterator;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.ProtocolVersion;
import org.apache.http.StatusLine;
import org.apache.http.params.HttpParams;

@org.a.a.a.c
class d
  implements b
{
  private final HttpResponse a;
  private final c b;
  
  public d(HttpResponse paramHttpResponse, c paramc)
  {
    this.a = paramHttpResponse;
    this.b = paramc;
    k.a(paramHttpResponse, paramc);
  }
  
  public void addHeader(String paramString1, String paramString2)
  {
    this.a.addHeader(paramString1, paramString2);
  }
  
  public void addHeader(Header paramHeader)
  {
    this.a.addHeader(paramHeader);
  }
  
  public void close()
  {
    if (this.b != null) {
      this.b.abortConnection();
    }
  }
  
  public boolean containsHeader(String paramString)
  {
    return this.a.containsHeader(paramString);
  }
  
  public Header[] getAllHeaders()
  {
    return this.a.getAllHeaders();
  }
  
  public HttpEntity getEntity()
  {
    return this.a.getEntity();
  }
  
  public Header getFirstHeader(String paramString)
  {
    return this.a.getFirstHeader(paramString);
  }
  
  public Header[] getHeaders(String paramString)
  {
    return this.a.getHeaders(paramString);
  }
  
  public Header getLastHeader(String paramString)
  {
    return this.a.getLastHeader(paramString);
  }
  
  public Locale getLocale()
  {
    return this.a.getLocale();
  }
  
  @Deprecated
  public HttpParams getParams()
  {
    return this.a.getParams();
  }
  
  public ProtocolVersion getProtocolVersion()
  {
    return this.a.getProtocolVersion();
  }
  
  public StatusLine getStatusLine()
  {
    return this.a.getStatusLine();
  }
  
  public HeaderIterator headerIterator()
  {
    return this.a.headerIterator();
  }
  
  public HeaderIterator headerIterator(String paramString)
  {
    return this.a.headerIterator(paramString);
  }
  
  public void removeHeader(Header paramHeader)
  {
    this.a.removeHeader(paramHeader);
  }
  
  public void removeHeaders(String paramString)
  {
    this.a.removeHeaders(paramString);
  }
  
  public void setEntity(HttpEntity paramHttpEntity)
  {
    this.a.setEntity(paramHttpEntity);
  }
  
  public void setHeader(String paramString1, String paramString2)
  {
    this.a.setHeader(paramString1, paramString2);
  }
  
  public void setHeader(Header paramHeader)
  {
    this.a.setHeader(paramHeader);
  }
  
  public void setHeaders(Header[] paramArrayOfHeader)
  {
    this.a.setHeaders(paramArrayOfHeader);
  }
  
  public void setLocale(Locale paramLocale)
  {
    this.a.setLocale(paramLocale);
  }
  
  @Deprecated
  public void setParams(HttpParams paramHttpParams)
  {
    this.a.setParams(paramHttpParams);
  }
  
  public void setReasonPhrase(String paramString)
  {
    this.a.setReasonPhrase(paramString);
  }
  
  public void setStatusCode(int paramInt)
  {
    this.a.setStatusCode(paramInt);
  }
  
  public void setStatusLine(ProtocolVersion paramProtocolVersion, int paramInt)
  {
    this.a.setStatusLine(paramProtocolVersion, paramInt);
  }
  
  public void setStatusLine(ProtocolVersion paramProtocolVersion, int paramInt, String paramString)
  {
    this.a.setStatusLine(paramProtocolVersion, paramInt, paramString);
  }
  
  public void setStatusLine(StatusLine paramStatusLine)
  {
    this.a.setStatusLine(paramStatusLine);
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("HttpResponseProxy{");
    localStringBuilder.append(this.a);
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/org/a/a/i/f/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */