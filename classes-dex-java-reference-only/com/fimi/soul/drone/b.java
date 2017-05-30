package com.fimi.soul.drone;

import android.os.Handler;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

public class b
  extends e
{
  private final ConcurrentLinkedQueue<d.a> b = new ConcurrentLinkedQueue();
  private final Handler c;
  private final Runnable d = new Runnable()
  {
    public void run()
    {
      do
      {
        b.a(b.this).removeCallbacks(this);
        d.a locala = (d.a)b.b(b.this).poll();
        if ((locala != null) && (!b.c(b.this).isEmpty()))
        {
          Iterator localIterator = b.c(b.this).iterator();
          while (localIterator.hasNext()) {
            ((d.b)localIterator.next()).onDroneEvent(locala, b.this.a);
          }
        }
      } while (!b.b(b.this).isEmpty());
    }
  };
  private final ConcurrentLinkedQueue<d.b> e = new ConcurrentLinkedQueue();
  
  public b(a parama, Handler paramHandler)
  {
    super(parama);
    this.c = paramHandler;
  }
  
  public void a(d.a parama)
  {
    this.b.offer(parama);
    this.c.post(this.d);
  }
  
  public void a(d.b paramb)
  {
    int j = 1;
    int i;
    if (paramb != null)
    {
      i = 1;
      if (this.e.contains(paramb)) {
        break label40;
      }
    }
    for (;;)
    {
      if ((i & j) != 0) {
        this.e.add(paramb);
      }
      return;
      i = 0;
      break;
      label40:
      j = 0;
    }
  }
  
  public void b(d.b paramb)
  {
    if ((paramb != null) && (this.e.contains(paramb))) {
      this.e.remove(paramb);
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/drone/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */