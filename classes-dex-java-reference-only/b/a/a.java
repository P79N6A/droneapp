package b.a;

import b.b.i;
import b.b.j;
import b.b.m;
import b.b.n;

public class a
  extends n
{
  private volatile int a;
  
  public a() {}
  
  public a(Class<? extends j> paramClass)
  {
    super(paramClass);
  }
  
  public a(Class<? extends j> paramClass, String paramString)
  {
    super(paramClass, paramString);
  }
  
  public a(String paramString)
  {
    super(paramString);
  }
  
  public void a(final i parami, final m paramm)
  {
    new Thread()
    {
      public void run()
      {
        try
        {
          parami.a(paramm);
          return;
        }
        finally
        {
          a.this.b();
        }
      }
    }.start();
  }
  
  public void a(m paramm)
  {
    this.a = 0;
    super.a(paramm);
    u_();
  }
  
  public void b()
  {
    try
    {
      this.a += 1;
      notifyAll();
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  void u_()
  {
    try
    {
      for (;;)
      {
        int i = this.a;
        int j = d();
        if (i < j) {
          try
          {
            wait();
          }
          catch (InterruptedException localInterruptedException) {}
        }
      }
      return;
    }
    finally {}
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/b/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */