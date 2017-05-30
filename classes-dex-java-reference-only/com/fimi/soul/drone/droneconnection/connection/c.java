package com.fimi.soul.drone.droneconnection.connection;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.fimi.kernel.utils.r;
import com.fimi.soul.biz.h.a;
import com.fimi.soul.utils.j;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map.Entry;
import java.util.Set;

public class c
{
  private static final String c = com.fimi.soul.biz.h.c.a().b();
  HandlerThread a;
  StringBuffer b = new StringBuffer();
  private Handler d;
  private SimpleDateFormat e;
  private SimpleDateFormat f;
  private SimpleDateFormat g;
  private BufferedWriter h;
  private File i;
  private File j;
  private StringBuilder k = new StringBuilder();
  private boolean l = false;
  private boolean m;
  private Runnable n = new Runnable()
  {
    public void run()
    {
      c.a(c.this, false);
      c.a(c.this).postDelayed(this, 400L);
    }
  };
  
  private c()
  {
    if ((this.a == null) && (this.d == null))
    {
      this.a = new HandlerThread("LogHandler");
      this.a.start();
      this.d = new Handler(this.a.getLooper());
    }
  }
  
  public static c a()
  {
    return a.a();
  }
  
  private void a(com.fimi.soul.drone.c.a.c paramc, String paramString)
  {
    paramc = paramc.e();
    this.b.append(paramString).append("    ");
    int i1 = 0;
    while (i1 < paramc.length)
    {
      this.b.append(Character.forDigit((paramc[i1] & 0xF0) >> 4, 16));
      this.b.append(Character.forDigit(paramc[i1] & 0xF, 16));
      this.b.append(" ");
      i1 += 1;
    }
    paramc = r.b(this.b.toString(), c);
    this.k.append(paramc);
    this.k.append("\n");
    this.b = this.b.delete(0, this.b.length());
    if ((this.m) && (this.i != null)) {
      a(this.k, this.i);
    }
    while ((this.m) || (this.j == null)) {
      return;
    }
    a(this.k, this.j);
  }
  
  private void a(StringBuilder paramStringBuilder, File paramFile)
  {
    try
    {
      this.h.write(paramStringBuilder.toString());
      this.h.flush();
      paramStringBuilder.delete(0, paramStringBuilder.length());
      this.l = false;
      return;
    }
    catch (Exception paramStringBuilder)
    {
      paramStringBuilder.printStackTrace();
    }
  }
  
  public void a(com.fimi.soul.drone.c.a.c paramc)
  {
    if ((paramc.c == 105) && (!this.l))
    {
      this.l = true;
      return;
    }
    a(paramc, j());
  }
  
  /* Error */
  public void a(String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: aconst_null
    //   3: astore 4
    //   5: aload_3
    //   6: astore_2
    //   7: new 180	java/io/File
    //   10: dup
    //   11: new 55	java/lang/StringBuilder
    //   14: dup
    //   15: invokespecial 56	java/lang/StringBuilder:<init>	()V
    //   18: invokestatic 184	com/fimi/soul/utils/j:l	()Ljava/lang/String;
    //   21: invokevirtual 128	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   24: ldc -70
    //   26: invokevirtual 128	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   29: invokevirtual 152	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   32: invokespecial 187	java/io/File:<init>	(Ljava/lang/String;)V
    //   35: astore 5
    //   37: aload 5
    //   39: ifnull +13 -> 52
    //   42: aload_3
    //   43: astore_2
    //   44: aload 5
    //   46: invokevirtual 191	java/io/File:exists	()Z
    //   49: ifne +35 -> 84
    //   52: aload_3
    //   53: astore_2
    //   54: aload 5
    //   56: invokevirtual 195	java/io/File:getParentFile	()Ljava/io/File;
    //   59: invokevirtual 191	java/io/File:exists	()Z
    //   62: ifne +14 -> 76
    //   65: aload_3
    //   66: astore_2
    //   67: aload 5
    //   69: invokevirtual 195	java/io/File:getParentFile	()Ljava/io/File;
    //   72: invokevirtual 198	java/io/File:mkdirs	()Z
    //   75: pop
    //   76: aload_3
    //   77: astore_2
    //   78: aload 5
    //   80: invokevirtual 201	java/io/File:createNewFile	()Z
    //   83: pop
    //   84: aload_3
    //   85: astore_2
    //   86: new 203	java/io/FileOutputStream
    //   89: dup
    //   90: aload 5
    //   92: iconst_1
    //   93: invokespecial 206	java/io/FileOutputStream:<init>	(Ljava/io/File;Z)V
    //   96: astore_3
    //   97: new 208	java/text/SimpleDateFormat
    //   100: dup
    //   101: ldc -46
    //   103: invokespecial 211	java/text/SimpleDateFormat:<init>	(Ljava/lang/String;)V
    //   106: new 213	java/util/Date
    //   109: dup
    //   110: invokespecial 214	java/util/Date:<init>	()V
    //   113: invokevirtual 218	java/text/SimpleDateFormat:format	(Ljava/util/Date;)Ljava/lang/String;
    //   116: astore_2
    //   117: aload_3
    //   118: new 55	java/lang/StringBuilder
    //   121: dup
    //   122: invokespecial 56	java/lang/StringBuilder:<init>	()V
    //   125: aload_2
    //   126: invokevirtual 128	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   129: ldc -36
    //   131: invokevirtual 128	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   134: aload_1
    //   135: invokevirtual 128	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   138: invokevirtual 152	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   141: invokevirtual 225	java/lang/String:getBytes	()[B
    //   144: invokevirtual 228	java/io/FileOutputStream:write	([B)V
    //   147: aload_3
    //   148: ldc -26
    //   150: invokevirtual 225	java/lang/String:getBytes	()[B
    //   153: invokevirtual 228	java/io/FileOutputStream:write	([B)V
    //   156: aload_3
    //   157: invokevirtual 231	java/io/FileOutputStream:flush	()V
    //   160: aload_3
    //   161: invokevirtual 234	java/io/FileOutputStream:close	()V
    //   164: return
    //   165: astore_1
    //   166: aload_1
    //   167: invokevirtual 235	java/io/IOException:printStackTrace	()V
    //   170: return
    //   171: astore_3
    //   172: aload 4
    //   174: astore_1
    //   175: aload_1
    //   176: astore_2
    //   177: aload_3
    //   178: invokevirtual 235	java/io/IOException:printStackTrace	()V
    //   181: aload_1
    //   182: invokevirtual 231	java/io/FileOutputStream:flush	()V
    //   185: aload_1
    //   186: invokevirtual 234	java/io/FileOutputStream:close	()V
    //   189: return
    //   190: astore_1
    //   191: aload_1
    //   192: invokevirtual 235	java/io/IOException:printStackTrace	()V
    //   195: return
    //   196: astore_1
    //   197: aload_2
    //   198: invokevirtual 231	java/io/FileOutputStream:flush	()V
    //   201: aload_2
    //   202: invokevirtual 234	java/io/FileOutputStream:close	()V
    //   205: aload_1
    //   206: athrow
    //   207: astore_2
    //   208: aload_2
    //   209: invokevirtual 235	java/io/IOException:printStackTrace	()V
    //   212: goto -7 -> 205
    //   215: astore_1
    //   216: aload_3
    //   217: astore_2
    //   218: goto -21 -> 197
    //   221: astore_2
    //   222: aload_3
    //   223: astore_1
    //   224: aload_2
    //   225: astore_3
    //   226: goto -51 -> 175
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	229	0	this	c
    //   0	229	1	paramString	String
    //   6	196	2	localObject1	Object
    //   207	2	2	localIOException1	IOException
    //   217	1	2	localIOException2	IOException
    //   221	4	2	localIOException3	IOException
    //   1	160	3	localFileOutputStream	FileOutputStream
    //   171	52	3	localIOException4	IOException
    //   225	1	3	localObject2	Object
    //   3	170	4	localObject3	Object
    //   35	56	5	localFile	File
    // Exception table:
    //   from	to	target	type
    //   156	164	165	java/io/IOException
    //   7	37	171	java/io/IOException
    //   44	52	171	java/io/IOException
    //   54	65	171	java/io/IOException
    //   67	76	171	java/io/IOException
    //   78	84	171	java/io/IOException
    //   86	97	171	java/io/IOException
    //   181	189	190	java/io/IOException
    //   7	37	196	finally
    //   44	52	196	finally
    //   54	65	196	finally
    //   67	76	196	finally
    //   78	84	196	finally
    //   86	97	196	finally
    //   177	181	196	finally
    //   197	205	207	java/io/IOException
    //   97	156	215	finally
    //   97	156	221	java/io/IOException
  }
  
  public void a(boolean paramBoolean)
  {
    if (this.m != paramBoolean) {
      this.m = paramBoolean;
    }
  }
  
  public void b()
  {
    Object localObject1 = h().format(Long.valueOf(System.currentTimeMillis()));
    Object localObject2 = new File(j.a() + "/LOGDOWN/" + i() + "/AirFly");
    ((File)localObject2).mkdirs();
    if ((this.i == null) || (!this.i.exists())) {
      this.i = new File((File)localObject2, (String)localObject1 + ".txt");
    }
    if (this.h == null) {
      try
      {
        this.h = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.i, true)));
        localObject1 = a.a().b().entrySet().iterator();
        while (((Iterator)localObject1).hasNext())
        {
          localObject2 = j();
          a((com.fimi.soul.drone.c.a.c)((Map.Entry)((Iterator)localObject1).next()).getValue(), (String)localObject2);
          continue;
          return;
        }
      }
      catch (Exception localException)
      {
        localException.printStackTrace();
      }
    }
    while (Looper.myQueue() == null) {}
    this.d.postDelayed(this.n, 200L);
  }
  
  public void c()
  {
    Object localObject1 = h().format(new Date());
    Object localObject2 = new File(j.a() + "/LOGDOWN/" + i() + "/NoFly");
    ((File)localObject2).mkdirs();
    if ((this.j == null) || (!this.j.exists())) {
      this.j = new File((File)localObject2, (String)localObject1 + ".txt");
    }
    if (this.h == null) {
      try
      {
        this.h = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.j, true)));
        localObject1 = a.a().b().entrySet().iterator();
        while (((Iterator)localObject1).hasNext())
        {
          localObject2 = j();
          a((com.fimi.soul.drone.c.a.c)((Map.Entry)((Iterator)localObject1).next()).getValue(), (String)localObject2);
          continue;
          return;
        }
      }
      catch (Exception localException)
      {
        localException.printStackTrace();
      }
    }
    while (Looper.myQueue() == null) {}
    this.d.postDelayed(this.n, 200L);
  }
  
  public void d()
  {
    if (this.h != null) {}
    try
    {
      this.h.close();
      this.h = null;
      this.i = null;
      return;
    }
    catch (IOException localIOException)
    {
      localIOException.printStackTrace();
    }
  }
  
  public boolean e()
  {
    return (this.h != null) && (this.i != null);
  }
  
  public boolean f()
  {
    return (this.h != null) && (this.j != null);
  }
  
  public void g()
  {
    if (this.h != null) {}
    try
    {
      this.h.close();
      this.h = null;
      this.j = null;
      return;
    }
    catch (IOException localIOException)
    {
      localIOException.printStackTrace();
    }
  }
  
  public SimpleDateFormat h()
  {
    if (this.e == null) {
      this.e = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.CHINA);
    }
    return this.e;
  }
  
  public String i()
  {
    if (this.f == null) {
      this.f = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
    }
    return this.f.format(Long.valueOf(System.currentTimeMillis()));
  }
  
  public String j()
  {
    if (this.g == null) {
      this.g = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss-SSS", Locale.US);
    }
    return this.g.format(Long.valueOf(System.currentTimeMillis()));
  }
  
  public boolean k()
  {
    boolean bool2 = false;
    boolean bool1 = bool2;
    if (this.j != null)
    {
      bool1 = bool2;
      if (this.j.length() > 10485760L) {
        bool1 = true;
      }
    }
    return bool1;
  }
  
  static class a
  {
    private static final c a = new c(null);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/drone/droneconnection/connection/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */