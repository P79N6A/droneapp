package com.android.volley;

import android.os.Process;
import java.util.concurrent.BlockingQueue;

public class c
  extends Thread
{
  private static final boolean a = v.b;
  private final BlockingQueue<n<?>> b;
  private final BlockingQueue<n<?>> c;
  private final b d;
  private final q e;
  private volatile boolean f = false;
  
  public c(BlockingQueue<n<?>> paramBlockingQueue1, BlockingQueue<n<?>> paramBlockingQueue2, b paramb, q paramq)
  {
    this.b = paramBlockingQueue1;
    this.c = paramBlockingQueue2;
    this.d = paramb;
    this.e = paramq;
  }
  
  public void a()
  {
    this.f = true;
    interrupt();
  }
  
  public void run()
  {
    if (a) {
      v.a("start new dispatcher", new Object[0]);
    }
    Process.setThreadPriority(10);
    this.d.a();
    for (;;)
    {
      try
      {
        n localn = (n)this.b.take();
        try
        {
          localn.a("cache-queue-take");
          if (!localn.m()) {
            break label94;
          }
          localn.b("cache-discard-canceled");
        }
        catch (Exception localException)
        {
          v.a(localException, "Unhandled exception %s", new Object[] { localException.toString() });
        }
        continue;
        if (!this.f) {
          continue;
        }
      }
      catch (InterruptedException localInterruptedException) {}
      return;
      label94:
      b.a locala = this.d.a(localInterruptedException.j());
      if (locala == null)
      {
        localInterruptedException.a("cache-miss");
        this.c.put(localInterruptedException);
      }
      else if (locala.a())
      {
        localInterruptedException.a("cache-hit-expired");
        localInterruptedException.a(locala);
        this.c.put(localInterruptedException);
      }
      else
      {
        localInterruptedException.a("cache-hit");
        p localp = localInterruptedException.a(new j(locala.a, locala.g));
        localInterruptedException.a("cache-hit-parsed");
        if (!locala.b())
        {
          this.e.a(localInterruptedException, localp);
        }
        else
        {
          localInterruptedException.a("cache-hit-refresh-needed");
          localInterruptedException.a(locala);
          localp.d = true;
          this.e.a(localInterruptedException, localp, new Runnable()
          {
            public void run()
            {
              try
              {
                c.a(c.this).put(localInterruptedException);
                return;
              }
              catch (InterruptedException localInterruptedException) {}
            }
          });
        }
      }
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/android/volley/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */