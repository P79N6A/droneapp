package org.a.a.i.h;

import java.util.concurrent.atomic.AtomicLong;
import org.a.a.a.d;
import org.a.a.e.f;
import org.apache.http.HttpClientConnection;
import org.apache.http.HttpHost;
import org.apache.http.params.HttpParams;

@d
public class b
  extends org.a.a.m.a<HttpHost, HttpClientConnection, c>
{
  private static final AtomicLong a = new AtomicLong();
  
  public b()
  {
    super(new a(f.a, org.a.a.e.a.a), 2, 20);
  }
  
  public b(f paramf, org.a.a.e.a parama)
  {
    super(new a(paramf, parama), 2, 20);
  }
  
  public b(org.a.a.m.b<HttpHost, HttpClientConnection> paramb)
  {
    super(paramb, 2, 20);
  }
  
  @Deprecated
  public b(HttpParams paramHttpParams)
  {
    super(new a(paramHttpParams), 2, 20);
  }
  
  protected c a(HttpHost paramHttpHost, HttpClientConnection paramHttpClientConnection)
  {
    return new c(Long.toString(a.getAndIncrement()), paramHttpHost, paramHttpClientConnection);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/org/a/a/i/h/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */