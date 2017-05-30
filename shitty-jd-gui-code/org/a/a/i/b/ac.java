package org.a.a.i.b;

import java.net.Socket;
import org.a.a.f.h;
import org.a.a.i.a.b;
import org.a.a.i.a.i;
import org.a.a.i.c.q;
import org.a.a.i.f.n;
import org.a.a.i.g;
import org.a.a.n.j;
import org.a.a.n.k;
import org.apache.http.ConnectionReuseStrategy;
import org.apache.http.HttpException;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.HttpResponse;
import org.apache.http.HttpVersion;
import org.apache.http.StatusLine;
import org.apache.http.auth.AuthSchemeRegistry;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.Credentials;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.conn.routing.RouteInfo.LayerType;
import org.apache.http.conn.routing.RouteInfo.TunnelType;
import org.apache.http.message.BasicHttpRequest;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.HttpContext;
import org.apache.http.protocol.HttpProcessor;
import org.apache.http.protocol.HttpRequestExecutor;

public class ac
{
  private final org.a.a.f.e<HttpRoute, h> a;
  private final org.a.a.e.a b;
  private final org.a.a.c.a.c c;
  private final HttpProcessor d;
  private final HttpRequestExecutor e;
  private final ab f;
  private final org.a.a.i.a.f g;
  private final org.a.a.b.d h;
  private final AuthSchemeRegistry i;
  private final ConnectionReuseStrategy j;
  
  public ac()
  {
    this(null, null, null);
  }
  
  public ac(org.a.a.c.a.c paramc)
  {
    this(null, null, paramc);
  }
  
  public ac(org.a.a.f.e<HttpRoute, h> parame, org.a.a.e.a parama, org.a.a.c.a.c paramc)
  {
    if (parame != null)
    {
      this.a = parame;
      if (parama == null) {
        break label198;
      }
      label17:
      this.b = parama;
      if (paramc == null) {
        break label205;
      }
    }
    for (;;)
    {
      this.c = paramc;
      this.d = new org.a.a.n.f(new HttpRequestInterceptor[] { new j(), new org.a.a.c.e.e(), new k() });
      this.e = new HttpRequestExecutor();
      this.f = new ab();
      this.g = new org.a.a.i.a.f();
      this.h = new org.a.a.b.d();
      this.i = new AuthSchemeRegistry();
      this.i.register("Basic", new b());
      this.i.register("Digest", new org.a.a.i.a.d());
      this.i.register("NTLM", new i());
      this.j = new g();
      return;
      parame = q.a;
      break;
      label198:
      parama = org.a.a.e.a.a;
      break label17;
      label205:
      paramc = org.a.a.c.a.c.a;
    }
  }
  
  @Deprecated
  public ac(HttpParams paramHttpParams)
  {
    this(null, org.a.a.l.a.c(paramHttpParams), org.a.a.c.d.a.a(paramHttpParams));
  }
  
  public Socket a(HttpHost paramHttpHost1, HttpHost paramHttpHost2, Credentials paramCredentials)
  {
    org.a.a.o.a.a(paramHttpHost1, "Proxy host");
    org.a.a.o.a.a(paramHttpHost2, "Target host");
    org.a.a.o.a.a(paramCredentials, "Credentials");
    if (paramHttpHost2.getPort() <= 0) {}
    for (Object localObject = new HttpHost(paramHttpHost2.getHostName(), 80, paramHttpHost2.getSchemeName());; localObject = paramHttpHost2)
    {
      HttpRoute localHttpRoute = new HttpRoute((HttpHost)localObject, this.c.c(), paramHttpHost1, false, RouteInfo.TunnelType.TUNNELLED, RouteInfo.LayerType.PLAIN);
      h localh = (h)this.a.a(localHttpRoute, this.b);
      org.a.a.n.a locala = new org.a.a.n.a();
      localObject = new BasicHttpRequest("CONNECT", ((HttpHost)localObject).toHostString(), HttpVersion.HTTP_1_1);
      e locale = new e();
      locale.setCredentials(new AuthScope(paramHttpHost1.getHostName(), paramHttpHost1.getPort()), paramCredentials);
      locala.setAttribute("http.target_host", paramHttpHost2);
      locala.setAttribute("http.connection", localh);
      locala.setAttribute("http.request", localObject);
      locala.setAttribute("http.route", localHttpRoute);
      locala.setAttribute("http.auth.proxy-scope", this.h);
      locala.setAttribute("http.auth.credentials-provider", locale);
      locala.setAttribute("http.authscheme-registry", this.i);
      locala.setAttribute("http.request-config", this.c);
      this.e.preProcess((HttpRequest)localObject, this.d, locala);
      if (!localh.isOpen()) {
        localh.a(new Socket(paramHttpHost1.getHostName(), paramHttpHost1.getPort()));
      }
      this.g.a((HttpRequest)localObject, this.h, locala);
      paramHttpHost2 = this.e.execute((HttpRequest)localObject, localh, locala);
      if (paramHttpHost2.getStatusLine().getStatusCode() < 200) {
        throw new HttpException("Unexpected response to CONNECT request: " + paramHttpHost2.getStatusLine());
      }
      if ((this.g.a(paramHttpHost1, paramHttpHost2, this.f, this.h, locala)) && (this.g.b(paramHttpHost1, paramHttpHost2, this.f, this.h, locala)))
      {
        if (this.j.keepAlive(paramHttpHost2, locala)) {
          org.a.a.o.d.b(paramHttpHost2.getEntity());
        }
        for (;;)
        {
          ((HttpRequest)localObject).removeHeaders("Proxy-Authorization");
          break;
          localh.close();
        }
      }
      if (paramHttpHost2.getStatusLine().getStatusCode() > 299)
      {
        paramHttpHost1 = paramHttpHost2.getEntity();
        if (paramHttpHost1 != null) {
          paramHttpHost2.setEntity(new org.a.a.h.c(paramHttpHost1));
        }
        localh.close();
        throw new n("CONNECT refused by proxy: " + paramHttpHost2.getStatusLine(), paramHttpHost2);
      }
      return localh.b();
    }
  }
  
  @Deprecated
  public HttpParams a()
  {
    return new BasicHttpParams();
  }
  
  @Deprecated
  public AuthSchemeRegistry b()
  {
    return this.i;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/org/a/a/i/b/ac.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */