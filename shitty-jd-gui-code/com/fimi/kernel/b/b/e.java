package com.fimi.kernel.b.b;

import android.os.Message;
import com.fimi.kernel.b;
import com.fimi.kernel.b.a;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public class e
  extends b
  implements a
{
  private volatile int a = 0;
  private Map<Integer, com.fimi.kernel.b.e> b = new HashMap();
  
  private int b()
  {
    try
    {
      this.a += 1;
      int i = this.a;
      return i;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  protected void a(Message paramMessage)
  {
    com.fimi.kernel.b.e locale = (com.fimi.kernel.b.e)this.b.get(Integer.valueOf(paramMessage.what));
    if (locale != null)
    {
      if (paramMessage.arg1 != 1) {
        break label54;
      }
      locale.a(paramMessage.obj);
    }
    for (;;)
    {
      this.b.remove(locale);
      return;
      label54:
      locale.b(paramMessage.obj);
    }
  }
  
  public void a(final String paramString, final com.fimi.kernel.b.e<String> parame)
  {
    a(new Runnable()
    {
      /* Error */
      public void run()
      {
        // Byte code:
        //   0: aconst_null
        //   1: astore_3
        //   2: aconst_null
        //   3: astore 5
        //   5: aload_0
        //   6: getfield 20	com/fimi/kernel/b/b/e$1:c	Lcom/fimi/kernel/b/b/e;
        //   9: invokestatic 36	com/fimi/kernel/b/b/e:a	(Lcom/fimi/kernel/b/b/e;)I
        //   12: istore_1
        //   13: aload_0
        //   14: getfield 20	com/fimi/kernel/b/b/e$1:c	Lcom/fimi/kernel/b/b/e;
        //   17: invokestatic 39	com/fimi/kernel/b/b/e:b	(Lcom/fimi/kernel/b/b/e;)Ljava/util/Map;
        //   20: iload_1
        //   21: invokestatic 45	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
        //   24: invokeinterface 51 2 0
        //   29: ifne -24 -> 5
        //   32: aload_0
        //   33: getfield 20	com/fimi/kernel/b/b/e$1:c	Lcom/fimi/kernel/b/b/e;
        //   36: invokestatic 39	com/fimi/kernel/b/b/e:b	(Lcom/fimi/kernel/b/b/e;)Ljava/util/Map;
        //   39: iload_1
        //   40: invokestatic 45	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
        //   43: aload_0
        //   44: getfield 22	com/fimi/kernel/b/b/e$1:a	Lcom/fimi/kernel/b/e;
        //   47: invokeinterface 55 3 0
        //   52: pop
        //   53: new 57	android/os/Message
        //   56: dup
        //   57: invokespecial 58	android/os/Message:<init>	()V
        //   60: astore 6
        //   62: aload 6
        //   64: iload_1
        //   65: putfield 62	android/os/Message:what	I
        //   68: new 64	java/net/URL
        //   71: dup
        //   72: aload_0
        //   73: getfield 24	com/fimi/kernel/b/b/e$1:b	Ljava/lang/String;
        //   76: invokespecial 67	java/net/URL:<init>	(Ljava/lang/String;)V
        //   79: invokevirtual 71	java/net/URL:openConnection	()Ljava/net/URLConnection;
        //   82: checkcast 73	java/net/HttpURLConnection
        //   85: astore_2
        //   86: new 75	java/io/InputStreamReader
        //   89: dup
        //   90: aload_2
        //   91: invokevirtual 79	java/net/HttpURLConnection:getInputStream	()Ljava/io/InputStream;
        //   94: invokespecial 82	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;)V
        //   97: astore 4
        //   99: new 84	java/io/BufferedReader
        //   102: dup
        //   103: aload 4
        //   105: invokespecial 87	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
        //   108: astore_3
        //   109: new 89	java/lang/StringBuffer
        //   112: dup
        //   113: invokespecial 90	java/lang/StringBuffer:<init>	()V
        //   116: astore 5
        //   118: aload_3
        //   119: invokevirtual 94	java/io/BufferedReader:readLine	()Ljava/lang/String;
        //   122: astore 7
        //   124: aload 7
        //   126: ifnull +74 -> 200
        //   129: aload 5
        //   131: aload 7
        //   133: invokevirtual 98	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
        //   136: pop
        //   137: goto -19 -> 118
        //   140: astore 5
        //   142: aload 4
        //   144: astore_3
        //   145: aload 5
        //   147: astore 4
        //   149: aload 6
        //   151: iconst_0
        //   152: putfield 101	android/os/Message:arg1	I
        //   155: aload 6
        //   157: aload 4
        //   159: invokevirtual 104	java/lang/Exception:toString	()Ljava/lang/String;
        //   162: putfield 108	android/os/Message:obj	Ljava/lang/Object;
        //   165: aload 4
        //   167: invokevirtual 111	java/lang/Exception:printStackTrace	()V
        //   170: aload_2
        //   171: ifnull +7 -> 178
        //   174: aload_2
        //   175: invokevirtual 114	java/net/HttpURLConnection:disconnect	()V
        //   178: aload_3
        //   179: ifnull +7 -> 186
        //   182: aload_3
        //   183: invokevirtual 117	java/io/InputStreamReader:close	()V
        //   186: aload_0
        //   187: getfield 20	com/fimi/kernel/b/b/e$1:c	Lcom/fimi/kernel/b/b/e;
        //   190: invokestatic 120	com/fimi/kernel/b/b/e:c	(Lcom/fimi/kernel/b/b/e;)Landroid/os/Handler;
        //   193: aload 6
        //   195: invokevirtual 126	android/os/Handler:sendMessage	(Landroid/os/Message;)Z
        //   198: pop
        //   199: return
        //   200: aload 6
        //   202: aload 5
        //   204: invokevirtual 127	java/lang/StringBuffer:toString	()Ljava/lang/String;
        //   207: putfield 108	android/os/Message:obj	Ljava/lang/Object;
        //   210: aload 6
        //   212: iconst_1
        //   213: putfield 101	android/os/Message:arg1	I
        //   216: aload_2
        //   217: ifnull +7 -> 224
        //   220: aload_2
        //   221: invokevirtual 114	java/net/HttpURLConnection:disconnect	()V
        //   224: aload 4
        //   226: ifnull -40 -> 186
        //   229: aload 4
        //   231: invokevirtual 117	java/io/InputStreamReader:close	()V
        //   234: goto -48 -> 186
        //   237: astore_2
        //   238: aload_2
        //   239: invokevirtual 128	java/io/IOException:printStackTrace	()V
        //   242: goto -56 -> 186
        //   245: astore_2
        //   246: aload_2
        //   247: invokevirtual 128	java/io/IOException:printStackTrace	()V
        //   250: goto -64 -> 186
        //   253: astore 5
        //   255: aconst_null
        //   256: astore 4
        //   258: aload_3
        //   259: astore_2
        //   260: aload 5
        //   262: astore_3
        //   263: aload_2
        //   264: ifnull +7 -> 271
        //   267: aload_2
        //   268: invokevirtual 114	java/net/HttpURLConnection:disconnect	()V
        //   271: aload 4
        //   273: ifnull +8 -> 281
        //   276: aload 4
        //   278: invokevirtual 117	java/io/InputStreamReader:close	()V
        //   281: aload_3
        //   282: athrow
        //   283: astore_2
        //   284: aload_2
        //   285: invokevirtual 128	java/io/IOException:printStackTrace	()V
        //   288: goto -7 -> 281
        //   291: astore_3
        //   292: aconst_null
        //   293: astore 4
        //   295: goto -32 -> 263
        //   298: astore_3
        //   299: goto -36 -> 263
        //   302: astore 5
        //   304: aload_3
        //   305: astore 4
        //   307: aload 5
        //   309: astore_3
        //   310: goto -47 -> 263
        //   313: astore 4
        //   315: aconst_null
        //   316: astore_3
        //   317: aload 5
        //   319: astore_2
        //   320: goto -171 -> 149
        //   323: astore 4
        //   325: aconst_null
        //   326: astore_3
        //   327: goto -178 -> 149
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	330	0	this	1
        //   12	53	1	i	int
        //   85	136	2	localHttpURLConnection	java.net.HttpURLConnection
        //   237	2	2	localIOException1	java.io.IOException
        //   245	2	2	localIOException2	java.io.IOException
        //   259	9	2	localObject1	Object
        //   283	2	2	localIOException3	java.io.IOException
        //   319	1	2	localObject2	Object
        //   1	281	3	localObject3	Object
        //   291	1	3	localObject4	Object
        //   298	7	3	localObject5	Object
        //   309	18	3	localObject6	Object
        //   97	209	4	localObject7	Object
        //   313	1	4	localException1	Exception
        //   323	1	4	localException2	Exception
        //   3	127	5	localStringBuffer	StringBuffer
        //   140	63	5	localException3	Exception
        //   253	8	5	localObject8	Object
        //   302	16	5	localObject9	Object
        //   60	151	6	localMessage	Message
        //   122	10	7	str	String
        // Exception table:
        //   from	to	target	type
        //   99	118	140	java/lang/Exception
        //   118	124	140	java/lang/Exception
        //   129	137	140	java/lang/Exception
        //   200	216	140	java/lang/Exception
        //   229	234	237	java/io/IOException
        //   182	186	245	java/io/IOException
        //   68	86	253	finally
        //   276	281	283	java/io/IOException
        //   86	99	291	finally
        //   99	118	298	finally
        //   118	124	298	finally
        //   129	137	298	finally
        //   200	216	298	finally
        //   149	170	302	finally
        //   68	86	313	java/lang/Exception
        //   86	99	323	java/lang/Exception
      }
    });
  }
  
  public <T> void a(String paramString, com.fimi.kernel.b.e<T> parame, Class<?> paramClass) {}
  
  public void a(String paramString, Map<String, String> paramMap, com.fimi.kernel.b.e<String> parame) {}
  
  public <T> void a(String paramString, Map<String, String> paramMap, com.fimi.kernel.b.e<T> parame, Class<?> paramClass) {}
  
  public void a(String paramString, JSONObject paramJSONObject, com.fimi.kernel.b.e<JSONObject> parame) {}
  
  public void b(String paramString, com.fimi.kernel.b.e<String> parame) {}
  
  public <T> void b(String paramString, com.fimi.kernel.b.e<T> parame, Class<?> paramClass) {}
  
  public void b(String paramString, JSONObject paramJSONObject, com.fimi.kernel.b.e<JSONObject> parame) {}
  
  public void c(String paramString, com.fimi.kernel.b.e<JSONObject> parame) {}
  
  public void d(String paramString, com.fimi.kernel.b.e<JSONObject> parame) {}
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/kernel/b/b/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */