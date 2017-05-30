package com.b.a.a.a.a.a;

import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

final class a
  implements Closeable
{
  private static final OutputStream B = new OutputStream()
  {
    public void write(int paramAnonymousInt) {}
  };
  static final String a = "journal";
  static final String b = "journal.tmp";
  static final String c = "journal.bkp";
  static final String d = "libcore.io.DiskLruCache";
  static final String e = "1";
  static final long f = -1L;
  static final Pattern g = Pattern.compile("[a-z0-9_-]{1,64}");
  private static final String i = "CLEAN";
  private static final String j = "DIRTY";
  private static final String k = "REMOVE";
  private static final String l = "READ";
  private final Callable<Void> A = new Callable()
  {
    public Void a()
    {
      synchronized (a.this)
      {
        if (a.a(a.this) == null) {
          return null;
        }
        a.b(a.this);
        a.c(a.this);
        if (a.d(a.this))
        {
          a.e(a.this);
          a.a(a.this, 0);
        }
        return null;
      }
    }
  };
  final ThreadPoolExecutor h = new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue());
  private final File m;
  private final File n;
  private final File o;
  private final File p;
  private final int q;
  private long r;
  private int s;
  private final int t;
  private long u = 0L;
  private int v = 0;
  private Writer w;
  private final LinkedHashMap<String, b> x = new LinkedHashMap(0, 0.75F, true);
  private int y;
  private long z = 0L;
  
  private a(File paramFile, int paramInt1, int paramInt2, long paramLong, int paramInt3)
  {
    this.m = paramFile;
    this.q = paramInt1;
    this.n = new File(paramFile, "journal");
    this.o = new File(paramFile, "journal.tmp");
    this.p = new File(paramFile, "journal.bkp");
    this.t = paramInt2;
    this.r = paramLong;
    this.s = paramInt3;
  }
  
  private a a(String paramString, long paramLong)
  {
    for (;;)
    {
      a locala;
      try
      {
        n();
        e(paramString);
        b localb = (b)this.x.get(paramString);
        if (paramLong != -1L) {
          if (localb != null)
          {
            long l1 = b.e(localb);
            if (l1 == paramLong) {}
          }
          else
          {
            paramString = null;
            return paramString;
          }
        }
        if (localb == null)
        {
          localb = new b(paramString, null);
          this.x.put(paramString, localb);
          locala = new a(localb, null);
          b.a(localb, locala);
          this.w.write("DIRTY " + paramString + '\n');
          this.w.flush();
          paramString = locala;
          continue;
        }
        locala = b.a(localb);
      }
      finally {}
      if (locala != null) {
        paramString = null;
      }
    }
  }
  
  public static a a(File paramFile, int paramInt1, int paramInt2, long paramLong, int paramInt3)
  {
    if (paramLong <= 0L) {
      throw new IllegalArgumentException("maxSize <= 0");
    }
    if (paramInt3 <= 0) {
      throw new IllegalArgumentException("maxFileCount <= 0");
    }
    if (paramInt2 <= 0) {
      throw new IllegalArgumentException("valueCount <= 0");
    }
    Object localObject = new File(paramFile, "journal.bkp");
    File localFile;
    if (((File)localObject).exists())
    {
      localFile = new File(paramFile, "journal");
      if (!localFile.exists()) {
        break label165;
      }
      ((File)localObject).delete();
    }
    for (;;)
    {
      localObject = new a(paramFile, paramInt1, paramInt2, paramLong, paramInt3);
      if (!((a)localObject).n.exists()) {
        break label229;
      }
      try
      {
        ((a)localObject).j();
        ((a)localObject).k();
        ((a)localObject).w = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(((a)localObject).n, true), d.a));
        return (a)localObject;
      }
      catch (IOException localIOException)
      {
        label165:
        System.out.println("DiskLruCache " + paramFile + " is corrupt: " + localIOException.getMessage() + ", removing");
        ((a)localObject).h();
      }
      a((File)localObject, localFile, false);
    }
    label229:
    paramFile.mkdirs();
    paramFile = new a(paramFile, paramInt1, paramInt2, paramLong, paramInt3);
    paramFile.l();
    return paramFile;
  }
  
  private void a(a parama, boolean paramBoolean)
  {
    int i3 = 0;
    b localb;
    try
    {
      localb = a.a(parama);
      if (b.a(localb) != parama) {
        throw new IllegalStateException();
      }
    }
    finally {}
    int i2 = i3;
    if (paramBoolean)
    {
      i2 = i3;
      if (!b.d(localb))
      {
        int i1 = 0;
        for (;;)
        {
          i2 = i3;
          if (i1 >= this.t) {
            break;
          }
          if (a.b(parama)[i1] == 0)
          {
            parama.b();
            throw new IllegalStateException("Newly created entry didn't create value for index " + i1);
          }
          if (!localb.b(i1).exists())
          {
            parama.b();
            return;
          }
          i1 += 1;
        }
      }
    }
    for (;;)
    {
      long l1;
      if (i2 < this.t)
      {
        parama = localb.b(i2);
        if (paramBoolean)
        {
          if (parama.exists())
          {
            File localFile = localb.a(i2);
            parama.renameTo(localFile);
            l1 = b.b(localb)[i2];
            long l2 = localFile.length();
            b.b(localb)[i2] = l2;
            this.u = (this.u - l1 + l2);
            this.v += 1;
          }
        }
        else {
          a(parama);
        }
      }
      else
      {
        this.y += 1;
        b.a(localb, null);
        if ((b.d(localb) | paramBoolean))
        {
          b.a(localb, true);
          this.w.write("CLEAN " + b.c(localb) + localb.a() + '\n');
          if (paramBoolean)
          {
            l1 = this.z;
            this.z = (1L + l1);
            b.a(localb, l1);
          }
        }
        for (;;)
        {
          this.w.flush();
          if ((this.u <= this.r) && (this.v <= this.s) && (!m())) {
            break;
          }
          this.h.submit(this.A);
          break;
          this.x.remove(b.c(localb));
          this.w.write("REMOVE " + b.c(localb) + '\n');
        }
      }
      i2 += 1;
    }
  }
  
  private static void a(File paramFile)
  {
    if ((paramFile.exists()) && (!paramFile.delete())) {
      throw new IOException();
    }
  }
  
  private static void a(File paramFile1, File paramFile2, boolean paramBoolean)
  {
    if (paramBoolean) {
      a(paramFile2);
    }
    if (!paramFile1.renameTo(paramFile2)) {
      throw new IOException();
    }
  }
  
  private static String b(InputStream paramInputStream)
  {
    return d.a(new InputStreamReader(paramInputStream, d.b));
  }
  
  private void d(String paramString)
  {
    int i1 = paramString.indexOf(' ');
    if (i1 == -1) {
      throw new IOException("unexpected journal line: " + paramString);
    }
    int i2 = i1 + 1;
    int i3 = paramString.indexOf(' ', i2);
    String str;
    if (i3 == -1)
    {
      str = paramString.substring(i2);
      if ((i1 == "REMOVE".length()) && (paramString.startsWith("REMOVE"))) {
        this.x.remove(str);
      }
    }
    else
    {
      str = paramString.substring(i2, i3);
    }
    for (;;)
    {
      b localb2 = (b)this.x.get(str);
      b localb1 = localb2;
      if (localb2 == null)
      {
        localb1 = new b(str, null);
        this.x.put(str, localb1);
      }
      if ((i3 != -1) && (i1 == "CLEAN".length()) && (paramString.startsWith("CLEAN")))
      {
        paramString = paramString.substring(i3 + 1).split(" ");
        b.a(localb1, true);
        b.a(localb1, null);
        b.a(localb1, paramString);
        return;
      }
      if ((i3 == -1) && (i1 == "DIRTY".length()) && (paramString.startsWith("DIRTY")))
      {
        b.a(localb1, new a(localb1, null));
        return;
      }
      if ((i3 == -1) && (i1 == "READ".length()) && (paramString.startsWith("READ"))) {
        break;
      }
      throw new IOException("unexpected journal line: " + paramString);
    }
  }
  
  private void e(String paramString)
  {
    if (!g.matcher(paramString).matches()) {
      throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,64}: \"" + paramString + "\"");
    }
  }
  
  private void j()
  {
    c localc = new c(new FileInputStream(this.n), d.a);
    int i1;
    try
    {
      String str1 = localc.a();
      String str2 = localc.a();
      String str3 = localc.a();
      String str4 = localc.a();
      String str5 = localc.a();
      if ((!"libcore.io.DiskLruCache".equals(str1)) || (!"1".equals(str2)) || (!Integer.toString(this.q).equals(str3)) || (!Integer.toString(this.t).equals(str4)) || (!"".equals(str5))) {
        throw new IOException("unexpected journal header: [" + str1 + ", " + str2 + ", " + str4 + ", " + str5 + "]");
      }
    }
    finally
    {
      d.a(localc);
      throw ((Throwable)localObject);
    }
  }
  
  private void k()
  {
    a(this.o);
    Iterator localIterator = this.x.values().iterator();
    while (localIterator.hasNext())
    {
      b localb = (b)localIterator.next();
      int i1;
      if (b.a(localb) == null)
      {
        i1 = 0;
        while (i1 < this.t)
        {
          this.u += b.b(localb)[i1];
          this.v += 1;
          i1 += 1;
        }
      }
      else
      {
        b.a(localb, null);
        i1 = 0;
        while (i1 < this.t)
        {
          a(localb.a(i1));
          a(localb.b(i1));
          i1 += 1;
        }
        localIterator.remove();
      }
    }
  }
  
  private void l()
  {
    for (;;)
    {
      try
      {
        if (this.w != null) {
          this.w.close();
        }
        BufferedWriter localBufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.o), d.a));
        b localb;
        try
        {
          localBufferedWriter.write("libcore.io.DiskLruCache");
          localBufferedWriter.write("\n");
          localBufferedWriter.write("1");
          localBufferedWriter.write("\n");
          localBufferedWriter.write(Integer.toString(this.q));
          localBufferedWriter.write("\n");
          localBufferedWriter.write(Integer.toString(this.t));
          localBufferedWriter.write("\n");
          localBufferedWriter.write("\n");
          Iterator localIterator = this.x.values().iterator();
          if (!localIterator.hasNext()) {
            break;
          }
          localb = (b)localIterator.next();
          if (b.a(localb) != null)
          {
            localBufferedWriter.write("DIRTY " + b.c(localb) + '\n');
            continue;
            localObject1 = finally;
          }
        }
        finally
        {
          localBufferedWriter.close();
        }
        ((Writer)localObject1).write("CLEAN " + b.c(localb) + localb.a() + '\n');
      }
      finally {}
    }
    ((Writer)localObject1).close();
    if (this.n.exists()) {
      a(this.n, this.p, true);
    }
    a(this.o, this.n, false);
    this.p.delete();
    this.w = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.n, true), d.a));
  }
  
  private boolean m()
  {
    return (this.y >= 2000) && (this.y >= this.x.size());
  }
  
  private void n()
  {
    if (this.w == null) {
      throw new IllegalStateException("cache is closed");
    }
  }
  
  private void o()
  {
    while (this.u > this.r) {
      c((String)((Map.Entry)this.x.entrySet().iterator().next()).getKey());
    }
  }
  
  private void p()
  {
    while (this.v > this.s) {
      c((String)((Map.Entry)this.x.entrySet().iterator().next()).getKey());
    }
  }
  
  /* Error */
  public c a(String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 4
    //   3: aload_0
    //   4: monitorenter
    //   5: aload_0
    //   6: invokespecial 165	com/b/a/a/a/a/a/a:n	()V
    //   9: aload_0
    //   10: aload_1
    //   11: invokespecial 168	com/b/a/a/a/a/a/a:e	(Ljava/lang/String;)V
    //   14: aload_0
    //   15: getfield 110	com/b/a/a/a/a/a/a:x	Ljava/util/LinkedHashMap;
    //   18: aload_1
    //   19: invokevirtual 172	java/util/LinkedHashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   22: checkcast 17	com/b/a/a/a/a/a/a$b
    //   25: astore 6
    //   27: aload 6
    //   29: ifnonnull +10 -> 39
    //   32: aload 4
    //   34: astore_3
    //   35: aload_0
    //   36: monitorexit
    //   37: aload_3
    //   38: areturn
    //   39: aload 4
    //   41: astore_3
    //   42: aload 6
    //   44: invokestatic 310	com/b/a/a/a/a/a/a$b:d	(Lcom/b/a/a/a/a/a/a$b;)Z
    //   47: ifeq -12 -> 35
    //   50: aload_0
    //   51: getfield 152	com/b/a/a/a/a/a/a:t	I
    //   54: anewarray 141	java/io/File
    //   57: astore_3
    //   58: aload_0
    //   59: getfield 152	com/b/a/a/a/a/a/a:t	I
    //   62: anewarray 516	java/io/InputStream
    //   65: astore 5
    //   67: iconst_0
    //   68: istore_2
    //   69: iload_2
    //   70: aload_0
    //   71: getfield 152	com/b/a/a/a/a/a/a:t	I
    //   74: if_icmpge +74 -> 148
    //   77: aload 6
    //   79: iload_2
    //   80: invokevirtual 326	com/b/a/a/a/a/a/a$b:a	(I)Ljava/io/File;
    //   83: astore 7
    //   85: aload_3
    //   86: iload_2
    //   87: aload 7
    //   89: aastore
    //   90: aload 5
    //   92: iload_2
    //   93: new 440	java/io/FileInputStream
    //   96: dup
    //   97: aload 7
    //   99: invokespecial 442	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   102: aastore
    //   103: iload_2
    //   104: iconst_1
    //   105: iadd
    //   106: istore_2
    //   107: goto -38 -> 69
    //   110: astore_1
    //   111: iconst_0
    //   112: istore_2
    //   113: aload 4
    //   115: astore_3
    //   116: iload_2
    //   117: aload_0
    //   118: getfield 152	com/b/a/a/a/a/a/a:t	I
    //   121: if_icmpge -86 -> 35
    //   124: aload 4
    //   126: astore_3
    //   127: aload 5
    //   129: iload_2
    //   130: aaload
    //   131: ifnull -96 -> 35
    //   134: aload 5
    //   136: iload_2
    //   137: aaload
    //   138: invokestatic 463	com/b/a/a/a/a/a/d:a	(Ljava/io/Closeable;)V
    //   141: iload_2
    //   142: iconst_1
    //   143: iadd
    //   144: istore_2
    //   145: goto -32 -> 113
    //   148: aload_0
    //   149: aload_0
    //   150: getfield 159	com/b/a/a/a/a/a/a:y	I
    //   153: iconst_1
    //   154: iadd
    //   155: putfield 159	com/b/a/a/a/a/a/a:y	I
    //   158: aload_0
    //   159: getfield 190	com/b/a/a/a/a/a/a:w	Ljava/io/Writer;
    //   162: new 192	java/lang/StringBuilder
    //   165: dup
    //   166: invokespecial 193	java/lang/StringBuilder:<init>	()V
    //   169: ldc_w 518
    //   172: invokevirtual 199	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   175: aload_1
    //   176: invokevirtual 199	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   179: bipush 10
    //   181: invokevirtual 202	java/lang/StringBuilder:append	(C)Ljava/lang/StringBuilder;
    //   184: invokevirtual 206	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   187: invokevirtual 521	java/io/Writer:append	(Ljava/lang/CharSequence;)Ljava/io/Writer;
    //   190: pop
    //   191: aload_0
    //   192: invokespecial 355	com/b/a/a/a/a/a/a:m	()Z
    //   195: ifeq +15 -> 210
    //   198: aload_0
    //   199: getfield 130	com/b/a/a/a/a/a/a:h	Ljava/util/concurrent/ThreadPoolExecutor;
    //   202: aload_0
    //   203: getfield 135	com/b/a/a/a/a/a/a:A	Ljava/util/concurrent/Callable;
    //   206: invokevirtual 359	java/util/concurrent/ThreadPoolExecutor:submit	(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;
    //   209: pop
    //   210: new 20	com/b/a/a/a/a/a/a$c
    //   213: dup
    //   214: aload_0
    //   215: aload_1
    //   216: aload 6
    //   218: invokestatic 175	com/b/a/a/a/a/a/a$b:e	(Lcom/b/a/a/a/a/a/a$b;)J
    //   221: aload_3
    //   222: aload 5
    //   224: aload 6
    //   226: invokestatic 333	com/b/a/a/a/a/a/a$b:b	(Lcom/b/a/a/a/a/a/a$b;)[J
    //   229: aconst_null
    //   230: invokespecial 524	com/b/a/a/a/a/a/a$c:<init>	(Lcom/b/a/a/a/a/a/a;Ljava/lang/String;J[Ljava/io/File;[Ljava/io/InputStream;[JLcom/b/a/a/a/a/a/a$1;)V
    //   233: astore_3
    //   234: goto -199 -> 35
    //   237: astore_1
    //   238: aload_0
    //   239: monitorexit
    //   240: aload_1
    //   241: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	242	0	this	a
    //   0	242	1	paramString	String
    //   68	77	2	i1	int
    //   34	200	3	localObject1	Object
    //   1	124	4	localObject2	Object
    //   65	158	5	arrayOfInputStream	InputStream[]
    //   25	200	6	localb	b
    //   83	15	7	localFile	File
    // Exception table:
    //   from	to	target	type
    //   69	85	110	java/io/FileNotFoundException
    //   90	103	110	java/io/FileNotFoundException
    //   5	27	237	finally
    //   42	67	237	finally
    //   69	85	237	finally
    //   90	103	237	finally
    //   116	124	237	finally
    //   134	141	237	finally
    //   148	210	237	finally
    //   210	234	237	finally
  }
  
  public File a()
  {
    return this.m;
  }
  
  public void a(long paramLong)
  {
    try
    {
      this.r = paramLong;
      this.h.submit(this.A);
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public long b()
  {
    try
    {
      long l1 = this.r;
      return l1;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public a b(String paramString)
  {
    return a(paramString, -1L);
  }
  
  public int c()
  {
    try
    {
      int i1 = this.s;
      return i1;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public boolean c(String paramString)
  {
    int i1 = 0;
    for (;;)
    {
      try
      {
        n();
        e(paramString);
        b localb = (b)this.x.get(paramString);
        Object localObject;
        if (localb != null)
        {
          localObject = b.a(localb);
          if (localObject == null) {}
        }
        else
        {
          bool = false;
          return bool;
          this.u -= b.b(localb)[i1];
          this.v -= 1;
          b.b(localb)[i1] = 0L;
          i1 += 1;
        }
        if (i1 < this.t)
        {
          localObject = localb.a(i1);
          if ((!((File)localObject).exists()) || (((File)localObject).delete())) {
            continue;
          }
          throw new IOException("failed to delete " + localObject);
        }
      }
      finally {}
      this.y += 1;
      this.w.append("REMOVE " + paramString + '\n');
      this.x.remove(paramString);
      if (m()) {
        this.h.submit(this.A);
      }
      boolean bool = true;
    }
  }
  
  public void close()
  {
    for (;;)
    {
      try
      {
        Object localObject1 = this.w;
        if (localObject1 == null) {
          return;
        }
        localObject1 = new ArrayList(this.x.values()).iterator();
        if (((Iterator)localObject1).hasNext())
        {
          b localb = (b)((Iterator)localObject1).next();
          if (b.a(localb) == null) {
            continue;
          }
          b.a(localb).b();
          continue;
        }
        o();
      }
      finally {}
      p();
      this.w.close();
      this.w = null;
    }
  }
  
  public long d()
  {
    try
    {
      long l1 = this.u;
      return l1;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public long e()
  {
    try
    {
      int i1 = this.v;
      long l1 = i1;
      return l1;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  /* Error */
  public boolean f()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 190	com/b/a/a/a/a/a/a:w	Ljava/io/Writer;
    //   6: astore_2
    //   7: aload_2
    //   8: ifnonnull +9 -> 17
    //   11: iconst_1
    //   12: istore_1
    //   13: aload_0
    //   14: monitorexit
    //   15: iload_1
    //   16: ireturn
    //   17: iconst_0
    //   18: istore_1
    //   19: goto -6 -> 13
    //   22: astore_2
    //   23: aload_0
    //   24: monitorexit
    //   25: aload_2
    //   26: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	27	0	this	a
    //   12	7	1	bool	boolean
    //   6	2	2	localWriter	Writer
    //   22	4	2	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	7	22	finally
  }
  
  public void g()
  {
    try
    {
      n();
      o();
      p();
      this.w.flush();
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public void h()
  {
    close();
    d.a(this.m);
  }
  
  public final class a
  {
    private final a.b b;
    private final boolean[] c;
    private boolean d;
    private boolean e;
    
    private a(a.b paramb)
    {
      this.b = paramb;
      if (a.b.d(paramb)) {}
      for (this$1 = null;; this$1 = new boolean[a.f(a.this)])
      {
        this.c = a.this;
        return;
      }
    }
    
    public InputStream a(int paramInt)
    {
      synchronized (a.this)
      {
        if (a.b.a(this.b) != this) {
          throw new IllegalStateException();
        }
      }
      if (!a.b.d(this.b)) {
        return null;
      }
      try
      {
        FileInputStream localFileInputStream = new FileInputStream(this.b.a(paramInt));
        return localFileInputStream;
      }
      catch (FileNotFoundException localFileNotFoundException) {}
      return null;
    }
    
    public void a()
    {
      if (this.d)
      {
        a.a(a.this, this, false);
        a.this.c(a.b.c(this.b));
      }
      for (;;)
      {
        this.e = true;
        return;
        a.a(a.this, this, true);
      }
    }
    
    public void a(int paramInt, String paramString)
    {
      try
      {
        OutputStreamWriter localOutputStreamWriter = new OutputStreamWriter(c(paramInt), d.b);
        d.a(localOutputStreamWriter);
      }
      finally
      {
        try
        {
          localOutputStreamWriter.write(paramString);
          d.a(localOutputStreamWriter);
          return;
        }
        finally {}
        paramString = finally;
        localOutputStreamWriter = null;
      }
      throw paramString;
    }
    
    public String b(int paramInt)
    {
      InputStream localInputStream = a(paramInt);
      if (localInputStream != null) {
        return a.a(localInputStream);
      }
      return null;
    }
    
    public void b()
    {
      a.a(a.this, this, false);
    }
    
    public OutputStream c(int paramInt)
    {
      synchronized (a.this)
      {
        if (a.b.a(this.b) != this) {
          throw new IllegalStateException();
        }
      }
      if (!a.b.d(this.b)) {
        this.c[paramInt] = true;
      }
      File localFile = this.b.b(paramInt);
      try
      {
        Object localObject2 = new FileOutputStream(localFile);
        localObject2 = new a((OutputStream)localObject2, null);
        return (OutputStream)localObject2;
      }
      catch (FileNotFoundException localFileNotFoundException1)
      {
        for (;;)
        {
          a.g(a.this).mkdirs();
          try
          {
            FileOutputStream localFileOutputStream = new FileOutputStream(localFile);
          }
          catch (FileNotFoundException localFileNotFoundException2)
          {
            OutputStream localOutputStream = a.i();
            return localOutputStream;
          }
        }
      }
    }
    
    public void c()
    {
      if (!this.e) {}
      try
      {
        b();
        return;
      }
      catch (IOException localIOException) {}
    }
    
    private class a
      extends FilterOutputStream
    {
      private a(OutputStream paramOutputStream)
      {
        super();
      }
      
      public void close()
      {
        try
        {
          this.out.close();
          return;
        }
        catch (IOException localIOException)
        {
          a.a.a(a.a.this, true);
        }
      }
      
      public void flush()
      {
        try
        {
          this.out.flush();
          return;
        }
        catch (IOException localIOException)
        {
          a.a.a(a.a.this, true);
        }
      }
      
      public void write(int paramInt)
      {
        try
        {
          this.out.write(paramInt);
          return;
        }
        catch (IOException localIOException)
        {
          a.a.a(a.a.this, true);
        }
      }
      
      public void write(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
      {
        try
        {
          this.out.write(paramArrayOfByte, paramInt1, paramInt2);
          return;
        }
        catch (IOException paramArrayOfByte)
        {
          a.a.a(a.a.this, true);
        }
      }
    }
  }
  
  private final class b
  {
    private final String b;
    private final long[] c;
    private boolean d;
    private a.a e;
    private long f;
    
    private b(String paramString)
    {
      this.b = paramString;
      this.c = new long[a.f(a.this)];
    }
    
    private void a(String[] paramArrayOfString)
    {
      if (paramArrayOfString.length != a.f(a.this)) {
        throw b(paramArrayOfString);
      }
      int i = 0;
      try
      {
        while (i < paramArrayOfString.length)
        {
          this.c[i] = Long.parseLong(paramArrayOfString[i]);
          i += 1;
        }
        return;
      }
      catch (NumberFormatException localNumberFormatException)
      {
        throw b(paramArrayOfString);
      }
    }
    
    private IOException b(String[] paramArrayOfString)
    {
      throw new IOException("unexpected journal line: " + Arrays.toString(paramArrayOfString));
    }
    
    public File a(int paramInt)
    {
      return new File(a.g(a.this), this.b + "." + paramInt);
    }
    
    public String a()
    {
      StringBuilder localStringBuilder = new StringBuilder();
      long[] arrayOfLong = this.c;
      int j = arrayOfLong.length;
      int i = 0;
      while (i < j)
      {
        long l = arrayOfLong[i];
        localStringBuilder.append(' ').append(l);
        i += 1;
      }
      return localStringBuilder.toString();
    }
    
    public File b(int paramInt)
    {
      return new File(a.g(a.this), this.b + "." + paramInt + ".tmp");
    }
  }
  
  public final class c
    implements Closeable
  {
    private final String b;
    private final long c;
    private File[] d;
    private final InputStream[] e;
    private final long[] f;
    
    private c(String paramString, long paramLong, File[] paramArrayOfFile, InputStream[] paramArrayOfInputStream, long[] paramArrayOfLong)
    {
      this.b = paramString;
      this.c = paramLong;
      this.d = paramArrayOfFile;
      this.e = paramArrayOfInputStream;
      this.f = paramArrayOfLong;
    }
    
    public a.a a()
    {
      return a.a(a.this, this.b, this.c);
    }
    
    public File a(int paramInt)
    {
      return this.d[paramInt];
    }
    
    public InputStream b(int paramInt)
    {
      return this.e[paramInt];
    }
    
    public String c(int paramInt)
    {
      return a.a(b(paramInt));
    }
    
    public void close()
    {
      InputStream[] arrayOfInputStream = this.e;
      int j = arrayOfInputStream.length;
      int i = 0;
      while (i < j)
      {
        d.a(arrayOfInputStream[i]);
        i += 1;
      }
    }
    
    public long d(int paramInt)
    {
      return this.f[paramInt];
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/b/a/a/a/a/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */