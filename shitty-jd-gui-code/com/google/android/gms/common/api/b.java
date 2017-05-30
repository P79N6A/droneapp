package com.google.android.gms.common.api;

import com.google.android.gms.internal.ahn;
import java.util.ArrayList;
import java.util.List;

public final class b
  extends ahn<c>
{
  private int a;
  private boolean b;
  private boolean c;
  private final i<?>[] d;
  private final Object e = new Object();
  
  private b(List<i<?>> paramList, g paramg)
  {
    super(paramg);
    this.a = paramList.size();
    this.d = new i[this.a];
    if (paramList.isEmpty()) {
      b(new c(Status.a, this.d));
    }
    for (;;)
    {
      return;
      int i = 0;
      while (i < paramList.size())
      {
        paramg = (i)paramList.get(i);
        this.d[i] = paramg;
        paramg.a(new i.a()
        {
          public void a(Status paramAnonymousStatus)
          {
            for (;;)
            {
              synchronized (b.a(b.this))
              {
                if (b.this.e()) {
                  return;
                }
                if (paramAnonymousStatus.g())
                {
                  b.a(b.this, true);
                  b.b(b.this);
                  if (b.c(b.this) == 0)
                  {
                    if (!b.d(b.this)) {
                      break;
                    }
                    b.e(b.this);
                  }
                  return;
                }
              }
              if (!paramAnonymousStatus.f()) {
                b.b(b.this, true);
              }
            }
            if (b.f(b.this)) {}
            for (paramAnonymousStatus = new Status(13);; paramAnonymousStatus = Status.a)
            {
              b.this.b(new c(paramAnonymousStatus, b.g(b.this)));
              break;
            }
          }
        });
        i += 1;
      }
    }
  }
  
  public c a(Status paramStatus)
  {
    return new c(paramStatus, this.d);
  }
  
  public void a()
  {
    super.a();
    i[] arrayOfi = this.d;
    int j = arrayOfi.length;
    int i = 0;
    while (i < j)
    {
      arrayOfi[i].a();
      i += 1;
    }
  }
  
  public static final class a
  {
    private List<i<?>> a = new ArrayList();
    private g b;
    
    public a(g paramg)
    {
      this.b = paramg;
    }
    
    public b a()
    {
      return new b(this.a, this.b, null);
    }
    
    public <R extends m> d<R> a(i<R> parami)
    {
      d locald = new d(this.a.size());
      this.a.add(parami);
      return locald;
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/common/api/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */