package com.fimi.kernel.b.b;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.fimi.kernel.utils.g;
import java.io.File;
import java.io.RandomAccessFile;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class b
{
  private static ExecutorService b = ;
  private static final int c = 1;
  private static final int d = 1;
  private static final int e = 2;
  private static final int f = 3;
  float a = 1.0F;
  private e g;
  private d h;
  private d i;
  private long j;
  private long k;
  private long l = this.k;
  private long m = 0L;
  private String n;
  private String o;
  private String p;
  private List<d> q;
  private List<c> r = new ArrayList();
  private Context s;
  private f t;
  private a u = a.c;
  private Object v;
  private Bitmap w;
  private String x;
  private long y = System.currentTimeMillis();
  
  private b()
  {
    if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
      this.t = new f(null);
    }
  }
  
  protected b(String paramString1, String paramString2)
  {
    this();
    this.n = paramString2;
    this.o = paramString1;
  }
  
  protected static b a(Context paramContext, String paramString)
  {
    paramString = f.a(paramContext).b(paramString);
    if (paramString != null)
    {
      paramString.s = paramContext;
      paramString.q = f.a(paramContext).c(paramString.m());
      paramContext = paramString.q.iterator();
      long l1 = 0L;
      long l2 = 0L;
      while (paramContext.hasNext())
      {
        d locald = (d)paramContext.next();
        l2 += locald.e();
        l1 = locald.d() - locald.c() + l1;
      }
      paramString.k = l2;
      paramString.j = l1;
    }
    return paramString;
  }
  
  protected static b a(Context paramContext, String paramString1, long paramLong, Boolean paramBoolean, String paramString2, e parame)
  {
    if ((parame == null) || (paramContext == null)) {
      return null;
    }
    b localb = a(paramContext, paramString1);
    if (localb != null)
    {
      localb.p = paramString1.substring(paramString1.lastIndexOf("/") + 1);
      localb.s = paramContext;
      parame.a(localb);
      return localb;
    }
    localb = new b();
    localb.s = paramContext;
    localb.o = paramString1;
    localb.n = paramString2;
    localb.p = paramString1.substring(paramString1.lastIndexOf("/") + 1);
    localb.g = parame;
    if (paramBoolean.booleanValue())
    {
      localb.p();
      return localb;
    }
    localb.a(Long.valueOf(paramLong));
    return localb;
  }
  
  protected static b a(Context paramContext, String paramString1, String paramString2, long paramLong, Boolean paramBoolean, String paramString3, e parame)
  {
    if ((parame == null) || (paramContext == null)) {
      return null;
    }
    b localb = new b();
    localb.s = paramContext;
    localb.o = paramString1;
    localb.n = paramString3;
    localb.p = paramString1.substring(paramString1.lastIndexOf("/") + 1);
    localb.g = parame;
    if (g.g(paramString3)) {
      localb.x = paramString2;
    }
    if (paramBoolean.booleanValue())
    {
      localb.p();
      return localb;
    }
    localb.a(Long.valueOf(paramLong));
    return localb;
  }
  
  private void a(Long paramLong)
  {
    new b(paramLong.longValue()).start();
  }
  
  protected static void b(Context paramContext, String paramString1, long paramLong, Boolean paramBoolean, String paramString2, e parame)
  {
    if ((parame == null) || (paramContext == null)) {
      return;
    }
    b localb = a(paramContext, paramString1);
    if (localb != null)
    {
      localb.s = paramContext;
      parame.a(localb);
      return;
    }
    localb = new b();
    localb.s = paramContext;
    localb.o = paramString1;
    localb.n = paramString2;
    localb.p = paramString1.substring(paramString1.lastIndexOf("/") + 1);
    localb.g = parame;
    if (paramBoolean.booleanValue())
    {
      localb.p();
      return;
    }
    localb.a(Long.valueOf(paramLong));
  }
  
  private void p()
  {
    new b().start();
  }
  
  private boolean q()
  {
    File localFile2 = null;
    File localFile1 = localFile2;
    try
    {
      HttpURLConnection localHttpURLConnection = (HttpURLConnection)new URL(this.o).openConnection();
      localFile1 = localFile2;
      localHttpURLConnection.setConnectTimeout(5000);
      localFile1 = localFile2;
      localHttpURLConnection.setRequestMethod("GET");
      localFile1 = localFile2;
      this.j = localHttpURLConnection.getContentLength();
      localFile1 = localFile2;
      Log.d("Good", "获取文件大小" + this.o + ":" + this.j);
      localFile1 = localFile2;
      localFile2 = g.f(this.n);
      localFile1 = localFile2;
      RandomAccessFile localRandomAccessFile = new RandomAccessFile(localFile2, "rwd");
      localFile1 = localFile2;
      localRandomAccessFile.setLength(1024L);
      localFile1 = localFile2;
      localRandomAccessFile.close();
      localFile1 = localFile2;
      localHttpURLConnection.disconnect();
      return true;
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
      Log.d("Good", "File 获取文件错误" + localException);
      if (localFile1 != null) {
        localFile1.delete();
      }
    }
    return false;
  }
  
  private boolean r()
  {
    Object localObject = null;
    try
    {
      File localFile = g.f(this.n);
      localObject = localFile;
      RandomAccessFile localRandomAccessFile = new RandomAccessFile(localFile, "rwd");
      localObject = localFile;
      localRandomAccessFile.setLength(1024L);
      localObject = localFile;
      localRandomAccessFile.close();
      return true;
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
      Log.d("Good", "File 获取文件错误" + localException);
      if (localObject != null) {
        ((File)localObject).delete();
      }
    }
    return false;
  }
  
  public String a()
  {
    return this.x;
  }
  
  public void a(Handler paramHandler)
  {
    paramHandler.post(new Runnable()
    {
      public void run()
      {
        b.a(b.this, new b.f(b.this, null));
      }
    });
  }
  
  public void a(d paramd)
  {
    this.h = paramd;
  }
  
  public void a(b paramb)
  {
    if ((paramb != null) && (paramb.r != null) && (paramb.r.size() > 0))
    {
      int i1 = this.r.size() - 1;
      while (i1 >= 0)
      {
        c.a((c)this.r.get(i1), true);
        i1 -= 1;
      }
      this.r.clear();
    }
  }
  
  public void a(Object paramObject)
  {
    this.v = paramObject;
  }
  
  public void a(String paramString)
  {
    this.x = paramString;
  }
  
  public String b()
  {
    return this.p;
  }
  
  protected void b(d paramd)
  {
    this.i = paramd;
  }
  
  public void c()
  {
    if (this.q != null) {
      if (this.u != a.d) {}
    }
    while (this.u != a.a)
    {
      return;
      this.u = a.d;
      Iterator localIterator = this.q.iterator();
      while (localIterator.hasNext())
      {
        Object localObject = (d)localIterator.next();
        if (((d)localObject).c() + ((d)localObject).e() < ((d)localObject).d())
        {
          localObject = new c((d)localObject);
          b.execute((Runnable)localObject);
          this.r.add(localObject);
        }
      }
    }
    Log.d("Good", "重新初始化任务信息");
    p();
  }
  
  public void d()
  {
    this.u = a.c;
  }
  
  public void e()
  {
    this.u = a.b;
  }
  
  public void f()
  {
    this.u = a.e;
  }
  
  public a g()
  {
    return this.u;
  }
  
  public String h()
  {
    return this.n;
  }
  
  public long i()
  {
    return this.j;
  }
  
  public Object j()
  {
    return this.v;
  }
  
  public long k()
  {
    return this.k;
  }
  
  public long l()
  {
    return this.m;
  }
  
  public String m()
  {
    return this.o;
  }
  
  public Bitmap n()
  {
    return this.w;
  }
  
  public d o()
  {
    return this.h;
  }
  
  public String toString()
  {
    return "DownloadTaskInfo{fileSize=" + this.j + ", complete=" + this.k + ", urlstring='" + this.o + '\'' + '}';
  }
  
  public static enum a
  {
    private a() {}
  }
  
  private class b
    extends Thread
  {
    Boolean a = Boolean.valueOf(false);
    Boolean b = Boolean.valueOf(true);
    
    public b()
    {
      this.a = Boolean.valueOf(true);
    }
    
    public b(long paramLong)
    {
      b.a(b.this, paramLong);
      this.a = Boolean.valueOf(false);
    }
    
    public void run()
    {
      int i = 0;
      Message localMessage = new Message();
      localMessage.what = 1;
      if (this.a.booleanValue()) {
        this.b = Boolean.valueOf(b.b(b.this));
      }
      while (this.b.booleanValue())
      {
        long l = b.d(b.this) / 1;
        b.a(b.this, new ArrayList());
        for (;;)
        {
          if (i < 1)
          {
            localObject = new d(i, i * l, (i + 1) * l, 0L, b.e(b.this));
            b.f(b.this).add(localObject);
            i += 1;
            continue;
            this.b = Boolean.valueOf(b.c(b.this));
            break;
          }
        }
        Object localObject = f.a(b.g(b.this));
        ((f)localObject).a(b.f(b.this));
        ((f)localObject).a(b.this);
        b.b(b.this, 0L);
      }
      for (localMessage.arg1 = 1;; localMessage.arg1 = 0)
      {
        if (b.h(b.this) != null) {
          b.h(b.this).sendMessage(localMessage);
        }
        return;
      }
    }
  }
  
  private class c
    implements Runnable
  {
    private boolean b = false;
    private d c;
    
    public c(d paramd)
    {
      this.c = paramd;
    }
    
    /* Error */
    public void run()
    {
      // Byte code:
      //   0: aconst_null
      //   1: astore 11
      //   3: aconst_null
      //   4: astore 12
      //   6: aconst_null
      //   7: astore 13
      //   9: aload_0
      //   10: getfield 27	com/fimi/kernel/b/b/b$c:c	Lcom/fimi/kernel/b/b/d;
      //   13: invokevirtual 41	com/fimi/kernel/b/b/d:e	()J
      //   16: lstore_3
      //   17: aload_0
      //   18: getfield 27	com/fimi/kernel/b/b/b$c:c	Lcom/fimi/kernel/b/b/d;
      //   21: invokevirtual 43	com/fimi/kernel/b/b/d:c	()J
      //   24: lstore 5
      //   26: aload_0
      //   27: getfield 27	com/fimi/kernel/b/b/b$c:c	Lcom/fimi/kernel/b/b/d;
      //   30: invokevirtual 46	com/fimi/kernel/b/b/d:d	()J
      //   33: lstore 7
      //   35: new 48	java/net/URL
      //   38: dup
      //   39: aload_0
      //   40: getfield 27	com/fimi/kernel/b/b/b$c:c	Lcom/fimi/kernel/b/b/d;
      //   43: invokevirtual 51	com/fimi/kernel/b/b/d:a	()Ljava/lang/String;
      //   46: invokespecial 54	java/net/URL:<init>	(Ljava/lang/String;)V
      //   49: invokevirtual 58	java/net/URL:openConnection	()Ljava/net/URLConnection;
      //   52: checkcast 60	java/net/HttpURLConnection
      //   55: astore 10
      //   57: aload 13
      //   59: astore 11
      //   61: aload 10
      //   63: sipush 3000
      //   66: invokevirtual 64	java/net/HttpURLConnection:setConnectTimeout	(I)V
      //   69: aload 13
      //   71: astore 11
      //   73: aload 10
      //   75: sipush 3000
      //   78: invokevirtual 67	java/net/HttpURLConnection:setReadTimeout	(I)V
      //   81: aload 13
      //   83: astore 11
      //   85: aload 10
      //   87: ldc 69
      //   89: invokevirtual 72	java/net/HttpURLConnection:setRequestMethod	(Ljava/lang/String;)V
      //   92: aload 13
      //   94: astore 11
      //   96: aload 10
      //   98: ldc 74
      //   100: new 76	java/lang/StringBuilder
      //   103: dup
      //   104: invokespecial 77	java/lang/StringBuilder:<init>	()V
      //   107: ldc 79
      //   109: invokevirtual 83	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   112: lload 5
      //   114: lload_3
      //   115: ladd
      //   116: invokevirtual 86	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
      //   119: ldc 88
      //   121: invokevirtual 83	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   124: lload 7
      //   126: invokevirtual 86	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
      //   129: invokevirtual 91	java/lang/StringBuilder:toString	()Ljava/lang/String;
      //   132: invokevirtual 95	java/net/HttpURLConnection:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
      //   135: aload 13
      //   137: astore 11
      //   139: new 97	java/io/RandomAccessFile
      //   142: dup
      //   143: aload_0
      //   144: getfield 20	com/fimi/kernel/b/b/b$c:a	Lcom/fimi/kernel/b/b/b;
      //   147: invokevirtual 100	com/fimi/kernel/b/b/b:h	()Ljava/lang/String;
      //   150: ldc 102
      //   152: invokespecial 104	java/io/RandomAccessFile:<init>	(Ljava/lang/String;Ljava/lang/String;)V
      //   155: astore 14
      //   157: aload 13
      //   159: astore 11
      //   161: aload 14
      //   163: lload 5
      //   165: lload_3
      //   166: ladd
      //   167: invokevirtual 108	java/io/RandomAccessFile:seek	(J)V
      //   170: aload 13
      //   172: astore 11
      //   174: aload 10
      //   176: invokevirtual 112	java/net/HttpURLConnection:getInputStream	()Ljava/io/InputStream;
      //   179: astore 12
      //   181: aload 12
      //   183: astore 11
      //   185: sipush 5120
      //   188: newarray <illegal type>
      //   190: astore 13
      //   192: aload 12
      //   194: astore 11
      //   196: aload 12
      //   198: aload 13
      //   200: invokevirtual 118	java/io/InputStream:read	([B)I
      //   203: istore_2
      //   204: iload_2
      //   205: iconst_m1
      //   206: if_icmpeq +18 -> 224
      //   209: aload 12
      //   211: astore 11
      //   213: aload_0
      //   214: getfield 25	com/fimi/kernel/b/b/b$c:b	Z
      //   217: istore 9
      //   219: iload 9
      //   221: ifeq +14 -> 235
      //   224: aload 10
      //   226: invokevirtual 121	java/net/HttpURLConnection:disconnect	()V
      //   229: aload 12
      //   231: invokevirtual 124	java/io/InputStream:close	()V
      //   234: return
      //   235: aload 12
      //   237: astore 11
      //   239: aload 14
      //   241: aload 13
      //   243: iconst_0
      //   244: iload_2
      //   245: invokevirtual 128	java/io/RandomAccessFile:write	([BII)V
      //   248: lload_3
      //   249: iload_2
      //   250: i2l
      //   251: ladd
      //   252: lstore_3
      //   253: aload 12
      //   255: astore 11
      //   257: aload_0
      //   258: getfield 27	com/fimi/kernel/b/b/b$c:c	Lcom/fimi/kernel/b/b/d;
      //   261: lload_3
      //   262: invokevirtual 130	com/fimi/kernel/b/b/d:c	(J)V
      //   265: aload 12
      //   267: astore 11
      //   269: aload_0
      //   270: getfield 20	com/fimi/kernel/b/b/b$c:a	Lcom/fimi/kernel/b/b/b;
      //   273: invokestatic 134	com/fimi/kernel/b/b/b:f	(Lcom/fimi/kernel/b/b/b;)Ljava/util/List;
      //   276: astore 15
      //   278: aload 12
      //   280: astore 11
      //   282: aload 15
      //   284: monitorenter
      //   285: aload_0
      //   286: getfield 20	com/fimi/kernel/b/b/b$c:a	Lcom/fimi/kernel/b/b/b;
      //   289: invokestatic 134	com/fimi/kernel/b/b/b:f	(Lcom/fimi/kernel/b/b/b;)Ljava/util/List;
      //   292: invokeinterface 140 1 0
      //   297: astore 11
      //   299: iconst_0
      //   300: istore_1
      //   301: aload 11
      //   303: invokeinterface 146 1 0
      //   308: ifeq +28 -> 336
      //   311: aload 11
      //   313: invokeinterface 150 1 0
      //   318: checkcast 37	com/fimi/kernel/b/b/d
      //   321: astore 16
      //   323: iload_1
      //   324: i2l
      //   325: aload 16
      //   327: invokevirtual 41	com/fimi/kernel/b/b/d:e	()J
      //   330: ladd
      //   331: l2i
      //   332: istore_1
      //   333: goto -32 -> 301
      //   336: aload 15
      //   338: monitorexit
      //   339: aload 12
      //   341: astore 11
      //   343: aload_0
      //   344: getfield 20	com/fimi/kernel/b/b/b$c:a	Lcom/fimi/kernel/b/b/b;
      //   347: iload_1
      //   348: i2l
      //   349: invokestatic 153	com/fimi/kernel/b/b/b:b	(Lcom/fimi/kernel/b/b/b;J)J
      //   352: pop2
      //   353: aload 12
      //   355: astore 11
      //   357: aload_0
      //   358: getfield 20	com/fimi/kernel/b/b/b$c:a	Lcom/fimi/kernel/b/b/b;
      //   361: invokestatic 158	java/lang/System:currentTimeMillis	()J
      //   364: aload_0
      //   365: getfield 20	com/fimi/kernel/b/b/b$c:a	Lcom/fimi/kernel/b/b/b;
      //   368: invokestatic 162	com/fimi/kernel/b/b/b:i	(Lcom/fimi/kernel/b/b/b;)J
      //   371: lsub
      //   372: ldc2_w 163
      //   375: ldiv
      //   376: l2f
      //   377: putfield 167	com/fimi/kernel/b/b/b:a	F
      //   380: aload 12
      //   382: astore 11
      //   384: aload_0
      //   385: getfield 20	com/fimi/kernel/b/b/b$c:a	Lcom/fimi/kernel/b/b/b;
      //   388: getfield 167	com/fimi/kernel/b/b/b:a	F
      //   391: fconst_1
      //   392: fcmpl
      //   393: iflt +89 -> 482
      //   396: aload 12
      //   398: astore 11
      //   400: aload_0
      //   401: getfield 20	com/fimi/kernel/b/b/b$c:a	Lcom/fimi/kernel/b/b/b;
      //   404: invokestatic 158	java/lang/System:currentTimeMillis	()J
      //   407: invokestatic 169	com/fimi/kernel/b/b/b:c	(Lcom/fimi/kernel/b/b/b;J)J
      //   410: pop2
      //   411: aload 12
      //   413: astore 11
      //   415: aload_0
      //   416: getfield 20	com/fimi/kernel/b/b/b$c:a	Lcom/fimi/kernel/b/b/b;
      //   419: aload_0
      //   420: getfield 20	com/fimi/kernel/b/b/b$c:a	Lcom/fimi/kernel/b/b/b;
      //   423: invokestatic 172	com/fimi/kernel/b/b/b:j	(Lcom/fimi/kernel/b/b/b;)J
      //   426: aload_0
      //   427: getfield 20	com/fimi/kernel/b/b/b$c:a	Lcom/fimi/kernel/b/b/b;
      //   430: invokestatic 175	com/fimi/kernel/b/b/b:k	(Lcom/fimi/kernel/b/b/b;)J
      //   433: lsub
      //   434: l2f
      //   435: aload_0
      //   436: getfield 20	com/fimi/kernel/b/b/b$c:a	Lcom/fimi/kernel/b/b/b;
      //   439: getfield 167	com/fimi/kernel/b/b/b:a	F
      //   442: fdiv
      //   443: f2l
      //   444: invokestatic 177	com/fimi/kernel/b/b/b:d	(Lcom/fimi/kernel/b/b/b;J)J
      //   447: pop2
      //   448: aload 12
      //   450: astore 11
      //   452: aload_0
      //   453: getfield 20	com/fimi/kernel/b/b/b$c:a	Lcom/fimi/kernel/b/b/b;
      //   456: aload_0
      //   457: getfield 20	com/fimi/kernel/b/b/b$c:a	Lcom/fimi/kernel/b/b/b;
      //   460: invokestatic 172	com/fimi/kernel/b/b/b:j	(Lcom/fimi/kernel/b/b/b;)J
      //   463: invokestatic 179	com/fimi/kernel/b/b/b:e	(Lcom/fimi/kernel/b/b/b;J)J
      //   466: pop2
      //   467: aload 12
      //   469: astore 11
      //   471: new 11	com/fimi/kernel/b/b/b$c$1
      //   474: dup
      //   475: aload_0
      //   476: invokespecial 182	com/fimi/kernel/b/b/b$c$1:<init>	(Lcom/fimi/kernel/b/b/b$c;)V
      //   479: invokestatic 187	com/fimi/kernel/utils/x:a	(Ljava/lang/Runnable;)V
      //   482: aload 12
      //   484: astore 11
      //   486: invokestatic 193	android/os/Message:obtain	()Landroid/os/Message;
      //   489: astore 15
      //   491: aload 12
      //   493: astore 11
      //   495: aload 15
      //   497: iconst_2
      //   498: putfield 197	android/os/Message:what	I
      //   501: aload 12
      //   503: astore 11
      //   505: aload 15
      //   507: iload_2
      //   508: putfield 200	android/os/Message:arg1	I
      //   511: aload 12
      //   513: astore 11
      //   515: aload_0
      //   516: getfield 20	com/fimi/kernel/b/b/b$c:a	Lcom/fimi/kernel/b/b/b;
      //   519: invokestatic 172	com/fimi/kernel/b/b/b:j	(Lcom/fimi/kernel/b/b/b;)J
      //   522: lstore 5
      //   524: aload 12
      //   526: astore 11
      //   528: aload_0
      //   529: getfield 20	com/fimi/kernel/b/b/b$c:a	Lcom/fimi/kernel/b/b/b;
      //   532: invokestatic 202	com/fimi/kernel/b/b/b:d	(Lcom/fimi/kernel/b/b/b;)J
      //   535: lstore 7
      //   537: lload 5
      //   539: lload 7
      //   541: lcmp
      //   542: iflt +158 -> 700
      //   545: aload 12
      //   547: astore 11
      //   549: aload_0
      //   550: getfield 20	com/fimi/kernel/b/b/b$c:a	Lcom/fimi/kernel/b/b/b;
      //   553: invokestatic 206	com/fimi/kernel/b/b/b:l	(Lcom/fimi/kernel/b/b/b;)Landroid/graphics/Bitmap;
      //   556: ifnonnull +72 -> 628
      //   559: aload 12
      //   561: astore 11
      //   563: aload_0
      //   564: getfield 20	com/fimi/kernel/b/b/b$c:a	Lcom/fimi/kernel/b/b/b;
      //   567: invokestatic 210	com/fimi/kernel/b/b/b:m	(Lcom/fimi/kernel/b/b/b;)Ljava/lang/String;
      //   570: invokestatic 216	com/fimi/kernel/utils/g:g	(Ljava/lang/String;)Z
      //   573: ifeq +329 -> 902
      //   576: aload 12
      //   578: astore 11
      //   580: aload_0
      //   581: getfield 20	com/fimi/kernel/b/b/b$c:a	Lcom/fimi/kernel/b/b/b;
      //   584: aload_0
      //   585: getfield 20	com/fimi/kernel/b/b/b$c:a	Lcom/fimi/kernel/b/b/b;
      //   588: invokestatic 210	com/fimi/kernel/b/b/b:m	(Lcom/fimi/kernel/b/b/b;)Ljava/lang/String;
      //   591: iconst_1
      //   592: invokestatic 222	android/media/ThumbnailUtils:createVideoThumbnail	(Ljava/lang/String;I)Landroid/graphics/Bitmap;
      //   595: invokestatic 225	com/fimi/kernel/b/b/b:a	(Lcom/fimi/kernel/b/b/b;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;
      //   598: pop
      //   599: aload 12
      //   601: astore 11
      //   603: aload_0
      //   604: getfield 20	com/fimi/kernel/b/b/b$c:a	Lcom/fimi/kernel/b/b/b;
      //   607: aload_0
      //   608: getfield 20	com/fimi/kernel/b/b/b$c:a	Lcom/fimi/kernel/b/b/b;
      //   611: invokestatic 228	com/fimi/kernel/b/b/b:g	(Lcom/fimi/kernel/b/b/b;)Landroid/content/Context;
      //   614: aload_0
      //   615: getfield 20	com/fimi/kernel/b/b/b$c:a	Lcom/fimi/kernel/b/b/b;
      //   618: invokestatic 210	com/fimi/kernel/b/b/b:m	(Lcom/fimi/kernel/b/b/b;)Ljava/lang/String;
      //   621: invokestatic 233	com/fimi/kernel/utils/s:a	(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
      //   624: invokestatic 236	com/fimi/kernel/b/b/b:a	(Lcom/fimi/kernel/b/b/b;Ljava/lang/String;)Ljava/lang/String;
      //   627: pop
      //   628: aload 12
      //   630: astore 11
      //   632: aload_0
      //   633: getfield 20	com/fimi/kernel/b/b/b$c:a	Lcom/fimi/kernel/b/b/b;
      //   636: invokestatic 228	com/fimi/kernel/b/b/b:g	(Lcom/fimi/kernel/b/b/b;)Landroid/content/Context;
      //   639: invokestatic 241	com/fimi/kernel/b/b/f:a	(Landroid/content/Context;)Lcom/fimi/kernel/b/b/f;
      //   642: aload_0
      //   643: getfield 20	com/fimi/kernel/b/b/b$c:a	Lcom/fimi/kernel/b/b/b;
      //   646: invokestatic 243	com/fimi/kernel/b/b/b:e	(Lcom/fimi/kernel/b/b/b;)Ljava/lang/String;
      //   649: invokevirtual 245	com/fimi/kernel/b/b/f:d	(Ljava/lang/String;)V
      //   652: aload 12
      //   654: astore 11
      //   656: new 247	android/content/Intent
      //   659: dup
      //   660: ldc -7
      //   662: new 251	java/io/File
      //   665: dup
      //   666: aload_0
      //   667: getfield 20	com/fimi/kernel/b/b/b$c:a	Lcom/fimi/kernel/b/b/b;
      //   670: invokevirtual 100	com/fimi/kernel/b/b/b:h	()Ljava/lang/String;
      //   673: invokespecial 252	java/io/File:<init>	(Ljava/lang/String;)V
      //   676: invokestatic 258	android/net/Uri:fromFile	(Ljava/io/File;)Landroid/net/Uri;
      //   679: invokespecial 261	android/content/Intent:<init>	(Ljava/lang/String;Landroid/net/Uri;)V
      //   682: astore 16
      //   684: aload 12
      //   686: astore 11
      //   688: aload_0
      //   689: getfield 20	com/fimi/kernel/b/b/b$c:a	Lcom/fimi/kernel/b/b/b;
      //   692: invokestatic 228	com/fimi/kernel/b/b/b:g	(Lcom/fimi/kernel/b/b/b;)Landroid/content/Context;
      //   695: aload 16
      //   697: invokevirtual 267	android/content/Context:sendBroadcast	(Landroid/content/Intent;)V
      //   700: aload 12
      //   702: astore 11
      //   704: aload_0
      //   705: getfield 20	com/fimi/kernel/b/b/b$c:a	Lcom/fimi/kernel/b/b/b;
      //   708: invokestatic 270	com/fimi/kernel/b/b/b:h	(Lcom/fimi/kernel/b/b/b;)Lcom/fimi/kernel/b/b/b$f;
      //   711: ifnull +20 -> 731
      //   714: aload 12
      //   716: astore 11
      //   718: aload_0
      //   719: getfield 20	com/fimi/kernel/b/b/b$c:a	Lcom/fimi/kernel/b/b/b;
      //   722: invokestatic 270	com/fimi/kernel/b/b/b:h	(Lcom/fimi/kernel/b/b/b;)Lcom/fimi/kernel/b/b/b$f;
      //   725: aload 15
      //   727: invokevirtual 276	com/fimi/kernel/b/b/b$f:sendMessage	(Landroid/os/Message;)Z
      //   730: pop
      //   731: aload 12
      //   733: astore 11
      //   735: aload_0
      //   736: getfield 20	com/fimi/kernel/b/b/b$c:a	Lcom/fimi/kernel/b/b/b;
      //   739: invokestatic 280	com/fimi/kernel/b/b/b:n	(Lcom/fimi/kernel/b/b/b;)Lcom/fimi/kernel/b/b/b$a;
      //   742: astore 15
      //   744: aload 12
      //   746: astore 11
      //   748: getstatic 285	com/fimi/kernel/b/b/b$a:b	Lcom/fimi/kernel/b/b/b$a;
      //   751: astore 16
      //   753: aload 15
      //   755: aload 16
      //   757: if_acmpne -565 -> 192
      //   760: goto -536 -> 224
      //   763: astore 13
      //   765: aload 15
      //   767: monitorexit
      //   768: aload 12
      //   770: astore 11
      //   772: aload 13
      //   774: athrow
      //   775: astore 13
      //   777: aload 10
      //   779: astore 11
      //   781: aload 12
      //   783: astore 10
      //   785: aload 13
      //   787: astore 12
      //   789: aload 12
      //   791: invokevirtual 288	java/lang/Exception:printStackTrace	()V
      //   794: ldc_w 290
      //   797: new 76	java/lang/StringBuilder
      //   800: dup
      //   801: invokespecial 77	java/lang/StringBuilder:<init>	()V
      //   804: ldc_w 292
      //   807: invokevirtual 83	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   810: aload 12
      //   812: invokevirtual 295	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
      //   815: ldc_w 297
      //   818: invokevirtual 83	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   821: aload_0
      //   822: getfield 27	com/fimi/kernel/b/b/b$c:c	Lcom/fimi/kernel/b/b/d;
      //   825: invokevirtual 300	com/fimi/kernel/b/b/d:b	()I
      //   828: invokevirtual 303	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
      //   831: invokevirtual 91	java/lang/StringBuilder:toString	()Ljava/lang/String;
      //   834: invokestatic 308	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;)I
      //   837: pop
      //   838: invokestatic 193	android/os/Message:obtain	()Landroid/os/Message;
      //   841: astore 12
      //   843: aload_0
      //   844: getfield 20	com/fimi/kernel/b/b/b$c:a	Lcom/fimi/kernel/b/b/b;
      //   847: getstatic 310	com/fimi/kernel/b/b/b$a:a	Lcom/fimi/kernel/b/b/b$a;
      //   850: invokestatic 313	com/fimi/kernel/b/b/b:a	(Lcom/fimi/kernel/b/b/b;Lcom/fimi/kernel/b/b/b$a;)Lcom/fimi/kernel/b/b/b$a;
      //   853: pop
      //   854: aload 12
      //   856: iconst_3
      //   857: putfield 197	android/os/Message:what	I
      //   860: aload_0
      //   861: getfield 20	com/fimi/kernel/b/b/b$c:a	Lcom/fimi/kernel/b/b/b;
      //   864: invokestatic 270	com/fimi/kernel/b/b/b:h	(Lcom/fimi/kernel/b/b/b;)Lcom/fimi/kernel/b/b/b$f;
      //   867: ifnull +16 -> 883
      //   870: aload_0
      //   871: getfield 20	com/fimi/kernel/b/b/b$c:a	Lcom/fimi/kernel/b/b/b;
      //   874: invokestatic 270	com/fimi/kernel/b/b/b:h	(Lcom/fimi/kernel/b/b/b;)Lcom/fimi/kernel/b/b/b$f;
      //   877: aload 12
      //   879: invokevirtual 276	com/fimi/kernel/b/b/b$f:sendMessage	(Landroid/os/Message;)Z
      //   882: pop
      //   883: aload 11
      //   885: invokevirtual 121	java/net/HttpURLConnection:disconnect	()V
      //   888: aload 10
      //   890: invokevirtual 124	java/io/InputStream:close	()V
      //   893: return
      //   894: astore 10
      //   896: aload 10
      //   898: invokevirtual 288	java/lang/Exception:printStackTrace	()V
      //   901: return
      //   902: aload 12
      //   904: astore 11
      //   906: aload_0
      //   907: getfield 20	com/fimi/kernel/b/b/b$c:a	Lcom/fimi/kernel/b/b/b;
      //   910: aload_0
      //   911: getfield 20	com/fimi/kernel/b/b/b$c:a	Lcom/fimi/kernel/b/b/b;
      //   914: invokestatic 228	com/fimi/kernel/b/b/b:g	(Lcom/fimi/kernel/b/b/b;)Landroid/content/Context;
      //   917: aload_0
      //   918: getfield 20	com/fimi/kernel/b/b/b$c:a	Lcom/fimi/kernel/b/b/b;
      //   921: invokestatic 210	com/fimi/kernel/b/b/b:m	(Lcom/fimi/kernel/b/b/b;)Ljava/lang/String;
      //   924: sipush 160
      //   927: invokestatic 316	com/fimi/kernel/utils/s:a	(Landroid/content/Context;Ljava/lang/String;I)Landroid/graphics/Bitmap;
      //   930: invokestatic 225	com/fimi/kernel/b/b/b:a	(Lcom/fimi/kernel/b/b/b;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;
      //   933: pop
      //   934: goto -306 -> 628
      //   937: astore 16
      //   939: aload 12
      //   941: astore 11
      //   943: aload 16
      //   945: invokevirtual 317	java/io/IOException:printStackTrace	()V
      //   948: goto -320 -> 628
      //   951: astore 13
      //   953: aload 11
      //   955: astore 12
      //   957: aload 10
      //   959: astore 11
      //   961: aload 13
      //   963: astore 10
      //   965: aload 11
      //   967: invokevirtual 121	java/net/HttpURLConnection:disconnect	()V
      //   970: aload 12
      //   972: invokevirtual 124	java/io/InputStream:close	()V
      //   975: aload 10
      //   977: athrow
      //   978: astore 10
      //   980: aload 10
      //   982: invokevirtual 288	java/lang/Exception:printStackTrace	()V
      //   985: return
      //   986: astore 11
      //   988: aload 11
      //   990: invokevirtual 288	java/lang/Exception:printStackTrace	()V
      //   993: goto -18 -> 975
      //   996: astore 10
      //   998: goto -33 -> 965
      //   1001: astore 13
      //   1003: aload 10
      //   1005: astore 12
      //   1007: aload 13
      //   1009: astore 10
      //   1011: goto -46 -> 965
      //   1014: astore 12
      //   1016: aconst_null
      //   1017: astore 11
      //   1019: aconst_null
      //   1020: astore 10
      //   1022: goto -233 -> 789
      //   1025: astore 12
      //   1027: aconst_null
      //   1028: astore 13
      //   1030: aload 10
      //   1032: astore 11
      //   1034: aload 13
      //   1036: astore 10
      //   1038: goto -249 -> 789
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	1041	0	this	c
      //   300	48	1	i	int
      //   203	305	2	j	int
      //   16	246	3	l1	long
      //   24	514	5	l2	long
      //   33	507	7	l3	long
      //   217	3	9	bool	boolean
      //   55	834	10	localObject1	Object
      //   894	64	10	localException1	Exception
      //   963	13	10	localObject2	Object
      //   978	3	10	localException2	Exception
      //   996	8	10	localObject3	Object
      //   1009	28	10	localObject4	Object
      //   1	965	11	localObject5	Object
      //   986	3	11	localException3	Exception
      //   1017	16	11	localObject6	Object
      //   4	1002	12	localObject7	Object
      //   1014	1	12	localException4	Exception
      //   1025	1	12	localException5	Exception
      //   7	235	13	arrayOfByte	byte[]
      //   763	10	13	localObject8	Object
      //   775	11	13	localException6	Exception
      //   951	11	13	localObject9	Object
      //   1001	7	13	localObject10	Object
      //   1028	7	13	localObject11	Object
      //   155	85	14	localRandomAccessFile	RandomAccessFile
      //   276	490	15	localObject12	Object
      //   321	435	16	localObject13	Object
      //   937	7	16	localIOException	java.io.IOException
      // Exception table:
      //   from	to	target	type
      //   285	299	763	finally
      //   301	333	763	finally
      //   336	339	763	finally
      //   765	768	763	finally
      //   185	192	775	java/lang/Exception
      //   196	204	775	java/lang/Exception
      //   213	219	775	java/lang/Exception
      //   239	248	775	java/lang/Exception
      //   257	265	775	java/lang/Exception
      //   269	278	775	java/lang/Exception
      //   282	285	775	java/lang/Exception
      //   343	353	775	java/lang/Exception
      //   357	380	775	java/lang/Exception
      //   384	396	775	java/lang/Exception
      //   400	411	775	java/lang/Exception
      //   415	448	775	java/lang/Exception
      //   452	467	775	java/lang/Exception
      //   471	482	775	java/lang/Exception
      //   486	491	775	java/lang/Exception
      //   495	501	775	java/lang/Exception
      //   505	511	775	java/lang/Exception
      //   515	524	775	java/lang/Exception
      //   528	537	775	java/lang/Exception
      //   549	559	775	java/lang/Exception
      //   563	576	775	java/lang/Exception
      //   580	599	775	java/lang/Exception
      //   603	628	775	java/lang/Exception
      //   632	652	775	java/lang/Exception
      //   656	684	775	java/lang/Exception
      //   688	700	775	java/lang/Exception
      //   704	714	775	java/lang/Exception
      //   718	731	775	java/lang/Exception
      //   735	744	775	java/lang/Exception
      //   748	753	775	java/lang/Exception
      //   772	775	775	java/lang/Exception
      //   906	934	775	java/lang/Exception
      //   943	948	775	java/lang/Exception
      //   883	893	894	java/lang/Exception
      //   549	559	937	java/io/IOException
      //   563	576	937	java/io/IOException
      //   580	599	937	java/io/IOException
      //   603	628	937	java/io/IOException
      //   906	934	937	java/io/IOException
      //   61	69	951	finally
      //   73	81	951	finally
      //   85	92	951	finally
      //   96	135	951	finally
      //   139	157	951	finally
      //   161	170	951	finally
      //   174	181	951	finally
      //   185	192	951	finally
      //   196	204	951	finally
      //   213	219	951	finally
      //   239	248	951	finally
      //   257	265	951	finally
      //   269	278	951	finally
      //   282	285	951	finally
      //   343	353	951	finally
      //   357	380	951	finally
      //   384	396	951	finally
      //   400	411	951	finally
      //   415	448	951	finally
      //   452	467	951	finally
      //   471	482	951	finally
      //   486	491	951	finally
      //   495	501	951	finally
      //   505	511	951	finally
      //   515	524	951	finally
      //   528	537	951	finally
      //   549	559	951	finally
      //   563	576	951	finally
      //   580	599	951	finally
      //   603	628	951	finally
      //   632	652	951	finally
      //   656	684	951	finally
      //   688	700	951	finally
      //   704	714	951	finally
      //   718	731	951	finally
      //   735	744	951	finally
      //   748	753	951	finally
      //   772	775	951	finally
      //   906	934	951	finally
      //   943	948	951	finally
      //   224	234	978	java/lang/Exception
      //   965	975	986	java/lang/Exception
      //   17	57	996	finally
      //   789	883	1001	finally
      //   17	57	1014	java/lang/Exception
      //   61	69	1025	java/lang/Exception
      //   73	81	1025	java/lang/Exception
      //   85	92	1025	java/lang/Exception
      //   96	135	1025	java/lang/Exception
      //   139	157	1025	java/lang/Exception
      //   161	170	1025	java/lang/Exception
      //   174	181	1025	java/lang/Exception
    }
  }
  
  public static abstract interface d
  {
    public abstract void a(b.a parama, b paramb);
  }
  
  public static abstract interface e
  {
    public abstract void a(b paramb);
  }
  
  private class f
    extends Handler
  {
    private f() {}
    
    public void handleMessage(Message paramMessage)
    {
      if (paramMessage.what == 1)
      {
        b localb = null;
        if (paramMessage.arg1 == 1) {
          localb = b.this;
        }
        b.o(b.this).a(localb);
      }
      if (paramMessage.what == 2)
      {
        if (b.j(b.this) >= b.d(b.this)) {
          b.a(b.this, b.a.e);
        }
        if (b.p(b.this) != null) {
          b.p(b.this).a(b.n(b.this), b.this);
        }
        if (b.q(b.this) != null) {
          b.q(b.this).a(b.n(b.this), b.this);
        }
      }
      if ((paramMessage.what == 3) && (b.q(b.this) != null)) {
        b.q(b.this).a(b.n(b.this), b.this);
      }
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/kernel/b/b/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */