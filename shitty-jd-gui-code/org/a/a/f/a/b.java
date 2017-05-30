package org.a.a.f.a;

import java.net.Socket;
import org.apache.http.conn.scheme.LayeredSocketFactory;

@Deprecated
class b
  extends h
  implements LayeredSocketFactory
{
  private final a a;
  
  b(a parama)
  {
    super(parama);
    this.a = parama;
  }
  
  public Socket createSocket(Socket paramSocket, String paramString, int paramInt, boolean paramBoolean)
  {
    return this.a.a(paramSocket, paramString, paramInt, paramBoolean);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/org/a/a/f/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */