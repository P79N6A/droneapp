package com.google.android.gms.common.api;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.support.v4.util.ArrayMap;
import android.view.View;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.b;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.common.internal.s.a;
import com.google.android.gms.internal.ahj;
import com.google.android.gms.internal.ahl.a;
import com.google.android.gms.internal.aho;
import com.google.android.gms.internal.ahy;
import com.google.android.gms.internal.aih;
import com.google.android.gms.internal.ail;
import com.google.android.gms.internal.ait;
import com.google.android.gms.internal.aiw;
import com.google.android.gms.internal.aoj;
import com.google.android.gms.internal.aok;
import com.google.android.gms.internal.aom;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public abstract class g
{
  public static final int a = 1;
  public static final int b = 2;
  private static final Set<g> c = Collections.newSetFromMap(new WeakHashMap());
  
  public static Set<g> a()
  {
    synchronized (c)
    {
      Set localSet2 = c;
      return localSet2;
    }
  }
  
  public static void a(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    synchronized (c)
    {
      String str = String.valueOf(paramString).concat("  ");
      Iterator localIterator = c.iterator();
      int i = 0;
      while (localIterator.hasNext())
      {
        g localg = (g)localIterator.next();
        paramPrintWriter.append(paramString).append("GoogleApiClient#").println(i);
        localg.b(str, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
        i += 1;
      }
      return;
    }
  }
  
  public abstract ConnectionResult a(long paramLong, @NonNull TimeUnit paramTimeUnit);
  
  @NonNull
  public <C extends a.f> C a(@NonNull a.d<C> paramd)
  {
    throw new UnsupportedOperationException();
  }
  
  public <A extends a.c, R extends m, T extends ahl.a<R, A>> T a(@NonNull T paramT)
  {
    throw new UnsupportedOperationException();
  }
  
  public <L> ail<L> a(@NonNull L paramL)
  {
    throw new UnsupportedOperationException();
  }
  
  public void a(int paramInt)
  {
    throw new UnsupportedOperationException();
  }
  
  public abstract void a(@NonNull FragmentActivity paramFragmentActivity);
  
  public abstract void a(@NonNull b paramb);
  
  public abstract void a(@NonNull c paramc);
  
  public void a(aiw paramaiw)
  {
    throw new UnsupportedOperationException();
  }
  
  public boolean a(@NonNull a<?> parama)
  {
    throw new UnsupportedOperationException();
  }
  
  public boolean a(ait paramait)
  {
    throw new UnsupportedOperationException();
  }
  
  public Context b()
  {
    throw new UnsupportedOperationException();
  }
  
  public <A extends a.c, T extends ahl.a<? extends m, A>> T b(@NonNull T paramT)
  {
    throw new UnsupportedOperationException();
  }
  
  public void b(aiw paramaiw)
  {
    throw new UnsupportedOperationException();
  }
  
  public abstract void b(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString);
  
  public abstract boolean b(@NonNull a<?> parama);
  
  public abstract boolean b(@NonNull b paramb);
  
  public abstract boolean b(@NonNull c paramc);
  
  public Looper c()
  {
    throw new UnsupportedOperationException();
  }
  
  @NonNull
  public abstract ConnectionResult c(@NonNull a<?> parama);
  
  public abstract void c(@NonNull b paramb);
  
  public abstract void c(@NonNull c paramc);
  
  public void d()
  {
    throw new UnsupportedOperationException();
  }
  
  public abstract void e();
  
  public abstract ConnectionResult f();
  
  public abstract void g();
  
  public abstract void h();
  
  public abstract i<Status> i();
  
  public abstract boolean j();
  
  public abstract boolean k();
  
  public static final class a
  {
    private Account a;
    private final Set<Scope> b = new HashSet();
    private final Set<Scope> c = new HashSet();
    private int d;
    private View e;
    private String f;
    private String g;
    private final Map<a<?>, s.a> h = new ArrayMap();
    private final Context i;
    private final Map<a<?>, a.a> j = new ArrayMap();
    private aih k;
    private int l = -1;
    private g.c m;
    private Looper n;
    private b o = b.a();
    private a.b<? extends aok, aom> p = aoj.c;
    private final ArrayList<g.b> q = new ArrayList();
    private final ArrayList<g.c> r = new ArrayList();
    
    public a(@NonNull Context paramContext)
    {
      this.i = paramContext;
      this.n = paramContext.getMainLooper();
      this.f = paramContext.getPackageName();
      this.g = paramContext.getClass().getName();
    }
    
    public a(@NonNull Context paramContext, @NonNull g.b paramb, @NonNull g.c paramc)
    {
      this(paramContext);
      d.a(paramb, "Must provide a connected listener");
      this.q.add(paramb);
      d.a(paramc, "Must provide a connection failed listener");
      this.r.add(paramc);
    }
    
    private static <C extends a.f, O> C a(a.b<C, O> paramb, Object paramObject, Context paramContext, Looper paramLooper, s params, g.b paramb1, g.c paramc)
    {
      return paramb.a(paramContext, paramLooper, params, paramObject, paramb1, paramc);
    }
    
    private a a(@NonNull aih paramaih, int paramInt, @Nullable g.c paramc)
    {
      if (paramInt >= 0) {}
      for (boolean bool = true;; bool = false)
      {
        d.b(bool, "clientId must be non-negative");
        this.l = paramInt;
        this.m = paramc;
        this.k = paramaih;
        return this;
      }
    }
    
    private static <C extends a.h, O> com.google.android.gms.common.internal.i a(a.i<C, O> parami, Object paramObject, Context paramContext, Looper paramLooper, s params, g.b paramb, g.c paramc)
    {
      return new com.google.android.gms.common.internal.i(paramContext, paramLooper, parami.b(), paramb, paramc, params, parami.b(paramObject));
    }
    
    private <O extends a.a> void a(a<O> parama, O paramO, int paramInt, Scope... paramVarArgs)
    {
      boolean bool = true;
      int i1 = 0;
      if (paramInt == 1) {}
      for (;;)
      {
        paramO = new HashSet(parama.a().a(paramO));
        int i2 = paramVarArgs.length;
        paramInt = i1;
        while (paramInt < i2)
        {
          paramO.add(paramVarArgs[paramInt]);
          paramInt += 1;
        }
        if (paramInt != 2) {
          break;
        }
        bool = false;
      }
      throw new IllegalArgumentException(90 + "Invalid resolution mode: '" + paramInt + "', use a constant from GoogleApiClient.ResolutionMode");
      this.h.put(parama, new s.a(paramO, bool));
    }
    
    private void a(g paramg)
    {
      ahj.a(this.k).a(this.l, paramg, this.m);
    }
    
    private g d()
    {
      s locals = b();
      Object localObject2 = null;
      Map localMap = locals.g();
      ArrayMap localArrayMap1 = new ArrayMap();
      ArrayMap localArrayMap2 = new ArrayMap();
      ArrayList localArrayList = new ArrayList();
      Iterator localIterator = this.j.keySet().iterator();
      Object localObject1 = null;
      a locala;
      Object localObject3;
      int i1;
      label130:
      aho localaho;
      Object localObject4;
      if (localIterator.hasNext())
      {
        locala = (a)localIterator.next();
        localObject3 = this.j.get(locala);
        i1 = 0;
        if (localMap.get(locala) != null)
        {
          if (((s.a)localMap.get(locala)).b) {
            i1 = 1;
          }
        }
        else
        {
          localArrayMap1.put(locala, Integer.valueOf(i1));
          localaho = new aho(locala, i1);
          localArrayList.add(localaho);
          if (!locala.e()) {
            break label324;
          }
          localObject4 = locala.c();
          if (((a.i)localObject4).a() != 1) {
            break label590;
          }
          localObject1 = locala;
        }
      }
      label214:
      label324:
      label373:
      label582:
      label587:
      label590:
      for (;;)
      {
        localObject3 = a((a.i)localObject4, localObject3, this.i, this.n, locals, localaho, localaho);
        localArrayMap2.put(locala.d(), localObject3);
        if (((a.f)localObject3).h_())
        {
          localObject3 = locala;
          if (localObject2 == null) {
            break label373;
          }
          localObject1 = String.valueOf(locala.f());
          localObject2 = String.valueOf(((a)localObject2).f());
          throw new IllegalStateException(String.valueOf(localObject1).length() + 21 + String.valueOf(localObject2).length() + (String)localObject1 + " cannot be used with " + (String)localObject2);
          i1 = 2;
          break label130;
          localObject4 = locala.b();
          if (((a.b)localObject4).a() != 1) {
            break label587;
          }
          localObject1 = locala;
        }
        for (;;)
        {
          localObject3 = a((a.b)localObject4, localObject3, this.i, this.n, locals, localaho, localaho);
          break label214;
          localObject3 = localObject2;
          localObject2 = localObject3;
          break;
          if (localObject2 != null)
          {
            if (localObject1 != null)
            {
              localObject2 = String.valueOf(((a)localObject2).f());
              localObject1 = String.valueOf(((a)localObject1).f());
              throw new IllegalStateException(String.valueOf(localObject2).length() + 21 + String.valueOf(localObject1).length() + (String)localObject2 + " cannot be used with " + (String)localObject1);
            }
            if (this.a != null) {
              break label582;
            }
          }
          for (boolean bool = true;; bool = false)
          {
            d.a(bool, "Must not set an account in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead", new Object[] { ((a)localObject2).f() });
            d.a(this.b.equals(this.c), "Must not set scopes in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead.", new Object[] { ((a)localObject2).f() });
            i1 = ahy.a(localArrayMap2.values(), true);
            return new ahy(this.i, new ReentrantLock(), this.n, locals, this.o, this.p, localArrayMap1, this.q, this.r, localArrayMap2, this.l, i1, localArrayList);
          }
        }
      }
    }
    
    public a a()
    {
      return a("<<default account>>");
    }
    
    public a a(int paramInt)
    {
      this.d = paramInt;
      return this;
    }
    
    public a a(@NonNull Handler paramHandler)
    {
      d.a(paramHandler, "Handler must not be null");
      this.n = paramHandler.getLooper();
      return this;
    }
    
    public a a(@NonNull FragmentActivity paramFragmentActivity, int paramInt, @Nullable g.c paramc)
    {
      return a(new aih(paramFragmentActivity), paramInt, paramc);
    }
    
    public a a(@NonNull FragmentActivity paramFragmentActivity, @Nullable g.c paramc)
    {
      return a(paramFragmentActivity, 0, paramc);
    }
    
    public a a(@NonNull View paramView)
    {
      d.a(paramView, "View must not be null");
      this.e = paramView;
      return this;
    }
    
    public a a(@NonNull Scope paramScope)
    {
      d.a(paramScope, "Scope must not be null");
      this.b.add(paramScope);
      return this;
    }
    
    public a a(@NonNull a<? extends a.a.c> parama)
    {
      d.a(parama, "Api must not be null");
      this.j.put(parama, null);
      parama = parama.a().a(null);
      this.c.addAll(parama);
      this.b.addAll(parama);
      return this;
    }
    
    public <O extends a.a.a> a a(@NonNull a<O> parama, @NonNull O paramO)
    {
      d.a(parama, "Api must not be null");
      d.a(paramO, "Null options are not permitted for this Api");
      this.j.put(parama, paramO);
      parama = parama.a().a(paramO);
      this.c.addAll(parama);
      this.b.addAll(parama);
      return this;
    }
    
    public <O extends a.a.a> a a(@NonNull a<O> parama, @NonNull O paramO, Scope... paramVarArgs)
    {
      d.a(parama, "Api must not be null");
      d.a(paramO, "Null options are not permitted for this Api");
      this.j.put(parama, paramO);
      a(parama, paramO, 1, paramVarArgs);
      return this;
    }
    
    public a a(@NonNull a<? extends a.a.c> parama, Scope... paramVarArgs)
    {
      d.a(parama, "Api must not be null");
      this.j.put(parama, null);
      a(parama, null, 1, paramVarArgs);
      return this;
    }
    
    public a a(@NonNull g.b paramb)
    {
      d.a(paramb, "Listener must not be null");
      this.q.add(paramb);
      return this;
    }
    
    public a a(@NonNull g.c paramc)
    {
      d.a(paramc, "Listener must not be null");
      this.r.add(paramc);
      return this;
    }
    
    public a a(String paramString)
    {
      if (paramString == null) {}
      for (paramString = null;; paramString = new Account(paramString, "com.google"))
      {
        this.a = paramString;
        return this;
      }
    }
    
    public s b()
    {
      aom localaom = aom.a;
      if (this.j.containsKey(aoj.g)) {
        localaom = (aom)this.j.get(aoj.g);
      }
      return new s(this.a, this.b, this.h, this.d, this.e, this.f, this.g, localaom);
    }
    
    public g c()
    {
      boolean bool;
      if (!this.j.isEmpty()) {
        bool = true;
      }
      for (;;)
      {
        d.b(bool, "must call addApi() to add at least one API");
        g localg = d();
        synchronized (g.l())
        {
          g.l().add(localg);
          if (this.l >= 0) {
            a(localg);
          }
          return localg;
          bool = false;
        }
      }
    }
  }
  
  public static abstract interface b
  {
    public static final int b = 1;
    public static final int c = 2;
    
    public abstract void a(int paramInt);
    
    public abstract void a(@Nullable Bundle paramBundle);
  }
  
  public static abstract interface c
  {
    public abstract void a(@NonNull ConnectionResult paramConnectionResult);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/common/api/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */