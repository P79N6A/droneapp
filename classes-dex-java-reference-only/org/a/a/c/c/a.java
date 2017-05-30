package org.a.a.c.c;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.a.a.d.b;
import org.apache.http.HttpRequest;
import org.apache.http.client.methods.AbortableHttpRequest;
import org.apache.http.conn.ClientConnectionRequest;
import org.apache.http.conn.ConnectionReleaseTrigger;
import org.apache.http.message.AbstractHttpMessage;
import org.apache.http.message.HeaderGroup;
import org.apache.http.params.HttpParams;

public abstract class a
  extends AbstractHttpMessage
  implements Cloneable, f, HttpRequest, AbortableHttpRequest
{
  private final AtomicBoolean a = new AtomicBoolean(false);
  private final AtomicReference<b> b = new AtomicReference(null);
  
  public void a()
  {
    this.b.set(null);
  }
  
  public void a(b paramb)
  {
    if (!this.a.get()) {
      this.b.set(paramb);
    }
  }
  
  public void abort()
  {
    if (this.a.compareAndSet(false, true))
    {
      b localb = (b)this.b.getAndSet(null);
      if (localb != null) {
        localb.a();
      }
    }
  }
  
  public void b()
  {
    b localb = (b)this.b.getAndSet(null);
    if (localb != null) {
      localb.a();
    }
    this.a.set(false);
  }
  
  public Object clone()
  {
    a locala = (a)super.clone();
    locala.headergroup = ((HeaderGroup)org.a.a.c.f.a.a(this.headergroup));
    locala.params = ((HttpParams)org.a.a.c.f.a.a(this.params));
    return locala;
  }
  
  public boolean isAborted()
  {
    return this.a.get();
  }
  
  @Deprecated
  public void setConnectionRequest(ClientConnectionRequest paramClientConnectionRequest)
  {
    a(new a.1(this, paramClientConnectionRequest));
  }
  
  @Deprecated
  public void setReleaseTrigger(ConnectionReleaseTrigger paramConnectionReleaseTrigger)
  {
    a(new a.2(this, paramConnectionReleaseTrigger));
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/org/a/a/c/c/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */