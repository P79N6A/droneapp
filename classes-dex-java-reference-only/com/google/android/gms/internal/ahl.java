package com.google.android.gms.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.a.c;
import com.google.android.gms.common.api.a.d;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.internal.d;

public class ahl
{
  public static abstract class a<R extends m, A extends a.c>
    extends ahn<R>
    implements ahl.b<R>
  {
    private final a.d<A> a;
    private final a<?> b;
    
    @Deprecated
    protected a(a.d<A> paramd, g paramg)
    {
      super();
      this.a = ((a.d)d.a(paramd));
      this.b = null;
    }
    
    protected a(a<?> parama, g paramg)
    {
      super();
      this.a = parama.d();
      this.b = parama;
    }
    
    private void a(RemoteException paramRemoteException)
    {
      c(new Status(8, paramRemoteException.getLocalizedMessage(), null));
    }
    
    protected abstract void a(A paramA);
    
    protected void a(R paramR) {}
    
    public final void b(A paramA)
    {
      try
      {
        a(paramA);
        return;
      }
      catch (DeadObjectException paramA)
      {
        a(paramA);
        throw paramA;
      }
      catch (RemoteException paramA)
      {
        a(paramA);
      }
    }
    
    public final void c(Status paramStatus)
    {
      if (!paramStatus.f()) {}
      for (boolean bool = true;; bool = false)
      {
        d.b(bool, "Failed result must not be success");
        paramStatus = b(paramStatus);
        b(paramStatus);
        a(paramStatus);
        return;
      }
    }
    
    public final a.d<A> g()
    {
      return this.a;
    }
    
    public final a<?> h()
    {
      return this.b;
    }
  }
  
  public static abstract interface b<R>
  {
    public abstract void a(R paramR);
    
    public abstract void c(Status paramStatus);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/internal/ahl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */