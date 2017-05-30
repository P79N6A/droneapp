package org.a.a.f;

import javax.net.ssl.SSLSession;
import org.apache.http.HttpInetConnection;
import org.apache.http.conn.routing.HttpRoute;

@Deprecated
public abstract interface g
  extends HttpInetConnection
{
  public abstract boolean a();
  
  public abstract HttpRoute b();
  
  public abstract SSLSession c();
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/org/a/a/f/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */