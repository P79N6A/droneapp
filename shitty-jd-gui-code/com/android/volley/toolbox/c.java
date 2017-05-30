package com.android.volley.toolbox;

import android.os.SystemClock;
import com.android.volley.b.a;
import com.android.volley.g;
import com.android.volley.n;
import com.android.volley.r;
import com.android.volley.s;
import com.android.volley.u;
import com.android.volley.v;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.StatusLine;
import org.apache.http.impl.cookie.DateUtils;

public class c
  implements g
{
  protected static final boolean a = v.b;
  private static int d = 3000;
  private static int e = 4096;
  protected final i b;
  protected final d c;
  
  public c(i parami)
  {
    this(parami, new d(e));
  }
  
  public c(i parami, d paramd)
  {
    this.b = parami;
    this.c = paramd;
  }
  
  protected static Map<String, String> a(Header[] paramArrayOfHeader)
  {
    TreeMap localTreeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
    int i = 0;
    while (i < paramArrayOfHeader.length)
    {
      localTreeMap.put(paramArrayOfHeader[i].getName(), paramArrayOfHeader[i].getValue());
      i += 1;
    }
    return localTreeMap;
  }
  
  private void a(long paramLong, n<?> paramn, byte[] paramArrayOfByte, StatusLine paramStatusLine)
  {
    if ((a) || (paramLong > d)) {
      if (paramArrayOfByte == null) {
        break label82;
      }
    }
    label82:
    for (paramArrayOfByte = Integer.valueOf(paramArrayOfByte.length);; paramArrayOfByte = "null")
    {
      v.b("HTTP response for request=<%s> [lifetime=%d], [size=%s], [rc=%d], [retryCount=%s]", new Object[] { paramn, Long.valueOf(paramLong), paramArrayOfByte, Integer.valueOf(paramStatusLine.getStatusCode()), Integer.valueOf(paramn.z().b()) });
      return;
    }
  }
  
  private static void a(String paramString, n<?> paramn, u paramu)
  {
    r localr = paramn.z();
    int i = paramn.y();
    try
    {
      localr.a(paramu);
      paramn.a(String.format("%s-retry [timeout=%s]", new Object[] { paramString, Integer.valueOf(i) }));
      return;
    }
    catch (u paramu)
    {
      paramn.a(String.format("%s-timeout-giveup [timeout=%s]", new Object[] { paramString, Integer.valueOf(i) }));
      throw paramu;
    }
  }
  
  private void a(Map<String, String> paramMap, b.a parama)
  {
    if (parama == null) {}
    do
    {
      return;
      if (parama.b != null) {
        paramMap.put("If-None-Match", parama.b);
      }
    } while (parama.d <= 0L);
    paramMap.put("If-Modified-Since", DateUtils.formatDate(new Date(parama.d)));
  }
  
  private byte[] a(HttpEntity paramHttpEntity)
  {
    q localq = new q(this.c, (int)paramHttpEntity.getContentLength());
    Object localObject2 = null;
    Object localObject1 = localObject2;
    Object localObject4;
    try
    {
      localObject4 = paramHttpEntity.getContent();
      if (localObject4 == null)
      {
        localObject1 = localObject2;
        throw new s();
      }
    }
    finally {}
    try
    {
      paramHttpEntity.consumeContent();
      this.c.a((byte[])localObject1);
      localq.close();
      throw ((Throwable)localObject3);
      localObject1 = localObject3;
      byte[] arrayOfByte = this.c.a(1024);
      for (;;)
      {
        localObject1 = arrayOfByte;
        int i = ((InputStream)localObject4).read(arrayOfByte);
        if (i == -1) {
          break;
        }
        localObject1 = arrayOfByte;
        localq.write(arrayOfByte, 0, i);
      }
      localObject1 = arrayOfByte;
      localObject4 = localq.toByteArray();
      try
      {
        paramHttpEntity.consumeContent();
        this.c.a(arrayOfByte);
        localq.close();
        return (byte[])localObject4;
      }
      catch (IOException paramHttpEntity)
      {
        for (;;)
        {
          v.a("Error occured when calling consumingContent", new Object[0]);
        }
      }
    }
    catch (IOException paramHttpEntity)
    {
      for (;;)
      {
        v.a("Error occured when calling consumingContent", new Object[0]);
      }
    }
  }
  
  /* Error */
  public com.android.volley.j a(n<?> paramn)
  {
    // Byte code:
    //   0: invokestatic 218	android/os/SystemClock:elapsedRealtime	()J
    //   3: lstore_3
    //   4: aconst_null
    //   5: astore 9
    //   7: invokestatic 224	java/util/Collections:emptyMap	()Ljava/util/Map;
    //   10: astore 7
    //   12: new 226	java/util/HashMap
    //   15: dup
    //   16: invokespecial 227	java/util/HashMap:<init>	()V
    //   19: astore 5
    //   21: aload_0
    //   22: aload 5
    //   24: aload_1
    //   25: invokevirtual 231	com/android/volley/n:k	()Lcom/android/volley/b$a;
    //   28: invokespecial 233	com/android/volley/toolbox/c:a	(Ljava/util/Map;Lcom/android/volley/b$a;)V
    //   31: aload_0
    //   32: getfield 42	com/android/volley/toolbox/c:b	Lcom/android/volley/toolbox/i;
    //   35: aload_1
    //   36: aload 5
    //   38: invokeinterface 238 3 0
    //   43: astore 6
    //   45: aload 7
    //   47: astore 5
    //   49: aload 6
    //   51: invokeinterface 244 1 0
    //   56: astore 8
    //   58: aload 7
    //   60: astore 5
    //   62: aload 8
    //   64: invokeinterface 93 1 0
    //   69: istore_2
    //   70: aload 7
    //   72: astore 5
    //   74: aload 6
    //   76: invokeinterface 248 1 0
    //   81: invokestatic 250	com/android/volley/toolbox/c:a	([Lorg/apache/http/Header;)Ljava/util/Map;
    //   84: astore 9
    //   86: iload_2
    //   87: sipush 304
    //   90: if_icmpne +547 -> 637
    //   93: aload 9
    //   95: astore 5
    //   97: aload_1
    //   98: invokevirtual 231	com/android/volley/n:k	()Lcom/android/volley/b$a;
    //   101: astore 7
    //   103: aload 7
    //   105: ifnonnull +27 -> 132
    //   108: aload 9
    //   110: astore 5
    //   112: new 252	com/android/volley/j
    //   115: dup
    //   116: sipush 304
    //   119: aconst_null
    //   120: aload 9
    //   122: iconst_1
    //   123: invokestatic 218	android/os/SystemClock:elapsedRealtime	()J
    //   126: lload_3
    //   127: lsub
    //   128: invokespecial 255	com/android/volley/j:<init>	(I[BLjava/util/Map;ZJ)V
    //   131: areturn
    //   132: aload 9
    //   134: astore 5
    //   136: aload 7
    //   138: getfield 259	com/android/volley/b$a:g	Ljava/util/Map;
    //   141: aload 9
    //   143: invokeinterface 263 2 0
    //   148: aload 9
    //   150: astore 5
    //   152: new 252	com/android/volley/j
    //   155: dup
    //   156: sipush 304
    //   159: aload 7
    //   161: getfield 266	com/android/volley/b$a:a	[B
    //   164: aload 7
    //   166: getfield 259	com/android/volley/b$a:g	Ljava/util/Map;
    //   169: iconst_1
    //   170: invokestatic 218	android/os/SystemClock:elapsedRealtime	()J
    //   173: lload_3
    //   174: lsub
    //   175: invokespecial 255	com/android/volley/j:<init>	(I[BLjava/util/Map;ZJ)V
    //   178: areturn
    //   179: aload 9
    //   181: astore 5
    //   183: aload_1
    //   184: aload 9
    //   186: ldc_w 268
    //   189: invokeinterface 272 2 0
    //   194: checkcast 49	java/lang/String
    //   197: invokevirtual 274	com/android/volley/n:c	(Ljava/lang/String;)V
    //   200: aload 9
    //   202: astore 5
    //   204: aload 6
    //   206: invokeinterface 278 1 0
    //   211: ifnull +79 -> 290
    //   214: aload 9
    //   216: astore 5
    //   218: aload_0
    //   219: aload 6
    //   221: invokeinterface 278 1 0
    //   226: invokespecial 280	com/android/volley/toolbox/c:a	(Lorg/apache/http/HttpEntity;)[B
    //   229: astore 7
    //   231: aload 7
    //   233: astore 5
    //   235: aload_0
    //   236: invokestatic 218	android/os/SystemClock:elapsedRealtime	()J
    //   239: lload_3
    //   240: lsub
    //   241: aload_1
    //   242: aload 5
    //   244: aload 8
    //   246: invokespecial 282	com/android/volley/toolbox/c:a	(JLcom/android/volley/n;[BLorg/apache/http/StatusLine;)V
    //   249: iload_2
    //   250: sipush 200
    //   253: if_icmplt +10 -> 263
    //   256: iload_2
    //   257: sipush 299
    //   260: if_icmple +46 -> 306
    //   263: new 158	java/io/IOException
    //   266: dup
    //   267: invokespecial 283	java/io/IOException:<init>	()V
    //   270: athrow
    //   271: astore 5
    //   273: ldc_w 285
    //   276: aload_1
    //   277: new 287	com/android/volley/t
    //   280: dup
    //   281: invokespecial 288	com/android/volley/t:<init>	()V
    //   284: invokestatic 290	com/android/volley/toolbox/c:a	(Ljava/lang/String;Lcom/android/volley/n;Lcom/android/volley/u;)V
    //   287: goto -283 -> 4
    //   290: aload 9
    //   292: astore 5
    //   294: iconst_0
    //   295: newarray <illegal type>
    //   297: astore 7
    //   299: aload 7
    //   301: astore 5
    //   303: goto -68 -> 235
    //   306: new 252	com/android/volley/j
    //   309: dup
    //   310: iload_2
    //   311: aload 5
    //   313: aload 9
    //   315: iconst_0
    //   316: invokestatic 218	android/os/SystemClock:elapsedRealtime	()J
    //   319: lload_3
    //   320: lsub
    //   321: invokespecial 255	com/android/volley/j:<init>	(I[BLjava/util/Map;ZJ)V
    //   324: astore 7
    //   326: aload 7
    //   328: areturn
    //   329: astore 5
    //   331: ldc_w 292
    //   334: aload_1
    //   335: new 287	com/android/volley/t
    //   338: dup
    //   339: invokespecial 288	com/android/volley/t:<init>	()V
    //   342: invokestatic 290	com/android/volley/toolbox/c:a	(Ljava/lang/String;Lcom/android/volley/n;Lcom/android/volley/u;)V
    //   345: goto -341 -> 4
    //   348: astore 5
    //   350: new 294	java/lang/RuntimeException
    //   353: dup
    //   354: new 296	java/lang/StringBuilder
    //   357: dup
    //   358: invokespecial 297	java/lang/StringBuilder:<init>	()V
    //   361: ldc_w 299
    //   364: invokevirtual 303	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   367: aload_1
    //   368: invokevirtual 305	com/android/volley/n:g	()Ljava/lang/String;
    //   371: invokevirtual 303	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   374: invokevirtual 308	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   377: aload 5
    //   379: invokespecial 311	java/lang/RuntimeException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   382: athrow
    //   383: astore 6
    //   385: aconst_null
    //   386: astore 8
    //   388: aload 7
    //   390: astore 5
    //   392: aload 9
    //   394: astore 7
    //   396: aload 7
    //   398: ifnull +112 -> 510
    //   401: aload 7
    //   403: invokeinterface 244 1 0
    //   408: invokeinterface 93 1 0
    //   413: istore_2
    //   414: iload_2
    //   415: sipush 301
    //   418: if_icmpeq +10 -> 428
    //   421: iload_2
    //   422: sipush 302
    //   425: if_icmpne +95 -> 520
    //   428: ldc_w 313
    //   431: iconst_2
    //   432: anewarray 4	java/lang/Object
    //   435: dup
    //   436: iconst_0
    //   437: aload_1
    //   438: invokevirtual 316	com/android/volley/n:h	()Ljava/lang/String;
    //   441: aastore
    //   442: dup
    //   443: iconst_1
    //   444: aload_1
    //   445: invokevirtual 305	com/android/volley/n:g	()Ljava/lang/String;
    //   448: aastore
    //   449: invokestatic 318	com/android/volley/v:c	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   452: aload 8
    //   454: ifnull +136 -> 590
    //   457: new 252	com/android/volley/j
    //   460: dup
    //   461: iload_2
    //   462: aload 8
    //   464: aload 5
    //   466: iconst_0
    //   467: invokestatic 218	android/os/SystemClock:elapsedRealtime	()J
    //   470: lload_3
    //   471: lsub
    //   472: invokespecial 255	com/android/volley/j:<init>	(I[BLjava/util/Map;ZJ)V
    //   475: astore 5
    //   477: iload_2
    //   478: sipush 401
    //   481: if_icmpeq +10 -> 491
    //   484: iload_2
    //   485: sipush 403
    //   488: if_icmpne +59 -> 547
    //   491: ldc_w 320
    //   494: aload_1
    //   495: new 322	com/android/volley/a
    //   498: dup
    //   499: aload 5
    //   501: invokespecial 325	com/android/volley/a:<init>	(Lcom/android/volley/j;)V
    //   504: invokestatic 290	com/android/volley/toolbox/c:a	(Ljava/lang/String;Lcom/android/volley/n;Lcom/android/volley/u;)V
    //   507: goto -503 -> 4
    //   510: new 327	com/android/volley/k
    //   513: dup
    //   514: aload 6
    //   516: invokespecial 330	com/android/volley/k:<init>	(Ljava/lang/Throwable;)V
    //   519: athrow
    //   520: ldc_w 332
    //   523: iconst_2
    //   524: anewarray 4	java/lang/Object
    //   527: dup
    //   528: iconst_0
    //   529: iload_2
    //   530: invokestatic 80	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   533: aastore
    //   534: dup
    //   535: iconst_1
    //   536: aload_1
    //   537: invokevirtual 305	com/android/volley/n:g	()Ljava/lang/String;
    //   540: aastore
    //   541: invokestatic 318	com/android/volley/v:c	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   544: goto -92 -> 452
    //   547: iload_2
    //   548: sipush 301
    //   551: if_icmpeq +10 -> 561
    //   554: iload_2
    //   555: sipush 302
    //   558: if_icmpne +22 -> 580
    //   561: ldc_w 334
    //   564: aload_1
    //   565: new 336	com/android/volley/m
    //   568: dup
    //   569: aload 5
    //   571: invokespecial 337	com/android/volley/m:<init>	(Lcom/android/volley/j;)V
    //   574: invokestatic 290	com/android/volley/toolbox/c:a	(Ljava/lang/String;Lcom/android/volley/n;Lcom/android/volley/u;)V
    //   577: goto -573 -> 4
    //   580: new 175	com/android/volley/s
    //   583: dup
    //   584: aload 5
    //   586: invokespecial 338	com/android/volley/s:<init>	(Lcom/android/volley/j;)V
    //   589: athrow
    //   590: new 340	com/android/volley/i
    //   593: dup
    //   594: aload 6
    //   596: invokespecial 341	com/android/volley/i:<init>	(Ljava/lang/Throwable;)V
    //   599: athrow
    //   600: astore 9
    //   602: aconst_null
    //   603: astore 8
    //   605: aload 6
    //   607: astore 7
    //   609: aload 9
    //   611: astore 6
    //   613: goto -217 -> 396
    //   616: astore 8
    //   618: aload 6
    //   620: astore 7
    //   622: aload 8
    //   624: astore 6
    //   626: aload 5
    //   628: astore 8
    //   630: aload 9
    //   632: astore 5
    //   634: goto -238 -> 396
    //   637: iload_2
    //   638: sipush 301
    //   641: if_icmpeq -462 -> 179
    //   644: iload_2
    //   645: sipush 302
    //   648: if_icmpne -448 -> 200
    //   651: goto -472 -> 179
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	654	0	this	c
    //   0	654	1	paramn	n<?>
    //   69	580	2	i	int
    //   3	468	3	l	long
    //   19	224	5	localObject1	Object
    //   271	1	5	localSocketTimeoutException	java.net.SocketTimeoutException
    //   292	20	5	localObject2	Object
    //   329	1	5	localConnectTimeoutException	org.apache.http.conn.ConnectTimeoutException
    //   348	30	5	localMalformedURLException	java.net.MalformedURLException
    //   390	243	5	localObject3	Object
    //   43	177	6	localHttpResponse	org.apache.http.HttpResponse
    //   383	223	6	localIOException1	IOException
    //   611	14	6	localObject4	Object
    //   10	611	7	localObject5	Object
    //   56	548	8	localStatusLine	StatusLine
    //   616	7	8	localIOException2	IOException
    //   628	1	8	localObject6	Object
    //   5	388	9	localMap	Map
    //   600	31	9	localIOException3	IOException
    // Exception table:
    //   from	to	target	type
    //   12	45	271	java/net/SocketTimeoutException
    //   49	58	271	java/net/SocketTimeoutException
    //   62	70	271	java/net/SocketTimeoutException
    //   74	86	271	java/net/SocketTimeoutException
    //   97	103	271	java/net/SocketTimeoutException
    //   112	132	271	java/net/SocketTimeoutException
    //   136	148	271	java/net/SocketTimeoutException
    //   152	179	271	java/net/SocketTimeoutException
    //   183	200	271	java/net/SocketTimeoutException
    //   204	214	271	java/net/SocketTimeoutException
    //   218	231	271	java/net/SocketTimeoutException
    //   235	249	271	java/net/SocketTimeoutException
    //   263	271	271	java/net/SocketTimeoutException
    //   294	299	271	java/net/SocketTimeoutException
    //   306	326	271	java/net/SocketTimeoutException
    //   12	45	329	org/apache/http/conn/ConnectTimeoutException
    //   49	58	329	org/apache/http/conn/ConnectTimeoutException
    //   62	70	329	org/apache/http/conn/ConnectTimeoutException
    //   74	86	329	org/apache/http/conn/ConnectTimeoutException
    //   97	103	329	org/apache/http/conn/ConnectTimeoutException
    //   112	132	329	org/apache/http/conn/ConnectTimeoutException
    //   136	148	329	org/apache/http/conn/ConnectTimeoutException
    //   152	179	329	org/apache/http/conn/ConnectTimeoutException
    //   183	200	329	org/apache/http/conn/ConnectTimeoutException
    //   204	214	329	org/apache/http/conn/ConnectTimeoutException
    //   218	231	329	org/apache/http/conn/ConnectTimeoutException
    //   235	249	329	org/apache/http/conn/ConnectTimeoutException
    //   263	271	329	org/apache/http/conn/ConnectTimeoutException
    //   294	299	329	org/apache/http/conn/ConnectTimeoutException
    //   306	326	329	org/apache/http/conn/ConnectTimeoutException
    //   12	45	348	java/net/MalformedURLException
    //   49	58	348	java/net/MalformedURLException
    //   62	70	348	java/net/MalformedURLException
    //   74	86	348	java/net/MalformedURLException
    //   97	103	348	java/net/MalformedURLException
    //   112	132	348	java/net/MalformedURLException
    //   136	148	348	java/net/MalformedURLException
    //   152	179	348	java/net/MalformedURLException
    //   183	200	348	java/net/MalformedURLException
    //   204	214	348	java/net/MalformedURLException
    //   218	231	348	java/net/MalformedURLException
    //   235	249	348	java/net/MalformedURLException
    //   263	271	348	java/net/MalformedURLException
    //   294	299	348	java/net/MalformedURLException
    //   306	326	348	java/net/MalformedURLException
    //   12	45	383	java/io/IOException
    //   49	58	600	java/io/IOException
    //   62	70	600	java/io/IOException
    //   74	86	600	java/io/IOException
    //   97	103	600	java/io/IOException
    //   112	132	600	java/io/IOException
    //   136	148	600	java/io/IOException
    //   152	179	600	java/io/IOException
    //   183	200	600	java/io/IOException
    //   204	214	600	java/io/IOException
    //   218	231	600	java/io/IOException
    //   294	299	600	java/io/IOException
    //   235	249	616	java/io/IOException
    //   263	271	616	java/io/IOException
    //   306	326	616	java/io/IOException
  }
  
  protected void a(String paramString1, String paramString2, long paramLong)
  {
    v.a("HTTP ERROR(%s) %d ms to fetch %s", new Object[] { paramString1, Long.valueOf(SystemClock.elapsedRealtime() - paramLong), paramString2 });
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/android/volley/toolbox/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */