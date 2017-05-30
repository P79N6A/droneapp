package com.google.android.gms.cast.framework.media;

import android.os.Handler;
import android.os.Looper;
import android.support.annotation.NonNull;
import com.google.android.gms.cast.AdBreakInfo;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaQueueItem;
import com.google.android.gms.cast.MediaStatus;
import com.google.android.gms.cast.TextTrackStyle;
import com.google.android.gms.cast.a.b;
import com.google.android.gms.cast.a.e;
import com.google.android.gms.cast.internal.b;
import com.google.android.gms.cast.internal.e;
import com.google.android.gms.cast.internal.n.a;
import com.google.android.gms.cast.internal.o;
import com.google.android.gms.cast.internal.p;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.internal.d;
import java.io.IOException;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;

public class c
  implements a.e
{
  public static final String a = com.google.android.gms.cast.internal.n.g;
  public static final int b = 0;
  public static final int c = 1;
  public static final int d = 2;
  public static final int e = 0;
  public static final int f = 2100;
  public static final int g = 2103;
  private final Object h = new Object();
  private final Handler i = new Handler(Looper.getMainLooper());
  private final com.google.android.gms.cast.internal.n j;
  private final e k = new e();
  private final a.b l;
  private g m;
  private final List<a> n = new CopyOnWriteArrayList();
  private final Map<d, h> o = new ConcurrentHashMap();
  private final Map<Long, h> p = new ConcurrentHashMap();
  private c q;
  
  public c(@NonNull com.google.android.gms.cast.internal.n paramn, @NonNull a.b paramb)
  {
    this.l = paramb;
    this.j = ((com.google.android.gms.cast.internal.n)d.a(paramn));
    this.j.a(new n.a()
    {
      private void e()
      {
        if (c.c(c.this) != null)
        {
          Object localObject = c.this.g();
          if (localObject != null)
          {
            ((MediaStatus)localObject).a(c.c(c.this).a((MediaStatus)localObject));
            localObject = c.c(c.this).b((MediaStatus)localObject);
            MediaInfo localMediaInfo = c.this.h();
            if (localMediaInfo != null) {
              localMediaInfo.b((List)localObject);
            }
          }
        }
      }
      
      public void a()
      {
        e();
        c.a(c.this);
        Iterator localIterator = c.b(c.this).iterator();
        while (localIterator.hasNext()) {
          ((c.a)localIterator.next()).a();
        }
      }
      
      public void b()
      {
        e();
        Iterator localIterator = c.b(c.this).iterator();
        while (localIterator.hasNext()) {
          ((c.a)localIterator.next()).b();
        }
      }
      
      public void c()
      {
        Iterator localIterator = c.b(c.this).iterator();
        while (localIterator.hasNext()) {
          ((c.a)localIterator.next()).c();
        }
      }
      
      public void d()
      {
        Iterator localIterator = c.b(c.this).iterator();
        while (localIterator.hasNext()) {
          ((c.a)localIterator.next()).d();
        }
      }
    });
    this.j.a(this.k);
  }
  
  private int a(int paramInt)
  {
    MediaStatus localMediaStatus = g();
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
  
  private f a(f paramf)
  {
    try
    {
      this.m.b(paramf);
      return paramf;
    }
    catch (IllegalStateException localIllegalStateException)
    {
      localIllegalStateException = localIllegalStateException;
      paramf.b((b)paramf.b(new Status(2100)));
      return paramf;
    }
    finally {}
    return paramf;
  }
  
  private void a(Set<d> paramSet)
  {
    if ((n()) || (m())) {}
    for (;;)
    {
      return;
      Object localObject = new HashSet(paramSet);
      if (l())
      {
        paramSet = ((Set)localObject).iterator();
        while (paramSet.hasNext()) {
          ((d)paramSet.next()).a(e(), f());
        }
      }
      else if (o())
      {
        paramSet = q();
        if ((paramSet != null) && (paramSet.b() != null))
        {
          localObject = ((Set)localObject).iterator();
          while (((Iterator)localObject).hasNext()) {
            ((d)((Iterator)localObject).next()).a(0L, paramSet.b().f());
          }
        }
      }
      else
      {
        paramSet = ((Set)localObject).iterator();
        while (paramSet.hasNext()) {
          ((d)paramSet.next()).a(0L, 0L);
        }
      }
    }
  }
  
  private void w()
  {
    if (this.m == null) {
      throw new IllegalStateException("No connection");
    }
  }
  
  private void x()
  {
    Iterator localIterator = this.p.values().iterator();
    label110:
    while (localIterator.hasNext())
    {
      h localh = (h)localIterator.next();
      if ((t()) && (!localh.e())) {
        localh.c();
      }
      for (;;)
      {
        if ((!localh.e()) || ((!n()) && (!m()) && (!o()))) {
          break label110;
        }
        a(h.a(localh));
        break;
        if ((!t()) && (localh.e())) {
          localh.d();
        }
      }
    }
  }
  
  public i<b> a()
  {
    return a(null);
  }
  
  public i<b> a(double paramDouble)
  {
    return a(paramDouble, null);
  }
  
  public i<b> a(final double paramDouble, JSONObject paramJSONObject)
  {
    w();
    if ((Double.isInfinite(paramDouble)) || (Double.isNaN(paramDouble))) {
      throw new IllegalArgumentException(41 + "Volume cannot be " + paramDouble);
    }
    a(new f(this.m)
    {
      /* Error */
      protected void a(e arg1)
      {
        // Byte code:
        //   0: aload_0
        //   1: getfield 18	com/google/android/gms/cast/framework/media/c$14:c	Lcom/google/android/gms/cast/framework/media/c;
        //   4: invokestatic 37	com/google/android/gms/cast/framework/media/c:d	(Lcom/google/android/gms/cast/framework/media/c;)Ljava/lang/Object;
        //   7: astore_1
        //   8: aload_1
        //   9: monitorenter
        //   10: aload_0
        //   11: getfield 18	com/google/android/gms/cast/framework/media/c$14:c	Lcom/google/android/gms/cast/framework/media/c;
        //   14: invokestatic 41	com/google/android/gms/cast/framework/media/c:e	(Lcom/google/android/gms/cast/framework/media/c;)Lcom/google/android/gms/cast/internal/n;
        //   17: aload_0
        //   18: getfield 45	com/google/android/gms/cast/framework/media/c$14:g	Lcom/google/android/gms/cast/internal/p;
        //   21: aload_0
        //   22: getfield 20	com/google/android/gms/cast/framework/media/c$14:a	D
        //   25: aload_0
        //   26: getfield 22	com/google/android/gms/cast/framework/media/c$14:b	Lorg/json/JSONObject;
        //   29: invokevirtual 50	com/google/android/gms/cast/internal/n:a	(Lcom/google/android/gms/cast/internal/p;DLorg/json/JSONObject;)J
        //   32: pop2
        //   33: aload_1
        //   34: monitorexit
        //   35: return
        //   36: aload_0
        //   37: aload_0
        //   38: new 52	com/google/android/gms/common/api/Status
        //   41: dup
        //   42: sipush 2100
        //   45: invokespecial 55	com/google/android/gms/common/api/Status:<init>	(I)V
        //   48: invokevirtual 58	com/google/android/gms/cast/framework/media/c$f:b	(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/m;
        //   51: checkcast 60	com/google/android/gms/cast/framework/media/c$b
        //   54: invokevirtual 63	com/google/android/gms/cast/framework/media/c$14:b	(Lcom/google/android/gms/common/api/m;)V
        //   57: goto -24 -> 33
        //   60: astore_2
        //   61: aload_1
        //   62: monitorexit
        //   63: aload_2
        //   64: athrow
        //   65: astore_2
        //   66: goto -30 -> 36
        //   69: astore_2
        //   70: goto -34 -> 36
        //   73: astore_2
        //   74: goto -38 -> 36
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	77	0	this	14
        //   60	4	2	localObject	Object
        //   65	1	2	localIOException	IOException
        //   69	1	2	localIllegalArgumentException	IllegalArgumentException
        //   73	1	2	localIllegalStateException	IllegalStateException
        // Exception table:
        //   from	to	target	type
        //   10	33	60	finally
        //   33	35	60	finally
        //   36	57	60	finally
        //   61	63	60	finally
        //   10	33	65	java/io/IOException
        //   10	33	69	java/lang/IllegalArgumentException
        //   10	33	73	java/lang/IllegalStateException
      }
    });
  }
  
  public i<b> a(final int paramInt1, final int paramInt2, final JSONObject paramJSONObject)
  {
    w();
    a(new f(this.m)
    {
      protected void a(e arg1)
      {
        int j = 0;
        int i;
        synchronized (c.d(c.this))
        {
          i = c.a(c.this, paramInt1);
          if (i == -1)
          {
            b((c.b)b(new Status(0)));
            return;
          }
          if (paramInt2 < 0)
          {
            b((c.b)b(new Status(2001, String.format(Locale.ROOT, "Invalid request: Invalid newIndex %d.", new Object[] { Integer.valueOf(paramInt2) }))));
            return;
          }
        }
        if (i == paramInt2)
        {
          b((c.b)b(new Status(0)));
          return;
        }
        if (paramInt2 > i) {
          i = paramInt2 + 1;
        }
        for (;;)
        {
          Object localObject2 = c.this.g().b(i);
          i = j;
          if (localObject2 != null) {
            i = ((MediaQueueItem)localObject2).c();
          }
          try
          {
            localObject2 = c.e(c.this);
            p localp = this.g;
            j = paramInt1;
            JSONObject localJSONObject = paramJSONObject;
            ((com.google.android.gms.cast.internal.n)localObject2).a(localp, new int[] { j }, i, localJSONObject);
            return;
            i = paramInt2;
          }
          catch (IOException localIOException)
          {
            for (;;)
            {
              b((c.b)b(new Status(2100)));
            }
          }
        }
      }
    });
  }
  
  public i<b> a(final int paramInt, final long paramLong, JSONObject paramJSONObject)
  {
    w();
    a(new f(this.m)
    {
      protected void a(e arg1)
      {
        synchronized (c.d(c.this))
        {
          if (c.a(c.this, paramInt) == -1)
          {
            b((c.b)b(new Status(0)));
            return;
          }
        }
        try
        {
          c.e(c.this).a(this.g, paramInt, paramLong, null, 0, null, this.c);
          return;
          localObject = finally;
          throw ((Throwable)localObject);
        }
        catch (IOException localIOException)
        {
          for (;;)
          {
            b((c.b)b(new Status(2100)));
          }
        }
      }
    });
  }
  
  public i<b> a(final int paramInt, final JSONObject paramJSONObject)
  {
    w();
    a(new f(this.m)
    {
      protected void a(e arg1)
      {
        synchronized (c.d(c.this))
        {
          try
          {
            c.e(c.this).a(this.g, 0, -1L, null, 0, Integer.valueOf(paramInt), paramJSONObject);
            return;
          }
          catch (IOException localIOException)
          {
            for (;;)
            {
              b((c.b)b(new Status(2100)));
            }
          }
        }
      }
    });
  }
  
  public i<b> a(long paramLong)
  {
    return a(paramLong, 0, null);
  }
  
  public i<b> a(long paramLong, int paramInt)
  {
    return a(paramLong, paramInt, null);
  }
  
  public i<b> a(final long paramLong, int paramInt, final JSONObject paramJSONObject)
  {
    w();
    a(new f(this.m)
    {
      protected void a(e arg1)
      {
        synchronized (c.d(c.this))
        {
          try
          {
            c.e(c.this).a(this.g, paramLong, paramJSONObject, this.c);
            return;
          }
          catch (IOException localIOException)
          {
            for (;;)
            {
              b((c.b)b(new Status(2100)));
            }
          }
        }
      }
    });
  }
  
  public i<b> a(MediaInfo paramMediaInfo)
  {
    return a(paramMediaInfo, true, 0L, null, null);
  }
  
  public i<b> a(MediaInfo paramMediaInfo, boolean paramBoolean)
  {
    return a(paramMediaInfo, paramBoolean, 0L, null, null);
  }
  
  public i<b> a(MediaInfo paramMediaInfo, boolean paramBoolean, long paramLong)
  {
    return a(paramMediaInfo, paramBoolean, paramLong, null, null);
  }
  
  public i<b> a(MediaInfo paramMediaInfo, boolean paramBoolean, long paramLong, JSONObject paramJSONObject)
  {
    return a(paramMediaInfo, paramBoolean, paramLong, null, paramJSONObject);
  }
  
  public i<b> a(final MediaInfo paramMediaInfo, final boolean paramBoolean, final long paramLong, long[] paramArrayOfLong, final JSONObject paramJSONObject)
  {
    w();
    a(new f(this.m)
    {
      /* Error */
      protected void a(e arg1)
      {
        // Byte code:
        //   0: aload_0
        //   1: getfield 24	com/google/android/gms/cast/framework/media/c$4:f	Lcom/google/android/gms/cast/framework/media/c;
        //   4: invokestatic 46	com/google/android/gms/cast/framework/media/c:d	(Lcom/google/android/gms/cast/framework/media/c;)Ljava/lang/Object;
        //   7: astore_1
        //   8: aload_1
        //   9: monitorenter
        //   10: aload_0
        //   11: getfield 24	com/google/android/gms/cast/framework/media/c$4:f	Lcom/google/android/gms/cast/framework/media/c;
        //   14: invokestatic 49	com/google/android/gms/cast/framework/media/c:e	(Lcom/google/android/gms/cast/framework/media/c;)Lcom/google/android/gms/cast/internal/n;
        //   17: aload_0
        //   18: getfield 53	com/google/android/gms/cast/framework/media/c$4:g	Lcom/google/android/gms/cast/internal/p;
        //   21: aload_0
        //   22: getfield 26	com/google/android/gms/cast/framework/media/c$4:a	Lcom/google/android/gms/cast/MediaInfo;
        //   25: aload_0
        //   26: getfield 28	com/google/android/gms/cast/framework/media/c$4:b	Z
        //   29: aload_0
        //   30: getfield 30	com/google/android/gms/cast/framework/media/c$4:c	J
        //   33: aload_0
        //   34: getfield 32	com/google/android/gms/cast/framework/media/c$4:d	[J
        //   37: aload_0
        //   38: getfield 34	com/google/android/gms/cast/framework/media/c$4:e	Lorg/json/JSONObject;
        //   41: invokevirtual 58	com/google/android/gms/cast/internal/n:a	(Lcom/google/android/gms/cast/internal/p;Lcom/google/android/gms/cast/MediaInfo;ZJ[JLorg/json/JSONObject;)J
        //   44: pop2
        //   45: aload_1
        //   46: monitorexit
        //   47: return
        //   48: aload_0
        //   49: aload_0
        //   50: new 60	com/google/android/gms/common/api/Status
        //   53: dup
        //   54: sipush 2100
        //   57: invokespecial 63	com/google/android/gms/common/api/Status:<init>	(I)V
        //   60: invokevirtual 66	com/google/android/gms/cast/framework/media/c$f:b	(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/m;
        //   63: checkcast 68	com/google/android/gms/cast/framework/media/c$b
        //   66: invokevirtual 71	com/google/android/gms/cast/framework/media/c$4:b	(Lcom/google/android/gms/common/api/m;)V
        //   69: goto -24 -> 45
        //   72: astore_2
        //   73: aload_1
        //   74: monitorexit
        //   75: aload_2
        //   76: athrow
        //   77: astore_2
        //   78: goto -30 -> 48
        //   81: astore_2
        //   82: goto -34 -> 48
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	85	0	this	4
        //   72	4	2	localObject	Object
        //   77	1	2	localIOException	IOException
        //   81	1	2	localIllegalStateException	IllegalStateException
        // Exception table:
        //   from	to	target	type
        //   10	45	72	finally
        //   45	47	72	finally
        //   48	69	72	finally
        //   73	75	72	finally
        //   10	45	77	java/io/IOException
        //   10	45	81	java/lang/IllegalStateException
      }
    });
  }
  
  public i<b> a(final MediaQueueItem paramMediaQueueItem, final int paramInt, final long paramLong, JSONObject paramJSONObject)
  {
    w();
    a(new f(this.m)
    {
      protected void a(e arg1)
      {
        synchronized (c.d(c.this))
        {
          try
          {
            com.google.android.gms.cast.internal.n localn = c.e(c.this);
            p localp = this.g;
            MediaQueueItem localMediaQueueItem = paramMediaQueueItem;
            int i = paramInt;
            long l = paramLong;
            JSONObject localJSONObject = this.d;
            localn.a(localp, new MediaQueueItem[] { localMediaQueueItem }, i, 0, 0, l, localJSONObject);
            return;
          }
          catch (IOException localIOException)
          {
            for (;;)
            {
              b((c.b)b(new Status(2100)));
            }
          }
        }
      }
    });
  }
  
  public i<b> a(MediaQueueItem paramMediaQueueItem, int paramInt, JSONObject paramJSONObject)
  {
    return a(paramMediaQueueItem, paramInt, -1L, paramJSONObject);
  }
  
  public i<b> a(MediaQueueItem paramMediaQueueItem, JSONObject paramJSONObject)
  {
    return a(new MediaQueueItem[] { paramMediaQueueItem }, 0, paramJSONObject);
  }
  
  public i<b> a(final TextTrackStyle paramTextTrackStyle)
  {
    w();
    if (paramTextTrackStyle == null) {
      throw new IllegalArgumentException("trackStyle cannot be null");
    }
    a(new f(this.m)
    {
      protected void a(e arg1)
      {
        synchronized (c.d(c.this))
        {
          try
          {
            c.e(c.this).a(this.g, paramTextTrackStyle);
            return;
          }
          catch (IOException localIOException)
          {
            for (;;)
            {
              b((c.b)b(new Status(2100)));
            }
          }
        }
      }
    });
  }
  
  public i<b> a(final JSONObject paramJSONObject)
  {
    w();
    a(new f(this.m)
    {
      protected void a(e arg1)
      {
        synchronized (c.d(c.this))
        {
          try
          {
            c.e(c.this).a(this.g, paramJSONObject);
            return;
          }
          catch (IOException localIOException)
          {
            for (;;)
            {
              b((c.b)b(new Status(2100)));
            }
          }
        }
      }
    });
  }
  
  public i<b> a(boolean paramBoolean)
  {
    return a(paramBoolean, null);
  }
  
  public i<b> a(final boolean paramBoolean, final JSONObject paramJSONObject)
  {
    w();
    a(new f(this.m)
    {
      /* Error */
      protected void a(e arg1)
      {
        // Byte code:
        //   0: aload_0
        //   1: getfield 18	com/google/android/gms/cast/framework/media/c$15:c	Lcom/google/android/gms/cast/framework/media/c;
        //   4: invokestatic 35	com/google/android/gms/cast/framework/media/c:d	(Lcom/google/android/gms/cast/framework/media/c;)Ljava/lang/Object;
        //   7: astore_1
        //   8: aload_1
        //   9: monitorenter
        //   10: aload_0
        //   11: getfield 18	com/google/android/gms/cast/framework/media/c$15:c	Lcom/google/android/gms/cast/framework/media/c;
        //   14: invokestatic 39	com/google/android/gms/cast/framework/media/c:e	(Lcom/google/android/gms/cast/framework/media/c;)Lcom/google/android/gms/cast/internal/n;
        //   17: aload_0
        //   18: getfield 43	com/google/android/gms/cast/framework/media/c$15:g	Lcom/google/android/gms/cast/internal/p;
        //   21: aload_0
        //   22: getfield 20	com/google/android/gms/cast/framework/media/c$15:a	Z
        //   25: aload_0
        //   26: getfield 22	com/google/android/gms/cast/framework/media/c$15:b	Lorg/json/JSONObject;
        //   29: invokevirtual 48	com/google/android/gms/cast/internal/n:a	(Lcom/google/android/gms/cast/internal/p;ZLorg/json/JSONObject;)J
        //   32: pop2
        //   33: aload_1
        //   34: monitorexit
        //   35: return
        //   36: aload_0
        //   37: aload_0
        //   38: new 50	com/google/android/gms/common/api/Status
        //   41: dup
        //   42: sipush 2100
        //   45: invokespecial 53	com/google/android/gms/common/api/Status:<init>	(I)V
        //   48: invokevirtual 56	com/google/android/gms/cast/framework/media/c$f:b	(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/m;
        //   51: checkcast 58	com/google/android/gms/cast/framework/media/c$b
        //   54: invokevirtual 61	com/google/android/gms/cast/framework/media/c$15:b	(Lcom/google/android/gms/common/api/m;)V
        //   57: goto -24 -> 33
        //   60: astore_2
        //   61: aload_1
        //   62: monitorexit
        //   63: aload_2
        //   64: athrow
        //   65: astore_2
        //   66: goto -30 -> 36
        //   69: astore_2
        //   70: goto -34 -> 36
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	73	0	this	15
        //   60	4	2	localObject	Object
        //   65	1	2	localIOException	IOException
        //   69	1	2	localIllegalStateException	IllegalStateException
        // Exception table:
        //   from	to	target	type
        //   10	33	60	finally
        //   33	35	60	finally
        //   36	57	60	finally
        //   61	63	60	finally
        //   10	33	65	java/io/IOException
        //   10	33	69	java/lang/IllegalStateException
      }
    });
  }
  
  public i<b> a(final int[] paramArrayOfInt, final int paramInt, final JSONObject paramJSONObject)
  {
    w();
    a(new f(this.m)
    {
      protected void a(e arg1)
      {
        synchronized (c.d(c.this))
        {
          try
          {
            c.e(c.this).a(this.g, paramArrayOfInt, paramInt, paramJSONObject);
            return;
          }
          catch (IOException localIOException)
          {
            for (;;)
            {
              b((c.b)b(new Status(2100)));
            }
          }
        }
      }
    });
  }
  
  public i<b> a(final int[] paramArrayOfInt, final JSONObject paramJSONObject)
  {
    w();
    a(new f(this.m)
    {
      protected void a(e arg1)
      {
        synchronized (c.d(c.this))
        {
          try
          {
            c.e(c.this).a(this.g, paramArrayOfInt, paramJSONObject);
            return;
          }
          catch (IOException localIOException)
          {
            for (;;)
            {
              b((c.b)b(new Status(2100)));
            }
          }
        }
      }
    });
  }
  
  public i<b> a(final long[] paramArrayOfLong)
  {
    w();
    if (paramArrayOfLong == null) {
      throw new IllegalArgumentException("trackIds cannot be null");
    }
    a(new f(this.m)
    {
      protected void a(e arg1)
      {
        synchronized (c.d(c.this))
        {
          try
          {
            c.e(c.this).a(this.g, paramArrayOfLong);
            return;
          }
          catch (IOException localIOException)
          {
            for (;;)
            {
              b((c.b)b(new Status(2100)));
            }
          }
        }
      }
    });
  }
  
  public i<b> a(final MediaQueueItem[] paramArrayOfMediaQueueItem, final int paramInt1, final int paramInt2, final long paramLong, JSONObject paramJSONObject)
  {
    w();
    a(new f(this.m)
    {
      protected void a(e arg1)
      {
        synchronized (c.d(c.this))
        {
          try
          {
            c.e(c.this).a(this.g, paramArrayOfMediaQueueItem, paramInt1, paramInt2, paramLong, this.e);
            return;
          }
          catch (IOException localIOException)
          {
            for (;;)
            {
              b((c.b)b(new Status(2100)));
            }
          }
        }
      }
    });
  }
  
  public i<b> a(MediaQueueItem[] paramArrayOfMediaQueueItem, int paramInt1, int paramInt2, JSONObject paramJSONObject)
  {
    return a(paramArrayOfMediaQueueItem, paramInt1, paramInt2, -1L, paramJSONObject);
  }
  
  public i<b> a(final MediaQueueItem[] paramArrayOfMediaQueueItem, final int paramInt, final JSONObject paramJSONObject)
  {
    w();
    a(new f(this.m)
    {
      protected void a(e arg1)
      {
        synchronized (c.d(c.this))
        {
          try
          {
            c.e(c.this).a(this.g, paramArrayOfMediaQueueItem, paramInt, 0, -1, -1L, paramJSONObject);
            return;
          }
          catch (IOException localIOException)
          {
            for (;;)
            {
              b((c.b)b(new Status(2100)));
            }
          }
        }
      }
    });
  }
  
  public i<b> a(final MediaQueueItem[] paramArrayOfMediaQueueItem, final JSONObject paramJSONObject)
  {
    w();
    a(new f(this.m)
    {
      protected void a(e arg1)
      {
        synchronized (c.d(c.this))
        {
          try
          {
            c.e(c.this).a(this.g, 0, -1L, paramArrayOfMediaQueueItem, 0, null, paramJSONObject);
            return;
          }
          catch (IOException localIOException)
          {
            for (;;)
            {
              b((c.b)b(new Status(2100)));
            }
          }
        }
      }
    });
  }
  
  public void a(CastDevice paramCastDevice, String paramString1, String paramString2)
  {
    this.j.b(paramString2);
  }
  
  public void a(a parama)
  {
    if (parama != null) {
      this.n.add(parama);
    }
  }
  
  public void a(c paramc)
  {
    this.q = paramc;
  }
  
  public void a(d paramd)
  {
    h localh = (h)this.o.remove(paramd);
    if (localh != null)
    {
      localh.b(paramd);
      if (!localh.b())
      {
        this.p.remove(Long.valueOf(localh.a()));
        localh.d();
      }
    }
  }
  
  public void a(g paramg)
  {
    if (this.m == paramg) {}
    do
    {
      return;
      if (this.m != null)
      {
        this.j.a();
        this.l.d(this.m, v());
        this.k.a(null);
      }
      this.m = paramg;
    } while (this.m == null);
    this.l.a(this.m, v(), this);
    this.k.a(this.m);
  }
  
  public boolean a(d paramd, long paramLong)
  {
    if ((paramd == null) || (this.o.containsKey(paramd))) {
      return false;
    }
    h localh2 = (h)this.p.get(Long.valueOf(paramLong));
    h localh1 = localh2;
    if (localh2 == null)
    {
      localh1 = new h(paramLong);
      this.p.put(Long.valueOf(paramLong), localh1);
    }
    localh1.a(paramd);
    this.o.put(paramd, localh1);
    if (t()) {
      localh1.c();
    }
    return true;
  }
  
  public i<b> b()
  {
    return b(null);
  }
  
  public i<b> b(final int paramInt, final JSONObject paramJSONObject)
  {
    w();
    a(new f(this.m)
    {
      protected void a(e arg1)
      {
        synchronized (c.d(c.this))
        {
          if (c.a(c.this, paramInt) == -1)
          {
            b((c.b)b(new Status(0)));
            return;
          }
        }
        try
        {
          com.google.android.gms.cast.internal.n localn = c.e(c.this);
          p localp = this.g;
          int i = paramInt;
          JSONObject localJSONObject = paramJSONObject;
          localn.a(localp, new int[] { i }, localJSONObject);
          return;
          localObject = finally;
          throw ((Throwable)localObject);
        }
        catch (IOException localIOException)
        {
          for (;;)
          {
            b((c.b)b(new Status(2100)));
          }
        }
      }
    });
  }
  
  public i<b> b(final JSONObject paramJSONObject)
  {
    w();
    a(new f(this.m)
    {
      protected void a(e arg1)
      {
        synchronized (c.d(c.this))
        {
          try
          {
            c.e(c.this).b(this.g, paramJSONObject);
            return;
          }
          catch (IOException localIOException)
          {
            for (;;)
            {
              b((c.b)b(new Status(2100)));
            }
          }
        }
      }
    });
  }
  
  public void b(a parama)
  {
    if (parama != null) {
      this.n.remove(parama);
    }
  }
  
  public i<b> c()
  {
    return c(null);
  }
  
  public i<b> c(int paramInt, JSONObject paramJSONObject)
  {
    return a(paramInt, -1L, paramJSONObject);
  }
  
  public i<b> c(final JSONObject paramJSONObject)
  {
    w();
    a(new f(this.m)
    {
      protected void a(e arg1)
      {
        synchronized (c.d(c.this))
        {
          try
          {
            c.e(c.this).c(this.g, paramJSONObject);
            return;
          }
          catch (IOException localIOException)
          {
            for (;;)
            {
              b((c.b)b(new Status(2100)));
            }
          }
        }
      }
    });
  }
  
  public i<b> d()
  {
    w();
    a(new f(this.m)
    {
      protected void a(e arg1)
      {
        synchronized (c.d(c.this))
        {
          try
          {
            c.e(c.this).a(this.g);
            return;
          }
          catch (IOException localIOException)
          {
            for (;;)
            {
              b((c.b)b(new Status(2100)));
            }
          }
        }
      }
    });
  }
  
  public i<b> d(final JSONObject paramJSONObject)
  {
    w();
    a(new f(this.m)
    {
      protected void a(e arg1)
      {
        synchronized (c.d(c.this))
        {
          try
          {
            c.e(c.this).a(this.g, 0, -1L, null, -1, null, paramJSONObject);
            return;
          }
          catch (IOException localIOException)
          {
            for (;;)
            {
              b((c.b)b(new Status(2100)));
            }
          }
        }
      }
    });
  }
  
  public long e()
  {
    synchronized (this.h)
    {
      long l1 = this.j.d();
      return l1;
    }
  }
  
  public i<b> e(final JSONObject paramJSONObject)
  {
    w();
    a(new f(this.m)
    {
      protected void a(e arg1)
      {
        synchronized (c.d(c.this))
        {
          try
          {
            c.e(c.this).a(this.g, 0, -1L, null, 1, null, paramJSONObject);
            return;
          }
          catch (IOException localIOException)
          {
            for (;;)
            {
              b((c.b)b(new Status(2100)));
            }
          }
        }
      }
    });
  }
  
  public long f()
  {
    synchronized (this.h)
    {
      long l1 = this.j.e();
      return l1;
    }
  }
  
  public MediaStatus g()
  {
    synchronized (this.h)
    {
      MediaStatus localMediaStatus = this.j.f();
      return localMediaStatus;
    }
  }
  
  public MediaInfo h()
  {
    synchronized (this.h)
    {
      MediaInfo localMediaInfo = this.j.g();
      return localMediaInfo;
    }
  }
  
  public int i()
  {
    for (;;)
    {
      synchronized (this.h)
      {
        MediaStatus localMediaStatus = g();
        if (localMediaStatus != null)
        {
          i1 = localMediaStatus.c();
          return i1;
        }
      }
      int i1 = 1;
    }
  }
  
  public int j()
  {
    for (;;)
    {
      synchronized (this.h)
      {
        MediaStatus localMediaStatus = g();
        if (localMediaStatus != null)
        {
          i1 = localMediaStatus.d();
          return i1;
        }
      }
      int i1 = 0;
    }
  }
  
  public boolean k()
  {
    MediaInfo localMediaInfo = h();
    return (localMediaInfo != null) && (localMediaInfo.c() == 2);
  }
  
  public boolean l()
  {
    MediaStatus localMediaStatus = g();
    return (localMediaStatus != null) && (localMediaStatus.c() == 2);
  }
  
  public boolean m()
  {
    MediaStatus localMediaStatus = g();
    return (localMediaStatus != null) && ((localMediaStatus.c() == 3) || ((k()) && (j() == 2)));
  }
  
  public boolean n()
  {
    MediaStatus localMediaStatus = g();
    return (localMediaStatus != null) && (localMediaStatus.c() == 4);
  }
  
  public boolean o()
  {
    MediaStatus localMediaStatus = g();
    return (localMediaStatus != null) && (localMediaStatus.m() != 0);
  }
  
  public MediaQueueItem p()
  {
    MediaStatus localMediaStatus = g();
    if (localMediaStatus == null) {
      return null;
    }
    return localMediaStatus.a(localMediaStatus.l());
  }
  
  public MediaQueueItem q()
  {
    MediaStatus localMediaStatus = g();
    if (localMediaStatus == null) {
      return null;
    }
    return localMediaStatus.a(localMediaStatus.m());
  }
  
  public MediaQueueItem r()
  {
    MediaStatus localMediaStatus = g();
    if (localMediaStatus == null) {
      return null;
    }
    return localMediaStatus.a(localMediaStatus.n());
  }
  
  public void s()
  {
    int i1 = i();
    if ((i1 == 4) || (i1 == 2))
    {
      a();
      return;
    }
    c();
  }
  
  public boolean t()
  {
    return (n()) || (l()) || (m()) || (o());
  }
  
  public boolean u()
  {
    MediaStatus localMediaStatus = g();
    return (localMediaStatus != null) && (localMediaStatus.r());
  }
  
  public String v()
  {
    return this.j.b();
  }
  
  public static abstract interface a
  {
    public abstract void a();
    
    public abstract void b();
    
    public abstract void c();
    
    public abstract void d();
    
    public abstract void e();
  }
  
  public static abstract interface b
    extends m
  {
    public abstract JSONObject b();
  }
  
  public static abstract interface c
  {
    public abstract boolean a(MediaStatus paramMediaStatus);
    
    public abstract List<AdBreakInfo> b(MediaStatus paramMediaStatus);
  }
  
  public static abstract interface d
  {
    public abstract void a(long paramLong1, long paramLong2);
  }
  
  private class e
    implements o
  {
    private g b;
    private long c = 0L;
    
    public e() {}
    
    public long a()
    {
      long l = this.c + 1L;
      this.c = l;
      return l;
    }
    
    public void a(g paramg)
    {
      this.b = paramg;
    }
    
    public void a(String paramString1, String paramString2, long paramLong, String paramString3)
    {
      if (this.b == null) {
        throw new IOException("No GoogleApiClient available");
      }
      paramString3 = c.b(c.this).iterator();
      while (paramString3.hasNext()) {
        ((c.a)paramString3.next()).e();
      }
      c.f(c.this).a(this.b, paramString1, paramString2).a(new a(paramLong));
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
          c.e(c.this).a(this.b, paramStatus.i());
        }
      }
    }
  }
  
  static abstract class f
    extends b<c.b>
  {
    p g = new p()
    {
      public void a(long paramAnonymousLong)
      {
        c.f.this.b((c.b)c.f.this.b(new Status(2103)));
      }
      
      public void a(long paramAnonymousLong, int paramAnonymousInt, Object paramAnonymousObject)
      {
        if ((paramAnonymousObject instanceof JSONObject)) {}
        for (paramAnonymousObject = (JSONObject)paramAnonymousObject;; paramAnonymousObject = null)
        {
          c.f.this.b(new c.g(new Status(paramAnonymousInt), (JSONObject)paramAnonymousObject));
          return;
        }
      }
    };
    
    f(g paramg)
    {
      super();
    }
    
    public c.b a(final Status paramStatus)
    {
      new c.b()
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
  
  private static final class g
    implements c.b
  {
    private final Status a;
    private final JSONObject b;
    
    g(Status paramStatus, JSONObject paramJSONObject)
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
  
  private class h
  {
    private final Set<c.d> b = new HashSet();
    private final long c;
    private final Runnable d;
    private boolean e;
    
    public h(long paramLong)
    {
      this.c = paramLong;
      this.d = new TimerTask()
      {
        public void run()
        {
          c.a(c.this, c.h.a(c.h.this));
          c.g(c.this).postDelayed(this, c.h.b(c.h.this));
        }
      };
    }
    
    public long a()
    {
      return this.c;
    }
    
    public void a(c.d paramd)
    {
      this.b.add(paramd);
    }
    
    public void b(c.d paramd)
    {
      this.b.remove(paramd);
    }
    
    public boolean b()
    {
      return !this.b.isEmpty();
    }
    
    public void c()
    {
      c.g(c.this).removeCallbacks(this.d);
      this.e = true;
      c.g(c.this).postDelayed(this.d, this.c);
    }
    
    public void d()
    {
      c.g(c.this).removeCallbacks(this.d);
      this.e = false;
    }
    
    public boolean e()
    {
      return this.e;
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/cast/framework/media/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */