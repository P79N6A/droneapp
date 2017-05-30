package com.fimi.kernel.utils;

import java.io.PrintStream;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class f
{
  public static final String a = "yyyy-MM-dd HH:mm:ss";
  public static final String b = "yyyy-MM-dd";
  public static final String c = "yyyy-MM";
  public static final String d = "yyyy-MM-dd HH:mm";
  public static final String e = "yyyyMMddHHmmss";
  public static final String f = "MM/dd";
  public static final String g = "HH:mm:ss";
  public static final String h = "HH:mm";
  public static final String i = "AM";
  public static final String j = "PM";
  
  public static int a(long paramLong1, long paramLong2)
  {
    Calendar localCalendar1 = Calendar.getInstance();
    localCalendar1.setTimeInMillis(paramLong1);
    Calendar localCalendar2 = Calendar.getInstance();
    localCalendar2.setTimeInMillis(paramLong2);
    int k = localCalendar1.get(1);
    int m = localCalendar2.get(1);
    int n = localCalendar1.get(6);
    int i1 = localCalendar2.get(6);
    if (k - m > 0) {
      return localCalendar2.getActualMaximum(6) + (n - i1);
    }
    if (k - m < 0) {
      return n - i1 - localCalendar1.getActualMaximum(6);
    }
    return n - i1;
  }
  
  public static long a()
  {
    try
    {
      String str = a("yyyy-MM-dd");
      long l = a(str + " 00:00:00", "yyyy-MM-dd HH:mm:ss").getTime();
      return l;
    }
    catch (Exception localException) {}
    return -1L;
  }
  
  public static String a(long paramLong)
  {
    if (paramLong > 1000L)
    {
      if (paramLong / 1000L / 60L > 1L)
      {
        long l = paramLong / 1000L / 60L;
        paramLong /= 1000L;
        return l + "分" + paramLong % 60L + "秒";
      }
      return paramLong / 1000L + "秒";
    }
    return paramLong + "毫秒";
  }
  
  public static String a(long paramLong, String paramString)
  {
    try
    {
      paramString = new SimpleDateFormat(paramString).format(Long.valueOf(paramLong));
      return paramString;
    }
    catch (Exception paramString)
    {
      paramString.printStackTrace();
    }
    return null;
  }
  
  public static String a(String paramString)
  {
    k.a(f.class, "getCurrentDate:" + paramString);
    try
    {
      paramString = new SimpleDateFormat(paramString).format(new GregorianCalendar().getTime());
      return paramString;
    }
    catch (Exception paramString)
    {
      paramString.printStackTrace();
    }
    return null;
  }
  
  private static String a(String paramString, int paramInt)
  {
    try
    {
      GregorianCalendar localGregorianCalendar = new GregorianCalendar();
      paramString = new SimpleDateFormat(paramString);
      int k = localGregorianCalendar.get(7);
      if (k == paramInt) {
        return paramString.format(localGregorianCalendar.getTime());
      }
      int m = paramInt - k;
      k = m;
      if (paramInt == 1) {
        k = 7 - Math.abs(m);
      }
      localGregorianCalendar.add(5, k);
      paramString = paramString.format(localGregorianCalendar.getTime());
      return paramString;
    }
    catch (Exception paramString)
    {
      paramString.printStackTrace();
    }
    return null;
  }
  
  public static String a(String paramString, int paramInt1, int paramInt2)
  {
    try
    {
      paramString = new SimpleDateFormat(paramString);
      GregorianCalendar localGregorianCalendar = new GregorianCalendar();
      localGregorianCalendar.add(paramInt1, paramInt2);
      paramString = paramString.format(localGregorianCalendar.getTime());
      return paramString;
    }
    catch (Exception paramString)
    {
      paramString.printStackTrace();
    }
    return null;
  }
  
  public static String a(String paramString1, String paramString2, int paramInt1, int paramInt2)
  {
    try
    {
      GregorianCalendar localGregorianCalendar = new GregorianCalendar();
      paramString2 = new SimpleDateFormat(paramString2);
      localGregorianCalendar.setTime(paramString2.parse(paramString1));
      localGregorianCalendar.add(paramInt1, paramInt2);
      paramString1 = paramString2.format(localGregorianCalendar.getTime());
      return paramString1;
    }
    catch (ParseException paramString1)
    {
      paramString1.printStackTrace();
    }
    return null;
  }
  
  public static String a(Date paramDate, String paramString)
  {
    paramString = new SimpleDateFormat(paramString);
    try
    {
      paramDate = paramString.format(paramDate);
      return paramDate;
    }
    catch (Exception paramDate)
    {
      paramDate.printStackTrace();
    }
    return null;
  }
  
  public static String a(Date paramDate, String paramString, int paramInt1, int paramInt2)
  {
    try
    {
      GregorianCalendar localGregorianCalendar = new GregorianCalendar();
      paramString = new SimpleDateFormat(paramString);
      localGregorianCalendar.setTime(paramDate);
      localGregorianCalendar.add(paramInt1, paramInt2);
      paramDate = paramString.format(localGregorianCalendar.getTime());
      return paramDate;
    }
    catch (Exception paramDate)
    {
      paramDate.printStackTrace();
    }
    return null;
  }
  
  public static Date a(String paramString1, String paramString2)
  {
    paramString2 = new SimpleDateFormat(paramString2);
    try
    {
      paramString1 = paramString2.parse(paramString1);
      return paramString1;
    }
    catch (ParseException paramString1)
    {
      paramString1.printStackTrace();
    }
    return null;
  }
  
  public static void a(String[] paramArrayOfString)
  {
    System.out.println(c("2012-3-2 12:2:20", "MM月dd日  HH:mm"));
  }
  
  public static boolean a(int paramInt)
  {
    return ((paramInt % 4 == 0) && (paramInt % 400 != 0)) || (paramInt % 400 == 0);
  }
  
  public static int b(long paramLong1, long paramLong2)
  {
    Calendar localCalendar1 = Calendar.getInstance();
    localCalendar1.setTimeInMillis(paramLong1);
    Calendar localCalendar2 = Calendar.getInstance();
    localCalendar2.setTimeInMillis(paramLong2);
    return localCalendar1.get(11) - localCalendar2.get(11) + a(paramLong1, paramLong2) * 24;
  }
  
  public static long b()
  {
    try
    {
      String str = a("yyyy-MM-dd");
      long l = a(str + " 24:00:00", "yyyy-MM-dd HH:mm:ss").getTime();
      return l;
    }
    catch (Exception localException) {}
    return -1L;
  }
  
  public static String b(String paramString)
  {
    return a(paramString, 2);
  }
  
  public static String b(String paramString1, String paramString2)
  {
    try
    {
      GregorianCalendar localGregorianCalendar = new GregorianCalendar();
      localGregorianCalendar.setTime(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(paramString1));
      paramString1 = new SimpleDateFormat(paramString2).format(localGregorianCalendar.getTime());
      return paramString1;
    }
    catch (Exception paramString1)
    {
      paramString1.printStackTrace();
    }
    return null;
  }
  
  public static int c(long paramLong1, long paramLong2)
  {
    Calendar localCalendar1 = Calendar.getInstance();
    localCalendar1.setTimeInMillis(paramLong1);
    Calendar localCalendar2 = Calendar.getInstance();
    localCalendar2.setTimeInMillis(paramLong2);
    return localCalendar1.get(12) - localCalendar2.get(12) + b(paramLong1, paramLong2) * 60;
  }
  
  public static String c(String paramString)
  {
    return a(paramString, 1);
  }
  
  /* Error */
  public static String c(String paramString1, String paramString2)
  {
    // Byte code:
    //   0: new 104	java/text/SimpleDateFormat
    //   3: dup
    //   4: ldc 8
    //   6: invokespecial 107	java/text/SimpleDateFormat:<init>	(Ljava/lang/String;)V
    //   9: astore_3
    //   10: invokestatic 47	java/util/Calendar:getInstance	()Ljava/util/Calendar;
    //   13: astore 4
    //   15: invokestatic 47	java/util/Calendar:getInstance	()Ljava/util/Calendar;
    //   18: astore 5
    //   20: aload 5
    //   22: aload_3
    //   23: aload_0
    //   24: invokevirtual 192	java/text/DateFormat:parse	(Ljava/lang/String;)Ljava/util/Date;
    //   27: invokevirtual 158	java/util/Calendar:setTime	(Ljava/util/Date;)V
    //   30: aload 4
    //   32: new 82	java/util/Date
    //   35: dup
    //   36: invokespecial 193	java/util/Date:<init>	()V
    //   39: invokevirtual 158	java/util/Calendar:setTime	(Ljava/util/Date;)V
    //   42: aload 4
    //   44: invokevirtual 196	java/util/Calendar:getTimeInMillis	()J
    //   47: aload 5
    //   49: invokevirtual 196	java/util/Calendar:getTimeInMillis	()J
    //   52: invokestatic 183	com/fimi/kernel/utils/f:a	(JJ)I
    //   55: istore_2
    //   56: iload_2
    //   57: ifne +110 -> 167
    //   60: aload 4
    //   62: invokevirtual 196	java/util/Calendar:getTimeInMillis	()J
    //   65: aload 5
    //   67: invokevirtual 196	java/util/Calendar:getTimeInMillis	()J
    //   70: invokestatic 189	com/fimi/kernel/utils/f:b	(JJ)I
    //   73: istore_2
    //   74: iload_2
    //   75: ifle +130 -> 205
    //   78: new 66	java/lang/StringBuilder
    //   81: dup
    //   82: invokespecial 67	java/lang/StringBuilder:<init>	()V
    //   85: ldc -58
    //   87: invokevirtual 71	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   90: aload_0
    //   91: ldc 29
    //   93: invokestatic 200	com/fimi/kernel/utils/f:b	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   96: invokevirtual 71	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   99: invokevirtual 77	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   102: areturn
    //   103: aload_0
    //   104: aload_1
    //   105: invokestatic 200	com/fimi/kernel/utils/f:b	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   108: astore_1
    //   109: aload_1
    //   110: invokestatic 205	com/fimi/kernel/utils/n:b	(Ljava/lang/String;)Z
    //   113: ifne +90 -> 203
    //   116: aload_1
    //   117: areturn
    //   118: iload_2
    //   119: ifne -16 -> 103
    //   122: aload 4
    //   124: invokevirtual 196	java/util/Calendar:getTimeInMillis	()J
    //   127: aload 5
    //   129: invokevirtual 196	java/util/Calendar:getTimeInMillis	()J
    //   132: invokestatic 207	com/fimi/kernel/utils/f:c	(JJ)I
    //   135: istore_2
    //   136: iload_2
    //   137: ifle +23 -> 160
    //   140: new 66	java/lang/StringBuilder
    //   143: dup
    //   144: invokespecial 67	java/lang/StringBuilder:<init>	()V
    //   147: iload_2
    //   148: invokevirtual 210	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   151: ldc -44
    //   153: invokevirtual 71	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   156: invokevirtual 77	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   159: areturn
    //   160: iload_2
    //   161: iflt -58 -> 103
    //   164: ldc -42
    //   166: areturn
    //   167: iload_2
    //   168: ifle +16 -> 184
    //   171: iload_2
    //   172: iconst_1
    //   173: if_icmpeq -70 -> 103
    //   176: iload_2
    //   177: iconst_2
    //   178: if_icmpne -75 -> 103
    //   181: goto -78 -> 103
    //   184: iload_2
    //   185: ifge -82 -> 103
    //   188: iload_2
    //   189: iconst_m1
    //   190: if_icmpeq -87 -> 103
    //   193: iload_2
    //   194: bipush -2
    //   196: if_icmpne -93 -> 103
    //   199: goto -96 -> 103
    //   202: astore_1
    //   203: aload_0
    //   204: areturn
    //   205: iload_2
    //   206: ifge -88 -> 118
    //   209: goto -106 -> 103
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	212	0	paramString1	String
    //   0	212	1	paramString2	String
    //   55	151	2	k	int
    //   9	14	3	localSimpleDateFormat	SimpleDateFormat
    //   13	110	4	localCalendar1	Calendar
    //   18	110	5	localCalendar2	Calendar
    // Exception table:
    //   from	to	target	type
    //   20	56	202	java/lang/Exception
    //   60	74	202	java/lang/Exception
    //   78	103	202	java/lang/Exception
    //   103	116	202	java/lang/Exception
    //   122	136	202	java/lang/Exception
    //   140	160	202	java/lang/Exception
  }
  
  public static String d(String paramString)
  {
    try
    {
      GregorianCalendar localGregorianCalendar = new GregorianCalendar();
      paramString = new SimpleDateFormat(paramString);
      localGregorianCalendar.set(5, 1);
      paramString = paramString.format(localGregorianCalendar.getTime());
      return paramString;
    }
    catch (Exception paramString)
    {
      paramString.printStackTrace();
    }
    return null;
  }
  
  public static String d(String paramString1, String paramString2)
  {
    GregorianCalendar localGregorianCalendar = new GregorianCalendar();
    paramString2 = new SimpleDateFormat(paramString2);
    try
    {
      localGregorianCalendar.setTime(paramString2.parse(paramString1));
      switch (localGregorianCalendar.get(7) - 1)
      {
      default: 
        return "星期日";
      }
    }
    catch (Exception paramString1)
    {
      return "错误";
    }
    return "星期日";
    return "星期一";
    return "星期二";
    return "星期三";
    return "星期四";
    return "星期五";
    return "星期六";
  }
  
  public static String e(String paramString)
  {
    try
    {
      GregorianCalendar localGregorianCalendar = new GregorianCalendar();
      paramString = new SimpleDateFormat(paramString);
      localGregorianCalendar.set(5, 1);
      localGregorianCalendar.roll(5, -1);
      paramString = paramString.format(localGregorianCalendar.getTime());
      return paramString;
    }
    catch (Exception paramString)
    {
      paramString.printStackTrace();
    }
    return null;
  }
  
  public static String e(String paramString1, String paramString2)
  {
    if (a(paramString1, paramString2).getHours() >= 12) {
      return "PM";
    }
    return "AM";
  }
  
  public Date a(Date paramDate, int paramInt1, int paramInt2)
  {
    GregorianCalendar localGregorianCalendar = new GregorianCalendar();
    try
    {
      localGregorianCalendar.setTime(paramDate);
      localGregorianCalendar.add(paramInt1, paramInt2);
      return localGregorianCalendar.getTime();
    }
    catch (Exception paramDate)
    {
      for (;;)
      {
        paramDate.printStackTrace();
      }
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/kernel/utils/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */