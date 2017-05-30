package com.google.android.gms.internal;

import android.support.annotation.Nullable;
import com.google.android.gms.ads.internal.u;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@aaa
public class acl<T>
  implements aco<T>
{
  private final Object a = new Object();
  private T b;
  private Throwable c;
  private boolean d;
  private boolean e;
  private final acp f = new acp();
  
  private boolean a()
  {
    return (this.c != null) || (this.d);
  }
  
  public void a(Runnable paramRunnable)
  {
    this.f.a(paramRunnable);
  }
  
  public void a(Throwable paramThrowable)
  {
    synchronized (this.a)
    {
      if (this.e) {
        return;
      }
      if (a())
      {
        u.i().a(new IllegalStateException("Provided CallbackFuture with multiple values."), "CallbackFuture.provideException");
        return;
      }
    }
    this.c = paramThrowable;
    this.a.notifyAll();
    this.f.a();
  }
  
  public void b(@Nullable T paramT)
  {
    synchronized (this.a)
    {
      if (this.e) {
        return;
      }
      if (a())
      {
        u.i().a(new IllegalStateException("Provided CallbackFuture with multiple values."), "CallbackFuture.provideValue");
        return;
      }
    }
    this.d = true;
    this.b = paramT;
    this.a.notifyAll();
    this.f.a();
  }
  
  public void b(Runnable paramRunnable)
  {
    this.f.b(paramRunnable);
  }
  
  public boolean cancel(boolean paramBoolean)
  {
    if (!paramBoolean) {
      return false;
    }
    synchronized (this.a)
    {
      if (a()) {
        return false;
      }
    }
    this.e = true;
    this.d = true;
    this.a.notifyAll();
    this.f.a();
    return true;
  }
  
  public T get()
  {
    synchronized (this.a)
    {
      boolean bool = a();
      if (bool) {}
    }
    if (this.e) {
      throw new CancellationException("CallbackFuture was cancelled.");
    }
    Object localObject3 = this.b;
    return (T)localObject3;
  }
  
  public T get(long paramLong, TimeUnit paramTimeUnit)
  {
    synchronized (this.a)
    {
      boolean bool = a();
      if (bool) {}
    }
    if (!this.d) {
      throw new TimeoutException("CallbackFuture timed out.");
    }
    if (this.e) {
      throw new CancellationException("CallbackFuture was cancelled.");
    }
    paramTimeUnit = this.b;
    return paramTimeUnit;
  }
  
  public boolean isCancelled()
  {
    synchronized (this.a)
    {
      boolean bool = this.e;
      return bool;
    }
  }
  
  public boolean isDone()
  {
    synchronized (this.a)
    {
      boolean bool = a();
      return bool;
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/internal/acl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */