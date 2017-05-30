package com.fimi.soul.utils;

import android.os.Handler;

public class ab
{
  /* Error */
  public static int a(String paramString1, String paramString2, String paramString3, int paramInt, Handler paramHandler)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 18
    //   3: aconst_null
    //   4: astore 17
    //   6: aconst_null
    //   7: astore 16
    //   9: aconst_null
    //   10: astore 19
    //   12: new 17	java/io/File
    //   15: dup
    //   16: aload_2
    //   17: invokespecial 20	java/io/File:<init>	(Ljava/lang/String;)V
    //   20: astore 20
    //   22: aload 20
    //   24: invokevirtual 24	java/io/File:exists	()Z
    //   27: ifne +9 -> 36
    //   30: aload 20
    //   32: invokevirtual 27	java/io/File:mkdir	()Z
    //   35: pop
    //   36: new 17	java/io/File
    //   39: dup
    //   40: new 29	java/lang/StringBuilder
    //   43: dup
    //   44: invokespecial 30	java/lang/StringBuilder:<init>	()V
    //   47: aload_2
    //   48: invokevirtual 34	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   51: ldc 36
    //   53: invokevirtual 34	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   56: aload_1
    //   57: invokevirtual 34	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   60: invokevirtual 40	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   63: invokespecial 20	java/io/File:<init>	(Ljava/lang/String;)V
    //   66: astore_1
    //   67: getstatic 46	java/lang/System:out	Ljava/io/PrintStream;
    //   70: new 29	java/lang/StringBuilder
    //   73: dup
    //   74: invokespecial 30	java/lang/StringBuilder:<init>	()V
    //   77: ldc 48
    //   79: invokevirtual 34	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   82: aload_1
    //   83: invokevirtual 51	java/io/File:getName	()Ljava/lang/String;
    //   86: invokevirtual 34	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   89: invokevirtual 40	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   92: invokevirtual 56	java/io/PrintStream:println	(Ljava/lang/String;)V
    //   95: new 58	java/net/URL
    //   98: dup
    //   99: aload_0
    //   100: invokespecial 59	java/net/URL:<init>	(Ljava/lang/String;)V
    //   103: astore_0
    //   104: aload_0
    //   105: invokevirtual 63	java/net/URL:openConnection	()Ljava/net/URLConnection;
    //   108: checkcast 65	java/net/HttpURLConnection
    //   111: astore_0
    //   112: getstatic 46	java/lang/System:out	Ljava/io/PrintStream;
    //   115: new 29	java/lang/StringBuilder
    //   118: dup
    //   119: invokespecial 30	java/lang/StringBuilder:<init>	()V
    //   122: ldc 67
    //   124: invokevirtual 34	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   127: aload_0
    //   128: invokevirtual 71	java/net/HttpURLConnection:getContentLength	()I
    //   131: invokevirtual 74	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   134: invokevirtual 40	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   137: invokevirtual 56	java/io/PrintStream:println	(Ljava/lang/String;)V
    //   140: aload_0
    //   141: invokevirtual 71	java/net/HttpURLConnection:getContentLength	()I
    //   144: i2l
    //   145: lstore 12
    //   147: aload_0
    //   148: invokevirtual 78	java/net/HttpURLConnection:getInputStream	()Ljava/io/InputStream;
    //   151: astore_2
    //   152: lconst_0
    //   153: lstore 8
    //   155: new 80	java/io/FileOutputStream
    //   158: dup
    //   159: aload_1
    //   160: invokespecial 83	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   163: astore 17
    //   165: sipush 3072
    //   168: newarray <illegal type>
    //   170: astore_1
    //   171: aload_0
    //   172: invokevirtual 86	java/net/HttpURLConnection:connect	()V
    //   175: aload_0
    //   176: invokevirtual 89	java/net/HttpURLConnection:getResponseCode	()I
    //   179: sipush 400
    //   182: if_icmplt +487 -> 669
    //   185: getstatic 46	java/lang/System:out	Ljava/io/PrintStream;
    //   188: ldc 91
    //   190: invokevirtual 56	java/io/PrintStream:println	(Ljava/lang/String;)V
    //   193: aload_0
    //   194: ifnull +7 -> 201
    //   197: aload_0
    //   198: invokevirtual 94	java/net/HttpURLConnection:disconnect	()V
    //   201: aload 17
    //   203: ifnull +8 -> 211
    //   206: aload 17
    //   208: invokevirtual 97	java/io/FileOutputStream:close	()V
    //   211: aload_2
    //   212: ifnull +7 -> 219
    //   215: aload_2
    //   216: invokevirtual 100	java/io/InputStream:close	()V
    //   219: iconst_0
    //   220: ireturn
    //   221: astore_0
    //   222: aload_0
    //   223: invokevirtual 103	java/io/IOException:printStackTrace	()V
    //   226: goto -15 -> 211
    //   229: astore_0
    //   230: aload_0
    //   231: invokevirtual 104	java/net/MalformedURLException:printStackTrace	()V
    //   234: invokestatic 110	android/os/Message:obtain	()Landroid/os/Message;
    //   237: astore_0
    //   238: aload_0
    //   239: iconst_0
    //   240: putfield 114	android/os/Message:what	I
    //   243: aload_0
    //   244: iload_3
    //   245: putfield 117	android/os/Message:arg1	I
    //   248: aload 4
    //   250: aload_0
    //   251: invokevirtual 123	android/os/Handler:sendMessage	(Landroid/os/Message;)Z
    //   254: pop
    //   255: iconst_0
    //   256: ireturn
    //   257: astore_0
    //   258: aload_0
    //   259: invokevirtual 103	java/io/IOException:printStackTrace	()V
    //   262: goto -43 -> 219
    //   265: aload 17
    //   267: aload_1
    //   268: iconst_0
    //   269: iload 5
    //   271: invokevirtual 127	java/io/FileOutputStream:write	([BII)V
    //   274: lload 8
    //   276: iload 5
    //   278: i2l
    //   279: ladd
    //   280: lstore 10
    //   282: ldc2_w 128
    //   285: lload 10
    //   287: lmul
    //   288: lload 12
    //   290: ldiv
    //   291: lstore 14
    //   293: lload 10
    //   295: lstore 8
    //   297: invokestatic 133	java/lang/System:currentTimeMillis	()J
    //   300: lload 6
    //   302: lsub
    //   303: ldc2_w 134
    //   306: lcmp
    //   307: ifle +47 -> 354
    //   310: invokestatic 133	java/lang/System:currentTimeMillis	()J
    //   313: lstore 6
    //   315: invokestatic 110	android/os/Message:obtain	()Landroid/os/Message;
    //   318: astore 16
    //   320: aload 16
    //   322: iconst_2
    //   323: putfield 114	android/os/Message:what	I
    //   326: aload 16
    //   328: lload 14
    //   330: invokestatic 141	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   333: putfield 145	android/os/Message:obj	Ljava/lang/Object;
    //   336: aload 16
    //   338: iload_3
    //   339: putfield 117	android/os/Message:arg1	I
    //   342: aload 4
    //   344: aload 16
    //   346: invokevirtual 123	android/os/Handler:sendMessage	(Landroid/os/Message;)Z
    //   349: pop
    //   350: lload 10
    //   352: lstore 8
    //   354: dconst_0
    //   355: ldc2_w 146
    //   358: dcmpg
    //   359: ifgt +19 -> 378
    //   362: aload_2
    //   363: ifnull +15 -> 378
    //   366: aload_2
    //   367: aload_1
    //   368: invokevirtual 151	java/io/InputStream:read	([B)I
    //   371: istore 5
    //   373: iload 5
    //   375: ifgt -110 -> 265
    //   378: aload_0
    //   379: invokevirtual 94	java/net/HttpURLConnection:disconnect	()V
    //   382: aload 17
    //   384: invokevirtual 97	java/io/FileOutputStream:close	()V
    //   387: aload_2
    //   388: invokevirtual 100	java/io/InputStream:close	()V
    //   391: aload_0
    //   392: ifnull +7 -> 399
    //   395: aload_0
    //   396: invokevirtual 94	java/net/HttpURLConnection:disconnect	()V
    //   399: aload 17
    //   401: ifnull +8 -> 409
    //   404: aload 17
    //   406: invokevirtual 97	java/io/FileOutputStream:close	()V
    //   409: aload_2
    //   410: ifnull +7 -> 417
    //   413: aload_2
    //   414: invokevirtual 100	java/io/InputStream:close	()V
    //   417: invokestatic 110	android/os/Message:obtain	()Landroid/os/Message;
    //   420: astore_0
    //   421: aload_0
    //   422: iconst_1
    //   423: putfield 114	android/os/Message:what	I
    //   426: aload_0
    //   427: iload_3
    //   428: putfield 117	android/os/Message:arg1	I
    //   431: aload 4
    //   433: aload_0
    //   434: invokevirtual 123	android/os/Handler:sendMessage	(Landroid/os/Message;)Z
    //   437: pop
    //   438: iconst_1
    //   439: ireturn
    //   440: astore_0
    //   441: aload_0
    //   442: invokevirtual 103	java/io/IOException:printStackTrace	()V
    //   445: goto -36 -> 409
    //   448: astore_0
    //   449: aload_0
    //   450: invokevirtual 103	java/io/IOException:printStackTrace	()V
    //   453: goto -36 -> 417
    //   456: astore_0
    //   457: aload 18
    //   459: astore 16
    //   461: aload 17
    //   463: astore_2
    //   464: aload 19
    //   466: astore_1
    //   467: aload_0
    //   468: invokevirtual 103	java/io/IOException:printStackTrace	()V
    //   471: aload_1
    //   472: ifnull +7 -> 479
    //   475: aload_1
    //   476: invokevirtual 94	java/net/HttpURLConnection:disconnect	()V
    //   479: aload 16
    //   481: ifnull +8 -> 489
    //   484: aload 16
    //   486: invokevirtual 97	java/io/FileOutputStream:close	()V
    //   489: aload_2
    //   490: ifnull -271 -> 219
    //   493: aload_2
    //   494: invokevirtual 100	java/io/InputStream:close	()V
    //   497: iconst_0
    //   498: ireturn
    //   499: astore_0
    //   500: aload_0
    //   501: invokevirtual 103	java/io/IOException:printStackTrace	()V
    //   504: iconst_0
    //   505: ireturn
    //   506: astore_0
    //   507: aload_0
    //   508: invokevirtual 103	java/io/IOException:printStackTrace	()V
    //   511: goto -22 -> 489
    //   514: aload_1
    //   515: ifnull +7 -> 522
    //   518: aload_1
    //   519: invokevirtual 94	java/net/HttpURLConnection:disconnect	()V
    //   522: aload_2
    //   523: ifnull +7 -> 530
    //   526: aload_2
    //   527: invokevirtual 97	java/io/FileOutputStream:close	()V
    //   530: aload 16
    //   532: ifnull +8 -> 540
    //   535: aload 16
    //   537: invokevirtual 100	java/io/InputStream:close	()V
    //   540: aload_0
    //   541: athrow
    //   542: astore_1
    //   543: aload_1
    //   544: invokevirtual 103	java/io/IOException:printStackTrace	()V
    //   547: goto -17 -> 530
    //   550: astore_1
    //   551: aload_1
    //   552: invokevirtual 103	java/io/IOException:printStackTrace	()V
    //   555: goto -15 -> 540
    //   558: astore 17
    //   560: aconst_null
    //   561: astore 16
    //   563: aconst_null
    //   564: astore_2
    //   565: aload_0
    //   566: astore_1
    //   567: aload 17
    //   569: astore_0
    //   570: goto -56 -> 514
    //   573: astore_1
    //   574: aconst_null
    //   575: astore 17
    //   577: aload_0
    //   578: astore 16
    //   580: aload_1
    //   581: astore_0
    //   582: aload 16
    //   584: astore_1
    //   585: aload_2
    //   586: astore 16
    //   588: aload 17
    //   590: astore_2
    //   591: goto -77 -> 514
    //   594: astore 16
    //   596: aload_0
    //   597: astore_1
    //   598: aload 16
    //   600: astore_0
    //   601: aload_2
    //   602: astore 16
    //   604: aload 17
    //   606: astore_2
    //   607: goto -93 -> 514
    //   610: astore_0
    //   611: aload 16
    //   613: astore 17
    //   615: aload_2
    //   616: astore 16
    //   618: aload 17
    //   620: astore_2
    //   621: goto -107 -> 514
    //   624: astore_2
    //   625: aload_0
    //   626: astore_1
    //   627: aload_2
    //   628: astore_0
    //   629: aload 17
    //   631: astore_2
    //   632: aload 18
    //   634: astore 16
    //   636: goto -169 -> 467
    //   639: astore_1
    //   640: aload_0
    //   641: astore 16
    //   643: aload_1
    //   644: astore_0
    //   645: aload 16
    //   647: astore_1
    //   648: aload 18
    //   650: astore 16
    //   652: goto -185 -> 467
    //   655: astore 18
    //   657: aload 17
    //   659: astore 16
    //   661: aload_0
    //   662: astore_1
    //   663: aload 18
    //   665: astore_0
    //   666: goto -199 -> 467
    //   669: lconst_0
    //   670: lstore 6
    //   672: goto -318 -> 354
    //   675: astore_0
    //   676: aconst_null
    //   677: astore 17
    //   679: aconst_null
    //   680: astore_2
    //   681: aload 16
    //   683: astore_1
    //   684: aload 17
    //   686: astore 16
    //   688: goto -174 -> 514
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	691	0	paramString1	String
    //   0	691	1	paramString2	String
    //   0	691	2	paramString3	String
    //   0	691	3	paramInt	int
    //   0	691	4	paramHandler	Handler
    //   269	105	5	i	int
    //   300	1	6	localObject1	Object
    //   313	358	6	l1	long
    //   153	200	8	l2	long
    //   280	71	10	l3	long
    //   145	144	12	l4	long
    //   291	38	14	l5	long
    //   7	580	16	localObject2	Object
    //   594	5	16	localObject3	Object
    //   602	85	16	localObject4	Object
    //   4	458	17	localFileOutputStream	java.io.FileOutputStream
    //   558	10	17	localObject5	Object
    //   575	110	17	localObject6	Object
    //   1	648	18	localObject7	Object
    //   655	9	18	localIOException	java.io.IOException
    //   10	455	19	localObject8	Object
    //   20	11	20	localFile	java.io.File
    // Exception table:
    //   from	to	target	type
    //   206	211	221	java/io/IOException
    //   95	104	229	java/net/MalformedURLException
    //   197	201	229	java/net/MalformedURLException
    //   206	211	229	java/net/MalformedURLException
    //   215	219	229	java/net/MalformedURLException
    //   222	226	229	java/net/MalformedURLException
    //   258	262	229	java/net/MalformedURLException
    //   395	399	229	java/net/MalformedURLException
    //   404	409	229	java/net/MalformedURLException
    //   413	417	229	java/net/MalformedURLException
    //   441	445	229	java/net/MalformedURLException
    //   449	453	229	java/net/MalformedURLException
    //   475	479	229	java/net/MalformedURLException
    //   484	489	229	java/net/MalformedURLException
    //   493	497	229	java/net/MalformedURLException
    //   500	504	229	java/net/MalformedURLException
    //   507	511	229	java/net/MalformedURLException
    //   518	522	229	java/net/MalformedURLException
    //   526	530	229	java/net/MalformedURLException
    //   535	540	229	java/net/MalformedURLException
    //   540	542	229	java/net/MalformedURLException
    //   543	547	229	java/net/MalformedURLException
    //   551	555	229	java/net/MalformedURLException
    //   215	219	257	java/io/IOException
    //   404	409	440	java/io/IOException
    //   413	417	448	java/io/IOException
    //   104	112	456	java/io/IOException
    //   493	497	499	java/io/IOException
    //   484	489	506	java/io/IOException
    //   526	530	542	java/io/IOException
    //   535	540	550	java/io/IOException
    //   112	152	558	finally
    //   155	165	573	finally
    //   165	193	594	finally
    //   265	274	594	finally
    //   282	293	594	finally
    //   297	350	594	finally
    //   366	373	594	finally
    //   378	391	594	finally
    //   467	471	610	finally
    //   112	152	624	java/io/IOException
    //   155	165	639	java/io/IOException
    //   165	193	655	java/io/IOException
    //   265	274	655	java/io/IOException
    //   282	293	655	java/io/IOException
    //   297	350	655	java/io/IOException
    //   366	373	655	java/io/IOException
    //   378	391	655	java/io/IOException
    //   104	112	675	finally
  }
  
  public static int a(String paramString1, String paramString2, String paramString3, Handler paramHandler)
  {
    return a(paramString1, paramString2, paramString3, 0, paramHandler);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/utils/ab.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */