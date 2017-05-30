package org.a.a.f.a;

import java.net.InetSocketAddress;
import java.net.Socket;
import org.apache.http.params.HttpParams;

@Deprecated
class e
  implements c
{
  private final a a;
  
  e(a parama)
  {
    this.a = parama;
  }
  
  public Socket a(Socket paramSocket, String paramString, int paramInt, HttpParams paramHttpParams)
  {
    return this.a.a(paramSocket, paramString, paramInt, true);
  }
  
  public Socket a(Socket paramSocket, InetSocketAddress paramInetSocketAddress1, InetSocketAddress paramInetSocketAddress2, HttpParams paramHttpParams)
  {
    return this.a.a(paramSocket, paramInetSocketAddress1, paramInetSocketAddress2, paramHttpParams);
  }
  
  public Socket a(HttpParams paramHttpParams)
  {
    return this.a.a(paramHttpParams);
  }
  
  public boolean a(Socket paramSocket)
  {
    return this.a.a(paramSocket);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/org/a/a/f/a/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */