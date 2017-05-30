package org.a.a.f.a;

import java.net.InetSocketAddress;
import java.net.Socket;
import org.apache.http.conn.scheme.SocketFactory;
import org.apache.http.params.HttpParams;

@Deprecated
class g
  implements f
{
  private final SocketFactory a;
  
  g(SocketFactory paramSocketFactory)
  {
    this.a = paramSocketFactory;
  }
  
  public Socket a(Socket paramSocket, InetSocketAddress paramInetSocketAddress1, InetSocketAddress paramInetSocketAddress2, HttpParams paramHttpParams)
  {
    String str = paramInetSocketAddress1.getHostName();
    int j = paramInetSocketAddress1.getPort();
    paramInetSocketAddress1 = null;
    int i = 0;
    if (paramInetSocketAddress2 != null)
    {
      paramInetSocketAddress1 = paramInetSocketAddress2.getAddress();
      i = paramInetSocketAddress2.getPort();
    }
    return this.a.connectSocket(paramSocket, str, j, paramInetSocketAddress1, i, paramHttpParams);
  }
  
  public Socket a(HttpParams paramHttpParams)
  {
    return this.a.createSocket();
  }
  
  public SocketFactory a()
  {
    return this.a;
  }
  
  public boolean a(Socket paramSocket)
  {
    return this.a.isSecure(paramSocket);
  }
  
  public boolean equals(Object paramObject)
  {
    if (paramObject == null) {
      return false;
    }
    if (this == paramObject) {
      return true;
    }
    if ((paramObject instanceof g)) {
      return this.a.equals(((g)paramObject).a);
    }
    return this.a.equals(paramObject);
  }
  
  public int hashCode()
  {
    return this.a.hashCode();
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/org/a/a/f/a/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */