package org.a.a.i.b;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ConnectException;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import javax.net.ssl.SSLException;
import org.a.a.a.b;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpRequest;
import org.apache.http.client.HttpRequestRetryHandler;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.RequestWrapper;
import org.apache.http.protocol.HttpContext;

@b
public class l
  implements HttpRequestRetryHandler
{
  public static final l a = new l();
  private final int b;
  private final boolean c;
  private final Set<Class<? extends IOException>> d;
  
  public l()
  {
    this(3, false);
  }
  
  public l(int paramInt, boolean paramBoolean)
  {
    this(paramInt, paramBoolean, Arrays.asList(new Class[] { InterruptedIOException.class, UnknownHostException.class, ConnectException.class, SSLException.class }));
  }
  
  protected l(int paramInt, boolean paramBoolean, Collection<Class<? extends IOException>> paramCollection)
  {
    this.b = paramInt;
    this.c = paramBoolean;
    this.d = new HashSet();
    paramCollection = paramCollection.iterator();
    while (paramCollection.hasNext())
    {
      Class localClass = (Class)paramCollection.next();
      this.d.add(localClass);
    }
  }
  
  public boolean a()
  {
    return this.c;
  }
  
  protected boolean a(HttpRequest paramHttpRequest)
  {
    return !(paramHttpRequest instanceof HttpEntityEnclosingRequest);
  }
  
  public int b()
  {
    return this.b;
  }
  
  @Deprecated
  protected boolean b(HttpRequest paramHttpRequest)
  {
    if ((paramHttpRequest instanceof RequestWrapper)) {
      paramHttpRequest = ((RequestWrapper)paramHttpRequest).getOriginal();
    }
    for (;;)
    {
      return ((paramHttpRequest instanceof HttpUriRequest)) && (((HttpUriRequest)paramHttpRequest).isAborted());
    }
  }
  
  public boolean retryRequest(IOException paramIOException, int paramInt, HttpContext paramHttpContext)
  {
    org.a.a.o.a.a(paramIOException, "Exception parameter");
    org.a.a.o.a.a(paramHttpContext, "HTTP context");
    if (paramInt > this.b) {
      return false;
    }
    if (this.d.contains(paramIOException.getClass())) {
      return false;
    }
    Iterator localIterator = this.d.iterator();
    while (localIterator.hasNext()) {
      if (((Class)localIterator.next()).isInstance(paramIOException)) {
        return false;
      }
    }
    paramIOException = org.a.a.c.e.a.a(paramHttpContext);
    paramHttpContext = paramIOException.q();
    if (b(paramHttpContext)) {
      return false;
    }
    if (a(paramHttpContext)) {
      return true;
    }
    return (!paramIOException.r()) || (this.c);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/org/a/a/i/b/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */