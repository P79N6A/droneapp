package com.android.volley;

import android.os.Handler;
import java.util.concurrent.Executor;

public class e
  implements q
{
  private final Executor a;
  
  public e(final Handler paramHandler)
  {
    this.a = new Executor()
    {
      public void execute(Runnable paramAnonymousRunnable)
      {
        paramHandler.post(paramAnonymousRunnable);
      }
    };
  }
  
  public e(Executor paramExecutor)
  {
    this.a = paramExecutor;
  }
  
  public void a(n<?> paramn, p<?> paramp)
  {
    a(paramn, paramp, null);
  }
  
  public void a(n<?> paramn, p<?> paramp, Runnable paramRunnable)
  {
    paramn.A();
    paramn.a("post-response");
    this.a.execute(new a(paramn, paramp, paramRunnable));
  }
  
  public void a(n<?> paramn, u paramu)
  {
    paramn.a("post-error");
    paramu = p.a(paramu);
    this.a.execute(new a(paramn, paramu, null));
  }
  
  private class a
    implements Runnable
  {
    private final n b;
    private final p c;
    private final Runnable d;
    
    public a(n paramn, p paramp, Runnable paramRunnable)
    {
      this.b = paramn;
      this.c = paramp;
      this.d = paramRunnable;
    }
    
    public void run()
    {
      if (this.b.m()) {
        this.b.b("canceled-at-delivery");
      }
      label97:
      label107:
      for (;;)
      {
        return;
        if (this.c.a())
        {
          this.b.b(this.c.a);
          if (!this.c.d) {
            break label97;
          }
          this.b.a("intermediate-response");
        }
        for (;;)
        {
          if (this.d == null) {
            break label107;
          }
          this.d.run();
          return;
          this.b.b(this.c.c);
          break;
          this.b.b("done");
        }
      }
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/android/volley/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */