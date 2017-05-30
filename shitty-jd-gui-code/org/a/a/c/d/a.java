package org.a.a.c.d;

import java.lang.reflect.Field;
import java.net.InetAddress;
import java.util.Map;
import org.a.a.c.a.c;
import org.a.a.c.a.c.a;
import org.apache.http.HttpHost;
import org.apache.http.params.HttpParams;

@Deprecated
public final class a
{
  public static c a(HttpParams paramHttpParams)
  {
    if (paramHttpParams == null) {
      return null;
    }
    c.a locala;
    try
    {
      Object localObject = paramHttpParams.getClass().getDeclaredField("parameters");
      ((Field)localObject).setAccessible(true);
      localObject = (Map)((Field)localObject).get(paramHttpParams);
      if (localObject != null)
      {
        bool = ((Map)localObject).isEmpty();
        if (!bool) {}
      }
      else
      {
        return null;
      }
    }
    catch (Exception localException)
    {
      locala = c.q().d(paramHttpParams.getIntParameter("http.socket.timeout", 0)).b(paramHttpParams.getBooleanParameter("http.connection.stalecheck", true)).c(paramHttpParams.getIntParameter("http.connection.timeout", 0)).a(paramHttpParams.getBooleanParameter("http.protocol.expect-continue", false)).a((HttpHost)paramHttpParams.getParameter("http.route.default-proxy")).a((InetAddress)paramHttpParams.getParameter("http.route.local-address")).f(paramHttpParams.getBooleanParameter("http.protocol.handle-authentication", true)).e(paramHttpParams.getBooleanParameter("http.protocol.allow-circular-redirects", false)).a((String)paramHttpParams.getParameter("http.protocol.cookie-policy")).a(paramHttpParams.getIntParameter("http.protocol.max-redirects", 50)).c(paramHttpParams.getBooleanParameter("http.protocol.handle-redirects", true));
      if (paramHttpParams.getBooleanParameter("http.protocol.reject-relative-redirect", false)) {}
    }
    for (boolean bool = true;; bool = false) {
      return locala.d(bool).a();
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/org/a/a/c/d/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */