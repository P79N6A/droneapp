package it.a.a.c;

import it.a.a.r;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.regex.Pattern;

public class e
  implements r
{
  private static final Pattern a = Pattern.compile("^([dl\\-])[r\\-][w\\-][xSs\\-][r\\-][w\\-][xSs\\-][r\\-][w\\-][xTt\\-]\\s+(?:\\d+\\s+)?\\S+\\s*\\S+\\s+(\\d+)\\s+(?:(\\w{3})\\s+(\\d{1,2}))\\s+(?:(\\d{4})|(?:(\\d{1,2}):(\\d{1,2})))\\s+([^\\\\*?\"<>|]+)(?: -> ([^\\\\*?\"<>|]+))?$");
  private static final DateFormat b = new SimpleDateFormat("MMM dd yyyy HH:mm", Locale.US);
  
  /* Error */
  public it.a.a.n[] a(String[] paramArrayOfString)
  {
    // Byte code:
    //   0: aload_1
    //   1: arraylength
    //   2: istore_3
    //   3: iload_3
    //   4: ifne +8 -> 12
    //   7: iconst_0
    //   8: anewarray 48	it/a/a/n
    //   11: areturn
    //   12: iload_3
    //   13: istore_2
    //   14: aload_1
    //   15: astore 8
    //   17: aload_1
    //   18: iconst_0
    //   19: aaload
    //   20: ldc 50
    //   22: invokevirtual 56	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   25: ifeq +38 -> 63
    //   28: iload_3
    //   29: iconst_1
    //   30: isub
    //   31: istore_3
    //   32: iload_3
    //   33: anewarray 52	java/lang/String
    //   36: astore 8
    //   38: iconst_0
    //   39: istore_2
    //   40: iload_2
    //   41: iload_3
    //   42: if_icmpge +19 -> 61
    //   45: aload 8
    //   47: iload_2
    //   48: aload_1
    //   49: iload_2
    //   50: iconst_1
    //   51: iadd
    //   52: aaload
    //   53: aastore
    //   54: iload_2
    //   55: iconst_1
    //   56: iadd
    //   57: istore_2
    //   58: goto -18 -> 40
    //   61: iload_3
    //   62: istore_2
    //   63: invokestatic 62	java/util/Calendar:getInstance	()Ljava/util/Calendar;
    //   66: astore 12
    //   68: aload 12
    //   70: iconst_1
    //   71: invokevirtual 66	java/util/Calendar:get	(I)I
    //   74: istore 5
    //   76: iload_2
    //   77: anewarray 48	it/a/a/n
    //   80: astore 13
    //   82: iconst_0
    //   83: istore_3
    //   84: iload_3
    //   85: iload_2
    //   86: if_icmpge +561 -> 647
    //   89: getstatic 22	it/a/a/c/e:a	Ljava/util/regex/Pattern;
    //   92: aload 8
    //   94: iload_3
    //   95: aaload
    //   96: invokevirtual 70	java/util/regex/Pattern:matcher	(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
    //   99: astore 18
    //   101: aload 18
    //   103: invokevirtual 76	java/util/regex/Matcher:matches	()Z
    //   106: ifeq +533 -> 639
    //   109: aload 13
    //   111: iload_3
    //   112: new 48	it/a/a/n
    //   115: dup
    //   116: invokespecial 77	it/a/a/n:<init>	()V
    //   119: aastore
    //   120: aload 18
    //   122: iconst_1
    //   123: invokevirtual 81	java/util/regex/Matcher:group	(I)Ljava/lang/String;
    //   126: astore_1
    //   127: aload 18
    //   129: iconst_2
    //   130: invokevirtual 81	java/util/regex/Matcher:group	(I)Ljava/lang/String;
    //   133: astore 17
    //   135: aload 18
    //   137: iconst_3
    //   138: invokevirtual 81	java/util/regex/Matcher:group	(I)Ljava/lang/String;
    //   141: astore 15
    //   143: aload 18
    //   145: iconst_4
    //   146: invokevirtual 81	java/util/regex/Matcher:group	(I)Ljava/lang/String;
    //   149: astore 11
    //   151: aload 18
    //   153: iconst_5
    //   154: invokevirtual 81	java/util/regex/Matcher:group	(I)Ljava/lang/String;
    //   157: astore 16
    //   159: aload 18
    //   161: bipush 6
    //   163: invokevirtual 81	java/util/regex/Matcher:group	(I)Ljava/lang/String;
    //   166: astore 9
    //   168: aload 18
    //   170: bipush 7
    //   172: invokevirtual 81	java/util/regex/Matcher:group	(I)Ljava/lang/String;
    //   175: astore 10
    //   177: aload 18
    //   179: bipush 8
    //   181: invokevirtual 81	java/util/regex/Matcher:group	(I)Ljava/lang/String;
    //   184: astore 14
    //   186: aload 18
    //   188: bipush 9
    //   190: invokevirtual 81	java/util/regex/Matcher:group	(I)Ljava/lang/String;
    //   193: astore 18
    //   195: aload_1
    //   196: ldc 83
    //   198: invokevirtual 87	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   201: ifeq +332 -> 533
    //   204: aload 13
    //   206: iload_3
    //   207: aaload
    //   208: iconst_0
    //   209: invokevirtual 90	it/a/a/n:a	(I)V
    //   212: aload 17
    //   214: invokestatic 96	java/lang/Long:parseLong	(Ljava/lang/String;)J
    //   217: lstore 6
    //   219: aload 13
    //   221: iload_3
    //   222: aaload
    //   223: lload 6
    //   225: invokevirtual 99	it/a/a/n:a	(J)V
    //   228: aload 11
    //   230: astore_1
    //   231: aload 11
    //   233: invokevirtual 103	java/lang/String:length	()I
    //   236: iconst_1
    //   237: if_icmpne +24 -> 261
    //   240: new 105	java/lang/StringBuffer
    //   243: dup
    //   244: invokespecial 106	java/lang/StringBuffer:<init>	()V
    //   247: ldc 108
    //   249: invokevirtual 112	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   252: aload 11
    //   254: invokevirtual 112	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   257: invokevirtual 116	java/lang/StringBuffer:toString	()Ljava/lang/String;
    //   260: astore_1
    //   261: new 105	java/lang/StringBuffer
    //   264: dup
    //   265: invokespecial 106	java/lang/StringBuffer:<init>	()V
    //   268: astore 11
    //   270: aload 11
    //   272: aload 15
    //   274: invokevirtual 112	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   277: pop
    //   278: aload 11
    //   280: bipush 32
    //   282: invokevirtual 119	java/lang/StringBuffer:append	(C)Ljava/lang/StringBuffer;
    //   285: pop
    //   286: aload 11
    //   288: aload_1
    //   289: invokevirtual 112	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   292: pop
    //   293: aload 11
    //   295: bipush 32
    //   297: invokevirtual 119	java/lang/StringBuffer:append	(C)Ljava/lang/StringBuffer;
    //   300: pop
    //   301: aload 16
    //   303: ifnonnull +296 -> 599
    //   306: aload 11
    //   308: iload 5
    //   310: invokevirtual 122	java/lang/StringBuffer:append	(I)Ljava/lang/StringBuffer;
    //   313: pop
    //   314: iconst_1
    //   315: istore 4
    //   317: aload 11
    //   319: bipush 32
    //   321: invokevirtual 119	java/lang/StringBuffer:append	(C)Ljava/lang/StringBuffer;
    //   324: pop
    //   325: aload 9
    //   327: ifnull +286 -> 613
    //   330: aload 10
    //   332: ifnull +281 -> 613
    //   335: aload 9
    //   337: astore_1
    //   338: aload 9
    //   340: invokevirtual 103	java/lang/String:length	()I
    //   343: iconst_1
    //   344: if_icmpne +24 -> 368
    //   347: new 105	java/lang/StringBuffer
    //   350: dup
    //   351: invokespecial 106	java/lang/StringBuffer:<init>	()V
    //   354: ldc 108
    //   356: invokevirtual 112	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   359: aload 9
    //   361: invokevirtual 112	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   364: invokevirtual 116	java/lang/StringBuffer:toString	()Ljava/lang/String;
    //   367: astore_1
    //   368: aload 10
    //   370: astore 9
    //   372: aload 10
    //   374: invokevirtual 103	java/lang/String:length	()I
    //   377: iconst_1
    //   378: if_icmpne +25 -> 403
    //   381: new 105	java/lang/StringBuffer
    //   384: dup
    //   385: invokespecial 106	java/lang/StringBuffer:<init>	()V
    //   388: ldc 108
    //   390: invokevirtual 112	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   393: aload 10
    //   395: invokevirtual 112	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   398: invokevirtual 116	java/lang/StringBuffer:toString	()Ljava/lang/String;
    //   401: astore 9
    //   403: aload 11
    //   405: aload_1
    //   406: invokevirtual 112	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   409: pop
    //   410: aload 11
    //   412: bipush 58
    //   414: invokevirtual 119	java/lang/StringBuffer:append	(C)Ljava/lang/StringBuffer;
    //   417: pop
    //   418: aload 11
    //   420: aload 9
    //   422: invokevirtual 112	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   425: pop
    //   426: getstatic 38	it/a/a/c/e:b	Ljava/text/DateFormat;
    //   429: astore 9
    //   431: aload 9
    //   433: monitorenter
    //   434: getstatic 38	it/a/a/c/e:b	Ljava/text/DateFormat;
    //   437: aload 11
    //   439: invokevirtual 116	java/lang/StringBuffer:toString	()Ljava/lang/String;
    //   442: invokevirtual 128	java/text/DateFormat:parse	(Ljava/lang/String;)Ljava/util/Date;
    //   445: astore_1
    //   446: aload 9
    //   448: monitorexit
    //   449: iload 4
    //   451: ifeq +199 -> 650
    //   454: invokestatic 62	java/util/Calendar:getInstance	()Ljava/util/Calendar;
    //   457: astore 9
    //   459: aload 9
    //   461: aload_1
    //   462: invokevirtual 132	java/util/Calendar:setTime	(Ljava/util/Date;)V
    //   465: aload 9
    //   467: aload 12
    //   469: invokevirtual 135	java/util/Calendar:after	(Ljava/lang/Object;)Z
    //   472: ifeq +178 -> 650
    //   475: aload 9
    //   477: invokevirtual 139	java/util/Calendar:getTimeInMillis	()J
    //   480: aload 12
    //   482: invokevirtual 139	java/util/Calendar:getTimeInMillis	()J
    //   485: lsub
    //   486: ldc2_w 140
    //   489: lcmp
    //   490: ifle +160 -> 650
    //   493: aload 9
    //   495: iconst_1
    //   496: iload 5
    //   498: iconst_1
    //   499: isub
    //   500: invokevirtual 145	java/util/Calendar:set	(II)V
    //   503: aload 9
    //   505: invokevirtual 149	java/util/Calendar:getTime	()Ljava/util/Date;
    //   508: astore_1
    //   509: aload 13
    //   511: iload_3
    //   512: aaload
    //   513: aload_1
    //   514: invokevirtual 151	it/a/a/n:a	(Ljava/util/Date;)V
    //   517: aload 13
    //   519: iload_3
    //   520: aaload
    //   521: aload 14
    //   523: invokevirtual 154	it/a/a/n:a	(Ljava/lang/String;)V
    //   526: iload_3
    //   527: iconst_1
    //   528: iadd
    //   529: istore_3
    //   530: goto -446 -> 84
    //   533: aload_1
    //   534: ldc -100
    //   536: invokevirtual 87	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   539: ifeq +14 -> 553
    //   542: aload 13
    //   544: iload_3
    //   545: aaload
    //   546: iconst_1
    //   547: invokevirtual 90	it/a/a/n:a	(I)V
    //   550: goto -338 -> 212
    //   553: aload_1
    //   554: ldc -98
    //   556: invokevirtual 87	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   559: ifeq +23 -> 582
    //   562: aload 13
    //   564: iload_3
    //   565: aaload
    //   566: iconst_2
    //   567: invokevirtual 90	it/a/a/n:a	(I)V
    //   570: aload 13
    //   572: iload_3
    //   573: aaload
    //   574: aload 18
    //   576: invokevirtual 160	it/a/a/n:b	(Ljava/lang/String;)V
    //   579: goto -367 -> 212
    //   582: new 162	it/a/a/q
    //   585: dup
    //   586: invokespecial 163	it/a/a/q:<init>	()V
    //   589: athrow
    //   590: astore_1
    //   591: new 162	it/a/a/q
    //   594: dup
    //   595: invokespecial 163	it/a/a/q:<init>	()V
    //   598: athrow
    //   599: aload 11
    //   601: aload 16
    //   603: invokevirtual 112	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   606: pop
    //   607: iconst_0
    //   608: istore 4
    //   610: goto -293 -> 317
    //   613: aload 11
    //   615: ldc -91
    //   617: invokevirtual 112	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   620: pop
    //   621: goto -195 -> 426
    //   624: astore_1
    //   625: aload 9
    //   627: monitorexit
    //   628: aload_1
    //   629: athrow
    //   630: astore_1
    //   631: new 162	it/a/a/q
    //   634: dup
    //   635: invokespecial 163	it/a/a/q:<init>	()V
    //   638: athrow
    //   639: new 162	it/a/a/q
    //   642: dup
    //   643: invokespecial 163	it/a/a/q:<init>	()V
    //   646: athrow
    //   647: aload 13
    //   649: areturn
    //   650: goto -141 -> 509
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	653	0	this	e
    //   0	653	1	paramArrayOfString	String[]
    //   13	74	2	i	int
    //   2	571	3	j	int
    //   315	294	4	k	int
    //   74	426	5	m	int
    //   217	7	6	l	long
    //   15	78	8	arrayOfString	String[]
    //   175	219	10	str1	String
    //   149	465	11	localObject2	Object
    //   66	415	12	localCalendar	java.util.Calendar
    //   80	568	13	arrayOfn	it.a.a.n[]
    //   184	338	14	str2	String
    //   141	132	15	str3	String
    //   157	445	16	str4	String
    //   133	80	17	str5	String
    //   99	476	18	localObject3	Object
    // Exception table:
    //   from	to	target	type
    //   212	219	590	java/lang/Throwable
    //   434	449	624	finally
    //   625	628	624	finally
    //   426	434	630	java/text/ParseException
    //   628	630	630	java/text/ParseException
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/it/a/a/c/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */