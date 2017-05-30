package org.a.a.f.a;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import org.apache.http.conn.scheme.SocketFactory;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpParams;

@Deprecated
class h
  implements SocketFactory
{
  private final f a;
  
  h(f paramf)
  {
    this.a = paramf;
  }
  
  public f a()
  {
    return this.a;
  }
  
  public Socket connectSocket(Socket paramSocket, String paramString, int paramInt1, InetAddress paramInetAddress, int paramInt2, HttpParams paramHttpParams)
  {
    InetSocketAddress localInetSocketAddress = null;
    if ((paramInetAddress != null) || (paramInt2 > 0)) {
      if (paramInt2 <= 0) {
        break label60;
      }
    }
    for (;;)
    {
      localInetSocketAddress = new InetSocketAddress(paramInetAddress, paramInt2);
      paramString = new InetSocketAddress(InetAddress.getByName(paramString), paramInt1);
      return this.a.a(paramSocket, paramString, localInetSocketAddress, paramHttpParams);
      label60:
      paramInt2 = 0;
    }
  }
  
  public Socket createSocket()
  {
    BasicHttpParams localBasicHttpParams = new BasicHttpParams();
    return this.a.a(localBasicHttpParams);
  }
  
  public boolean equals(Object paramObject)
  {
    if (paramObject == null) {
      return false;
    }
    if (this == paramObject) {
      return true;
    }
    if ((paramObject instanceof h)) {
      return this.a.equals(((h)paramObject).a);
    }
    return this.a.equals(paramObject);
  }
  
  public int hashCode()
  {
    return this.a.hashCode();
  }
  
  public boolean isSecure(Socket paramSocket)
  {
    return this.a.a(paramSocket);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/org/a/a/f/a/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */