package org.a.a.f;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import org.a.a.o.a;
import org.apache.http.HttpHost;

@Deprecated
public class f
  extends InetSocketAddress
{
  private static final long serialVersionUID = -6650701828361907957L;
  private final HttpHost a;
  
  public f(HttpHost paramHttpHost, InetAddress paramInetAddress, int paramInt)
  {
    super(paramInetAddress, paramInt);
    a.a(paramHttpHost, "HTTP host");
    this.a = paramHttpHost;
  }
  
  public HttpHost a()
  {
    return this.a;
  }
  
  public String toString()
  {
    return this.a.getHostName() + ":" + getPort();
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/org/a/a/f/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */