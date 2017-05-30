package com.google.android.gms.cast;

import android.content.Context;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.cast.internal.b;
import com.google.android.gms.cast.internal.e;
import com.google.android.gms.cast.internal.l;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a.a.a;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.g.b;
import com.google.android.gms.common.api.g.c;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.s;
import java.io.IOException;

public final class a
{
  public static final int a = 65536;
  public static final int b = 128;
  public static final int c = -1;
  public static final int d = 0;
  public static final int e = 1;
  public static final int f = -1;
  public static final int g = 0;
  public static final int h = 1;
  public static final String i = "com.google.android.gms.cast.EXTRA_APP_NO_LONGER_RUNNING";
  static final com.google.android.gms.common.api.a.b<e, c> j = new com.google.android.gms.common.api.a.b()
  {
    public e a(Context paramAnonymousContext, Looper paramAnonymousLooper, s paramAnonymouss, a.c paramAnonymousc, g.b paramAnonymousb, g.c paramAnonymousc1)
    {
      d.a(paramAnonymousc, "Setting the API options is required.");
      return new e(paramAnonymousContext, paramAnonymousLooper, paramAnonymouss, paramAnonymousc.a, a.c.a(paramAnonymousc), paramAnonymousc.b, paramAnonymousb, paramAnonymousc1);
    }
  };
  public static final com.google.android.gms.common.api.a<c> k = new com.google.android.gms.common.api.a("Cast.API", j, l.a);
  public static final b l = new a.b.a();
  
  public static abstract interface a
    extends m
  {
    public abstract ApplicationMetadata b();
    
    public abstract String c();
    
    public abstract String d();
    
    public abstract boolean e();
  }
  
  public static abstract interface b
  {
    public abstract com.google.android.gms.common.api.i<a.a> a(g paramg, String paramString);
    
    public abstract com.google.android.gms.common.api.i<a.a> a(g paramg, String paramString, LaunchOptions paramLaunchOptions);
    
    public abstract com.google.android.gms.common.api.i<Status> a(g paramg, String paramString1, String paramString2);
    
    @Deprecated
    public abstract com.google.android.gms.common.api.i<a.a> a(g paramg, String paramString, boolean paramBoolean);
    
    public abstract void a(g paramg);
    
    public abstract void a(g paramg, double paramDouble);
    
    public abstract void a(g paramg, String paramString, a.e parame);
    
    public abstract void a(g paramg, boolean paramBoolean);
    
    public abstract com.google.android.gms.common.api.i<a.a> b(g paramg);
    
    public abstract com.google.android.gms.common.api.i<a.a> b(g paramg, String paramString);
    
    public abstract com.google.android.gms.common.api.i<a.a> b(g paramg, String paramString1, String paramString2);
    
    public abstract com.google.android.gms.common.api.i<Status> c(g paramg);
    
    public abstract com.google.android.gms.common.api.i<Status> c(g paramg, String paramString);
    
    public abstract com.google.android.gms.common.api.i<Status> d(g paramg);
    
    public abstract void d(g paramg, String paramString);
    
    public abstract double e(g paramg);
    
    public abstract boolean f(g paramg);
    
    public abstract int g(g paramg);
    
    public abstract int h(g paramg);
    
    public abstract ApplicationMetadata i(g paramg);
    
    public abstract String j(g paramg);
    
    public static final class a
      implements a.b
    {
      public com.google.android.gms.common.api.i<a.a> a(g paramg, final String paramString)
      {
        paramg.b(new a.f(paramg)
        {
          public void a(e paramAnonymouse)
          {
            try
            {
              paramAnonymouse.a(paramString, false, this);
              return;
            }
            catch (IllegalStateException paramAnonymouse)
            {
              a(2001);
            }
          }
        });
      }
      
      public com.google.android.gms.common.api.i<a.a> a(g paramg, final String paramString, final LaunchOptions paramLaunchOptions)
      {
        paramg.b(new a.f(paramg)
        {
          public void a(e paramAnonymouse)
          {
            try
            {
              paramAnonymouse.a(paramString, paramLaunchOptions, this);
              return;
            }
            catch (IllegalStateException paramAnonymouse)
            {
              a(2001);
            }
          }
        });
      }
      
      public com.google.android.gms.common.api.i<Status> a(g paramg, final String paramString1, final String paramString2)
      {
        paramg.b(new com.google.android.gms.cast.internal.i(paramg)
        {
          public void a(e paramAnonymouse)
          {
            try
            {
              paramAnonymouse.a(paramString1, paramString2, this);
              return;
            }
            catch (IllegalStateException paramAnonymouse)
            {
              a(2001);
              return;
            }
            catch (IllegalArgumentException paramAnonymouse)
            {
              for (;;) {}
            }
          }
        });
      }
      
      public com.google.android.gms.common.api.i<a.a> a(g paramg, final String paramString1, final String paramString2, final JoinOptions paramJoinOptions)
      {
        paramg.b(new a.f(paramg)
        {
          public void a(e paramAnonymouse)
          {
            try
            {
              paramAnonymouse.a(paramString1, paramString2, paramJoinOptions, this);
              return;
            }
            catch (IllegalStateException paramAnonymouse)
            {
              a(2001);
            }
          }
        });
      }
      
      @Deprecated
      public com.google.android.gms.common.api.i<a.a> a(g paramg, String paramString, boolean paramBoolean)
      {
        return a(paramg, paramString, new LaunchOptions.a().a(paramBoolean).a());
      }
      
      public void a(g paramg)
      {
        try
        {
          ((e)paramg.a(l.a)).i();
          return;
        }
        catch (RemoteException paramg)
        {
          throw new IOException("service error");
        }
      }
      
      public void a(g paramg, double paramDouble)
      {
        try
        {
          ((e)paramg.a(l.a)).a(paramDouble);
          return;
        }
        catch (RemoteException paramg)
        {
          throw new IOException("service error");
        }
      }
      
      public void a(g paramg, String paramString, a.e parame)
      {
        try
        {
          ((e)paramg.a(l.a)).a(paramString, parame);
          return;
        }
        catch (RemoteException paramg)
        {
          throw new IOException("service error");
        }
      }
      
      public void a(g paramg, boolean paramBoolean)
      {
        try
        {
          ((e)paramg.a(l.a)).a(paramBoolean);
          return;
        }
        catch (RemoteException paramg)
        {
          throw new IOException("service error");
        }
      }
      
      public com.google.android.gms.common.api.i<a.a> b(g paramg)
      {
        return a(paramg, null, null, null);
      }
      
      public com.google.android.gms.common.api.i<a.a> b(g paramg, String paramString)
      {
        return a(paramg, paramString, null, null);
      }
      
      public com.google.android.gms.common.api.i<a.a> b(g paramg, String paramString1, String paramString2)
      {
        return a(paramg, paramString1, paramString2, null);
      }
      
      public com.google.android.gms.common.api.i<Status> c(g paramg)
      {
        paramg.b(new com.google.android.gms.cast.internal.i(paramg)
        {
          public void a(e paramAnonymouse)
          {
            try
            {
              paramAnonymouse.a(this);
              return;
            }
            catch (IllegalStateException paramAnonymouse)
            {
              a(2001);
            }
          }
        });
      }
      
      public com.google.android.gms.common.api.i<Status> c(g paramg, final String paramString)
      {
        paramg.b(new com.google.android.gms.cast.internal.i(paramg)
        {
          public void a(e paramAnonymouse)
          {
            if (TextUtils.isEmpty(paramString))
            {
              a(2001, "IllegalArgument: sessionId cannot be null or empty");
              return;
            }
            try
            {
              paramAnonymouse.a(paramString, this);
              return;
            }
            catch (IllegalStateException paramAnonymouse)
            {
              a(2001);
            }
          }
        });
      }
      
      public com.google.android.gms.common.api.i<Status> d(g paramg)
      {
        paramg.b(new com.google.android.gms.cast.internal.i(paramg)
        {
          public void a(e paramAnonymouse)
          {
            try
            {
              paramAnonymouse.a("", this);
              return;
            }
            catch (IllegalStateException paramAnonymouse)
            {
              a(2001);
            }
          }
        });
      }
      
      public void d(g paramg, String paramString)
      {
        try
        {
          ((e)paramg.a(l.a)).a(paramString);
          return;
        }
        catch (RemoteException paramg)
        {
          throw new IOException("service error");
        }
      }
      
      public double e(g paramg)
      {
        return ((e)paramg.a(l.a)).j();
      }
      
      public boolean f(g paramg)
      {
        return ((e)paramg.a(l.a)).k();
      }
      
      public int g(g paramg)
      {
        return ((e)paramg.a(l.a)).l();
      }
      
      public int h(g paramg)
      {
        return ((e)paramg.a(l.a)).m();
      }
      
      public ApplicationMetadata i(g paramg)
      {
        return ((e)paramg.a(l.a)).n();
      }
      
      public String j(g paramg)
      {
        return ((e)paramg.a(l.a)).o();
      }
    }
  }
  
  public static final class c
    implements a.a.a
  {
    final CastDevice a;
    final a.d b;
    private final int c;
    
    private c(a parama)
    {
      this.a = parama.a;
      this.b = parama.b;
      this.c = a.a(parama);
    }
    
    @Deprecated
    public static a a(CastDevice paramCastDevice, a.d paramd)
    {
      return new a(paramCastDevice, paramd);
    }
    
    public static final class a
    {
      CastDevice a;
      a.d b;
      private int c;
      
      public a(CastDevice paramCastDevice, a.d paramd)
      {
        d.a(paramCastDevice, "CastDevice parameter cannot be null");
        d.a(paramd, "CastListener parameter cannot be null");
        this.a = paramCastDevice;
        this.b = paramd;
        this.c = 0;
      }
      
      public a a(boolean paramBoolean)
      {
        if (paramBoolean)
        {
          this.c |= 0x1;
          return this;
        }
        this.c &= 0xFFFFFFFE;
        return this;
      }
      
      public a.c a()
      {
        return new a.c(this, null);
      }
    }
  }
  
  public static class d
  {
    public void a() {}
    
    public void a(int paramInt) {}
    
    public void a(ApplicationMetadata paramApplicationMetadata) {}
    
    public void b() {}
    
    public void b(int paramInt) {}
    
    public void c(int paramInt) {}
  }
  
  public static abstract interface e
  {
    public abstract void a(CastDevice paramCastDevice, String paramString1, String paramString2);
  }
  
  static abstract class f
    extends b<a.a>
  {
    public f(g paramg)
    {
      super();
    }
    
    public a.a a(final Status paramStatus)
    {
      new a.a()
      {
        public Status a()
        {
          return paramStatus;
        }
        
        public ApplicationMetadata b()
        {
          return null;
        }
        
        public String c()
        {
          return null;
        }
        
        public String d()
        {
          return null;
        }
        
        public boolean e()
        {
          return false;
        }
      };
    }
    
    public void a(e parame) {}
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/cast/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */