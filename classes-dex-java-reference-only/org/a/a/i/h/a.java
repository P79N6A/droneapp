package org.a.a.i.h;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;
import org.a.a.e.f;
import org.a.a.i.c;
import org.apache.http.HttpClientConnection;
import org.apache.http.HttpHost;
import org.apache.http.params.HttpParams;

@org.a.a.a.b
public class a
  implements org.a.a.m.b<HttpHost, HttpClientConnection>
{
  private final SocketFactory a;
  private final SSLSocketFactory b;
  private final int c;
  private final f d;
  private final org.a.a.d<? extends HttpClientConnection> e;
  
  public a()
  {
    this(null, null, 0, f.a, org.a.a.e.a.a);
  }
  
  public a(int paramInt, f paramf, org.a.a.e.a parama)
  {
    this(null, null, paramInt, paramf, parama);
  }
  
  public a(SocketFactory paramSocketFactory, SSLSocketFactory paramSSLSocketFactory, int paramInt, f paramf, org.a.a.e.a parama)
  {
    this.a = paramSocketFactory;
    this.b = paramSSLSocketFactory;
    this.c = paramInt;
    if (paramf != null)
    {
      this.d = paramf;
      if (parama == null) {
        break label57;
      }
    }
    for (;;)
    {
      this.e = new org.a.a.i.d(parama);
      return;
      paramf = f.a;
      break;
      label57:
      parama = org.a.a.e.a.a;
    }
  }
  
  @Deprecated
  public a(SSLSocketFactory paramSSLSocketFactory, HttpParams paramHttpParams)
  {
    org.a.a.o.a.a(paramHttpParams, "HTTP params");
    this.a = null;
    this.b = paramSSLSocketFactory;
    this.c = paramHttpParams.getIntParameter("http.connection.timeout", 0);
    this.d = org.a.a.l.a.a(paramHttpParams);
    this.e = new org.a.a.i.d(org.a.a.l.a.c(paramHttpParams));
  }
  
  public a(f paramf, org.a.a.e.a parama)
  {
    this(null, null, 0, paramf, parama);
  }
  
  @Deprecated
  public a(HttpParams paramHttpParams)
  {
    this(null, paramHttpParams);
  }
  
  @Deprecated
  protected HttpClientConnection a(Socket paramSocket, HttpParams paramHttpParams)
  {
    paramHttpParams = new c(paramHttpParams.getIntParameter("http.socket.buffer-size", 8192));
    paramHttpParams.a(paramSocket);
    return paramHttpParams;
  }
  
  public HttpClientConnection a(HttpHost paramHttpHost)
  {
    String str = paramHttpHost.getSchemeName();
    Object localObject = null;
    if ("http".equalsIgnoreCase(str))
    {
      if (this.a != null) {
        localObject = this.a.createSocket();
      }
    }
    else
    {
      if (!"https".equalsIgnoreCase(str)) {
        break label275;
      }
      if (this.b == null) {
        break label110;
      }
      localObject = this.b;
      label58:
      localObject = ((SocketFactory)localObject).createSocket();
    }
    label110:
    label269:
    label275:
    for (;;)
    {
      if (localObject == null)
      {
        throw new IOException(str + " scheme is not supported");
        localObject = new Socket();
        break;
        localObject = SSLSocketFactory.getDefault();
        break label58;
      }
      str = paramHttpHost.getHostName();
      int j = paramHttpHost.getPort();
      int i = j;
      if (j == -1)
      {
        if (paramHttpHost.getSchemeName().equalsIgnoreCase("http")) {
          i = 80;
        }
      }
      else
      {
        ((Socket)localObject).setSoTimeout(this.d.a());
        ((Socket)localObject).connect(new InetSocketAddress(str, i), this.c);
        ((Socket)localObject).setTcpNoDelay(this.d.e());
        i = this.d.c();
        if (i >= 0) {
          if (i <= 0) {
            break label269;
          }
        }
      }
      for (boolean bool = true;; bool = false)
      {
        ((Socket)localObject).setSoLinger(bool, i);
        ((Socket)localObject).setKeepAlive(this.d.d());
        return (HttpClientConnection)this.e.a((Socket)localObject);
        i = j;
        if (!paramHttpHost.getSchemeName().equalsIgnoreCase("https")) {
          break;
        }
        i = 443;
        break;
      }
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/org/a/a/i/h/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */