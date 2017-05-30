package it.a.a;

import it.a.a.c.e;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.InetAddress;
import java.net.Socket;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.net.ssl.SSLSocketFactory;

public class b
{
  public static final int a = 0;
  public static final int b = 1;
  public static final int c = 2;
  public static final int d = 0;
  public static final int e = 1;
  public static final int f = 2;
  public static final int g = 0;
  public static final int h = 1;
  public static final int i = 2;
  private static final int j = 65536;
  private static final DateFormat k = new SimpleDateFormat("yyyyMMddHHmmss");
  private static final Pattern l = Pattern.compile("\\d{1,3},\\d{1,3},\\d{1,3},\\d{1,3},\\d{1,3},\\d{1,3}");
  private static final Pattern m = Pattern.compile("\"/.*\"");
  private boolean A = true;
  private int B = 0;
  private int C = 0;
  private long D = 0L;
  private a E;
  private long F;
  private boolean G = false;
  private String H = null;
  private boolean I = false;
  private boolean J = false;
  private boolean K = false;
  private boolean L = false;
  private boolean M = false;
  private boolean N = false;
  private boolean O = false;
  private InputStream P = null;
  private OutputStream Q = null;
  private boolean R = false;
  private boolean S = false;
  private Object T = new Object();
  private Object U = new Object();
  private f V = null;
  private h n = new it.a.a.a.d();
  private SSLSocketFactory o = (SSLSocketFactory)SSLSocketFactory.getDefault();
  private ArrayList p = new ArrayList();
  private ArrayList q = new ArrayList();
  private t r = it.a.a.b.a.a();
  private r s = null;
  private String t = null;
  private int u = 0;
  private int v = 0;
  private String w;
  private String x;
  private boolean y = false;
  private boolean z = false;
  
  public b()
  {
    a(new e());
    a(new it.a.a.c.a());
    a(new it.a.a.c.b());
    a(new it.a.a.c.d());
    a(new it.a.a.c.c());
  }
  
  private void E()
  {
    for (;;)
    {
      int i1;
      String str;
      synchronized (this.T)
      {
        this.J = false;
        this.G = false;
        this.K = false;
        this.L = false;
        this.N = false;
        this.V.a("FEAT");
        Object localObject2 = this.V.c();
        if (((s)localObject2).a() != 211) {
          break label181;
        }
        localObject2 = ((s)localObject2).c();
        i1 = 1;
        if (i1 >= localObject2.length - 1) {
          break label181;
        }
        str = localObject2[i1].trim().toUpperCase();
        if ("REST STREAM".equalsIgnoreCase(str))
        {
          this.G = true;
        }
        else if ("UTF8".equalsIgnoreCase(str))
        {
          this.J = true;
          this.V.b("UTF-8");
        }
      }
      if ("MLSD".equalsIgnoreCase(str))
      {
        this.K = true;
      }
      else if (("MODE Z".equalsIgnoreCase(str)) || (str.startsWith("MODE Z ")))
      {
        this.L = true;
        break label268;
        label181:
        if (this.J)
        {
          this.V.a("OPTS UTF8 ON");
          this.V.c();
        }
        if ((this.v == 1) || (this.v == 2))
        {
          this.V.a("PBSZ 0");
          this.V.c();
          this.V.a("PROT P");
          if (this.V.c().b()) {
            this.N = true;
          }
        }
        return;
      }
      label268:
      i1 += 1;
    }
  }
  
  private i F()
  {
    s locals;
    if ((this.L) && (this.I)) {
      if (!this.M)
      {
        this.V.a("MODE Z");
        locals = this.V.c();
        O();
        if (locals.b()) {
          this.M = true;
        }
      }
    }
    while (this.A)
    {
      return H();
      if (this.M)
      {
        this.V.a("MODE S");
        locals = this.V.c();
        O();
        if (locals.b()) {
          this.M = false;
        }
      }
    }
    return G();
  }
  
  private i G()
  {
    c localc = new c(this);
    int i1 = localc.c();
    Object localObject = J();
    this.V.a("PORT " + localObject[0] + "," + localObject[1] + "," + localObject[2] + "," + localObject[3] + "," + (i1 >>> 8) + "," + (i1 & 0xFF));
    localObject = this.V.c();
    O();
    if (!((s)localObject).b()) {
      localc.b();
    }
    try
    {
      localc.a().close();
      throw new m((s)localObject);
      return localc;
    }
    catch (Throwable localThrowable)
    {
      for (;;) {}
    }
  }
  
  private i H()
  {
    this.V.a("PASV");
    Object localObject = this.V.c();
    O();
    if (!((s)localObject).b()) {
      throw new m((s)localObject);
    }
    localObject = ((s)localObject).c();
    int i1 = 0;
    int i2;
    int i3;
    if (i1 < localObject.length)
    {
      Matcher localMatcher = l.matcher(localObject[i1]);
      if (localMatcher.find())
      {
        i2 = localMatcher.start();
        i3 = localMatcher.end();
      }
    }
    for (localObject = localObject[i1].substring(i2, i3);; localObject = null)
    {
      if (localObject == null)
      {
        throw new o();
        i1 += 1;
        break;
      }
      localObject = new StringTokenizer((String)localObject, ",");
      i1 = Integer.parseInt(((StringTokenizer)localObject).nextToken());
      i2 = Integer.parseInt(((StringTokenizer)localObject).nextToken());
      i3 = Integer.parseInt(((StringTokenizer)localObject).nextToken());
      int i4 = Integer.parseInt(((StringTokenizer)localObject).nextToken());
      int i5 = Integer.parseInt(((StringTokenizer)localObject).nextToken());
      int i6 = Integer.parseInt(((StringTokenizer)localObject).nextToken());
      return new d(this, i1 + "." + i2 + "." + i3 + "." + i4, i6 | i5 << 8);
    }
  }
  
  private String I()
  {
    if (this.H != null) {
      return this.H;
    }
    if (this.J) {
      return "UTF-8";
    }
    return System.getProperty("file.encoding");
  }
  
  private int[] J()
  {
    int[] arrayOfInt2 = K();
    int[] arrayOfInt1 = arrayOfInt2;
    if (arrayOfInt2 == null) {
      arrayOfInt1 = L();
    }
    return arrayOfInt1;
  }
  
  private int[] K()
  {
    int i2 = 0;
    int i3 = 0;
    Object localObject2 = null;
    Object localObject3 = null;
    String str = System.getProperty("ftp4j.activeDataTransfer.hostAddress");
    Object localObject1;
    if (str != null)
    {
      StringTokenizer localStringTokenizer = new StringTokenizer(str, ".");
      localObject1 = localObject3;
      if (localStringTokenizer.countTokens() == 4)
      {
        localObject2 = new int[4];
        i2 = 0;
        if (i2 >= 4) {
          break label198;
        }
        localObject1 = localStringTokenizer.nextToken();
      }
    }
    for (;;)
    {
      try
      {
        localObject2[i2] = Integer.parseInt((String)localObject1);
        i1 = i3;
        if (localObject2[i2] >= 0)
        {
          if (localObject2[i2] > 255) {
            i1 = i3;
          }
        }
        else
        {
          localObject1 = localObject3;
          i2 = i1;
          if (i1 != 0)
          {
            localObject1 = localObject2;
            i2 = i1;
          }
          localObject2 = localObject1;
          if (i2 == 0)
          {
            System.err.println("WARNING: invalid value \"" + str + "\" for the " + "ftp4j.activeDataTransfer.hostAddress" + " system property. The value should " + "be in the x.x.x.x form.");
            localObject2 = localObject1;
          }
          return (int[])localObject2;
        }
      }
      catch (NumberFormatException localNumberFormatException)
      {
        localObject2[i2] = -1;
        continue;
        i2 += 1;
      }
      break;
      label198:
      int i1 = 1;
    }
  }
  
  private int[] L()
  {
    byte[] arrayOfByte = InetAddress.getLocalHost().getAddress();
    return new int[] { arrayOfByte[0] & 0xFF, arrayOfByte[1] & 0xFF, arrayOfByte[2] & 0xFF, arrayOfByte[3] & 0xFF };
  }
  
  private void M()
  {
    if (this.D > 0L)
    {
      this.E = new a(null);
      this.E.start();
    }
  }
  
  private void N()
  {
    if (this.E != null)
    {
      this.E.interrupt();
      this.E = null;
    }
  }
  
  private void O()
  {
    if (this.E != null) {
      this.F = (System.currentTimeMillis() + this.D);
    }
  }
  
  static long a(b paramb, long paramLong)
  {
    paramb.F = paramLong;
    return paramLong;
  }
  
  static Socket a(b paramb, Socket paramSocket, String paramString, int paramInt)
  {
    return paramb.a(paramSocket, paramString, paramInt);
  }
  
  private Socket a(Socket paramSocket, String paramString, int paramInt)
  {
    return this.o.createSocket(paramSocket, paramString, paramInt, true);
  }
  
  static boolean a(b paramb)
  {
    return paramb.N;
  }
  
  static h b(b paramb)
  {
    return paramb.n;
  }
  
  static String c(b paramb)
  {
    return paramb.t;
  }
  
  static Object d(b paramb)
  {
    return paramb.T;
  }
  
  static long e(b paramb)
  {
    return paramb.F;
  }
  
  static long f(b paramb)
  {
    return paramb.D;
  }
  
  private int m(String paramString)
  {
    int i2 = 2;
    int i3 = paramString.lastIndexOf('.') + 1;
    int i4 = paramString.length();
    int i1 = i2;
    if (i3 > 0)
    {
      i1 = i2;
      if (i3 < i4 - 1)
      {
        paramString = paramString.substring(i3, i4).toLowerCase();
        i1 = i2;
        if (this.r.a(paramString)) {
          i1 = 1;
        }
      }
    }
    return i1;
  }
  
  public String[] A()
  {
    synchronized (this.T)
    {
      if (!this.y) {
        throw new IllegalStateException("Client not connected");
      }
    }
    if (!this.z) {
      throw new IllegalStateException("Client not authenticated");
    }
    this.V.a("HELP");
    Object localObject3 = this.V.c();
    O();
    if (!((s)localObject3).b()) {
      throw new m((s)localObject3);
    }
    localObject3 = ((s)localObject3).c();
    return (String[])localObject3;
  }
  
  public String[] B()
  {
    synchronized (this.T)
    {
      if (!this.y) {
        throw new IllegalStateException("Client not connected");
      }
    }
    if (!this.z) {
      throw new IllegalStateException("Client not authenticated");
    }
    this.V.a("STAT");
    Object localObject3 = this.V.c();
    O();
    if (!((s)localObject3).b()) {
      throw new m((s)localObject3);
    }
    localObject3 = ((s)localObject3).c();
    return (String[])localObject3;
  }
  
  public n[] C()
  {
    return l(null);
  }
  
  /* Error */
  public String[] D()
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 6
    //   3: aconst_null
    //   4: astore 8
    //   6: iconst_0
    //   7: istore_1
    //   8: aload_0
    //   9: getfield 176	it/a/a/b:T	Ljava/lang/Object;
    //   12: astore 9
    //   14: aload 9
    //   16: monitorenter
    //   17: aload_0
    //   18: getfield 138	it/a/a/b:y	Z
    //   21: ifne +22 -> 43
    //   24: new 446	java/lang/IllegalStateException
    //   27: dup
    //   28: ldc_w 448
    //   31: invokespecial 449	java/lang/IllegalStateException:<init>	(Ljava/lang/String;)V
    //   34: athrow
    //   35: astore 5
    //   37: aload 9
    //   39: monitorexit
    //   40: aload 5
    //   42: athrow
    //   43: aload_0
    //   44: getfield 140	it/a/a/b:z	Z
    //   47: ifne +14 -> 61
    //   50: new 446	java/lang/IllegalStateException
    //   53: dup
    //   54: ldc_w 451
    //   57: invokespecial 449	java/lang/IllegalStateException:<init>	(Ljava/lang/String;)V
    //   60: athrow
    //   61: aload_0
    //   62: getfield 180	it/a/a/b:V	Lit/a/a/f;
    //   65: ldc_w 463
    //   68: invokevirtual 204	it/a/a/f:a	(Ljava/lang/String;)V
    //   71: aload_0
    //   72: getfield 180	it/a/a/b:V	Lit/a/a/f;
    //   75: invokevirtual 207	it/a/a/f:c	()Lit/a/a/s;
    //   78: astore 5
    //   80: aload_0
    //   81: invokespecial 257	it/a/a/b:O	()V
    //   84: aload 5
    //   86: invokevirtual 254	it/a/a/s:b	()Z
    //   89: ifne +13 -> 102
    //   92: new 306	it/a/a/m
    //   95: dup
    //   96: aload 5
    //   98: invokespecial 309	it/a/a/m:<init>	(Lit/a/a/s;)V
    //   101: athrow
    //   102: new 116	java/util/ArrayList
    //   105: dup
    //   106: invokespecial 117	java/util/ArrayList:<init>	()V
    //   109: astore 7
    //   111: aload_0
    //   112: invokespecial 465	it/a/a/b:F	()Lit/a/a/i;
    //   115: astore 5
    //   117: aload_0
    //   118: getfield 180	it/a/a/b:V	Lit/a/a/f;
    //   121: ldc_w 467
    //   124: invokevirtual 204	it/a/a/f:a	(Ljava/lang/String;)V
    //   127: aload 5
    //   129: invokeinterface 470 1 0
    //   134: astore 10
    //   136: aload 5
    //   138: invokeinterface 471 1 0
    //   143: aload_0
    //   144: getfield 178	it/a/a/b:U	Ljava/lang/Object;
    //   147: astore 5
    //   149: aload 5
    //   151: monitorenter
    //   152: aload_0
    //   153: iconst_1
    //   154: putfield 166	it/a/a/b:O	Z
    //   157: aload_0
    //   158: iconst_0
    //   159: putfield 172	it/a/a/b:R	Z
    //   162: aload_0
    //   163: iconst_0
    //   164: putfield 174	it/a/a/b:S	Z
    //   167: aload 5
    //   169: monitorexit
    //   170: aload 6
    //   172: astore 5
    //   174: aload_0
    //   175: aload 10
    //   177: invokevirtual 475	java/net/Socket:getInputStream	()Ljava/io/InputStream;
    //   180: putfield 168	it/a/a/b:P	Ljava/io/InputStream;
    //   183: aload 6
    //   185: astore 5
    //   187: aload_0
    //   188: getfield 162	it/a/a/b:M	Z
    //   191: ifeq +22 -> 213
    //   194: aload 6
    //   196: astore 5
    //   198: aload_0
    //   199: new 477	java/util/zip/InflaterInputStream
    //   202: dup
    //   203: aload_0
    //   204: getfield 168	it/a/a/b:P	Ljava/io/InputStream;
    //   207: invokespecial 480	java/util/zip/InflaterInputStream:<init>	(Ljava/io/InputStream;)V
    //   210: putfield 168	it/a/a/b:P	Ljava/io/InputStream;
    //   213: aload 6
    //   215: astore 5
    //   217: new 482	it/a/a/u
    //   220: dup
    //   221: aload_0
    //   222: getfield 168	it/a/a/b:P	Ljava/io/InputStream;
    //   225: aload_0
    //   226: invokespecial 484	it/a/a/b:I	()Ljava/lang/String;
    //   229: invokespecial 487	it/a/a/u:<init>	(Ljava/io/InputStream;Ljava/lang/String;)V
    //   232: astore 6
    //   234: aload 6
    //   236: invokevirtual 489	it/a/a/u:a	()Ljava/lang/String;
    //   239: astore 5
    //   241: aload 5
    //   243: ifnull +362 -> 605
    //   246: aload 5
    //   248: invokevirtual 437	java/lang/String:length	()I
    //   251: ifle -17 -> 234
    //   254: aload 7
    //   256: aload 5
    //   258: invokevirtual 493	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   261: pop
    //   262: goto -28 -> 234
    //   265: astore 7
    //   267: aload 6
    //   269: astore 5
    //   271: aload_0
    //   272: getfield 178	it/a/a/b:U	Ljava/lang/Object;
    //   275: astore 8
    //   277: aload 6
    //   279: astore 5
    //   281: aload 8
    //   283: monitorenter
    //   284: aload_0
    //   285: getfield 172	it/a/a/b:R	Z
    //   288: ifeq +161 -> 449
    //   291: new 495	it/a/a/a
    //   294: dup
    //   295: invokespecial 496	it/a/a/a:<init>	()V
    //   298: athrow
    //   299: astore 7
    //   301: aload 8
    //   303: monitorexit
    //   304: aload 6
    //   306: astore 5
    //   308: aload 7
    //   310: athrow
    //   311: astore 7
    //   313: aload 5
    //   315: astore 6
    //   317: aload 7
    //   319: astore 5
    //   321: aload 6
    //   323: ifnull +8 -> 331
    //   326: aload 6
    //   328: invokevirtual 497	it/a/a/u:close	()V
    //   331: aload 10
    //   333: invokevirtual 304	java/net/Socket:close	()V
    //   336: aload_0
    //   337: aconst_null
    //   338: putfield 168	it/a/a/b:P	Ljava/io/InputStream;
    //   341: aload_0
    //   342: getfield 178	it/a/a/b:U	Ljava/lang/Object;
    //   345: astore 6
    //   347: aload 6
    //   349: monitorenter
    //   350: aload_0
    //   351: getfield 172	it/a/a/b:R	Z
    //   354: istore_3
    //   355: iload_3
    //   356: istore 4
    //   358: aload_0
    //   359: iconst_0
    //   360: putfield 166	it/a/a/b:O	Z
    //   363: iload_3
    //   364: istore 4
    //   366: aload_0
    //   367: iconst_0
    //   368: putfield 172	it/a/a/b:R	Z
    //   371: iload_3
    //   372: istore 4
    //   374: aload 6
    //   376: monitorexit
    //   377: aload 5
    //   379: athrow
    //   380: astore 5
    //   382: aload_0
    //   383: getfield 180	it/a/a/b:V	Lit/a/a/f;
    //   386: invokevirtual 207	it/a/a/f:c	()Lit/a/a/s;
    //   389: astore 6
    //   391: aload 6
    //   393: invokevirtual 212	it/a/a/s:a	()I
    //   396: sipush 150
    //   399: if_icmpeq +149 -> 548
    //   402: aload 6
    //   404: invokevirtual 212	it/a/a/s:a	()I
    //   407: bipush 125
    //   409: if_icmpeq +139 -> 548
    //   412: new 306	it/a/a/m
    //   415: dup
    //   416: aload 6
    //   418: invokespecial 309	it/a/a/m:<init>	(Lit/a/a/s;)V
    //   421: athrow
    //   422: astore 6
    //   424: aload 5
    //   426: invokeinterface 471 1 0
    //   431: aload 6
    //   433: athrow
    //   434: astore 5
    //   436: iconst_0
    //   437: istore_3
    //   438: goto -56 -> 382
    //   441: astore 6
    //   443: aload 5
    //   445: monitorexit
    //   446: aload 6
    //   448: athrow
    //   449: new 499	it/a/a/j
    //   452: dup
    //   453: ldc_w 501
    //   456: aload 7
    //   458: invokespecial 504	it/a/a/j:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   461: athrow
    //   462: aload_0
    //   463: getfield 174	it/a/a/b:S	Z
    //   466: ifeq +16 -> 482
    //   469: aload_0
    //   470: getfield 180	it/a/a/b:V	Lit/a/a/f;
    //   473: invokevirtual 207	it/a/a/f:c	()Lit/a/a/s;
    //   476: pop
    //   477: aload_0
    //   478: iconst_0
    //   479: putfield 174	it/a/a/b:S	Z
    //   482: aload 5
    //   484: athrow
    //   485: aload_0
    //   486: getfield 174	it/a/a/b:S	Z
    //   489: ifeq +16 -> 505
    //   492: aload_0
    //   493: getfield 180	it/a/a/b:V	Lit/a/a/f;
    //   496: invokevirtual 207	it/a/a/f:c	()Lit/a/a/s;
    //   499: pop
    //   500: aload_0
    //   501: iconst_0
    //   502: putfield 174	it/a/a/b:S	Z
    //   505: aload 7
    //   507: invokevirtual 507	java/util/ArrayList:size	()I
    //   510: istore_2
    //   511: iload_2
    //   512: anewarray 217	java/lang/String
    //   515: astore 5
    //   517: iload_1
    //   518: iload_2
    //   519: if_icmpge +23 -> 542
    //   522: aload 5
    //   524: iload_1
    //   525: aload 7
    //   527: iload_1
    //   528: invokevirtual 511	java/util/ArrayList:get	(I)Ljava/lang/Object;
    //   531: checkcast 217	java/lang/String
    //   534: aastore
    //   535: iload_1
    //   536: iconst_1
    //   537: iadd
    //   538: istore_1
    //   539: goto -22 -> 517
    //   542: aload 9
    //   544: monitorexit
    //   545: aload 5
    //   547: areturn
    //   548: aload_0
    //   549: getfield 180	it/a/a/b:V	Lit/a/a/f;
    //   552: invokevirtual 207	it/a/a/f:c	()Lit/a/a/s;
    //   555: astore 6
    //   557: iload_3
    //   558: ifne -96 -> 462
    //   561: aload 6
    //   563: invokevirtual 212	it/a/a/s:a	()I
    //   566: sipush 226
    //   569: if_icmpeq -107 -> 462
    //   572: new 306	it/a/a/m
    //   575: dup
    //   576: aload 6
    //   578: invokespecial 309	it/a/a/m:<init>	(Lit/a/a/s;)V
    //   581: athrow
    //   582: astore 6
    //   584: goto -253 -> 331
    //   587: astore 6
    //   589: goto -253 -> 336
    //   592: astore 5
    //   594: iconst_0
    //   595: istore_3
    //   596: iload_3
    //   597: istore 4
    //   599: aload 6
    //   601: monitorexit
    //   602: aload 5
    //   604: athrow
    //   605: aload 6
    //   607: ifnull +8 -> 615
    //   610: aload 6
    //   612: invokevirtual 497	it/a/a/u:close	()V
    //   615: aload 10
    //   617: invokevirtual 304	java/net/Socket:close	()V
    //   620: aload_0
    //   621: aconst_null
    //   622: putfield 168	it/a/a/b:P	Ljava/io/InputStream;
    //   625: aload_0
    //   626: getfield 178	it/a/a/b:U	Ljava/lang/Object;
    //   629: astore 6
    //   631: aload 6
    //   633: monitorenter
    //   634: aload_0
    //   635: getfield 172	it/a/a/b:R	Z
    //   638: istore_3
    //   639: iload_3
    //   640: istore 4
    //   642: aload_0
    //   643: iconst_0
    //   644: putfield 166	it/a/a/b:O	Z
    //   647: iload_3
    //   648: istore 4
    //   650: aload_0
    //   651: iconst_0
    //   652: putfield 172	it/a/a/b:R	Z
    //   655: iload_3
    //   656: istore 4
    //   658: aload 6
    //   660: monitorexit
    //   661: aload_0
    //   662: getfield 180	it/a/a/b:V	Lit/a/a/f;
    //   665: invokevirtual 207	it/a/a/f:c	()Lit/a/a/s;
    //   668: astore 5
    //   670: aload 5
    //   672: invokevirtual 212	it/a/a/s:a	()I
    //   675: sipush 150
    //   678: if_icmpeq +46 -> 724
    //   681: aload 5
    //   683: invokevirtual 212	it/a/a/s:a	()I
    //   686: bipush 125
    //   688: if_icmpeq +36 -> 724
    //   691: new 306	it/a/a/m
    //   694: dup
    //   695: aload 5
    //   697: invokespecial 309	it/a/a/m:<init>	(Lit/a/a/s;)V
    //   700: athrow
    //   701: astore 5
    //   703: goto -88 -> 615
    //   706: astore 5
    //   708: goto -88 -> 620
    //   711: astore 5
    //   713: iconst_0
    //   714: istore_3
    //   715: iload_3
    //   716: istore 4
    //   718: aload 6
    //   720: monitorexit
    //   721: aload 5
    //   723: athrow
    //   724: aload_0
    //   725: getfield 180	it/a/a/b:V	Lit/a/a/f;
    //   728: invokevirtual 207	it/a/a/f:c	()Lit/a/a/s;
    //   731: astore 5
    //   733: iload_3
    //   734: ifne -249 -> 485
    //   737: aload 5
    //   739: invokevirtual 212	it/a/a/s:a	()I
    //   742: sipush 226
    //   745: if_icmpeq -260 -> 485
    //   748: new 306	it/a/a/m
    //   751: dup
    //   752: aload 5
    //   754: invokespecial 309	it/a/a/m:<init>	(Lit/a/a/s;)V
    //   757: athrow
    //   758: astore 5
    //   760: iload 4
    //   762: istore_3
    //   763: goto -48 -> 715
    //   766: astore 5
    //   768: iload 4
    //   770: istore_3
    //   771: goto -175 -> 596
    //   774: astore 5
    //   776: goto -455 -> 321
    //   779: astore 7
    //   781: aload 8
    //   783: astore 6
    //   785: goto -518 -> 267
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	788	0	this	b
    //   7	532	1	i1	int
    //   510	10	2	i2	int
    //   354	417	3	bool1	boolean
    //   356	413	4	bool2	boolean
    //   35	6	5	localObject1	Object
    //   78	300	5	localObject2	Object
    //   380	45	5	localObject3	Object
    //   434	49	5	localObject4	Object
    //   515	31	5	arrayOfString	String[]
    //   592	11	5	localObject5	Object
    //   668	28	5	locals1	s
    //   701	1	5	localThrowable1	Throwable
    //   706	1	5	localThrowable2	Throwable
    //   711	11	5	localObject6	Object
    //   731	22	5	locals2	s
    //   758	1	5	localObject7	Object
    //   766	1	5	localObject8	Object
    //   774	1	5	localObject9	Object
    //   1	416	6	localObject10	Object
    //   422	10	6	localObject11	Object
    //   441	6	6	localObject12	Object
    //   555	22	6	locals3	s
    //   582	1	6	localThrowable3	Throwable
    //   587	24	6	localThrowable4	Throwable
    //   109	146	7	localArrayList	ArrayList
    //   265	1	7	localIOException1	IOException
    //   299	10	7	localObject14	Object
    //   311	215	7	localThrowable5	Throwable
    //   779	1	7	localIOException2	IOException
    //   4	778	8	localObject15	Object
    //   12	531	9	localObject16	Object
    //   134	482	10	localSocket	Socket
    // Exception table:
    //   from	to	target	type
    //   17	35	35	finally
    //   37	40	35	finally
    //   43	61	35	finally
    //   61	102	35	finally
    //   102	127	35	finally
    //   382	422	35	finally
    //   462	482	35	finally
    //   482	485	35	finally
    //   485	505	35	finally
    //   505	517	35	finally
    //   522	535	35	finally
    //   542	545	35	finally
    //   548	557	35	finally
    //   561	582	35	finally
    //   661	701	35	finally
    //   724	733	35	finally
    //   737	758	35	finally
    //   234	241	265	java/io/IOException
    //   246	262	265	java/io/IOException
    //   284	299	299	finally
    //   301	304	299	finally
    //   449	462	299	finally
    //   174	183	311	finally
    //   187	194	311	finally
    //   198	213	311	finally
    //   217	234	311	finally
    //   271	277	311	finally
    //   281	284	311	finally
    //   308	311	311	finally
    //   377	380	380	finally
    //   602	605	380	finally
    //   721	724	380	finally
    //   127	136	422	finally
    //   136	152	434	finally
    //   326	331	434	finally
    //   331	336	434	finally
    //   336	350	434	finally
    //   424	434	434	finally
    //   446	449	434	finally
    //   610	615	434	finally
    //   615	620	434	finally
    //   620	634	434	finally
    //   152	170	441	finally
    //   443	446	441	finally
    //   326	331	582	java/lang/Throwable
    //   331	336	587	java/lang/Throwable
    //   350	355	592	finally
    //   610	615	701	java/lang/Throwable
    //   615	620	706	java/lang/Throwable
    //   634	639	711	finally
    //   642	647	758	finally
    //   650	655	758	finally
    //   658	661	758	finally
    //   718	721	758	finally
    //   358	363	766	finally
    //   366	371	766	finally
    //   374	377	766	finally
    //   599	602	766	finally
    //   234	241	774	finally
    //   246	262	774	finally
    //   174	183	779	java/io/IOException
    //   187	194	779	java/io/IOException
    //   198	213	779	java/io/IOException
    //   217	234	779	java/io/IOException
  }
  
  public h a()
  {
    synchronized (this.T)
    {
      h localh = this.n;
      return localh;
    }
  }
  
  public void a(int paramInt)
  {
    if ((paramInt != 0) && (paramInt != 1) && (paramInt != 2)) {
      throw new IllegalArgumentException("Invalid security");
    }
    synchronized (this.T)
    {
      if (this.y) {
        throw new IllegalStateException("The security level of the connection can't be changed while the client is connected");
      }
    }
    this.v = paramInt;
  }
  
  public void a(long paramLong)
  {
    synchronized (this.T)
    {
      if ((this.y) && (this.z)) {
        N();
      }
      long l1 = this.D;
      this.D = paramLong;
      if ((l1 != 0L) && (paramLong != 0L) && (this.F > 0L)) {
        this.F -= l1 - paramLong;
      }
      if ((this.y) && (this.z)) {
        M();
      }
      return;
    }
  }
  
  public void a(g paramg)
  {
    synchronized (this.T)
    {
      this.p.add(paramg);
      if (this.V != null) {
        this.V.a(paramg);
      }
      return;
    }
  }
  
  public void a(h paramh)
  {
    synchronized (this.T)
    {
      this.n = paramh;
      return;
    }
  }
  
  public void a(r paramr)
  {
    synchronized (this.T)
    {
      this.q.add(paramr);
      return;
    }
  }
  
  public void a(t paramt)
  {
    synchronized (this.T)
    {
      this.r = paramt;
      return;
    }
  }
  
  public void a(File paramFile)
  {
    a(paramFile, 0L, null);
  }
  
  public void a(File paramFile, long paramLong)
  {
    a(paramFile, paramLong, null);
  }
  
  /* Error */
  public void a(File paramFile, long paramLong, k paramk)
  {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual 540	java/io/File:exists	()Z
    //   4: ifne +15 -> 19
    //   7: new 542	java/io/FileNotFoundException
    //   10: dup
    //   11: aload_1
    //   12: invokevirtual 545	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   15: invokespecial 546	java/io/FileNotFoundException:<init>	(Ljava/lang/String;)V
    //   18: athrow
    //   19: new 548	java/io/FileInputStream
    //   22: dup
    //   23: aload_1
    //   24: invokespecial 550	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   27: astore 5
    //   29: aload_0
    //   30: aload_1
    //   31: invokevirtual 553	java/io/File:getName	()Ljava/lang/String;
    //   34: aload 5
    //   36: lload_2
    //   37: lload_2
    //   38: aload 4
    //   40: invokevirtual 556	it/a/a/b:a	(Ljava/lang/String;Ljava/io/InputStream;JJLit/a/a/k;)V
    //   43: aload 5
    //   45: ifnull +8 -> 53
    //   48: aload 5
    //   50: invokevirtual 559	java/io/InputStream:close	()V
    //   53: return
    //   54: astore_1
    //   55: new 499	it/a/a/j
    //   58: dup
    //   59: aload_1
    //   60: invokespecial 562	it/a/a/j:<init>	(Ljava/lang/Throwable;)V
    //   63: athrow
    //   64: astore_1
    //   65: aload_1
    //   66: athrow
    //   67: astore_1
    //   68: aload 5
    //   70: ifnull +8 -> 78
    //   73: aload 5
    //   75: invokevirtual 559	java/io/InputStream:close	()V
    //   78: aload_1
    //   79: athrow
    //   80: astore_1
    //   81: aload_1
    //   82: athrow
    //   83: astore_1
    //   84: aload_1
    //   85: athrow
    //   86: astore_1
    //   87: aload_1
    //   88: athrow
    //   89: astore_1
    //   90: aload_1
    //   91: athrow
    //   92: astore_1
    //   93: aload_1
    //   94: athrow
    //   95: astore 4
    //   97: goto -19 -> 78
    //   100: astore_1
    //   101: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	102	0	this	b
    //   0	102	1	paramFile	File
    //   0	102	2	paramLong	long
    //   0	102	4	paramk	k
    //   27	47	5	localFileInputStream	java.io.FileInputStream
    // Exception table:
    //   from	to	target	type
    //   19	29	54	java/io/IOException
    //   29	43	64	java/lang/IllegalStateException
    //   29	43	67	finally
    //   65	67	67	finally
    //   81	83	67	finally
    //   84	86	67	finally
    //   87	89	67	finally
    //   90	92	67	finally
    //   93	95	67	finally
    //   29	43	80	java/io/IOException
    //   29	43	83	it/a/a/o
    //   29	43	86	it/a/a/m
    //   29	43	89	it/a/a/j
    //   29	43	92	it/a/a/a
    //   73	78	95	java/lang/Throwable
    //   48	53	100	java/lang/Throwable
  }
  
  public void a(File paramFile, k paramk)
  {
    a(paramFile, 0L, paramk);
  }
  
  public void a(String paramString)
  {
    synchronized (this.T)
    {
      this.H = paramString;
      boolean bool = this.y;
      if (bool) {}
      try
      {
        this.V.b(I());
        return;
      }
      catch (IOException paramString)
      {
        for (;;)
        {
          paramString.printStackTrace();
        }
      }
    }
  }
  
  public void a(String paramString, File paramFile)
  {
    a(paramString, paramFile, 0L, null);
  }
  
  public void a(String paramString, File paramFile, long paramLong)
  {
    a(paramString, paramFile, paramLong, null);
  }
  
  /* Error */
  public void a(String paramString, File paramFile, long paramLong, k paramk)
  {
    // Byte code:
    //   0: lload_3
    //   1: lconst_0
    //   2: lcmp
    //   3: ifle +35 -> 38
    //   6: iconst_1
    //   7: istore 6
    //   9: new 573	java/io/FileOutputStream
    //   12: dup
    //   13: aload_2
    //   14: iload 6
    //   16: invokespecial 576	java/io/FileOutputStream:<init>	(Ljava/io/File;Z)V
    //   19: astore_2
    //   20: aload_0
    //   21: aload_1
    //   22: aload_2
    //   23: lload_3
    //   24: aload 5
    //   26: invokevirtual 579	it/a/a/b:a	(Ljava/lang/String;Ljava/io/OutputStream;JLit/a/a/k;)V
    //   29: aload_2
    //   30: ifnull +7 -> 37
    //   33: aload_2
    //   34: invokevirtual 582	java/io/OutputStream:close	()V
    //   37: return
    //   38: iconst_0
    //   39: istore 6
    //   41: goto -32 -> 9
    //   44: astore_1
    //   45: new 499	it/a/a/j
    //   48: dup
    //   49: aload_1
    //   50: invokespecial 562	it/a/a/j:<init>	(Ljava/lang/Throwable;)V
    //   53: athrow
    //   54: astore_1
    //   55: aload_1
    //   56: athrow
    //   57: astore_1
    //   58: aload_2
    //   59: ifnull +7 -> 66
    //   62: aload_2
    //   63: invokevirtual 582	java/io/OutputStream:close	()V
    //   66: aload_1
    //   67: athrow
    //   68: astore_1
    //   69: aload_1
    //   70: athrow
    //   71: astore_1
    //   72: aload_1
    //   73: athrow
    //   74: astore_1
    //   75: aload_1
    //   76: athrow
    //   77: astore_1
    //   78: aload_1
    //   79: athrow
    //   80: astore_1
    //   81: aload_1
    //   82: athrow
    //   83: astore_2
    //   84: goto -18 -> 66
    //   87: astore_1
    //   88: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	89	0	this	b
    //   0	89	1	paramString	String
    //   0	89	2	paramFile	File
    //   0	89	3	paramLong	long
    //   0	89	5	paramk	k
    //   7	33	6	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   9	20	44	java/io/IOException
    //   20	29	54	java/lang/IllegalStateException
    //   20	29	57	finally
    //   55	57	57	finally
    //   69	71	57	finally
    //   72	74	57	finally
    //   75	77	57	finally
    //   78	80	57	finally
    //   81	83	57	finally
    //   20	29	68	java/io/IOException
    //   20	29	71	it/a/a/o
    //   20	29	74	it/a/a/m
    //   20	29	77	it/a/a/j
    //   20	29	80	it/a/a/a
    //   62	66	83	java/lang/Throwable
    //   33	37	87	java/lang/Throwable
  }
  
  public void a(String paramString, File paramFile, k paramk)
  {
    a(paramString, paramFile, 0L, paramk);
  }
  
  /* Error */
  public void a(String paramString, InputStream arg2, long paramLong1, long paramLong2, k paramk)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 176	it/a/a/b:T	Ljava/lang/Object;
    //   4: astore 14
    //   6: aload 14
    //   8: monitorenter
    //   9: aload_0
    //   10: getfield 138	it/a/a/b:y	Z
    //   13: ifne +20 -> 33
    //   16: new 446	java/lang/IllegalStateException
    //   19: dup
    //   20: ldc_w 448
    //   23: invokespecial 449	java/lang/IllegalStateException:<init>	(Ljava/lang/String;)V
    //   26: athrow
    //   27: astore_1
    //   28: aload 14
    //   30: monitorexit
    //   31: aload_1
    //   32: athrow
    //   33: aload_0
    //   34: getfield 140	it/a/a/b:z	Z
    //   37: ifne +14 -> 51
    //   40: new 446	java/lang/IllegalStateException
    //   43: dup
    //   44: ldc_w 451
    //   47: invokespecial 449	java/lang/IllegalStateException:<init>	(Ljava/lang/String;)V
    //   50: athrow
    //   51: aload_0
    //   52: getfield 144	it/a/a/b:B	I
    //   55: istore 9
    //   57: iload 9
    //   59: istore 8
    //   61: iload 9
    //   63: ifne +10 -> 73
    //   66: aload_0
    //   67: aload_1
    //   68: invokespecial 585	it/a/a/b:m	(Ljava/lang/String;)I
    //   71: istore 8
    //   73: iload 8
    //   75: iconst_1
    //   76: if_icmpne +44 -> 120
    //   79: aload_0
    //   80: getfield 180	it/a/a/b:V	Lit/a/a/f;
    //   83: ldc_w 463
    //   86: invokevirtual 204	it/a/a/f:a	(Ljava/lang/String;)V
    //   89: aload_0
    //   90: getfield 180	it/a/a/b:V	Lit/a/a/f;
    //   93: invokevirtual 207	it/a/a/f:c	()Lit/a/a/s;
    //   96: astore 15
    //   98: aload_0
    //   99: invokespecial 257	it/a/a/b:O	()V
    //   102: aload 15
    //   104: invokevirtual 254	it/a/a/s:b	()Z
    //   107: ifne +32 -> 139
    //   110: new 306	it/a/a/m
    //   113: dup
    //   114: aload 15
    //   116: invokespecial 309	it/a/a/m:<init>	(Lit/a/a/s;)V
    //   119: athrow
    //   120: iload 8
    //   122: iconst_2
    //   123: if_icmpne -34 -> 89
    //   126: aload_0
    //   127: getfield 180	it/a/a/b:V	Lit/a/a/f;
    //   130: ldc_w 587
    //   133: invokevirtual 204	it/a/a/f:a	(Ljava/lang/String;)V
    //   136: goto -47 -> 89
    //   139: aload_0
    //   140: invokespecial 465	it/a/a/b:F	()Lit/a/a/i;
    //   143: astore 15
    //   145: aload_0
    //   146: getfield 150	it/a/a/b:G	Z
    //   149: istore 10
    //   151: iload 10
    //   153: ifne +9 -> 162
    //   156: lload_3
    //   157: lconst_0
    //   158: lcmp
    //   159: ifle +99 -> 258
    //   162: aload_0
    //   163: getfield 180	it/a/a/b:V	Lit/a/a/f;
    //   166: new 279	java/lang/StringBuffer
    //   169: dup
    //   170: invokespecial 280	java/lang/StringBuffer:<init>	()V
    //   173: ldc_w 589
    //   176: invokevirtual 286	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   179: lload_3
    //   180: invokevirtual 592	java/lang/StringBuffer:append	(J)Ljava/lang/StringBuffer;
    //   183: invokevirtual 294	java/lang/StringBuffer:toString	()Ljava/lang/String;
    //   186: invokevirtual 204	it/a/a/f:a	(Ljava/lang/String;)V
    //   189: aload_0
    //   190: getfield 180	it/a/a/b:V	Lit/a/a/f;
    //   193: invokevirtual 207	it/a/a/f:c	()Lit/a/a/s;
    //   196: astore 16
    //   198: aload_0
    //   199: invokespecial 257	it/a/a/b:O	()V
    //   202: aload 16
    //   204: invokevirtual 212	it/a/a/s:a	()I
    //   207: sipush 350
    //   210: if_icmpeq +48 -> 258
    //   213: aload 16
    //   215: invokevirtual 212	it/a/a/s:a	()I
    //   218: sipush 501
    //   221: if_icmpeq +837 -> 1058
    //   224: aload 16
    //   226: invokevirtual 212	it/a/a/s:a	()I
    //   229: sipush 502
    //   232: if_icmpne +6 -> 238
    //   235: goto +823 -> 1058
    //   238: new 306	it/a/a/m
    //   241: dup
    //   242: aload 16
    //   244: invokespecial 309	it/a/a/m:<init>	(Lit/a/a/s;)V
    //   247: athrow
    //   248: astore_1
    //   249: aload 15
    //   251: invokeinterface 471 1 0
    //   256: aload_1
    //   257: athrow
    //   258: iconst_0
    //   259: istore 12
    //   261: iconst_0
    //   262: istore 13
    //   264: iconst_0
    //   265: istore 11
    //   267: aload_0
    //   268: getfield 180	it/a/a/b:V	Lit/a/a/f;
    //   271: new 279	java/lang/StringBuffer
    //   274: dup
    //   275: invokespecial 280	java/lang/StringBuffer:<init>	()V
    //   278: ldc_w 594
    //   281: invokevirtual 286	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   284: aload_1
    //   285: invokevirtual 286	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   288: invokevirtual 294	java/lang/StringBuffer:toString	()Ljava/lang/String;
    //   291: invokevirtual 204	it/a/a/f:a	(Ljava/lang/String;)V
    //   294: aload 15
    //   296: invokeinterface 470 1 0
    //   301: astore_1
    //   302: iload 11
    //   304: istore 10
    //   306: aload 15
    //   308: invokeinterface 471 1 0
    //   313: iload 11
    //   315: istore 10
    //   317: aload_0
    //   318: getfield 178	it/a/a/b:U	Ljava/lang/Object;
    //   321: astore 15
    //   323: iload 11
    //   325: istore 10
    //   327: aload 15
    //   329: monitorenter
    //   330: aload_0
    //   331: iconst_1
    //   332: putfield 166	it/a/a/b:O	Z
    //   335: aload_0
    //   336: iconst_0
    //   337: putfield 172	it/a/a/b:R	Z
    //   340: aload_0
    //   341: iconst_0
    //   342: putfield 174	it/a/a/b:S	Z
    //   345: aload 15
    //   347: monitorexit
    //   348: aload_2
    //   349: lload 5
    //   351: invokevirtual 598	java/io/InputStream:skip	(J)J
    //   354: pop2
    //   355: aload_0
    //   356: aload_1
    //   357: invokevirtual 602	java/net/Socket:getOutputStream	()Ljava/io/OutputStream;
    //   360: putfield 170	it/a/a/b:Q	Ljava/io/OutputStream;
    //   363: aload_0
    //   364: getfield 162	it/a/a/b:M	Z
    //   367: ifeq +18 -> 385
    //   370: aload_0
    //   371: new 604	java/util/zip/DeflaterOutputStream
    //   374: dup
    //   375: aload_0
    //   376: getfield 170	it/a/a/b:Q	Ljava/io/OutputStream;
    //   379: invokespecial 607	java/util/zip/DeflaterOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   382: putfield 170	it/a/a/b:Q	Ljava/io/OutputStream;
    //   385: aload 7
    //   387: ifnull +10 -> 397
    //   390: aload 7
    //   392: invokeinterface 611 1 0
    //   397: iload 8
    //   399: iconst_1
    //   400: if_icmpne +292 -> 692
    //   403: new 613	java/io/InputStreamReader
    //   406: dup
    //   407: aload_2
    //   408: invokespecial 614	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;)V
    //   411: astore_2
    //   412: new 616	java/io/OutputStreamWriter
    //   415: dup
    //   416: aload_0
    //   417: getfield 170	it/a/a/b:Q	Ljava/io/OutputStream;
    //   420: aload_0
    //   421: invokespecial 484	it/a/a/b:I	()Ljava/lang/String;
    //   424: invokespecial 619	java/io/OutputStreamWriter:<init>	(Ljava/io/OutputStream;Ljava/lang/String;)V
    //   427: astore 15
    //   429: ldc 21
    //   431: newarray <illegal type>
    //   433: astore 16
    //   435: aload_2
    //   436: aload 16
    //   438: invokevirtual 625	java/io/Reader:read	([C)I
    //   441: istore 8
    //   443: iload 8
    //   445: iconst_m1
    //   446: if_icmpeq +432 -> 878
    //   449: aload 15
    //   451: aload 16
    //   453: iconst_0
    //   454: iload 8
    //   456: invokevirtual 631	java/io/Writer:write	([CII)V
    //   459: aload 15
    //   461: invokevirtual 634	java/io/Writer:flush	()V
    //   464: aload 7
    //   466: ifnull -31 -> 435
    //   469: aload 7
    //   471: iload 8
    //   473: invokeinterface 636 2 0
    //   478: goto -43 -> 435
    //   481: astore 15
    //   483: aload_0
    //   484: getfield 178	it/a/a/b:U	Ljava/lang/Object;
    //   487: astore_2
    //   488: aload_2
    //   489: monitorenter
    //   490: aload_0
    //   491: getfield 172	it/a/a/b:R	Z
    //   494: ifeq +260 -> 754
    //   497: aload 7
    //   499: ifnull +10 -> 509
    //   502: aload 7
    //   504: invokeinterface 638 1 0
    //   509: new 495	it/a/a/a
    //   512: dup
    //   513: invokespecial 496	it/a/a/a:<init>	()V
    //   516: athrow
    //   517: astore 7
    //   519: aload_2
    //   520: monitorexit
    //   521: aload 7
    //   523: athrow
    //   524: astore_2
    //   525: iload 11
    //   527: istore 10
    //   529: aload_0
    //   530: getfield 170	it/a/a/b:Q	Ljava/io/OutputStream;
    //   533: astore 7
    //   535: aload 7
    //   537: ifnull +14 -> 551
    //   540: iload 11
    //   542: istore 10
    //   544: aload_0
    //   545: getfield 170	it/a/a/b:Q	Ljava/io/OutputStream;
    //   548: invokevirtual 582	java/io/OutputStream:close	()V
    //   551: iload 11
    //   553: istore 10
    //   555: aload_1
    //   556: invokevirtual 304	java/net/Socket:close	()V
    //   559: iload 11
    //   561: istore 10
    //   563: aload_0
    //   564: aconst_null
    //   565: putfield 170	it/a/a/b:Q	Ljava/io/OutputStream;
    //   568: iload 11
    //   570: istore 10
    //   572: aload_0
    //   573: getfield 178	it/a/a/b:U	Ljava/lang/Object;
    //   576: astore_1
    //   577: iload 11
    //   579: istore 10
    //   581: aload_1
    //   582: monitorenter
    //   583: iload 12
    //   585: istore 10
    //   587: aload_0
    //   588: getfield 172	it/a/a/b:R	Z
    //   591: istore 11
    //   593: iload 11
    //   595: istore 10
    //   597: aload_0
    //   598: iconst_0
    //   599: putfield 166	it/a/a/b:O	Z
    //   602: iload 11
    //   604: istore 10
    //   606: aload_0
    //   607: iconst_0
    //   608: putfield 172	it/a/a/b:R	Z
    //   611: iload 11
    //   613: istore 10
    //   615: aload_1
    //   616: monitorexit
    //   617: iload 11
    //   619: istore 10
    //   621: aload_2
    //   622: athrow
    //   623: astore_1
    //   624: aload_0
    //   625: getfield 180	it/a/a/b:V	Lit/a/a/f;
    //   628: invokevirtual 207	it/a/a/f:c	()Lit/a/a/s;
    //   631: astore_2
    //   632: aload_0
    //   633: invokespecial 257	it/a/a/b:O	()V
    //   636: aload_2
    //   637: invokevirtual 212	it/a/a/s:a	()I
    //   640: sipush 150
    //   643: if_icmpeq +194 -> 837
    //   646: aload_2
    //   647: invokevirtual 212	it/a/a/s:a	()I
    //   650: bipush 125
    //   652: if_icmpeq +185 -> 837
    //   655: new 306	it/a/a/m
    //   658: dup
    //   659: aload_2
    //   660: invokespecial 309	it/a/a/m:<init>	(Lit/a/a/s;)V
    //   663: athrow
    //   664: astore_1
    //   665: iload 11
    //   667: istore 10
    //   669: aload 15
    //   671: invokeinterface 471 1 0
    //   676: iload 11
    //   678: istore 10
    //   680: aload_1
    //   681: athrow
    //   682: astore_1
    //   683: aload 15
    //   685: monitorexit
    //   686: iload 11
    //   688: istore 10
    //   690: aload_1
    //   691: athrow
    //   692: iload 8
    //   694: iconst_2
    //   695: if_icmpne +183 -> 878
    //   698: ldc 21
    //   700: newarray <illegal type>
    //   702: astore 15
    //   704: aload_2
    //   705: aload 15
    //   707: invokevirtual 641	java/io/InputStream:read	([B)I
    //   710: istore 8
    //   712: iload 8
    //   714: iconst_m1
    //   715: if_icmpeq +163 -> 878
    //   718: aload_0
    //   719: getfield 170	it/a/a/b:Q	Ljava/io/OutputStream;
    //   722: aload 15
    //   724: iconst_0
    //   725: iload 8
    //   727: invokevirtual 644	java/io/OutputStream:write	([BII)V
    //   730: aload_0
    //   731: getfield 170	it/a/a/b:Q	Ljava/io/OutputStream;
    //   734: invokevirtual 645	java/io/OutputStream:flush	()V
    //   737: aload 7
    //   739: ifnull -35 -> 704
    //   742: aload 7
    //   744: iload 8
    //   746: invokeinterface 636 2 0
    //   751: goto -47 -> 704
    //   754: aload 7
    //   756: ifnull +10 -> 766
    //   759: aload 7
    //   761: invokeinterface 647 1 0
    //   766: new 499	it/a/a/j
    //   769: dup
    //   770: ldc_w 501
    //   773: aload 15
    //   775: invokespecial 504	it/a/a/j:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   778: athrow
    //   779: aload_0
    //   780: getfield 174	it/a/a/b:S	Z
    //   783: ifeq +16 -> 799
    //   786: aload_0
    //   787: getfield 180	it/a/a/b:V	Lit/a/a/f;
    //   790: invokevirtual 207	it/a/a/f:c	()Lit/a/a/s;
    //   793: pop
    //   794: aload_0
    //   795: iconst_0
    //   796: putfield 174	it/a/a/b:S	Z
    //   799: aload_1
    //   800: athrow
    //   801: aload_0
    //   802: getfield 174	it/a/a/b:S	Z
    //   805: ifeq +16 -> 821
    //   808: aload_0
    //   809: getfield 180	it/a/a/b:V	Lit/a/a/f;
    //   812: invokevirtual 207	it/a/a/f:c	()Lit/a/a/s;
    //   815: pop
    //   816: aload_0
    //   817: iconst_0
    //   818: putfield 174	it/a/a/b:S	Z
    //   821: aload 7
    //   823: ifnull +10 -> 833
    //   826: aload 7
    //   828: invokeinterface 648 1 0
    //   833: aload 14
    //   835: monitorexit
    //   836: return
    //   837: aload_0
    //   838: getfield 180	it/a/a/b:V	Lit/a/a/f;
    //   841: invokevirtual 207	it/a/a/f:c	()Lit/a/a/s;
    //   844: astore_2
    //   845: iload 10
    //   847: ifne -68 -> 779
    //   850: aload_2
    //   851: invokevirtual 212	it/a/a/s:a	()I
    //   854: sipush 226
    //   857: if_icmpeq -78 -> 779
    //   860: new 306	it/a/a/m
    //   863: dup
    //   864: aload_2
    //   865: invokespecial 309	it/a/a/m:<init>	(Lit/a/a/s;)V
    //   868: athrow
    //   869: astore_1
    //   870: goto -311 -> 559
    //   873: astore_2
    //   874: aload_1
    //   875: monitorexit
    //   876: aload_2
    //   877: athrow
    //   878: iload 11
    //   880: istore 10
    //   882: aload_0
    //   883: getfield 170	it/a/a/b:Q	Ljava/io/OutputStream;
    //   886: astore_2
    //   887: aload_2
    //   888: ifnull +14 -> 902
    //   891: iload 11
    //   893: istore 10
    //   895: aload_0
    //   896: getfield 170	it/a/a/b:Q	Ljava/io/OutputStream;
    //   899: invokevirtual 582	java/io/OutputStream:close	()V
    //   902: iload 11
    //   904: istore 10
    //   906: aload_1
    //   907: invokevirtual 304	java/net/Socket:close	()V
    //   910: iload 11
    //   912: istore 10
    //   914: aload_0
    //   915: aconst_null
    //   916: putfield 170	it/a/a/b:Q	Ljava/io/OutputStream;
    //   919: iload 11
    //   921: istore 10
    //   923: aload_0
    //   924: getfield 178	it/a/a/b:U	Ljava/lang/Object;
    //   927: astore_1
    //   928: iload 11
    //   930: istore 10
    //   932: aload_1
    //   933: monitorenter
    //   934: iload 13
    //   936: istore 10
    //   938: aload_0
    //   939: getfield 172	it/a/a/b:R	Z
    //   942: istore 11
    //   944: iload 11
    //   946: istore 10
    //   948: aload_0
    //   949: iconst_0
    //   950: putfield 166	it/a/a/b:O	Z
    //   953: iload 11
    //   955: istore 10
    //   957: aload_0
    //   958: iconst_0
    //   959: putfield 172	it/a/a/b:R	Z
    //   962: iload 11
    //   964: istore 10
    //   966: aload_1
    //   967: monitorexit
    //   968: aload_0
    //   969: getfield 180	it/a/a/b:V	Lit/a/a/f;
    //   972: invokevirtual 207	it/a/a/f:c	()Lit/a/a/s;
    //   975: astore_1
    //   976: aload_0
    //   977: invokespecial 257	it/a/a/b:O	()V
    //   980: aload_1
    //   981: invokevirtual 212	it/a/a/s:a	()I
    //   984: sipush 150
    //   987: if_icmpeq +30 -> 1017
    //   990: aload_1
    //   991: invokevirtual 212	it/a/a/s:a	()I
    //   994: bipush 125
    //   996: if_icmpeq +21 -> 1017
    //   999: new 306	it/a/a/m
    //   1002: dup
    //   1003: aload_1
    //   1004: invokespecial 309	it/a/a/m:<init>	(Lit/a/a/s;)V
    //   1007: athrow
    //   1008: astore_1
    //   1009: goto -99 -> 910
    //   1012: astore_2
    //   1013: aload_1
    //   1014: monitorexit
    //   1015: aload_2
    //   1016: athrow
    //   1017: aload_0
    //   1018: getfield 180	it/a/a/b:V	Lit/a/a/f;
    //   1021: invokevirtual 207	it/a/a/f:c	()Lit/a/a/s;
    //   1024: astore_1
    //   1025: iload 11
    //   1027: ifne -226 -> 801
    //   1030: aload_1
    //   1031: invokevirtual 212	it/a/a/s:a	()I
    //   1034: sipush 226
    //   1037: if_icmpeq -236 -> 801
    //   1040: new 306	it/a/a/m
    //   1043: dup
    //   1044: aload_1
    //   1045: invokespecial 309	it/a/a/m:<init>	(Lit/a/a/s;)V
    //   1048: athrow
    //   1049: astore_2
    //   1050: goto -148 -> 902
    //   1053: astore 7
    //   1055: goto -504 -> 551
    //   1058: lload_3
    //   1059: lconst_0
    //   1060: lcmp
    //   1061: ifle -803 -> 258
    //   1064: goto -826 -> 238
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	1067	0	this	b
    //   0	1067	1	paramString	String
    //   0	1067	3	paramLong1	long
    //   0	1067	5	paramLong2	long
    //   0	1067	7	paramk	k
    //   59	686	8	i1	int
    //   55	7	9	i2	int
    //   149	816	10	bool1	boolean
    //   265	761	11	bool2	boolean
    //   259	325	12	bool3	boolean
    //   262	673	13	bool4	boolean
    //   4	830	14	localObject1	Object
    //   96	364	15	localObject2	Object
    //   481	203	15	localIOException	IOException
    //   702	72	15	arrayOfByte	byte[]
    //   196	256	16	localObject3	Object
    // Exception table:
    //   from	to	target	type
    //   9	27	27	finally
    //   28	31	27	finally
    //   33	51	27	finally
    //   51	57	27	finally
    //   66	73	27	finally
    //   79	89	27	finally
    //   89	120	27	finally
    //   126	136	27	finally
    //   139	151	27	finally
    //   249	258	27	finally
    //   267	294	27	finally
    //   624	664	27	finally
    //   779	799	27	finally
    //   799	801	27	finally
    //   801	821	27	finally
    //   826	833	27	finally
    //   833	836	27	finally
    //   837	845	27	finally
    //   850	869	27	finally
    //   968	1008	27	finally
    //   1017	1025	27	finally
    //   1030	1049	27	finally
    //   162	235	248	finally
    //   238	248	248	finally
    //   348	385	481	java/io/IOException
    //   390	397	481	java/io/IOException
    //   403	435	481	java/io/IOException
    //   435	443	481	java/io/IOException
    //   449	464	481	java/io/IOException
    //   469	478	481	java/io/IOException
    //   698	704	481	java/io/IOException
    //   704	712	481	java/io/IOException
    //   718	737	481	java/io/IOException
    //   742	751	481	java/io/IOException
    //   490	497	517	finally
    //   502	509	517	finally
    //   509	517	517	finally
    //   519	521	517	finally
    //   759	766	517	finally
    //   766	779	517	finally
    //   348	385	524	finally
    //   390	397	524	finally
    //   403	435	524	finally
    //   435	443	524	finally
    //   449	464	524	finally
    //   469	478	524	finally
    //   483	490	524	finally
    //   521	524	524	finally
    //   698	704	524	finally
    //   704	712	524	finally
    //   718	737	524	finally
    //   742	751	524	finally
    //   306	313	623	finally
    //   317	323	623	finally
    //   327	330	623	finally
    //   529	535	623	finally
    //   544	551	623	finally
    //   555	559	623	finally
    //   563	568	623	finally
    //   572	577	623	finally
    //   581	583	623	finally
    //   621	623	623	finally
    //   669	676	623	finally
    //   680	682	623	finally
    //   690	692	623	finally
    //   876	878	623	finally
    //   882	887	623	finally
    //   895	902	623	finally
    //   906	910	623	finally
    //   914	919	623	finally
    //   923	928	623	finally
    //   932	934	623	finally
    //   1015	1017	623	finally
    //   294	302	664	finally
    //   330	348	682	finally
    //   683	686	682	finally
    //   555	559	869	java/lang/Throwable
    //   587	593	873	finally
    //   597	602	873	finally
    //   606	611	873	finally
    //   615	617	873	finally
    //   874	876	873	finally
    //   906	910	1008	java/lang/Throwable
    //   938	944	1012	finally
    //   948	953	1012	finally
    //   957	962	1012	finally
    //   966	968	1012	finally
    //   1013	1015	1012	finally
    //   895	902	1049	java/lang/Throwable
    //   544	551	1053	java/lang/Throwable
  }
  
  /* Error */
  public void a(String paramString, InputStream arg2, long paramLong, k paramk)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 176	it/a/a/b:T	Ljava/lang/Object;
    //   4: astore 12
    //   6: aload 12
    //   8: monitorenter
    //   9: aload_0
    //   10: getfield 138	it/a/a/b:y	Z
    //   13: ifne +20 -> 33
    //   16: new 446	java/lang/IllegalStateException
    //   19: dup
    //   20: ldc_w 448
    //   23: invokespecial 449	java/lang/IllegalStateException:<init>	(Ljava/lang/String;)V
    //   26: athrow
    //   27: astore_1
    //   28: aload 12
    //   30: monitorexit
    //   31: aload_1
    //   32: athrow
    //   33: aload_0
    //   34: getfield 140	it/a/a/b:z	Z
    //   37: ifne +14 -> 51
    //   40: new 446	java/lang/IllegalStateException
    //   43: dup
    //   44: ldc_w 451
    //   47: invokespecial 449	java/lang/IllegalStateException:<init>	(Ljava/lang/String;)V
    //   50: athrow
    //   51: aload_0
    //   52: getfield 144	it/a/a/b:B	I
    //   55: istore 7
    //   57: iload 7
    //   59: istore 6
    //   61: iload 7
    //   63: ifne +10 -> 73
    //   66: aload_0
    //   67: aload_1
    //   68: invokespecial 585	it/a/a/b:m	(Ljava/lang/String;)I
    //   71: istore 6
    //   73: iload 6
    //   75: iconst_1
    //   76: if_icmpne +44 -> 120
    //   79: aload_0
    //   80: getfield 180	it/a/a/b:V	Lit/a/a/f;
    //   83: ldc_w 463
    //   86: invokevirtual 204	it/a/a/f:a	(Ljava/lang/String;)V
    //   89: aload_0
    //   90: getfield 180	it/a/a/b:V	Lit/a/a/f;
    //   93: invokevirtual 207	it/a/a/f:c	()Lit/a/a/s;
    //   96: astore 13
    //   98: aload_0
    //   99: invokespecial 257	it/a/a/b:O	()V
    //   102: aload 13
    //   104: invokevirtual 254	it/a/a/s:b	()Z
    //   107: ifne +32 -> 139
    //   110: new 306	it/a/a/m
    //   113: dup
    //   114: aload 13
    //   116: invokespecial 309	it/a/a/m:<init>	(Lit/a/a/s;)V
    //   119: athrow
    //   120: iload 6
    //   122: iconst_2
    //   123: if_icmpne -34 -> 89
    //   126: aload_0
    //   127: getfield 180	it/a/a/b:V	Lit/a/a/f;
    //   130: ldc_w 587
    //   133: invokevirtual 204	it/a/a/f:a	(Ljava/lang/String;)V
    //   136: goto -47 -> 89
    //   139: iconst_0
    //   140: istore 10
    //   142: iconst_0
    //   143: istore 11
    //   145: iconst_0
    //   146: istore 9
    //   148: aload_0
    //   149: invokespecial 465	it/a/a/b:F	()Lit/a/a/i;
    //   152: astore 13
    //   154: aload_0
    //   155: getfield 180	it/a/a/b:V	Lit/a/a/f;
    //   158: new 279	java/lang/StringBuffer
    //   161: dup
    //   162: invokespecial 280	java/lang/StringBuffer:<init>	()V
    //   165: ldc_w 651
    //   168: invokevirtual 286	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   171: aload_1
    //   172: invokevirtual 286	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   175: invokevirtual 294	java/lang/StringBuffer:toString	()Ljava/lang/String;
    //   178: invokevirtual 204	it/a/a/f:a	(Ljava/lang/String;)V
    //   181: aload 13
    //   183: invokeinterface 470 1 0
    //   188: astore_1
    //   189: iload 9
    //   191: istore 8
    //   193: aload 13
    //   195: invokeinterface 471 1 0
    //   200: iload 9
    //   202: istore 8
    //   204: aload_0
    //   205: getfield 178	it/a/a/b:U	Ljava/lang/Object;
    //   208: astore 13
    //   210: iload 9
    //   212: istore 8
    //   214: aload 13
    //   216: monitorenter
    //   217: aload_0
    //   218: iconst_1
    //   219: putfield 166	it/a/a/b:O	Z
    //   222: aload_0
    //   223: iconst_0
    //   224: putfield 172	it/a/a/b:R	Z
    //   227: aload_0
    //   228: iconst_0
    //   229: putfield 174	it/a/a/b:S	Z
    //   232: aload 13
    //   234: monitorexit
    //   235: aload_2
    //   236: lload_3
    //   237: invokevirtual 598	java/io/InputStream:skip	(J)J
    //   240: pop2
    //   241: aload_0
    //   242: aload_1
    //   243: invokevirtual 602	java/net/Socket:getOutputStream	()Ljava/io/OutputStream;
    //   246: putfield 170	it/a/a/b:Q	Ljava/io/OutputStream;
    //   249: aload_0
    //   250: getfield 162	it/a/a/b:M	Z
    //   253: ifeq +18 -> 271
    //   256: aload_0
    //   257: new 604	java/util/zip/DeflaterOutputStream
    //   260: dup
    //   261: aload_0
    //   262: getfield 170	it/a/a/b:Q	Ljava/io/OutputStream;
    //   265: invokespecial 607	java/util/zip/DeflaterOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   268: putfield 170	it/a/a/b:Q	Ljava/io/OutputStream;
    //   271: aload 5
    //   273: ifnull +10 -> 283
    //   276: aload 5
    //   278: invokeinterface 611 1 0
    //   283: iload 6
    //   285: iconst_1
    //   286: if_icmpne +292 -> 578
    //   289: new 613	java/io/InputStreamReader
    //   292: dup
    //   293: aload_2
    //   294: invokespecial 614	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;)V
    //   297: astore_2
    //   298: new 616	java/io/OutputStreamWriter
    //   301: dup
    //   302: aload_0
    //   303: getfield 170	it/a/a/b:Q	Ljava/io/OutputStream;
    //   306: aload_0
    //   307: invokespecial 484	it/a/a/b:I	()Ljava/lang/String;
    //   310: invokespecial 619	java/io/OutputStreamWriter:<init>	(Ljava/io/OutputStream;Ljava/lang/String;)V
    //   313: astore 13
    //   315: ldc 21
    //   317: newarray <illegal type>
    //   319: astore 14
    //   321: aload_2
    //   322: aload 14
    //   324: invokevirtual 625	java/io/Reader:read	([C)I
    //   327: istore 6
    //   329: iload 6
    //   331: iconst_m1
    //   332: if_icmpeq +432 -> 764
    //   335: aload 13
    //   337: aload 14
    //   339: iconst_0
    //   340: iload 6
    //   342: invokevirtual 631	java/io/Writer:write	([CII)V
    //   345: aload 13
    //   347: invokevirtual 634	java/io/Writer:flush	()V
    //   350: aload 5
    //   352: ifnull -31 -> 321
    //   355: aload 5
    //   357: iload 6
    //   359: invokeinterface 636 2 0
    //   364: goto -43 -> 321
    //   367: astore 13
    //   369: aload_0
    //   370: getfield 178	it/a/a/b:U	Ljava/lang/Object;
    //   373: astore_2
    //   374: aload_2
    //   375: monitorenter
    //   376: aload_0
    //   377: getfield 172	it/a/a/b:R	Z
    //   380: ifeq +260 -> 640
    //   383: aload 5
    //   385: ifnull +10 -> 395
    //   388: aload 5
    //   390: invokeinterface 638 1 0
    //   395: new 495	it/a/a/a
    //   398: dup
    //   399: invokespecial 496	it/a/a/a:<init>	()V
    //   402: athrow
    //   403: astore 5
    //   405: aload_2
    //   406: monitorexit
    //   407: aload 5
    //   409: athrow
    //   410: astore_2
    //   411: iload 9
    //   413: istore 8
    //   415: aload_0
    //   416: getfield 170	it/a/a/b:Q	Ljava/io/OutputStream;
    //   419: astore 5
    //   421: aload 5
    //   423: ifnull +14 -> 437
    //   426: iload 9
    //   428: istore 8
    //   430: aload_0
    //   431: getfield 170	it/a/a/b:Q	Ljava/io/OutputStream;
    //   434: invokevirtual 582	java/io/OutputStream:close	()V
    //   437: iload 9
    //   439: istore 8
    //   441: aload_1
    //   442: invokevirtual 304	java/net/Socket:close	()V
    //   445: iload 9
    //   447: istore 8
    //   449: aload_0
    //   450: aconst_null
    //   451: putfield 170	it/a/a/b:Q	Ljava/io/OutputStream;
    //   454: iload 9
    //   456: istore 8
    //   458: aload_0
    //   459: getfield 178	it/a/a/b:U	Ljava/lang/Object;
    //   462: astore_1
    //   463: iload 9
    //   465: istore 8
    //   467: aload_1
    //   468: monitorenter
    //   469: iload 10
    //   471: istore 8
    //   473: aload_0
    //   474: getfield 172	it/a/a/b:R	Z
    //   477: istore 9
    //   479: iload 9
    //   481: istore 8
    //   483: aload_0
    //   484: iconst_0
    //   485: putfield 166	it/a/a/b:O	Z
    //   488: iload 9
    //   490: istore 8
    //   492: aload_0
    //   493: iconst_0
    //   494: putfield 172	it/a/a/b:R	Z
    //   497: iload 9
    //   499: istore 8
    //   501: aload_1
    //   502: monitorexit
    //   503: iload 9
    //   505: istore 8
    //   507: aload_2
    //   508: athrow
    //   509: astore_1
    //   510: aload_0
    //   511: getfield 180	it/a/a/b:V	Lit/a/a/f;
    //   514: invokevirtual 207	it/a/a/f:c	()Lit/a/a/s;
    //   517: astore_2
    //   518: aload_0
    //   519: invokespecial 257	it/a/a/b:O	()V
    //   522: aload_2
    //   523: invokevirtual 212	it/a/a/s:a	()I
    //   526: sipush 150
    //   529: if_icmpeq +194 -> 723
    //   532: aload_2
    //   533: invokevirtual 212	it/a/a/s:a	()I
    //   536: bipush 125
    //   538: if_icmpeq +185 -> 723
    //   541: new 306	it/a/a/m
    //   544: dup
    //   545: aload_2
    //   546: invokespecial 309	it/a/a/m:<init>	(Lit/a/a/s;)V
    //   549: athrow
    //   550: astore_1
    //   551: iload 9
    //   553: istore 8
    //   555: aload 13
    //   557: invokeinterface 471 1 0
    //   562: iload 9
    //   564: istore 8
    //   566: aload_1
    //   567: athrow
    //   568: astore_1
    //   569: aload 13
    //   571: monitorexit
    //   572: iload 9
    //   574: istore 8
    //   576: aload_1
    //   577: athrow
    //   578: iload 6
    //   580: iconst_2
    //   581: if_icmpne +183 -> 764
    //   584: ldc 21
    //   586: newarray <illegal type>
    //   588: astore 13
    //   590: aload_2
    //   591: aload 13
    //   593: invokevirtual 641	java/io/InputStream:read	([B)I
    //   596: istore 6
    //   598: iload 6
    //   600: iconst_m1
    //   601: if_icmpeq +163 -> 764
    //   604: aload_0
    //   605: getfield 170	it/a/a/b:Q	Ljava/io/OutputStream;
    //   608: aload 13
    //   610: iconst_0
    //   611: iload 6
    //   613: invokevirtual 644	java/io/OutputStream:write	([BII)V
    //   616: aload_0
    //   617: getfield 170	it/a/a/b:Q	Ljava/io/OutputStream;
    //   620: invokevirtual 645	java/io/OutputStream:flush	()V
    //   623: aload 5
    //   625: ifnull -35 -> 590
    //   628: aload 5
    //   630: iload 6
    //   632: invokeinterface 636 2 0
    //   637: goto -47 -> 590
    //   640: aload 5
    //   642: ifnull +10 -> 652
    //   645: aload 5
    //   647: invokeinterface 647 1 0
    //   652: new 499	it/a/a/j
    //   655: dup
    //   656: ldc_w 501
    //   659: aload 13
    //   661: invokespecial 504	it/a/a/j:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   664: athrow
    //   665: aload_0
    //   666: getfield 174	it/a/a/b:S	Z
    //   669: ifeq +16 -> 685
    //   672: aload_0
    //   673: getfield 180	it/a/a/b:V	Lit/a/a/f;
    //   676: invokevirtual 207	it/a/a/f:c	()Lit/a/a/s;
    //   679: pop
    //   680: aload_0
    //   681: iconst_0
    //   682: putfield 174	it/a/a/b:S	Z
    //   685: aload_1
    //   686: athrow
    //   687: aload_0
    //   688: getfield 174	it/a/a/b:S	Z
    //   691: ifeq +16 -> 707
    //   694: aload_0
    //   695: getfield 180	it/a/a/b:V	Lit/a/a/f;
    //   698: invokevirtual 207	it/a/a/f:c	()Lit/a/a/s;
    //   701: pop
    //   702: aload_0
    //   703: iconst_0
    //   704: putfield 174	it/a/a/b:S	Z
    //   707: aload 5
    //   709: ifnull +10 -> 719
    //   712: aload 5
    //   714: invokeinterface 648 1 0
    //   719: aload 12
    //   721: monitorexit
    //   722: return
    //   723: aload_0
    //   724: getfield 180	it/a/a/b:V	Lit/a/a/f;
    //   727: invokevirtual 207	it/a/a/f:c	()Lit/a/a/s;
    //   730: astore_2
    //   731: iload 8
    //   733: ifne -68 -> 665
    //   736: aload_2
    //   737: invokevirtual 212	it/a/a/s:a	()I
    //   740: sipush 226
    //   743: if_icmpeq -78 -> 665
    //   746: new 306	it/a/a/m
    //   749: dup
    //   750: aload_2
    //   751: invokespecial 309	it/a/a/m:<init>	(Lit/a/a/s;)V
    //   754: athrow
    //   755: astore_1
    //   756: goto -311 -> 445
    //   759: astore_2
    //   760: aload_1
    //   761: monitorexit
    //   762: aload_2
    //   763: athrow
    //   764: iload 9
    //   766: istore 8
    //   768: aload_0
    //   769: getfield 170	it/a/a/b:Q	Ljava/io/OutputStream;
    //   772: astore_2
    //   773: aload_2
    //   774: ifnull +14 -> 788
    //   777: iload 9
    //   779: istore 8
    //   781: aload_0
    //   782: getfield 170	it/a/a/b:Q	Ljava/io/OutputStream;
    //   785: invokevirtual 582	java/io/OutputStream:close	()V
    //   788: iload 9
    //   790: istore 8
    //   792: aload_1
    //   793: invokevirtual 304	java/net/Socket:close	()V
    //   796: iload 9
    //   798: istore 8
    //   800: aload_0
    //   801: aconst_null
    //   802: putfield 170	it/a/a/b:Q	Ljava/io/OutputStream;
    //   805: iload 9
    //   807: istore 8
    //   809: aload_0
    //   810: getfield 178	it/a/a/b:U	Ljava/lang/Object;
    //   813: astore_1
    //   814: iload 9
    //   816: istore 8
    //   818: aload_1
    //   819: monitorenter
    //   820: iload 11
    //   822: istore 8
    //   824: aload_0
    //   825: getfield 172	it/a/a/b:R	Z
    //   828: istore 9
    //   830: iload 9
    //   832: istore 8
    //   834: aload_0
    //   835: iconst_0
    //   836: putfield 166	it/a/a/b:O	Z
    //   839: iload 9
    //   841: istore 8
    //   843: aload_0
    //   844: iconst_0
    //   845: putfield 172	it/a/a/b:R	Z
    //   848: iload 9
    //   850: istore 8
    //   852: aload_1
    //   853: monitorexit
    //   854: aload_0
    //   855: getfield 180	it/a/a/b:V	Lit/a/a/f;
    //   858: invokevirtual 207	it/a/a/f:c	()Lit/a/a/s;
    //   861: astore_1
    //   862: aload_0
    //   863: invokespecial 257	it/a/a/b:O	()V
    //   866: aload_1
    //   867: invokevirtual 212	it/a/a/s:a	()I
    //   870: sipush 150
    //   873: if_icmpeq +30 -> 903
    //   876: aload_1
    //   877: invokevirtual 212	it/a/a/s:a	()I
    //   880: bipush 125
    //   882: if_icmpeq +21 -> 903
    //   885: new 306	it/a/a/m
    //   888: dup
    //   889: aload_1
    //   890: invokespecial 309	it/a/a/m:<init>	(Lit/a/a/s;)V
    //   893: athrow
    //   894: astore_1
    //   895: goto -99 -> 796
    //   898: astore_2
    //   899: aload_1
    //   900: monitorexit
    //   901: aload_2
    //   902: athrow
    //   903: aload_0
    //   904: getfield 180	it/a/a/b:V	Lit/a/a/f;
    //   907: invokevirtual 207	it/a/a/f:c	()Lit/a/a/s;
    //   910: astore_1
    //   911: iload 9
    //   913: ifne -226 -> 687
    //   916: aload_1
    //   917: invokevirtual 212	it/a/a/s:a	()I
    //   920: sipush 226
    //   923: if_icmpeq -236 -> 687
    //   926: new 306	it/a/a/m
    //   929: dup
    //   930: aload_1
    //   931: invokespecial 309	it/a/a/m:<init>	(Lit/a/a/s;)V
    //   934: athrow
    //   935: astore_2
    //   936: goto -148 -> 788
    //   939: astore 5
    //   941: goto -504 -> 437
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	944	0	this	b
    //   0	944	1	paramString	String
    //   0	944	3	paramLong	long
    //   0	944	5	paramk	k
    //   59	572	6	i1	int
    //   55	7	7	i2	int
    //   191	660	8	bool1	boolean
    //   146	766	9	bool2	boolean
    //   140	330	10	bool3	boolean
    //   143	678	11	bool4	boolean
    //   4	716	12	localObject1	Object
    //   96	250	13	localObject2	Object
    //   367	203	13	localIOException	IOException
    //   588	72	13	arrayOfByte	byte[]
    //   319	19	14	arrayOfChar	char[]
    // Exception table:
    //   from	to	target	type
    //   9	27	27	finally
    //   28	31	27	finally
    //   33	51	27	finally
    //   51	57	27	finally
    //   66	73	27	finally
    //   79	89	27	finally
    //   89	120	27	finally
    //   126	136	27	finally
    //   148	181	27	finally
    //   510	550	27	finally
    //   665	685	27	finally
    //   685	687	27	finally
    //   687	707	27	finally
    //   712	719	27	finally
    //   719	722	27	finally
    //   723	731	27	finally
    //   736	755	27	finally
    //   854	894	27	finally
    //   903	911	27	finally
    //   916	935	27	finally
    //   235	271	367	java/io/IOException
    //   276	283	367	java/io/IOException
    //   289	321	367	java/io/IOException
    //   321	329	367	java/io/IOException
    //   335	350	367	java/io/IOException
    //   355	364	367	java/io/IOException
    //   584	590	367	java/io/IOException
    //   590	598	367	java/io/IOException
    //   604	623	367	java/io/IOException
    //   628	637	367	java/io/IOException
    //   376	383	403	finally
    //   388	395	403	finally
    //   395	403	403	finally
    //   405	407	403	finally
    //   645	652	403	finally
    //   652	665	403	finally
    //   235	271	410	finally
    //   276	283	410	finally
    //   289	321	410	finally
    //   321	329	410	finally
    //   335	350	410	finally
    //   355	364	410	finally
    //   369	376	410	finally
    //   407	410	410	finally
    //   584	590	410	finally
    //   590	598	410	finally
    //   604	623	410	finally
    //   628	637	410	finally
    //   193	200	509	finally
    //   204	210	509	finally
    //   214	217	509	finally
    //   415	421	509	finally
    //   430	437	509	finally
    //   441	445	509	finally
    //   449	454	509	finally
    //   458	463	509	finally
    //   467	469	509	finally
    //   507	509	509	finally
    //   555	562	509	finally
    //   566	568	509	finally
    //   576	578	509	finally
    //   762	764	509	finally
    //   768	773	509	finally
    //   781	788	509	finally
    //   792	796	509	finally
    //   800	805	509	finally
    //   809	814	509	finally
    //   818	820	509	finally
    //   901	903	509	finally
    //   181	189	550	finally
    //   217	235	568	finally
    //   569	572	568	finally
    //   441	445	755	java/lang/Throwable
    //   473	479	759	finally
    //   483	488	759	finally
    //   492	497	759	finally
    //   501	503	759	finally
    //   760	762	759	finally
    //   792	796	894	java/lang/Throwable
    //   824	830	898	finally
    //   834	839	898	finally
    //   843	848	898	finally
    //   852	854	898	finally
    //   899	901	898	finally
    //   781	788	935	java/lang/Throwable
    //   430	437	939	java/lang/Throwable
  }
  
  /* Error */
  public void a(String paramString, OutputStream arg2, long paramLong, k paramk)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 176	it/a/a/b:T	Ljava/lang/Object;
    //   4: astore 12
    //   6: aload 12
    //   8: monitorenter
    //   9: aload_0
    //   10: getfield 138	it/a/a/b:y	Z
    //   13: ifne +20 -> 33
    //   16: new 446	java/lang/IllegalStateException
    //   19: dup
    //   20: ldc_w 448
    //   23: invokespecial 449	java/lang/IllegalStateException:<init>	(Ljava/lang/String;)V
    //   26: athrow
    //   27: astore_1
    //   28: aload 12
    //   30: monitorexit
    //   31: aload_1
    //   32: athrow
    //   33: aload_0
    //   34: getfield 140	it/a/a/b:z	Z
    //   37: ifne +14 -> 51
    //   40: new 446	java/lang/IllegalStateException
    //   43: dup
    //   44: ldc_w 451
    //   47: invokespecial 449	java/lang/IllegalStateException:<init>	(Ljava/lang/String;)V
    //   50: athrow
    //   51: aload_0
    //   52: getfield 144	it/a/a/b:B	I
    //   55: istore 7
    //   57: iload 7
    //   59: istore 6
    //   61: iload 7
    //   63: ifne +10 -> 73
    //   66: aload_0
    //   67: aload_1
    //   68: invokespecial 585	it/a/a/b:m	(Ljava/lang/String;)I
    //   71: istore 6
    //   73: iload 6
    //   75: iconst_1
    //   76: if_icmpne +44 -> 120
    //   79: aload_0
    //   80: getfield 180	it/a/a/b:V	Lit/a/a/f;
    //   83: ldc_w 463
    //   86: invokevirtual 204	it/a/a/f:a	(Ljava/lang/String;)V
    //   89: aload_0
    //   90: getfield 180	it/a/a/b:V	Lit/a/a/f;
    //   93: invokevirtual 207	it/a/a/f:c	()Lit/a/a/s;
    //   96: astore 13
    //   98: aload_0
    //   99: invokespecial 257	it/a/a/b:O	()V
    //   102: aload 13
    //   104: invokevirtual 254	it/a/a/s:b	()Z
    //   107: ifne +32 -> 139
    //   110: new 306	it/a/a/m
    //   113: dup
    //   114: aload 13
    //   116: invokespecial 309	it/a/a/m:<init>	(Lit/a/a/s;)V
    //   119: athrow
    //   120: iload 6
    //   122: iconst_2
    //   123: if_icmpne -34 -> 89
    //   126: aload_0
    //   127: getfield 180	it/a/a/b:V	Lit/a/a/f;
    //   130: ldc_w 587
    //   133: invokevirtual 204	it/a/a/f:a	(Ljava/lang/String;)V
    //   136: goto -47 -> 89
    //   139: aload_0
    //   140: invokespecial 465	it/a/a/b:F	()Lit/a/a/i;
    //   143: astore 13
    //   145: aload_0
    //   146: getfield 150	it/a/a/b:G	Z
    //   149: istore 8
    //   151: iload 8
    //   153: ifne +9 -> 162
    //   156: lload_3
    //   157: lconst_0
    //   158: lcmp
    //   159: ifle +99 -> 258
    //   162: aload_0
    //   163: getfield 180	it/a/a/b:V	Lit/a/a/f;
    //   166: new 279	java/lang/StringBuffer
    //   169: dup
    //   170: invokespecial 280	java/lang/StringBuffer:<init>	()V
    //   173: ldc_w 589
    //   176: invokevirtual 286	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   179: lload_3
    //   180: invokevirtual 592	java/lang/StringBuffer:append	(J)Ljava/lang/StringBuffer;
    //   183: invokevirtual 294	java/lang/StringBuffer:toString	()Ljava/lang/String;
    //   186: invokevirtual 204	it/a/a/f:a	(Ljava/lang/String;)V
    //   189: aload_0
    //   190: getfield 180	it/a/a/b:V	Lit/a/a/f;
    //   193: invokevirtual 207	it/a/a/f:c	()Lit/a/a/s;
    //   196: astore 14
    //   198: aload_0
    //   199: invokespecial 257	it/a/a/b:O	()V
    //   202: aload 14
    //   204: invokevirtual 212	it/a/a/s:a	()I
    //   207: sipush 350
    //   210: if_icmpeq +48 -> 258
    //   213: aload 14
    //   215: invokevirtual 212	it/a/a/s:a	()I
    //   218: sipush 501
    //   221: if_icmpeq +830 -> 1051
    //   224: aload 14
    //   226: invokevirtual 212	it/a/a/s:a	()I
    //   229: sipush 502
    //   232: if_icmpne +6 -> 238
    //   235: goto +816 -> 1051
    //   238: new 306	it/a/a/m
    //   241: dup
    //   242: aload 14
    //   244: invokespecial 309	it/a/a/m:<init>	(Lit/a/a/s;)V
    //   247: athrow
    //   248: astore_1
    //   249: aload 13
    //   251: invokeinterface 471 1 0
    //   256: aload_1
    //   257: athrow
    //   258: iconst_0
    //   259: istore 10
    //   261: iconst_0
    //   262: istore 11
    //   264: iconst_0
    //   265: istore 9
    //   267: aload_0
    //   268: getfield 180	it/a/a/b:V	Lit/a/a/f;
    //   271: new 279	java/lang/StringBuffer
    //   274: dup
    //   275: invokespecial 280	java/lang/StringBuffer:<init>	()V
    //   278: ldc_w 653
    //   281: invokevirtual 286	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   284: aload_1
    //   285: invokevirtual 286	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   288: invokevirtual 294	java/lang/StringBuffer:toString	()Ljava/lang/String;
    //   291: invokevirtual 204	it/a/a/f:a	(Ljava/lang/String;)V
    //   294: aload 13
    //   296: invokeinterface 470 1 0
    //   301: astore_1
    //   302: iload 9
    //   304: istore 8
    //   306: aload 13
    //   308: invokeinterface 471 1 0
    //   313: iload 9
    //   315: istore 8
    //   317: aload_0
    //   318: getfield 178	it/a/a/b:U	Ljava/lang/Object;
    //   321: astore 13
    //   323: iload 9
    //   325: istore 8
    //   327: aload 13
    //   329: monitorenter
    //   330: aload_0
    //   331: iconst_1
    //   332: putfield 166	it/a/a/b:O	Z
    //   335: aload_0
    //   336: iconst_0
    //   337: putfield 172	it/a/a/b:R	Z
    //   340: aload_0
    //   341: iconst_0
    //   342: putfield 174	it/a/a/b:S	Z
    //   345: aload 13
    //   347: monitorexit
    //   348: aload_0
    //   349: aload_1
    //   350: invokevirtual 475	java/net/Socket:getInputStream	()Ljava/io/InputStream;
    //   353: putfield 168	it/a/a/b:P	Ljava/io/InputStream;
    //   356: aload_0
    //   357: getfield 162	it/a/a/b:M	Z
    //   360: ifeq +18 -> 378
    //   363: aload_0
    //   364: new 477	java/util/zip/InflaterInputStream
    //   367: dup
    //   368: aload_0
    //   369: getfield 168	it/a/a/b:P	Ljava/io/InputStream;
    //   372: invokespecial 480	java/util/zip/InflaterInputStream:<init>	(Ljava/io/InputStream;)V
    //   375: putfield 168	it/a/a/b:P	Ljava/io/InputStream;
    //   378: aload 5
    //   380: ifnull +10 -> 390
    //   383: aload 5
    //   385: invokeinterface 611 1 0
    //   390: iload 6
    //   392: iconst_1
    //   393: if_icmpne +295 -> 688
    //   396: new 613	java/io/InputStreamReader
    //   399: dup
    //   400: aload_0
    //   401: getfield 168	it/a/a/b:P	Ljava/io/InputStream;
    //   404: aload_0
    //   405: invokespecial 484	it/a/a/b:I	()Ljava/lang/String;
    //   408: invokespecial 654	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;Ljava/lang/String;)V
    //   411: astore 13
    //   413: new 616	java/io/OutputStreamWriter
    //   416: dup
    //   417: aload_2
    //   418: invokespecial 655	java/io/OutputStreamWriter:<init>	(Ljava/io/OutputStream;)V
    //   421: astore_2
    //   422: ldc 21
    //   424: newarray <illegal type>
    //   426: astore 14
    //   428: aload 13
    //   430: aload 14
    //   432: iconst_0
    //   433: aload 14
    //   435: arraylength
    //   436: invokevirtual 658	java/io/Reader:read	([CII)I
    //   439: istore 6
    //   441: iload 6
    //   443: iconst_m1
    //   444: if_icmpeq +427 -> 871
    //   447: aload_2
    //   448: aload 14
    //   450: iconst_0
    //   451: iload 6
    //   453: invokevirtual 631	java/io/Writer:write	([CII)V
    //   456: aload_2
    //   457: invokevirtual 634	java/io/Writer:flush	()V
    //   460: aload 5
    //   462: ifnull -34 -> 428
    //   465: aload 5
    //   467: iload 6
    //   469: invokeinterface 636 2 0
    //   474: goto -46 -> 428
    //   477: astore 13
    //   479: aload_0
    //   480: getfield 178	it/a/a/b:U	Ljava/lang/Object;
    //   483: astore_2
    //   484: aload_2
    //   485: monitorenter
    //   486: aload_0
    //   487: getfield 172	it/a/a/b:R	Z
    //   490: ifeq +257 -> 747
    //   493: aload 5
    //   495: ifnull +10 -> 505
    //   498: aload 5
    //   500: invokeinterface 638 1 0
    //   505: new 495	it/a/a/a
    //   508: dup
    //   509: invokespecial 496	it/a/a/a:<init>	()V
    //   512: athrow
    //   513: astore 5
    //   515: aload_2
    //   516: monitorexit
    //   517: aload 5
    //   519: athrow
    //   520: astore_2
    //   521: iload 9
    //   523: istore 8
    //   525: aload_0
    //   526: getfield 168	it/a/a/b:P	Ljava/io/InputStream;
    //   529: astore 5
    //   531: aload 5
    //   533: ifnull +14 -> 547
    //   536: iload 9
    //   538: istore 8
    //   540: aload_0
    //   541: getfield 168	it/a/a/b:P	Ljava/io/InputStream;
    //   544: invokevirtual 559	java/io/InputStream:close	()V
    //   547: iload 9
    //   549: istore 8
    //   551: aload_1
    //   552: invokevirtual 304	java/net/Socket:close	()V
    //   555: iload 9
    //   557: istore 8
    //   559: aload_0
    //   560: aconst_null
    //   561: putfield 168	it/a/a/b:P	Ljava/io/InputStream;
    //   564: iload 9
    //   566: istore 8
    //   568: aload_0
    //   569: getfield 178	it/a/a/b:U	Ljava/lang/Object;
    //   572: astore_1
    //   573: iload 9
    //   575: istore 8
    //   577: aload_1
    //   578: monitorenter
    //   579: iload 10
    //   581: istore 8
    //   583: aload_0
    //   584: getfield 172	it/a/a/b:R	Z
    //   587: istore 9
    //   589: iload 9
    //   591: istore 8
    //   593: aload_0
    //   594: iconst_0
    //   595: putfield 166	it/a/a/b:O	Z
    //   598: iload 9
    //   600: istore 8
    //   602: aload_0
    //   603: iconst_0
    //   604: putfield 172	it/a/a/b:R	Z
    //   607: iload 9
    //   609: istore 8
    //   611: aload_1
    //   612: monitorexit
    //   613: iload 9
    //   615: istore 8
    //   617: aload_2
    //   618: athrow
    //   619: astore_1
    //   620: aload_0
    //   621: getfield 180	it/a/a/b:V	Lit/a/a/f;
    //   624: invokevirtual 207	it/a/a/f:c	()Lit/a/a/s;
    //   627: astore_2
    //   628: aload_0
    //   629: invokespecial 257	it/a/a/b:O	()V
    //   632: aload_2
    //   633: invokevirtual 212	it/a/a/s:a	()I
    //   636: sipush 150
    //   639: if_icmpeq +191 -> 830
    //   642: aload_2
    //   643: invokevirtual 212	it/a/a/s:a	()I
    //   646: bipush 125
    //   648: if_icmpeq +182 -> 830
    //   651: new 306	it/a/a/m
    //   654: dup
    //   655: aload_2
    //   656: invokespecial 309	it/a/a/m:<init>	(Lit/a/a/s;)V
    //   659: athrow
    //   660: astore_1
    //   661: iload 9
    //   663: istore 8
    //   665: aload 13
    //   667: invokeinterface 471 1 0
    //   672: iload 9
    //   674: istore 8
    //   676: aload_1
    //   677: athrow
    //   678: astore_1
    //   679: aload 13
    //   681: monitorexit
    //   682: iload 9
    //   684: istore 8
    //   686: aload_1
    //   687: athrow
    //   688: iload 6
    //   690: iconst_2
    //   691: if_icmpne +180 -> 871
    //   694: ldc 21
    //   696: newarray <illegal type>
    //   698: astore 13
    //   700: aload_0
    //   701: getfield 168	it/a/a/b:P	Ljava/io/InputStream;
    //   704: aload 13
    //   706: iconst_0
    //   707: aload 13
    //   709: arraylength
    //   710: invokevirtual 661	java/io/InputStream:read	([BII)I
    //   713: istore 6
    //   715: iload 6
    //   717: iconst_m1
    //   718: if_icmpeq +153 -> 871
    //   721: aload_2
    //   722: aload 13
    //   724: iconst_0
    //   725: iload 6
    //   727: invokevirtual 644	java/io/OutputStream:write	([BII)V
    //   730: aload 5
    //   732: ifnull -32 -> 700
    //   735: aload 5
    //   737: iload 6
    //   739: invokeinterface 636 2 0
    //   744: goto -44 -> 700
    //   747: aload 5
    //   749: ifnull +10 -> 759
    //   752: aload 5
    //   754: invokeinterface 647 1 0
    //   759: new 499	it/a/a/j
    //   762: dup
    //   763: ldc_w 501
    //   766: aload 13
    //   768: invokespecial 504	it/a/a/j:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   771: athrow
    //   772: aload_0
    //   773: getfield 174	it/a/a/b:S	Z
    //   776: ifeq +16 -> 792
    //   779: aload_0
    //   780: getfield 180	it/a/a/b:V	Lit/a/a/f;
    //   783: invokevirtual 207	it/a/a/f:c	()Lit/a/a/s;
    //   786: pop
    //   787: aload_0
    //   788: iconst_0
    //   789: putfield 174	it/a/a/b:S	Z
    //   792: aload_1
    //   793: athrow
    //   794: aload_0
    //   795: getfield 174	it/a/a/b:S	Z
    //   798: ifeq +16 -> 814
    //   801: aload_0
    //   802: getfield 180	it/a/a/b:V	Lit/a/a/f;
    //   805: invokevirtual 207	it/a/a/f:c	()Lit/a/a/s;
    //   808: pop
    //   809: aload_0
    //   810: iconst_0
    //   811: putfield 174	it/a/a/b:S	Z
    //   814: aload 5
    //   816: ifnull +10 -> 826
    //   819: aload 5
    //   821: invokeinterface 648 1 0
    //   826: aload 12
    //   828: monitorexit
    //   829: return
    //   830: aload_0
    //   831: getfield 180	it/a/a/b:V	Lit/a/a/f;
    //   834: invokevirtual 207	it/a/a/f:c	()Lit/a/a/s;
    //   837: astore_2
    //   838: iload 8
    //   840: ifne -68 -> 772
    //   843: aload_2
    //   844: invokevirtual 212	it/a/a/s:a	()I
    //   847: sipush 226
    //   850: if_icmpeq -78 -> 772
    //   853: new 306	it/a/a/m
    //   856: dup
    //   857: aload_2
    //   858: invokespecial 309	it/a/a/m:<init>	(Lit/a/a/s;)V
    //   861: athrow
    //   862: astore_1
    //   863: goto -308 -> 555
    //   866: astore_2
    //   867: aload_1
    //   868: monitorexit
    //   869: aload_2
    //   870: athrow
    //   871: iload 9
    //   873: istore 8
    //   875: aload_0
    //   876: getfield 168	it/a/a/b:P	Ljava/io/InputStream;
    //   879: astore_2
    //   880: aload_2
    //   881: ifnull +14 -> 895
    //   884: iload 9
    //   886: istore 8
    //   888: aload_0
    //   889: getfield 168	it/a/a/b:P	Ljava/io/InputStream;
    //   892: invokevirtual 559	java/io/InputStream:close	()V
    //   895: iload 9
    //   897: istore 8
    //   899: aload_1
    //   900: invokevirtual 304	java/net/Socket:close	()V
    //   903: iload 9
    //   905: istore 8
    //   907: aload_0
    //   908: aconst_null
    //   909: putfield 168	it/a/a/b:P	Ljava/io/InputStream;
    //   912: iload 9
    //   914: istore 8
    //   916: aload_0
    //   917: getfield 178	it/a/a/b:U	Ljava/lang/Object;
    //   920: astore_1
    //   921: iload 9
    //   923: istore 8
    //   925: aload_1
    //   926: monitorenter
    //   927: iload 11
    //   929: istore 8
    //   931: aload_0
    //   932: getfield 172	it/a/a/b:R	Z
    //   935: istore 9
    //   937: iload 9
    //   939: istore 8
    //   941: aload_0
    //   942: iconst_0
    //   943: putfield 166	it/a/a/b:O	Z
    //   946: iload 9
    //   948: istore 8
    //   950: aload_0
    //   951: iconst_0
    //   952: putfield 172	it/a/a/b:R	Z
    //   955: iload 9
    //   957: istore 8
    //   959: aload_1
    //   960: monitorexit
    //   961: aload_0
    //   962: getfield 180	it/a/a/b:V	Lit/a/a/f;
    //   965: invokevirtual 207	it/a/a/f:c	()Lit/a/a/s;
    //   968: astore_1
    //   969: aload_0
    //   970: invokespecial 257	it/a/a/b:O	()V
    //   973: aload_1
    //   974: invokevirtual 212	it/a/a/s:a	()I
    //   977: sipush 150
    //   980: if_icmpeq +30 -> 1010
    //   983: aload_1
    //   984: invokevirtual 212	it/a/a/s:a	()I
    //   987: bipush 125
    //   989: if_icmpeq +21 -> 1010
    //   992: new 306	it/a/a/m
    //   995: dup
    //   996: aload_1
    //   997: invokespecial 309	it/a/a/m:<init>	(Lit/a/a/s;)V
    //   1000: athrow
    //   1001: astore_1
    //   1002: goto -99 -> 903
    //   1005: astore_2
    //   1006: aload_1
    //   1007: monitorexit
    //   1008: aload_2
    //   1009: athrow
    //   1010: aload_0
    //   1011: getfield 180	it/a/a/b:V	Lit/a/a/f;
    //   1014: invokevirtual 207	it/a/a/f:c	()Lit/a/a/s;
    //   1017: astore_1
    //   1018: iload 9
    //   1020: ifne -226 -> 794
    //   1023: aload_1
    //   1024: invokevirtual 212	it/a/a/s:a	()I
    //   1027: sipush 226
    //   1030: if_icmpeq -236 -> 794
    //   1033: new 306	it/a/a/m
    //   1036: dup
    //   1037: aload_1
    //   1038: invokespecial 309	it/a/a/m:<init>	(Lit/a/a/s;)V
    //   1041: athrow
    //   1042: astore_2
    //   1043: goto -148 -> 895
    //   1046: astore 5
    //   1048: goto -501 -> 547
    //   1051: lload_3
    //   1052: lconst_0
    //   1053: lcmp
    //   1054: ifle -796 -> 258
    //   1057: goto -819 -> 238
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	1060	0	this	b
    //   0	1060	1	paramString	String
    //   0	1060	3	paramLong	long
    //   0	1060	5	paramk	k
    //   59	679	6	i1	int
    //   55	7	7	i2	int
    //   149	809	8	bool1	boolean
    //   265	754	9	bool2	boolean
    //   259	321	10	bool3	boolean
    //   262	666	11	bool4	boolean
    //   4	823	12	localObject1	Object
    //   96	333	13	localObject2	Object
    //   477	203	13	localIOException	IOException
    //   698	69	13	arrayOfByte	byte[]
    //   196	253	14	localObject3	Object
    // Exception table:
    //   from	to	target	type
    //   9	27	27	finally
    //   28	31	27	finally
    //   33	51	27	finally
    //   51	57	27	finally
    //   66	73	27	finally
    //   79	89	27	finally
    //   89	120	27	finally
    //   126	136	27	finally
    //   139	151	27	finally
    //   249	258	27	finally
    //   267	294	27	finally
    //   620	660	27	finally
    //   772	792	27	finally
    //   792	794	27	finally
    //   794	814	27	finally
    //   819	826	27	finally
    //   826	829	27	finally
    //   830	838	27	finally
    //   843	862	27	finally
    //   961	1001	27	finally
    //   1010	1018	27	finally
    //   1023	1042	27	finally
    //   162	235	248	finally
    //   238	248	248	finally
    //   348	378	477	java/io/IOException
    //   383	390	477	java/io/IOException
    //   396	428	477	java/io/IOException
    //   428	441	477	java/io/IOException
    //   447	460	477	java/io/IOException
    //   465	474	477	java/io/IOException
    //   694	700	477	java/io/IOException
    //   700	715	477	java/io/IOException
    //   721	730	477	java/io/IOException
    //   735	744	477	java/io/IOException
    //   486	493	513	finally
    //   498	505	513	finally
    //   505	513	513	finally
    //   515	517	513	finally
    //   752	759	513	finally
    //   759	772	513	finally
    //   348	378	520	finally
    //   383	390	520	finally
    //   396	428	520	finally
    //   428	441	520	finally
    //   447	460	520	finally
    //   465	474	520	finally
    //   479	486	520	finally
    //   517	520	520	finally
    //   694	700	520	finally
    //   700	715	520	finally
    //   721	730	520	finally
    //   735	744	520	finally
    //   306	313	619	finally
    //   317	323	619	finally
    //   327	330	619	finally
    //   525	531	619	finally
    //   540	547	619	finally
    //   551	555	619	finally
    //   559	564	619	finally
    //   568	573	619	finally
    //   577	579	619	finally
    //   617	619	619	finally
    //   665	672	619	finally
    //   676	678	619	finally
    //   686	688	619	finally
    //   869	871	619	finally
    //   875	880	619	finally
    //   888	895	619	finally
    //   899	903	619	finally
    //   907	912	619	finally
    //   916	921	619	finally
    //   925	927	619	finally
    //   1008	1010	619	finally
    //   294	302	660	finally
    //   330	348	678	finally
    //   679	682	678	finally
    //   551	555	862	java/lang/Throwable
    //   583	589	866	finally
    //   593	598	866	finally
    //   602	607	866	finally
    //   611	613	866	finally
    //   867	869	866	finally
    //   899	903	1001	java/lang/Throwable
    //   931	937	1005	finally
    //   941	946	1005	finally
    //   950	955	1005	finally
    //   959	961	1005	finally
    //   1006	1008	1005	finally
    //   888	895	1042	java/lang/Throwable
    //   540	547	1046	java/lang/Throwable
  }
  
  public void a(String paramString1, String paramString2)
  {
    a(paramString1, paramString2, null);
  }
  
  public void a(String paramString1, String paramString2, String paramString3)
  {
    int i3 = 0;
    synchronized (this.T)
    {
      if (!this.y) {
        throw new IllegalStateException("Client not connected");
      }
    }
    if (this.v == 2)
    {
      this.V.a("AUTH TLS");
      if (!this.V.c().b()) {
        break label170;
      }
      this.V.a(this.o);
    }
    s locals;
    for (;;)
    {
      this.z = false;
      this.V.a("USER " + paramString1);
      locals = this.V.c();
      switch (locals.a())
      {
      case 332: 
        throw new m(locals);
        label170:
        this.V.a("AUTH SSL");
        locals = this.V.c();
        if (!locals.b()) {
          break label211;
        }
        this.V.a(this.o);
      }
    }
    label211:
    throw new m(locals.a(), "SECURITY_FTPES cannot be applied: the server refused both AUTH TLS and AUTH SSL commands");
    label227:
    int i2 = i3;
    int i1;
    if (i1 != 0)
    {
      if (paramString2 == null) {
        throw new m(331);
      }
      this.V.a("PASS " + paramString2);
      locals = this.V.c();
      i2 = i3;
    }
    switch (locals.a())
    {
    case 230: 
      label324:
      throw new m(locals);
      label334:
      if (i2 != 0)
      {
        if (paramString3 == null) {
          throw new m(332);
        }
        this.V.a("ACCT " + paramString3);
        paramString3 = this.V.c();
        switch (paramString3.a())
        {
        }
      }
      break;
    }
    for (;;)
    {
      throw new m(paramString3);
      this.z = true;
      this.w = paramString1;
      this.x = paramString2;
      E();
      M();
      return;
      break;
      i1 = 0;
      break label227;
      i1 = 1;
      break label227;
      break label324;
      i2 = 1;
      break label334;
    }
  }
  
  public void a(SSLSocketFactory paramSSLSocketFactory)
  {
    synchronized (this.T)
    {
      this.o = paramSSLSocketFactory;
      return;
    }
  }
  
  public void a(boolean paramBoolean)
  {
    synchronized (this.T)
    {
      this.A = paramBoolean;
      return;
    }
  }
  
  public String[] a(String paramString, int paramInt)
  {
    localObject2 = null;
    localObject1 = null;
    synchronized (this.T)
    {
      if (this.y) {
        throw new IllegalStateException("Client already connected to " + paramString + " on port " + paramInt);
      }
    }
    try
    {
      Object localObject4 = this.n.c(paramString, paramInt);
      Object localObject3 = localObject4;
      localObject1 = localObject4;
      localObject2 = localObject4;
      if (this.v == 1)
      {
        localObject1 = localObject4;
        localObject2 = localObject4;
        localObject3 = a((Socket)localObject4, paramString, paramInt);
      }
      localObject1 = localObject3;
      localObject2 = localObject3;
      this.V = new f((Socket)localObject3, I());
      localObject1 = localObject3;
      localObject2 = localObject3;
      localObject4 = this.p.iterator();
      for (;;)
      {
        localObject1 = localObject3;
        localObject2 = localObject3;
        if (!((Iterator)localObject4).hasNext()) {
          break;
        }
        localObject1 = localObject3;
        localObject2 = localObject3;
        this.V.a((g)((Iterator)localObject4).next());
      }
      try
      {
        ((Socket)localObject2).close();
        throw paramString;
        localObject1 = localObject3;
        localObject2 = localObject3;
        localObject4 = this.V.c();
        localObject1 = localObject3;
        localObject2 = localObject3;
        if (!((s)localObject4).b())
        {
          localObject1 = localObject3;
          localObject2 = localObject3;
          throw new m((s)localObject4);
        }
        localObject1 = localObject3;
        localObject2 = localObject3;
        this.y = true;
        localObject1 = localObject3;
        localObject2 = localObject3;
        this.z = false;
        localObject1 = localObject3;
        localObject2 = localObject3;
        this.s = null;
        localObject1 = localObject3;
        localObject2 = localObject3;
        this.t = paramString;
        localObject1 = localObject3;
        localObject2 = localObject3;
        this.u = paramInt;
        localObject1 = localObject3;
        localObject2 = localObject3;
        this.w = null;
        localObject1 = localObject3;
        localObject2 = localObject3;
        this.x = null;
        localObject1 = localObject3;
        localObject2 = localObject3;
        this.J = false;
        localObject1 = localObject3;
        localObject2 = localObject3;
        this.G = false;
        localObject1 = localObject3;
        localObject2 = localObject3;
        this.K = false;
        localObject1 = localObject3;
        localObject2 = localObject3;
        this.L = false;
        localObject1 = localObject3;
        localObject2 = localObject3;
        this.N = false;
        localObject1 = localObject3;
        localObject2 = localObject3;
        paramString = ((s)localObject4).c();
        boolean bool = this.y;
        if ((!bool) && (localObject3 != null)) {}
        try
        {
          ((Socket)localObject3).close();
          return paramString;
        }
        catch (Throwable localThrowable1)
        {
          for (;;) {}
        }
      }
      catch (Throwable localThrowable2)
      {
        for (;;) {}
      }
    }
    catch (IOException paramString)
    {
      localObject2 = localObject1;
      throw paramString;
    }
    finally
    {
      bool = this.y;
      if ((bool) || (localObject2 == null)) {}
    }
  }
  
  public SSLSocketFactory b()
  {
    synchronized (this.T)
    {
      SSLSocketFactory localSSLSocketFactory = this.o;
      return localSSLSocketFactory;
    }
  }
  
  public void b(int paramInt)
  {
    if ((paramInt != 0) && (paramInt != 2) && (paramInt != 1)) {
      throw new IllegalArgumentException("Invalid type");
    }
    synchronized (this.T)
    {
      this.B = paramInt;
      return;
    }
  }
  
  public void b(g paramg)
  {
    synchronized (this.T)
    {
      this.p.remove(paramg);
      if (this.V != null) {
        this.V.b(paramg);
      }
      return;
    }
  }
  
  public void b(r paramr)
  {
    synchronized (this.T)
    {
      this.q.remove(paramr);
      return;
    }
  }
  
  public void b(File paramFile)
  {
    b(paramFile, null);
  }
  
  /* Error */
  public void b(File paramFile, k paramk)
  {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual 540	java/io/File:exists	()Z
    //   4: ifne +15 -> 19
    //   7: new 542	java/io/FileNotFoundException
    //   10: dup
    //   11: aload_1
    //   12: invokevirtual 545	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   15: invokespecial 546	java/io/FileNotFoundException:<init>	(Ljava/lang/String;)V
    //   18: athrow
    //   19: new 548	java/io/FileInputStream
    //   22: dup
    //   23: aload_1
    //   24: invokespecial 550	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   27: astore_3
    //   28: aload_0
    //   29: aload_1
    //   30: invokevirtual 553	java/io/File:getName	()Ljava/lang/String;
    //   33: aload_3
    //   34: lconst_0
    //   35: aload_2
    //   36: invokevirtual 731	it/a/a/b:a	(Ljava/lang/String;Ljava/io/InputStream;JLit/a/a/k;)V
    //   39: aload_3
    //   40: ifnull +7 -> 47
    //   43: aload_3
    //   44: invokevirtual 559	java/io/InputStream:close	()V
    //   47: return
    //   48: astore_1
    //   49: new 499	it/a/a/j
    //   52: dup
    //   53: aload_1
    //   54: invokespecial 562	it/a/a/j:<init>	(Ljava/lang/Throwable;)V
    //   57: athrow
    //   58: astore_1
    //   59: aload_1
    //   60: athrow
    //   61: astore_1
    //   62: aload_3
    //   63: ifnull +7 -> 70
    //   66: aload_3
    //   67: invokevirtual 559	java/io/InputStream:close	()V
    //   70: aload_1
    //   71: athrow
    //   72: astore_1
    //   73: aload_1
    //   74: athrow
    //   75: astore_1
    //   76: aload_1
    //   77: athrow
    //   78: astore_1
    //   79: aload_1
    //   80: athrow
    //   81: astore_1
    //   82: aload_1
    //   83: athrow
    //   84: astore_1
    //   85: aload_1
    //   86: athrow
    //   87: astore_2
    //   88: goto -18 -> 70
    //   91: astore_1
    //   92: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	93	0	this	b
    //   0	93	1	paramFile	File
    //   0	93	2	paramk	k
    //   27	40	3	localFileInputStream	java.io.FileInputStream
    // Exception table:
    //   from	to	target	type
    //   19	28	48	java/io/IOException
    //   28	39	58	java/lang/IllegalStateException
    //   28	39	61	finally
    //   59	61	61	finally
    //   73	75	61	finally
    //   76	78	61	finally
    //   79	81	61	finally
    //   82	84	61	finally
    //   85	87	61	finally
    //   28	39	72	java/io/IOException
    //   28	39	75	it/a/a/o
    //   28	39	78	it/a/a/m
    //   28	39	81	it/a/a/j
    //   28	39	84	it/a/a/a
    //   66	70	87	java/lang/Throwable
    //   43	47	91	java/lang/Throwable
  }
  
  public void b(String paramString1, String paramString2)
  {
    synchronized (this.T)
    {
      if (!this.y) {
        throw new IllegalStateException("Client not connected");
      }
    }
    if (!this.z) {
      throw new IllegalStateException("Client not authenticated");
    }
    this.V.a("RNFR " + paramString1);
    paramString1 = this.V.c();
    O();
    if (paramString1.a() != 350) {
      throw new m(paramString1);
    }
    this.V.a("RNTO " + paramString2);
    paramString1 = this.V.c();
    O();
    if (!paramString1.b()) {
      throw new m(paramString1);
    }
  }
  
  public void b(boolean paramBoolean)
  {
    this.I = paramBoolean;
  }
  
  public String[] b(String paramString)
  {
    if (this.v == 1) {}
    for (int i1 = 990;; i1 = 21) {
      return a(paramString, i1);
    }
  }
  
  public int c()
  {
    return this.v;
  }
  
  public s c(String paramString)
  {
    synchronized (this.T)
    {
      if (!this.y) {
        throw new IllegalStateException("Client not connected");
      }
    }
    this.V.a(paramString);
    O();
    paramString = this.V.c();
    return paramString;
  }
  
  public void c(int paramInt)
  {
    if ((this.B != 0) && (this.B != 1) && (this.B != 2)) {
      throw new IllegalArgumentException("Invalid MLSD policy");
    }
    synchronized (this.T)
    {
      this.C = paramInt;
      return;
    }
  }
  
  public void c(boolean paramBoolean)
  {
    synchronized (this.T)
    {
      if (!this.y) {
        throw new IllegalStateException("Client not connected");
      }
    }
    if (this.z) {
      N();
    }
    if (paramBoolean)
    {
      this.V.a("QUIT");
      s locals = this.V.c();
      if (!locals.b()) {
        throw new m(locals);
      }
    }
    this.V.a();
    this.V = null;
    this.y = false;
  }
  
  public int d()
  {
    synchronized (this.T)
    {
      int i1 = this.B;
      return i1;
    }
  }
  
  public s d(String paramString)
  {
    synchronized (this.T)
    {
      if (!this.y) {
        throw new IllegalStateException("Client not connected");
      }
    }
    this.V.a("SITE " + paramString);
    O();
    paramString = this.V.c();
    return paramString;
  }
  
  public void d(boolean paramBoolean)
  {
    Object localObject2;
    synchronized (this.U)
    {
      if ((this.O) && (!this.R))
      {
        if (paramBoolean)
        {
          this.V.a("ABOR");
          O();
          this.S = true;
        }
        localObject2 = this.P;
        if (localObject2 == null) {}
      }
    }
    try
    {
      this.P.close();
      localObject2 = this.Q;
      if (localObject2 != null) {}
      try
      {
        this.Q.close();
        this.R = true;
        return;
        localObject3 = finally;
        throw ((Throwable)localObject3);
      }
      catch (Throwable localThrowable1)
      {
        for (;;) {}
      }
    }
    catch (Throwable localThrowable2)
    {
      for (;;) {}
    }
  }
  
  public int e()
  {
    synchronized (this.T)
    {
      int i1 = this.C;
      return i1;
    }
  }
  
  public void e(String paramString)
  {
    synchronized (this.T)
    {
      if (!this.y) {
        throw new IllegalStateException("Client not connected");
      }
    }
    if (!this.z) {
      throw new IllegalStateException("Client not authenticated");
    }
    this.V.a("ACCT " + paramString);
    paramString = this.V.c();
    O();
    if (!paramString.b()) {
      throw new m(paramString);
    }
  }
  
  public String f()
  {
    synchronized (this.T)
    {
      String str = this.H;
      return str;
    }
  }
  
  public void f(String paramString)
  {
    synchronized (this.T)
    {
      if (!this.y) {
        throw new IllegalStateException("Client not connected");
      }
    }
    if (!this.z) {
      throw new IllegalStateException("Client not authenticated");
    }
    this.V.a("CWD " + paramString);
    paramString = this.V.c();
    O();
    if (!paramString.b()) {
      throw new m(paramString);
    }
  }
  
  public Date g(String paramString)
  {
    synchronized (this.T)
    {
      if (!this.y) {
        throw new IllegalStateException("Client not connected");
      }
    }
    if (!this.z) {
      throw new IllegalStateException("Client not authenticated");
    }
    this.V.a("MDTM " + paramString);
    paramString = this.V.c();
    O();
    if (!paramString.b()) {
      throw new m(paramString);
    }
    paramString = paramString.c();
    if (paramString.length != 1) {
      throw new o();
    }
    try
    {
      paramString = k.parse(paramString[0]);
      return paramString;
    }
    catch (ParseException paramString)
    {
      throw new o();
    }
  }
  
  public boolean g()
  {
    synchronized (this.T)
    {
      boolean bool = this.G;
      return bool;
    }
  }
  
  public long h(String paramString)
  {
    synchronized (this.T)
    {
      if (!this.y) {
        throw new IllegalStateException("Client not connected");
      }
    }
    if (!this.z) {
      throw new IllegalStateException("Client not authenticated");
    }
    this.V.a("TYPE I");
    s locals = this.V.c();
    O();
    if (!locals.b()) {
      throw new m(locals);
    }
    this.V.a("SIZE " + paramString);
    paramString = this.V.c();
    O();
    if (!paramString.b()) {
      throw new m(paramString);
    }
    paramString = paramString.c();
    if (paramString.length != 1) {
      throw new o();
    }
    try
    {
      long l1 = Long.parseLong(paramString[0]);
      return l1;
    }
    catch (Throwable paramString)
    {
      throw new o();
    }
  }
  
  public boolean h()
  {
    return this.L;
  }
  
  public void i(String paramString)
  {
    synchronized (this.T)
    {
      if (!this.y) {
        throw new IllegalStateException("Client not connected");
      }
    }
    if (!this.z) {
      throw new IllegalStateException("Client not authenticated");
    }
    this.V.a("DELE " + paramString);
    paramString = this.V.c();
    O();
    if (!paramString.b()) {
      throw new m(paramString);
    }
  }
  
  public boolean i()
  {
    return this.I;
  }
  
  public t j()
  {
    synchronized (this.T)
    {
      t localt = this.r;
      return localt;
    }
  }
  
  public void j(String paramString)
  {
    synchronized (this.T)
    {
      if (!this.y) {
        throw new IllegalStateException("Client not connected");
      }
    }
    if (!this.z) {
      throw new IllegalStateException("Client not authenticated");
    }
    this.V.a("RMD " + paramString);
    paramString = this.V.c();
    O();
    if (!paramString.b()) {
      throw new m(paramString);
    }
  }
  
  public void k(String paramString)
  {
    synchronized (this.T)
    {
      if (!this.y) {
        throw new IllegalStateException("Client not connected");
      }
    }
    if (!this.z) {
      throw new IllegalStateException("Client not authenticated");
    }
    this.V.a("MKD " + paramString);
    paramString = this.V.c();
    O();
    if (!paramString.b()) {
      throw new m(paramString);
    }
  }
  
  public boolean k()
  {
    synchronized (this.T)
    {
      boolean bool = this.z;
      return bool;
    }
  }
  
  public boolean l()
  {
    synchronized (this.T)
    {
      boolean bool = this.y;
      return bool;
    }
  }
  
  /* Error */
  public n[] l(String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 10
    //   3: aconst_null
    //   4: astore 8
    //   6: aconst_null
    //   7: astore 9
    //   9: iconst_0
    //   10: istore_2
    //   11: aload_0
    //   12: getfield 176	it/a/a/b:T	Ljava/lang/Object;
    //   15: astore 11
    //   17: aload 11
    //   19: monitorenter
    //   20: aload_0
    //   21: getfield 138	it/a/a/b:y	Z
    //   24: ifne +20 -> 44
    //   27: new 446	java/lang/IllegalStateException
    //   30: dup
    //   31: ldc_w 448
    //   34: invokespecial 449	java/lang/IllegalStateException:<init>	(Ljava/lang/String;)V
    //   37: athrow
    //   38: astore_1
    //   39: aload 11
    //   41: monitorexit
    //   42: aload_1
    //   43: athrow
    //   44: aload_0
    //   45: getfield 140	it/a/a/b:z	Z
    //   48: ifne +14 -> 62
    //   51: new 446	java/lang/IllegalStateException
    //   54: dup
    //   55: ldc_w 451
    //   58: invokespecial 449	java/lang/IllegalStateException:<init>	(Ljava/lang/String;)V
    //   61: athrow
    //   62: aload_0
    //   63: getfield 180	it/a/a/b:V	Lit/a/a/f;
    //   66: ldc_w 463
    //   69: invokevirtual 204	it/a/a/f:a	(Ljava/lang/String;)V
    //   72: aload_0
    //   73: getfield 180	it/a/a/b:V	Lit/a/a/f;
    //   76: invokevirtual 207	it/a/a/f:c	()Lit/a/a/s;
    //   79: astore 6
    //   81: aload_0
    //   82: invokespecial 257	it/a/a/b:O	()V
    //   85: aload 6
    //   87: invokevirtual 254	it/a/a/s:b	()Z
    //   90: ifne +13 -> 103
    //   93: new 306	it/a/a/m
    //   96: dup
    //   97: aload 6
    //   99: invokespecial 309	it/a/a/m:<init>	(Lit/a/a/s;)V
    //   102: athrow
    //   103: aload_0
    //   104: invokespecial 465	it/a/a/b:F	()Lit/a/a/i;
    //   107: astore 14
    //   109: aload_0
    //   110: getfield 146	it/a/a/b:C	I
    //   113: ifne +375 -> 488
    //   116: aload_0
    //   117: getfield 158	it/a/a/b:K	Z
    //   120: istore 4
    //   122: goto +889 -> 1011
    //   125: aload 6
    //   127: astore 7
    //   129: aload_1
    //   130: ifnull +41 -> 171
    //   133: aload 6
    //   135: astore 7
    //   137: aload_1
    //   138: invokevirtual 437	java/lang/String:length	()I
    //   141: ifle +30 -> 171
    //   144: new 279	java/lang/StringBuffer
    //   147: dup
    //   148: invokespecial 280	java/lang/StringBuffer:<init>	()V
    //   151: aload 6
    //   153: invokevirtual 286	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   156: ldc_w 779
    //   159: invokevirtual 286	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   162: aload_1
    //   163: invokevirtual 286	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   166: invokevirtual 294	java/lang/StringBuffer:toString	()Ljava/lang/String;
    //   169: astore 7
    //   171: new 116	java/util/ArrayList
    //   174: dup
    //   175: invokespecial 117	java/util/ArrayList:<init>	()V
    //   178: astore 13
    //   180: aload_0
    //   181: getfield 180	it/a/a/b:V	Lit/a/a/f;
    //   184: aload 7
    //   186: invokevirtual 204	it/a/a/f:a	(Ljava/lang/String;)V
    //   189: aload 14
    //   191: invokeinterface 470 1 0
    //   196: astore 12
    //   198: aload 14
    //   200: invokeinterface 471 1 0
    //   205: aload_0
    //   206: getfield 178	it/a/a/b:U	Ljava/lang/Object;
    //   209: astore_1
    //   210: aload_1
    //   211: monitorenter
    //   212: aload_0
    //   213: iconst_1
    //   214: putfield 166	it/a/a/b:O	Z
    //   217: aload_0
    //   218: iconst_0
    //   219: putfield 172	it/a/a/b:R	Z
    //   222: aload_0
    //   223: iconst_0
    //   224: putfield 174	it/a/a/b:S	Z
    //   227: aload_1
    //   228: monitorexit
    //   229: aload 10
    //   231: astore_1
    //   232: aload_0
    //   233: aload 12
    //   235: invokevirtual 475	java/net/Socket:getInputStream	()Ljava/io/InputStream;
    //   238: putfield 168	it/a/a/b:P	Ljava/io/InputStream;
    //   241: aload 10
    //   243: astore_1
    //   244: aload_0
    //   245: getfield 162	it/a/a/b:M	Z
    //   248: ifeq +21 -> 269
    //   251: aload 10
    //   253: astore_1
    //   254: aload_0
    //   255: new 477	java/util/zip/InflaterInputStream
    //   258: dup
    //   259: aload_0
    //   260: getfield 168	it/a/a/b:P	Ljava/io/InputStream;
    //   263: invokespecial 480	java/util/zip/InflaterInputStream:<init>	(Ljava/io/InputStream;)V
    //   266: putfield 168	it/a/a/b:P	Ljava/io/InputStream;
    //   269: aload 10
    //   271: astore_1
    //   272: aload_0
    //   273: getfield 168	it/a/a/b:P	Ljava/io/InputStream;
    //   276: astore 7
    //   278: iload 4
    //   280: ifeq +254 -> 534
    //   283: ldc -22
    //   285: astore 6
    //   287: aload 10
    //   289: astore_1
    //   290: new 482	it/a/a/u
    //   293: dup
    //   294: aload 7
    //   296: aload 6
    //   298: invokespecial 487	it/a/a/u:<init>	(Ljava/io/InputStream;Ljava/lang/String;)V
    //   301: astore 6
    //   303: aload 6
    //   305: invokevirtual 489	it/a/a/u:a	()Ljava/lang/String;
    //   308: astore_1
    //   309: aload_1
    //   310: ifnull +531 -> 841
    //   313: aload_1
    //   314: invokevirtual 437	java/lang/String:length	()I
    //   317: ifle -14 -> 303
    //   320: aload 13
    //   322: aload_1
    //   323: invokevirtual 493	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   326: pop
    //   327: goto -24 -> 303
    //   330: astore 7
    //   332: aload 6
    //   334: astore_1
    //   335: aload_0
    //   336: getfield 178	it/a/a/b:U	Ljava/lang/Object;
    //   339: astore 8
    //   341: aload 6
    //   343: astore_1
    //   344: aload 8
    //   346: monitorenter
    //   347: aload_0
    //   348: getfield 172	it/a/a/b:R	Z
    //   351: ifeq +195 -> 546
    //   354: new 495	it/a/a/a
    //   357: dup
    //   358: invokespecial 496	it/a/a/a:<init>	()V
    //   361: athrow
    //   362: astore 7
    //   364: aload 8
    //   366: monitorexit
    //   367: aload 6
    //   369: astore_1
    //   370: aload 7
    //   372: athrow
    //   373: astore 7
    //   375: aload_1
    //   376: astore 6
    //   378: aload 7
    //   380: astore_1
    //   381: aload 6
    //   383: ifnull +8 -> 391
    //   386: aload 6
    //   388: invokevirtual 497	it/a/a/u:close	()V
    //   391: aload 12
    //   393: invokevirtual 304	java/net/Socket:close	()V
    //   396: aload_0
    //   397: aconst_null
    //   398: putfield 168	it/a/a/b:P	Ljava/io/InputStream;
    //   401: aload_0
    //   402: getfield 178	it/a/a/b:U	Ljava/lang/Object;
    //   405: astore 6
    //   407: aload 6
    //   409: monitorenter
    //   410: aload_0
    //   411: getfield 172	it/a/a/b:R	Z
    //   414: istore 4
    //   416: iload 4
    //   418: istore 5
    //   420: aload_0
    //   421: iconst_0
    //   422: putfield 166	it/a/a/b:O	Z
    //   425: iload 4
    //   427: istore 5
    //   429: aload_0
    //   430: iconst_0
    //   431: putfield 172	it/a/a/b:R	Z
    //   434: iload 4
    //   436: istore 5
    //   438: aload 6
    //   440: monitorexit
    //   441: aload_1
    //   442: athrow
    //   443: astore_1
    //   444: aload_0
    //   445: getfield 180	it/a/a/b:V	Lit/a/a/f;
    //   448: invokevirtual 207	it/a/a/f:c	()Lit/a/a/s;
    //   451: astore 6
    //   453: aload_0
    //   454: invokespecial 257	it/a/a/b:O	()V
    //   457: aload 6
    //   459: invokevirtual 212	it/a/a/s:a	()I
    //   462: sipush 150
    //   465: if_icmpeq +318 -> 783
    //   468: aload 6
    //   470: invokevirtual 212	it/a/a/s:a	()I
    //   473: bipush 125
    //   475: if_icmpeq +308 -> 783
    //   478: new 306	it/a/a/m
    //   481: dup
    //   482: aload 6
    //   484: invokespecial 309	it/a/a/m:<init>	(Lit/a/a/s;)V
    //   487: athrow
    //   488: aload_0
    //   489: getfield 146	it/a/a/b:C	I
    //   492: iconst_1
    //   493: if_icmpne +530 -> 1023
    //   496: iconst_1
    //   497: istore 4
    //   499: goto +512 -> 1011
    //   502: ldc_w 781
    //   505: astore 6
    //   507: goto -382 -> 125
    //   510: astore_1
    //   511: aload 14
    //   513: invokeinterface 471 1 0
    //   518: aload_1
    //   519: athrow
    //   520: astore_1
    //   521: iconst_0
    //   522: istore 4
    //   524: goto -80 -> 444
    //   527: astore 6
    //   529: aload_1
    //   530: monitorexit
    //   531: aload 6
    //   533: athrow
    //   534: aload 10
    //   536: astore_1
    //   537: aload_0
    //   538: invokespecial 484	it/a/a/b:I	()Ljava/lang/String;
    //   541: astore 6
    //   543: goto -256 -> 287
    //   546: new 499	it/a/a/j
    //   549: dup
    //   550: ldc_w 501
    //   553: aload 7
    //   555: invokespecial 504	it/a/a/j:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   558: athrow
    //   559: aload_0
    //   560: getfield 174	it/a/a/b:S	Z
    //   563: ifeq +16 -> 579
    //   566: aload_0
    //   567: getfield 180	it/a/a/b:V	Lit/a/a/f;
    //   570: invokevirtual 207	it/a/a/f:c	()Lit/a/a/s;
    //   573: pop
    //   574: aload_0
    //   575: iconst_0
    //   576: putfield 174	it/a/a/b:S	Z
    //   579: aload_1
    //   580: athrow
    //   581: aload_0
    //   582: getfield 174	it/a/a/b:S	Z
    //   585: ifeq +16 -> 601
    //   588: aload_0
    //   589: getfield 180	it/a/a/b:V	Lit/a/a/f;
    //   592: invokevirtual 207	it/a/a/f:c	()Lit/a/a/s;
    //   595: pop
    //   596: aload_0
    //   597: iconst_0
    //   598: putfield 174	it/a/a/b:S	Z
    //   601: aload 13
    //   603: invokevirtual 507	java/util/ArrayList:size	()I
    //   606: istore_3
    //   607: iload_3
    //   608: anewarray 217	java/lang/String
    //   611: astore 7
    //   613: iload_2
    //   614: iload_3
    //   615: if_icmpge +23 -> 638
    //   618: aload 7
    //   620: iload_2
    //   621: aload 13
    //   623: iload_2
    //   624: invokevirtual 511	java/util/ArrayList:get	(I)Ljava/lang/Object;
    //   627: checkcast 217	java/lang/String
    //   630: aastore
    //   631: iload_2
    //   632: iconst_1
    //   633: iadd
    //   634: istore_2
    //   635: goto -22 -> 613
    //   638: iload 4
    //   640: ifeq +30 -> 670
    //   643: new 197	it/a/a/c/c
    //   646: dup
    //   647: invokespecial 198	it/a/a/c/c:<init>	()V
    //   650: aload 7
    //   652: invokevirtual 784	it/a/a/c/c:a	([Ljava/lang/String;)[Lit/a/a/n;
    //   655: astore 6
    //   657: aload 6
    //   659: ifnonnull +118 -> 777
    //   662: new 777	it/a/a/q
    //   665: dup
    //   666: invokespecial 785	it/a/a/q:<init>	()V
    //   669: athrow
    //   670: aload_0
    //   671: getfield 130	it/a/a/b:s	Lit/a/a/r;
    //   674: astore 6
    //   676: aload 8
    //   678: astore_1
    //   679: aload 6
    //   681: ifnull +15 -> 696
    //   684: aload_0
    //   685: getfield 130	it/a/a/b:s	Lit/a/a/r;
    //   688: aload 7
    //   690: invokeinterface 788 2 0
    //   695: astore_1
    //   696: aload_1
    //   697: astore 6
    //   699: aload_1
    //   700: ifnonnull -43 -> 657
    //   703: aload_0
    //   704: getfield 121	it/a/a/b:q	Ljava/util/ArrayList;
    //   707: invokevirtual 708	java/util/ArrayList:iterator	()Ljava/util/Iterator;
    //   710: astore 8
    //   712: aload_1
    //   713: astore 6
    //   715: aload 8
    //   717: invokeinterface 713 1 0
    //   722: ifeq -65 -> 657
    //   725: aload 8
    //   727: invokeinterface 717 1 0
    //   732: checkcast 787	it/a/a/r
    //   735: astore 9
    //   737: aload 9
    //   739: aload 7
    //   741: invokeinterface 788 2 0
    //   746: astore 6
    //   748: aload 6
    //   750: astore_1
    //   751: aload_0
    //   752: aload 9
    //   754: putfield 130	it/a/a/b:s	Lit/a/a/r;
    //   757: goto -100 -> 657
    //   760: astore 6
    //   762: goto -50 -> 712
    //   765: astore_1
    //   766: aload_0
    //   767: aconst_null
    //   768: putfield 130	it/a/a/b:s	Lit/a/a/r;
    //   771: aload 8
    //   773: astore_1
    //   774: goto -78 -> 696
    //   777: aload 11
    //   779: monitorexit
    //   780: aload 6
    //   782: areturn
    //   783: aload_0
    //   784: getfield 180	it/a/a/b:V	Lit/a/a/f;
    //   787: invokevirtual 207	it/a/a/f:c	()Lit/a/a/s;
    //   790: astore 6
    //   792: iload 4
    //   794: ifne -235 -> 559
    //   797: aload 6
    //   799: invokevirtual 212	it/a/a/s:a	()I
    //   802: sipush 226
    //   805: if_icmpeq -246 -> 559
    //   808: new 306	it/a/a/m
    //   811: dup
    //   812: aload 6
    //   814: invokespecial 309	it/a/a/m:<init>	(Lit/a/a/s;)V
    //   817: athrow
    //   818: astore 6
    //   820: goto -429 -> 391
    //   823: astore 6
    //   825: goto -429 -> 396
    //   828: astore_1
    //   829: iconst_0
    //   830: istore 4
    //   832: iload 4
    //   834: istore 5
    //   836: aload 6
    //   838: monitorexit
    //   839: aload_1
    //   840: athrow
    //   841: aload 6
    //   843: ifnull +8 -> 851
    //   846: aload 6
    //   848: invokevirtual 497	it/a/a/u:close	()V
    //   851: aload 12
    //   853: invokevirtual 304	java/net/Socket:close	()V
    //   856: aload_0
    //   857: aconst_null
    //   858: putfield 168	it/a/a/b:P	Ljava/io/InputStream;
    //   861: aload_0
    //   862: getfield 178	it/a/a/b:U	Ljava/lang/Object;
    //   865: astore 6
    //   867: aload 6
    //   869: monitorenter
    //   870: aload_0
    //   871: getfield 172	it/a/a/b:R	Z
    //   874: istore 5
    //   876: aload_0
    //   877: iconst_0
    //   878: putfield 166	it/a/a/b:O	Z
    //   881: aload_0
    //   882: iconst_0
    //   883: putfield 172	it/a/a/b:R	Z
    //   886: aload 6
    //   888: monitorexit
    //   889: aload_0
    //   890: getfield 180	it/a/a/b:V	Lit/a/a/f;
    //   893: invokevirtual 207	it/a/a/f:c	()Lit/a/a/s;
    //   896: astore_1
    //   897: aload_0
    //   898: invokespecial 257	it/a/a/b:O	()V
    //   901: aload_1
    //   902: invokevirtual 212	it/a/a/s:a	()I
    //   905: sipush 150
    //   908: if_icmpeq +38 -> 946
    //   911: aload_1
    //   912: invokevirtual 212	it/a/a/s:a	()I
    //   915: bipush 125
    //   917: if_icmpeq +29 -> 946
    //   920: new 306	it/a/a/m
    //   923: dup
    //   924: aload_1
    //   925: invokespecial 309	it/a/a/m:<init>	(Lit/a/a/s;)V
    //   928: athrow
    //   929: astore_1
    //   930: goto -79 -> 851
    //   933: astore_1
    //   934: goto -78 -> 856
    //   937: astore_1
    //   938: iconst_0
    //   939: istore 4
    //   941: aload 6
    //   943: monitorexit
    //   944: aload_1
    //   945: athrow
    //   946: aload_0
    //   947: getfield 180	it/a/a/b:V	Lit/a/a/f;
    //   950: invokevirtual 207	it/a/a/f:c	()Lit/a/a/s;
    //   953: astore_1
    //   954: iload 5
    //   956: ifne -375 -> 581
    //   959: aload_1
    //   960: invokevirtual 212	it/a/a/s:a	()I
    //   963: sipush 226
    //   966: if_icmpeq -385 -> 581
    //   969: new 306	it/a/a/m
    //   972: dup
    //   973: aload_1
    //   974: invokespecial 309	it/a/a/m:<init>	(Lit/a/a/s;)V
    //   977: athrow
    //   978: astore_1
    //   979: goto -38 -> 941
    //   982: astore_1
    //   983: iload 5
    //   985: istore 4
    //   987: goto -46 -> 941
    //   990: astore_1
    //   991: iload 5
    //   993: istore 4
    //   995: goto -163 -> 832
    //   998: astore_1
    //   999: goto -618 -> 381
    //   1002: astore 7
    //   1004: aload 9
    //   1006: astore 6
    //   1008: goto -676 -> 332
    //   1011: iload 4
    //   1013: ifeq -511 -> 502
    //   1016: ldc -18
    //   1018: astore 6
    //   1020: goto -895 -> 125
    //   1023: iconst_0
    //   1024: istore 4
    //   1026: goto -15 -> 1011
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	1029	0	this	b
    //   0	1029	1	paramString	String
    //   10	625	2	i1	int
    //   606	10	3	i2	int
    //   120	905	4	bool1	boolean
    //   418	574	5	bool2	boolean
    //   79	427	6	localObject1	Object
    //   527	5	6	localObject2	Object
    //   541	208	6	localObject3	Object
    //   760	21	6	localq	q
    //   790	23	6	locals	s
    //   818	1	6	localThrowable1	Throwable
    //   823	24	6	localThrowable2	Throwable
    //   865	154	6	localObject4	Object
    //   127	168	7	localObject5	Object
    //   330	1	7	localIOException1	IOException
    //   362	9	7	localObject6	Object
    //   373	181	7	localThrowable3	Throwable
    //   611	129	7	arrayOfString	String[]
    //   1002	1	7	localIOException2	IOException
    //   4	768	8	localObject7	Object
    //   7	998	9	localr	r
    //   1	534	10	localObject8	Object
    //   15	763	11	localObject9	Object
    //   196	656	12	localSocket	Socket
    //   178	444	13	localArrayList	ArrayList
    //   107	405	14	locali	i
    // Exception table:
    //   from	to	target	type
    //   20	38	38	finally
    //   39	42	38	finally
    //   44	62	38	finally
    //   62	103	38	finally
    //   103	122	38	finally
    //   137	171	38	finally
    //   171	189	38	finally
    //   444	488	38	finally
    //   488	496	38	finally
    //   559	579	38	finally
    //   579	581	38	finally
    //   581	601	38	finally
    //   601	613	38	finally
    //   618	631	38	finally
    //   643	657	38	finally
    //   662	670	38	finally
    //   670	676	38	finally
    //   684	696	38	finally
    //   703	712	38	finally
    //   715	737	38	finally
    //   737	748	38	finally
    //   751	757	38	finally
    //   766	771	38	finally
    //   777	780	38	finally
    //   783	792	38	finally
    //   797	818	38	finally
    //   889	929	38	finally
    //   946	954	38	finally
    //   959	978	38	finally
    //   303	309	330	java/io/IOException
    //   313	327	330	java/io/IOException
    //   347	362	362	finally
    //   364	367	362	finally
    //   546	559	362	finally
    //   232	241	373	finally
    //   244	251	373	finally
    //   254	269	373	finally
    //   272	278	373	finally
    //   290	303	373	finally
    //   335	341	373	finally
    //   344	347	373	finally
    //   370	373	373	finally
    //   537	543	373	finally
    //   441	443	443	finally
    //   839	841	443	finally
    //   944	946	443	finally
    //   189	198	510	finally
    //   198	212	520	finally
    //   386	391	520	finally
    //   391	396	520	finally
    //   396	410	520	finally
    //   511	520	520	finally
    //   531	534	520	finally
    //   846	851	520	finally
    //   851	856	520	finally
    //   856	870	520	finally
    //   212	229	527	finally
    //   529	531	527	finally
    //   737	748	760	it/a/a/q
    //   751	757	760	it/a/a/q
    //   684	696	765	it/a/a/q
    //   386	391	818	java/lang/Throwable
    //   391	396	823	java/lang/Throwable
    //   410	416	828	finally
    //   846	851	929	java/lang/Throwable
    //   851	856	933	java/lang/Throwable
    //   870	876	937	finally
    //   941	944	978	finally
    //   876	889	982	finally
    //   420	425	990	finally
    //   429	434	990	finally
    //   438	441	990	finally
    //   836	839	990	finally
    //   303	309	998	finally
    //   313	327	998	finally
    //   232	241	1002	java/io/IOException
    //   244	251	1002	java/io/IOException
    //   254	269	1002	java/io/IOException
    //   272	278	1002	java/io/IOException
    //   290	303	1002	java/io/IOException
    //   537	543	1002	java/io/IOException
  }
  
  public boolean m()
  {
    synchronized (this.T)
    {
      boolean bool = this.A;
      return bool;
    }
  }
  
  public String n()
  {
    synchronized (this.T)
    {
      String str = this.t;
      return str;
    }
  }
  
  public int o()
  {
    synchronized (this.T)
    {
      int i1 = this.u;
      return i1;
    }
  }
  
  public String p()
  {
    synchronized (this.T)
    {
      String str = this.x;
      return str;
    }
  }
  
  public String q()
  {
    synchronized (this.T)
    {
      String str = this.w;
      return str;
    }
  }
  
  public long r()
  {
    synchronized (this.T)
    {
      long l1 = this.D;
      return l1;
    }
  }
  
  public g[] s()
  {
    synchronized (this.T)
    {
      int i2 = this.p.size();
      g[] arrayOfg = new g[i2];
      int i1 = 0;
      while (i1 < i2)
      {
        arrayOfg[i1] = ((g)this.p.get(i1));
        i1 += 1;
      }
      return arrayOfg;
    }
  }
  
  public r[] t()
  {
    synchronized (this.T)
    {
      int i2 = this.q.size();
      r[] arrayOfr = new r[i2];
      int i1 = 0;
      while (i1 < i2)
      {
        arrayOfr[i1] = ((r)this.q.get(i1));
        i1 += 1;
      }
      return arrayOfr;
    }
  }
  
  public String toString()
  {
    int i2 = 0;
    StringBuffer localStringBuffer3;
    int i1;
    for (;;)
    {
      synchronized (this.T)
      {
        localStringBuffer3 = new StringBuffer();
        localStringBuffer3.append(getClass().getName());
        localStringBuffer3.append(" [connected=");
        localStringBuffer3.append(this.y);
        if (this.y)
        {
          localStringBuffer3.append(", host=");
          localStringBuffer3.append(this.t);
          localStringBuffer3.append(", port=");
          localStringBuffer3.append(this.u);
        }
        localStringBuffer3.append(", connector=");
        localStringBuffer3.append(this.n);
        localStringBuffer3.append(", security=");
        switch (this.v)
        {
        case 0: 
          localStringBuffer3.append(", authenticated=");
          localStringBuffer3.append(this.z);
          if (!this.z) {
            break label389;
          }
          localStringBuffer3.append(", username=");
          localStringBuffer3.append(this.w);
          localStringBuffer3.append(", password=");
          StringBuffer localStringBuffer1 = new StringBuffer();
          i1 = 0;
          if (i1 >= this.x.length()) {
            break label287;
          }
          localStringBuffer1.append('*');
          i1 += 1;
          continue;
          localStringBuffer3.append("SECURITY_FTP");
        }
      }
      localStringBuffer3.append("SECURITY_FTPS");
      continue;
      localStringBuffer3.append("SECURITY_FTPES");
    }
    label287:
    localStringBuffer3.append(localStringBuffer2);
    localStringBuffer3.append(", restSupported=");
    localStringBuffer3.append(this.G);
    localStringBuffer3.append(", utf8supported=");
    localStringBuffer3.append(this.J);
    localStringBuffer3.append(", mlsdSupported=");
    localStringBuffer3.append(this.K);
    localStringBuffer3.append(", mode=modezSupported");
    localStringBuffer3.append(this.L);
    localStringBuffer3.append(", mode=modezEnabled");
    localStringBuffer3.append(this.M);
    label389:
    localStringBuffer3.append(", transfer mode=");
    if (this.A) {}
    for (Object localObject1 = "passive";; localObject1 = "active")
    {
      localStringBuffer3.append((String)localObject1);
      localStringBuffer3.append(", transfer type=");
      switch (this.B)
      {
      }
      for (;;)
      {
        localStringBuffer3.append(", textualExtensionRecognizer=");
        localStringBuffer3.append(this.r);
        localObject1 = t();
        if (localObject1.length > 0)
        {
          localStringBuffer3.append(", listParsers=");
          i1 = 0;
          for (;;)
          {
            if (i1 < localObject1.length)
            {
              if (i1 > 0) {
                localStringBuffer3.append(", ");
              }
              localStringBuffer3.append(localObject1[i1]);
              i1 += 1;
              continue;
              localStringBuffer3.append("TYPE_AUTO");
              break;
              localStringBuffer3.append("TYPE_BINARY");
              break;
              localStringBuffer3.append("TYPE_TEXTUAL");
              break;
            }
          }
        }
        localObject1 = s();
        if (localObject1.length > 0)
        {
          localStringBuffer3.append(", communicationListeners=");
          i1 = i2;
          while (i1 < localObject1.length)
          {
            if (i1 > 0) {
              localStringBuffer3.append(", ");
            }
            localStringBuffer3.append(localObject1[i1]);
            i1 += 1;
          }
        }
        localStringBuffer3.append(", autoNoopTimeout=");
        localStringBuffer3.append(this.D);
        localStringBuffer3.append("]");
        localObject1 = localStringBuffer3.toString();
        return (String)localObject1;
        break;
      }
    }
  }
  
  public void u()
  {
    this.n.b();
  }
  
  public void v()
  {
    if (this.V != null)
    {
      this.V.a();
      this.V = null;
    }
    this.y = false;
    N();
  }
  
  public void w()
  {
    synchronized (this.T)
    {
      if (!this.y) {
        throw new IllegalStateException("Client not connected");
      }
    }
    if (!this.z) {
      throw new IllegalStateException("Client not authenticated");
    }
    this.V.a("REIN");
    s locals = this.V.c();
    if (!locals.b()) {
      throw new m(locals);
    }
    N();
    this.z = false;
    this.w = null;
    this.x = null;
  }
  
  public void x()
  {
    synchronized (this.T)
    {
      if (!this.y) {
        throw new IllegalStateException("Client not connected");
      }
    }
    if (!this.z) {
      throw new IllegalStateException("Client not authenticated");
    }
    try
    {
      this.V.a("NOOP");
      s locals = this.V.c();
      if (!locals.b()) {
        throw new m(locals);
      }
    }
    finally
    {
      O();
    }
    O();
  }
  
  public String y()
  {
    synchronized (this.T)
    {
      if (!this.y) {
        throw new IllegalStateException("Client not connected");
      }
    }
    if (!this.z) {
      throw new IllegalStateException("Client not authenticated");
    }
    this.V.a("PWD");
    Object localObject3 = this.V.c();
    O();
    if (!((s)localObject3).b()) {
      throw new m((s)localObject3);
    }
    localObject3 = ((s)localObject3).c();
    if (localObject3.length != 1) {
      throw new o();
    }
    Matcher localMatcher = m.matcher(localObject3[0]);
    if (localMatcher.find())
    {
      localObject3 = localObject3[0].substring(localMatcher.start() + 1, localMatcher.end() - 1);
      return (String)localObject3;
    }
    throw new o();
  }
  
  public void z()
  {
    synchronized (this.T)
    {
      if (!this.y) {
        throw new IllegalStateException("Client not connected");
      }
    }
    if (!this.z) {
      throw new IllegalStateException("Client not authenticated");
    }
    this.V.a("CDUP");
    s locals = this.V.c();
    O();
    if (!locals.b()) {
      throw new m(locals);
    }
  }
  
  private class a
    extends Thread
  {
    private a() {}
    
    a(c paramc)
    {
      this();
    }
    
    public void run()
    {
      synchronized (b.d(b.this))
      {
        if ((b.e(b.this) <= 0L) && (b.f(b.this) > 0L)) {
          b.a(b.this, System.currentTimeMillis() + b.f(b.this));
        }
        for (;;)
        {
          if ((!Thread.interrupted()) && (b.f(b.this) > 0L))
          {
            long l1 = b.e(b.this);
            long l2 = System.currentTimeMillis();
            l1 -= l2;
            if (l1 > 0L) {}
            try
            {
              b.d(b.this).wait(l1);
              l1 = System.currentTimeMillis();
              l2 = b.e(b.this);
              if (l1 >= l2) {
                try
                {
                  b.this.x();
                }
                catch (Throwable localThrowable) {}
              }
            }
            catch (InterruptedException localInterruptedException) {}
          }
        }
        return;
      }
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/it/a/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */