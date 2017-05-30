package com.google.android.gms.c;

import android.content.Context;
import android.os.IBinder;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.l;

public abstract class h<T>
{
  private final String a;
  private T b;
  
  protected h(String paramString)
  {
    this.a = paramString;
  }
  
  protected final T b(Context paramContext)
  {
    if (this.b == null)
    {
      d.a(paramContext);
      paramContext = l.l(paramContext);
      if (paramContext == null) {
        throw new a("Could not get remote context.");
      }
      paramContext = paramContext.getClassLoader();
    }
    try
    {
      this.b = b((IBinder)paramContext.loadClass(this.a).newInstance());
      return (T)this.b;
    }
    catch (ClassNotFoundException paramContext)
    {
      throw new a("Could not load creator class.", paramContext);
    }
    catch (InstantiationException paramContext)
    {
      throw new a("Could not instantiate creator.", paramContext);
    }
    catch (IllegalAccessException paramContext)
    {
      throw new a("Could not access creator.", paramContext);
    }
  }
  
  protected abstract T b(IBinder paramIBinder);
  
  public static class a
    extends Exception
  {
    public a(String paramString)
    {
      super();
    }
    
    public a(String paramString, Throwable paramThrowable)
    {
      super(paramThrowable);
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/c/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */