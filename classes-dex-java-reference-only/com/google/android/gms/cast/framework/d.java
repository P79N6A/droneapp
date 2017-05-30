package com.google.android.gms.cast.framework;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.support.annotation.NonNull;
import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.LaunchOptions;
import com.google.android.gms.cast.a.a;
import com.google.android.gms.cast.a.b;
import com.google.android.gms.cast.a.d;
import com.google.android.gms.cast.a.e;
import com.google.android.gms.cast.framework.media.c;
import com.google.android.gms.cast.internal.m;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.g.b;
import com.google.android.gms.common.api.g.c;
import com.google.android.gms.common.api.i;
import com.google.android.gms.internal.afc;
import com.google.android.gms.internal.afe;
import com.google.android.gms.internal.afq;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class d
  extends j
{
  private static final m a = new m("CastSession");
  private final Context b;
  private final Set<a.d> c = new HashSet();
  private final u d;
  private final a.b e;
  private final afe f;
  private final afq g;
  private g h;
  private c i;
  private CastDevice j;
  private a.a k;
  
  public d(Context paramContext, String paramString1, String paramString2, CastOptions paramCastOptions, a.b paramb, afe paramafe, afq paramafq)
  {
    super(paramContext, paramString1, paramString2);
    this.b = paramContext.getApplicationContext();
    this.e = paramb;
    this.f = paramafe;
    this.g = paramafq;
    this.d = afc.a(paramContext, paramCastOptions, u(), new b(null));
  }
  
  private void c(Bundle paramBundle)
  {
    this.j = CastDevice.b(paramBundle);
    if (this.j == null)
    {
      if (s())
      {
        c(8);
        return;
      }
      a(8);
      return;
    }
    if (this.h != null)
    {
      this.h.g();
      this.h = null;
    }
    a.b("Acquiring a connection to Google Play Services for %s", new Object[] { this.j });
    paramBundle = new d(null);
    this.h = this.f.a(this.b, this.j, new c(null), paramBundle, paramBundle);
    this.h.e();
  }
  
  private void e(int paramInt)
  {
    this.g.a(paramInt);
    if (this.h != null)
    {
      this.h.g();
      this.h = null;
    }
    this.j = null;
    if (this.i != null) {}
    try
    {
      this.i.a(null);
      this.i = null;
      this.k = null;
      return;
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        a.c(localIOException, "Exception when setting GoogleApiClient.", new Object[0]);
      }
    }
  }
  
  public c a()
  {
    return this.i;
  }
  
  public i<Status> a(String paramString1, String paramString2)
  {
    if (this.h != null) {
      return this.e.a(this.h, paramString1, paramString2);
    }
    return null;
  }
  
  public void a(double paramDouble)
  {
    if (this.h != null) {
      this.e.a(this.h, paramDouble);
    }
  }
  
  protected void a(Bundle paramBundle)
  {
    c(paramBundle);
  }
  
  public void a(a.d paramd)
  {
    if (paramd != null) {
      this.c.add(paramd);
    }
  }
  
  public void a(String paramString)
  {
    if (this.h != null) {
      this.e.d(this.h, paramString);
    }
  }
  
  public void a(String paramString, a.e parame)
  {
    if (this.h != null) {
      this.e.a(this.h, paramString, parame);
    }
  }
  
  protected void a(boolean paramBoolean)
  {
    try
    {
      this.d.a(paramBoolean, 0);
      b(0);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        a.a(localRemoteException, "Unable to call %s on %s.", new Object[] { "disconnectFromDevice", u.class.getSimpleName() });
      }
    }
  }
  
  public CastDevice b()
  {
    return this.j;
  }
  
  protected void b(Bundle paramBundle)
  {
    c(paramBundle);
  }
  
  public void b(a.d paramd)
  {
    if (paramd != null) {
      this.c.remove(paramd);
    }
  }
  
  public void b(boolean paramBoolean)
  {
    if (this.h != null) {
      this.e.a(this.h, paramBoolean);
    }
  }
  
  public void c()
  {
    if (this.h != null) {
      this.e.a(this.h);
    }
  }
  
  public int d()
  {
    if (this.h != null) {
      return this.e.g(this.h);
    }
    return -1;
  }
  
  public int e()
  {
    if (this.h != null) {
      return this.e.h(this.h);
    }
    return -1;
  }
  
  public ApplicationMetadata f()
  {
    if (this.h != null) {
      return this.e.i(this.h);
    }
    return null;
  }
  
  public String g()
  {
    if (this.h != null) {
      return this.e.j(this.h);
    }
    return null;
  }
  
  public double h()
  {
    if (this.h != null) {
      return this.e.e(this.h);
    }
    return 0.0D;
  }
  
  public boolean i()
  {
    if (this.h != null) {
      return this.e.f(this.h);
    }
    return false;
  }
  
  public a.a j()
  {
    return this.k;
  }
  
  public long k()
  {
    if (this.i == null) {
      return 0L;
    }
    return this.i.f() - this.i.e();
  }
  
  private class a
    implements com.google.android.gms.common.api.n<a.a>
  {
    String a;
    
    a(String paramString)
    {
      this.a = paramString;
    }
    
    public void a(@NonNull a.a parama)
    {
      d.a(d.this, parama);
      try
      {
        if (parama.a().f())
        {
          d.l().b("%s() -> success result", new Object[] { this.a });
          d.a(d.this, new c(new com.google.android.gms.cast.internal.n(null), d.c(d.this)));
          try
          {
            d.e(d.this).a(d.d(d.this));
            d.e(d.this).d();
            d.f(d.this).a(d.e(d.this), d.this.b());
            d.a(d.this).a(parama.b(), parama.c(), parama.d(), parama.e());
            return;
          }
          catch (IOException localIOException)
          {
            for (;;)
            {
              d.l().c(localIOException, "Exception when setting GoogleApiClient.", new Object[0]);
              d.a(d.this, null);
            }
          }
        }
      }
      catch (RemoteException parama)
      {
        d.l().a(parama, "Unable to call %s on %s.", new Object[] { "methods", u.class.getSimpleName() });
        return;
      }
      tmp222_219[0] = this.a;
      d.l().b("%s() -> failure result", tmp222_219);
      d.a(d.this).b(parama.a().i());
    }
  }
  
  private class b
    extends s.a
  {
    private b() {}
    
    public int a()
    {
      return 9683208;
    }
    
    public void a(int paramInt)
    {
      d.a(d.this, paramInt);
    }
    
    public void a(String paramString)
    {
      d.c(d.this).c(d.d(d.this), paramString);
    }
    
    public void a(String paramString, LaunchOptions paramLaunchOptions)
    {
      d.c(d.this).a(d.d(d.this), paramString, paramLaunchOptions).a(new d.a(d.this, "launchApplication"));
    }
    
    public void a(String paramString1, String paramString2)
    {
      d.c(d.this).b(d.d(d.this), paramString1, paramString2).a(new d.a(d.this, "joinApplication"));
    }
  }
  
  private class c
    extends a.d
  {
    private c() {}
    
    public void a()
    {
      Iterator localIterator = new HashSet(d.b(d.this)).iterator();
      while (localIterator.hasNext()) {
        ((a.d)localIterator.next()).a();
      }
    }
    
    public void a(int paramInt)
    {
      d.a(d.this, paramInt);
      d.this.b(paramInt);
      Iterator localIterator = new HashSet(d.b(d.this)).iterator();
      while (localIterator.hasNext()) {
        ((a.d)localIterator.next()).a(paramInt);
      }
    }
    
    public void a(ApplicationMetadata paramApplicationMetadata)
    {
      Iterator localIterator = new HashSet(d.b(d.this)).iterator();
      while (localIterator.hasNext()) {
        ((a.d)localIterator.next()).a(paramApplicationMetadata);
      }
    }
    
    public void b()
    {
      Iterator localIterator = new HashSet(d.b(d.this)).iterator();
      while (localIterator.hasNext()) {
        ((a.d)localIterator.next()).b();
      }
    }
    
    public void b(int paramInt)
    {
      Iterator localIterator = new HashSet(d.b(d.this)).iterator();
      while (localIterator.hasNext()) {
        ((a.d)localIterator.next()).b(paramInt);
      }
    }
    
    public void c(int paramInt)
    {
      Iterator localIterator = new HashSet(d.b(d.this)).iterator();
      while (localIterator.hasNext()) {
        ((a.d)localIterator.next()).c(paramInt);
      }
    }
  }
  
  private class d
    implements g.b, g.c
  {
    private d() {}
    
    public void a(int paramInt)
    {
      try
      {
        d.a(d.this).a(paramInt);
        return;
      }
      catch (RemoteException localRemoteException)
      {
        d.l().a(localRemoteException, "Unable to call %s on %s.", new Object[] { "onConnectionSuspended", u.class.getSimpleName() });
      }
    }
    
    public void a(Bundle paramBundle)
    {
      try
      {
        d.a(d.this).a(paramBundle);
        return;
      }
      catch (RemoteException paramBundle)
      {
        d.l().a(paramBundle, "Unable to call %s on %s.", new Object[] { "onConnected", u.class.getSimpleName() });
      }
    }
    
    public void a(@NonNull ConnectionResult paramConnectionResult)
    {
      try
      {
        d.a(d.this).a(paramConnectionResult);
        return;
      }
      catch (RemoteException paramConnectionResult)
      {
        d.l().a(paramConnectionResult, "Unable to call %s on %s.", new Object[] { "onConnectionFailed", u.class.getSimpleName() });
      }
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/cast/framework/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */