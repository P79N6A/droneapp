package it.a.a.c;

import it.a.a.r;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.regex.Pattern;

public class d
  implements r
{
  private static final Pattern a = Pattern.compile("^(d|-)\\s+\\[.{8}\\]\\s+\\S+\\s+(\\d+)\\s+(?:(\\w{3})\\s+(\\d{1,2}))\\s+(?:(\\d{4})|(?:(\\d{1,2}):(\\d{1,2})))\\s+([^\\\\/*?\"<>|]+)$");
  private static final DateFormat b = new SimpleDateFormat("MMM dd yyyy HH:mm", Locale.US);
  
  /* Error */
  public it.a.a.n[] a(String[] paramArrayOfString)
  {
    // Byte code:
    //   0: aload_1
    //   1: arraylength
    //   2: istore 4
    //   4: invokestatic 52	java/util/Calendar:getInstance	()Ljava/util/Calendar;
    //   7: astore 12
    //   9: aload 12
    //   11: iconst_1
    //   12: invokevirtual 56	java/util/Calendar:get	(I)I
    //   15: istore 5
    //   17: iload 4
    //   19: anewarray 58	it/a/a/n
    //   22: astore 13
    //   24: iconst_0
    //   25: istore_2
    //   26: iload_2
    //   27: iload 4
    //   29: if_icmpge +532 -> 561
    //   32: getstatic 22	it/a/a/c/d:a	Ljava/util/regex/Pattern;
    //   35: aload_1
    //   36: iload_2
    //   37: aaload
    //   38: invokevirtual 62	java/util/regex/Pattern:matcher	(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
    //   41: astore 14
    //   43: aload 14
    //   45: invokevirtual 68	java/util/regex/Matcher:matches	()Z
    //   48: ifeq +505 -> 553
    //   51: aload 14
    //   53: iconst_1
    //   54: invokevirtual 72	java/util/regex/Matcher:group	(I)Ljava/lang/String;
    //   57: astore 8
    //   59: aload 14
    //   61: iconst_2
    //   62: invokevirtual 72	java/util/regex/Matcher:group	(I)Ljava/lang/String;
    //   65: astore 17
    //   67: aload 14
    //   69: iconst_3
    //   70: invokevirtual 72	java/util/regex/Matcher:group	(I)Ljava/lang/String;
    //   73: astore 15
    //   75: aload 14
    //   77: iconst_4
    //   78: invokevirtual 72	java/util/regex/Matcher:group	(I)Ljava/lang/String;
    //   81: astore 11
    //   83: aload 14
    //   85: iconst_5
    //   86: invokevirtual 72	java/util/regex/Matcher:group	(I)Ljava/lang/String;
    //   89: astore 16
    //   91: aload 14
    //   93: bipush 6
    //   95: invokevirtual 72	java/util/regex/Matcher:group	(I)Ljava/lang/String;
    //   98: astore 9
    //   100: aload 14
    //   102: bipush 7
    //   104: invokevirtual 72	java/util/regex/Matcher:group	(I)Ljava/lang/String;
    //   107: astore 10
    //   109: aload 14
    //   111: bipush 8
    //   113: invokevirtual 72	java/util/regex/Matcher:group	(I)Ljava/lang/String;
    //   116: astore 14
    //   118: aload 13
    //   120: iload_2
    //   121: new 58	it/a/a/n
    //   124: dup
    //   125: invokespecial 73	it/a/a/n:<init>	()V
    //   128: aastore
    //   129: aload 8
    //   131: ldc 75
    //   133: invokevirtual 81	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   136: ifeq +340 -> 476
    //   139: aload 13
    //   141: iload_2
    //   142: aaload
    //   143: iconst_0
    //   144: invokevirtual 84	it/a/a/n:a	(I)V
    //   147: aload 17
    //   149: invokestatic 90	java/lang/Long:parseLong	(Ljava/lang/String;)J
    //   152: lstore 6
    //   154: aload 13
    //   156: iload_2
    //   157: aaload
    //   158: lload 6
    //   160: invokevirtual 93	it/a/a/n:a	(J)V
    //   163: aload 11
    //   165: astore 8
    //   167: aload 11
    //   169: invokevirtual 97	java/lang/String:length	()I
    //   172: iconst_1
    //   173: if_icmpne +25 -> 198
    //   176: new 99	java/lang/StringBuffer
    //   179: dup
    //   180: invokespecial 100	java/lang/StringBuffer:<init>	()V
    //   183: ldc 102
    //   185: invokevirtual 106	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   188: aload 11
    //   190: invokevirtual 106	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   193: invokevirtual 110	java/lang/StringBuffer:toString	()Ljava/lang/String;
    //   196: astore 8
    //   198: new 99	java/lang/StringBuffer
    //   201: dup
    //   202: invokespecial 100	java/lang/StringBuffer:<init>	()V
    //   205: astore 11
    //   207: aload 11
    //   209: aload 15
    //   211: invokevirtual 106	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   214: pop
    //   215: aload 11
    //   217: bipush 32
    //   219: invokevirtual 113	java/lang/StringBuffer:append	(C)Ljava/lang/StringBuffer;
    //   222: pop
    //   223: aload 11
    //   225: aload 8
    //   227: invokevirtual 106	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   230: pop
    //   231: aload 11
    //   233: bipush 32
    //   235: invokevirtual 113	java/lang/StringBuffer:append	(C)Ljava/lang/StringBuffer;
    //   238: pop
    //   239: aload 16
    //   241: ifnonnull +273 -> 514
    //   244: aload 11
    //   246: iload 5
    //   248: invokevirtual 116	java/lang/StringBuffer:append	(I)Ljava/lang/StringBuffer;
    //   251: pop
    //   252: iconst_1
    //   253: istore_3
    //   254: aload 11
    //   256: bipush 32
    //   258: invokevirtual 113	java/lang/StringBuffer:append	(C)Ljava/lang/StringBuffer;
    //   261: pop
    //   262: aload 9
    //   264: ifnull +263 -> 527
    //   267: aload 10
    //   269: ifnull +258 -> 527
    //   272: aload 9
    //   274: astore 8
    //   276: aload 9
    //   278: invokevirtual 97	java/lang/String:length	()I
    //   281: iconst_1
    //   282: if_icmpne +25 -> 307
    //   285: new 99	java/lang/StringBuffer
    //   288: dup
    //   289: invokespecial 100	java/lang/StringBuffer:<init>	()V
    //   292: ldc 102
    //   294: invokevirtual 106	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   297: aload 9
    //   299: invokevirtual 106	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   302: invokevirtual 110	java/lang/StringBuffer:toString	()Ljava/lang/String;
    //   305: astore 8
    //   307: aload 10
    //   309: astore 9
    //   311: aload 10
    //   313: invokevirtual 97	java/lang/String:length	()I
    //   316: iconst_1
    //   317: if_icmpne +25 -> 342
    //   320: new 99	java/lang/StringBuffer
    //   323: dup
    //   324: invokespecial 100	java/lang/StringBuffer:<init>	()V
    //   327: ldc 102
    //   329: invokevirtual 106	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   332: aload 10
    //   334: invokevirtual 106	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   337: invokevirtual 110	java/lang/StringBuffer:toString	()Ljava/lang/String;
    //   340: astore 9
    //   342: aload 11
    //   344: aload 8
    //   346: invokevirtual 106	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   349: pop
    //   350: aload 11
    //   352: bipush 58
    //   354: invokevirtual 113	java/lang/StringBuffer:append	(C)Ljava/lang/StringBuffer;
    //   357: pop
    //   358: aload 11
    //   360: aload 9
    //   362: invokevirtual 106	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   365: pop
    //   366: getstatic 38	it/a/a/c/d:b	Ljava/text/DateFormat;
    //   369: astore 9
    //   371: aload 9
    //   373: monitorenter
    //   374: getstatic 38	it/a/a/c/d:b	Ljava/text/DateFormat;
    //   377: aload 11
    //   379: invokevirtual 110	java/lang/StringBuffer:toString	()Ljava/lang/String;
    //   382: invokevirtual 122	java/text/DateFormat:parse	(Ljava/lang/String;)Ljava/util/Date;
    //   385: astore 8
    //   387: aload 9
    //   389: monitorexit
    //   390: iload_3
    //   391: ifeq +173 -> 564
    //   394: invokestatic 52	java/util/Calendar:getInstance	()Ljava/util/Calendar;
    //   397: astore 9
    //   399: aload 9
    //   401: aload 8
    //   403: invokevirtual 126	java/util/Calendar:setTime	(Ljava/util/Date;)V
    //   406: aload 9
    //   408: aload 12
    //   410: invokevirtual 129	java/util/Calendar:after	(Ljava/lang/Object;)Z
    //   413: ifeq +151 -> 564
    //   416: aload 9
    //   418: invokevirtual 133	java/util/Calendar:getTimeInMillis	()J
    //   421: aload 12
    //   423: invokevirtual 133	java/util/Calendar:getTimeInMillis	()J
    //   426: lsub
    //   427: ldc2_w 134
    //   430: lcmp
    //   431: ifle +133 -> 564
    //   434: aload 9
    //   436: iconst_1
    //   437: iload 5
    //   439: iconst_1
    //   440: isub
    //   441: invokevirtual 139	java/util/Calendar:set	(II)V
    //   444: aload 9
    //   446: invokevirtual 143	java/util/Calendar:getTime	()Ljava/util/Date;
    //   449: astore 8
    //   451: aload 13
    //   453: iload_2
    //   454: aaload
    //   455: aload 8
    //   457: invokevirtual 145	it/a/a/n:a	(Ljava/util/Date;)V
    //   460: aload 13
    //   462: iload_2
    //   463: aaload
    //   464: aload 14
    //   466: invokevirtual 148	it/a/a/n:a	(Ljava/lang/String;)V
    //   469: iload_2
    //   470: iconst_1
    //   471: iadd
    //   472: istore_2
    //   473: goto -447 -> 26
    //   476: aload 8
    //   478: ldc -106
    //   480: invokevirtual 81	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   483: ifeq +14 -> 497
    //   486: aload 13
    //   488: iload_2
    //   489: aaload
    //   490: iconst_1
    //   491: invokevirtual 84	it/a/a/n:a	(I)V
    //   494: goto -347 -> 147
    //   497: new 152	it/a/a/q
    //   500: dup
    //   501: invokespecial 153	it/a/a/q:<init>	()V
    //   504: athrow
    //   505: astore_1
    //   506: new 152	it/a/a/q
    //   509: dup
    //   510: invokespecial 153	it/a/a/q:<init>	()V
    //   513: athrow
    //   514: aload 11
    //   516: aload 16
    //   518: invokevirtual 106	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   521: pop
    //   522: iconst_0
    //   523: istore_3
    //   524: goto -270 -> 254
    //   527: aload 11
    //   529: ldc -101
    //   531: invokevirtual 106	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   534: pop
    //   535: goto -169 -> 366
    //   538: astore_1
    //   539: aload 9
    //   541: monitorexit
    //   542: aload_1
    //   543: athrow
    //   544: astore_1
    //   545: new 152	it/a/a/q
    //   548: dup
    //   549: invokespecial 153	it/a/a/q:<init>	()V
    //   552: athrow
    //   553: new 152	it/a/a/q
    //   556: dup
    //   557: invokespecial 153	it/a/a/q:<init>	()V
    //   560: athrow
    //   561: aload 13
    //   563: areturn
    //   564: goto -113 -> 451
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	567	0	this	d
    //   0	567	1	paramArrayOfString	String[]
    //   25	464	2	i	int
    //   253	271	3	j	int
    //   2	28	4	k	int
    //   15	426	5	m	int
    //   152	7	6	l	long
    //   57	420	8	localObject1	Object
    //   107	226	10	str1	String
    //   81	447	11	localObject3	Object
    //   7	415	12	localCalendar	java.util.Calendar
    //   22	540	13	arrayOfn	it.a.a.n[]
    //   41	424	14	localObject4	Object
    //   73	137	15	str2	String
    //   89	428	16	str3	String
    //   65	83	17	str4	String
    // Exception table:
    //   from	to	target	type
    //   147	154	505	java/lang/Throwable
    //   374	390	538	finally
    //   539	542	538	finally
    //   366	374	544	java/text/ParseException
    //   542	544	544	java/text/ParseException
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/it/a/a/c/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */