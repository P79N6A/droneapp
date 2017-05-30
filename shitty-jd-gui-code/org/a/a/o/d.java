package org.a.a.o;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import org.apache.http.Header;
import org.apache.http.HeaderElement;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.util.ByteArrayBuffer;

public final class d
{
  public static String a(HttpEntity paramHttpEntity, String paramString)
  {
    if (paramString != null) {}
    for (paramString = Charset.forName(paramString);; paramString = null) {
      return a(paramHttpEntity, paramString);
    }
  }
  
  /* Error */
  public static String a(HttpEntity paramHttpEntity, Charset paramCharset)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 7
    //   3: iconst_0
    //   4: istore 4
    //   6: aload_0
    //   7: ldc 24
    //   9: invokestatic 29	org/a/a/o/a:a	(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
    //   12: pop
    //   13: aload_0
    //   14: invokeinterface 35 1 0
    //   19: astore 8
    //   21: aload 8
    //   23: ifnonnull +5 -> 28
    //   26: aconst_null
    //   27: areturn
    //   28: aload_0
    //   29: invokeinterface 39 1 0
    //   34: ldc2_w 40
    //   37: lcmp
    //   38: ifgt +6 -> 44
    //   41: iconst_1
    //   42: istore 4
    //   44: iload 4
    //   46: ldc 43
    //   48: invokestatic 46	org/a/a/o/a:a	(ZLjava/lang/String;)V
    //   51: aload_0
    //   52: invokeinterface 39 1 0
    //   57: lstore 5
    //   59: lload 5
    //   61: l2i
    //   62: istore_3
    //   63: iload_3
    //   64: istore_2
    //   65: iload_3
    //   66: ifge +7 -> 73
    //   69: sipush 4096
    //   72: istore_2
    //   73: aload_0
    //   74: invokestatic 51	org/a/a/h/e:a	(Lorg/apache/http/HttpEntity;)Lorg/a/a/h/e;
    //   77: astore 9
    //   79: aload 7
    //   81: astore_0
    //   82: aload 9
    //   84: ifnull +9 -> 93
    //   87: aload 9
    //   89: invokevirtual 55	org/a/a/h/e:b	()Ljava/nio/charset/Charset;
    //   92: astore_0
    //   93: aload_0
    //   94: astore 7
    //   96: aload_0
    //   97: ifnonnull +6 -> 103
    //   100: aload_1
    //   101: astore 7
    //   103: aload 7
    //   105: astore_0
    //   106: aload 7
    //   108: ifnonnull +9 -> 117
    //   111: ldc 57
    //   113: invokestatic 17	java/nio/charset/Charset:forName	(Ljava/lang/String;)Ljava/nio/charset/Charset;
    //   116: astore_0
    //   117: new 59	java/io/InputStreamReader
    //   120: dup
    //   121: aload 8
    //   123: aload_0
    //   124: invokespecial 62	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;Ljava/nio/charset/Charset;)V
    //   127: astore_0
    //   128: new 64	org/apache/http/util/CharArrayBuffer
    //   131: dup
    //   132: iload_2
    //   133: invokespecial 67	org/apache/http/util/CharArrayBuffer:<init>	(I)V
    //   136: astore_1
    //   137: sipush 1024
    //   140: newarray <illegal type>
    //   142: astore 7
    //   144: aload_0
    //   145: aload 7
    //   147: invokevirtual 73	java/io/Reader:read	([C)I
    //   150: istore_2
    //   151: iload_2
    //   152: iconst_m1
    //   153: if_icmpeq +35 -> 188
    //   156: aload_1
    //   157: aload 7
    //   159: iconst_0
    //   160: iload_2
    //   161: invokevirtual 77	org/apache/http/util/CharArrayBuffer:append	([CII)V
    //   164: goto -20 -> 144
    //   167: astore_0
    //   168: aload 8
    //   170: invokevirtual 82	java/io/InputStream:close	()V
    //   173: aload_0
    //   174: athrow
    //   175: astore_0
    //   176: new 84	java/io/UnsupportedEncodingException
    //   179: dup
    //   180: aload_0
    //   181: invokevirtual 88	java/nio/charset/UnsupportedCharsetException:getMessage	()Ljava/lang/String;
    //   184: invokespecial 91	java/io/UnsupportedEncodingException:<init>	(Ljava/lang/String;)V
    //   187: athrow
    //   188: aload_1
    //   189: invokevirtual 94	org/apache/http/util/CharArrayBuffer:toString	()Ljava/lang/String;
    //   192: astore_0
    //   193: aload 8
    //   195: invokevirtual 82	java/io/InputStream:close	()V
    //   198: aload_0
    //   199: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	200	0	paramHttpEntity	HttpEntity
    //   0	200	1	paramCharset	Charset
    //   64	97	2	i	int
    //   62	4	3	j	int
    //   4	41	4	bool	boolean
    //   57	3	5	l	long
    //   1	157	7	localObject	Object
    //   19	175	8	localInputStream	InputStream
    //   77	11	9	locale	org.a.a.h.e
    // Exception table:
    //   from	to	target	type
    //   28	41	167	finally
    //   44	59	167	finally
    //   73	79	167	finally
    //   87	93	167	finally
    //   111	117	167	finally
    //   117	144	167	finally
    //   144	151	167	finally
    //   156	164	167	finally
    //   176	188	167	finally
    //   188	193	167	finally
    //   73	79	175	java/nio/charset/UnsupportedCharsetException
    //   87	93	175	java/nio/charset/UnsupportedCharsetException
  }
  
  public static void a(HttpEntity paramHttpEntity)
  {
    try
    {
      b(paramHttpEntity);
      return;
    }
    catch (IOException paramHttpEntity) {}
  }
  
  public static void a(HttpResponse paramHttpResponse, HttpEntity paramHttpEntity)
  {
    a.a(paramHttpResponse, "Response");
    b(paramHttpResponse.getEntity());
    paramHttpResponse.setEntity(paramHttpEntity);
  }
  
  public static void b(HttpEntity paramHttpEntity)
  {
    if (paramHttpEntity == null) {}
    do
    {
      do
      {
        return;
      } while (!paramHttpEntity.isStreaming());
      paramHttpEntity = paramHttpEntity.getContent();
    } while (paramHttpEntity == null);
    paramHttpEntity.close();
  }
  
  public static byte[] c(HttpEntity paramHttpEntity)
  {
    int i = 4096;
    boolean bool = false;
    a.a(paramHttpEntity, "Entity");
    InputStream localInputStream = paramHttpEntity.getContent();
    if (localInputStream == null) {
      return null;
    }
    for (;;)
    {
      int j;
      try
      {
        if (paramHttpEntity.getContentLength() <= 2147483647L) {
          bool = true;
        }
        a.a(bool, "HTTP entity too large to be buffered in memory");
        j = (int)paramHttpEntity.getContentLength();
        if (j >= 0) {
          break label121;
        }
        paramHttpEntity = new ByteArrayBuffer(i);
        byte[] arrayOfByte = new byte['က'];
        i = localInputStream.read(arrayOfByte);
        if (i != -1)
        {
          paramHttpEntity.append(arrayOfByte, 0, i);
          continue;
        }
        paramHttpEntity = paramHttpEntity.toByteArray();
      }
      finally
      {
        localInputStream.close();
      }
      localInputStream.close();
      return paramHttpEntity;
      label121:
      i = j;
    }
  }
  
  @Deprecated
  public static String d(HttpEntity paramHttpEntity)
  {
    a.a(paramHttpEntity, "Entity");
    Object localObject2 = null;
    Object localObject1 = localObject2;
    if (paramHttpEntity.getContentType() != null)
    {
      paramHttpEntity = paramHttpEntity.getContentType().getElements();
      localObject1 = localObject2;
      if (paramHttpEntity.length > 0)
      {
        paramHttpEntity = paramHttpEntity[0].getParameterByName("charset");
        localObject1 = localObject2;
        if (paramHttpEntity != null) {
          localObject1 = paramHttpEntity.getValue();
        }
      }
    }
    return (String)localObject1;
  }
  
  @Deprecated
  public static String e(HttpEntity paramHttpEntity)
  {
    a.a(paramHttpEntity, "Entity");
    Object localObject2 = null;
    Object localObject1 = localObject2;
    if (paramHttpEntity.getContentType() != null)
    {
      paramHttpEntity = paramHttpEntity.getContentType().getElements();
      localObject1 = localObject2;
      if (paramHttpEntity.length > 0) {
        localObject1 = paramHttpEntity[0].getName();
      }
    }
    return (String)localObject1;
  }
  
  public static String f(HttpEntity paramHttpEntity)
  {
    return a(paramHttpEntity, (Charset)null);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/org/a/a/o/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */