package com.fimi.soul.drone.droneconnection.connection;

import android.os.Handler;
import android.os.Message;
import com.fimi.soul.utils.j;
import com.fimi.soul.utils.q;
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class d
{
  private static final String a = d.class.getSimpleName();
  public static final int b = 0;
  public static final int c = 1;
  public static final int d = 2;
  private static final int i = 4096;
  private static final int q = 1;
  protected volatile boolean e = false;
  BufferedWriter f;
  boolean g = true;
  private File h;
  private List<Integer> j = new ArrayList();
  private final ConcurrentHashMap<String, e> k = new ConcurrentHashMap();
  private com.fimi.soul.biz.h.b l = com.fimi.soul.biz.h.b.a();
  private final AtomicInteger m = new AtomicInteger(0);
  private final Runnable n = new Runnable()
  {
    private void a(com.fimi.soul.drone.c.b paramAnonymousb, int paramAnonymousInt, byte[] paramAnonymousArrayOfByte)
    {
      if (paramAnonymousInt < 1) {}
      Object localObject;
      c localc;
      for (;;)
      {
        return;
        int i = 0;
        while (i < paramAnonymousInt)
        {
          localObject = paramAnonymousb.a(paramAnonymousArrayOfByte[i] & 0xFF);
          if (localObject != null)
          {
            localc = c.a();
            localc.a(d.this.e);
            d.c(d.this).b(d.this.e);
            if (((com.fimi.soul.drone.c.a.c)localObject).c != 211) {
              break label100;
            }
            d.c(d.this).a((com.fimi.soul.drone.c.a.c)localObject);
          }
          i += 1;
        }
      }
      label100:
      d.d(d.this).add(Integer.valueOf(((com.fimi.soul.drone.c.a.c)localObject).c));
      if (d.this.e)
      {
        if (localc.f()) {
          localc.g();
        }
        if (!localc.e()) {
          localc.b();
        }
      }
      label237:
      for (;;)
      {
        localObject = ((com.fimi.soul.drone.c.a.c)localObject).f();
        d.a(d.this, (com.fimi.soul.drone.c.a.b)localObject);
        break;
        localc.a((com.fimi.soul.drone.c.a.c)localObject);
        continue;
        if (!localc.f()) {
          localc.c();
        }
        for (;;)
        {
          if (!localc.e()) {
            break label237;
          }
          localc.d();
          break;
          if (localc.k())
          {
            localc.g();
            return;
          }
          localc.a((com.fimi.soul.drone.c.a.c)localObject);
        }
      }
    }
    
    /* Error */
    public void run()
    {
      // Byte code:
      //   0: invokestatic 102	android/os/Looper:prepare	()V
      //   3: aload_0
      //   4: getfield 14	com/fimi/soul/drone/droneconnection/connection/d$1:a	Lcom/fimi/soul/drone/droneconnection/connection/d;
      //   7: invokevirtual 103	com/fimi/soul/drone/droneconnection/connection/d:d	()V
      //   10: aload_0
      //   11: getfield 14	com/fimi/soul/drone/droneconnection/connection/d$1:a	Lcom/fimi/soul/drone/droneconnection/connection/d;
      //   14: invokestatic 106	com/fimi/soul/drone/droneconnection/connection/d:a	(Lcom/fimi/soul/drone/droneconnection/connection/d;)Ljava/util/concurrent/atomic/AtomicInteger;
      //   17: iconst_2
      //   18: invokevirtual 112	java/util/concurrent/atomic/AtomicInteger:set	(I)V
      //   21: aload_0
      //   22: getfield 14	com/fimi/soul/drone/droneconnection/connection/d$1:a	Lcom/fimi/soul/drone/droneconnection/connection/d;
      //   25: invokestatic 114	com/fimi/soul/drone/droneconnection/connection/d:b	(Lcom/fimi/soul/drone/droneconnection/connection/d;)V
      //   28: new 21	com/fimi/soul/drone/c/b
      //   31: dup
      //   32: invokespecial 115	com/fimi/soul/drone/c/b:<init>	()V
      //   35: astore_3
      //   36: aload_3
      //   37: getfield 118	com/fimi/soul/drone/c/b:c	Lcom/fimi/soul/drone/c/a/e;
      //   40: invokevirtual 121	com/fimi/soul/drone/c/a/e:b	()V
      //   43: sipush 4096
      //   46: newarray <illegal type>
      //   48: astore_2
      //   49: aload_0
      //   50: getfield 14	com/fimi/soul/drone/droneconnection/connection/d$1:a	Lcom/fimi/soul/drone/droneconnection/connection/d;
      //   53: invokestatic 106	com/fimi/soul/drone/droneconnection/connection/d:a	(Lcom/fimi/soul/drone/droneconnection/connection/d;)Ljava/util/concurrent/atomic/AtomicInteger;
      //   56: invokevirtual 125	java/util/concurrent/atomic/AtomicInteger:get	()I
      //   59: iconst_2
      //   60: if_icmpne +74 -> 134
      //   63: aload_0
      //   64: getfield 14	com/fimi/soul/drone/droneconnection/connection/d$1:a	Lcom/fimi/soul/drone/droneconnection/connection/d;
      //   67: aload_2
      //   68: invokevirtual 128	com/fimi/soul/drone/droneconnection/connection/d:b	([B)I
      //   71: istore_1
      //   72: iload_1
      //   73: ifle -24 -> 49
      //   76: aload_0
      //   77: aload_3
      //   78: iload_1
      //   79: aload_2
      //   80: invokespecial 130	com/fimi/soul/drone/droneconnection/connection/d$1:a	(Lcom/fimi/soul/drone/c/b;I[B)V
      //   83: goto -34 -> 49
      //   86: astore_2
      //   87: aload_0
      //   88: getfield 14	com/fimi/soul/drone/droneconnection/connection/d$1:a	Lcom/fimi/soul/drone/droneconnection/connection/d;
      //   91: invokestatic 106	com/fimi/soul/drone/droneconnection/connection/d:a	(Lcom/fimi/soul/drone/droneconnection/connection/d;)Ljava/util/concurrent/atomic/AtomicInteger;
      //   94: invokevirtual 125	java/util/concurrent/atomic/AtomicInteger:get	()I
      //   97: ifeq +14 -> 111
      //   100: aload_0
      //   101: getfield 14	com/fimi/soul/drone/droneconnection/connection/d$1:a	Lcom/fimi/soul/drone/droneconnection/connection/d;
      //   104: aload_2
      //   105: invokevirtual 134	java/io/IOException:getMessage	()Ljava/lang/String;
      //   108: invokestatic 137	com/fimi/soul/drone/droneconnection/connection/d:a	(Lcom/fimi/soul/drone/droneconnection/connection/d;Ljava/lang/String;)V
      //   111: iconst_0
      //   112: ifeq +11 -> 123
      //   115: new 139	java/lang/NullPointerException
      //   118: dup
      //   119: invokespecial 140	java/lang/NullPointerException:<init>	()V
      //   122: athrow
      //   123: aload_0
      //   124: getfield 14	com/fimi/soul/drone/droneconnection/connection/d$1:a	Lcom/fimi/soul/drone/droneconnection/connection/d;
      //   127: invokevirtual 143	com/fimi/soul/drone/droneconnection/connection/d:h	()V
      //   130: invokestatic 146	android/os/Looper:loop	()V
      //   133: return
      //   134: iconst_0
      //   135: ifeq +11 -> 146
      //   138: new 139	java/lang/NullPointerException
      //   141: dup
      //   142: invokespecial 140	java/lang/NullPointerException:<init>	()V
      //   145: athrow
      //   146: aload_0
      //   147: getfield 14	com/fimi/soul/drone/droneconnection/connection/d$1:a	Lcom/fimi/soul/drone/droneconnection/connection/d;
      //   150: invokevirtual 143	com/fimi/soul/drone/droneconnection/connection/d:h	()V
      //   153: goto -23 -> 130
      //   156: astore_2
      //   157: iconst_0
      //   158: ifeq +11 -> 169
      //   161: new 139	java/lang/NullPointerException
      //   164: dup
      //   165: invokespecial 140	java/lang/NullPointerException:<init>	()V
      //   168: athrow
      //   169: aload_0
      //   170: getfield 14	com/fimi/soul/drone/droneconnection/connection/d$1:a	Lcom/fimi/soul/drone/droneconnection/connection/d;
      //   173: invokevirtual 143	com/fimi/soul/drone/droneconnection/connection/d:h	()V
      //   176: aload_2
      //   177: athrow
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	178	0	this	1
      //   71	8	1	i	int
      //   48	32	2	arrayOfByte	byte[]
      //   86	19	2	localIOException	IOException
      //   156	21	2	localObject	Object
      //   35	43	3	localb	com.fimi.soul.drone.c.b
      // Exception table:
      //   from	to	target	type
      //   3	49	86	java/io/IOException
      //   49	72	86	java/io/IOException
      //   76	83	86	java/io/IOException
      //   3	49	156	finally
      //   49	72	156	finally
      //   76	83	156	finally
      //   87	111	156	finally
    }
  };
  private Thread o;
  private Handler p = new Handler()
  {
    public void handleMessage(Message paramAnonymousMessage)
    {
      super.handleMessage(paramAnonymousMessage);
      if (paramAnonymousMessage.what == 1)
      {
        d.f(d.this).removeCallbacks(d.e(d.this));
        d.this.g = true;
      }
    }
  };
  private final Runnable r = new Runnable()
  {
    public void run()
    {
      if (d.d(d.this).size() < 1) {
        if (!d.g(d.this).isEmpty()) {}
      }
      Iterator localIterator;
      e locale;
      do
      {
        do
        {
          return;
          localIterator = d.g(d.this).values().iterator();
          while (localIterator.hasNext())
          {
            locale = (e)localIterator.next();
            locale.a(false);
            locale.b(false);
          }
          d.f(d.this).sendEmptyMessageDelayed(1, 1500L);
          if ((!d.d(d.this).contains(Integer.valueOf(2))) && (!d.d(d.this).contains(Integer.valueOf(3))) && (!d.d(d.this).contains(Integer.valueOf(4))) && (!d.d(d.this).contains(Integer.valueOf(5))) && (!d.d(d.this).contains(Integer.valueOf(11)))) {
            break;
          }
        } while (d.g(d.this).isEmpty());
        localIterator = d.g(d.this).values().iterator();
        while (localIterator.hasNext())
        {
          locale = (e)localIterator.next();
          locale.a(true);
          locale.b(true);
        }
      } while (d.g(d.this).isEmpty());
      if ((d.d(d.this).contains(Integer.valueOf(99))) || (d.d(d.this).contains(Integer.valueOf(98))) || (d.d(d.this).contains(Integer.valueOf(100))) || (d.d(d.this).contains(Integer.valueOf(105))))
      {
        localIterator = d.g(d.this).values().iterator();
        while (localIterator.hasNext())
        {
          locale = (e)localIterator.next();
          locale.b(true);
          locale.a(false);
        }
      }
      d.d(d.this).clear();
      d.f(d.this).postDelayed(this, 1500L);
    }
  };
  
  private void a()
  {
    Iterator localIterator = this.k.values().iterator();
    while (localIterator.hasNext()) {
      ((e)localIterator.next()).a();
    }
  }
  
  private void a(com.fimi.soul.drone.c.a.b paramb)
  {
    if (this.k.isEmpty()) {}
    for (;;)
    {
      return;
      if (this.g)
      {
        this.g = false;
        this.p.postDelayed(this.r, 1500L);
      }
      Iterator localIterator = this.k.values().iterator();
      while (localIterator.hasNext()) {
        ((e)localIterator.next()).a(paramb);
      }
    }
  }
  
  private void b()
  {
    if (this.k.isEmpty()) {}
    for (;;)
    {
      return;
      Iterator localIterator = this.k.values().iterator();
      while (localIterator.hasNext())
      {
        ((e)localIterator.next()).b();
        this.g = true;
      }
    }
  }
  
  private void b(String paramString)
  {
    if (this.k.isEmpty()) {}
    for (;;)
    {
      return;
      Iterator localIterator = this.k.values().iterator();
      while (localIterator.hasNext()) {
        ((e)localIterator.next()).a(paramString);
      }
    }
  }
  
  public void a(com.fimi.soul.drone.c.a.c paramc)
  {
    byte[] arrayOfByte = paramc.d();
    try
    {
      if (paramc.c == 18) {
        return;
      }
      if (this.f == null) {
        this.f = f();
      }
      if (this.f != null)
      {
        this.f.write(q.a());
        this.f.write("    ");
        paramc = new StringBuffer(arrayOfByte.length * 2);
        int i1 = 0;
        while (i1 < arrayOfByte.length)
        {
          paramc.append(Character.forDigit((arrayOfByte[i1] & 0xF0) >> 4, 16));
          paramc.append(Character.forDigit(arrayOfByte[i1] & 0xF, 16));
          paramc.append(" ");
          i1 += 1;
        }
        this.f.write(paramc.toString());
        this.f.write("\n");
        this.f.flush();
        return;
      }
    }
    catch (IOException paramc)
    {
      paramc.printStackTrace();
    }
  }
  
  public void a(String paramString)
  {
    this.k.remove(paramString);
  }
  
  public void a(String paramString, e parame)
  {
    this.k.put(paramString, parame);
    if (i() == 2) {
      parame.a();
    }
  }
  
  protected abstract int b(byte[] paramArrayOfByte);
  
  public void b(com.fimi.soul.drone.c.a.c paramc)
  {
    if (paramc != null)
    {
      paramc = paramc.d();
      if (paramc == null) {}
    }
    try
    {
      d(paramc);
      return;
    }
    catch (IOException paramc)
    {
      paramc.printStackTrace();
    }
  }
  
  public void c(byte[] paramArrayOfByte)
  {
    if ((paramArrayOfByte != null) && (paramArrayOfByte.length > 0)) {}
    try
    {
      d(paramArrayOfByte);
      return;
    }
    catch (IOException paramArrayOfByte)
    {
      paramArrayOfByte.printStackTrace();
    }
  }
  
  protected abstract void d();
  
  protected abstract void d(byte[] paramArrayOfByte);
  
  protected abstract void e();
  
  public BufferedWriter f()
  {
    File localFile = new File(j.a() + "/updateLog/");
    localFile.mkdirs();
    localFile = new File(localFile, q.a() + ".txt");
    if (localFile.exists()) {
      localFile.delete();
    }
    new BufferedOutputStream(new FileOutputStream(localFile));
    return new BufferedWriter(new OutputStreamWriter(new FileOutputStream(localFile)));
  }
  
  public void g()
  {
    if (this.m.compareAndSet(0, 1))
    {
      this.o = new Thread(this.n, "MiLinkConnection-Connecting Thread");
      this.o.start();
    }
  }
  
  public void h()
  {
    if ((this.m.get() == 0) || (this.o == null)) {
      return;
    }
    try
    {
      this.m.set(0);
      if ((this.o.isAlive()) && (!this.o.isInterrupted())) {
        this.o.interrupt();
      }
      e();
      b();
      return;
    }
    catch (IOException localIOException)
    {
      b(localIOException.getMessage());
    }
  }
  
  public int i()
  {
    return this.m.get();
  }
  
  public abstract int j();
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/drone/droneconnection/connection/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */