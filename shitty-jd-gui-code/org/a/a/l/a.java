package org.a.a.l;

import java.nio.charset.Charset;
import org.a.a.e.a.a;
import org.a.a.e.c;
import org.a.a.e.c.a;
import org.a.a.e.f;
import org.a.a.e.f.a;
import org.apache.http.params.HttpParams;

@Deprecated
public final class a
{
  public static f a(HttpParams paramHttpParams)
  {
    return f.g().a(paramHttpParams.getIntParameter("http.socket.timeout", 0)).b(paramHttpParams.getIntParameter("http.socket.linger", -1)).c(paramHttpParams.getBooleanParameter("http.tcp.nodelay", true)).a();
  }
  
  public static c b(HttpParams paramHttpParams)
  {
    return c.d().b(paramHttpParams.getIntParameter("http.connection.max-header-count", -1)).a(paramHttpParams.getIntParameter("http.connection.max-line-length", -1)).a();
  }
  
  public static org.a.a.e.a c(HttpParams paramHttpParams)
  {
    c localc = b(paramHttpParams);
    paramHttpParams = (String)paramHttpParams.getParameter("http.protocol.element-charset");
    a.a locala = org.a.a.e.a.h();
    if (paramHttpParams != null) {}
    for (paramHttpParams = Charset.forName(paramHttpParams);; paramHttpParams = null) {
      return locala.a(paramHttpParams).a(localc).a();
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/org/a/a/l/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */