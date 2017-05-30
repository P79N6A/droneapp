package com.google.android.gms.cast;

import android.annotation.SuppressLint;
import android.support.annotation.NonNull;
import com.google.android.gms.cast.internal.b;
import com.google.android.gms.cast.internal.e;
import com.google.android.gms.cast.internal.n.a;
import com.google.android.gms.cast.internal.o;
import com.google.android.gms.cast.internal.p;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.m;
import java.io.IOException;
import java.util.Locale;
import org.json.JSONObject;

@SuppressLint({"MissingRemoteException"})
public class g
  implements a.e
{
  public static final String a = com.google.android.gms.cast.internal.n.g;
  public static final int b = 0;
  public static final int c = 1;
  public static final int d = 2;
  public static final int e = 0;
  public static final int f = 2100;
  public static final int g = 2101;
  public static final int h = 2102;
  public static final int i = 2103;
  private final Object j = new Object();
  private final com.google.android.gms.cast.internal.n k;
  private final f l;
  private c m;
  private d n;
  private b o;
  private e p;
  
  public g()
  {
    this(new com.google.android.gms.cast.internal.n(null));
  }
  
  g(com.google.android.gms.cast.internal.n paramn)
  {
    this.k = paramn;
    this.k.a(new n.a()
    {
      public void a()
      {
        g.a(g.this);
      }
      
      public void b()
      {
        g.b(g.this);
      }
      
      public void c()
      {
        g.c(g.this);
      }
      
      public void d()
      {
        g.d(g.this);
      }
    });
    this.l = new f();
    this.k.a(this.l);
  }
  
  private int a(int paramInt)
  {
    MediaStatus localMediaStatus = c();
    int i1 = 0;
    while (i1 < localMediaStatus.q())
    {
      if (localMediaStatus.b(i1).c() == paramInt) {
        return i1;
      }
      i1 += 1;
    }
    return -1;
  }
  
  private void f()
  {
    if (this.p != null) {
      this.p.a();
    }
  }
  
  private void g()
  {
    if (this.o != null) {
      this.o.a();
    }
  }
  
  private void h()
  {
    if (this.n != null) {
      this.n.a();
    }
  }
  
  private void i()
  {
    if (this.m != null) {
      this.m.a();
    }
  }
  
  public long a()
  {
    synchronized (this.j)
    {
      long l1 = this.k.d();
      return l1;
    }
  }
  
  public i<a> a(com.google.android.gms.common.api.g paramg)
  {
    return a(paramg, null);
  }
  
  public i<a> a(com.google.android.gms.common.api.g paramg, double paramDouble)
  {
    return a(paramg, paramDouble, null);
  }
  
  public i<a> a(final com.google.android.gms.common.api.g paramg, final double paramDouble, JSONObject paramJSONObject)
  {
    if ((Double.isInfinite(paramDouble)) || (Double.isNaN(paramDouble))) {
      throw new IllegalArgumentException(41 + "Volume cannot be " + paramDouble);
    }
    paramg.b(new g(paramg)
    {
      /* Error */
      protected void a(e paramAnonymouse)
      {
        // Byte code:
        //   0: aload_0
        //   1: getfield 20	com/google/android/gms/cast/g$14:d	Lcom/google/android/gms/cast/g;
        //   4: invokestatic 41	com/google/android/gms/cast/g:e	(Lcom/google/android/gms/cast/g;)Ljava/lang/Object;
        //   7: astore_1
        //   8: aload_1
        //   9: monitorenter
        //   10: aload_0
        //   11: getfield 20	com/google/android/gms/cast/g$14:d	Lcom/google/android/gms/cast/g;
        //   14: invokestatic 45	com/google/android/gms/cast/g:f	(Lcom/google/android/gms/cast/g;)Lcom/google/android/gms/cast/g$f;
        //   17: aload_0
        //   18: getfield 22	com/google/android/gms/cast/g$14:a	Lcom/google/android/gms/common/api/g;
        //   21: invokevirtual 49	com/google/android/gms/cast/g$f:a	(Lcom/google/android/gms/common/api/g;)V
        //   24: aload_0
        //   25: getfield 20	com/google/android/gms/cast/g$14:d	Lcom/google/android/gms/cast/g;
        //   28: invokestatic 53	com/google/android/gms/cast/g:g	(Lcom/google/android/gms/cast/g;)Lcom/google/android/gms/cast/internal/n;
        //   31: aload_0
        //   32: getfield 57	com/google/android/gms/cast/g$14:h	Lcom/google/android/gms/cast/internal/p;
        //   35: aload_0
        //   36: getfield 24	com/google/android/gms/cast/g$14:b	D
        //   39: aload_0
        //   40: getfield 26	com/google/android/gms/cast/g$14:c	Lorg/json/JSONObject;
        //   43: invokevirtual 62	com/google/android/gms/cast/internal/n:a	(Lcom/google/android/gms/cast/internal/p;DLorg/json/JSONObject;)J
        //   46: pop2
        //   47: aload_0
        //   48: getfield 20	com/google/android/gms/cast/g$14:d	Lcom/google/android/gms/cast/g;
        //   51: invokestatic 45	com/google/android/gms/cast/g:f	(Lcom/google/android/gms/cast/g;)Lcom/google/android/gms/cast/g$f;
        //   54: aconst_null
        //   55: invokevirtual 49	com/google/android/gms/cast/g$f:a	(Lcom/google/android/gms/common/api/g;)V
        //   58: aload_1
        //   59: monitorexit
        //   60: return
        //   61: astore_2
        //   62: aload_0
        //   63: aload_0
        //   64: new 64	com/google/android/gms/common/api/Status
        //   67: dup
        //   68: sipush 2100
        //   71: invokespecial 67	com/google/android/gms/common/api/Status:<init>	(I)V
        //   74: invokevirtual 70	com/google/android/gms/cast/g$g:b	(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/m;
        //   77: checkcast 72	com/google/android/gms/cast/g$a
        //   80: invokevirtual 75	com/google/android/gms/cast/g$14:b	(Lcom/google/android/gms/common/api/m;)V
        //   83: aload_0
        //   84: getfield 20	com/google/android/gms/cast/g$14:d	Lcom/google/android/gms/cast/g;
        //   87: invokestatic 45	com/google/android/gms/cast/g:f	(Lcom/google/android/gms/cast/g;)Lcom/google/android/gms/cast/g$f;
        //   90: aconst_null
        //   91: invokevirtual 49	com/google/android/gms/cast/g$f:a	(Lcom/google/android/gms/common/api/g;)V
        //   94: goto -36 -> 58
        //   97: astore_2
        //   98: aload_1
        //   99: monitorexit
        //   100: aload_2
        //   101: athrow
        //   102: astore_2
        //   103: aload_0
        //   104: getfield 20	com/google/android/gms/cast/g$14:d	Lcom/google/android/gms/cast/g;
        //   107: invokestatic 45	com/google/android/gms/cast/g:f	(Lcom/google/android/gms/cast/g;)Lcom/google/android/gms/cast/g$f;
        //   110: aconst_null
        //   111: invokevirtual 49	com/google/android/gms/cast/g$f:a	(Lcom/google/android/gms/common/api/g;)V
        //   114: aload_2
        //   115: athrow
        //   116: astore_2
        //   117: goto -55 -> 62
        //   120: astore_2
        //   121: goto -59 -> 62
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	124	0	this	14
        //   0	124	1	paramAnonymouse	e
        //   61	1	2	localIllegalStateException	IllegalStateException
        //   97	4	2	localObject1	Object
        //   102	13	2	localObject2	Object
        //   116	1	2	localIOException	IOException
        //   120	1	2	localIllegalArgumentException	IllegalArgumentException
        // Exception table:
        //   from	to	target	type
        //   24	47	61	java/lang/IllegalStateException
        //   10	24	97	finally
        //   47	58	97	finally
        //   58	60	97	finally
        //   83	94	97	finally
        //   98	100	97	finally
        //   103	116	97	finally
        //   24	47	102	finally
        //   62	83	102	finally
        //   24	47	116	java/io/IOException
        //   24	47	120	java/lang/IllegalArgumentException
      }
    });
  }
  
  public i<a> a(final com.google.android.gms.common.api.g paramg, final int paramInt1, final int paramInt2, final JSONObject paramJSONObject)
  {
    paramg.b(new g(paramg)
    {
      protected void a(e arg1)
      {
        int j = 0;
        synchronized (g.e(g.this))
        {
          i = g.a(g.this, paramInt1);
          if (i == -1)
          {
            b((g.a)b(new Status(0)));
            return;
          }
          if (paramInt2 < 0)
          {
            b((g.a)b(new Status(2001, String.format(Locale.ROOT, "Invalid request: Invalid newIndex %d.", new Object[] { Integer.valueOf(paramInt2) }))));
            return;
          }
        }
        if (i == paramInt2)
        {
          b((g.a)b(new Status(0)));
          return;
        }
        if (paramInt2 > i) {}
        for (int i = paramInt2 + 1;; i = paramInt2)
        {
          Object localObject2 = g.this.c().b(i);
          i = j;
          if (localObject2 != null) {
            i = ((MediaQueueItem)localObject2).c();
          }
          g.f(g.this).a(paramg);
          try
          {
            localObject2 = g.g(g.this);
            p localp = this.h;
            j = paramInt1;
            JSONObject localJSONObject = paramJSONObject;
            ((com.google.android.gms.cast.internal.n)localObject2).a(localp, new int[] { j }, i, localJSONObject);
          }
          catch (IOException localIOException)
          {
            for (;;)
            {
              b((g.a)b(new Status(2100)));
              g.f(g.this).a(null);
            }
          }
          finally
          {
            g.f(g.this).a(null);
          }
          return;
        }
      }
    });
  }
  
  public i<a> a(final com.google.android.gms.common.api.g paramg, final int paramInt, final long paramLong, JSONObject paramJSONObject)
  {
    paramg.b(new g(paramg)
    {
      protected void a(e arg1)
      {
        synchronized (g.e(g.this))
        {
          if (g.a(g.this, paramInt) == -1)
          {
            b((g.a)b(new Status(0)));
            return;
          }
          g.f(g.this).a(paramg);
          try
          {
            g.g(g.this).a(this.h, paramInt, paramLong, null, 0, null, this.d);
          }
          catch (IOException localIOException)
          {
            for (;;)
            {
              b((g.a)b(new Status(2100)));
              g.f(g.this).a(null);
            }
          }
          finally
          {
            g.f(g.this).a(null);
          }
          return;
        }
      }
    });
  }
  
  public i<a> a(final com.google.android.gms.common.api.g paramg, final int paramInt, final JSONObject paramJSONObject)
  {
    paramg.b(new g(paramg)
    {
      protected void a(e arg1)
      {
        synchronized (g.e(g.this))
        {
          g.f(g.this).a(paramg);
          try
          {
            g.g(g.this).a(this.h, 0, -1L, null, 0, Integer.valueOf(paramInt), paramJSONObject);
          }
          catch (IOException localIOException)
          {
            for (;;)
            {
              b((g.a)b(new Status(2100)));
              g.f(g.this).a(null);
            }
            localObject1 = finally;
            throw ((Throwable)localObject1);
          }
          finally
          {
            g.f(g.this).a(null);
          }
          return;
        }
      }
    });
  }
  
  public i<a> a(com.google.android.gms.common.api.g paramg, long paramLong)
  {
    return a(paramg, paramLong, 0, null);
  }
  
  public i<a> a(com.google.android.gms.common.api.g paramg, long paramLong, int paramInt)
  {
    return a(paramg, paramLong, paramInt, null);
  }
  
  public i<a> a(final com.google.android.gms.common.api.g paramg, final long paramLong, int paramInt, final JSONObject paramJSONObject)
  {
    paramg.b(new g(paramg)
    {
      protected void a(e arg1)
      {
        synchronized (g.e(g.this))
        {
          g.f(g.this).a(paramg);
          try
          {
            g.g(g.this).a(this.h, paramLong, paramJSONObject, this.d);
          }
          catch (IOException localIOException)
          {
            for (;;)
            {
              b((g.a)b(new Status(2100)));
              g.f(g.this).a(null);
            }
            localObject1 = finally;
            throw ((Throwable)localObject1);
          }
          finally
          {
            g.f(g.this).a(null);
          }
          return;
        }
      }
    });
  }
  
  public i<a> a(com.google.android.gms.common.api.g paramg, MediaInfo paramMediaInfo)
  {
    return a(paramg, paramMediaInfo, true, 0L, null, null);
  }
  
  public i<a> a(com.google.android.gms.common.api.g paramg, MediaInfo paramMediaInfo, boolean paramBoolean)
  {
    return a(paramg, paramMediaInfo, paramBoolean, 0L, null, null);
  }
  
  public i<a> a(com.google.android.gms.common.api.g paramg, MediaInfo paramMediaInfo, boolean paramBoolean, long paramLong)
  {
    return a(paramg, paramMediaInfo, paramBoolean, paramLong, null, null);
  }
  
  public i<a> a(com.google.android.gms.common.api.g paramg, MediaInfo paramMediaInfo, boolean paramBoolean, long paramLong, JSONObject paramJSONObject)
  {
    return a(paramg, paramMediaInfo, paramBoolean, paramLong, null, paramJSONObject);
  }
  
  public i<a> a(final com.google.android.gms.common.api.g paramg, final MediaInfo paramMediaInfo, final boolean paramBoolean, final long paramLong, long[] paramArrayOfLong, final JSONObject paramJSONObject)
  {
    paramg.b(new g(paramg)
    {
      protected void a(e arg1)
      {
        synchronized (g.e(g.this))
        {
          g.f(g.this).a(paramg);
          try
          {
            g.g(g.this).a(this.h, paramMediaInfo, paramBoolean, paramLong, paramJSONObject, this.f);
          }
          catch (IOException localIOException)
          {
            for (;;)
            {
              b((g.a)b(new Status(2100)));
              g.f(g.this).a(null);
            }
            localObject1 = finally;
            throw ((Throwable)localObject1);
          }
          finally
          {
            g.f(g.this).a(null);
          }
          return;
        }
      }
    });
  }
  
  public i<a> a(final com.google.android.gms.common.api.g paramg, final MediaQueueItem paramMediaQueueItem, final int paramInt, final long paramLong, JSONObject paramJSONObject)
  {
    paramg.b(new g(paramg)
    {
      protected void a(e arg1)
      {
        synchronized (g.e(g.this))
        {
          g.f(g.this).a(paramg);
          try
          {
            com.google.android.gms.cast.internal.n localn = g.g(g.this);
            p localp = this.h;
            MediaQueueItem localMediaQueueItem = paramMediaQueueItem;
            int i = paramInt;
            long l = paramLong;
            JSONObject localJSONObject = this.e;
            localn.a(localp, new MediaQueueItem[] { localMediaQueueItem }, i, 0, 0, l, localJSONObject);
          }
          catch (IOException localIOException)
          {
            for (;;)
            {
              b((g.a)b(new Status(2100)));
              g.f(g.this).a(null);
            }
            localObject1 = finally;
            throw ((Throwable)localObject1);
          }
          finally
          {
            g.f(g.this).a(null);
          }
          return;
        }
      }
    });
  }
  
  public i<a> a(com.google.android.gms.common.api.g paramg, MediaQueueItem paramMediaQueueItem, int paramInt, JSONObject paramJSONObject)
  {
    return a(paramg, paramMediaQueueItem, paramInt, -1L, paramJSONObject);
  }
  
  public i<a> a(com.google.android.gms.common.api.g paramg, MediaQueueItem paramMediaQueueItem, JSONObject paramJSONObject)
  {
    return a(paramg, new MediaQueueItem[] { paramMediaQueueItem }, 0, paramJSONObject);
  }
  
  public i<a> a(final com.google.android.gms.common.api.g paramg, final TextTrackStyle paramTextTrackStyle)
  {
    if (paramTextTrackStyle == null) {
      throw new IllegalArgumentException("trackStyle cannot be null");
    }
    paramg.b(new g(paramg)
    {
      protected void a(e arg1)
      {
        synchronized (g.e(g.this))
        {
          g.f(g.this).a(paramg);
          try
          {
            g.g(g.this).a(this.h, paramTextTrackStyle);
          }
          catch (IOException localIOException)
          {
            for (;;)
            {
              b((g.a)b(new Status(2100)));
              g.f(g.this).a(null);
            }
            localObject1 = finally;
            throw ((Throwable)localObject1);
          }
          finally
          {
            g.f(g.this).a(null);
          }
          return;
        }
      }
    });
  }
  
  public i<a> a(final com.google.android.gms.common.api.g paramg, final JSONObject paramJSONObject)
  {
    paramg.b(new g(paramg)
    {
      protected void a(e arg1)
      {
        synchronized (g.e(g.this))
        {
          g.f(g.this).a(paramg);
          try
          {
            g.g(g.this).a(this.h, paramJSONObject);
          }
          catch (IOException localIOException)
          {
            for (;;)
            {
              b((g.a)b(new Status(2100)));
              g.f(g.this).a(null);
            }
            localObject1 = finally;
            throw ((Throwable)localObject1);
          }
          finally
          {
            g.f(g.this).a(null);
          }
          return;
        }
      }
    });
  }
  
  public i<a> a(com.google.android.gms.common.api.g paramg, boolean paramBoolean)
  {
    return a(paramg, paramBoolean, null);
  }
  
  public i<a> a(final com.google.android.gms.common.api.g paramg, final boolean paramBoolean, final JSONObject paramJSONObject)
  {
    paramg.b(new g(paramg)
    {
      /* Error */
      protected void a(e paramAnonymouse)
      {
        // Byte code:
        //   0: aload_0
        //   1: getfield 20	com/google/android/gms/cast/g$15:d	Lcom/google/android/gms/cast/g;
        //   4: invokestatic 39	com/google/android/gms/cast/g:e	(Lcom/google/android/gms/cast/g;)Ljava/lang/Object;
        //   7: astore_1
        //   8: aload_1
        //   9: monitorenter
        //   10: aload_0
        //   11: getfield 20	com/google/android/gms/cast/g$15:d	Lcom/google/android/gms/cast/g;
        //   14: invokestatic 43	com/google/android/gms/cast/g:f	(Lcom/google/android/gms/cast/g;)Lcom/google/android/gms/cast/g$f;
        //   17: aload_0
        //   18: getfield 22	com/google/android/gms/cast/g$15:a	Lcom/google/android/gms/common/api/g;
        //   21: invokevirtual 47	com/google/android/gms/cast/g$f:a	(Lcom/google/android/gms/common/api/g;)V
        //   24: aload_0
        //   25: getfield 20	com/google/android/gms/cast/g$15:d	Lcom/google/android/gms/cast/g;
        //   28: invokestatic 51	com/google/android/gms/cast/g:g	(Lcom/google/android/gms/cast/g;)Lcom/google/android/gms/cast/internal/n;
        //   31: aload_0
        //   32: getfield 55	com/google/android/gms/cast/g$15:h	Lcom/google/android/gms/cast/internal/p;
        //   35: aload_0
        //   36: getfield 24	com/google/android/gms/cast/g$15:b	Z
        //   39: aload_0
        //   40: getfield 26	com/google/android/gms/cast/g$15:c	Lorg/json/JSONObject;
        //   43: invokevirtual 60	com/google/android/gms/cast/internal/n:a	(Lcom/google/android/gms/cast/internal/p;ZLorg/json/JSONObject;)J
        //   46: pop2
        //   47: aload_0
        //   48: getfield 20	com/google/android/gms/cast/g$15:d	Lcom/google/android/gms/cast/g;
        //   51: invokestatic 43	com/google/android/gms/cast/g:f	(Lcom/google/android/gms/cast/g;)Lcom/google/android/gms/cast/g$f;
        //   54: aconst_null
        //   55: invokevirtual 47	com/google/android/gms/cast/g$f:a	(Lcom/google/android/gms/common/api/g;)V
        //   58: aload_1
        //   59: monitorexit
        //   60: return
        //   61: astore_2
        //   62: aload_0
        //   63: aload_0
        //   64: new 62	com/google/android/gms/common/api/Status
        //   67: dup
        //   68: sipush 2100
        //   71: invokespecial 65	com/google/android/gms/common/api/Status:<init>	(I)V
        //   74: invokevirtual 68	com/google/android/gms/cast/g$g:b	(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/m;
        //   77: checkcast 70	com/google/android/gms/cast/g$a
        //   80: invokevirtual 73	com/google/android/gms/cast/g$15:b	(Lcom/google/android/gms/common/api/m;)V
        //   83: aload_0
        //   84: getfield 20	com/google/android/gms/cast/g$15:d	Lcom/google/android/gms/cast/g;
        //   87: invokestatic 43	com/google/android/gms/cast/g:f	(Lcom/google/android/gms/cast/g;)Lcom/google/android/gms/cast/g$f;
        //   90: aconst_null
        //   91: invokevirtual 47	com/google/android/gms/cast/g$f:a	(Lcom/google/android/gms/common/api/g;)V
        //   94: goto -36 -> 58
        //   97: astore_2
        //   98: aload_1
        //   99: monitorexit
        //   100: aload_2
        //   101: athrow
        //   102: astore_2
        //   103: aload_0
        //   104: getfield 20	com/google/android/gms/cast/g$15:d	Lcom/google/android/gms/cast/g;
        //   107: invokestatic 43	com/google/android/gms/cast/g:f	(Lcom/google/android/gms/cast/g;)Lcom/google/android/gms/cast/g$f;
        //   110: aconst_null
        //   111: invokevirtual 47	com/google/android/gms/cast/g$f:a	(Lcom/google/android/gms/common/api/g;)V
        //   114: aload_2
        //   115: athrow
        //   116: astore_2
        //   117: goto -55 -> 62
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	120	0	this	15
        //   0	120	1	paramAnonymouse	e
        //   61	1	2	localIllegalStateException	IllegalStateException
        //   97	4	2	localObject1	Object
        //   102	13	2	localObject2	Object
        //   116	1	2	localIOException	IOException
        // Exception table:
        //   from	to	target	type
        //   24	47	61	java/lang/IllegalStateException
        //   10	24	97	finally
        //   47	58	97	finally
        //   58	60	97	finally
        //   83	94	97	finally
        //   98	100	97	finally
        //   103	116	97	finally
        //   24	47	102	finally
        //   62	83	102	finally
        //   24	47	116	java/io/IOException
      }
    });
  }
  
  public i<a> a(final com.google.android.gms.common.api.g paramg, final int[] paramArrayOfInt, final int paramInt, final JSONObject paramJSONObject)
  {
    paramg.b(new g(paramg)
    {
      protected void a(e arg1)
      {
        synchronized (g.e(g.this))
        {
          g.f(g.this).a(paramg);
          try
          {
            g.g(g.this).a(this.h, paramArrayOfInt, paramInt, paramJSONObject);
          }
          catch (IOException localIOException)
          {
            for (;;)
            {
              b((g.a)b(new Status(2100)));
              g.f(g.this).a(null);
            }
            localObject1 = finally;
            throw ((Throwable)localObject1);
          }
          finally
          {
            g.f(g.this).a(null);
          }
          return;
        }
      }
    });
  }
  
  public i<a> a(final com.google.android.gms.common.api.g paramg, final int[] paramArrayOfInt, final JSONObject paramJSONObject)
  {
    paramg.b(new g(paramg)
    {
      protected void a(e arg1)
      {
        synchronized (g.e(g.this))
        {
          g.f(g.this).a(paramg);
          try
          {
            g.g(g.this).a(this.h, paramArrayOfInt, paramJSONObject);
          }
          catch (IOException localIOException)
          {
            for (;;)
            {
              b((g.a)b(new Status(2100)));
              g.f(g.this).a(null);
            }
            localObject1 = finally;
            throw ((Throwable)localObject1);
          }
          finally
          {
            g.f(g.this).a(null);
          }
          return;
        }
      }
    });
  }
  
  public i<a> a(final com.google.android.gms.common.api.g paramg, final long[] paramArrayOfLong)
  {
    if (paramArrayOfLong == null) {
      throw new IllegalArgumentException("trackIds cannot be null");
    }
    paramg.b(new g(paramg)
    {
      protected void a(e arg1)
      {
        synchronized (g.e(g.this))
        {
          g.f(g.this).a(paramg);
          try
          {
            g.g(g.this).a(this.h, paramArrayOfLong);
          }
          catch (IOException localIOException)
          {
            for (;;)
            {
              b((g.a)b(new Status(2100)));
              g.f(g.this).a(null);
            }
            localObject1 = finally;
            throw ((Throwable)localObject1);
          }
          finally
          {
            g.f(g.this).a(null);
          }
          return;
        }
      }
    });
  }
  
  public i<a> a(final com.google.android.gms.common.api.g paramg, final MediaQueueItem[] paramArrayOfMediaQueueItem, final int paramInt1, final int paramInt2, final long paramLong, JSONObject paramJSONObject)
  {
    paramg.b(new g(paramg)
    {
      protected void a(e arg1)
      {
        synchronized (g.e(g.this))
        {
          g.f(g.this).a(paramg);
          try
          {
            g.g(g.this).a(this.h, paramArrayOfMediaQueueItem, paramInt1, paramInt2, paramLong, this.f);
          }
          catch (IOException localIOException)
          {
            for (;;)
            {
              b((g.a)b(new Status(2100)));
              g.f(g.this).a(null);
            }
            localObject1 = finally;
            throw ((Throwable)localObject1);
          }
          finally
          {
            g.f(g.this).a(null);
          }
          return;
        }
      }
    });
  }
  
  public i<a> a(com.google.android.gms.common.api.g paramg, MediaQueueItem[] paramArrayOfMediaQueueItem, int paramInt1, int paramInt2, JSONObject paramJSONObject)
  {
    return a(paramg, paramArrayOfMediaQueueItem, paramInt1, paramInt2, -1L, paramJSONObject);
  }
  
  public i<a> a(final com.google.android.gms.common.api.g paramg, final MediaQueueItem[] paramArrayOfMediaQueueItem, final int paramInt, final JSONObject paramJSONObject)
  {
    paramg.b(new g(paramg)
    {
      protected void a(e arg1)
      {
        synchronized (g.e(g.this))
        {
          g.f(g.this).a(paramg);
          try
          {
            g.g(g.this).a(this.h, paramArrayOfMediaQueueItem, paramInt, 0, -1, -1L, paramJSONObject);
          }
          catch (IOException localIOException)
          {
            for (;;)
            {
              b((g.a)b(new Status(2100)));
              g.f(g.this).a(null);
            }
            localObject1 = finally;
            throw ((Throwable)localObject1);
          }
          finally
          {
            g.f(g.this).a(null);
          }
          return;
        }
      }
    });
  }
  
  public i<a> a(final com.google.android.gms.common.api.g paramg, final MediaQueueItem[] paramArrayOfMediaQueueItem, final JSONObject paramJSONObject)
  {
    paramg.b(new g(paramg)
    {
      protected void a(e arg1)
      {
        synchronized (g.e(g.this))
        {
          g.f(g.this).a(paramg);
          try
          {
            g.g(g.this).a(this.h, 0, -1L, paramArrayOfMediaQueueItem, 0, null, paramJSONObject);
          }
          catch (IOException localIOException)
          {
            for (;;)
            {
              b((g.a)b(new Status(2100)));
              g.f(g.this).a(null);
            }
            localObject1 = finally;
            throw ((Throwable)localObject1);
          }
          finally
          {
            g.f(g.this).a(null);
          }
          return;
        }
      }
    });
  }
  
  public void a(CastDevice paramCastDevice, String paramString1, String paramString2)
  {
    this.k.b(paramString2);
  }
  
  public void a(b paramb)
  {
    this.o = paramb;
  }
  
  public void a(c paramc)
  {
    this.m = paramc;
  }
  
  public void a(d paramd)
  {
    this.n = paramd;
  }
  
  public void a(e parame)
  {
    this.p = parame;
  }
  
  public long b()
  {
    synchronized (this.j)
    {
      long l1 = this.k.e();
      return l1;
    }
  }
  
  public i<a> b(com.google.android.gms.common.api.g paramg)
  {
    return b(paramg, null);
  }
  
  public i<a> b(final com.google.android.gms.common.api.g paramg, final int paramInt, final JSONObject paramJSONObject)
  {
    paramg.b(new g(paramg)
    {
      protected void a(e arg1)
      {
        synchronized (g.e(g.this))
        {
          if (g.a(g.this, paramInt) == -1)
          {
            b((g.a)b(new Status(0)));
            return;
          }
          g.f(g.this).a(paramg);
          try
          {
            com.google.android.gms.cast.internal.n localn = g.g(g.this);
            p localp = this.h;
            int i = paramInt;
            JSONObject localJSONObject = paramJSONObject;
            localn.a(localp, new int[] { i }, localJSONObject);
          }
          catch (IOException localIOException)
          {
            for (;;)
            {
              b((g.a)b(new Status(2100)));
              g.f(g.this).a(null);
            }
          }
          finally
          {
            g.f(g.this).a(null);
          }
          return;
        }
      }
    });
  }
  
  public i<a> b(final com.google.android.gms.common.api.g paramg, final JSONObject paramJSONObject)
  {
    paramg.b(new g(paramg)
    {
      protected void a(e arg1)
      {
        synchronized (g.e(g.this))
        {
          g.f(g.this).a(paramg);
          try
          {
            g.g(g.this).b(this.h, paramJSONObject);
          }
          catch (IOException localIOException)
          {
            for (;;)
            {
              b((g.a)b(new Status(2100)));
              g.f(g.this).a(null);
            }
            localObject1 = finally;
            throw ((Throwable)localObject1);
          }
          finally
          {
            g.f(g.this).a(null);
          }
          return;
        }
      }
    });
  }
  
  public MediaStatus c()
  {
    synchronized (this.j)
    {
      MediaStatus localMediaStatus = this.k.f();
      return localMediaStatus;
    }
  }
  
  public i<a> c(com.google.android.gms.common.api.g paramg)
  {
    return c(paramg, null);
  }
  
  public i<a> c(com.google.android.gms.common.api.g paramg, int paramInt, JSONObject paramJSONObject)
  {
    return a(paramg, paramInt, -1L, paramJSONObject);
  }
  
  public i<a> c(final com.google.android.gms.common.api.g paramg, final JSONObject paramJSONObject)
  {
    paramg.b(new g(paramg)
    {
      protected void a(e arg1)
      {
        synchronized (g.e(g.this))
        {
          g.f(g.this).a(paramg);
          try
          {
            g.g(g.this).c(this.h, paramJSONObject);
          }
          catch (IOException localIOException)
          {
            for (;;)
            {
              b((g.a)b(new Status(2100)));
              g.f(g.this).a(null);
            }
            localObject1 = finally;
            throw ((Throwable)localObject1);
          }
          finally
          {
            g.f(g.this).a(null);
          }
          return;
        }
      }
    });
  }
  
  public MediaInfo d()
  {
    synchronized (this.j)
    {
      MediaInfo localMediaInfo = this.k.g();
      return localMediaInfo;
    }
  }
  
  public i<a> d(final com.google.android.gms.common.api.g paramg)
  {
    paramg.b(new g(paramg)
    {
      protected void a(e arg1)
      {
        synchronized (g.e(g.this))
        {
          g.f(g.this).a(paramg);
          try
          {
            g.g(g.this).a(this.h);
          }
          catch (IOException localIOException)
          {
            for (;;)
            {
              b((g.a)b(new Status(2100)));
              g.f(g.this).a(null);
            }
            localObject1 = finally;
            throw ((Throwable)localObject1);
          }
          finally
          {
            g.f(g.this).a(null);
          }
          return;
        }
      }
    });
  }
  
  public i<a> d(final com.google.android.gms.common.api.g paramg, final JSONObject paramJSONObject)
  {
    paramg.b(new g(paramg)
    {
      protected void a(e arg1)
      {
        synchronized (g.e(g.this))
        {
          g.f(g.this).a(paramg);
          try
          {
            g.g(g.this).a(this.h, 0, -1L, null, -1, null, paramJSONObject);
          }
          catch (IOException localIOException)
          {
            for (;;)
            {
              b((g.a)b(new Status(2100)));
              g.f(g.this).a(null);
            }
            localObject1 = finally;
            throw ((Throwable)localObject1);
          }
          finally
          {
            g.f(g.this).a(null);
          }
          return;
        }
      }
    });
  }
  
  public i<a> e(final com.google.android.gms.common.api.g paramg, final JSONObject paramJSONObject)
  {
    paramg.b(new g(paramg)
    {
      protected void a(e arg1)
      {
        synchronized (g.e(g.this))
        {
          g.f(g.this).a(paramg);
          try
          {
            g.g(g.this).a(this.h, 0, -1L, null, 1, null, paramJSONObject);
          }
          catch (IOException localIOException)
          {
            for (;;)
            {
              b((g.a)b(new Status(2100)));
              g.f(g.this).a(null);
            }
            localObject1 = finally;
            throw ((Throwable)localObject1);
          }
          finally
          {
            g.f(g.this).a(null);
          }
          return;
        }
      }
    });
  }
  
  public String e()
  {
    return this.k.b();
  }
  
  public static abstract interface a
    extends m
  {
    public abstract JSONObject b();
  }
  
  public static abstract interface b
  {
    public abstract void a();
  }
  
  public static abstract interface c
  {
    public abstract void a();
  }
  
  public static abstract interface d
  {
    public abstract void a();
  }
  
  public static abstract interface e
  {
    public abstract void a();
  }
  
  private class f
    implements o
  {
    private com.google.android.gms.common.api.g b;
    private long c = 0L;
    
    public f() {}
    
    public long a()
    {
      long l = this.c + 1L;
      this.c = l;
      return l;
    }
    
    public void a(com.google.android.gms.common.api.g paramg)
    {
      this.b = paramg;
    }
    
    public void a(String paramString1, String paramString2, long paramLong, String paramString3)
    {
      if (this.b == null) {
        throw new IOException("No GoogleApiClient available");
      }
      a.l.a(this.b, paramString1, paramString2).a(new a(paramLong));
    }
    
    private final class a
      implements com.google.android.gms.common.api.n<Status>
    {
      private final long b;
      
      a(long paramLong)
      {
        this.b = paramLong;
      }
      
      public void a(@NonNull Status paramStatus)
      {
        if (!paramStatus.f()) {
          g.g(g.this).a(this.b, paramStatus.i());
        }
      }
    }
  }
  
  static abstract class g
    extends b<g.a>
  {
    p h = new p()
    {
      public void a(long paramAnonymousLong)
      {
        g.g.this.b((g.a)g.g.this.b(new Status(2103)));
      }
      
      public void a(long paramAnonymousLong, int paramAnonymousInt, Object paramAnonymousObject)
      {
        if ((paramAnonymousObject instanceof JSONObject)) {}
        for (paramAnonymousObject = (JSONObject)paramAnonymousObject;; paramAnonymousObject = null)
        {
          g.g.this.b(new g.h(new Status(paramAnonymousInt), (JSONObject)paramAnonymousObject));
          return;
        }
      }
    };
    
    g(com.google.android.gms.common.api.g paramg)
    {
      super();
    }
    
    public g.a a(final Status paramStatus)
    {
      new g.a()
      {
        public Status a()
        {
          return paramStatus;
        }
        
        public JSONObject b()
        {
          return null;
        }
      };
    }
    
    protected void a(e parame) {}
  }
  
  private static final class h
    implements g.a
  {
    private final Status a;
    private final JSONObject b;
    
    h(Status paramStatus, JSONObject paramJSONObject)
    {
      this.a = paramStatus;
      this.b = paramJSONObject;
    }
    
    public Status a()
    {
      return this.a;
    }
    
    public JSONObject b()
    {
      return this.b;
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/cast/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */