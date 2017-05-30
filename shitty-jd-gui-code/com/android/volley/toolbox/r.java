package com.android.volley.toolbox;

import com.android.volley.n;
import com.android.volley.p.a;
import com.android.volley.p.b;
import com.android.volley.u;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class r<T>
  implements p.a, p.b<T>, Future<T>
{
  private n<?> a;
  private boolean b = false;
  private T c;
  private u d;
  
  public static <E> r<E> a()
  {
    return new r();
  }
  
  private T a(Long paramLong)
  {
    try
    {
      if (this.d != null) {
        throw new ExecutionException(this.d);
      }
    }
    finally {}
    if (this.b) {}
    for (paramLong = this.c;; paramLong = this.c)
    {
      return paramLong;
      if (paramLong == null) {
        wait(0L);
      }
      while (this.d != null)
      {
        throw new ExecutionException(this.d);
        if (paramLong.longValue() > 0L) {
          wait(paramLong.longValue());
        }
      }
      if (!this.b) {
        throw new TimeoutException();
      }
    }
  }
  
  public void a(n<?> paramn)
  {
    this.a = paramn;
  }
  
  public void a(u paramu)
  {
    try
    {
      this.d = paramu;
      notifyAll();
      return;
    }
    finally
    {
      paramu = finally;
      throw paramu;
    }
  }
  
  public void a(T paramT)
  {
    try
    {
      this.b = true;
      this.c = paramT;
      notifyAll();
      return;
    }
    finally
    {
      paramT = finally;
      throw paramT;
    }
  }
  
  /* Error */
  public boolean cancel(boolean paramBoolean)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_1
    //   2: aload_0
    //   3: monitorenter
    //   4: aload_0
    //   5: getfield 59	com/android/volley/toolbox/r:a	Lcom/android/volley/n;
    //   8: astore_2
    //   9: aload_2
    //   10: ifnonnull +7 -> 17
    //   13: aload_0
    //   14: monitorexit
    //   15: iload_1
    //   16: ireturn
    //   17: aload_0
    //   18: invokevirtual 72	com/android/volley/toolbox/r:isDone	()Z
    //   21: ifne -8 -> 13
    //   24: aload_0
    //   25: getfield 59	com/android/volley/toolbox/r:a	Lcom/android/volley/n;
    //   28: invokevirtual 77	com/android/volley/n:l	()V
    //   31: iconst_1
    //   32: istore_1
    //   33: goto -20 -> 13
    //   36: astore_2
    //   37: aload_0
    //   38: monitorexit
    //   39: aload_2
    //   40: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	41	0	this	r
    //   0	41	1	paramBoolean	boolean
    //   8	2	2	localn	n
    //   36	4	2	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   4	9	36	finally
    //   17	31	36	finally
  }
  
  public T get()
  {
    try
    {
      Object localObject = a(null);
      return (T)localObject;
    }
    catch (TimeoutException localTimeoutException)
    {
      throw new AssertionError(localTimeoutException);
    }
  }
  
  public T get(long paramLong, TimeUnit paramTimeUnit)
  {
    return (T)a(Long.valueOf(TimeUnit.MILLISECONDS.convert(paramLong, paramTimeUnit)));
  }
  
  public boolean isCancelled()
  {
    if (this.a == null) {
      return false;
    }
    return this.a.m();
  }
  
  /* Error */
  public boolean isDone()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 27	com/android/volley/toolbox/r:b	Z
    //   6: ifne +19 -> 25
    //   9: aload_0
    //   10: getfield 35	com/android/volley/toolbox/r:d	Lcom/android/volley/u;
    //   13: ifnonnull +12 -> 25
    //   16: aload_0
    //   17: invokevirtual 108	com/android/volley/toolbox/r:isCancelled	()Z
    //   20: istore_1
    //   21: iload_1
    //   22: ifeq +9 -> 31
    //   25: iconst_1
    //   26: istore_1
    //   27: aload_0
    //   28: monitorexit
    //   29: iload_1
    //   30: ireturn
    //   31: iconst_0
    //   32: istore_1
    //   33: goto -6 -> 27
    //   36: astore_2
    //   37: aload_0
    //   38: monitorexit
    //   39: aload_2
    //   40: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	41	0	this	r
    //   20	13	1	bool	boolean
    //   36	4	2	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	21	36	finally
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/android/volley/toolbox/r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */