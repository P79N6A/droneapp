package org.a.a.i.b;

import android.util.Log;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Locale;
import org.a.a.c.a.c;
import org.a.a.c.c.g;
import org.a.a.c.c.p;
import org.a.a.c.e;
import org.a.a.c.f.i;
import org.a.a.o.f;
import org.apache.http.Header;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.ProtocolException;
import org.apache.http.RequestLine;
import org.apache.http.StatusLine;
import org.apache.http.client.CircularRedirectException;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.protocol.HttpContext;

@org.a.a.a.b
public class m
  implements e
{
  @Deprecated
  public static final String a = "http.protocol.redirect-locations";
  public static final m b = new m();
  private static final String c = "HttpClient";
  private static final String[] d = { "GET", "HEAD" };
  
  protected URI a(String paramString)
  {
    try
    {
      Object localObject = new org.a.a.c.f.h(new URI(paramString).normalize());
      String str = ((org.a.a.c.f.h)localObject).h();
      if (str != null) {
        ((org.a.a.c.f.h)localObject).c(str.toLowerCase(Locale.ENGLISH));
      }
      if (f.a(((org.a.a.c.f.h)localObject).j())) {
        ((org.a.a.c.f.h)localObject).d("/");
      }
      localObject = ((org.a.a.c.f.h)localObject).a();
      return (URI)localObject;
    }
    catch (URISyntaxException localURISyntaxException)
    {
      throw new ProtocolException("Invalid redirect URI: " + paramString, localURISyntaxException);
    }
  }
  
  public boolean a(HttpRequest paramHttpRequest, HttpResponse paramHttpResponse, HttpContext paramHttpContext)
  {
    boolean bool2 = true;
    org.a.a.o.a.a(paramHttpRequest, "HTTP request");
    org.a.a.o.a.a(paramHttpResponse, "HTTP response");
    int i = paramHttpResponse.getStatusLine().getStatusCode();
    paramHttpRequest = paramHttpRequest.getRequestLine().getMethod();
    paramHttpResponse = paramHttpResponse.getFirstHeader("location");
    boolean bool1 = bool2;
    switch (i)
    {
    case 304: 
    case 305: 
    case 306: 
    default: 
      bool1 = false;
    case 303: 
    case 302: 
      do
      {
        return bool1;
        if (!b(paramHttpRequest)) {
          break;
        }
        bool1 = bool2;
      } while (paramHttpResponse != null);
      return false;
    }
    return b(paramHttpRequest);
  }
  
  public HttpUriRequest b(HttpRequest paramHttpRequest, HttpResponse paramHttpResponse, HttpContext paramHttpContext)
  {
    paramHttpContext = c(paramHttpRequest, paramHttpResponse, paramHttpContext);
    String str = paramHttpRequest.getRequestLine().getMethod();
    if (str.equalsIgnoreCase("HEAD")) {
      return new org.a.a.c.c.h(paramHttpContext);
    }
    if (str.equalsIgnoreCase("GET")) {
      return new g(paramHttpContext);
    }
    if (paramHttpResponse.getStatusLine().getStatusCode() == 307) {
      return p.a(paramHttpRequest).a(paramHttpContext).n();
    }
    return new g(paramHttpContext);
  }
  
  protected boolean b(String paramString)
  {
    boolean bool2 = false;
    String[] arrayOfString = d;
    int j = arrayOfString.length;
    int i = 0;
    for (;;)
    {
      boolean bool1 = bool2;
      if (i < j)
      {
        if (arrayOfString[i].equalsIgnoreCase(paramString)) {
          bool1 = true;
        }
      }
      else {
        return bool1;
      }
      i += 1;
    }
  }
  
  public URI c(HttpRequest paramHttpRequest, HttpResponse paramHttpResponse, HttpContext paramHttpContext)
  {
    org.a.a.o.a.a(paramHttpRequest, "HTTP request");
    org.a.a.o.a.a(paramHttpResponse, "HTTP response");
    org.a.a.o.a.a(paramHttpContext, "HTTP context");
    Object localObject1 = org.a.a.c.e.a.a(paramHttpContext);
    Object localObject2 = paramHttpResponse.getFirstHeader("location");
    if (localObject2 == null) {
      throw new ProtocolException("Received redirect response " + paramHttpResponse.getStatusLine() + " but no location header");
    }
    paramHttpResponse = ((Header)localObject2).getValue();
    if (Log.isLoggable("HttpClient", 3)) {
      Log.d("HttpClient", "Redirect requested to location '" + paramHttpResponse + "'");
    }
    localObject2 = ((org.a.a.c.e.a)localObject1).n();
    paramHttpResponse = a(paramHttpResponse);
    try
    {
      if (paramHttpResponse.isAbsolute()) {
        break label336;
      }
      if (!((c)localObject2).g()) {
        throw new ProtocolException("Relative redirect location '" + paramHttpResponse + "' not allowed");
      }
    }
    catch (URISyntaxException paramHttpRequest)
    {
      throw new ProtocolException(paramHttpRequest.getMessage(), paramHttpRequest);
    }
    HttpHost localHttpHost = ((org.a.a.c.e.a)localObject1).t();
    org.a.a.o.b.a(localHttpHost, "Target host");
    label336:
    for (paramHttpRequest = i.a(i.a(new URI(paramHttpRequest.getRequestLine().getUri()), localHttpHost, false), paramHttpResponse);; paramHttpRequest = paramHttpResponse)
    {
      localObject1 = (ad)((org.a.a.c.e.a)localObject1).getAttribute("http.protocol.redirect-locations");
      paramHttpResponse = (HttpResponse)localObject1;
      if (localObject1 == null)
      {
        paramHttpResponse = new ad();
        paramHttpContext.setAttribute("http.protocol.redirect-locations", paramHttpResponse);
      }
      if ((!((c)localObject2).h()) && (paramHttpResponse.a(paramHttpRequest))) {
        throw new CircularRedirectException("Circular redirect to '" + paramHttpRequest + "'");
      }
      paramHttpResponse.b(paramHttpRequest);
      return paramHttpRequest;
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/org/a/a/i/b/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */