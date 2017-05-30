package it.a.a.b;

public class a
  extends b
{
  private static final Object a = new Object();
  private static a b = null;
  
  /* Error */
  private a()
  {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial 25	it/a/a/b/b:<init>	()V
    //   4: aconst_null
    //   5: astore_2
    //   6: new 27	java/io/BufferedReader
    //   9: dup
    //   10: new 29	java/io/InputStreamReader
    //   13: dup
    //   14: aload_0
    //   15: invokevirtual 33	java/lang/Object:getClass	()Ljava/lang/Class;
    //   18: ldc 35
    //   20: invokevirtual 41	java/lang/Class:getResourceAsStream	(Ljava/lang/String;)Ljava/io/InputStream;
    //   23: invokespecial 44	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;)V
    //   26: invokespecial 47	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   29: astore_1
    //   30: aload_1
    //   31: invokevirtual 51	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   34: astore_2
    //   35: aload_2
    //   36: ifnull +57 -> 93
    //   39: new 53	java/util/StringTokenizer
    //   42: dup
    //   43: aload_2
    //   44: invokespecial 56	java/util/StringTokenizer:<init>	(Ljava/lang/String;)V
    //   47: astore_2
    //   48: aload_2
    //   49: invokevirtual 60	java/util/StringTokenizer:hasMoreTokens	()Z
    //   52: ifeq -22 -> 30
    //   55: aload_0
    //   56: aload_2
    //   57: invokevirtual 63	java/util/StringTokenizer:nextToken	()Ljava/lang/String;
    //   60: invokevirtual 65	it/a/a/b/a:b	(Ljava/lang/String;)V
    //   63: goto -15 -> 48
    //   66: astore_2
    //   67: aload_1
    //   68: ifnull +7 -> 75
    //   71: aload_1
    //   72: invokevirtual 68	java/io/BufferedReader:close	()V
    //   75: return
    //   76: astore_1
    //   77: aload_2
    //   78: ifnull +7 -> 85
    //   81: aload_2
    //   82: invokevirtual 68	java/io/BufferedReader:close	()V
    //   85: aload_1
    //   86: athrow
    //   87: astore_1
    //   88: return
    //   89: astore_2
    //   90: goto -5 -> 85
    //   93: aload_1
    //   94: ifnull -19 -> 75
    //   97: aload_1
    //   98: invokevirtual 68	java/io/BufferedReader:close	()V
    //   101: return
    //   102: astore_3
    //   103: aload_1
    //   104: astore_2
    //   105: aload_3
    //   106: astore_1
    //   107: goto -30 -> 77
    //   110: astore_1
    //   111: aconst_null
    //   112: astore_1
    //   113: goto -46 -> 67
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	116	0	this	a
    //   29	43	1	localBufferedReader	java.io.BufferedReader
    //   76	10	1	localObject1	Object
    //   87	17	1	localThrowable1	Throwable
    //   106	1	1	localObject2	Object
    //   110	1	1	localException1	Exception
    //   112	1	1	localObject3	Object
    //   5	52	2	localObject4	Object
    //   66	16	2	localException2	Exception
    //   89	1	2	localThrowable2	Throwable
    //   104	1	2	localObject5	Object
    //   102	4	3	localObject6	Object
    // Exception table:
    //   from	to	target	type
    //   30	35	66	java/lang/Exception
    //   39	48	66	java/lang/Exception
    //   48	63	66	java/lang/Exception
    //   6	30	76	finally
    //   71	75	87	java/lang/Throwable
    //   97	101	87	java/lang/Throwable
    //   81	85	89	java/lang/Throwable
    //   30	35	102	finally
    //   39	48	102	finally
    //   48	63	102	finally
    //   6	30	110	java/lang/Exception
  }
  
  public static a a()
  {
    synchronized (a)
    {
      if (b == null) {
        b = new a();
      }
      return b;
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/it/a/a/b/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */