package com.fimi.kernel.utils;

import java.io.PrintStream;
import java.util.concurrent.Callable;

public class y
{
  /* Error */
  public static Boolean a(Callable<Boolean> paramCallable, int paramInt)
  {
    // Byte code:
    //   0: invokestatic 25	java/util/concurrent/Executors:newSingleThreadExecutor	()Ljava/util/concurrent/ExecutorService;
    //   3: astore 6
    //   5: iconst_0
    //   6: invokestatic 31	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   9: astore 4
    //   11: aload 6
    //   13: aload_0
    //   14: invokeinterface 37 2 0
    //   19: astore 7
    //   21: iload_1
    //   22: sipush 1000
    //   25: imul
    //   26: i2l
    //   27: lstore_2
    //   28: aload 7
    //   30: lload_2
    //   31: getstatic 43	java/util/concurrent/TimeUnit:MILLISECONDS	Ljava/util/concurrent/TimeUnit;
    //   34: invokeinterface 49 4 0
    //   39: checkcast 27	java/lang/Boolean
    //   42: astore 5
    //   44: aload 5
    //   46: astore_0
    //   47: getstatic 55	java/lang/System:out	Ljava/io/PrintStream;
    //   50: aload 5
    //   52: invokevirtual 61	java/io/PrintStream:println	(Ljava/lang/Object;)V
    //   55: aload 6
    //   57: invokeinterface 64 1 0
    //   62: aload 5
    //   64: areturn
    //   65: astore_0
    //   66: aload 4
    //   68: astore 5
    //   70: aload 5
    //   72: astore_0
    //   73: aload 7
    //   75: iconst_1
    //   76: invokeinterface 68 2 0
    //   81: pop
    //   82: aload 6
    //   84: invokeinterface 64 1 0
    //   89: aload 5
    //   91: areturn
    //   92: astore_0
    //   93: aload 4
    //   95: astore 5
    //   97: aload 5
    //   99: astore_0
    //   100: aload 7
    //   102: iconst_1
    //   103: invokeinterface 68 2 0
    //   108: pop
    //   109: aload 6
    //   111: invokeinterface 64 1 0
    //   116: aload 5
    //   118: areturn
    //   119: astore_0
    //   120: aload 4
    //   122: astore 5
    //   124: aload 5
    //   126: astore_0
    //   127: aload 7
    //   129: iconst_1
    //   130: invokeinterface 68 2 0
    //   135: pop
    //   136: aload 6
    //   138: invokeinterface 64 1 0
    //   143: aload 5
    //   145: areturn
    //   146: astore_0
    //   147: aload 4
    //   149: astore_0
    //   150: aload 6
    //   152: invokeinterface 64 1 0
    //   157: aload_0
    //   158: areturn
    //   159: astore 4
    //   161: goto -11 -> 150
    //   164: astore_0
    //   165: goto -41 -> 124
    //   168: astore_0
    //   169: goto -72 -> 97
    //   172: astore_0
    //   173: goto -103 -> 70
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	176	0	paramCallable	Callable<Boolean>
    //   0	176	1	paramInt	int
    //   27	4	2	l	long
    //   9	139	4	localBoolean1	Boolean
    //   159	1	4	localObject	Object
    //   42	102	5	localBoolean2	Boolean
    //   3	148	6	localExecutorService	java.util.concurrent.ExecutorService
    //   19	109	7	localFuture	java.util.concurrent.Future
    // Exception table:
    //   from	to	target	type
    //   28	44	65	java/lang/InterruptedException
    //   28	44	92	java/util/concurrent/ExecutionException
    //   28	44	119	java/util/concurrent/TimeoutException
    //   28	44	146	finally
    //   47	55	159	finally
    //   73	82	159	finally
    //   100	109	159	finally
    //   127	136	159	finally
    //   47	55	164	java/util/concurrent/TimeoutException
    //   47	55	168	java/util/concurrent/ExecutionException
    //   47	55	172	java/lang/InterruptedException
  }
  
  public static void a(String[] paramArrayOfString)
  {
    a(new a("传递的参数"), 2);
  }
  
  static class a
    implements Callable<Boolean>
  {
    private String a;
    
    public a(String paramString)
    {
      this.a = paramString;
    }
    
    public Boolean a()
    {
      int i = 0;
      while (i < 999999999)
      {
        if (i == 999999997) {
          System.out.println(this.a);
        }
        if (Thread.interrupted()) {
          return Boolean.valueOf(false);
        }
        i += 1;
      }
      System.out.println("继续执行..........");
      return Boolean.valueOf(true);
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/kernel/utils/y.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */