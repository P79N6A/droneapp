package org.a.a.b;

import java.util.Queue;
import org.a.a.a.c;
import org.apache.http.auth.AuthScheme;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.Credentials;

@c
public class d
{
  private b a = b.a;
  private AuthScheme b;
  private AuthScope c;
  private Credentials d;
  private Queue<a> e;
  
  public void a()
  {
    this.a = b.a;
    this.e = null;
    this.b = null;
    this.c = null;
    this.d = null;
  }
  
  public void a(Queue<a> paramQueue)
  {
    org.a.a.o.a.a(paramQueue, "Queue of auth options");
    this.e = paramQueue;
    this.b = null;
    this.d = null;
  }
  
  public void a(b paramb)
  {
    if (paramb != null) {}
    for (;;)
    {
      this.a = paramb;
      return;
      paramb = b.a;
    }
  }
  
  @Deprecated
  public void a(AuthScheme paramAuthScheme)
  {
    if (paramAuthScheme == null)
    {
      a();
      return;
    }
    this.b = paramAuthScheme;
  }
  
  public void a(AuthScheme paramAuthScheme, Credentials paramCredentials)
  {
    org.a.a.o.a.a(paramAuthScheme, "Auth scheme");
    org.a.a.o.a.a(paramCredentials, "Credentials");
    this.b = paramAuthScheme;
    this.d = paramCredentials;
    this.e = null;
  }
  
  @Deprecated
  public void a(AuthScope paramAuthScope)
  {
    this.c = paramAuthScope;
  }
  
  @Deprecated
  public void a(Credentials paramCredentials)
  {
    this.d = paramCredentials;
  }
  
  public b b()
  {
    return this.a;
  }
  
  public AuthScheme c()
  {
    return this.b;
  }
  
  public Credentials d()
  {
    return this.d;
  }
  
  public Queue<a> e()
  {
    return this.e;
  }
  
  public boolean f()
  {
    return (this.e != null) && (!this.e.isEmpty());
  }
  
  @Deprecated
  public void g()
  {
    a();
  }
  
  @Deprecated
  public boolean h()
  {
    return this.b != null;
  }
  
  @Deprecated
  public AuthScope i()
  {
    return this.c;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("state:").append(this.a).append(";");
    if (this.b != null) {
      localStringBuilder.append("auth scheme:").append(this.b.getSchemeName()).append(";");
    }
    if (this.d != null) {
      localStringBuilder.append("credentials present");
    }
    return localStringBuilder.toString();
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/org/a/a/b/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */