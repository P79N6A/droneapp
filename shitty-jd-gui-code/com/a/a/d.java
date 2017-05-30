package com.a.a;

import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public final class d
  extends a
{
  boolean b = false;
  private ArrayList<a> c = new ArrayList();
  private HashMap<a, e> d = new HashMap();
  private ArrayList<e> e = new ArrayList();
  private ArrayList<e> f = new ArrayList();
  private boolean g = true;
  private a h = null;
  private boolean i = false;
  private long j = 0L;
  private q k = null;
  private long l = -1L;
  
  private void o()
  {
    Object localObject1;
    int n;
    int m;
    Object localObject2;
    int i1;
    int i2;
    if (this.g)
    {
      this.f.clear();
      localObject1 = new ArrayList();
      n = this.e.size();
      m = 0;
      while (m < n)
      {
        localObject2 = (e)this.e.get(m);
        if ((((e)localObject2).b == null) || (((e)localObject2).b.size() == 0)) {
          ((ArrayList)localObject1).add(localObject2);
        }
        m += 1;
      }
      localObject2 = new ArrayList();
      while (((ArrayList)localObject1).size() > 0)
      {
        i1 = ((ArrayList)localObject1).size();
        m = 0;
        while (m < i1)
        {
          e locale1 = (e)((ArrayList)localObject1).get(m);
          this.f.add(locale1);
          if (locale1.e != null)
          {
            i2 = locale1.e.size();
            n = 0;
            while (n < i2)
            {
              e locale2 = (e)locale1.e.get(n);
              locale2.d.remove(locale1);
              if (locale2.d.size() == 0) {
                ((ArrayList)localObject2).add(locale2);
              }
              n += 1;
            }
          }
          m += 1;
        }
        ((ArrayList)localObject1).clear();
        ((ArrayList)localObject1).addAll((Collection)localObject2);
        ((ArrayList)localObject2).clear();
      }
      this.g = false;
      if (this.f.size() != this.e.size()) {
        throw new IllegalStateException("Circular dependencies cannot exist in AnimatorSet");
      }
    }
    else
    {
      i1 = this.e.size();
      m = 0;
      while (m < i1)
      {
        localObject1 = (e)this.e.get(m);
        if ((((e)localObject1).b != null) && (((e)localObject1).b.size() > 0))
        {
          i2 = ((e)localObject1).b.size();
          n = 0;
          while (n < i2)
          {
            localObject2 = (c)((e)localObject1).b.get(n);
            if (((e)localObject1).d == null) {
              ((e)localObject1).d = new ArrayList();
            }
            if (!((e)localObject1).d.contains(((c)localObject2).c)) {
              ((e)localObject1).d.add(((c)localObject2).c);
            }
            n += 1;
          }
        }
        ((e)localObject1).f = false;
        m += 1;
      }
    }
  }
  
  public b a(a parama)
  {
    if (parama != null)
    {
      this.g = true;
      return new b(parama);
    }
    return null;
  }
  
  public void a()
  {
    int i1 = 0;
    this.b = false;
    this.i = true;
    o();
    int i2 = this.f.size();
    int m = 0;
    Object localObject2;
    Object localObject3;
    while (m < i2)
    {
      localObject1 = (e)this.f.get(m);
      localObject2 = ((e)localObject1).a.h();
      if ((localObject2 != null) && (((ArrayList)localObject2).size() > 0))
      {
        localObject2 = new ArrayList((Collection)localObject2).iterator();
        while (((Iterator)localObject2).hasNext())
        {
          localObject3 = (a.a)((Iterator)localObject2).next();
          if (((localObject3 instanceof d)) || ((localObject3 instanceof a))) {
            ((e)localObject1).a.b((a.a)localObject3);
          }
        }
      }
      m += 1;
    }
    final Object localObject1 = new ArrayList();
    m = 0;
    int n;
    if (m < i2)
    {
      localObject2 = (e)this.f.get(m);
      if (this.h == null) {
        this.h = new a(this);
      }
      if ((((e)localObject2).b == null) || (((e)localObject2).b.size() == 0)) {
        ((ArrayList)localObject1).add(localObject2);
      }
      for (;;)
      {
        ((e)localObject2).a.a(this.h);
        m += 1;
        break;
        int i3 = ((e)localObject2).b.size();
        n = 0;
        while (n < i3)
        {
          localObject3 = (c)((e)localObject2).b.get(n);
          ((c)localObject3).c.a.a(new d(this, (e)localObject2, ((c)localObject3).d));
          n += 1;
        }
        ((e)localObject2).c = ((ArrayList)((e)localObject2).b.clone());
      }
    }
    if (this.j <= 0L)
    {
      localObject1 = ((ArrayList)localObject1).iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (e)((Iterator)localObject1).next();
        ((e)localObject2).a.a();
        this.c.add(((e)localObject2).a);
      }
    }
    this.k = q.b(new float[] { 0.0F, 1.0F });
    this.k.d(this.j);
    this.k.a(new c()
    {
      boolean a = false;
      
      public void b(a paramAnonymousa)
      {
        if (!this.a)
        {
          int j = localObject1.size();
          int i = 0;
          while (i < j)
          {
            paramAnonymousa = (d.e)localObject1.get(i);
            paramAnonymousa.a.a();
            d.a(d.this).add(paramAnonymousa.a);
            i += 1;
          }
        }
      }
      
      public void c(a paramAnonymousa)
      {
        this.a = true;
      }
    });
    this.k.a();
    if (this.a != null)
    {
      localObject1 = (ArrayList)this.a.clone();
      n = ((ArrayList)localObject1).size();
      m = 0;
      while (m < n)
      {
        ((a.a)((ArrayList)localObject1).get(m)).a(this);
        m += 1;
      }
    }
    if ((this.e.size() == 0) && (this.j == 0L))
    {
      this.i = false;
      if (this.a != null)
      {
        localObject1 = (ArrayList)this.a.clone();
        n = ((ArrayList)localObject1).size();
        m = i1;
        while (m < n)
        {
          ((a.a)((ArrayList)localObject1).get(m)).b(this);
          m += 1;
        }
      }
    }
  }
  
  public void a(long paramLong)
  {
    this.j = paramLong;
  }
  
  public void a(Interpolator paramInterpolator)
  {
    Iterator localIterator = this.e.iterator();
    while (localIterator.hasNext()) {
      ((e)localIterator.next()).a.a(paramInterpolator);
    }
  }
  
  public void a(Object paramObject)
  {
    Iterator localIterator = this.e.iterator();
    while (localIterator.hasNext())
    {
      a locala = ((e)localIterator.next()).a;
      if ((locala instanceof d)) {
        ((d)locala).a(paramObject);
      } else if ((locala instanceof l)) {
        ((l)locala).a(paramObject);
      }
    }
  }
  
  public void a(Collection<a> paramCollection)
  {
    if ((paramCollection != null) && (paramCollection.size() > 0))
    {
      this.g = true;
      a locala = null;
      Iterator localIterator = paramCollection.iterator();
      paramCollection = locala;
      if (localIterator.hasNext())
      {
        locala = (a)localIterator.next();
        if (paramCollection == null) {
          paramCollection = a(locala);
        }
        for (;;)
        {
          break;
          paramCollection.a(locala);
        }
      }
    }
  }
  
  public void a(List<a> paramList)
  {
    if ((paramList != null) && (paramList.size() > 0))
    {
      this.g = true;
      if (paramList.size() != 1) {
        break label44;
      }
      a((a)paramList.get(0));
    }
    for (;;)
    {
      return;
      label44:
      int m = 0;
      while (m < paramList.size() - 1)
      {
        a((a)paramList.get(m)).b((a)paramList.get(m + 1));
        m += 1;
      }
    }
  }
  
  public void a(a... paramVarArgs)
  {
    int m = 1;
    if (paramVarArgs != null)
    {
      this.g = true;
      b localb = a(paramVarArgs[0]);
      while (m < paramVarArgs.length)
      {
        localb.a(paramVarArgs[m]);
        m += 1;
      }
    }
  }
  
  public void b()
  {
    this.b = true;
    Object localObject;
    Iterator localIterator;
    if (g())
    {
      if (this.a == null) {
        break label173;
      }
      localObject = (ArrayList)this.a.clone();
      localIterator = ((ArrayList)localObject).iterator();
      while (localIterator.hasNext()) {
        ((a.a)localIterator.next()).c(this);
      }
    }
    for (;;)
    {
      if ((this.k != null) && (this.k.f())) {
        this.k.b();
      }
      while (localObject != null)
      {
        localObject = ((ArrayList)localObject).iterator();
        while (((Iterator)localObject).hasNext()) {
          ((a.a)((Iterator)localObject).next()).b(this);
        }
        if (this.f.size() > 0)
        {
          localIterator = this.f.iterator();
          while (localIterator.hasNext()) {
            ((e)localIterator.next()).a.b();
          }
        }
      }
      this.i = false;
      return;
      label173:
      localObject = null;
    }
  }
  
  public void b(a... paramVarArgs)
  {
    int m = 0;
    if (paramVarArgs != null)
    {
      this.g = true;
      if (paramVarArgs.length != 1) {
        break label26;
      }
      a(paramVarArgs[0]);
    }
    for (;;)
    {
      return;
      label26:
      while (m < paramVarArgs.length - 1)
      {
        a(paramVarArgs[m]).b(paramVarArgs[(m + 1)]);
        m += 1;
      }
    }
  }
  
  public d c(long paramLong)
  {
    if (paramLong < 0L) {
      throw new IllegalArgumentException("duration must be a value of zero or greater");
    }
    Iterator localIterator = this.e.iterator();
    while (localIterator.hasNext()) {
      ((e)localIterator.next()).a.b(paramLong);
    }
    this.l = paramLong;
    return this;
  }
  
  public void c()
  {
    this.b = true;
    if (g())
    {
      Iterator localIterator;
      if (this.f.size() != this.e.size())
      {
        o();
        localIterator = this.f.iterator();
        while (localIterator.hasNext())
        {
          e locale = (e)localIterator.next();
          if (this.h == null) {
            this.h = new a(this);
          }
          locale.a.a(this.h);
        }
      }
      if (this.k != null) {
        this.k.b();
      }
      if (this.f.size() > 0)
      {
        localIterator = this.f.iterator();
        while (localIterator.hasNext()) {
          ((e)localIterator.next()).a.c();
        }
      }
      if (this.a != null)
      {
        localIterator = ((ArrayList)this.a.clone()).iterator();
        while (localIterator.hasNext()) {
          ((a.a)localIterator.next()).b(this);
        }
      }
      this.i = false;
    }
  }
  
  public long d()
  {
    return this.j;
  }
  
  public long e()
  {
    return this.l;
  }
  
  public boolean f()
  {
    Iterator localIterator = this.e.iterator();
    while (localIterator.hasNext()) {
      if (((e)localIterator.next()).a.f()) {
        return true;
      }
    }
    return false;
  }
  
  public boolean g()
  {
    return this.i;
  }
  
  public void k()
  {
    Iterator localIterator = this.e.iterator();
    while (localIterator.hasNext()) {
      ((e)localIterator.next()).a.k();
    }
  }
  
  public void l()
  {
    Iterator localIterator = this.e.iterator();
    while (localIterator.hasNext()) {
      ((e)localIterator.next()).a.l();
    }
  }
  
  public ArrayList<a> m()
  {
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = this.e.iterator();
    while (localIterator.hasNext()) {
      localArrayList.add(((e)localIterator.next()).a);
    }
    return localArrayList;
  }
  
  public d n()
  {
    d locald = (d)super.j();
    locald.g = true;
    locald.b = false;
    locald.i = false;
    locald.c = new ArrayList();
    locald.d = new HashMap();
    locald.e = new ArrayList();
    locald.f = new ArrayList();
    HashMap localHashMap = new HashMap();
    Object localObject3 = this.e.iterator();
    Object localObject2;
    Object localObject4;
    while (((Iterator)localObject3).hasNext())
    {
      localObject1 = (e)((Iterator)localObject3).next();
      localObject2 = ((e)localObject1).a();
      localHashMap.put(localObject1, localObject2);
      locald.e.add(localObject2);
      locald.d.put(((e)localObject2).a, localObject2);
      ((e)localObject2).b = null;
      ((e)localObject2).c = null;
      ((e)localObject2).e = null;
      ((e)localObject2).d = null;
      localObject4 = ((e)localObject2).a.h();
      if (localObject4 != null)
      {
        Iterator localIterator = ((ArrayList)localObject4).iterator();
        localObject1 = null;
        while (localIterator.hasNext())
        {
          a.a locala = (a.a)localIterator.next();
          if ((locala instanceof a))
          {
            localObject2 = localObject1;
            if (localObject1 == null) {
              localObject2 = new ArrayList();
            }
            ((ArrayList)localObject2).add(locala);
            localObject1 = localObject2;
          }
        }
        if (localObject1 != null)
        {
          localObject1 = ((ArrayList)localObject1).iterator();
          while (((Iterator)localObject1).hasNext()) {
            ((ArrayList)localObject4).remove((a.a)((Iterator)localObject1).next());
          }
        }
      }
    }
    Object localObject1 = this.e.iterator();
    while (((Iterator)localObject1).hasNext())
    {
      localObject3 = (e)((Iterator)localObject1).next();
      localObject2 = (e)localHashMap.get(localObject3);
      if (((e)localObject3).b != null)
      {
        localObject3 = ((e)localObject3).b.iterator();
        while (((Iterator)localObject3).hasNext())
        {
          localObject4 = (c)((Iterator)localObject3).next();
          ((e)localObject2).a(new c((e)localHashMap.get(((c)localObject4).c), ((c)localObject4).d));
        }
      }
    }
    return locald;
  }
  
  private class a
    implements a.a
  {
    private d b;
    
    a(d paramd)
    {
      this.b = paramd;
    }
    
    public void a(a parama) {}
    
    public void b(a parama)
    {
      parama.b(this);
      d.a(d.this).remove(parama);
      ((d.e)d.b(this.b).get(parama)).f = true;
      int j;
      if (!d.this.b)
      {
        parama = d.c(this.b);
        j = parama.size();
        i = 0;
        if (i >= j) {
          break label162;
        }
        if (((d.e)parama.get(i)).f) {}
      }
      label162:
      for (int i = 0;; i = 1)
      {
        if (i != 0)
        {
          if (d.this.a != null)
          {
            parama = (ArrayList)d.this.a.clone();
            j = parama.size();
            i = 0;
            for (;;)
            {
              if (i < j)
              {
                ((a.a)parama.get(i)).b(this.b);
                i += 1;
                continue;
                i += 1;
                break;
              }
            }
          }
          d.a(this.b, false);
        }
        return;
      }
    }
    
    public void c(a parama)
    {
      if ((!d.this.b) && (d.a(d.this).size() == 0) && (d.this.a != null))
      {
        int j = d.this.a.size();
        int i = 0;
        while (i < j)
        {
          ((a.a)d.this.a.get(i)).c(this.b);
          i += 1;
        }
      }
    }
    
    public void d(a parama) {}
  }
  
  public class b
  {
    private d.e b;
    
    b(a parama)
    {
      this.b = ((d.e)d.b(d.this).get(parama));
      if (this.b == null)
      {
        this.b = new d.e(parama);
        d.b(d.this).put(parama, this.b);
        d.d(d.this).add(this.b);
      }
    }
    
    public b a(long paramLong)
    {
      q localq = q.b(new float[] { 0.0F, 1.0F });
      localq.d(paramLong);
      c(localq);
      return this;
    }
    
    public b a(a parama)
    {
      d.e locale2 = (d.e)d.b(d.this).get(parama);
      d.e locale1 = locale2;
      if (locale2 == null)
      {
        locale1 = new d.e(parama);
        d.b(d.this).put(parama, locale1);
        d.d(d.this).add(locale1);
      }
      locale1.a(new d.c(this.b, 0));
      return this;
    }
    
    public b b(a parama)
    {
      d.e locale2 = (d.e)d.b(d.this).get(parama);
      d.e locale1 = locale2;
      if (locale2 == null)
      {
        locale1 = new d.e(parama);
        d.b(d.this).put(parama, locale1);
        d.d(d.this).add(locale1);
      }
      locale1.a(new d.c(this.b, 1));
      return this;
    }
    
    public b c(a parama)
    {
      d.e locale2 = (d.e)d.b(d.this).get(parama);
      d.e locale1 = locale2;
      if (locale2 == null)
      {
        locale1 = new d.e(parama);
        d.b(d.this).put(parama, locale1);
        d.d(d.this).add(locale1);
      }
      parama = new d.c(locale1, 1);
      this.b.a(parama);
      return this;
    }
  }
  
  private static class c
  {
    static final int a = 0;
    static final int b = 1;
    public d.e c;
    public int d;
    
    public c(d.e parame, int paramInt)
    {
      this.c = parame;
      this.d = paramInt;
    }
  }
  
  private static class d
    implements a.a
  {
    private d a;
    private d.e b;
    private int c;
    
    public d(d paramd, d.e parame, int paramInt)
    {
      this.a = paramd;
      this.b = parame;
      this.c = paramInt;
    }
    
    private void e(a parama)
    {
      if (this.a.b) {
        return;
      }
      int j = this.b.c.size();
      int i = 0;
      label24:
      d.c localc;
      if (i < j)
      {
        localc = (d.c)this.b.c.get(i);
        if ((localc.d == this.c) && (localc.c.a == parama)) {
          parama.b(this);
        }
      }
      for (parama = localc;; parama = null)
      {
        this.b.c.remove(parama);
        if (this.b.c.size() != 0) {
          break;
        }
        this.b.a.a();
        d.a(this.a).add(this.b.a);
        return;
        i += 1;
        break label24;
      }
    }
    
    public void a(a parama)
    {
      if (this.c == 0) {
        e(parama);
      }
    }
    
    public void b(a parama)
    {
      if (this.c == 1) {
        e(parama);
      }
    }
    
    public void c(a parama) {}
    
    public void d(a parama) {}
  }
  
  private static class e
    implements Cloneable
  {
    public a a;
    public ArrayList<d.c> b = null;
    public ArrayList<d.c> c = null;
    public ArrayList<e> d = null;
    public ArrayList<e> e = null;
    public boolean f = false;
    
    public e(a parama)
    {
      this.a = parama;
    }
    
    public e a()
    {
      try
      {
        e locale = (e)super.clone();
        locale.a = this.a.j();
        return locale;
      }
      catch (CloneNotSupportedException localCloneNotSupportedException)
      {
        throw new AssertionError();
      }
    }
    
    public void a(d.c paramc)
    {
      if (this.b == null)
      {
        this.b = new ArrayList();
        this.d = new ArrayList();
      }
      this.b.add(paramc);
      if (!this.d.contains(paramc.c)) {
        this.d.add(paramc.c);
      }
      paramc = paramc.c;
      if (paramc.e == null) {
        paramc.e = new ArrayList();
      }
      paramc.e.add(this);
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/a/a/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */