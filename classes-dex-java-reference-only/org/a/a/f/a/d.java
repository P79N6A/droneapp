package org.a.a.f.a;

import java.net.Socket;
import org.apache.http.conn.scheme.LayeredSocketFactory;
import org.apache.http.params.HttpParams;

@Deprecated
class d
  extends g
  implements c
{
  private final LayeredSocketFactory a;
  
  d(LayeredSocketFactory paramLayeredSocketFactory)
  {
    super(paramLayeredSocketFactory);
    this.a = paramLayeredSocketFactory;
  }
  
  public Socket a(Socket paramSocket, String paramString, int paramInt, HttpParams paramHttpParams)
  {
    return this.a.createSocket(paramSocket, paramString, paramInt, true);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/org/a/a/f/a/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */