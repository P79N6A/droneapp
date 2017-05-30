package it.a.a.c;

import it.a.a.n;
import it.a.a.r;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class c
  implements r
{
  private static final DateFormat a = new SimpleDateFormat("yyyyMMddhhmmss.SSS Z");
  private static final DateFormat b = new SimpleDateFormat("yyyyMMddhhmmss Z");
  
  /* Error */
  private n a(String paramString)
  {
    // Byte code:
    //   0: lconst_0
    //   1: lstore 7
    //   3: aconst_null
    //   4: astore 9
    //   6: aconst_null
    //   7: astore 10
    //   9: aconst_null
    //   10: astore 11
    //   12: new 35	java/util/ArrayList
    //   15: dup
    //   16: invokespecial 36	java/util/ArrayList:<init>	()V
    //   19: astore 14
    //   21: new 38	java/util/StringTokenizer
    //   24: dup
    //   25: aload_1
    //   26: ldc 40
    //   28: invokespecial 43	java/util/StringTokenizer:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   31: astore_1
    //   32: aload_1
    //   33: invokevirtual 47	java/util/StringTokenizer:hasMoreElements	()Z
    //   36: ifeq +31 -> 67
    //   39: aload_1
    //   40: invokevirtual 51	java/util/StringTokenizer:nextToken	()Ljava/lang/String;
    //   43: invokevirtual 56	java/lang/String:trim	()Ljava/lang/String;
    //   46: astore 12
    //   48: aload 12
    //   50: invokevirtual 60	java/lang/String:length	()I
    //   53: ifle -21 -> 32
    //   56: aload 14
    //   58: aload 12
    //   60: invokevirtual 64	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   63: pop
    //   64: goto -32 -> 32
    //   67: aload 14
    //   69: invokevirtual 67	java/util/ArrayList:size	()I
    //   72: ifne +11 -> 83
    //   75: new 69	it/a/a/q
    //   78: dup
    //   79: invokespecial 70	it/a/a/q:<init>	()V
    //   82: athrow
    //   83: aload 14
    //   85: aload 14
    //   87: invokevirtual 67	java/util/ArrayList:size	()I
    //   90: iconst_1
    //   91: isub
    //   92: invokevirtual 74	java/util/ArrayList:remove	(I)Ljava/lang/Object;
    //   95: checkcast 53	java/lang/String
    //   98: astore 12
    //   100: new 76	java/util/Properties
    //   103: dup
    //   104: invokespecial 77	java/util/Properties:<init>	()V
    //   107: astore 13
    //   109: aload 14
    //   111: invokevirtual 81	java/util/ArrayList:iterator	()Ljava/util/Iterator;
    //   114: astore_1
    //   115: aload_1
    //   116: invokeinterface 86 1 0
    //   121: ifeq +102 -> 223
    //   124: aload_1
    //   125: invokeinterface 90 1 0
    //   130: checkcast 53	java/lang/String
    //   133: astore 15
    //   135: aload 15
    //   137: bipush 61
    //   139: invokevirtual 94	java/lang/String:indexOf	(I)I
    //   142: istore_2
    //   143: iload_2
    //   144: iconst_m1
    //   145: if_icmpne +11 -> 156
    //   148: new 69	it/a/a/q
    //   151: dup
    //   152: invokespecial 70	it/a/a/q:<init>	()V
    //   155: athrow
    //   156: aload 15
    //   158: iconst_0
    //   159: iload_2
    //   160: invokevirtual 98	java/lang/String:substring	(II)Ljava/lang/String;
    //   163: invokevirtual 56	java/lang/String:trim	()Ljava/lang/String;
    //   166: astore 14
    //   168: aload 15
    //   170: iload_2
    //   171: iconst_1
    //   172: iadd
    //   173: aload 15
    //   175: invokevirtual 60	java/lang/String:length	()I
    //   178: invokevirtual 98	java/lang/String:substring	(II)Ljava/lang/String;
    //   181: invokevirtual 56	java/lang/String:trim	()Ljava/lang/String;
    //   184: astore 15
    //   186: aload 14
    //   188: invokevirtual 60	java/lang/String:length	()I
    //   191: ifeq +11 -> 202
    //   194: aload 15
    //   196: invokevirtual 60	java/lang/String:length	()I
    //   199: ifne +11 -> 210
    //   202: new 69	it/a/a/q
    //   205: dup
    //   206: invokespecial 70	it/a/a/q:<init>	()V
    //   209: athrow
    //   210: aload 13
    //   212: aload 14
    //   214: aload 15
    //   216: invokevirtual 102	java/util/Properties:setProperty	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;
    //   219: pop
    //   220: goto -105 -> 115
    //   223: aload 13
    //   225: ldc 104
    //   227: invokevirtual 108	java/util/Properties:getProperty	(Ljava/lang/String;)Ljava/lang/String;
    //   230: astore 14
    //   232: aload 14
    //   234: ifnonnull +11 -> 245
    //   237: new 69	it/a/a/q
    //   240: dup
    //   241: invokespecial 70	it/a/a/q:<init>	()V
    //   244: athrow
    //   245: ldc 110
    //   247: aload 14
    //   249: invokevirtual 114	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   252: ifeq +149 -> 401
    //   255: iconst_0
    //   256: istore_3
    //   257: aload 13
    //   259: ldc 116
    //   261: invokevirtual 108	java/util/Properties:getProperty	(Ljava/lang/String;)Ljava/lang/String;
    //   264: astore_1
    //   265: aload_1
    //   266: ifnull +294 -> 560
    //   269: new 118	java/lang/StringBuffer
    //   272: dup
    //   273: invokespecial 119	java/lang/StringBuffer:<init>	()V
    //   276: aload_1
    //   277: invokevirtual 123	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   280: ldc 125
    //   282: invokevirtual 123	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   285: invokevirtual 128	java/lang/StringBuffer:toString	()Ljava/lang/String;
    //   288: astore 11
    //   290: iload_3
    //   291: istore_2
    //   292: aload 10
    //   294: astore_1
    //   295: getstatic 21	it/a/a/c/c:a	Ljava/text/DateFormat;
    //   298: astore 14
    //   300: iload_3
    //   301: istore_2
    //   302: aload 10
    //   304: astore_1
    //   305: aload 14
    //   307: monitorenter
    //   308: iload_3
    //   309: istore 4
    //   311: getstatic 21	it/a/a/c/c:a	Ljava/text/DateFormat;
    //   314: aload 11
    //   316: invokevirtual 134	java/text/DateFormat:parse	(Ljava/lang/String;)Ljava/util/Date;
    //   319: astore_1
    //   320: aload 14
    //   322: monitorexit
    //   323: iload_3
    //   324: istore_2
    //   325: aload 13
    //   327: ldc -121
    //   329: invokevirtual 108	java/util/Properties:getProperty	(Ljava/lang/String;)Ljava/lang/String;
    //   332: astore 9
    //   334: lload 7
    //   336: lstore 5
    //   338: aload 9
    //   340: ifnull +21 -> 361
    //   343: aload 9
    //   345: invokestatic 141	java/lang/Long:parseLong	(Ljava/lang/String;)J
    //   348: lstore 5
    //   350: lload 5
    //   352: lconst_0
    //   353: lcmp
    //   354: ifge +203 -> 557
    //   357: lload 7
    //   359: lstore 5
    //   361: new 143	it/a/a/n
    //   364: dup
    //   365: invokespecial 144	it/a/a/n:<init>	()V
    //   368: astore 9
    //   370: aload 9
    //   372: iload_2
    //   373: invokevirtual 147	it/a/a/n:a	(I)V
    //   376: aload 9
    //   378: aload_1
    //   379: invokevirtual 150	it/a/a/n:a	(Ljava/util/Date;)V
    //   382: aload 9
    //   384: lload 5
    //   386: invokevirtual 153	it/a/a/n:a	(J)V
    //   389: aload 9
    //   391: aload 12
    //   393: invokevirtual 155	it/a/a/n:a	(Ljava/lang/String;)V
    //   396: aload 9
    //   398: astore_1
    //   399: aload_1
    //   400: areturn
    //   401: ldc -99
    //   403: aload 14
    //   405: invokevirtual 114	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   408: ifeq +8 -> 416
    //   411: iconst_1
    //   412: istore_3
    //   413: goto -156 -> 257
    //   416: aload 11
    //   418: astore_1
    //   419: ldc -97
    //   421: aload 14
    //   423: invokevirtual 114	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   426: ifne -27 -> 399
    //   429: aload 11
    //   431: astore_1
    //   432: ldc -95
    //   434: aload 14
    //   436: invokevirtual 114	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   439: ifeq -40 -> 399
    //   442: aconst_null
    //   443: areturn
    //   444: astore 10
    //   446: aload 9
    //   448: astore_1
    //   449: iload 4
    //   451: istore_2
    //   452: iload_2
    //   453: istore 4
    //   455: aload_1
    //   456: astore 9
    //   458: aload 14
    //   460: monitorexit
    //   461: aload 10
    //   463: athrow
    //   464: astore 9
    //   466: iload_2
    //   467: istore_3
    //   468: aload_1
    //   469: astore 9
    //   471: getstatic 25	it/a/a/c/c:b	Ljava/text/DateFormat;
    //   474: astore 14
    //   476: iload_2
    //   477: istore_3
    //   478: aload_1
    //   479: astore 9
    //   481: aload 14
    //   483: monitorenter
    //   484: iload_2
    //   485: istore_3
    //   486: getstatic 25	it/a/a/c/c:b	Ljava/text/DateFormat;
    //   489: aload 11
    //   491: invokevirtual 134	java/text/DateFormat:parse	(Ljava/lang/String;)Ljava/util/Date;
    //   494: astore 9
    //   496: aload 9
    //   498: astore_1
    //   499: aload 14
    //   501: monitorexit
    //   502: goto -177 -> 325
    //   505: astore 10
    //   507: aload_1
    //   508: astore 9
    //   510: iload_2
    //   511: istore_3
    //   512: aload 9
    //   514: astore_1
    //   515: aload 14
    //   517: monitorexit
    //   518: iload_2
    //   519: istore_3
    //   520: aload 10
    //   522: athrow
    //   523: astore_1
    //   524: aload 9
    //   526: astore_1
    //   527: iload_3
    //   528: istore_2
    //   529: goto -204 -> 325
    //   532: astore 9
    //   534: lconst_0
    //   535: lstore 5
    //   537: goto -187 -> 350
    //   540: astore 10
    //   542: iload_3
    //   543: istore_2
    //   544: aload_1
    //   545: astore 9
    //   547: goto -37 -> 510
    //   550: astore 10
    //   552: iload_3
    //   553: istore_2
    //   554: goto -102 -> 452
    //   557: goto -196 -> 361
    //   560: aconst_null
    //   561: astore_1
    //   562: iload_3
    //   563: istore_2
    //   564: goto -239 -> 325
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	567	0	this	c
    //   0	567	1	paramString	String
    //   142	422	2	i	int
    //   256	307	3	j	int
    //   309	145	4	k	int
    //   336	200	5	l1	long
    //   1	357	7	l2	long
    //   4	453	9	localObject1	Object
    //   464	1	9	localParseException	java.text.ParseException
    //   469	56	9	localObject2	Object
    //   532	1	9	localNumberFormatException	NumberFormatException
    //   545	1	9	str1	String
    //   7	296	10	localObject3	Object
    //   444	18	10	localObject4	Object
    //   505	16	10	localObject5	Object
    //   540	1	10	localObject6	Object
    //   550	1	10	localObject7	Object
    //   10	480	11	str2	String
    //   46	346	12	str3	String
    //   107	219	13	localProperties	java.util.Properties
    //   19	497	14	localObject8	Object
    //   133	82	15	str4	String
    // Exception table:
    //   from	to	target	type
    //   311	320	444	finally
    //   458	461	444	finally
    //   295	300	464	java/text/ParseException
    //   305	308	464	java/text/ParseException
    //   461	464	464	java/text/ParseException
    //   499	502	505	finally
    //   471	476	523	java/text/ParseException
    //   481	484	523	java/text/ParseException
    //   520	523	523	java/text/ParseException
    //   343	350	532	java/lang/NumberFormatException
    //   486	496	540	finally
    //   515	518	540	finally
    //   320	323	550	finally
  }
  
  public n[] a(String[] paramArrayOfString)
  {
    int j = 0;
    ArrayList localArrayList = new ArrayList();
    int i = 0;
    while (i < paramArrayOfString.length)
    {
      n localn = a(paramArrayOfString[i]);
      if (localn != null) {
        localArrayList.add(localn);
      }
      i += 1;
    }
    int k = localArrayList.size();
    paramArrayOfString = new n[k];
    i = j;
    while (i < k)
    {
      paramArrayOfString[i] = ((n)localArrayList.get(i));
      i += 1;
    }
    return paramArrayOfString;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/it/a/a/c/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */